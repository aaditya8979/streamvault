package p000do;

import hn.c;
import kotlin.coroutines.d;
import kotlinx.coroutines.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
public class q0<T> extends a<T> implements p0<T> {
    public q0(@NotNull d dVar, boolean z10) {
        super(dVar, true, z10);
    }

    public static /* synthetic */ <T> Object j1(q0<T> q0Var, c<? super T> cVar) throws Throwable {
        Object objX = q0Var.X(cVar);
        in.a.g();
        return objX;
    }

    @Override // p000do.p0
    @NotNull
    public lo.c<T> K() {
        lo.c<T> cVar = (lo.c<T>) p0();
        p.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return cVar;
    }

    @Override // p000do.p0
    @Nullable
    public Object N(@NotNull c<? super T> cVar) {
        return j1(this, cVar);
    }

    @Override // p000do.p0
    public T l() {
        return (T) l0();
    }
}
