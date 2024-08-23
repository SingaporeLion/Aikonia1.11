package com.aikonia.app.ui.activity;

import com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase;
import com.aikonia.app.domain.use_case.profile.GetDarkModeUseCase;
import com.aikonia.app.domain.use_case.upgrade.SetFirstTimeUseCase;
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
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<GetDarkModeUseCase> getDarkModeUseCaseProvider;

  private final Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider;

  private final Provider<SetFirstTimeUseCase> setFirstTimeUseCaseProvider;

  public MainActivityViewModel_Factory(Provider<GetDarkModeUseCase> getDarkModeUseCaseProvider,
      Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider,
      Provider<SetFirstTimeUseCase> setFirstTimeUseCaseProvider) {
    this.getDarkModeUseCaseProvider = getDarkModeUseCaseProvider;
    this.getCurrentLanguageCodeUseCaseProvider = getCurrentLanguageCodeUseCaseProvider;
    this.setFirstTimeUseCaseProvider = setFirstTimeUseCaseProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(getDarkModeUseCaseProvider.get(), getCurrentLanguageCodeUseCaseProvider.get(), setFirstTimeUseCaseProvider.get());
  }

  public static MainActivityViewModel_Factory create(
      Provider<GetDarkModeUseCase> getDarkModeUseCaseProvider,
      Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider,
      Provider<SetFirstTimeUseCase> setFirstTimeUseCaseProvider) {
    return new MainActivityViewModel_Factory(getDarkModeUseCaseProvider, getCurrentLanguageCodeUseCaseProvider, setFirstTimeUseCaseProvider);
  }

  public static MainActivityViewModel newInstance(GetDarkModeUseCase getDarkModeUseCase,
      GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase,
      SetFirstTimeUseCase setFirstTimeUseCase) {
    return new MainActivityViewModel(getDarkModeUseCase, getCurrentLanguageCodeUseCase, setFirstTimeUseCase);
  }
}
