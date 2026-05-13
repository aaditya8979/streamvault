package p000do;

import bn.h;
import bn.r;
import hn.c;
import io.a0;
import io.l0;
import kotlin.Pair;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class q2<T> extends a0<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ThreadLocal<Pair<d, Object>> f59883f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public q2(@NotNull d dVar, @NotNull c<? super T> cVar) {
        r2 r2Var = r2.f59886b;
        super(dVar.get(r2Var) == null ? dVar.plus(r2Var) : dVar, cVar);
        this.f59883f = new ThreadLocal<>();
        if (cVar.getContext().get(kotlin.coroutines.c.G8) instanceof h0) {
            return;
        }
        Object objI = l0.i(dVar, null);
        l0.f(dVar, objI);
        m1(dVar, objI);
    }

    @Override // io.a0, kotlinx.coroutines.a
    public void f1(@Nullable Object obj) {
        l1();
        Object objA = z.a(obj, this.f64327e);
        c<T> cVar = this.f64327e;
        d context = cVar.getContext();
        Object objI = l0.i(context, null);
        q2<?> q2VarM = objI != l0.f71285a ? f0.m(cVar, context, objI) : null;
        try {
            this.f64327e.resumeWith(objA);
            r rVar = r.f5635a;
        } finally {
            if (q2VarM == null || q2VarM.k1()) {
                l0.f(context, objI);
            }
        }
    }

    @Override // io.a0
    public void j1() {
        l1();
    }

    public final boolean k1() {
        boolean z10 = this.threadLocalIsSet && this.f59883f.get() == null;
        this.f59883f.remove();
        return !z10;
    }

    public final void l1() {
        if (this.threadLocalIsSet) {
            Pair<d, Object> pair = this.f59883f.get();
            if (pair != null) {
                l0.f(pair.component1(), pair.component2());
            }
            this.f59883f.remove();
        }
    }

    public final void m1(@NotNull d dVar, @Nullable Object obj) {
        this.threadLocalIsSet = true;
        this.f59883f.set(h.a(dVar, obj));
    }
}
