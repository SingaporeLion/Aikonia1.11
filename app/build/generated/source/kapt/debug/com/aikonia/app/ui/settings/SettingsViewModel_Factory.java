package com.aikonia.app.ui.settings;

import com.aikonia.app.domain.use_case.language.GetCurrentLanguageUseCase;
import com.aikonia.app.domain.use_case.profile.SetDarkModeUseCase;
import com.aikonia.app.domain.use_case.upgrade.IsProVersionUseCase;
import com.aikonia.app.domain.use_case.upgrade.SetProVersionUseCase;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<SetDarkModeUseCase> setDarkModeUseCaseProvider;

  private final Provider<GetCurrentLanguageUseCase> getCurrentLanguageUseCaseProvider;

  private final Provider<IsProVersionUseCase> isProVersionUseCaseProvider;

  private final Provider<SetProVersionUseCase> setProVersionUseCaseProvider;

  public SettingsViewModel_Factory(Provider<SetDarkModeUseCase> setDarkModeUseCaseProvider,
      Provider<GetCurrentLanguageUseCase> getCurrentLanguageUseCaseProvider,
      Provider<IsProVersionUseCase> isProVersionUseCaseProvider,
      Provider<SetProVersionUseCase> setProVersionUseCaseProvider) {
    this.setDarkModeUseCaseProvider = setDarkModeUseCaseProvider;
    this.getCurrentLanguageUseCaseProvider = getCurrentLanguageUseCaseProvider;
    this.isProVersionUseCaseProvider = isProVersionUseCaseProvider;
    this.setProVersionUseCaseProvider = setProVersionUseCaseProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(setDarkModeUseCaseProvider.get(), getCurrentLanguageUseCaseProvider.get(), isProVersionUseCaseProvider.get(), setProVersionUseCaseProvider.get());
  }

  public static SettingsViewModel_Factory create(
      Provider<SetDarkModeUseCase> setDarkModeUseCaseProvider,
      Provider<GetCurrentLanguageUseCase> getCurrentLanguageUseCaseProvider,
      Provider<IsProVersionUseCase> isProVersionUseCaseProvider,
      Provider<SetProVersionUseCase> setProVersionUseCaseProvider) {
    return new SettingsViewModel_Factory(setDarkModeUseCaseProvider, getCurrentLanguageUseCaseProvider, isProVersionUseCaseProvider, setProVersionUseCaseProvider);
  }

  public static SettingsViewModel newInstance(SetDarkModeUseCase setDarkModeUseCase,
      GetCurrentLanguageUseCase getCurrentLanguageUseCase, IsProVersionUseCase isProVersionUseCase,
      SetProVersionUseCase setProVersionUseCase) {
    return new SettingsViewModel(setDarkModeUseCase, getCurrentLanguageUseCase, isProVersionUseCase, setProVersionUseCase);
  }
}
