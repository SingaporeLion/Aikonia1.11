package com.aikonia.app.ui.history;

import com.aikonia.app.domain.use_case.conversation.DeleteAllConversationUseCase;
import com.aikonia.app.domain.use_case.conversation.DeleteConversationUseCase;
import com.aikonia.app.domain.use_case.conversation.GetConversationsUseCase;
import com.aikonia.app.domain.use_case.profile.GetDarkModeUseCase;
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
public final class HistoryViewModel_Factory implements Factory<HistoryViewModel> {
  private final Provider<GetConversationsUseCase> getConversationsUseCaseProvider;

  private final Provider<DeleteConversationUseCase> deleteConversationUseCaseProvider;

  private final Provider<DeleteAllConversationUseCase> deleteAllConversationUseCaseProvider;

  private final Provider<GetDarkModeUseCase> getDarkModeUseCaseProvider;

  public HistoryViewModel_Factory(Provider<GetConversationsUseCase> getConversationsUseCaseProvider,
      Provider<DeleteConversationUseCase> deleteConversationUseCaseProvider,
      Provider<DeleteAllConversationUseCase> deleteAllConversationUseCaseProvider,
      Provider<GetDarkModeUseCase> getDarkModeUseCaseProvider) {
    this.getConversationsUseCaseProvider = getConversationsUseCaseProvider;
    this.deleteConversationUseCaseProvider = deleteConversationUseCaseProvider;
    this.deleteAllConversationUseCaseProvider = deleteAllConversationUseCaseProvider;
    this.getDarkModeUseCaseProvider = getDarkModeUseCaseProvider;
  }

  @Override
  public HistoryViewModel get() {
    return newInstance(getConversationsUseCaseProvider.get(), deleteConversationUseCaseProvider.get(), deleteAllConversationUseCaseProvider.get(), getDarkModeUseCaseProvider.get());
  }

  public static HistoryViewModel_Factory create(
      Provider<GetConversationsUseCase> getConversationsUseCaseProvider,
      Provider<DeleteConversationUseCase> deleteConversationUseCaseProvider,
      Provider<DeleteAllConversationUseCase> deleteAllConversationUseCaseProvider,
      Provider<GetDarkModeUseCase> getDarkModeUseCaseProvider) {
    return new HistoryViewModel_Factory(getConversationsUseCaseProvider, deleteConversationUseCaseProvider, deleteAllConversationUseCaseProvider, getDarkModeUseCaseProvider);
  }

  public static HistoryViewModel newInstance(GetConversationsUseCase getConversationsUseCase,
      DeleteConversationUseCase deleteConversationUseCase,
      DeleteAllConversationUseCase deleteAllConversationUseCase,
      GetDarkModeUseCase getDarkModeUseCase) {
    return new HistoryViewModel(getConversationsUseCase, deleteConversationUseCase, deleteAllConversationUseCase, getDarkModeUseCase);
  }
}
