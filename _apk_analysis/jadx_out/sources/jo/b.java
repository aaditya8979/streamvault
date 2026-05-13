package jo;

import hn.c;
import io.a0;
import io.l0;
import jn.f;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.v1;
import p000do.y;
import sn.p;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final Void a(a0<?> a0Var, DispatchException dispatchException) throws Throwable {
        a0Var.F0(new y(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    public static final boolean b(a0<?> a0Var, Throwable th2) {
        return ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == a0Var) ? false : true;
    }

    public static final <R, T> void c(@NotNull p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @NotNull c<? super T> cVar) {
        c cVarA = f.a(cVar);
        try {
            d context = cVarA.getContext();
            Object objI = l0.i(context, null);
            try {
                f.b(cVarA);
                Object objE = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.e(pVar, r10, cVarA) : ((p) tn.y.e(pVar, 2)).mo2invoke(r10, cVarA);
                if (objE != in.a.g()) {
                    cVarA.resumeWith(Result.m7534constructorimpl(objE));
                }
            } finally {
                l0.f(context, objI);
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.a aVar = Result.Companion;
            cVarA.resumeWith(Result.m7534constructorimpl(kotlin.c.a(th)));
        }
    }

    @Nullable
    public static final <T, R> Object d(@NotNull a0<? super T> a0Var, R r10, @NotNull p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        return f(a0Var, true, r10, pVar);
    }

    @Nullable
    public static final <T, R> Object e(@NotNull a0<? super T> a0Var, R r10, @NotNull p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        return f(a0Var, false, r10, pVar);
    }

    public static final <T, R> Object f(a0<? super T> a0Var, boolean z10, R r10, p<? super R, ? super c<? super T>, ? extends Object> pVar) throws Throwable {
        Object yVar;
        Object objG0;
        try {
            yVar = !(pVar instanceof BaseContinuationImpl) ? IntrinsicsKt__IntrinsicsJvmKt.e(pVar, r10, a0Var) : ((p) tn.y.e(pVar, 2)).mo2invoke(r10, a0Var);
        } catch (DispatchException e10) {
            a(a0Var, e10);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            yVar = new y(th2, false, 2, null);
        }
        if (yVar != in.a.g() && (objG0 = a0Var.G0(yVar)) != v1.f59893b) {
            a0Var.j1();
            if (!(objG0 instanceof y)) {
                return v1.h(objG0);
            }
            if (z10 || b(a0Var, ((y) objG0).f59911a)) {
                throw ((y) objG0).f59911a;
            }
            if (yVar instanceof y) {
                throw ((y) yVar).f59911a;
            }
            return yVar;
        }
        return in.a.g();
    }
}
