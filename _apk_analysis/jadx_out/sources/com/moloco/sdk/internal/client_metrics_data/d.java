package com.moloco.sdk.internal.client_metrics_data;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f45969b = new d("Reason", 0, "reason");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f45970c = new d("AdType", 1, "ad_type");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f45971d = new d("Result", 2, "result");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f45972e = new d("Country", 3, "country");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f45973f = new d("RetryAttempt", 4, "attempt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f45974g = new d("Step", 5, "step");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f45975h = new d("CreativeType", 6, "creative_type");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ d[] f45976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kn.a f45977j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f45978a;

    static {
        d[] dVarArrA = a();
        f45976i = dVarArrA;
        f45977j = kotlin.enums.a.a(dVarArrA);
    }

    public d(String str, int i10, String str2) {
        this.f45978a = str2;
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{f45969b, f45970c, f45971d, f45972e, f45973f, f45974g, f45975h};
    }

    @NotNull
    public static kn.a<d> b() {
        return f45977j;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f45976i.clone();
    }

    @NotNull
    public final String c() {
        return this.f45978a;
    }
}
