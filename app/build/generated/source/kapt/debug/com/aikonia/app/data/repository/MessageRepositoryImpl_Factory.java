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
public final class MessageRepositoryImpl_Factory implements Factory<MessageRepositoryImpl> {
  private final Provider<ConversAIDao> conversAIDaoProvider;

  public MessageRepositoryImpl_Factory(Provider<ConversAIDao> conversAIDaoProvider) {
    this.conversAIDaoProvider = conversAIDaoProvider;
  }

  @Override
  public MessageRepositoryImpl get() {
    return newInstance(conversAIDaoProvider.get());
  }

  public static MessageRepositoryImpl_Factory create(Provider<ConversAIDao> conversAIDaoProvider) {
    return new MessageRepositoryImpl_Factory(conversAIDaoProvider);
  }

  public static MessageRepositoryImpl newInstance(ConversAIDao conversAIDao) {
    return new MessageRepositoryImpl(conversAIDao);
  }
}
