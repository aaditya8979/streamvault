package com.unity3d.ads.core.data.model;

import com.unity3d.ads.UnityAds;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Listeners.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface Listeners {

    /* JADX INFO: compiled from: Listeners.kt */
    public static final class DefaultImpls {
        public static void onClick(@NotNull Listeners listeners, @NotNull String str) {
            p.k(str, "placementId");
        }

        public static void onComplete(@NotNull Listeners listeners, @NotNull String str, @NotNull UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            p.k(str, "placementId");
            p.k(unityAdsShowCompletionState, "state");
        }

        public static void onError(@NotNull Listeners listeners, @NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2) {
            p.k(str, "placementId");
            p.k(unityAdsShowError, "error");
            p.k(str2, "message");
        }

        public static void onLeftApplication(@NotNull Listeners listeners, @NotNull String str) {
            p.k(str, "placementId");
        }

        public static void onStart(@NotNull Listeners listeners, @NotNull String str) {
            p.k(str, "placementId");
        }
    }

    void onClick(@NotNull String str);

    void onComplete(@NotNull String str, @NotNull UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState);

    void onError(@NotNull String str, @NotNull UnityAds.UnityAdsShowError unityAdsShowError, @NotNull String str2);

    void onLeftApplication(@NotNull String str);

    void onStart(@NotNull String str);
}
