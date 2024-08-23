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
public final class SetCurrentLanguageUseCase_Factory implements Factory<SetCurrentLanguageUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public SetCurrentLanguageUseCase_Factory(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SetCurrentLanguageUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SetCurrentLanguageUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new SetCurrentLanguageUseCase_Factory(preferenceRepositoryProvider);
  }

  public static SetCurrentLanguageUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new SetCurrentLanguageUseCase(preferenceRepository);
  }
}
