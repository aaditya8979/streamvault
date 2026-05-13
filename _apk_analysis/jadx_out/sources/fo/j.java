package fo;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000do.h1;

/* JADX INFO: compiled from: Channels.common.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j {
    public static final void a(@NotNull o<?> oVar, @Nullable Throwable th2) {
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = h1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        oVar.cancel(cancellationExceptionA);
    }
}
