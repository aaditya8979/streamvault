package io.ktor.utils.io;

import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ClosedReadChannelException extends ClosedByteChannelException {
    /* JADX WARN: Multi-variable type inference failed */
    public ClosedReadChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClosedReadChannelException(@Nullable Throwable th2) {
        super(th2);
    }

    public /* synthetic */ ClosedReadChannelException(Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : th2);
    }
}
