package com.aikonia.app.domain.use_case.app;

import com.aikonia.app.domain.repository.FirebaseRepository;
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
public final class IsThereUpdateUseCase_Factory implements Factory<IsThereUpdateUseCase> {
  private final Provider<FirebaseRepository> firebaseRepositoryProvider;

  public IsThereUpdateUseCase_Factory(Provider<FirebaseRepository> firebaseRepositoryProvider) {
    this.firebaseRepositoryProvider = firebaseRepositoryProvider;
  }

  @Override
  public IsThereUpdateUseCase get() {
    return newInstance(firebaseRepositoryProvider.get());
  }

  public static IsThereUpdateUseCase_Factory create(
      Provider<FirebaseRepository> firebaseRepositoryProvider) {
    return new IsThereUpdateUseCase_Factory(firebaseRepositoryProvider);
  }

  public static IsThereUpdateUseCase newInstance(FirebaseRepository firebaseRepository) {
    return new IsThereUpdateUseCase(firebaseRepository);
  }
}
