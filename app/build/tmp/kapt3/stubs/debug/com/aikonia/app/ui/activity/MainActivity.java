package com.aikonia.app.ui.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\u0012\u0010%\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\b\u0010(\u001a\u00020#H\u0014J\b\u0010)\u001a\u00020#H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00040\u00040\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006*"}, d2 = {"Lcom/aikonia/app/ui/activity/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "CHANNEL_ID", "", "getCHANNEL_ID", "()Ljava/lang/String;", "CHANNEL_NAME", "getCHANNEL_NAME", "NOTIF_ID", "", "getNOTIF_ID", "()I", "conversationRepository", "Lcom/aikonia/app/domain/repository/ConversationRepository;", "getConversationRepository", "()Lcom/aikonia/app/domain/repository/ConversationRepository;", "setConversationRepository", "(Lcom/aikonia/app/domain/repository/ConversationRepository;)V", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "userRepository", "Lcom/aikonia/app/data/source/local/UserRepository;", "getUserRepository", "()Lcom/aikonia/app/data/source/local/UserRepository;", "setUserRepository", "(Lcom/aikonia/app/data/source/local/UserRepository;)V", "viewModel", "Lcom/aikonia/app/ui/activity/MainActivityViewModel;", "getViewModel", "()Lcom/aikonia/app/ui/activity/MainActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "askNotificationPermission", "", "createNotificationChannel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "testAddConversation", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivity extends androidx.activity.ComponentActivity {
    @javax.inject.Inject
    public com.aikonia.app.data.source.local.UserRepository userRepository;
    @javax.inject.Inject
    public com.aikonia.app.domain.repository.ConversationRepository conversationRepository;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_ID = "ConversAI";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_NAME = "ConversAI";
    private final int NOTIF_ID = 0;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> requestPermissionLauncher = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.aikonia.app.data.source.local.UserRepository getUserRepository() {
        return null;
    }
    
    public final void setUserRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.UserRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.aikonia.app.domain.repository.ConversationRepository getConversationRepository() {
        return null;
    }
    
    public final void setConversationRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.repository.ConversationRepository p0) {
    }
    
    private final com.aikonia.app.ui.activity.MainActivityViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCHANNEL_ID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCHANNEL_NAME() {
        return null;
    }
    
    public final int getNOTIF_ID() {
        return 0;
    }
    
    private final void createNotificationChannel() {
    }
    
    private final void askNotificationPermission() {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.animation.ExperimentalAnimationApi.class, com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi.class})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void testAddConversation() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
}