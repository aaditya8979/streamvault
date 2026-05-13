package el;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ExceptionUtilsJvm.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    @NotNull
    public static final Throwable a(@NotNull Throwable th2) {
        p.k(th2, "<this>");
        Throwable cause = th2;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (p.f(cause, cancellationException.getCause())) {
                return th2;
            }
            cause = cancellationException.getCause();
        }
        return cause == null ? th2 : cause;
    }
}
