package p000do;

import hn.c;
import io.h;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class m0 {
    @NotNull
    public static final String a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    public static final String b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    public static final String c(@NotNull c<?> cVar) {
        Object objM7534constructorimpl;
        if (cVar instanceof h) {
            return ((h) cVar).toString();
        }
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(cVar + '@' + b(cVar));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m7537exceptionOrNullimpl(objM7534constructorimpl) != null) {
            objM7534constructorimpl = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) objM7534constructorimpl;
    }
}
