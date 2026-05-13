package com.moloco.sdk.internal.ilrd.model;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46208a = new a("MAX", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46209b = new a("LEVELPLAY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a[] f46210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kn.a f46211d;

    static {
        a[] aVarArrA = a();
        f46210c = aVarArrA;
        f46211d = kotlin.enums.a.a(aVarArrA);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f46208a, f46209b};
    }

    @NotNull
    public static kn.a<a> b() {
        return f46211d;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f46210c.clone();
    }
}
