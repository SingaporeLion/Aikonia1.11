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
public final class SetFirstTimeUseCase_Factory implements Factory<SetFirstTimeUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public SetFirstTimeUseCase_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SetFirstTimeUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SetFirstTimeUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new SetFirstTimeUseCase_Factory(preferenceRepositoryProvider);
  }

  public static SetFirstTimeUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new SetFirstTimeUseCase(preferenceRepository);
  }
}
