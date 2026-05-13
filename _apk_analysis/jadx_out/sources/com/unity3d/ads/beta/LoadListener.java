package com.unity3d.ads.beta;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoadListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface LoadListener<UnityAd> {
    void onAdLoaded(@Nullable UnityAd unityad, @Nullable UnityAdsError unityAdsError);
}
