package io.ktor.client.engine;

import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: HttpClientEngineBase.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientEngineClosedException extends IllegalStateException {

    @Nullable
    private final Throwable cause;

    /* JADX WARN: Multi-variable type inference failed */
    public ClientEngineClosedException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClientEngineClosedException(@Nullable Throwable th2) {
        super("Client already closed");
        this.cause = th2;
    }

    public /* synthetic */ ClientEngineClosedException(Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : th2);
    }

    @Override // java.lang.Throwable
    @Nullable
    public Throwable getCause() {
        return this.cause;
    }
}
