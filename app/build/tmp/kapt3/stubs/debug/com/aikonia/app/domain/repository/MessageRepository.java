package com.aikonia.app.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/aikonia/app/domain/repository/MessageRepository;", "", "addMessage", "", "message", "Lcom/aikonia/app/data/model/MessageModel;", "(Lcom/aikonia/app/data/model/MessageModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "conversationId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMessages", "", "app_debug"})
public abstract interface MessageRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMessages(@org.jetbrains.annotations.NotNull
    java.lang.String conversationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.aikonia.app.data.model.MessageModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addMessage(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.MessageModel message, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteMessages(@org.jetbrains.annotations.NotNull
    java.lang.String conversationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}