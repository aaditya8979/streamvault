package go;

import kotlinx.coroutines.flow.AbstractFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class o<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sn.p<e<? super T>, hn.c<? super bn.r>, Object> f62654b;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@NotNull sn.p<? super e<? super T>, ? super hn.c<? super bn.r>, ? extends Object> pVar) {
        this.f62654b = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    @Nullable
    public Object c(@NotNull e<? super T> eVar, @NotNull hn.c<? super bn.r> cVar) {
        Object objMo2invoke = this.f62654b.mo2invoke(eVar, cVar);
        return objMo2invoke == in.a.g() ? objMo2invoke : bn.r.f5635a;
    }
}
