package io.ktor.utils.io;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ByteChannel.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class ConcurrentIOException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentIOException(@NotNull String str, @Nullable Throwable th2) {
        super("Concurrent " + str + " attempts", th2);
        p.k(str, "taskName");
    }

    public /* synthetic */ ConcurrentIOException(String str, Throwable th2, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? null : th2);
    }
}
