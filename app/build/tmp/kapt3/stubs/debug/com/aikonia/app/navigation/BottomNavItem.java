package com.aikonia.app.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/aikonia/app/navigation/BottomNavItem;", "", "title", "", "icon", "icon_filled", "route", "", "(IIILjava/lang/String;)V", "getIcon", "()I", "getIcon_filled", "getRoute", "()Ljava/lang/String;", "getTitle", "Chat", "History", "Settings", "Lcom/aikonia/app/navigation/BottomNavItem$Chat;", "Lcom/aikonia/app/navigation/BottomNavItem$History;", "Lcom/aikonia/app/navigation/BottomNavItem$Settings;", "app_debug"})
public abstract class BottomNavItem {
    private final int title = 0;
    private final int icon = 0;
    private final int icon_filled = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private BottomNavItem(int title, int icon, int icon_filled, java.lang.String route) {
        super();
    }
    
    public final int getTitle() {
        return 0;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final int getIcon_filled() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/aikonia/app/navigation/BottomNavItem$Chat;", "Lcom/aikonia/app/navigation/BottomNavItem;", "()V", "app_debug"})
    public static final class Chat extends com.aikonia.app.navigation.BottomNavItem {
        @org.jetbrains.annotations.NotNull
        public static final com.aikonia.app.navigation.BottomNavItem.Chat INSTANCE = null;
        
        private Chat() {
            super(0, 0, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/aikonia/app/navigation/BottomNavItem$History;", "Lcom/aikonia/app/navigation/BottomNavItem;", "()V", "app_debug"})
    public static final class History extends com.aikonia.app.navigation.BottomNavItem {
        @org.jetbrains.annotations.NotNull
        public static final com.aikonia.app.navigation.BottomNavItem.History INSTANCE = null;
        
        private History() {
            super(0, 0, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/aikonia/app/navigation/BottomNavItem$Settings;", "Lcom/aikonia/app/navigation/BottomNavItem;", "()V", "app_debug"})
    public static final class Settings extends com.aikonia.app.navigation.BottomNavItem {
        @org.jetbrains.annotations.NotNull
        public static final com.aikonia.app.navigation.BottomNavItem.Settings INSTANCE = null;
        
        private Settings() {
            super(0, 0, 0, null);
        }
    }
}