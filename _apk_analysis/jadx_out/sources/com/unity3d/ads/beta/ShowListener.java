package com.unity3d.ads.beta;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ShowListener.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface ShowListener<UnityAd> {
    void showClick(UnityAd unityad);

    void showComplete(UnityAd unityad, @NotNull ShowFinishState showFinishState);

    void showFailed(UnityAd unityad, @NotNull UnityAdsError unityAdsError);

    void showImpression(UnityAd unityad);

    void showStart(UnityAd unityad);
}
