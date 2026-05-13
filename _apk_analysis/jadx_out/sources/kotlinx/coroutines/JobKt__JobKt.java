package kotlinx.coroutines;

import ao.i;
import bn.r;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.a1;
import p000do.h1;
import p000do.s1;
import p000do.t1;
import p000do.u1;
import p000do.w;
import p000do.y0;

/* JADX INFO: compiled from: Job.kt */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class JobKt__JobKt {
    @NotNull
    public static final w a(@Nullable g gVar) {
        return new s1(gVar);
    }

    public static /* synthetic */ w b(g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        return t1.a(gVar);
    }

    public static final void c(@NotNull kotlin.coroutines.d dVar, @Nullable CancellationException cancellationException) {
        g gVar = (g) dVar.get(g.H8);
        if (gVar != null) {
            gVar.cancel(cancellationException);
        }
    }

    public static final void d(@NotNull g gVar, @NotNull String str, @Nullable Throwable th2) {
        gVar.cancel(h1.a(str, th2));
    }

    public static /* synthetic */ void e(kotlin.coroutines.d dVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        t1.c(dVar, cancellationException);
    }

    public static /* synthetic */ void f(g gVar, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        t1.d(gVar, str, th2);
    }

    @Nullable
    public static final Object g(@NotNull g gVar, @NotNull hn.c<? super r> cVar) {
        g.a.a(gVar, null, 1, null);
        Object objC = gVar.C(cVar);
        return objC == in.a.g() ? objC : r.f5635a;
    }

    public static final void h(@NotNull kotlin.coroutines.d dVar, @Nullable CancellationException cancellationException) {
        i<g> iVarK;
        g gVar = (g) dVar.get(g.H8);
        if (gVar == null || (iVarK = gVar.k()) == null) {
            return;
        }
        Iterator<g> it = iVarK.iterator();
        while (it.hasNext()) {
            it.next().cancel(cancellationException);
        }
    }

    public static /* synthetic */ void i(kotlin.coroutines.d dVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        t1.h(dVar, cancellationException);
    }

    @NotNull
    public static final y0 j(@NotNull g gVar, @NotNull y0 y0Var) {
        return o(gVar, false, new a1(y0Var), 1, null);
    }

    public static final void k(@NotNull kotlin.coroutines.d dVar) {
        g gVar = (g) dVar.get(g.H8);
        if (gVar != null) {
            t1.l(gVar);
        }
    }

    public static final void l(@NotNull g gVar) {
        if (!gVar.isActive()) {
            throw gVar.B();
        }
    }

    @NotNull
    public static final g m(@NotNull kotlin.coroutines.d dVar) {
        g gVar = (g) dVar.get(g.H8);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + dVar).toString());
    }

    @NotNull
    public static final y0 n(@NotNull g gVar, boolean z10, @NotNull u1 u1Var) {
        return gVar instanceof JobSupport ? ((JobSupport) gVar).A0(z10, u1Var) : gVar.w(u1Var.u(), z10, new JobKt__JobKt$invokeOnCompletion$1(u1Var));
    }

    public static /* synthetic */ y0 o(g gVar, boolean z10, u1 u1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return t1.n(gVar, z10, u1Var);
    }

    public static final boolean p(@NotNull kotlin.coroutines.d dVar) {
        g gVar = (g) dVar.get(g.H8);
        if (gVar != null) {
            return gVar.isActive();
        }
        return true;
    }
}
