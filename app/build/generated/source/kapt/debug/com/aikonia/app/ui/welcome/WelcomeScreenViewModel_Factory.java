package com.aikonia.app.ui.welcome;

import com.aikonia.app.data.source.local.UserRepository;
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
public final class WelcomeScreenViewModel_Factory implements Factory<WelcomeScreenViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  public WelcomeScreenViewModel_Factory(Provider<UserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public WelcomeScreenViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static WelcomeScreenViewModel_Factory create(
      Provider<UserRepository> userRepositoryProvider) {
    return new WelcomeScreenViewModel_Factory(userRepositoryProvider);
  }

  public static WelcomeScreenViewModel newInstance(UserRepository userRepository) {
    return new WelcomeScreenViewModel(userRepository);
  }
}
