package okio;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ForwardingSink implements Sink {

    @NotNull
    private final Sink delegate;

    public ForwardingSink(@NotNull Sink sink) {
        p.k(sink, "delegate");
        this.delegate = sink;
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final Sink m7695deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final Sink delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.Sink
    public void write(@NotNull Buffer buffer, long j10) throws IOException {
        p.k(buffer, "source");
        this.delegate.write(buffer, j10);
    }
}
