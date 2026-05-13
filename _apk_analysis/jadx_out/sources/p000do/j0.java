package p000do;

import io.g;
import kotlin.coroutines.d;
import kotlinx.coroutines.DispatchException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    public static final void a(@NotNull d dVar, @NotNull Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            i0 i0Var = (i0) dVar.get(i0.D8);
            if (i0Var != null) {
                i0Var.handleException(dVar, th2);
            } else {
                g.a(dVar, th2);
            }
        } catch (Throwable th3) {
            g.a(dVar, b(th2, th3));
        }
    }

    @NotNull
    public static final Throwable b(@NotNull Throwable th2, @NotNull Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        bn.d.a(runtimeException, th2);
        return runtimeException;
    }
}
