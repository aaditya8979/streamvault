package com.unity3d.ads.beta;

/* JADX INFO: compiled from: UnityAdsPrivacy.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum UnityAdsPrivacyFlag {
    USER_OVER_AGE_LIMIT(0),
    NON_BEHAVIORAL(1);

    private final int value;

    UnityAdsPrivacyFlag(int i10) {
        this.value = i10;
    }

    public final int getValue() {
        return this.value;
    }
}
