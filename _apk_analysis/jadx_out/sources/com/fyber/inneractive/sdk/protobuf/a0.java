package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final OutputStream f19092g;

    public a0(OutputStream outputStream, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f19089d = new byte[iMax];
        this.f19090e = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f19092g = outputStream;
    }

    public final void a() {
        this.f19092g.write(this.f19089d, 0, this.f19091f);
        this.f19091f = 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b10) {
        if (this.f19091f == this.f19090e) {
            a();
        }
        byte[] bArr = this.f19089d;
        int i10 = this.f19091f;
        this.f19091f = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, int i11) {
        j(14);
        e(i10, 5);
        h(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, long j10) {
        j(18);
        e(i10, 1);
        e(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var) {
        c(1, 3);
        d(2, i10);
        c(3, 2);
        a(d2Var);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var, t2 t2Var) {
        c(i10, 2);
        int serializedSize = ((b) d2Var).getSerializedSize(t2Var);
        j(5);
        i(serializedSize);
        t2Var.a((Object) d2Var, this.f19102a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, s sVar) {
        c(i10, 2);
        b(sVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, boolean z10) {
        j(11);
        e(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f19089d;
        int i11 = this.f19091f;
        this.f19091f = i11 + 1;
        bArr[i11] = b10;
    }

    public final void a(d2 d2Var) {
        int serializedSize = d2Var.getSerializedSize();
        j(5);
        i(serializedSize);
        d2Var.writeTo(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i10) throws IOException {
        c(i10, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, int i11) {
        j(20);
        e(i10, 0);
        if (i11 >= 0) {
            i(i11);
        } else {
            f(i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, long j10) {
        j(20);
        e(i10, 0);
        f(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, s sVar) {
        c(1, 3);
        d(2, i10);
        c(3, 2);
        b(sVar);
        c(1, 4);
    }

    public final void b(s sVar) {
        int size = sVar.size();
        j(5);
        i(size);
        sVar.a(this);
    }

    public final void b(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iC = b0.c(length);
            int i10 = iC + length;
            int i11 = this.f19090e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iA = d4.f19118a.a(str, bArr, 0, length);
                j(5);
                i(iA);
                b(bArr, 0, iA);
                return;
            }
            if (i10 > i11 - this.f19091f) {
                a();
            }
            int iC2 = b0.c(str.length());
            int i12 = this.f19091f;
            try {
                if (iC2 == iC) {
                    int i13 = i12 + iC2;
                    this.f19091f = i13;
                    int iA2 = d4.f19118a.a(str, this.f19089d, i13, this.f19090e - i13);
                    this.f19091f = i12;
                    i((iA2 - i12) - iC2);
                    this.f19091f = iA2;
                } else {
                    int iA3 = d4.a(str);
                    i(iA3);
                    this.f19091f = d4.f19118a.a(str, this.f19089d, this.f19091f, iA3);
                }
            } catch (b4 e10) {
                this.f19091f = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new z(e11);
            }
        } catch (b4 e12) {
            a(str, e12);
        }
    }

    public final void b(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f19090e;
        int i13 = this.f19091f;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.f19089d, i13, i11);
            this.f19091f += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.f19089d, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f19091f = this.f19090e;
        a();
        if (i16 > this.f19090e) {
            this.f19092g.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, this.f19089d, 0, i16);
            this.f19091f = i16;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i10, int i11) {
        j(5);
        i((i10 << 3) | i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j10) {
        j(8);
        e(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i10, int i11) {
        j(20);
        e(i10, 0);
        i(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j10) {
        j(10);
        f(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i10) {
        j(4);
        h(i10);
    }

    public final void e(int i10, int i11) {
        i((i10 << 3) | i11);
    }

    public final void e(long j10) {
        byte[] bArr = this.f19089d;
        int i10 = this.f19091f;
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j10 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
        this.f19091f = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i10) {
        if (i10 >= 0) {
            j(5);
            i(i10);
        } else {
            j(10);
            f(i10);
        }
    }

    public final void f(long j10) {
        if (!b0.f19101c) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f19089d;
                int i10 = this.f19091f;
                this.f19091f = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f19089d;
            int i11 = this.f19091f;
            this.f19091f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while ((j10 & (-128)) != 0) {
            byte[] bArr3 = this.f19089d;
            int i12 = this.f19091f;
            this.f19091f = i12 + 1;
            x3.f19289c.a((Object) bArr3, x3.f19292f + ((long) i12), (byte) ((((int) j10) & 127) | 128));
            j10 >>>= 7;
        }
        byte[] bArr4 = this.f19089d;
        int i13 = this.f19091f;
        this.f19091f = i13 + 1;
        x3.f19289c.a((Object) bArr4, x3.f19292f + ((long) i13), (byte) j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i10) {
        j(5);
        i(i10);
    }

    public final void h(int i10) {
        byte[] bArr = this.f19089d;
        int i11 = this.f19091f;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.f19091f = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
    }

    public final void i(int i10) {
        if (!b0.f19101c) {
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f19089d;
                int i11 = this.f19091f;
                this.f19091f = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f19089d;
            int i12 = this.f19091f;
            this.f19091f = i12 + 1;
            bArr2[i12] = (byte) i10;
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.f19089d;
            int i13 = this.f19091f;
            this.f19091f = i13 + 1;
            x3.f19289c.a((Object) bArr3, x3.f19292f + ((long) i13), (byte) ((i10 & 127) | 128));
            i10 >>>= 7;
        }
        byte[] bArr4 = this.f19089d;
        int i14 = this.f19091f;
        this.f19091f = i14 + 1;
        x3.f19289c.a((Object) bArr4, x3.f19292f + ((long) i14), (byte) i10);
    }

    public final void j(int i10) {
        if (this.f19090e - this.f19091f < i10) {
            a();
        }
    }
}
