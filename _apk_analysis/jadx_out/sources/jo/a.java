package jo;

import bn.r;
import hn.c;
import io.i;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.DispatchException;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static final void a(c<?> cVar, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(th2)));
        throw th2;
    }

    public static final void b(@NotNull c<? super r> cVar, @NotNull c<?> cVar2) throws Throwable {
        try {
            c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(cVar);
            Result.a aVar = Result.Companion;
            i.b(cVarD, Result.m7534constructorimpl(r.f5635a));
        } catch (Throwable th2) {
            a(cVar2, th2);
        }
    }

    public static final <T> void c(@NotNull l<? super c<? super T>, ? extends Object> lVar, @NotNull c<? super T> cVar) {
        try {
            c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.a(lVar, cVar));
            Result.a aVar = Result.Companion;
            i.b(cVarD, Result.m7534constructorimpl(r.f5635a));
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static final <R, T> void d(@NotNull p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @NotNull c<? super T> cVar) {
        try {
            c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(pVar, r10, cVar));
            Result.a aVar = Result.Companion;
            i.b(cVarD, Result.m7534constructorimpl(r.f5635a));
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }
}
