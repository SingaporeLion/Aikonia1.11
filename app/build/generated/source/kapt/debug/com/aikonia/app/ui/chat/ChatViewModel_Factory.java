package com.aikonia.app.ui.chat;

import androidx.lifecycle.SavedStateHandle;
import com.aikonia.app.data.source.local.UserRepository;
import com.aikonia.app.data.source.remote.ConversAIService;
import com.aikonia.app.domain.use_case.conversation.CreateConversationUseCase;
import com.aikonia.app.domain.use_case.message.CreateMessagesUseCase;
import com.aikonia.app.domain.use_case.message.GetMessagesUseCase;
import com.aikonia.app.domain.use_case.message.TextCompletionsWithStreamUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<TextCompletionsWithStreamUseCase> textCompletionsWithStreamUseCaseProvider;

  private final Provider<CreateMessagesUseCase> createMessagesUseCaseProvider;

  private final Provider<GetMessagesUseCase> getMessagesUseCaseProvider;

  private final Provider<CreateConversationUseCase> createConversationUseCaseProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<ConversAIService> conversAIServiceProvider;

  public ChatViewModel_Factory(
      Provider<TextCompletionsWithStreamUseCase> textCompletionsWithStreamUseCaseProvider,
      Provider<CreateMessagesUseCase> createMessagesUseCaseProvider,
      Provider<GetMessagesUseCase> getMessagesUseCaseProvider,
      Provider<CreateConversationUseCase> createConversationUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<ConversAIService> conversAIServiceProvider) {
    this.textCompletionsWithStreamUseCaseProvider = textCompletionsWithStreamUseCaseProvider;
    this.createMessagesUseCaseProvider = createMessagesUseCaseProvider;
    this.getMessagesUseCaseProvider = getMessagesUseCaseProvider;
    this.createConversationUseCaseProvider = createConversationUseCaseProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.userRepositoryProvider = userRepositoryProvider;
    this.conversAIServiceProvider = conversAIServiceProvider;
  }

  @Override
  public ChatViewModel get() {
    return newInstance(textCompletionsWithStreamUseCaseProvider.get(), createMessagesUseCaseProvider.get(), getMessagesUseCaseProvider.get(), createConversationUseCaseProvider.get(), savedStateHandleProvider.get(), userRepositoryProvider.get(), conversAIServiceProvider.get());
  }

  public static ChatViewModel_Factory create(
      Provider<TextCompletionsWithStreamUseCase> textCompletionsWithStreamUseCaseProvider,
      Provider<CreateMessagesUseCase> createMessagesUseCaseProvider,
      Provider<GetMessagesUseCase> getMessagesUseCaseProvider,
      Provider<CreateConversationUseCase> createConversationUseCaseProvider,
      Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<UserRepository> userRepositoryProvider,
      Provider<ConversAIService> conversAIServiceProvider) {
    return new ChatViewModel_Factory(textCompletionsWithStreamUseCaseProvider, createMessagesUseCaseProvider, getMessagesUseCaseProvider, createConversationUseCaseProvider, savedStateHandleProvider, userRepositoryProvider, conversAIServiceProvider);
  }

  public static ChatViewModel newInstance(
      TextCompletionsWithStreamUseCase textCompletionsWithStreamUseCase,
      CreateMessagesUseCase createMessagesUseCase, GetMessagesUseCase getMessagesUseCase,
      CreateConversationUseCase createConversationUseCase, SavedStateHandle savedStateHandle,
      UserRepository userRepository, ConversAIService conversAIService) {
    return new ChatViewModel(textCompletionsWithStreamUseCase, createMessagesUseCase, getMessagesUseCase, createConversationUseCase, savedStateHandle, userRepository, conversAIService);
  }
}
