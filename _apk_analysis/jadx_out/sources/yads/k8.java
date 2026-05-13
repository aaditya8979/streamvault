package yads;

import com.monetization.ads.quality.base.model.AdQualityVerificationMode;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f91507a;

    static {
        int[] iArr = new int[AdQualityVerificationMode.values().length];
        try {
            iArr[AdQualityVerificationMode.FAST_VERIFICATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AdQualityVerificationMode.LONG_VERIFICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f91507a = iArr;
    }
}
