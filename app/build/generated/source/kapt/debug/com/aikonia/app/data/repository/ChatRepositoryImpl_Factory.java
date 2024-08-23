package com.aikonia.app.data.repository;

import com.aikonia.app.data.source.remote.ConversAIService;
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
public final class ChatRepositoryImpl_Factory implements Factory<ChatRepositoryImpl> {
  private final Provider<ConversAIService> conversAIServiceProvider;

  public ChatRepositoryImpl_Factory(Provider<ConversAIService> conversAIServiceProvider) {
    this.conversAIServiceProvider = conversAIServiceProvider;
  }

  @Override
  public ChatRepositoryImpl get() {
    return newInstance(conversAIServiceProvider.get());
  }

  public static ChatRepositoryImpl_Factory create(
      Provider<ConversAIService> conversAIServiceProvider) {
    return new ChatRepositoryImpl_Factory(conversAIServiceProvider);
  }

  public static ChatRepositoryImpl newInstance(ConversAIService conversAIService) {
    return new ChatRepositoryImpl(conversAIService);
  }
}
