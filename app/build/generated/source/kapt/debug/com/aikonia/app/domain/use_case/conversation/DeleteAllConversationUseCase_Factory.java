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
public final class DeleteAllConversationUseCase_Factory implements Factory<DeleteAllConversationUseCase> {
  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public DeleteAllConversationUseCase_Factory(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  @Override
  public DeleteAllConversationUseCase get() {
    return newInstance(conversationRepositoryProvider.get());
  }

  public static DeleteAllConversationUseCase_Factory create(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new DeleteAllConversationUseCase_Factory(conversationRepositoryProvider);
  }

  public static DeleteAllConversationUseCase newInstance(
      ConversationRepository conversationRepository) {
    return new DeleteAllConversationUseCase(conversationRepository);
  }
}
