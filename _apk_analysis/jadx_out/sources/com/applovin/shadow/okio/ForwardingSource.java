package com.applovin.shadow.okio;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class ForwardingSource implements Source {

    @NotNull
    private final Source delegate;

    public ForwardingSource(@NotNull Source source) {
        p.k(source, "delegate");
        this.delegate = source;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m4274deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final Source delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(@NotNull Buffer buffer, long j10) throws IOException {
        p.k(buffer, "sink");
        return this.delegate.read(buffer, j10);
    }

    @Override // com.applovin.shadow.okio.Source
    @NotNull
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
