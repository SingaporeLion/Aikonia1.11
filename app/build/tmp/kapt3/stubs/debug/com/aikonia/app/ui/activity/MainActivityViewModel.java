package com.aikonia.app.ui.activity;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/aikonia/app/ui/activity/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "getDarkModeUseCase", "Lcom/aikonia/app/domain/use_case/profile/GetDarkModeUseCase;", "getCurrentLanguageCodeUseCase", "Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageCodeUseCase;", "setFirstTimeUseCase", "Lcom/aikonia/app/domain/use_case/upgrade/SetFirstTimeUseCase;", "(Lcom/aikonia/app/domain/use_case/profile/GetDarkModeUseCase;Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageCodeUseCase;Lcom/aikonia/app/domain/use_case/upgrade/SetFirstTimeUseCase;)V", "_currentLanguageCode", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_darkMode", "", "currentLanguageCode", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentLanguageCode", "()Lkotlinx/coroutines/flow/StateFlow;", "darkMode", "getDarkMode", "Lkotlinx/coroutines/Job;", "setFirstTime", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.domain.use_case.profile.GetDarkModeUseCase getDarkModeUseCase = null;
    private final com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase = null;
    private final com.aikonia.app.domain.use_case.upgrade.SetFirstTimeUseCase setFirstTimeUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _darkMode = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _currentLanguageCode = null;
    
    @javax.inject.Inject
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.profile.GetDarkModeUseCase getDarkModeUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.upgrade.SetFirstTimeUseCase setFirstTimeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCurrentLanguageCode() {
        return null;
    }
    
    private final kotlinx.coroutines.Job setFirstTime() {
        return null;
    }
    
    private final kotlinx.coroutines.Job getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getCurrentLanguageCode() {
        return null;
    }
}