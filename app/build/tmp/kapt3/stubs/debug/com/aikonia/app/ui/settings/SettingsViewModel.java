package com.aikonia.app.ui.settings;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0014R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/aikonia/app/ui/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "setDarkModeUseCase", "Lcom/aikonia/app/domain/use_case/profile/SetDarkModeUseCase;", "getCurrentLanguageUseCase", "Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageUseCase;", "isProVersionUseCase", "Lcom/aikonia/app/domain/use_case/upgrade/IsProVersionUseCase;", "setProVersionUseCase", "Lcom/aikonia/app/domain/use_case/upgrade/SetProVersionUseCase;", "(Lcom/aikonia/app/domain/use_case/profile/SetDarkModeUseCase;Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageUseCase;Lcom/aikonia/app/domain/use_case/upgrade/IsProVersionUseCase;Lcom/aikonia/app/domain/use_case/upgrade/SetProVersionUseCase;)V", "_currentLanguage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "currentLanguage", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentLanguage", "()Lkotlinx/coroutines/flow/StateFlow;", "isProVersion", "Landroidx/compose/runtime/MutableState;", "", "()Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/Job;", "getProVersion", "setDarkMode", "", "isDarkMode", "setProVersion", "isPro", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.domain.use_case.profile.SetDarkModeUseCase setDarkModeUseCase = null;
    private final com.aikonia.app.domain.use_case.language.GetCurrentLanguageUseCase getCurrentLanguageUseCase = null;
    private final com.aikonia.app.domain.use_case.upgrade.IsProVersionUseCase isProVersionUseCase = null;
    private final com.aikonia.app.domain.use_case.upgrade.SetProVersionUseCase setProVersionUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isProVersion = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _currentLanguage = null;
    
    @javax.inject.Inject
    public SettingsViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.profile.SetDarkModeUseCase setDarkModeUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.language.GetCurrentLanguageUseCase getCurrentLanguageUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.upgrade.IsProVersionUseCase isProVersionUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.upgrade.SetProVersionUseCase setProVersionUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isProVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCurrentLanguage() {
        return null;
    }
    
    public final void setDarkMode(boolean isDarkMode) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getCurrentLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getProVersion() {
        return null;
    }
    
    public final void setProVersion(boolean isPro) {
    }
}