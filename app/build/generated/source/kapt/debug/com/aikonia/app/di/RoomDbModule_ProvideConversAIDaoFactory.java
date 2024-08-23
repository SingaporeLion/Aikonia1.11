package com.aikonia.app.di;

import com.aikonia.app.data.source.local.ConversAIDao;
import com.aikonia.app.data.source.local.ConversAIDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class RoomDbModule_ProvideConversAIDaoFactory implements Factory<ConversAIDao> {
  private final RoomDbModule module;

  private final Provider<ConversAIDatabase> conversAIDatabaseProvider;

  public RoomDbModule_ProvideConversAIDaoFactory(RoomDbModule module,
      Provider<ConversAIDatabase> conversAIDatabaseProvider) {
    this.module = module;
    this.conversAIDatabaseProvider = conversAIDatabaseProvider;
  }

  @Override
  public ConversAIDao get() {
    return provideConversAIDao(module, conversAIDatabaseProvider.get());
  }

  public static RoomDbModule_ProvideConversAIDaoFactory create(RoomDbModule module,
      Provider<ConversAIDatabase> conversAIDatabaseProvider) {
    return new RoomDbModule_ProvideConversAIDaoFactory(module, conversAIDatabaseProvider);
  }

  public static ConversAIDao provideConversAIDao(RoomDbModule instance,
      ConversAIDatabase conversAIDatabase) {
    return Preconditions.checkNotNullFromProvides(instance.provideConversAIDao(conversAIDatabase));
  }
}
