package com.moloco.sdk.acm.db;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f45754a = new c("TIMER", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f45755b = new c("COUNT", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f45756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn.a f45757d;

    static {
        c[] cVarArrA = a();
        f45756c = cVarArrA;
        f45757d = kotlin.enums.a.a(cVarArrA);
    }

    public c(String str, int i10) {
    }

    public static final /* synthetic */ c[] a() {
        return new c[]{f45754a, f45755b};
    }

    @NotNull
    public static kn.a<c> b() {
        return f45757d;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f45756c.clone();
    }
}
