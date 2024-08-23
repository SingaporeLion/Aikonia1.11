package com.aikonia.app.ui.history;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001aJ\u0006\u0010\u0017\u001a\u00020\u001aR\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/aikonia/app/ui/history/HistoryViewModel;", "Landroidx/lifecycle/ViewModel;", "getConversationsUseCase", "Lcom/aikonia/app/domain/use_case/conversation/GetConversationsUseCase;", "deleteConversationUseCase", "Lcom/aikonia/app/domain/use_case/conversation/DeleteConversationUseCase;", "deleteAllConversationUseCase", "Lcom/aikonia/app/domain/use_case/conversation/DeleteAllConversationUseCase;", "getDarkModeUseCase", "Lcom/aikonia/app/domain/use_case/profile/GetDarkModeUseCase;", "(Lcom/aikonia/app/domain/use_case/conversation/GetConversationsUseCase;Lcom/aikonia/app/domain/use_case/conversation/DeleteConversationUseCase;Lcom/aikonia/app/domain/use_case/conversation/DeleteAllConversationUseCase;Lcom/aikonia/app/domain/use_case/profile/GetDarkModeUseCase;)V", "_conversations", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/aikonia/app/data/model/ConversationModel;", "_darkMode", "", "_isFetching", "conversationsState", "Lkotlinx/coroutines/flow/StateFlow;", "getConversationsState", "()Lkotlinx/coroutines/flow/StateFlow;", "darkMode", "getDarkMode", "isFetching", "deleteAllConversation", "Lkotlinx/coroutines/Job;", "deleteConversation", "conversationId", "", "getConversations", "app_debug"})
public final class HistoryViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.domain.use_case.conversation.GetConversationsUseCase getConversationsUseCase = null;
    private final com.aikonia.app.domain.use_case.conversation.DeleteConversationUseCase deleteConversationUseCase = null;
    private final com.aikonia.app.domain.use_case.conversation.DeleteAllConversationUseCase deleteAllConversationUseCase = null;
    private final com.aikonia.app.domain.use_case.profile.GetDarkModeUseCase getDarkModeUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.aikonia.app.data.model.ConversationModel>> _conversations = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isFetching = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.aikonia.app.data.model.ConversationModel>> conversationsState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isFetching = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _darkMode = null;
    
    @javax.inject.Inject
    public HistoryViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.conversation.GetConversationsUseCase getConversationsUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.conversation.DeleteConversationUseCase deleteConversationUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.conversation.DeleteAllConversationUseCase deleteAllConversationUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.profile.GetDarkModeUseCase getDarkModeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.aikonia.app.data.model.ConversationModel>> getConversationsState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isFetching() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getDarkMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getConversations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteConversation(@org.jetbrains.annotations.NotNull
    java.lang.String conversationId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteAllConversation() {
        return null;
    }
}