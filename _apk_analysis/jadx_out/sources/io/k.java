package io;

import kotlin.Result;

/* JADX INFO: compiled from: FastServiceLoader.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f71046a;

    static {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        f71046a = Result.m7540isSuccessimpl(objM7534constructorimpl);
    }

    public static final boolean a() {
        return f71046a;
    }
}
