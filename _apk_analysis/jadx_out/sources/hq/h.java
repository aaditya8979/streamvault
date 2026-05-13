package hq;

import hq.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import sq.o;

/* JADX INFO: compiled from: ByteArrayBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public class h extends hq.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f63601o = Integer.getInteger("org.eclipse.jetty.io.ByteArrayBuffer.MAX_WRITE", 131072).intValue();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final byte[] f63602n;

    /* JADX INFO: compiled from: ByteArrayBuffer.java */
    public static class a extends h implements d.a {
        public a(String str) {
            super(str);
        }

        public a(byte[] bArr, int i10, int i11, int i12) {
            super(bArr, i10, i11, i12);
        }

        @Override // hq.h, hq.a
        public boolean equals(Object obj) {
            return (obj instanceof d) && R((d) obj);
        }
    }

    public h(int i10) {
        this(new byte[i10], 0, 0, 2);
        X(0);
    }

    public h(int i10, int i11, boolean z10) {
        this(new byte[i10], 0, 0, i11, z10);
    }

    public h(String str) {
        super(2, false);
        byte[] bArrC = o.c(str);
        this.f63602n = bArrC;
        l0(0);
        X(bArrC.length);
        this.f63577b = 0;
        this.f63585j = str;
    }

    public h(String str, String str2) throws UnsupportedEncodingException {
        super(2, false);
        byte[] bytes = str.getBytes(str2);
        this.f63602n = bytes;
        l0(0);
        X(bytes.length);
        this.f63577b = 0;
        this.f63585j = str;
    }

    public h(byte[] bArr) {
        this(bArr, 0, bArr.length, 2);
    }

    public h(byte[] bArr, int i10, int i11) {
        this(bArr, i10, i11, 2);
    }

    public h(byte[] bArr, int i10, int i11, int i12) {
        super(2, false);
        this.f63602n = bArr;
        X(i11 + i10);
        l0(i10);
        this.f63577b = i12;
    }

    public h(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        super(2, z10);
        this.f63602n = bArr;
        X(i11 + i10);
        l0(i10);
        this.f63577b = i12;
    }

    @Override // hq.d
    public void I(int i10, byte b10) {
        this.f63602n[i10] = b10;
    }

    @Override // hq.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        if ((i10 + i12 > e0() && (i12 = e0() - i10) == 0) || i12 < 0) {
            return -1;
        }
        System.arraycopy(this.f63602n, i10, bArr, i11, i12);
        return i12;
    }

    @Override // hq.a, hq.d
    public int K(InputStream inputStream, int i10) throws IOException {
        if (i10 < 0 || i10 > L()) {
            i10 = L();
        }
        int iT = T();
        int i11 = 0;
        int i12 = i10;
        int i13 = 0;
        while (i11 < i10) {
            i13 = inputStream.read(this.f63602n, iT, i12);
            if (i13 < 0) {
                break;
            }
            if (i13 > 0) {
                iT += i13;
                i11 += i13;
                i12 -= i13;
                X(iT);
            }
            if (inputStream.available() <= 0) {
                break;
            }
        }
        if (i13 >= 0 || i11 != 0) {
            return i11;
        }
        return -1;
    }

    @Override // hq.a, hq.d
    public int L() {
        return this.f63602n.length - this.f63580e;
    }

    @Override // hq.a, hq.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        this.f63581f = 0;
        if (i10 + i12 > e0()) {
            i12 = e0() - i10;
        }
        System.arraycopy(bArr, i11, this.f63602n, i10, i12);
        return i12;
    }

    @Override // hq.d
    public byte Q(int i10) {
        return this.f63602n[i10];
    }

    @Override // hq.a, hq.d
    public boolean R(d dVar) {
        int i10;
        if (dVar == this) {
            return true;
        }
        if (dVar == null || dVar.length() != length()) {
            return false;
        }
        int i11 = this.f63581f;
        if (i11 != 0 && (dVar instanceof hq.a) && (i10 = ((hq.a) dVar).f63581f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        byte[] bArrW = dVar.W();
        if (bArrW != null) {
            int iT2 = T();
            while (true) {
                int i12 = iT2 - 1;
                if (iT2 <= index) {
                    break;
                }
                byte b10 = this.f63602n[i12];
                iT--;
                byte b11 = bArrW[iT];
                if (b10 != b11) {
                    if (97 <= b10 && b10 <= 122) {
                        b10 = (byte) ((b10 - 97) + 65);
                    }
                    if (97 <= b11 && b11 <= 122) {
                        b11 = (byte) ((b11 - 97) + 65);
                    }
                    if (b10 != b11) {
                        return false;
                    }
                }
                iT2 = i12;
            }
        } else {
            int iT3 = T();
            while (true) {
                int i13 = iT3 - 1;
                if (iT3 <= index) {
                    break;
                }
                byte b12 = this.f63602n[i13];
                iT--;
                byte bQ = dVar.Q(iT);
                if (b12 != bQ) {
                    if (97 <= b12 && b12 <= 122) {
                        b12 = (byte) ((b12 - 97) + 65);
                    }
                    if (97 <= bQ && bQ <= 122) {
                        bQ = (byte) ((bQ - 97) + 65);
                    }
                    if (b12 != bQ) {
                        return false;
                    }
                }
                iT3 = i13;
            }
        }
        return true;
    }

    @Override // hq.a, hq.d
    public int U(int i10, d dVar) {
        int i11 = 0;
        this.f63581f = 0;
        int length = dVar.length();
        if (i10 + length > e0()) {
            length = e0() - i10;
        }
        byte[] bArrW = dVar.W();
        if (bArrW != null) {
            System.arraycopy(bArrW, dVar.getIndex(), this.f63602n, i10, length);
        } else {
            int index = dVar.getIndex();
            while (i11 < length) {
                this.f63602n[i10] = dVar.Q(index);
                i11++;
                i10++;
                index++;
            }
        }
        return length;
    }

    @Override // hq.d
    public byte[] W() {
        return this.f63602n;
    }

    @Override // hq.a, hq.d
    public void c0() {
        if (isReadOnly()) {
            throw new IllegalStateException("READONLY");
        }
        int iI0 = i0() >= 0 ? i0() : getIndex();
        if (iI0 > 0) {
            int iT = T() - iI0;
            if (iT > 0) {
                byte[] bArr = this.f63602n;
                System.arraycopy(bArr, iI0, bArr, 0, iT);
            }
            if (i0() > 0) {
                V(i0() - iI0);
            }
            l0(getIndex() - iI0);
            X(T() - iI0);
        }
    }

    @Override // hq.d
    public int e0() {
        return this.f63602n.length;
    }

    @Override // hq.a
    public boolean equals(Object obj) {
        int i10;
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (obj instanceof d.a) {
            return R((d) obj);
        }
        d dVar = (d) obj;
        if (dVar.length() != length()) {
            return false;
        }
        int i11 = this.f63581f;
        if (i11 != 0 && (obj instanceof hq.a) && (i10 = ((hq.a) obj).f63581f) != 0 && i11 != i10) {
            return false;
        }
        int index = getIndex();
        int iT = dVar.T();
        int iT2 = T();
        while (true) {
            int i12 = iT2 - 1;
            if (iT2 <= index) {
                return true;
            }
            iT--;
            if (this.f63602n[i12] != dVar.Q(iT)) {
                return false;
            }
            iT2 = i12;
        }
    }

    @Override // hq.a, hq.d
    public byte get() {
        byte[] bArr = this.f63602n;
        int i10 = this.f63579d;
        this.f63579d = i10 + 1;
        return bArr[i10];
    }

    @Override // hq.a
    public int hashCode() {
        if (this.f63581f == 0 || this.f63582g != this.f63579d || this.f63583h != this.f63580e) {
            int index = getIndex();
            int iT = T();
            while (true) {
                int i10 = iT - 1;
                if (iT <= index) {
                    break;
                }
                byte b10 = this.f63602n[i10];
                if (97 <= b10 && b10 <= 122) {
                    b10 = (byte) ((b10 - 97) + 65);
                }
                this.f63581f = (this.f63581f * 31) + b10;
                iT = i10;
            }
            if (this.f63581f == 0) {
                this.f63581f = -1;
            }
            this.f63582g = this.f63579d;
            this.f63583h = this.f63580e;
        }
        return this.f63581f;
    }

    @Override // hq.a, hq.d
    public void writeTo(OutputStream outputStream) throws IOException {
        int length = length();
        int i10 = f63601o;
        if (i10 <= 0 || length <= i10) {
            outputStream.write(this.f63602n, getIndex(), length);
        } else {
            int index = getIndex();
            while (length > 0) {
                int i11 = f63601o;
                if (length <= i11) {
                    i11 = length;
                }
                outputStream.write(this.f63602n, index, i11);
                index += i11;
                length -= i11;
            }
        }
        if (Z()) {
            return;
        }
        clear();
    }
}
