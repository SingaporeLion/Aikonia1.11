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
public final class SetCurrentLanguageCodeUseCase_Factory implements Factory<SetCurrentLanguageCodeUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public SetCurrentLanguageCodeUseCase_Factory(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SetCurrentLanguageCodeUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SetCurrentLanguageCodeUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new SetCurrentLanguageCodeUseCase_Factory(preferenceRepositoryProvider);
  }

  public static SetCurrentLanguageCodeUseCase newInstance(
      PreferenceRepository preferenceRepository) {
    return new SetCurrentLanguageCodeUseCase(preferenceRepository);
  }
}
