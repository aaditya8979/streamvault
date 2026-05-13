package p000do;

import bn.r;
import hn.c;
import io.h;
import io.i;
import io.l0;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlinx.coroutines.f;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class u0 {
    public static final <T> void a(@NotNull f<? super T> fVar, int i10) {
        c<? super T> cVarF = fVar.f();
        boolean z10 = i10 == 4;
        if (z10 || !(cVarF instanceof h) || b(i10) != b(fVar.f73318d)) {
            d(fVar, cVarF, z10);
            return;
        }
        h hVar = (h) cVarF;
        h0 h0Var = hVar.f71039e;
        d context = hVar.getContext();
        if (i.d(h0Var, context)) {
            i.c(h0Var, context, fVar);
        } else {
            e(fVar);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(@NotNull f<? super T> fVar, @NotNull c<? super T> cVar, boolean z10) {
        Object objH;
        Object objJ = fVar.j();
        Throwable thG = fVar.g(objJ);
        if (thG != null) {
            Result.a aVar = Result.Companion;
            objH = kotlin.c.a(thG);
        } else {
            Result.a aVar2 = Result.Companion;
            objH = fVar.h(objJ);
        }
        Object objM7534constructorimpl = Result.m7534constructorimpl(objH);
        if (!z10) {
            cVar.resumeWith(objM7534constructorimpl);
            return;
        }
        p.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        h hVar = (h) cVar;
        c<T> cVar2 = hVar.f71040f;
        Object obj = hVar.f71042h;
        d context = cVar2.getContext();
        Object objI = l0.i(context, obj);
        q2<?> q2VarM = objI != l0.f71285a ? f0.m(cVar2, context, objI) : null;
        try {
            hVar.f71040f.resumeWith(objM7534constructorimpl);
            r rVar = r.f5635a;
        } finally {
            if (q2VarM == null || q2VarM.k1()) {
                l0.f(context, objI);
            }
        }
    }

    public static final void e(f<?> fVar) {
        c1 c1VarB = m2.f59866a.b();
        if (c1VarB.S()) {
            c1VarB.O(fVar);
            return;
        }
        c1VarB.Q(true);
        try {
            d(fVar, fVar.f(), true);
            do {
            } while (c1VarB.V());
        } finally {
            try {
            } finally {
            }
        }
    }
}
