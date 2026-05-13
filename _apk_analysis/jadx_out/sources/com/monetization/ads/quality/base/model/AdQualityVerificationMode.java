package com.monetization.ads.quality.base.model;

import kn.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class AdQualityVerificationMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AdQualityVerificationMode[] $VALUES;
    public static final AdQualityVerificationMode FAST_VERIFICATION;
    public static final AdQualityVerificationMode LONG_VERIFICATION;

    static {
        AdQualityVerificationMode adQualityVerificationMode = new AdQualityVerificationMode(0, "FAST_VERIFICATION");
        FAST_VERIFICATION = adQualityVerificationMode;
        AdQualityVerificationMode adQualityVerificationMode2 = new AdQualityVerificationMode(1, "LONG_VERIFICATION");
        LONG_VERIFICATION = adQualityVerificationMode2;
        AdQualityVerificationMode[] adQualityVerificationModeArr = {adQualityVerificationMode, adQualityVerificationMode2};
        $VALUES = adQualityVerificationModeArr;
        $ENTRIES = kotlin.enums.a.a(adQualityVerificationModeArr);
    }

    private AdQualityVerificationMode(int i10, String str) {
    }

    public static AdQualityVerificationMode valueOf(String str) {
        return (AdQualityVerificationMode) Enum.valueOf(AdQualityVerificationMode.class, str);
    }

    public static AdQualityVerificationMode[] values() {
        return (AdQualityVerificationMode[]) $VALUES.clone();
    }
}
