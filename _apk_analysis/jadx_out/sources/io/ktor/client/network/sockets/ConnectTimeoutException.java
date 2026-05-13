package io.ktor.client.network.sockets;

import java.net.ConnectException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: TimeoutExceptions.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class ConnectTimeoutException extends ConnectException {

    @Nullable
    private final Throwable cause;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectTimeoutException(@NotNull String str, @Nullable Throwable th2) {
        super(str);
        p.k(str, "message");
        this.cause = th2;
    }

    public /* synthetic */ ConnectTimeoutException(String str, Throwable th2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }
}
