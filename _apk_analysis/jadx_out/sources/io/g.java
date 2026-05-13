package io;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.common.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final void a(@NotNull kotlin.coroutines.d dVar, @NotNull Throwable th2) {
        Iterator<p000do.i0> it = f.a().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(dVar, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                f.b(p000do.j0.b(th2, th3));
            }
        }
        try {
            bn.d.a(th2, new DiagnosticCoroutineContextException(dVar));
        } catch (Throwable unused2) {
        }
        f.b(th2);
    }
}
