package com.aikonia.app.data.repository;

import android.app.Application;
import android.content.SharedPreferences;
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
public final class PreferenceRepositoryImpl_Factory implements Factory<PreferenceRepositoryImpl> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<Application> appProvider;

  public PreferenceRepositoryImpl_Factory(Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<Application> appProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.appProvider = appProvider;
  }

  @Override
  public PreferenceRepositoryImpl get() {
    return newInstance(sharedPreferencesProvider.get(), appProvider.get());
  }

  public static PreferenceRepositoryImpl_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider, Provider<Application> appProvider) {
    return new PreferenceRepositoryImpl_Factory(sharedPreferencesProvider, appProvider);
  }

  public static PreferenceRepositoryImpl newInstance(SharedPreferences sharedPreferences,
      Application app) {
    return new PreferenceRepositoryImpl(sharedPreferences, app);
  }
}
