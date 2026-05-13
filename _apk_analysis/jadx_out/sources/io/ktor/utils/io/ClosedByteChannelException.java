package io.ktor.utils.io;

import java.io.IOException;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes11.dex */
public class ClosedByteChannelException extends IOException {
    /* JADX WARN: Multi-variable type inference failed */
    public ClosedByteChannelException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ClosedByteChannelException(@Nullable Throwable th2) {
        super(th2 != null ? th2.getMessage() : null, th2);
    }

    public /* synthetic */ ClosedByteChannelException(Throwable th2, int i10, i iVar) {
        this((i10 & 1) != 0 ? null : th2);
    }
}
