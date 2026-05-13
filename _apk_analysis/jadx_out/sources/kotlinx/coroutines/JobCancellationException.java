package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.b0;
import tn.p;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JobCancellationException extends CancellationException implements b0<JobCancellationException> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final transient g f73249b;

    public JobCancellationException(@NotNull String str, @Nullable Throwable th2, @NotNull g gVar) {
        super(str);
        this.f73249b = gVar;
        if (th2 != null) {
            initCause(th2);
        }
    }

    @Override // p000do.b0
    @Nullable
    public JobCancellationException createCopy() {
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!p.f(jobCancellationException.getMessage(), getMessage()) || !p.f(jobCancellationException.getJob$kotlinx_coroutines_core(), getJob$kotlinx_coroutines_core()) || !p.f(jobCancellationException.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    @NotNull
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @NotNull
    public final g getJob$kotlinx_coroutines_core() {
        g gVar = this.f73249b;
        return gVar == null ? h.f73417b : gVar;
    }

    public int hashCode() {
        String message = getMessage();
        p.h(message);
        int iHashCode = message.hashCode() * 31;
        g job$kotlinx_coroutines_core = getJob$kotlinx_coroutines_core();
        int iHashCode2 = (iHashCode + (job$kotlinx_coroutines_core != null ? job$kotlinx_coroutines_core.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        return super.toString() + "; job=" + getJob$kotlinx_coroutines_core();
    }
}
