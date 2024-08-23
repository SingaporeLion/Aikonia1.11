package com.aikonia.app.data.repository

import com.google.gson.Gson
import com.google.gson.JsonObject
import com.aikonia.app.common.Constants
import com.aikonia.app.data.model.TextCompletionsParam
import com.aikonia.app.data.model.toJson
import com.aikonia.app.data.source.remote.ConversAIService
import com.aikonia.app.domain.repository.ChatRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.isActive
import kotlinx.coroutines.withContext
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import javax.inject.Inject


class ChatRepositoryImpl @Inject constructor(private val conversAIService: ConversAIService) :
    ChatRepository {

    override fun textCompletionsWithStream(
        scope: CoroutineScope,
        params: TextCompletionsParam
    ): Flow<String> = callbackFlow {
        withContext(Dispatchers.IO) {
            try {
                val response = if (params.isTurbo) {
                    conversAIService.textCompletionsTurboWithStream(params.toJson())
                } else {
                    conversAIService.textCompletionsWithStream(params.toJson())
                }

                if (response.isSuccessful) {
                    response.body()?.byteStream()?.bufferedReader()?.use { input ->
                        input?.forEachLine { line ->
                            if (!scope.isActive) return@forEachLine
                            if (line == "data: [DONE]") return@forEachLine

                            val value = if (params.isTurbo) lookupDataFromResponseTurbo(line) else lookupDataFromResponse(line)
                            if (value.isNotEmpty()) {
                                trySend(value)
                            }
                        }
                    } ?: close(NullPointerException("Response body is null"))
                } else {
                    val errorBody = response.errorBody()?.string() ?: "Unknown error"
                    close(IOException("Network call failed: $errorBody"))
                }
            } catch (e: Exception) {
                close(e)
            }
        }
        close()
    }.flowOn(Dispatchers.IO)



    private fun lookupDataFromResponse(jsonString: String): String {
        val splitsJsonString = jsonString.split("[{")

        val indexOfResult: Int = splitsJsonString.indexOfLast {
            it.contains(Constants.MATCH_RESULT_STRING)
        }

        val textSplits =
            if (indexOfResult == -1) listOf() else splitsJsonString[indexOfResult].split(",")

        val indexOfText: Int = textSplits.indexOfLast {
            it.contains(Constants.MATCH_RESULT_STRING)
        }

        if (indexOfText != -1) {
            try {
                val gson = Gson()
                val jsonObject =
                    gson.fromJson("{${textSplits[indexOfText]}}", JsonObject::class.java)

                return jsonObject.get("text").asString
            } catch (e: java.lang.Exception) {
                println(e.localizedMessage)
            }
        }

        return ""
    }

    private fun lookupDataFromResponseTurbo(jsonString: String): String {
        val splitsJsonString = jsonString.split("[{")

        val indexOfResult: Int = splitsJsonString.indexOfLast {
            it.contains(Constants.MATCH_RESULT_TURBO_STRING)
        }

        val textSplits =
            if (indexOfResult == -1) listOf() else splitsJsonString[indexOfResult].split(",")

        val indexOfText: Int = textSplits.indexOfLast {
            it.contains(Constants.MATCH_RESULT_TURBO_STRING)
        }

        if (indexOfText != -1) {
            try {
                val gson = Gson()
                val jsonObject =
                    gson.fromJson("{${textSplits[indexOfText]}}", JsonObject::class.java)

                return jsonObject.getAsJsonObject("delta").get("content").asString
            } catch (e: java.lang.Exception) {
                println(e.localizedMessage)
            }
        }

        return ""
    }
}