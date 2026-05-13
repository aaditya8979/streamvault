package p000do;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface i0 extends d.b {

    @NotNull
    public static final b D8 = b.f59857b;

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class a {
        public static <R> R a(@NotNull i0 i0Var, R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(i0Var, r10, pVar);
        }

        @Nullable
        public static <E extends d.b> E b(@NotNull i0 i0Var, @NotNull d.c<E> cVar) {
            return (E) d.b.a.b(i0Var, cVar);
        }

        @NotNull
        public static d c(@NotNull i0 i0Var, @NotNull d.c<?> cVar) {
            return d.b.a.c(i0Var, cVar);
        }

        @NotNull
        public static d d(@NotNull i0 i0Var, @NotNull d dVar) {
            return d.b.a.d(i0Var, dVar);
        }
    }

    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    public static final class b implements d.c<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b f59857b = new b();
    }

    void handleException(@NotNull d dVar, @NotNull Throwable th2);
}
