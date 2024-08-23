package com.aikonia.app.domain.use_case.message;

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
public final class GetFreeMessageCountUseCase_Factory implements Factory<GetFreeMessageCountUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public GetFreeMessageCountUseCase_Factory(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public GetFreeMessageCountUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static GetFreeMessageCountUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new GetFreeMessageCountUseCase_Factory(preferenceRepositoryProvider);
  }

  public static GetFreeMessageCountUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new GetFreeMessageCountUseCase(preferenceRepository);
  }
}
