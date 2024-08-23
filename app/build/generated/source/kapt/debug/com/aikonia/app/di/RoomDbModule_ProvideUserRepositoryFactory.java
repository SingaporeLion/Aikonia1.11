package com.aikonia.app.di;

import android.content.SharedPreferences;
import com.aikonia.app.data.source.local.UserDao;
import com.aikonia.app.data.source.local.UserRepository;
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
public final class RoomDbModule_ProvideUserRepositoryFactory implements Factory<UserRepository> {
  private final RoomDbModule module;

  private final Provider<UserDao> userDaoProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public RoomDbModule_ProvideUserRepositoryFactory(RoomDbModule module,
      Provider<UserDao> userDaoProvider, Provider<SharedPreferences> sharedPreferencesProvider) {
    this.module = module;
    this.userDaoProvider = userDaoProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public UserRepository get() {
    return provideUserRepository(module, userDaoProvider.get(), sharedPreferencesProvider.get());
  }

  public static RoomDbModule_ProvideUserRepositoryFactory create(RoomDbModule module,
      Provider<UserDao> userDaoProvider, Provider<SharedPreferences> sharedPreferencesProvider) {
    return new RoomDbModule_ProvideUserRepositoryFactory(module, userDaoProvider, sharedPreferencesProvider);
  }

  public static UserRepository provideUserRepository(RoomDbModule instance, UserDao userDao,
      SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserRepository(userDao, sharedPreferences));
  }
}
