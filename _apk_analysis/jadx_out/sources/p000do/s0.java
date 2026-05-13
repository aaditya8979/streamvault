package p000do;

import bn.r;
import co.b;
import hn.c;
import in.a;
import jn.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 {
    @Nullable
    public static final Object a(long j10, @NotNull c<? super r> cVar) {
        if (j10 <= 0) {
            return r.f5635a;
        }
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        cVar2.K();
        if (j10 < Long.MAX_VALUE) {
            c(cVar2.getContext()).a(j10, cVar2);
        }
        Object objB = cVar2.B();
        if (objB == a.g()) {
            f.c(cVar);
        }
        return objB == a.g() ? objB : r.f5635a;
    }

    @Nullable
    public static final Object b(long j10, @NotNull c<? super r> cVar) {
        Object objA = a(d(j10), cVar);
        return objA == a.g() ? objA : r.f5635a;
    }

    @NotNull
    public static final r0 c(@NotNull d dVar) {
        d.b bVar = dVar.get(kotlin.coroutines.c.G8);
        r0 r0Var = bVar instanceof r0 ? (r0) bVar : null;
        return r0Var == null ? o0.a() : r0Var;
    }

    public static final long d(long j10) {
        boolean zF = b.F(j10);
        if (zF) {
            return b.q(b.H(j10, co.d.t(999999L, DurationUnit.NANOSECONDS)));
        }
        if (zF) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
