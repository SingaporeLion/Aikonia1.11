package com.aikonia.app.ui.chat;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020\u0013H\u0002J\u0011\u0010-\u001a\u00020.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001a\u00100\u001a\u00020.2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020.02J\u0016\u00103\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u00104\u001a\u00020\u0013H\u0002J\u0016\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u00104\u001a\u00020\u0013H\u0002J\u0010\u00108\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u0013H\u0002J\u0006\u00109\u001a\u00020.J\u001e\u0010:\u001a\u00020.2\u0006\u0010;\u001a\u00020\u00132\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0013J\u000e\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020\u0013J\u0016\u0010A\u001a\u00020.2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0006\u0010C\u001a\u00020#J\u0010\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020\u0013H\u0002R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R)\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00170\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u000e\u0010*\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006F"}, d2 = {"Lcom/aikonia/app/ui/chat/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "textCompletionsWithStreamUseCase", "Lcom/aikonia/app/domain/use_case/message/TextCompletionsWithStreamUseCase;", "createMessagesUseCase", "Lcom/aikonia/app/domain/use_case/message/CreateMessagesUseCase;", "getMessagesUseCase", "Lcom/aikonia/app/domain/use_case/message/GetMessagesUseCase;", "createConversationUseCase", "Lcom/aikonia/app/domain/use_case/conversation/CreateConversationUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "userRepository", "Lcom/aikonia/app/data/source/local/UserRepository;", "conversAIService", "Lcom/aikonia/app/data/source/remote/ConversAIService;", "(Lcom/aikonia/app/domain/use_case/message/TextCompletionsWithStreamUseCase;Lcom/aikonia/app/domain/use_case/message/CreateMessagesUseCase;Lcom/aikonia/app/domain/use_case/message/GetMessagesUseCase;Lcom/aikonia/app/domain/use_case/conversation/CreateConversationUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/aikonia/app/data/source/local/UserRepository;Lcom/aikonia/app/data/source/remote/ConversAIService;)V", "_currentConversation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isGenerating", "", "_messages", "Ljava/util/HashMap;", "", "Lcom/aikonia/app/data/model/MessageModel;", "answerFromGPT", "cScope", "Lkotlinx/coroutines/CoroutineScope;", "currentConversationState", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentConversationState", "()Lkotlinx/coroutines/flow/StateFlow;", "isGenerating", "job", "Lkotlinx/coroutines/Job;", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "messagesState", "getMessagesState", "newMessageModel", "createConversationRemote", "title", "fetchMessages", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentUserName", "onResult", "Lkotlin/Function1;", "getMessagesByConversation", "conversationId", "getMessagesParamsTurbo", "", "Lcom/aikonia/app/data/model/MessageTurbo;", "getPrompt", "prepareAndSendGreeting", "sendGreetingToAPI", "userName", "userAge", "", "gender", "sendMessage", "message", "setMessages", "messages", "stopGenerate", "updateLocalAnswer", "answer", "app_debug"})
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.aikonia.app.domain.use_case.message.TextCompletionsWithStreamUseCase textCompletionsWithStreamUseCase = null;
    private final com.aikonia.app.domain.use_case.message.CreateMessagesUseCase createMessagesUseCase = null;
    private final com.aikonia.app.domain.use_case.message.GetMessagesUseCase getMessagesUseCase = null;
    private final com.aikonia.app.domain.use_case.conversation.CreateConversationUseCase createConversationUseCase = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    private final com.aikonia.app.data.source.local.UserRepository userRepository = null;
    private final com.aikonia.app.data.source.remote.ConversAIService conversAIService = null;
    private java.lang.String answerFromGPT = "";
    private com.aikonia.app.data.model.MessageModel newMessageModel;
    private final kotlinx.coroutines.CoroutineScope cScope = null;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job job;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _currentConversation = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.HashMap<java.lang.String, java.util.List<com.aikonia.app.data.model.MessageModel>>> _messages = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isGenerating = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> currentConversationState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.HashMap<java.lang.String, java.util.List<com.aikonia.app.data.model.MessageModel>>> messagesState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isGenerating = null;
    
    @javax.inject.Inject
    public ChatViewModel(@org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.message.TextCompletionsWithStreamUseCase textCompletionsWithStreamUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.message.CreateMessagesUseCase createMessagesUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.message.GetMessagesUseCase getMessagesUseCase, @org.jetbrains.annotations.NotNull
    com.aikonia.app.domain.use_case.conversation.CreateConversationUseCase createConversationUseCase, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.SavedStateHandle savedStateHandle, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.local.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.source.remote.ConversAIService conversAIService) {
        super();
    }
    
    public final void sendGreetingToAPI(@org.jetbrains.annotations.NotNull
    java.lang.String userName, int userAge, @org.jetbrains.annotations.NotNull
    java.lang.String gender) {
    }
    
    public final void prepareAndSendGreeting() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.Job getJob() {
        return null;
    }
    
    public final void setJob(@org.jetbrains.annotations.Nullable
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getCurrentConversationState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.HashMap<java.lang.String, java.util.List<com.aikonia.app.data.model.MessageModel>>> getMessagesState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isGenerating() {
        return null;
    }
    
    public final void getCurrentUserName(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onResult) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job sendMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job stopGenerate() {
        return null;
    }
    
    private final kotlinx.coroutines.Job createConversationRemote(java.lang.String title) {
        return null;
    }
    
    private final java.util.List<com.aikonia.app.data.model.MessageModel> getMessagesByConversation(java.lang.String conversationId) {
        return null;
    }
    
    private final java.lang.String getPrompt(java.lang.String conversationId) {
        return null;
    }
    
    private final java.util.List<com.aikonia.app.data.model.MessageTurbo> getMessagesParamsTurbo(java.lang.String conversationId) {
        return null;
    }
    
    private final java.lang.Object fetchMessages(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void updateLocalAnswer(java.lang.String answer) {
    }
    
    private final void setMessages(java.util.List<com.aikonia.app.data.model.MessageModel> messages) {
    }
}