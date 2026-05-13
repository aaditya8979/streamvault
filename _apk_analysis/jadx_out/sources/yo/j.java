package yo;

import kotlin.Result;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f97950a;

    static {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM7534constructorimpl = Result.m7534constructorimpl(property != null ? bo.z.r(property) : null);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        Integer num = (Integer) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
        f97950a = num != null ? num.intValue() : 2097152;
    }
}
