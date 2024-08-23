package com.aikonia.app.data.source.local;

import java.lang.System;

@androidx.room.Database(entities = {com.aikonia.app.data.model.ConversationModel.class, com.aikonia.app.data.model.MessageModel.class, com.aikonia.app.data.source.local.User.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/aikonia/app/data/source/local/ConversAIDatabase;", "Landroidx/room/RoomDatabase;", "()V", "conversAIDao", "Lcom/aikonia/app/data/source/local/ConversAIDao;", "userDao", "Lcom/aikonia/app/data/source/local/UserDao;", "app_debug"})
public abstract class ConversAIDatabase extends androidx.room.RoomDatabase {
    
    public ConversAIDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.aikonia.app.data.source.local.ConversAIDao conversAIDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.aikonia.app.data.source.local.UserDao userDao();
}