package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.b0;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TimeoutCancellationException extends CancellationException implements b0<TimeoutCancellationException> {

    @Nullable
    public final transient g coroutine;

    public TimeoutCancellationException(@NotNull String str) {
        this(str, null);
    }

    public TimeoutCancellationException(@NotNull String str, @Nullable g gVar) {
        super(str);
        this.coroutine = gVar;
    }

    @Override // p000do.b0
    @NotNull
    public TimeoutCancellationException createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        TimeoutCancellationException timeoutCancellationException = new TimeoutCancellationException(message, this.coroutine);
        timeoutCancellationException.initCause(this);
        return timeoutCancellationException;
    }
}
