package com.aikonia.app.data.repository

import android.util.Log
import com.aikonia.app.data.model.ConversationModel
import com.aikonia.app.data.source.local.ConversAIDao
import com.aikonia.app.domain.repository.ConversationRepository
import javax.inject.Inject

class ConversationRepositoryImpl @Inject constructor(
    private val conversAIDao: ConversAIDao
) : ConversationRepository {

    override suspend fun getConversations(): MutableList<ConversationModel> {
        val conversations = conversAIDao.getConversations()
        Log.d("ConversationRepository", "Conversations retrieved: ${conversations.size}")
        conversations.forEach { conversation ->
            Log.d("ConversationRepository", "Conversation ID: ${conversation.id}, Created At: ${conversation.createdAt}")
        }
        return conversations
    }

    override suspend fun addConversation(conversation: ConversationModel) {
        Log.d("ConversationRepository", "Adding conversation with ID: ${conversation.id}, Created At: ${conversation.createdAt}")
        conversAIDao.addConversation(conversation)
        Log.d("ConversationRepository", "Conversation added successfully")
    }

    override suspend fun deleteConversation(conversationId: String) {
        Log.d("ConversationRepository", "Deleting conversation with ID: $conversationId")
        conversAIDao.deleteConversation(conversationId)
        conversAIDao.deleteMessages(conversationId)
    }

    override suspend fun deleteAllConversation() {
        Log.d("ConversationRepository", "Deleting all conversations")
        conversAIDao.deleteAllConversation()
    }
}
