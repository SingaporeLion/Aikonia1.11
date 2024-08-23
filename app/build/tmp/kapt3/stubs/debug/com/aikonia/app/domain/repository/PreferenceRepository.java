package com.aikonia.app.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\bH&J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H&\u00a8\u0006\u0015"}, d2 = {"Lcom/aikonia/app/domain/repository/PreferenceRepository;", "", "getCurrentLanguage", "", "getCurrentLanguageCode", "getDarkMode", "", "getFreeMessageCount", "", "isFirstTime", "isProVersion", "setCurrentLanguage", "", "language", "setCurrentLanguageCode", "setDarkMode", "isDarkMode", "setFirstTime", "setFreeMessageCount", "count", "setProVersion", "app_debug"})
public abstract interface PreferenceRepository {
    
    public abstract void setDarkMode(boolean isDarkMode);
    
    public abstract boolean getDarkMode();
    
    public abstract void setCurrentLanguage(@org.jetbrains.annotations.NotNull
    java.lang.String language);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getCurrentLanguage();
    
    public abstract void setCurrentLanguageCode(@org.jetbrains.annotations.NotNull
    java.lang.String language);
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getCurrentLanguageCode();
    
    public abstract boolean isProVersion();
    
    public abstract void setProVersion(boolean isProVersion);
    
    public abstract boolean isFirstTime();
    
    public abstract void setFirstTime(boolean isFirstTime);
    
    public abstract int getFreeMessageCount();
    
    public abstract void setFreeMessageCount(int count);
}