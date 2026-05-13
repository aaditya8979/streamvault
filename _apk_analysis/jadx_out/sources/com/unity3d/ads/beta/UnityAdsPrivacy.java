package com.unity3d.ads.beta;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UnityAdsPrivacy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UnityAdsPrivacy {
    public static final void set(@NotNull UnityAdsPrivacyConsent unityAdsPrivacyConsent, @NotNull UnityAdsPrivacyConsentValue unityAdsPrivacyConsentValue) {
        p.k(unityAdsPrivacyConsent, "consent");
        p.k(unityAdsPrivacyConsentValue, "value");
    }

    public static final void set(@NotNull UnityAdsPrivacyFlag unityAdsPrivacyFlag, @NotNull UnityAdsPrivacyValue unityAdsPrivacyValue) {
        p.k(unityAdsPrivacyFlag, "privacy");
        p.k(unityAdsPrivacyValue, "value");
    }

    public static final void setPrivacy(@NotNull String str, @NotNull UnityAdsPrivacyConsentValue unityAdsPrivacyConsentValue) {
        p.k(str, "flag");
        p.k(unityAdsPrivacyConsentValue, "value");
    }

    public static final void setPrivacy(@NotNull String str, @NotNull UnityAdsPrivacyValue unityAdsPrivacyValue) {
        p.k(str, "flag");
        p.k(unityAdsPrivacyValue, "consent");
    }
}
