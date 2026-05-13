package kotlin.coroutines;

import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface d {

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public static final class a {
        @NotNull
        public static d b(@NotNull d dVar, @NotNull d dVar2) {
            p.k(dVar2, GAMConfig.KEY_CONTEXT);
            return dVar2 == EmptyCoroutineContext.INSTANCE ? dVar : (d) dVar2.fold(dVar, new sn.p() { // from class: hn.e
                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo2invoke(Object obj, Object obj2) {
                    return d.a.c((kotlin.coroutines.d) obj, (d.b) obj2);
                }
            });
        }

        public static d c(d dVar, b bVar) {
            CombinedContext combinedContext;
            p.k(dVar, "acc");
            p.k(bVar, "element");
            d dVarMinusKey = dVar.minusKey(bVar.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            if (dVarMinusKey == emptyCoroutineContext) {
                return bVar;
            }
            c.b bVar2 = kotlin.coroutines.c.G8;
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVarMinusKey.get(bVar2);
            if (cVar == null) {
                combinedContext = new CombinedContext(dVarMinusKey, bVar);
            } else {
                d dVarMinusKey2 = dVarMinusKey.minusKey(bVar2);
                if (dVarMinusKey2 == emptyCoroutineContext) {
                    return new CombinedContext(bVar, cVar);
                }
                combinedContext = new CombinedContext(new CombinedContext(dVarMinusKey2, bVar), cVar);
            }
            return combinedContext;
        }
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface b extends d {

        /* JADX INFO: compiled from: CoroutineContext.kt */
        public static final class a {
            public static <R> R a(@NotNull b bVar, R r10, @NotNull sn.p<? super R, ? super b, ? extends R> pVar) {
                p.k(pVar, "operation");
                return pVar.mo2invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            public static <E extends b> E b(@NotNull b bVar, @NotNull c<E> cVar) {
                p.k(cVar, "key");
                if (!p.f(bVar.getKey(), cVar)) {
                    return null;
                }
                p.i(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            @NotNull
            public static d c(@NotNull b bVar, @NotNull c<?> cVar) {
                p.k(cVar, "key");
                return p.f(bVar.getKey(), cVar) ? EmptyCoroutineContext.INSTANCE : bVar;
            }

            @NotNull
            public static d d(@NotNull b bVar, @NotNull d dVar) {
                p.k(dVar, GAMConfig.KEY_CONTEXT);
                return a.b(bVar, dVar);
            }
        }

        @Override // kotlin.coroutines.d
        @Nullable
        <E extends b> E get(@NotNull c<E> cVar);

        @NotNull
        c<?> getKey();
    }

    /* JADX INFO: compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, @NotNull sn.p<? super R, ? super b, ? extends R> pVar);

    @Nullable
    <E extends b> E get(@NotNull c<E> cVar);

    @NotNull
    d minusKey(@NotNull c<?> cVar);

    @NotNull
    d plus(@NotNull d dVar);
}
