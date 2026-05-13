package com.moloco.sdk.internal.publisher;

import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f46960a = new s("BANNER", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f46961b = new s("BANNER_TABLET", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f46962c = new s(BrandSafetyUtils.f51658o, 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s f46963d = new s("NATIVE_AD_MEDIATION", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s f46964e = new s("NATIVE_BANNER", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final s f46965f = new s("INTERSTITIAL", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final s f46966g = new s(BrandSafetyUtils.f51654k, 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ s[] f46967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kn.a f46968i;

    static {
        s[] sVarArrA = a();
        f46967h = sVarArrA;
        f46968i = kotlin.enums.a.a(sVarArrA);
    }

    public s(String str, int i10) {
    }

    public static final /* synthetic */ s[] a() {
        return new s[]{f46960a, f46961b, f46962c, f46963d, f46964e, f46965f, f46966g};
    }

    @NotNull
    public static kn.a<s> b() {
        return f46968i;
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f46967h.clone();
    }
}
