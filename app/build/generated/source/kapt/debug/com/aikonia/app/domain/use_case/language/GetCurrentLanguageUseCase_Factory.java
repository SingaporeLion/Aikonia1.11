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
public final class GetCurrentLanguageUseCase_Factory implements Factory<GetCurrentLanguageUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public GetCurrentLanguageUseCase_Factory(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public GetCurrentLanguageUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static GetCurrentLanguageUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new GetCurrentLanguageUseCase_Factory(preferenceRepositoryProvider);
  }

  public static GetCurrentLanguageUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new GetCurrentLanguageUseCase(preferenceRepository);
  }
}
