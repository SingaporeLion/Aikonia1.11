package com.aikonia.app.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/aikonia/app/data/repository/ConversationRepositoryImpl;", "Lcom/aikonia/app/domain/repository/ConversationRepository;", "conversAIDao", "Lcom/aikonia/app/data/source/local/ConversAIDao;", "(Lcom/aikonia/app/data/source/local/ConversAIDao;)V", "addConversation", "", "conversation", "Lcom/aikonia/app/data/model/ConversationModel;", "(Lcom/aikonia/app/data/model/ConversationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllConversation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteConversation", "conversationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConversations", "", "app_debug"})
public final class ConversationRepositoryImpl implements com.aikonia.app.domain.repository.ConversationRepository {
    private final com.aikonia.app.data.source.local.ConversAIDao conversAIDao = null;
    
    @javax.inject.Inject
    public ConversationRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.ConversAIDao conversAIDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getConversations(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.aikonia.app.data.model.ConversationModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addConversation(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.ConversationModel conversation, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteConversation(@org.jetbrains.annotations.NotNull
    java.lang.String conversationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllConversation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}