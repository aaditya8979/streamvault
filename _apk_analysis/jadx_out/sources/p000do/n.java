package p000do;

import io.h;
import kotlinx.coroutines.b;
import kotlinx.coroutines.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class n {
    public static final void a(@NotNull k<?> kVar, @NotNull y0 y0Var) {
        c(kVar, new z0(y0Var));
    }

    @NotNull
    public static final <T> c<T> b(@NotNull hn.c<? super T> cVar) {
        if (!(cVar instanceof h)) {
            return new c<>(cVar, 1);
        }
        c<T> cVarL = ((h) cVar).l();
        if (cVarL != null) {
            if (!cVarL.U()) {
                cVarL = null;
            }
            if (cVarL != null) {
                return cVarL;
            }
        }
        return new c<>(cVar, 2);
    }

    public static final <T> void c(@NotNull k<? super T> kVar, @NotNull b bVar) {
        if (!(kVar instanceof c)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((c) kVar).N(bVar);
    }
}
