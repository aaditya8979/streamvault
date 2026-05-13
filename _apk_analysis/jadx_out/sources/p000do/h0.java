package p000do;

import io.h;
import io.m;
import io.n;
import kotlin.coroutines.b;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h0;
import sn.l;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h0 extends kotlin.coroutines.a implements c {

    @NotNull
    public static final a Key = new a(null);

    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<c, h0> {
        public a() {
            super(c.G8, new l() { // from class: do.g0
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return h0.a.d((d.b) obj);
                }
            });
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public static final h0 d(d.b bVar) {
            if (bVar instanceof h0) {
                return (h0) bVar;
            }
            return null;
        }
    }

    public h0() {
        super(c.G8);
    }

    public static /* synthetic */ h0 limitedParallelism$default(h0 h0Var, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return h0Var.limitedParallelism(i10, str);
    }

    public abstract void dispatch(@NotNull d dVar, @NotNull Runnable runnable);

    public void dispatchYield(@NotNull d dVar, @NotNull Runnable runnable) {
        io.i.c(this, dVar, runnable);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d.b, kotlin.coroutines.d
    @Nullable
    public <E extends d.b> E get(@NotNull d.c<E> cVar) {
        return (E) c.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.c
    @NotNull
    public final <T> hn.c<T> interceptContinuation(@NotNull hn.c<? super T> cVar) {
        return new h(this, cVar);
    }

    public boolean isDispatchNeeded(@NotNull d dVar) {
        return true;
    }

    public /* synthetic */ h0 limitedParallelism(int i10) {
        return limitedParallelism(i10, null);
    }

    @NotNull
    public h0 limitedParallelism(int i10, @Nullable String str) {
        n.a(i10);
        return new m(this, i10, str);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    @NotNull
    public d minusKey(@NotNull d.c<?> cVar) {
        return c.a.b(this, cVar);
    }

    @NotNull
    public final h0 plus(@NotNull h0 h0Var) {
        return h0Var;
    }

    @Override // kotlin.coroutines.c
    public final void releaseInterceptedContinuation(@NotNull hn.c<?> cVar) {
        p.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((h) cVar).v();
    }

    @NotNull
    public String toString() {
        return m0.a(this) + '@' + m0.b(this);
    }
}
