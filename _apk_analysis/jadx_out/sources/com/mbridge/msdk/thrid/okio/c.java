package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f40836c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public o f40837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f40838b;

    /* JADX INFO: compiled from: Buffer.java */
    public class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f40838b, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f40838b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f40838b), Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j13 = this.f40838b;
        long j14 = j11 > j13 ? j13 : j11;
        if (j10 == j14 || (oVar = this.f40837a) == null) {
            return -1L;
        }
        if (j13 - j10 < j10) {
            while (j13 > j10) {
                oVar = oVar.f40876g;
                j13 -= (long) (oVar.f40872c - oVar.f40871b);
            }
        } else {
            while (true) {
                long j15 = ((long) (oVar.f40872c - oVar.f40871b)) + j12;
                if (j15 >= j10) {
                    break;
                }
                oVar = oVar.f40875f;
                j12 = j15;
            }
            j13 = j12;
        }
        long j16 = j10;
        while (j13 < j14) {
            byte[] bArr = oVar.f40870a;
            int iMin = (int) Math.min(oVar.f40872c, (((long) oVar.f40871b) + j14) - j13);
            for (int i10 = (int) ((((long) oVar.f40871b) + j16) - j13); i10 < iMin; i10++) {
                if (bArr[i10] == b10) {
                    return ((long) (i10 - oVar.f40871b)) + j13;
                }
            }
            j13 += (long) (oVar.f40872c - oVar.f40871b);
            oVar = oVar.f40875f;
            j16 = j13;
        }
        return -1L;
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jB = sVar.b(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jB == -1) {
                return j10;
            }
            j10 += jB;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    public final c a(c cVar, long j10, long j11) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        u.a(this.f40838b, j10, j11);
        if (j11 == 0) {
            return this;
        }
        cVar.f40838b += j11;
        o oVar = this.f40837a;
        while (true) {
            long j12 = oVar.f40872c - oVar.f40871b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f40875f;
        }
        while (j11 > 0) {
            o oVarC = oVar.c();
            int i10 = (int) (((long) oVarC.f40871b) + j10);
            oVarC.f40871b = i10;
            oVarC.f40872c = Math.min(i10 + ((int) j11), oVarC.f40872c);
            o oVar2 = cVar.f40837a;
            if (oVar2 == null) {
                oVarC.f40876g = oVarC;
                oVarC.f40875f = oVarC;
                cVar.f40837a = oVarC;
            } else {
                oVar2.f40876g.a(oVarC);
            }
            j11 -= (long) (oVarC.f40872c - oVarC.f40871b);
            oVar = oVar.f40875f;
            j10 = 0;
        }
        return this;
    }

    public c a(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.a(this);
        return this;
    }

    public c a(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < 128) {
                o oVarB = b(1);
                byte[] bArr = oVarB.f40870a;
                int i12 = oVarB.f40872c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = oVarB.f40872c;
                int i15 = (i12 + i10) - i14;
                oVarB.f40872c = i14 + i15;
                this.f40838b += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    writeByte((cCharAt2 >> 6) | 192);
                    writeByte((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    writeByte((cCharAt2 >> '\f') | 224);
                    writeByte(((cCharAt2 >> 6) & 63) | 128);
                    writeByte((cCharAt2 & '?') | 128);
                } else {
                    int i16 = i10 + 1;
                    char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        writeByte(63);
                        i10 = i16;
                    } else {
                        int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        writeByte((i17 >> 18) | 240);
                        writeByte(((i17 >> 12) & 63) | 128);
                        writeByte(((i17 >> 6) & 63) | 128);
                        writeByte((i17 & 63) | 128);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public c a(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        }
        if (i11 <= str.length()) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (charset.equals(u.f40885a)) {
                return a(str, i10, i11);
            }
            byte[] bytes = str.substring(i10, i11).getBytes(charset);
            return write(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = i11;
        u.a(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            o oVarB = b(1);
            int iMin = Math.min(i12 - i10, 8192 - oVarB.f40872c);
            System.arraycopy(bArr, i10, oVarB.f40870a, oVarB.f40872c, iMin);
            i10 += iMin;
            oVarB.f40872c += iMin;
        }
        this.f40838b += j10;
        return this;
    }

    public final f a(int i10) {
        return i10 == 0 ? f.f40841e : new q(this, i10);
    }

    public String a(long j10, Charset charset) throws EOFException {
        u.a(this.f40838b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f40837a;
        int i10 = oVar.f40871b;
        if (((long) i10) + j10 > oVar.f40872c) {
            return new String(c(j10), charset);
        }
        String str = new String(oVar.f40870a, i10, (int) j10, charset);
        int i11 = (int) (((long) oVar.f40871b) + j10);
        oVar.f40871b = i11;
        this.f40838b -= j10;
        if (i11 == oVar.f40872c) {
            this.f40837a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        try {
            return a(this.f40838b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        u.a(cVar.f40838b, 0L, j10);
        while (j10 > 0) {
            o oVar = cVar.f40837a;
            if (j10 < oVar.f40872c - oVar.f40871b) {
                o oVar2 = this.f40837a;
                o oVar3 = oVar2 != null ? oVar2.f40876g : null;
                if (oVar3 != null && oVar3.f40874e) {
                    if ((((long) oVar3.f40872c) + j10) - ((long) (oVar3.f40873d ? 0 : oVar3.f40871b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        oVar.a(oVar3, (int) j10);
                        cVar.f40838b -= j10;
                        this.f40838b += j10;
                        return;
                    }
                }
                cVar.f40837a = oVar.a((int) j10);
            }
            o oVar4 = cVar.f40837a;
            long j11 = oVar4.f40872c - oVar4.f40871b;
            cVar.f40837a = oVar4.b();
            o oVar5 = this.f40837a;
            if (oVar5 == null) {
                this.f40837a = oVar4;
                oVar4.f40876g = oVar4;
                oVar4.f40875f = oVar4;
            } else {
                oVar5.f40876g.a(oVar4).a();
            }
            cVar.f40838b -= j11;
            this.f40838b += j11;
            j10 -= j11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f40838b - j10 < i11 || fVar.j() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f(((long) i12) + j10) != fVar.a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        long j11 = this.f40838b;
        if (j11 == 0) {
            return -1L;
        }
        if (j10 > j11) {
            j10 = j11;
        }
        cVar.a(this, j10);
        return j10;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws EOFException {
        return new f(c(j10));
    }

    public o b(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f40837a;
        if (oVar != null) {
            o oVar2 = oVar.f40876g;
            return (oVar2.f40872c + i10 > 8192 || !oVar2.f40874e) ? oVar2.a(p.a()) : oVar2;
        }
        o oVarA = p.a();
        this.f40837a = oVarA;
        oVarA.f40876g = oVarA;
        oVarA.f40875f = oVarA;
        return oVarA;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.f40881d;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        o oVarB = b(1);
        byte[] bArr = oVarB.f40870a;
        int i11 = oVarB.f40872c;
        oVarB.f40872c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f40838b++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        u.a(this.f40838b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        o oVarB = b(4);
        byte[] bArr = oVarB.f40870a;
        int i11 = oVarB.f40872c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        oVarB.f40872c = i14 + 1;
        this.f40838b += 4;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return h(jA);
        }
        if (j11 < size() && f(j11 - 1) == 13 && f(j11) == 10) {
            return h(j11);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.o().g() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        o oVarB = b(2);
        byte[] bArr = oVarB.f40870a;
        int i11 = oVarB.f40872c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        oVarB.f40872c = i12 + 1;
        this.f40838b += 2;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (this.f40838b < j10) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f40838b;
        if (j10 != cVar.f40838b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f40837a;
        o oVar2 = cVar.f40837a;
        int i10 = oVar.f40871b;
        int i11 = oVar2.f40871b;
        while (j11 < this.f40838b) {
            long jMin = Math.min(oVar.f40872c - i10, oVar2.f40872c - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f40870a[i10] != oVar2.f40870a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f40872c) {
                oVar = oVar.f40875f;
                i10 = oVar.f40871b;
            }
            if (i11 == oVar2.f40872c) {
                oVar2 = oVar2.f40875f;
                i11 = oVar2.f40871b;
            }
            j11 += jMin;
        }
        return true;
    }

    public final byte f(long j10) {
        u.a(this.f40838b, j10, 1L);
        long j11 = this.f40838b;
        if (j11 - j10 > j10) {
            o oVar = this.f40837a;
            while (true) {
                int i10 = oVar.f40872c;
                int i11 = oVar.f40871b;
                long j12 = i10 - i11;
                if (j10 < j12) {
                    return oVar.f40870a[i11 + ((int) j10)];
                }
                j10 -= j12;
                oVar = oVar.f40875f;
            }
        } else {
            long j13 = j10 - j11;
            o oVar2 = this.f40837a.f40876g;
            while (true) {
                int i12 = oVar2.f40872c;
                int i13 = oVar2.f40871b;
                j13 += (long) (i12 - i13);
                if (j13 >= 0) {
                    return oVar2.f40870a[i13 + ((int) j13)];
                }
                oVar2 = oVar2.f40876g;
            }
        }
    }

    public c f(int i10) {
        if (i10 < 128) {
            writeByte(i10);
        } else if (i10 < 2048) {
            writeByte((i10 >> 6) | 192);
            writeByte((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 < 55296 || i10 > 57343) {
                writeByte((i10 >> 12) | 224);
                writeByte(((i10 >> 6) & 63) | 128);
                writeByte((i10 & 63) | 128);
            } else {
                writeByte(63);
            }
        } else {
            if (i10 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
            }
            writeByte((i10 >> 18) | 240);
            writeByte(((i10 >> 12) & 63) | 128);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.f40838b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    public String g(long j10) throws EOFException {
        return a(j10, u.f40885a);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    public String h(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String strG = g(j11);
                skip(2L);
                return strG;
            }
        }
        String strG2 = g(j10);
        skip(1L);
        return strG2;
    }

    public int hashCode() {
        o oVar = this.f40837a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f40872c;
            for (int i12 = oVar.f40871b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f40870a[i12];
            }
            oVar = oVar.f40875f;
        } while (oVar != this.f40837a);
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5 A[EDGE_INSN: B:44:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:5:0x000b->B:46:?], SYNTHETIC] */
    @Override // com.mbridge.msdk.thrid.okio.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i() {
        /*
            r14 = this;
            long r0 = r14.f40838b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lac
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            com.mbridge.msdk.thrid.okio.o r6 = r14.f40837a
            byte[] r7 = r6.f40870a
            int r8 = r6.f40871b
            int r9 = r6.f40872c
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            com.mbridge.msdk.thrid.okio.c r0 = new com.mbridge.msdk.thrid.okio.c
            r0.<init>()
            com.mbridge.msdk.thrid.okio.c r0 = r0.a(r4)
            com.mbridge.msdk.thrid.okio.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.p()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            com.mbridge.msdk.thrid.okio.o r7 = r6.b()
            r14.f40837a = r7
            com.mbridge.msdk.thrid.okio.p.a(r6)
            goto L9f
        L9d:
            r6.f40871b = r8
        L9f:
            if (r1 != 0) goto La5
            com.mbridge.msdk.thrid.okio.o r6 = r14.f40837a
            if (r6 != 0) goto Lb
        La5:
            long r1 = r14.f40838b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f40838b = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.c.i():long");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o oVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = oVarB.f40870a;
        int i10 = oVarB.f40872c;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f40836c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarB.f40872c += iNumberOfTrailingZeros;
        this.f40838b += (long) iNumberOfTrailingZeros;
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.f40838b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f40838b == 0) {
            return cVar;
        }
        o oVarC = this.f40837a.c();
        cVar.f40837a = oVarC;
        oVarC.f40876g = oVarC;
        oVarC.f40875f = oVarC;
        for (o oVar = this.f40837a.f40875f; oVar != this.f40837a; oVar = oVar.f40875f) {
            cVar.f40837a.f40876g.a(oVar.c());
        }
        cVar.f40838b = this.f40838b;
        return cVar;
    }

    public final long m() {
        long j10 = this.f40838b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f40837a.f40876g;
        int i10 = oVar.f40872c;
        return (i10 >= 8192 || !oVar.f40874e) ? j10 : j10 - ((long) (i10 - oVar.f40871b));
    }

    public byte[] n() {
        try {
            return c(this.f40838b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.f40838b, u.f40885a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final f q() {
        long j10 = this.f40838b;
        if (j10 <= 2147483647L) {
            return a((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f40838b);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f40837a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f40872c - oVar.f40871b);
        byteBuffer.put(oVar.f40870a, oVar.f40871b, iMin);
        int i10 = oVar.f40871b + iMin;
        oVar.f40871b = i10;
        this.f40838b -= (long) iMin;
        if (i10 == oVar.f40872c) {
            this.f40837a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.a(bArr.length, i10, i11);
        o oVar = this.f40837a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f40872c - oVar.f40871b);
        System.arraycopy(oVar.f40870a, oVar.f40871b, bArr, i10, iMin);
        int i12 = oVar.f40871b + iMin;
        oVar.f40871b = i12;
        this.f40838b -= (long) iMin;
        if (i12 == oVar.f40872c) {
            this.f40837a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j10 = this.f40838b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f40837a;
        int i10 = oVar.f40871b;
        int i11 = oVar.f40872c;
        int i12 = i10 + 1;
        byte b10 = oVar.f40870a[i10];
        this.f40838b = j10 - 1;
        if (i12 == i11) {
            this.f40837a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f40871b = i12;
        }
        return b10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j10 = this.f40838b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f40838b);
        }
        o oVar = this.f40837a;
        int i10 = oVar.f40871b;
        int i11 = oVar.f40872c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f40870a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f40838b = j10 - 4;
        if (i17 == i11) {
            this.f40837a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f40871b = i17;
        }
        return i18;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j10 = this.f40838b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f40838b);
        }
        o oVar = this.f40837a;
        int i10 = oVar.f40871b;
        int i11 = oVar.f40872c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f40870a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f40838b = j10 - 2;
        if (i13 == i11) {
            this.f40837a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f40871b = i13;
        }
        return (short) i14;
    }

    public final long size() {
        return this.f40838b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            if (this.f40837a == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, r0.f40872c - r0.f40871b);
            long j11 = iMin;
            this.f40838b -= j11;
            j10 -= j11;
            o oVar = this.f40837a;
            int i10 = oVar.f40871b + iMin;
            oVar.f40871b = i10;
            if (i10 == oVar.f40872c) {
                this.f40837a = oVar.b();
                p.a(oVar);
            }
        }
    }

    public String toString() {
        return q().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            o oVarB = b(1);
            int iMin = Math.min(i10, 8192 - oVarB.f40872c);
            byteBuffer.get(oVarB.f40870a, oVarB.f40872c, iMin);
            i10 -= iMin;
            oVarB.f40872c += iMin;
        }
        this.f40838b += (long) iRemaining;
        return iRemaining;
    }
}
