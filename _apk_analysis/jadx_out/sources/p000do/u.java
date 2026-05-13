package p000do;

import in.a;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.g;
import lo.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class u<T> extends JobSupport implements t<T> {
    public u(@Nullable g gVar) {
        super(true);
        z0(gVar);
    }

    @Override // p000do.p0
    @NotNull
    public c<T> K() {
        c<T> cVar = (c<T>) p0();
        p.i(cVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return cVar;
    }

    @Override // p000do.p0
    @Nullable
    public Object N(@NotNull hn.c<? super T> cVar) throws Throwable {
        Object objX = X(cVar);
        a.g();
        return objX;
    }

    @Override // p000do.t
    public boolean b(@NotNull Throwable th2) {
        return F0(new y(th2, false, 2, null));
    }

    @Override // p000do.p0
    public T l() {
        return (T) l0();
    }

    @Override // p000do.t
    public boolean n(T t10) {
        return F0(t10);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean q0() {
        return true;
    }
}
