package com.applovin.shadow.okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class GzipSink implements Sink {
    private boolean closed;

    @NotNull
    private final CRC32 crc;

    @NotNull
    private final Deflater deflater;

    @NotNull
    private final DeflaterSink deflaterSink;

    @NotNull
    private final RealBufferedSink sink;

    public GzipSink(@NotNull Sink sink) {
        p.k(sink, "sink");
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    private final void updateCrc(Buffer buffer, long j10) {
        Segment segment = buffer.head;
        p.h(segment);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, iMin);
            j10 -= (long) iMin;
            segment = segment.next;
            p.h(segment);
        }
    }

    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    @NotNull
    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m4276deprecated_deflater() {
        return this.deflater;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            this.deflaterSink.finishDeflate$okio();
            writeFooter();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.deflater.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @NotNull
    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    @NotNull
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(@NotNull Buffer buffer, long j10) throws IOException {
        p.k(buffer, "source");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        updateCrc(buffer, j10);
        this.deflaterSink.write(buffer, j10);
    }
}
