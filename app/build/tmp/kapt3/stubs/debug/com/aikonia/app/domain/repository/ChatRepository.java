package com.aikonia.app.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/aikonia/app/domain/repository/ChatRepository;", "", "textCompletionsWithStream", "Lkotlinx/coroutines/flow/Flow;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "params", "Lcom/aikonia/app/data/model/TextCompletionsParam;", "app_debug"})
public abstract interface ChatRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.lang.String> textCompletionsWithStream(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.TextCompletionsParam params);
}