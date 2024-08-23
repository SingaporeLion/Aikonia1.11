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
public final class DeleteConversationUseCase_Factory implements Factory<DeleteConversationUseCase> {
  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public DeleteConversationUseCase_Factory(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  @Override
  public DeleteConversationUseCase get() {
    return newInstance(conversationRepositoryProvider.get());
  }

  public static DeleteConversationUseCase_Factory create(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new DeleteConversationUseCase_Factory(conversationRepositoryProvider);
  }

  public static DeleteConversationUseCase newInstance(
      ConversationRepository conversationRepository) {
    return new DeleteConversationUseCase(conversationRepository);
  }
}
