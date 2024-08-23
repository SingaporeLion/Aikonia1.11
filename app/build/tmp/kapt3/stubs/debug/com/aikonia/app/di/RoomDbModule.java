package com.aikonia.app.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/aikonia/app/di/RoomDbModule;", "", "()V", "provideConversAIDao", "Lcom/aikonia/app/data/source/local/ConversAIDao;", "conversAIDatabase", "Lcom/aikonia/app/data/source/local/ConversAIDatabase;", "provideRoomDb", "appContext", "Landroid/content/Context;", "provideUserDao", "Lcom/aikonia/app/data/source/local/UserDao;", "db", "provideUserRepository", "Lcom/aikonia/app/data/source/local/UserRepository;", "userDao", "sharedPreferences", "Landroid/content/SharedPreferences;", "app_debug"})
@dagger.Module
public final class RoomDbModule {
    
    public RoomDbModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.aikonia.app.data.source.local.ConversAIDatabase provideRoomDb(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context appContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.aikonia.app.data.source.local.ConversAIDao provideConversAIDao(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.ConversAIDatabase conversAIDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.aikonia.app.data.source.local.UserDao provideUserDao(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.ConversAIDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.aikonia.app.data.source.local.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.UserDao userDao, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
}