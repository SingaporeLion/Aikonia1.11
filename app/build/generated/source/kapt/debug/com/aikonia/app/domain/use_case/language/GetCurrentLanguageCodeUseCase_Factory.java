package com.aikonia.app.domain.use_case.language;

import com.aikonia.app.domain.repository.PreferenceRepository;
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
public final class GetCurrentLanguageCodeUseCase_Factory implements Factory<GetCurrentLanguageCodeUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public GetCurrentLanguageCodeUseCase_Factory(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public GetCurrentLanguageCodeUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static GetCurrentLanguageCodeUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new GetCurrentLanguageCodeUseCase_Factory(preferenceRepositoryProvider);
  }

  public static GetCurrentLanguageCodeUseCase newInstance(
      PreferenceRepository preferenceRepository) {
    return new GetCurrentLanguageCodeUseCase(preferenceRepository);
  }
}
