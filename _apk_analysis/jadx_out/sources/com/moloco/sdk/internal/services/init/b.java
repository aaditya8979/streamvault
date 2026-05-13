package com.moloco.sdk.internal.services.init;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f47436a = new b("RequestTimeout", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f47437b = new b("UnknownHostHttpError", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f47438c = new b("HttpSocketError", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f47439d = new b("HttpSslError", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f47440e = new b("PersistentHttpUnavailableError", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f47441f = new b("Unknown", 5);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b[] f47442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kn.a f47443h;

    static {
        b[] bVarArrA = a();
        f47442g = bVarArrA;
        f47443h = kotlin.enums.a.a(bVarArrA);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{f47436a, f47437b, f47438c, f47439d, f47440e, f47441f};
    }

    @NotNull
    public static kn.a<b> b() {
        return f47443h;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f47442g.clone();
    }
}
