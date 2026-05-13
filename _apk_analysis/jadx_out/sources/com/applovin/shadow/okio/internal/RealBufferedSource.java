package com.applovin.shadow.okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import bo.a;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.PeekSource;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class RealBufferedSource {
    public static final void commonClose(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        p.k(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        p.k(realBufferedSource, "<this>");
        if (!realBufferedSource.closed) {
            return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, byte b10, long j10, long j11) {
        p.k(realBufferedSource, "<this>");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (!(0 <= j10 && j10 <= j11)) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(b10, j10, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j11 || realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull ByteString byteString, long j10) throws IOException {
        p.k(realBufferedSource, "<this>");
        p.k(byteString, "bytes");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(byteString, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) byteString.size())) + 1);
        }
    }

    public static final long commonIndexOfElement(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull ByteString byteString, long j10) {
        p.k(realBufferedSource, "<this>");
        p.k(byteString, "targetBytes");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        p.k(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10, @NotNull ByteString byteString, int i10, int i11) {
        p.k(realBufferedSource, "<this>");
        p.k(byteString, "bytes");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || byteString.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!realBufferedSource.request(1 + j11) || realBufferedSource.bufferField.getByte(j11) != byteString.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull byte[] bArr, int i10, int i11) {
        p.k(realBufferedSource, "<this>");
        p.k(bArr, "sink");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, j10);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(bArr, i10, (int) Math.min(j10, realBufferedSource.bufferField.size()));
    }

    public static final long commonRead(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Buffer buffer, long j10) {
        p.k(realBufferedSource, "<this>");
        p.k(buffer, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(buffer, Math.min(j10, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Sink sink) throws IOException {
        p.k(realBufferedSource, "<this>");
        p.k(sink, "sink");
        long j10 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j10;
        }
        long size = j10 + realBufferedSource.bufferField.size();
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteArray(j10);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteString(j10);
    }

    public static final long commonReadDecimalLong(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!realBufferedSource.request(j11)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                break;
            }
            j10 = j11;
        }
        if (j10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected a digit or '-' but was 0x");
            String string = Integer.toString(b10, a.a(a.a(16)));
            p.j(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Buffer buffer, long j10) throws IOException {
        p.k(realBufferedSource, "<this>");
        p.k(buffer, "sink");
        try {
            realBufferedSource.require(j10);
            realBufferedSource.bufferField.readFully(buffer, j10);
        } catch (EOFException e10) {
            buffer.writeAll(realBufferedSource.bufferField);
            throw e10;
        }
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull byte[] bArr) throws EOFException {
        p.k(realBufferedSource, "<this>");
        p.k(bArr, "sink");
        try {
            realBufferedSource.require(bArr.length);
            realBufferedSource.bufferField.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i11 = buffer.read(bArr, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        byte b10;
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!realBufferedSource.request(i11)) {
                break;
            }
            b10 = realBufferedSource.bufferField.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(b10, a.a(a.a(16)));
            p.j(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws IOException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) throws EOFException {
        p.k(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b10 = realBufferedSource.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b10 & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b10 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        p.k(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        p.k(realBufferedSource, "<this>");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && realBufferedSource.request(j11) && realBufferedSource.bufferField.getByte(j11 - 1) == 13 && realBufferedSource.request(1 + j11) && realBufferedSource.bufferField.getByte(j11) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j11);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j10) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) {
        p.k(realBufferedSource, "<this>");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (realBufferedSource.bufferField.size() < j10) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        p.k(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, @NotNull Options options) throws EOFException {
        p.k(realBufferedSource, "<this>");
        p.k(options, "options");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
        return -1;
    }

    public static final void commonSkip(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        p.k(realBufferedSource, "<this>");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        p.k(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    @NotNull
    public static final String commonToString(@NotNull com.applovin.shadow.okio.RealBufferedSource realBufferedSource) {
        p.k(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }
}
