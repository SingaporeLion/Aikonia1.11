package com.aikonia.app.data.source.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00162\u0006\u0010\u0012\u001a\u00020\u000fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/aikonia/app/data/source/local/ConversAIDao;", "", "addConversation", "", "conversationModel", "Lcom/aikonia/app/data/model/ConversationModel;", "(Lcom/aikonia/app/data/model/ConversationModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addMessage", "messageModel", "Lcom/aikonia/app/data/model/MessageModel;", "(Lcom/aikonia/app/data/model/MessageModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllConversation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteConversation", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "conversationId", "getConversations", "", "getMessages", "", "app_debug"})
public abstract interface ConversAIDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM conversations ORDER BY createdAt DESC")
    public abstract java.lang.Object getConversations(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.aikonia.app.data.model.ConversationModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object addConversation(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.ConversationModel conversationModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM conversations WHERE id = :id")
    public abstract java.lang.Object deleteConversation(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM conversations")
    public abstract java.lang.Object deleteAllConversation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM messages WHERE conversationId = :conversationId ORDER BY createdAt DESC")
    public abstract java.lang.Object getMessages(@org.jetbrains.annotations.NotNull
    java.lang.String conversationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.aikonia.app.data.model.MessageModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object addMessage(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.MessageModel messageModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM messages WHERE conversationId = :conversationId")
    public abstract java.lang.Object deleteMessages(@org.jetbrains.annotations.NotNull
    java.lang.String conversationId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}