package com.aikonia.app.di;

import android.content.Context;
import com.aikonia.app.data.source.local.ConversAIDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomDbModule_ProvideRoomDbFactory implements Factory<ConversAIDatabase> {
  private final RoomDbModule module;

  private final Provider<Context> appContextProvider;

  public RoomDbModule_ProvideRoomDbFactory(RoomDbModule module,
      Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public ConversAIDatabase get() {
    return provideRoomDb(module, appContextProvider.get());
  }

  public static RoomDbModule_ProvideRoomDbFactory create(RoomDbModule module,
      Provider<Context> appContextProvider) {
    return new RoomDbModule_ProvideRoomDbFactory(module, appContextProvider);
  }

  public static ConversAIDatabase provideRoomDb(RoomDbModule instance, Context appContext) {
    return Preconditions.checkNotNullFromProvides(instance.provideRoomDb(appContext));
  }
}
