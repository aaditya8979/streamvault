package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f48430b = new r("Inline", 0, "inline");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f48431c = new r("Interstitial", 1, "interstitial");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ r[] f48432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48433e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f48434a;

    static {
        r[] rVarArrA = a();
        f48432d = rVarArrA;
        f48433e = kotlin.enums.a.a(rVarArrA);
    }

    public r(String str, int i10, String str2) {
        this.f48434a = str2;
    }

    public static final /* synthetic */ r[] a() {
        return new r[]{f48430b, f48431c};
    }

    @NotNull
    public static kn.a<r> b() {
        return f48433e;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f48432d.clone();
    }

    @NotNull
    public final String c() {
        return this.f48434a;
    }
}
