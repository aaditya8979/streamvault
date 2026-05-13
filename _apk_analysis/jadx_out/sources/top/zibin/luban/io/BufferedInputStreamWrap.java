package top.zibin.luban.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import ws.b;

/* JADX INFO: loaded from: classes7.dex */
public class BufferedInputStreamWrap extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f85376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f85377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f85378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85380f;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561759L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public BufferedInputStreamWrap(InputStream inputStream) {
        this(inputStream, 65536);
    }

    public BufferedInputStreamWrap(InputStream inputStream, int i10) {
        super(inputStream);
        this.f85379e = -1;
        this.f85376b = b.d().c(i10);
    }

    public static IOException d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f85379e;
        if (i10 != -1) {
            int i11 = this.f85380f - i10;
            int i12 = this.f85378d;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f85377c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArrC = b.d().c(i12);
                    System.arraycopy(bArr, 0, bArrC, 0, bArr.length);
                    this.f85376b = bArrC;
                    b.d().g(bArr);
                    bArr = bArrC;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f85380f - this.f85379e;
                this.f85380f = i13;
                this.f85379e = 0;
                this.f85377c = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f85380f;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f85377c = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f85379e = -1;
            this.f85380f = 0;
            this.f85377c = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream = ((FilterInputStream) this).in;
        if (this.f85376b != null && inputStream != null) {
            return (this.f85377c - this.f85380f) + inputStream.available();
        }
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f85376b != null) {
            b.d().g(this.f85376b);
            this.f85376b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        this.f85378d = Math.max(this.f85378d, i10);
        this.f85379e = this.f85380f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f85376b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw d();
        }
        if (this.f85380f >= this.f85377c && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f85376b && (bArr = this.f85376b) == null) {
            throw d();
        }
        int i10 = this.f85377c;
        int i11 = this.f85380f;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f85380f = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int iMin;
        byte[] bArr2 = this.f85376b;
        if (bArr2 == null) {
            throw d();
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i13 = this.f85380f;
        int i14 = this.f85377c;
        if (i13 < i14) {
            int iMin2 = Math.min(i14 - i13, i11);
            System.arraycopy(bArr2, this.f85380f, bArr, i10, iMin2);
            this.f85380f += iMin2;
            if (iMin2 == i11 || inputStream.available() == 0) {
                return iMin2;
            }
            i10 += iMin2;
            i12 = i11 - iMin2;
        } else {
            i12 = i11;
        }
        while (true) {
            if (this.f85379e == -1 && i12 >= bArr2.length) {
                iMin = inputStream.read(bArr, i10, i12);
                if (iMin == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
            } else {
                if (a(inputStream, bArr2) == -1) {
                    return i12 != i11 ? i11 - i12 : -1;
                }
                if (bArr2 != this.f85376b && (bArr2 = this.f85376b) == null) {
                    throw d();
                }
                iMin = Math.min(this.f85377c - this.f85380f, i12);
                System.arraycopy(bArr2, this.f85380f, bArr, i10, iMin);
                this.f85380f += iMin;
            }
            i12 -= iMin;
            if (i12 == 0) {
                return i11;
            }
            if (inputStream.available() == 0) {
                return i11 - i12;
            }
            i10 += iMin;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f85376b == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f85379e;
        if (-1 == i10) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f85380f + " markLimit: " + this.f85378d);
        }
        this.f85380f = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f85376b;
        if (bArr == null) {
            throw d();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw d();
        }
        int i10 = this.f85377c;
        int i11 = this.f85380f;
        if (i10 - i11 >= j10) {
            this.f85380f = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f85380f = i10;
        if (this.f85379e == -1 || j10 > this.f85378d) {
            return j11 + inputStream.skip(j10 - j11);
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f85377c;
        int i13 = this.f85380f;
        if (i12 - i13 >= j10 - j11) {
            this.f85380f = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f85380f = i12;
        return j12;
    }
}
