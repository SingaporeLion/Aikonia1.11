package com.aikonia.app.ui.startchat;

import android.content.SharedPreferences;
import com.aikonia.app.data.source.local.UserRepository;
import com.aikonia.app.domain.use_case.app.IsThereUpdateUseCase;
import com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase;
import com.aikonia.app.domain.use_case.upgrade.IsProVersionUseCase;
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
public final class StartChatViewModel_Factory implements Factory<StartChatViewModel> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<IsProVersionUseCase> isProVersionUseCaseProvider;

  private final Provider<IsThereUpdateUseCase> isThereUpdateUseCaseProvider;

  private final Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public StartChatViewModel_Factory(Provider<UserRepository> userRepositoryProvider,
      Provider<IsProVersionUseCase> isProVersionUseCaseProvider,
      Provider<IsThereUpdateUseCase> isThereUpdateUseCaseProvider,
      Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.isProVersionUseCaseProvider = isProVersionUseCaseProvider;
    this.isThereUpdateUseCaseProvider = isThereUpdateUseCaseProvider;
    this.getCurrentLanguageCodeUseCaseProvider = getCurrentLanguageCodeUseCaseProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public StartChatViewModel get() {
    return newInstance(userRepositoryProvider.get(), isProVersionUseCaseProvider.get(), isThereUpdateUseCaseProvider.get(), getCurrentLanguageCodeUseCaseProvider.get(), sharedPreferencesProvider.get());
  }

  public static StartChatViewModel_Factory create(Provider<UserRepository> userRepositoryProvider,
      Provider<IsProVersionUseCase> isProVersionUseCaseProvider,
      Provider<IsThereUpdateUseCase> isThereUpdateUseCaseProvider,
      Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new StartChatViewModel_Factory(userRepositoryProvider, isProVersionUseCaseProvider, isThereUpdateUseCaseProvider, getCurrentLanguageCodeUseCaseProvider, sharedPreferencesProvider);
  }

  public static StartChatViewModel newInstance(UserRepository userRepository,
      IsProVersionUseCase isProVersionUseCase, IsThereUpdateUseCase isThereUpdateUseCase,
      GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase,
      SharedPreferences sharedPreferences) {
    return new StartChatViewModel(userRepository, isProVersionUseCase, isThereUpdateUseCase, getCurrentLanguageCodeUseCase, sharedPreferences);
  }
}
