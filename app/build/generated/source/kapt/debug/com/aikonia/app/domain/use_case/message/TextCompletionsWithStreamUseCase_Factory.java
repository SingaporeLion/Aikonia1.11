package com.aikonia.app.domain.use_case.message;

import com.aikonia.app.domain.repository.ChatRepository;
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
public final class TextCompletionsWithStreamUseCase_Factory implements Factory<TextCompletionsWithStreamUseCase> {
  private final Provider<ChatRepository> chatRepositoryProvider;

  public TextCompletionsWithStreamUseCase_Factory(Provider<ChatRepository> chatRepositoryProvider) {
    this.chatRepositoryProvider = chatRepositoryProvider;
  }

  @Override
  public TextCompletionsWithStreamUseCase get() {
    return newInstance(chatRepositoryProvider.get());
  }

  public static TextCompletionsWithStreamUseCase_Factory create(
      Provider<ChatRepository> chatRepositoryProvider) {
    return new TextCompletionsWithStreamUseCase_Factory(chatRepositoryProvider);
  }

  public static TextCompletionsWithStreamUseCase newInstance(ChatRepository chatRepository) {
    return new TextCompletionsWithStreamUseCase(chatRepository);
  }
}
