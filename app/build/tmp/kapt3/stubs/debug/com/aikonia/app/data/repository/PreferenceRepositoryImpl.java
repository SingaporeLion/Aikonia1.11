package com.aikonia.app.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/aikonia/app/data/repository/PreferenceRepositoryImpl;", "Lcom/aikonia/app/domain/repository/PreferenceRepository;", "sharedPreferences", "Landroid/content/SharedPreferences;", "app", "Landroid/app/Application;", "(Landroid/content/SharedPreferences;Landroid/app/Application;)V", "getCurrentLanguage", "", "getCurrentLanguageCode", "getDarkMode", "", "getFreeMessageCount", "", "isFirstTime", "isProVersion", "setCurrentLanguage", "", "language", "setCurrentLanguageCode", "setDarkMode", "isDarkMode", "setFirstTime", "setFreeMessageCount", "count", "setProVersion", "app_debug"})
public final class PreferenceRepositoryImpl implements com.aikonia.app.domain.repository.PreferenceRepository {
    private final android.content.SharedPreferences sharedPreferences = null;
    private final android.app.Application app = null;
    
    @javax.inject.Inject
    public PreferenceRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull
    android.app.Application app) {
        super();
    }
    
    @java.lang.Override
    public void setDarkMode(boolean isDarkMode) {
    }
    
    @java.lang.Override
    public boolean getDarkMode() {
        return false;
    }
    
    @java.lang.Override
    public void setCurrentLanguage(@org.jetbrains.annotations.NotNull
    java.lang.String language) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getCurrentLanguage() {
        return null;
    }
    
    @java.lang.Override
    public void setCurrentLanguageCode(@org.jetbrains.annotations.NotNull
    java.lang.String language) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getCurrentLanguageCode() {
        return null;
    }
    
    @java.lang.Override
    public boolean isProVersion() {
        return false;
    }
    
    @java.lang.Override
    public void setProVersion(boolean isProVersion) {
    }
    
    @java.lang.Override
    public boolean isFirstTime() {
        return false;
    }
    
    @java.lang.Override
    public void setFirstTime(boolean isFirstTime) {
    }
    
    @java.lang.Override
    public int getFreeMessageCount() {
        return 0;
    }
    
    @java.lang.Override
    public void setFreeMessageCount(int count) {
    }
}