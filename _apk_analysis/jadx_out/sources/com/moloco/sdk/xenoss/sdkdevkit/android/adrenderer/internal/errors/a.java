package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f48036a = new a("STATIC_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48037b = new a("VAST_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48038c = new a("MRAID_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48039d = new a("NATIVE_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f48040e = new a("VAST_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f48041f = new a("MRAID_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f48042g = new a("STATIC_FULLSCREEN_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f48043h = new a("VAST_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f48044i = new a("MRAID_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f48045j = new a("STATIC_BANNER_AD_LOAD_INTERNAL_TIMEOUT_ERROR", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a[] f48046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48047l;

    static {
        a[] aVarArrB = b();
        f48046k = aVarArrB;
        f48047l = kotlin.enums.a.a(aVarArrB);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] b() {
        return new a[]{f48036a, f48037b, f48038c, f48039d, f48040e, f48041f, f48042g, f48043h, f48044i, f48045j};
    }

    @NotNull
    public static kn.a<a> c() {
        return f48047l;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48046k.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
