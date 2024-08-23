package com.aikonia.app.ui.language;

import com.aikonia.app.domain.use_case.language.GetCurrentLanguageCodeUseCase;
import com.aikonia.app.domain.use_case.language.SetCurrentLanguageCodeUseCase;
import com.aikonia.app.domain.use_case.language.SetCurrentLanguageUseCase;
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
public final class LanguageViewModel_Factory implements Factory<LanguageViewModel> {
  private final Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider;

  private final Provider<SetCurrentLanguageCodeUseCase> setCurrentLanguageCodeUseCaseProvider;

  private final Provider<SetCurrentLanguageUseCase> setCurrentLanguageUseCaseProvider;

  public LanguageViewModel_Factory(
      Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider,
      Provider<SetCurrentLanguageCodeUseCase> setCurrentLanguageCodeUseCaseProvider,
      Provider<SetCurrentLanguageUseCase> setCurrentLanguageUseCaseProvider) {
    this.getCurrentLanguageCodeUseCaseProvider = getCurrentLanguageCodeUseCaseProvider;
    this.setCurrentLanguageCodeUseCaseProvider = setCurrentLanguageCodeUseCaseProvider;
    this.setCurrentLanguageUseCaseProvider = setCurrentLanguageUseCaseProvider;
  }

  @Override
  public LanguageViewModel get() {
    return newInstance(getCurrentLanguageCodeUseCaseProvider.get(), setCurrentLanguageCodeUseCaseProvider.get(), setCurrentLanguageUseCaseProvider.get());
  }

  public static LanguageViewModel_Factory create(
      Provider<GetCurrentLanguageCodeUseCase> getCurrentLanguageCodeUseCaseProvider,
      Provider<SetCurrentLanguageCodeUseCase> setCurrentLanguageCodeUseCaseProvider,
      Provider<SetCurrentLanguageUseCase> setCurrentLanguageUseCaseProvider) {
    return new LanguageViewModel_Factory(getCurrentLanguageCodeUseCaseProvider, setCurrentLanguageCodeUseCaseProvider, setCurrentLanguageUseCaseProvider);
  }

  public static LanguageViewModel newInstance(
      GetCurrentLanguageCodeUseCase getCurrentLanguageCodeUseCase,
      SetCurrentLanguageCodeUseCase setCurrentLanguageCodeUseCase,
      SetCurrentLanguageUseCase setCurrentLanguageUseCase) {
    return new LanguageViewModel(getCurrentLanguageCodeUseCase, setCurrentLanguageCodeUseCase, setCurrentLanguageUseCase);
  }
}
