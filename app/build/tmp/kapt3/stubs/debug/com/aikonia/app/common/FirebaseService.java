package com.aikonia.app.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/aikonia/app/common/FirebaseService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "CHANNEL_ID", "", "getCHANNEL_ID", "()Ljava/lang/String;", "CHANNEL_NAME", "getCHANNEL_NAME", "NOTIF_ID", "", "getNOTIF_ID", "()I", "onMessageReceived", "", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "token", "sendRegistrationToServer", "app_debug"})
public final class FirebaseService extends com.google.firebase.messaging.FirebaseMessagingService {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_ID = "ConversAI";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CHANNEL_NAME = "ConversAI";
    private final int NOTIF_ID = 0;
    
    public FirebaseService() {
        super();
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
    
    @java.lang.Override
    public void onNewToken(@org.jetbrains.annotations.NotNull
    java.lang.String token) {
    }
    
    private final void sendRegistrationToServer(java.lang.String token) {
    }
    
    @java.lang.Override
    public void onMessageReceived(@org.jetbrains.annotations.NotNull
    com.google.firebase.messaging.RemoteMessage message) {
    }
}