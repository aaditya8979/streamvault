package sq;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* JADX INFO: compiled from: ByteArrayISO8859Writer.java */
/* JADX INFO: loaded from: classes9.dex */
public class f extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f84483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f84484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f84485d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OutputStreamWriter f84486e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f84487f = false;

    public f(int i10) {
        this.f84483b = new byte[i10];
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public void d() {
        this.f84483b = null;
    }

    public void e(int i10) throws IOException {
        int i11 = this.f84484c;
        int i12 = i11 + i10;
        byte[] bArr = this.f84483b;
        if (i12 > bArr.length) {
            if (this.f84487f) {
                throw new IOException("Buffer overflow: " + this.f84483b.length);
            }
            byte[] bArr2 = new byte[((bArr.length + i10) * 4) / 3];
            System.arraycopy(bArr, 0, bArr2, 0, i11);
            this.f84483b = bArr2;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public int h() {
        return this.f84484c;
    }

    public void k(char c10) throws IOException {
        e(1);
        if (c10 < 0 || c10 > 127) {
            l(new char[]{c10}, 0, 1);
            return;
        }
        byte[] bArr = this.f84483b;
        int i10 = this.f84484c;
        this.f84484c = i10 + 1;
        bArr[i10] = (byte) c10;
    }

    public final void l(char[] cArr, int i10, int i11) throws IOException {
        g gVar = this.f84485d;
        if (gVar == null) {
            this.f84485d = new g(i11 * 2);
            this.f84486e = new OutputStreamWriter(this.f84485d, "ISO-8859-1");
        } else {
            gVar.reset();
        }
        this.f84486e.write(cArr, i10, i11);
        this.f84486e.flush();
        e(this.f84485d.getCount());
        System.arraycopy(this.f84485d.d(), 0, this.f84483b, this.f84484c, this.f84485d.getCount());
        this.f84484c += this.f84485d.getCount();
    }

    public void m(OutputStream outputStream) throws IOException {
        outputStream.write(this.f84483b, 0, this.f84484c);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        if (str == null) {
            write("null", 0, 4);
            return;
        }
        int length = str.length();
        e(length);
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 0 || cCharAt > 127) {
                l(str.toCharArray(), i10, length - i10);
                return;
            }
            byte[] bArr = this.f84483b;
            int i11 = this.f84484c;
            this.f84484c = i11 + 1;
            bArr[i11] = (byte) cCharAt;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        e(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            char cCharAt = str.charAt(i13);
            if (cCharAt < 0 || cCharAt > 127) {
                l(str.toCharArray(), i13, i11 - i12);
                return;
            }
            byte[] bArr = this.f84483b;
            int i14 = this.f84484c;
            this.f84484c = i14 + 1;
            bArr[i14] = (byte) cCharAt;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        e(cArr.length);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            if (c10 < 0 || c10 > 127) {
                l(cArr, i10, cArr.length - i10);
                return;
            }
            byte[] bArr = this.f84483b;
            int i11 = this.f84484c;
            this.f84484c = i11 + 1;
            bArr[i11] = (byte) c10;
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        e(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            char c10 = cArr[i13];
            if (c10 < 0 || c10 > 127) {
                l(cArr, i13, i11 - i12);
                return;
            }
            byte[] bArr = this.f84483b;
            int i14 = this.f84484c;
            this.f84484c = i14 + 1;
            bArr[i14] = (byte) c10;
        }
    }
}
