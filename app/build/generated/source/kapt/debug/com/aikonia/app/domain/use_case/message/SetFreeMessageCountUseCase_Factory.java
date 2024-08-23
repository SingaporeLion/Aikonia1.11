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
public final class SetFreeMessageCountUseCase_Factory implements Factory<SetFreeMessageCountUseCase> {
  private final Provider<PreferenceRepository> preferenceRepositoryProvider;

  public SetFreeMessageCountUseCase_Factory(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    this.preferenceRepositoryProvider = preferenceRepositoryProvider;
  }

  @Override
  public SetFreeMessageCountUseCase get() {
    return newInstance(preferenceRepositoryProvider.get());
  }

  public static SetFreeMessageCountUseCase_Factory create(
      Provider<PreferenceRepository> preferenceRepositoryProvider) {
    return new SetFreeMessageCountUseCase_Factory(preferenceRepositoryProvider);
  }

  public static SetFreeMessageCountUseCase newInstance(PreferenceRepository preferenceRepository) {
    return new SetFreeMessageCountUseCase(preferenceRepository);
  }
}
