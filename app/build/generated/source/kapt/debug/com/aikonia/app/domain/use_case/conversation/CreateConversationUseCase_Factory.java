package com.aikonia.app.domain.use_case.conversation;

import com.aikonia.app.domain.repository.ConversationRepository;
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
public final class CreateConversationUseCase_Factory implements Factory<CreateConversationUseCase> {
  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public CreateConversationUseCase_Factory(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  @Override
  public CreateConversationUseCase get() {
    return newInstance(conversationRepositoryProvider.get());
  }

  public static CreateConversationUseCase_Factory create(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new CreateConversationUseCase_Factory(conversationRepositoryProvider);
  }

  public static CreateConversationUseCase newInstance(
      ConversationRepository conversationRepository) {
    return new CreateConversationUseCase(conversationRepository);
  }
}
