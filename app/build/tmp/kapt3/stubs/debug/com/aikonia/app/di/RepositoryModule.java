package com.aikonia.app.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\'J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/aikonia/app/di/RepositoryModule;", "", "()V", "provideChatRepository", "Lcom/aikonia/app/domain/repository/ChatRepository;", "chatRepositoryImpl", "Lcom/aikonia/app/data/repository/ChatRepositoryImpl;", "provideConversationRepository", "Lcom/aikonia/app/domain/repository/ConversationRepository;", "conversationRepositoryImpl", "Lcom/aikonia/app/data/repository/ConversationRepositoryImpl;", "provideFirebaseRepository", "Lcom/aikonia/app/domain/repository/FirebaseRepository;", "firebaseRepositoryImpl", "Lcom/aikonia/app/data/repository/FirebaseRepositoryImpl;", "provideMessageRepository", "Lcom/aikonia/app/domain/repository/MessageRepository;", "messageRepositoryImpl", "Lcom/aikonia/app/data/repository/MessageRepositoryImpl;", "providePreferenceRepository", "Lcom/aikonia/app/domain/repository/PreferenceRepository;", "preferenceRepositoryImpl", "Lcom/aikonia/app/data/repository/PreferenceRepositoryImpl;", "app_debug"})
@dagger.Module
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.aikonia.app.domain.repository.ChatRepository provideChatRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.repository.ChatRepositoryImpl chatRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.aikonia.app.domain.repository.ConversationRepository provideConversationRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.repository.ConversationRepositoryImpl conversationRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.aikonia.app.domain.repository.MessageRepository provideMessageRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.repository.MessageRepositoryImpl messageRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.aikonia.app.domain.repository.PreferenceRepository providePreferenceRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.repository.PreferenceRepositoryImpl preferenceRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.aikonia.app.domain.repository.FirebaseRepository provideFirebaseRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.repository.FirebaseRepositoryImpl firebaseRepositoryImpl);
}