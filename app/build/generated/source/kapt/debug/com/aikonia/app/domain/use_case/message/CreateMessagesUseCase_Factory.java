package com.aikonia.app.domain.use_case.message;

import com.aikonia.app.domain.repository.MessageRepository;
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
public final class CreateMessagesUseCase_Factory implements Factory<CreateMessagesUseCase> {
  private final Provider<MessageRepository> messageRepositoryProvider;

  public CreateMessagesUseCase_Factory(Provider<MessageRepository> messageRepositoryProvider) {
    this.messageRepositoryProvider = messageRepositoryProvider;
  }

  @Override
  public CreateMessagesUseCase get() {
    return newInstance(messageRepositoryProvider.get());
  }

  public static CreateMessagesUseCase_Factory create(
      Provider<MessageRepository> messageRepositoryProvider) {
    return new CreateMessagesUseCase_Factory(messageRepositoryProvider);
  }

  public static CreateMessagesUseCase newInstance(MessageRepository messageRepository) {
    return new CreateMessagesUseCase(messageRepository);
  }
}
