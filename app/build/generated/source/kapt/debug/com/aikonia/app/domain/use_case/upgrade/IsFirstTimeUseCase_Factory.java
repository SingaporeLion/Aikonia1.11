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
public final class IsFirstTimeUseCase_Factory implements Factory<IsFirstTimeUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public IsFirstTimeUseCase_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public IsFirstTimeUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static IsFirstTimeUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new IsFirstTimeUseCase_Factory(preferenceRepositoryProvider);
  }

  public static IsFirstTimeUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new IsFirstTimeUseCase(preferenceRepository);
  }
}
