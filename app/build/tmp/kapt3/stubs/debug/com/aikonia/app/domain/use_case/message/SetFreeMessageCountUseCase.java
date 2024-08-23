package com.aikonia.app.domain.use_case.message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/aikonia/app/domain/use_case/message/SetFreeMessageCountUseCase;", "", "preferenceRepository", "Lcom/aikonia/app/domain/repository/PreferenceRepository;", "(Lcom/aikonia/app/domain/repository/PreferenceRepository;)V", "invoke", "", "count", "", "app_debug"})
public final class SetFreeMessageCountUseCase {
    private final com.aikonia.app.domain.repository.PreferenceRepository preferenceRepository = null;
    
    @javax.inject.Inject
    public SetFreeMessageCountUseCase(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.repository.PreferenceRepository preferenceRepository) {
        super();
    }
    
    public final void invoke(int count) {
    }
}