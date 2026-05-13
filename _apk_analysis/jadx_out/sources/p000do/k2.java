package p000do;

import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import sn.p;

/* JADX INFO: compiled from: ThreadContextElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface k2<S> extends d.b {

    /* JADX INFO: compiled from: ThreadContextElement.kt */
    public static final class a {
        public static <S, R> R a(@NotNull k2<S> k2Var, R r10, @NotNull p<? super R, ? super d.b, ? extends R> pVar) {
            return (R) d.b.a.a(k2Var, r10, pVar);
        }

        @NotNull
        public static <S> d b(@NotNull k2<S> k2Var, @NotNull d dVar) {
            return d.b.a.d(k2Var, dVar);
        }
    }

    void restoreThreadContext(@NotNull d dVar, S s10);

    S updateThreadContext(@NotNull d dVar);
}
