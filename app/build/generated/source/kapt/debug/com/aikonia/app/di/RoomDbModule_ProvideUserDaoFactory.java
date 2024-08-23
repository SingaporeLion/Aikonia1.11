package com.aikonia.app.di;

import com.aikonia.app.data.source.local.ConversAIDatabase;
import com.aikonia.app.data.source.local.UserDao;
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
public final class RoomDbModule_ProvideUserDaoFactory implements Factory<UserDao> {
  private final RoomDbModule module;

  private final Provider<ConversAIDatabase> dbProvider;

  public RoomDbModule_ProvideUserDaoFactory(RoomDbModule module,
      Provider<ConversAIDatabase> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public UserDao get() {
    return provideUserDao(module, dbProvider.get());
  }

  public static RoomDbModule_ProvideUserDaoFactory create(RoomDbModule module,
      Provider<ConversAIDatabase> dbProvider) {
    return new RoomDbModule_ProvideUserDaoFactory(module, dbProvider);
  }

  public static UserDao provideUserDao(RoomDbModule instance, ConversAIDatabase db) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserDao(db));
  }
}
