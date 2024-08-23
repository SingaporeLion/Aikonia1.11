package com.aikonia.app.data.repository;

import com.aikonia.app.data.source.local.ConversAIDao;
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
public final class ConversationRepositoryImpl_Factory implements Factory<ConversationRepositoryImpl> {
  private final Provider<ConversAIDao> conversAIDaoProvider;

  public ConversationRepositoryImpl_Factory(Provider<ConversAIDao> conversAIDaoProvider) {
    this.conversAIDaoProvider = conversAIDaoProvider;
  }

  @Override
  public ConversationRepositoryImpl get() {
    return newInstance(conversAIDaoProvider.get());
  }

  public static ConversationRepositoryImpl_Factory create(
      Provider<ConversAIDao> conversAIDaoProvider) {
    return new ConversationRepositoryImpl_Factory(conversAIDaoProvider);
  }

  public static ConversationRepositoryImpl newInstance(ConversAIDao conversAIDao) {
    return new ConversationRepositoryImpl(conversAIDao);
  }
}
