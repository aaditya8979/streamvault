package p000do;

import bn.r;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface r0 {

    /* JADX INFO: compiled from: Delay.kt */
    public static final class a {
        @NotNull
        public static y0 a(@NotNull r0 r0Var, long j10, @NotNull Runnable runnable, @NotNull d dVar) {
            return o0.a().A(j10, runnable, dVar);
        }
    }

    @NotNull
    y0 A(long j10, @NotNull Runnable runnable, @NotNull d dVar);

    void a(long j10, @NotNull k<? super r> kVar);
}
