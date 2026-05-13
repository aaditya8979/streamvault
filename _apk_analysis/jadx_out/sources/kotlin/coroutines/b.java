package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.d.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b<B extends d.b, E extends B> implements d.c<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final l<d.b, E> f73227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final d.c<?> f73228c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.d$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, sn.l<? super kotlin.coroutines.d$b, ? extends E extends B>, sn.l<kotlin.coroutines.d$b, E extends B>] */
    public b(@NotNull d.c<B> cVar, @NotNull l<? super d.b, ? extends E> lVar) {
        p.k(cVar, "baseKey");
        p.k(lVar, "safeCast");
        this.f73227b = lVar;
        this.f73228c = cVar instanceof b ? (d.c<B>) ((b) cVar).f73228c : cVar;
    }

    public final boolean a(@NotNull d.c<?> cVar) {
        p.k(cVar, "key");
        return cVar == this || this.f73228c == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/d$b;)TE; */
    @Nullable
    public final d.b b(@NotNull d.b bVar) {
        p.k(bVar, "element");
        return (d.b) this.f73227b.invoke(bVar);
    }
}
