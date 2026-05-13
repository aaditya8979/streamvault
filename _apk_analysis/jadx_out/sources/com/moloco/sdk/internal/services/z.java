package com.moloco.sdk.internal.services;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f47569a = new z("SILENT", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f47570b = new z("VIBRATE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f47571c = new z("NORMAL", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ z[] f47572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kn.a f47573e;

    static {
        z[] zVarArrA = a();
        f47572d = zVarArrA;
        f47573e = kotlin.enums.a.a(zVarArrA);
    }

    public z(String str, int i10) {
    }

    public static final /* synthetic */ z[] a() {
        return new z[]{f47569a, f47570b, f47571c};
    }

    @NotNull
    public static kn.a<z> b() {
        return f47573e;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f47572d.clone();
    }
}
