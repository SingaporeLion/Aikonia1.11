package com.aikonia.app.data.source.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/aikonia/app/data/source/local/UserDao;", "", "getCurrentUser", "Lcom/aikonia/app/data/source/local/User;", "userId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "insertUser", "", "user", "(Lcom/aikonia/app/data/source/local/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insertUser(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.User user, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE id = :userId")
    public abstract java.lang.Object getUserById(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.aikonia.app.data.source.local.User> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM user_table WHERE id = :userId")
    public abstract java.lang.Object getCurrentUser(int userId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.aikonia.app.data.source.local.User> continuation);
}