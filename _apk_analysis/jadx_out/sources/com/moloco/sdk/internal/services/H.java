package com.moloco.sdk.internal.services;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final H f47101a = new H("UNKNOWN", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H f47102b = new H("PORTRAIT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final H f47103c = new H("LANDSCAPE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ H[] f47104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kn.a f47105e;

    static {
        H[] hArrA = a();
        f47104d = hArrA;
        f47105e = kotlin.enums.a.a(hArrA);
    }

    public H(String str, int i10) {
    }

    public static final /* synthetic */ H[] a() {
        return new H[]{f47101a, f47102b, f47103c};
    }

    @NotNull
    public static kn.a<H> b() {
        return f47105e;
    }

    public static H valueOf(String str) {
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) f47104d.clone();
    }
}
