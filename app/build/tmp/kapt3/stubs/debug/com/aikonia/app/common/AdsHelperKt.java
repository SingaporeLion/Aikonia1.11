package com.aikonia.app.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u001a\u0006\u0010\u0010\u001a\u00020\r\u001a\u001c\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0013\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"mInterstitialAd", "Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "getMInterstitialAd", "()Lcom/google/android/gms/ads/interstitial/InterstitialAd;", "setMInterstitialAd", "(Lcom/google/android/gms/ads/interstitial/InterstitialAd;)V", "rewardedAd", "Lcom/google/android/gms/ads/rewarded/RewardedAd;", "getRewardedAd", "()Lcom/google/android/gms/ads/rewarded/RewardedAd;", "setRewardedAd", "(Lcom/google/android/gms/ads/rewarded/RewardedAd;)V", "loadRewarded", "", "context", "Landroid/content/Context;", "removeInterstitial", "showRewarded", "onRewarded", "Lkotlin/Function0;", "app_debug"})
public final class AdsHelperKt {
    @org.jetbrains.annotations.Nullable
    private static com.google.android.gms.ads.interstitial.InterstitialAd mInterstitialAd;
    @org.jetbrains.annotations.Nullable
    private static com.google.android.gms.ads.rewarded.RewardedAd rewardedAd;
    
    @org.jetbrains.annotations.Nullable
    public static final com.google.android.gms.ads.interstitial.InterstitialAd getMInterstitialAd() {
        return null;
    }
    
    public static final void setMInterstitialAd(@org.jetbrains.annotations.Nullable
    com.google.android.gms.ads.interstitial.InterstitialAd p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final com.google.android.gms.ads.rewarded.RewardedAd getRewardedAd() {
        return null;
    }
    
    public static final void setRewardedAd(@org.jetbrains.annotations.Nullable
    com.google.android.gms.ads.rewarded.RewardedAd p0) {
    }
    
    public static final void removeInterstitial() {
    }
    
    public static final void loadRewarded(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    public static final void showRewarded(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onRewarded) {
    }
}