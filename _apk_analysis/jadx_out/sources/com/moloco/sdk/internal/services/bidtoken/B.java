package com.moloco.sdk.internal.services.bidtoken;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f47123a = new B("NEEDS_REFRESH", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B f47124b = new B("EXPIRING", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B f47125c = new B("NO_REFRESH_NEEDED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ B[] f47126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kn.a f47127e;

    static {
        B[] bArrA = a();
        f47126d = bArrA;
        f47127e = kotlin.enums.a.a(bArrA);
    }

    public B(String str, int i10) {
    }

    public static final /* synthetic */ B[] a() {
        return new B[]{f47123a, f47124b, f47125c};
    }

    @NotNull
    public static kn.a<B> c() {
        return f47127e;
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f47126d.clone();
    }

    public final boolean b() {
        return this == f47124b || this == f47125c;
    }
}
