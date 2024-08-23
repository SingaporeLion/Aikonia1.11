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
public final class GetDarkModeUseCase_Factory implements Factory<GetDarkModeUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public GetDarkModeUseCase_Factory(Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public GetDarkModeUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static GetDarkModeUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new GetDarkModeUseCase_Factory(preferenceRepositoryProvider);
  }

  public static GetDarkModeUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new GetDarkModeUseCase(preferenceRepository);
  }
}
