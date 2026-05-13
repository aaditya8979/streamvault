package p000do;

import bn.r;
import hn.c;
import kotlin.coroutines.d;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class g {
    @NotNull
    public static final <T> p0<T> a(@NotNull l0 l0Var, @NotNull d dVar, @NotNull CoroutineStart coroutineStart, @NotNull p<? super l0, ? super c<? super T>, ? extends Object> pVar) {
        return i.a(l0Var, dVar, coroutineStart, pVar);
    }

    @NotNull
    public static final kotlinx.coroutines.g c(@NotNull l0 l0Var, @NotNull d dVar, @NotNull CoroutineStart coroutineStart, @NotNull p<? super l0, ? super c<? super r>, ? extends Object> pVar) {
        return i.c(l0Var, dVar, coroutineStart, pVar);
    }

    public static final <T> T e(@NotNull d dVar, @NotNull p<? super l0, ? super c<? super T>, ? extends Object> pVar) throws InterruptedException {
        return (T) h.a(dVar, pVar);
    }

    @Nullable
    public static final <T> Object g(@NotNull d dVar, @NotNull p<? super l0, ? super c<? super T>, ? extends Object> pVar, @NotNull c<? super T> cVar) {
        return i.e(dVar, pVar, cVar);
    }
}
