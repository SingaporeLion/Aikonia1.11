package com.aikonia.app.ui.activity;

import com.aikonia.app.data.source.local.UserRepository;
import com.aikonia.app.domain.repository.ConversationRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<UserRepository> userRepositoryProvider;

  private final Provider<ConversationRepository> conversationRepositoryProvider;

  public MainActivity_MembersInjector(Provider<UserRepository> userRepositoryProvider,
      Provider<ConversationRepository> conversationRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
    this.conversationRepositoryProvider = conversationRepositoryProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<UserRepository> userRepositoryProvider,
      Provider<ConversationRepository> conversationRepositoryProvider) {
    return new MainActivity_MembersInjector(userRepositoryProvider, conversationRepositoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectUserRepository(instance, userRepositoryProvider.get());
    injectConversationRepository(instance, conversationRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.aikonia.app.ui.activity.MainActivity.userRepository")
  public static void injectUserRepository(MainActivity instance, UserRepository userRepository) {
    instance.userRepository = userRepository;
  }

  @InjectedFieldSignature("com.aikonia.app.ui.activity.MainActivity.conversationRepository")
  public static void injectConversationRepository(MainActivity instance,
      ConversationRepository conversationRepository) {
    instance.conversationRepository = conversationRepository;
  }
}
