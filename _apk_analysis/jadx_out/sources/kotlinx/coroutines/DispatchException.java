package kotlinx.coroutines;

import org.jetbrains.annotations.NotNull;
import p000do.h0;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DispatchException extends Exception {

    @NotNull
    private final Throwable cause;

    public DispatchException(@NotNull Throwable th2, @NotNull h0 h0Var, @NotNull kotlin.coroutines.d dVar) {
        super("Coroutine dispatcher " + h0Var + " threw an exception, context = " + dVar, th2);
        this.cause = th2;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable getCause() {
        return this.cause;
    }
}
