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
public final class SetProVersionUseCase_Factory implements Factory<SetProVersionUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public SetProVersionUseCase_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SetProVersionUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SetProVersionUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new SetProVersionUseCase_Factory(preferenceRepositoryProvider);
  }

  public static SetProVersionUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new SetProVersionUseCase(preferenceRepository);
  }
}
