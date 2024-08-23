package com.aikonia.app.ui.language;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/aikonia/app/ui/language/LanguageViewModel;", "Landroidx/lifecycle/ViewModel;", "getCurrentLanguageCodeUseCase", "Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageCodeUseCase;", "setCurrentLanguageCodeUseCase", "Lcom/aikonia/app/domain/use_case/language/SetCurrentLanguageCodeUseCase;", "setCurrentLanguageUseCase", "Lcom/aikonia/app/domain/use_case/language/SetCurrentLanguageUseCase;", "(Lcom/aikonia/app/domain/use_case/language/GetCurrentLanguageCodeUseCase;Lcom/aikonia/app/domain/use_case/language/SetCurrentLanguageCodeUseCase;Lcom/aikonia/app/domain/use_case/language/SetCurrentLanguageUseCase;)V", "_currentLanguage", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "currentLanguage", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentLanguage", "()Lkotlinx/coroutines/flow/StateFlow;", "selectedValue", "Landroidx/compose/runtime/MutableState;", "getSelectedValue", "()Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/Job;", "setCurrentLanguage", "languageCode", "language", "app_debug"})
public final class LanguageViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase = null;
    private final com.aikonia.app.domain.use_case.language.SetCurrentLanguageCodeUseCase setCurrentLanguageCodeUseCase = null;
    private final com.aikonia.app.domain.use_case.language.SetCurrentLanguageUseCase setCurrentLanguageUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.String> selectedValue = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _currentLanguage = null;
    
    @javax.inject.Inject
    public LanguageViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.language.SetCurrentLanguageCodeUseCase setCurrentLanguageCodeUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.language.SetCurrentLanguageUseCase setCurrentLanguageUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.String> getSelectedValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCurrentLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getCurrentLanguage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job setCurrentLanguage(@org.jetbrains.annotations.NotNull
    java.lang.String languageCode, @org.jetbrains.annotations.NotNull
    java.lang.String language) {
        return null;
    }
}