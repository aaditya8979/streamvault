package kotlinx.coroutines.flow.internal;

import bn.r;
import go.e;
import hn.c;
import in.a;
import io.l0;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class UndispatchedContextCollector<T> implements e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final d f73413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f73414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final p<T, c<? super r>, Object> f73415d;

    public UndispatchedContextCollector(@NotNull e<? super T> eVar, @NotNull d dVar) {
        this.f73413b = dVar;
        this.f73414c = l0.g(dVar);
        this.f73415d = new UndispatchedContextCollector$emitRef$1(eVar, null);
    }

    @Override // go.e
    @Nullable
    public Object emit(T t10, @NotNull c<? super r> cVar) {
        Object objB = ho.d.b(this.f73413b, t10, this.f73414c, this.f73415d, cVar);
        return objB == a.g() ? objB : r.f5635a;
    }
}
