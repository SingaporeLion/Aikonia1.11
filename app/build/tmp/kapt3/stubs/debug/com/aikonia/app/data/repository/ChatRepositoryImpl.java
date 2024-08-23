package com.aikonia.app.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/aikonia/app/data/repository/ChatRepositoryImpl;", "Lcom/aikonia/app/domain/repository/ChatRepository;", "conversAIService", "Lcom/aikonia/app/data/source/remote/ConversAIService;", "(Lcom/aikonia/app/data/source/remote/ConversAIService;)V", "lookupDataFromResponse", "", "jsonString", "lookupDataFromResponseTurbo", "textCompletionsWithStream", "Lkotlinx/coroutines/flow/Flow;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/aikonia/app/data/model/TextCompletionsParam;", "app_debug"})
public final class ChatRepositoryImpl implements com.aikonia.app.domain.repository.ChatRepository {
    private final com.aikonia.app.data.source.remote.ConversAIService conversAIService = null;
    
    @javax.inject.Inject
    public ChatRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.remote.ConversAIService conversAIService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.lang.String> textCompletionsWithStream(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.TextCompletionsParam params) {
        return null;
    }
    
    private final java.lang.String lookupDataFromResponse(java.lang.String jsonString) {
        return null;
    }
    
    private final java.lang.String lookupDataFromResponseTurbo(java.lang.String jsonString) {
        return null;
    }
}