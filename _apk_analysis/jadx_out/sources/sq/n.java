package sq;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ReadLineInputStream.java */
/* JADX INFO: loaded from: classes9.dex */
public class n extends BufferedInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f84547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84548c;

    public n(InputStream inputStream) {
        super(inputStream);
    }

    public String d() throws IOException {
        mark(((BufferedInputStream) this).buf.length);
        while (true) {
            int i10 = super.read();
            int i11 = ((BufferedInputStream) this).markpos;
            if (i11 < 0) {
                throw new IOException("Buffer size exceeded: no line terminator");
            }
            if (i10 == -1) {
                ((BufferedInputStream) this).markpos = -1;
                if (((BufferedInputStream) this).pos > i11) {
                    return new String(((BufferedInputStream) this).buf, i11, ((BufferedInputStream) this).pos - i11, o.f84551c);
                }
                return null;
            }
            if (i10 == 13) {
                int i12 = ((BufferedInputStream) this).pos;
                if (!this.f84547b || i12 >= ((BufferedInputStream) this).count) {
                    this.f84548c = true;
                } else {
                    byte[] bArr = ((BufferedInputStream) this).buf;
                    int i13 = ((BufferedInputStream) this).pos;
                    if (bArr[i13] == 10) {
                        ((BufferedInputStream) this).pos = i13 + 1;
                    }
                }
                int i14 = ((BufferedInputStream) this).markpos;
                ((BufferedInputStream) this).markpos = -1;
                return new String(((BufferedInputStream) this).buf, i14, (i12 - i14) - 1, o.f84551c);
            }
            if (i10 == 10) {
                if (!this.f84548c) {
                    ((BufferedInputStream) this).markpos = -1;
                    return new String(((BufferedInputStream) this).buf, i11, (((BufferedInputStream) this).pos - i11) - 1, o.f84551c);
                }
                this.f84548c = false;
                this.f84547b = true;
                ((BufferedInputStream) this).markpos = i11 + 1;
            }
        }
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int i10;
        i10 = super.read();
        if (this.f84548c) {
            this.f84548c = false;
            if (this.f84547b && i10 == 10) {
                i10 = super.read();
            }
        }
        return i10;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f84548c && i11 > 0) {
            this.f84548c = false;
            if (this.f84547b) {
                int i12 = super.read();
                if (i12 == -1) {
                    return -1;
                }
                if (i12 != 10) {
                    bArr[i10] = (byte) (i12 & 255);
                    return super.read(bArr, i10 + 1, i11 - 1) + 1;
                }
            }
        }
        return super.read(bArr, i10, i11);
    }
}
