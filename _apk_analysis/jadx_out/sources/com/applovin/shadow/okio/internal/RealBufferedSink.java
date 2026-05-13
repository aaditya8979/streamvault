package com.applovin.shadow.okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RealBufferedSink {
    public static final void commonClose(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws Throwable {
        p.k(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        realBufferedSink.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @NotNull
    public static final BufferedSink commonEmit(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    @NotNull
    public static final BufferedSink commonEmitCompleteSegments(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink) throws IOException {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        p.k(realBufferedSink, "<this>");
        return realBufferedSink.sink.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink) {
        p.k(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull ByteString byteString) {
        p.k(realBufferedSink, "<this>");
        p.k(byteString, "byteString");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(byteString);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull ByteString byteString, int i10, int i11) {
        p.k(realBufferedSink, "<this>");
        p.k(byteString, "byteString");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(byteString, i10, i11);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull Source source, long j10) throws IOException {
        p.k(realBufferedSink, "<this>");
        p.k(source, "source");
        while (j10 > 0) {
            long j11 = source.read(realBufferedSink.bufferField, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
            realBufferedSink.emitCompleteSegments();
        }
        return realBufferedSink;
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull byte[] bArr) {
        p.k(realBufferedSink, "<this>");
        p.k(bArr, "source");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(bArr);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWrite(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull byte[] bArr, int i10, int i11) {
        p.k(realBufferedSink, "<this>");
        p.k(bArr, "source");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(bArr, i10, i11);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final void commonWrite(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull Buffer buffer, long j10) throws IOException {
        p.k(realBufferedSink, "<this>");
        p.k(buffer, "source");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(buffer, j10);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull Source source) throws IOException {
        p.k(realBufferedSink, "<this>");
        p.k(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(realBufferedSink.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            realBufferedSink.emitCompleteSegments();
        }
    }

    @NotNull
    public static final BufferedSink commonWriteByte(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeByte(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteDecimalLong(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeDecimalLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteHexadecimalUnsignedLong(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteInt(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeInt(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteIntLe(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeIntLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLong(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteLongLe(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, long j10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLongLe(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShort(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShort(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteShortLe(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShortLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull String str) {
        p.k(realBufferedSink, "<this>");
        p.k(str, TypedValues.Custom.S_STRING);
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(str);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, @NotNull String str, int i10, int i11) {
        p.k(realBufferedSink, "<this>");
        p.k(str, TypedValues.Custom.S_STRING);
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(str, i10, i11);
        return realBufferedSink.emitCompleteSegments();
    }

    @NotNull
    public static final BufferedSink commonWriteUtf8CodePoint(@NotNull com.applovin.shadow.okio.RealBufferedSink realBufferedSink, int i10) {
        p.k(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i10);
        return realBufferedSink.emitCompleteSegments();
    }
}
