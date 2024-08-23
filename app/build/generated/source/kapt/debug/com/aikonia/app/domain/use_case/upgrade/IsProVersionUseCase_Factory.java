package com.aikonia.app.domain.use_case.upgrade;

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
public final class IsProVersionUseCase_Factory implements Factory<IsProVersionUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public IsProVersionUseCase_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public IsProVersionUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static IsProVersionUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new IsProVersionUseCase_Factory(preferenceRepositoryProvider);
  }

  public static IsProVersionUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new IsProVersionUseCase(preferenceRepository);
  }
}
