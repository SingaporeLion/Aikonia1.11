package com.aikonia.app.ui.activity

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.core.view.WindowCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.currentBackStackEntryAsState
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.google.accompanist.navigation.material.rememberBottomSheetNavigator
import com.google.firebase.messaging.FirebaseMessaging
import com.aikonia.app.common.loadRewarded
import com.aikonia.app.common.removeInterstitial
import com.aikonia.app.navigation.BottomNavigationBar
import com.aikonia.app.navigation.NavGraph
import com.aikonia.app.navigation.Screen
import com.aikonia.app.ui.theme.ConversAITheme
import com.aikonia.app.ui.upgrade.PurchaseHelper
import com.aikonia.app.data.source.local.UserRepository
import com.aikonia.app.data.model.ConversationModel
import com.aikonia.app.domain.repository.ConversationRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.util.*
import javax.inject.Inject
import androidx.compose.ui.graphics.Color



@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userRepository: UserRepository  // Injizieren von UserRepository

    @Inject
    lateinit var conversationRepository: ConversationRepository  // Injizieren von ConversationRepository

    private val viewModel: MainActivityViewModel by viewModels()

    val CHANNEL_ID = "ConversAI"
    val CHANNEL_NAME = "ConversAI"
    val NOTIF_ID = 0

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted: Boolean ->
        if (isGranted) {
            // FCM SDK (and your app) can post notifications.
        } else {
            // TODO: Inform user that that your app will not show notifications.
        }
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                CHANNEL_NAME,
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                enableLights(true)
            }
            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.createNotificationChannel(channel)
        }
    }

    private fun askNotificationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) ==
                PackageManager.PERMISSION_GRANTED
            ) {
            } else if (shouldShowRequestPermissionRationale(Manifest.permission.POST_NOTIFICATIONS)) {

            } else {
                requestPermissionLauncher.launch(Manifest.permission.POST_NOTIFICATIONS)
            }
        }
    }

    @OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialNavigationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MainActivity", "onCreate: MainActivity gestartet")

        // Prüfen, ob Firebase erfolgreich initialisiert wird
        FirebaseMessaging.getInstance().subscribeToTopic("all").addOnSuccessListener {
            Log.d("MainActivity", "Firebase Topic 'all' abonniert")
        }.addOnFailureListener {
            Log.e("MainActivity", "Fehler beim Abonnieren des Firebase Topics: ${it.message}")
        }

        askNotificationPermission()
        createNotificationChannel()
        Log.d("MainActivity", "Notification Channel erstellt")

        setContent {
            val darkThemeCurrent by viewModel.darkMode.collectAsState()
            val darkTheme = remember { mutableStateOf(darkThemeCurrent) }

            ConversAITheme(darkTheme = darkTheme.value) {
                val bottomBarState = rememberSaveable { (mutableStateOf(false)) }
                val bottomSheetNavigator = rememberBottomSheetNavigator()
                val navController = rememberAnimatedNavController(bottomSheetNavigator) // NavController korrekt initialisieren
                val navBackStackEntry by navController.currentBackStackEntryAsState()

                when (navBackStackEntry?.destination?.route) {
                    Screen.Upgrade.route -> bottomBarState.value = false
                    Screen.Splash.route -> bottomBarState.value = false
                    "${Screen.Chat.route}?name={name}&role={role}&examples={examples}&id={id}" -> bottomBarState.value = false
                    null -> bottomBarState.value = false
                    else -> bottomBarState.value = true
                }

                ModalBottomSheetLayout(
                    bottomSheetNavigator = bottomSheetNavigator,
                    sheetShape = RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .background(MaterialTheme.colors.background)
                            .fillMaxSize()
                            .navigationBarsPadding()
                            .captionBarPadding()
                            .imePadding()
                            .statusBarsPadding()
                    ) {
                        // Temporär den UI-Inhalt minimieren, um Fehler zu finden
                        Text(text = "Hallo Welt", color = Color.Black) // Color.Black verwendet statt Black

                        Column(
                            Modifier.fillMaxHeight()
                        ) {
                            Spacer(modifier = Modifier.weight(1f))
                            BottomNavigationBar(navController, bottomBarState)
                        }
                    }
                }
            }
        }
    }


    // Funktion zum Hinzufügen einer Konversation nur bei Bedarf
    private fun testAddConversation() {
        lifecycleScope.launch {
            val conversation = ConversationModel(
                id = UUID.randomUUID().toString(),  // Eindeutige ID für jede Konversation
                createdAt = System.currentTimeMillis(), // Zeitpunkt der Erstellung
                title = "Neue Konversation" // Beispiel für Titel, falls vorhanden
            )

            Log.d("MainActivity", "Testing: Adding conversation with ID: ${conversation.id}")
            conversationRepository.addConversation(conversation)

            val conversations = conversationRepository.getConversations()
            Log.d("MainActivity", "Testing: Retrieved ${conversations.size} conversations")
            conversations.forEach { conv ->
                Log.d("MainActivity", "Testing: Conversation ID: ${conv.id}, Created At: ${conv.createdAt}")
            }
        }
    }

    override fun onDestroy() {
        removeInterstitial()
        super.onDestroy()
    }
}


