package com.aikonia.app.ui.startchat;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\u0015\u001a\u00020\u001fJ\u0006\u0010\u001c\u001a\u00020\u001fJ\b\u0010\"\u001a\u00020\u001fH\u0002J\u0006\u0010#\u001a\u00020$J\u001e\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0014R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/aikonia/app/ui/startchat/StartChatViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/aikonia/app/data/source/local/UserRepository;", "isProVersionUseCase", "Lcom/aikonia/app/domain/use_case/upgrade/IsProVersionUseCase;", "isThereUpdateUseCase", "Lcom/aikonia/app/domain/use_case/app/IsThereUpdateUseCase;", "getCurrentLanguageCodeUseCase", "Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageCodeUseCase;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/aikonia/app/data/source/local/UserRepository;Lcom/aikonia/app/domain/use_case/upgrade/IsProVersionUseCase;Lcom/aikonia/app/domain/use_case/app/IsThereUpdateUseCase;Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageCodeUseCase;Landroid/content/SharedPreferences;)V", "_currentUser", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/aikonia/app/data/source/local/User;", "_isUserDataSaved", "", "currentLanguageCode", "Landroidx/compose/runtime/MutableState;", "", "getCurrentLanguageCode", "()Landroidx/compose/runtime/MutableState;", "currentUser", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentUser", "()Lkotlinx/coroutines/flow/StateFlow;", "isProVersion", "isThereUpdate", "isUserDataSaved", "checkUserDataExists", "Lkotlinx/coroutines/Job;", "userId", "", "loadCurrentUser", "resetUserDataSavedStatus", "", "saveUser", "name", "birthYear", "gender", "app_debug"})
public final class StartChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.data.source.local.UserRepository userRepository = null;
    private final com.aikonia.app.domain.use_case.upgrade.IsProVersionUseCase isProVersionUseCase = null;
    private final com.aikonia.app.domain.use_case.app.IsThereUpdateUseCase isThereUpdateUseCase = null;
    private final com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase = null;
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isProVersion = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isThereUpdate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> currentLanguageCode = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isUserDataSaved = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isUserDataSaved = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.aikonia.app.data.source.local.User> _currentUser = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.aikonia.app.data.source.local.User> currentUser = null;
    
    @javax.inject.Inject
    public StartChatViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.upgrade.IsProVersionUseCase isProVersionUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.app.IsThereUpdateUseCase isThereUpdateUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isProVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isThereUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getCurrentLanguageCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isUserDataSaved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.aikonia.app.data.source.local.User> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job isThereUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getCurrentLanguageCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveUser(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String birthYear, @org.jetbrains.annotations.NotNull
    java.lang.String gender) {
        return null;
    }
    
    public final void resetUserDataSavedStatus() {
    }
    
    private final kotlinx.coroutines.Job loadCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job checkUserDataExists(int userId) {
        return null;
    }
}