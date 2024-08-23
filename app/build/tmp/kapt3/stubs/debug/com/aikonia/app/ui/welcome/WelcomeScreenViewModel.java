package com.aikonia.app.ui.welcome;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/aikonia/app/ui/welcome/WelcomeScreenViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/aikonia/app/data/source/local/UserRepository;", "(Lcom/aikonia/app/data/source/local/UserRepository;)V", "getCurrentUserName", "", "onResult", "Lkotlin/Function1;", "", "app_debug"})
public final class WelcomeScreenViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.data.source.local.UserRepository userRepository = null;
    
    @javax.inject.Inject
    public WelcomeScreenViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.UserRepository userRepository) {
        super();
    }
    
    public final void getCurrentUserName(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onResult) {
    }
}