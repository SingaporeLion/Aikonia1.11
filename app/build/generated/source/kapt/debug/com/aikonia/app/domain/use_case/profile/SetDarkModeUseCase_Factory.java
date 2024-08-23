package com.aikonia.app.domain.use_case.profile;

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
public final class SetDarkModeUseCase_Factory implements Factory<SetDarkModeUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public SetDarkModeUseCase_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SetDarkModeUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SetDarkModeUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new SetDarkModeUseCase_Factory(preferenceRepositoryProvider);
  }

  public static SetDarkModeUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new SetDarkModeUseCase(preferenceRepository);
  }
}
