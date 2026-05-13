package io.ktor.utils.io;

import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ClosedWriteChannelException extends ClosedByteChannelException {
    /* JADX WARN: Multi-variable type inference failed */
    public ClosedWriteChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClosedWriteChannelException(@Nullable Throwable th2) {
        super(th2);
    }

    public /* synthetic */ ClosedWriteChannelException(Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : th2);
    }
}
