package com.aikonia.app.domain.use_case.message;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/aikonia/app/domain/use_case/message/TextCompletionsWithStreamUseCase;", "", "chatRepository", "Lcom/aikonia/app/domain/repository/ChatRepository;", "(Lcom/aikonia/app/domain/repository/ChatRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/aikonia/app/data/model/TextCompletionsParam;", "app_debug"})
public final class TextCompletionsWithStreamUseCase {
    private final com.aikonia.app.domain.repository.ChatRepository chatRepository = null;
    
    @javax.inject.Inject
    public TextCompletionsWithStreamUseCase(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.repository.ChatRepository chatRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> invoke(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.TextCompletionsParam params) {
        return null;
    }
}