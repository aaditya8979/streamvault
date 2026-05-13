package io;

import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final StackTraceElement f71031a = new m.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f71032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f71033c;

    static {
        Object objM7534constructorimpl;
        Object objM7534constructorimpl2;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            objM7534constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f71032b = (String) objM7534constructorimpl;
        try {
            objM7534constructorimpl2 = Result.m7534constructorimpl(d0.class.getCanonicalName());
        } catch (Throwable th3) {
            Result.a aVar3 = Result.Companion;
            objM7534constructorimpl2 = Result.m7534constructorimpl(kotlin.c.a(th3));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl2) != null) {
            objM7534constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f71033c = (String) objM7534constructorimpl2;
    }

    @NotNull
    public static final <E extends Throwable> E a(@NotNull E e10) {
        return e10;
    }
}
