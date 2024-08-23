package com.aikonia.app.ui.upgrade;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/aikonia/app/ui/upgrade/UpgradeViewModel;", "Landroidx/lifecycle/ViewModel;", "setProVersionUseCase", "Lcom/aikonia/app/domain/use_case/upgrade/SetProVersionUseCase;", "(Lcom/aikonia/app/domain/use_case/upgrade/SetProVersionUseCase;)V", "setProVersion", "", "isProVersion", "", "app_debug"})
public final class UpgradeViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.domain.use_case.upgrade.SetProVersionUseCase setProVersionUseCase = null;
    
    @javax.inject.Inject
    public UpgradeViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.upgrade.SetProVersionUseCase setProVersionUseCase) {
        super();
    }
    
    public final void setProVersion(boolean isProVersion) {
    }
}