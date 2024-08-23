package com.aikonia.app.data.repository;

import com.google.firebase.firestore.FirebaseFirestore;
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
public final class FirebaseRepositoryImpl_Factory implements Factory<FirebaseRepositoryImpl> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  public FirebaseRepositoryImpl_Factory(Provider<FirebaseFirestore> firestoreProvider) {
    this.firestoreProvider = firestoreProvider;
  }

  @Override
  public FirebaseRepositoryImpl get() {
    return newInstance(firestoreProvider.get());
  }

  public static FirebaseRepositoryImpl_Factory create(
      Provider<FirebaseFirestore> firestoreProvider) {
    return new FirebaseRepositoryImpl_Factory(firestoreProvider);
  }

  public static FirebaseRepositoryImpl newInstance(FirebaseFirestore firestore) {
    return new FirebaseRepositoryImpl(firestore);
  }
}
