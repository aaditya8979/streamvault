package kotlinx.coroutines;

import io.a0;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h1;
import p000do.j2;
import p000do.l0;
import p000do.t1;
import p000do.w0;
import sn.p;

/* JADX INFO: compiled from: CoroutineScope.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class d {
    @NotNull
    public static final l0 a(@NotNull kotlin.coroutines.d dVar) {
        if (dVar.get(g.H8) == null) {
            dVar = dVar.plus(JobKt__JobKt.b(null, 1, null));
        }
        return new io.e(dVar);
    }

    @NotNull
    public static final l0 b() {
        return new io.e(j2.b(null, 1, null).plus(w0.c()));
    }

    public static final void c(@NotNull l0 l0Var, @NotNull String str, @Nullable Throwable th2) {
        d(l0Var, h1.a(str, th2));
    }

    public static final void d(@NotNull l0 l0Var, @Nullable CancellationException cancellationException) {
        g gVar = (g) l0Var.getCoroutineContext().get(g.H8);
        if (gVar != null) {
            gVar.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + l0Var).toString());
    }

    public static /* synthetic */ void e(l0 l0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        d(l0Var, cancellationException);
    }

    @Nullable
    public static final <R> Object f(@NotNull p<? super l0, ? super hn.c<? super R>, ? extends Object> pVar, @NotNull hn.c<? super R> cVar) {
        a0 a0Var = new a0(cVar.getContext(), cVar);
        Object objD = jo.b.d(a0Var, a0Var, pVar);
        if (objD == in.a.g()) {
            jn.f.c(cVar);
        }
        return objD;
    }

    public static final void g(@NotNull l0 l0Var) {
        t1.k(l0Var.getCoroutineContext());
    }

    public static final boolean h(@NotNull l0 l0Var) {
        g gVar = (g) l0Var.getCoroutineContext().get(g.H8);
        if (gVar != null) {
            return gVar.isActive();
        }
        return true;
    }

    @NotNull
    public static final l0 i(@NotNull l0 l0Var, @NotNull kotlin.coroutines.d dVar) {
        return new io.e(l0Var.getCoroutineContext().plus(dVar));
    }
}
