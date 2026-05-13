package com.bytedance.sdk.component.vt.ouw.vt;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw implements lh, vt, Cloneable, ByteChannel {
    public static final byte[] ouw = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public long f12832lh;
    public fkw vt;

    private ouw ouw(byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = i11;
        bly.ouw(bArr.length, 0L, j10);
        int i12 = i11 + 0;
        while (i10 < i12) {
            fkw fkwVarLh = lh(1);
            int iMin = Math.min(i12 - i10, 8192 - fkwVarLh.f12830lh);
            System.arraycopy(bArr, i10, fkwVarLh.ouw, fkwVarLh.f12830lh, iMin);
            i10 += iMin;
            fkwVarLh.f12830lh += iMin;
        }
        this.f12832lh += j10;
        return this;
    }

    private void ouw(byte[] bArr) throws EOFException {
        int iMin;
        int i10 = 0;
        while (i10 < bArr.length) {
            int length = bArr.length - i10;
            bly.ouw(bArr.length, i10, length);
            fkw fkwVar = this.vt;
            if (fkwVar == null) {
                iMin = -1;
            } else {
                iMin = Math.min(length, fkwVar.f12830lh - fkwVar.vt);
                System.arraycopy(fkwVar.ouw, fkwVar.vt, bArr, i10, iMin);
                int i11 = fkwVar.vt + iMin;
                fkwVar.vt = i11;
                this.f12832lh -= (long) iMin;
                if (i11 == fkwVar.f12830lh) {
                    this.vt = fkwVar.vt();
                    le.ouw(fkwVar);
                }
            }
            if (iMin == -1) {
                throw new EOFException();
            }
            i10 += iMin;
        }
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        ouw ouwVar = new ouw();
        if (this.f12832lh == 0) {
            return ouwVar;
        }
        fkw fkwVarOuw = this.vt.ouw();
        ouwVar.vt = fkwVarOuw;
        fkwVarOuw.f12831ra = fkwVarOuw;
        fkwVarOuw.f12829le = fkwVarOuw;
        fkw fkwVar = this.vt;
        while (true) {
            fkwVar = fkwVar.f12829le;
            if (fkwVar == this.vt) {
                ouwVar.f12832lh = this.f12832lh;
                return ouwVar;
            }
            ouwVar.vt.f12831ra.ouw(fkwVar.ouw());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouw)) {
            return false;
        }
        ouw ouwVar = (ouw) obj;
        long j10 = this.f12832lh;
        if (j10 != ouwVar.f12832lh) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        fkw fkwVar = this.vt;
        fkw fkwVar2 = ouwVar.vt;
        int i10 = fkwVar.vt;
        int i11 = fkwVar2.vt;
        while (j11 < this.f12832lh) {
            long jMin = Math.min(fkwVar.f12830lh - i10, fkwVar2.f12830lh - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (fkwVar.ouw[i10] != fkwVar2.ouw[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == fkwVar.f12830lh) {
                fkwVar = fkwVar.f12829le;
                i10 = fkwVar.vt;
            }
            if (i11 == fkwVar2.f12830lh) {
                fkwVar2 = fkwVar2.f12829le;
                i11 = fkwVar2.vt;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = fkwVar.f12830lh;
            for (int i12 = fkwVar.vt; i12 < i11; i12++) {
                i10 = (i10 * 31) + fkwVar.ouw[i12];
            }
            fkwVar = fkwVar.f12829le;
        } while (fkwVar != this.vt);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final fkw lh(int i10) {
        if (i10 <= 0 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        fkw fkwVar = this.vt;
        if (fkwVar != null) {
            fkw fkwVar2 = fkwVar.f12831ra;
            return (fkwVar2.f12830lh + i10 > 8192 || !fkwVar2.fkw) ? fkwVar2.ouw(le.ouw()) : fkwVar2;
        }
        fkw fkwVarOuw = le.ouw();
        this.vt = fkwVarOuw;
        fkwVarOuw.f12831ra = fkwVarOuw;
        fkwVarOuw.f12829le = fkwVarOuw;
        return fkwVarOuw;
    }

    public final String lh() {
        try {
            long j10 = this.f12832lh;
            Charset charset = bly.ouw;
            bly.ouw(j10, 0L, j10);
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (j10 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
            }
            if (j10 == 0) {
                return "";
            }
            fkw fkwVar = this.vt;
            int i10 = fkwVar.vt;
            if (((long) i10) + j10 > fkwVar.f12830lh) {
                bly.ouw(this.f12832lh, 0L, j10);
                if (j10 > 2147483647L) {
                    throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
                }
                byte[] bArr = new byte[(int) j10];
                ouw(bArr);
                return new String(bArr, charset);
            }
            String str = new String(fkwVar.ouw, i10, (int) j10, charset);
            int i11 = (int) (((long) fkwVar.vt) + j10);
            fkwVar.vt = i11;
            this.f12832lh -= j10;
            if (i11 == fkwVar.f12830lh) {
                this.vt = fkwVar.vt();
                le.ouw(fkwVar);
            }
            return str;
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final ouw ouw(int i10) {
        if (i10 < 128) {
            vt(i10);
        } else if (i10 < 2048) {
            vt((i10 >> 6) | 192);
            vt((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 < 55296 || i10 > 57343) {
                vt((i10 >> 12) | 224);
                vt(((i10 >> 6) & 63) | 128);
                vt((i10 & 63) | 128);
            } else {
                vt(63);
            }
        } else {
            if (i10 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
            }
            vt((i10 >> 18) | 240);
            vt(((i10 >> 12) & 63) | 128);
            vt(((i10 >> 6) & 63) | 128);
            vt((i10 & 63) | 128);
        }
        return this;
    }

    public final ouw ouw(String str) {
        return ouw(str, 0, str.length());
    }

    public final ouw ouw(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
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
                fkw fkwVarLh = lh(1);
                byte[] bArr = fkwVarLh.ouw;
                int i12 = fkwVarLh.f12830lh - i10;
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
                int i14 = fkwVarLh.f12830lh;
                int i15 = (i12 + i10) - i14;
                fkwVarLh.f12830lh = i14 + i15;
                this.f12832lh += (long) i15;
            } else {
                if (cCharAt2 < 2048) {
                    vt((cCharAt2 >> 6) | 192);
                    vt((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    vt((cCharAt2 >> '\f') | 224);
                    vt(((cCharAt2 >> 6) & 63) | 128);
                    vt((cCharAt2 & '?') | 128);
                } else {
                    int i16 = i10 + 1;
                    char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        vt(63);
                        i10 = i16;
                    } else {
                        int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        vt((i17 >> 18) | 240);
                        vt(((i17 >> 12) & 63) | 128);
                        vt(((i17 >> 6) & 63) | 128);
                        vt((i17 & 63) | 128);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    public final ouw ouw(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
        }
        if (i11 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(bly.ouw)) {
            return ouw(str, i10, i11);
        }
        byte[] bytes = str.substring(i10, i11).getBytes(charset);
        return ouw(bytes, 0, bytes.length);
    }

    public final boolean ouw() {
        return this.f12832lh == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        fkw fkwVar = this.vt;
        if (fkwVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fkwVar.f12830lh - fkwVar.vt);
        byteBuffer.put(fkwVar.ouw, fkwVar.vt, iMin);
        int i10 = fkwVar.vt + iMin;
        fkwVar.vt = i10;
        this.f12832lh -= (long) iMin;
        if (i10 == fkwVar.f12830lh) {
            this.vt = fkwVar.vt();
            le.ouw(fkwVar);
        }
        return iMin;
    }

    public final String toString() {
        long j10 = this.f12832lh;
        if (j10 <= 2147483647L) {
            int i10 = (int) j10;
            return (i10 == 0 ? yu.f12834lh : new ra(this, i10)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f12832lh);
    }

    public final byte vt() {
        long j10 = this.f12832lh;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        fkw fkwVar = this.vt;
        int i10 = fkwVar.vt;
        int i11 = fkwVar.f12830lh;
        int i12 = i10 + 1;
        byte b10 = fkwVar.ouw[i10];
        this.f12832lh = j10 - 1;
        if (i12 == i11) {
            this.vt = fkwVar.vt();
            le.ouw(fkwVar);
        } else {
            fkwVar.vt = i12;
        }
        return b10;
    }

    public final ouw vt(int i10) {
        fkw fkwVarLh = lh(1);
        byte[] bArr = fkwVarLh.ouw;
        int i11 = fkwVarLh.f12830lh;
        fkwVarLh.f12830lh = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f12832lh++;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            fkw fkwVarLh = lh(1);
            int iMin = Math.min(i10, 8192 - fkwVarLh.f12830lh);
            byteBuffer.get(fkwVarLh.ouw, fkwVarLh.f12830lh, iMin);
            i10 -= iMin;
            fkwVarLh.f12830lh += iMin;
        }
        this.f12832lh += (long) iRemaining;
        return iRemaining;
    }
}
