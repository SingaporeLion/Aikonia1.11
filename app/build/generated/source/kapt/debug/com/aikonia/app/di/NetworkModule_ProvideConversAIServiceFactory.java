package com.aikonia.app.di;

import com.aikonia.app.data.source.remote.ConversAIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideConversAIServiceFactory implements Factory<ConversAIService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvideConversAIServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ConversAIService get() {
    return provideConversAIService(retrofitProvider.get());
  }

  public static NetworkModule_ProvideConversAIServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvideConversAIServiceFactory(retrofitProvider);
  }

  public static ConversAIService provideConversAIService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideConversAIService(retrofit));
  }
}
