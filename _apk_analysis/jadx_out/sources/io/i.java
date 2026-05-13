package io;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlinx.coroutines.DispatchException;
import org.jetbrains.annotations.NotNull;
import p000do.c1;
import p000do.m2;
import p000do.q2;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f71043a = new e0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final e0 f71044b = new e0("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    public static final <T> void b(@NotNull hn.c<? super T> cVar, @NotNull Object obj) {
        boolean z10;
        if (!(cVar instanceof h)) {
            cVar.resumeWith(obj);
            return;
        }
        h hVar = (h) cVar;
        Object objB = p000do.z.b(obj);
        if (d(hVar.f71039e, hVar.getContext())) {
            hVar.f71041g = objB;
            hVar.f73318d = 1;
            c(hVar.f71039e, hVar.getContext(), hVar);
            return;
        }
        c1 c1VarB = m2.f59866a.b();
        if (c1VarB.S()) {
            hVar.f71041g = objB;
            hVar.f73318d = 1;
            c1VarB.O(hVar);
            return;
        }
        c1VarB.Q(true);
        try {
            kotlinx.coroutines.g gVar = (kotlinx.coroutines.g) hVar.getContext().get(kotlinx.coroutines.g.H8);
            if (gVar == null || gVar.isActive()) {
                z10 = false;
            } else {
                CancellationException cancellationExceptionB = gVar.B();
                hVar.c(objB, cancellationExceptionB);
                Result.a aVar = Result.Companion;
                hVar.resumeWith(Result.m7534constructorimpl(kotlin.c.a(cancellationExceptionB)));
                z10 = true;
            }
            if (!z10) {
                hn.c<T> cVar2 = hVar.f71040f;
                Object obj2 = hVar.f71042h;
                kotlin.coroutines.d context = cVar2.getContext();
                Object objI = l0.i(context, obj2);
                q2<?> q2VarM = objI != l0.f71285a ? p000do.f0.m(cVar2, context, objI) : null;
                try {
                    hVar.f71040f.resumeWith(obj);
                    bn.r rVar = bn.r.f5635a;
                    if (q2VarM == null || q2VarM.k1()) {
                        l0.f(context, objI);
                    }
                } catch (Throwable th2) {
                    if (q2VarM == null || q2VarM.k1()) {
                        l0.f(context, objI);
                    }
                    throw th2;
                }
            }
            while (c1VarB.V()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void c(@NotNull p000do.h0 h0Var, @NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        try {
            h0Var.dispatch(dVar, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, h0Var, dVar);
        }
    }

    public static final boolean d(@NotNull p000do.h0 h0Var, @NotNull kotlin.coroutines.d dVar) throws DispatchException {
        try {
            return h0Var.isDispatchNeeded(dVar);
        } catch (Throwable th2) {
            throw new DispatchException(th2, h0Var, dVar);
        }
    }

    public static final boolean e(@NotNull h<? super bn.r> hVar) {
        bn.r rVar = bn.r.f5635a;
        c1 c1VarB = m2.f59866a.b();
        if (c1VarB.T()) {
            return false;
        }
        if (c1VarB.S()) {
            hVar.f71041g = rVar;
            hVar.f73318d = 1;
            c1VarB.O(hVar);
            return true;
        }
        c1VarB.Q(true);
        try {
            hVar.run();
            do {
            } while (c1VarB.V());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
