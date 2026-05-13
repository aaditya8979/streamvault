package com.moloco.sdk.acm;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f45841a = new f("INITIALIZED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f45842b = new f("INITIALIZING", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f45843c = new f("UNINITIALIZED", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f45844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kn.a f45845e;

    static {
        f[] fVarArrA = a();
        f45844d = fVarArrA;
        f45845e = kotlin.enums.a.a(fVarArrA);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{f45841a, f45842b, f45843c};
    }

    @NotNull
    public static kn.a<f> b() {
        return f45845e;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f45844d.clone();
    }
}
