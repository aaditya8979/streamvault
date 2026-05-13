package p000do;

import bn.r;
import hn.c;
import io.a0;
import io.l0;
import jn.f;
import jo.b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a;
import kotlinx.coroutines.e;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i {
    @NotNull
    public static final <T> p0<T> a(@NotNull l0 l0Var, @NotNull d dVar, @NotNull CoroutineStart coroutineStart, @NotNull p<? super l0, ? super c<? super T>, ? extends Object> pVar) {
        d dVarJ = f0.j(l0Var, dVar);
        q0 w1Var = coroutineStart.isLazy() ? new w1(dVarJ, pVar) : new q0(dVarJ, true);
        ((a) w1Var).i1(coroutineStart, w1Var, pVar);
        return (p0<T>) w1Var;
    }

    public static /* synthetic */ p0 b(l0 l0Var, d dVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return g.a(l0Var, dVar, coroutineStart, pVar);
    }

    @NotNull
    public static final g c(@NotNull l0 l0Var, @NotNull d dVar, @NotNull CoroutineStart coroutineStart, @NotNull p<? super l0, ? super c<? super r>, ? extends Object> pVar) {
        d dVarJ = f0.j(l0Var, dVar);
        a x1Var = coroutineStart.isLazy() ? new x1(dVarJ, pVar) : new g2(dVarJ, true);
        x1Var.i1(coroutineStart, x1Var, pVar);
        return x1Var;
    }

    public static /* synthetic */ g d(l0 l0Var, d dVar, CoroutineStart coroutineStart, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return g.c(l0Var, dVar, coroutineStart, pVar);
    }

    @Nullable
    public static final <T> Object e(@NotNull d dVar, @NotNull p<? super l0, ? super c<? super T>, ? extends Object> pVar, @NotNull c<? super T> cVar) {
        Object objK1;
        d context = cVar.getContext();
        d dVarK = f0.k(context, dVar);
        t1.k(dVarK);
        if (dVarK == context) {
            a0 a0Var = new a0(dVarK, cVar);
            objK1 = b.d(a0Var, a0Var, pVar);
        } else {
            c.b bVar = kotlin.coroutines.c.G8;
            if (tn.p.f(dVarK.get(bVar), context.get(bVar))) {
                q2 q2Var = new q2(dVarK, cVar);
                d context2 = q2Var.getContext();
                Object objI = l0.i(context2, null);
                try {
                    Object objD = b.d(q2Var, q2Var, pVar);
                    l0.f(context2, objI);
                    objK1 = objD;
                } catch (Throwable th2) {
                    l0.f(context2, objI);
                    throw th2;
                }
            } else {
                e eVar = new e(dVarK, cVar);
                jo.a.d(pVar, eVar, eVar);
                objK1 = eVar.k1();
            }
        }
        if (objK1 == in.a.g()) {
            f.c(cVar);
        }
        return objK1;
    }
}
