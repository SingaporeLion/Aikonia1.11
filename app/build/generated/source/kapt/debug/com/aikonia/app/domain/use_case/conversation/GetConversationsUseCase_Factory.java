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
public final class GetConversationsUseCase_Factory implements Factory<GetConversationsUseCase> {
  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public GetConversationsUseCase_Factory(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  @Override
  public GetConversationsUseCase get() {
    return newInstance(conversationRepositoryProvider.get());
  }

  public static GetConversationsUseCase_Factory create(
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new GetConversationsUseCase_Factory(conversationRepositoryProvider);
  }

  public static GetConversationsUseCase newInstance(ConversationRepository conversationRepository) {
    return new GetConversationsUseCase(conversationRepository);
  }
}
