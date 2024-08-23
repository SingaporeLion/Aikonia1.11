package com.aikonia.app.ui.upgrade;

import com.aikonia.app.domain.use_case.upgrade.SetProVersionUseCase;
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
public final class UpgradeViewModel_Factory implements Factory<UpgradeViewModel> {
  private final Provider<SetProVersionUseCase> setProVersionUseCaseProvider;

  public UpgradeViewModel_Factory(Provider<SetProVersionUseCase> setProVersionUseCaseProvider) {
    this.setProVersionUseCaseProvider = setProVersionUseCaseProvider;
  }

  @Override
  public UpgradeViewModel get() {
    return newInstance(setProVersionUseCaseProvider.get());
  }

  public static UpgradeViewModel_Factory create(
      Provider<SetProVersionUseCase> setProVersionUseCaseProvider) {
    return new UpgradeViewModel_Factory(setProVersionUseCaseProvider);
  }

  public static UpgradeViewModel newInstance(SetProVersionUseCase setProVersionUseCase) {
    return new UpgradeViewModel(setProVersionUseCase);
  }
}
