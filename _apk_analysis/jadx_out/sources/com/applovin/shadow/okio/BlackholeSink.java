package com.applovin.shadow.okio;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes8.dex */
final class BlackholeSink implements Sink {
    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.Sink
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(@NotNull Buffer buffer, long j10) throws EOFException {
        p.k(buffer, "source");
        buffer.skip(j10);
    }
}
