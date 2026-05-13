package kotlin.coroutines;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ContinuationInterceptor.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface c extends d.b {

    @NotNull
    public static final b G8 = b.f73229b;

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class a {
        @Nullable
        public static <E extends d.b> E a(@NotNull c cVar, @NotNull d.c<E> cVar2) {
            p.k(cVar2, "key");
            if (!(cVar2 instanceof kotlin.coroutines.b)) {
                if (c.G8 != cVar2) {
                    return null;
                }
                p.i(cVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar2;
            if (!bVar.a(cVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(cVar);
            if (e10 instanceof d.b) {
                return e10;
            }
            return null;
        }

        @NotNull
        public static d b(@NotNull c cVar, @NotNull d.c<?> cVar2) {
            p.k(cVar2, "key");
            if (!(cVar2 instanceof kotlin.coroutines.b)) {
                return c.G8 == cVar2 ? EmptyCoroutineContext.INSTANCE : cVar;
            }
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar2;
            return (!bVar.a(cVar.getKey()) || bVar.b(cVar) == null) ? cVar : EmptyCoroutineContext.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ContinuationInterceptor.kt */
    public static final class b implements d.c<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f73229b = new b();
    }

    @NotNull
    <T> hn.c<T> interceptContinuation(@NotNull hn.c<? super T> cVar);

    void releaseInterceptedContinuation(@NotNull hn.c<?> cVar);
}
