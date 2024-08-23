package com.aikonia.app.di;

import com.google.firebase.firestore.FirebaseFirestore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class FirebaseModule_FirestoreInstanceFactory implements Factory<FirebaseFirestore> {
  @Override
  public FirebaseFirestore get() {
    return firestoreInstance();
  }

  public static FirebaseModule_FirestoreInstanceFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseFirestore firestoreInstance() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.firestoreInstance());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_FirestoreInstanceFactory INSTANCE = new FirebaseModule_FirestoreInstanceFactory();
  }
}
