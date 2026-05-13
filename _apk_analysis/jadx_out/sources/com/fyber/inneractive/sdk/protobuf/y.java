package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f19295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19297f;

    public y(int i10, byte[] bArr) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f19295d = bArr;
        this.f19297f = 0;
        this.f19296e = i10;
    }

    public final int a() {
        return this.f19296e - this.f19297f;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b10) throws z {
        try {
            byte[] bArr = this.f19295d;
            int i10 = this.f19297f;
            this.f19297f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19297f), Integer.valueOf(this.f19296e), 1), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, int i11) throws z {
        c(i10, 5);
        e(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, long j10) throws z {
        c(i10, 1);
        c(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var) throws z {
        c(1, 3);
        c(2, 0);
        g(i10);
        c(3, 2);
        g(d2Var.getSerializedSize());
        d2Var.writeTo(this);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var, t2 t2Var) throws z {
        c(i10, 2);
        g(((b) d2Var).getSerializedSize(t2Var));
        t2Var.a((Object) d2Var, this.f19102a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, s sVar) throws z {
        c(i10, 2);
        g(sVar.size());
        sVar.a(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, boolean z10) throws z {
        c(i10, 0);
        a(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i10) throws z {
        c(i10, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i10, int i11) throws z {
        b(bArr, i10, i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, int i11) throws z {
        c(i10, 0);
        f(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, long j10) throws z {
        c(i10, 0);
        d(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, s sVar) throws z {
        c(1, 3);
        c(2, 0);
        g(i10);
        a(3, sVar);
        c(1, 4);
    }

    public final void b(String str) throws z {
        int i10 = this.f19297f;
        try {
            int iC = b0.c(str.length() * 3);
            int iC2 = b0.c(str.length());
            if (iC2 == iC) {
                int i11 = i10 + iC2;
                this.f19297f = i11;
                int iA = d4.f19118a.a(str, this.f19295d, i11, this.f19296e - i11);
                this.f19297f = i10;
                g((iA - i10) - iC2);
                this.f19297f = iA;
            } else {
                g(d4.a(str));
                byte[] bArr = this.f19295d;
                int i12 = this.f19297f;
                this.f19297f = d4.f19118a.a(str, bArr, i12, this.f19296e - i12);
            }
        } catch (b4 e10) {
            this.f19297f = i10;
            a(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new z(e11);
        }
    }

    public final void b(byte[] bArr, int i10, int i11) throws z {
        try {
            System.arraycopy(bArr, i10, this.f19295d, this.f19297f, i11);
            this.f19297f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19297f), Integer.valueOf(this.f19296e), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i10, int i11) throws z {
        g((i10 << 3) | i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j10) throws z {
        try {
            byte[] bArr = this.f19295d;
            int i10 = this.f19297f;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.f19297f = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19297f), Integer.valueOf(this.f19296e), 1), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i10, int i11) throws z {
        c(i10, 0);
        g(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j10) throws z {
        if (b0.f19101c && this.f19296e - this.f19297f >= 10) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f19295d;
                int i10 = this.f19297f;
                this.f19297f = i10 + 1;
                x3.f19289c.a((Object) bArr, x3.f19292f + ((long) i10), (byte) ((((int) j10) & 127) | 128));
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f19295d;
            int i11 = this.f19297f;
            this.f19297f = i11 + 1;
            x3.f19289c.a((Object) bArr2, x3.f19292f + ((long) i11), (byte) j10);
            return;
        }
        while ((j10 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f19295d;
                int i12 = this.f19297f;
                this.f19297f = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19297f), Integer.valueOf(this.f19296e), 1), e10);
            }
        }
        byte[] bArr4 = this.f19295d;
        int i13 = this.f19297f;
        this.f19297f = i13 + 1;
        bArr4[i13] = (byte) j10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i10) throws z {
        try {
            byte[] bArr = this.f19295d;
            int i11 = this.f19297f;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f19297f = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19297f), Integer.valueOf(this.f19296e), 1), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i10) throws z {
        if (i10 >= 0) {
            g(i10);
        } else {
            d(i10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i10) throws z {
        if (b0.f19101c && !d.a()) {
            int i11 = this.f19296e;
            int i12 = this.f19297f;
            if (i11 - i12 >= 5) {
                if ((i10 & (-128)) == 0) {
                    byte[] bArr = this.f19295d;
                    this.f19297f = i12 + 1;
                    x3.f19289c.a((Object) bArr, x3.f19292f + ((long) i12), (byte) i10);
                    return;
                }
                byte[] bArr2 = this.f19295d;
                this.f19297f = i12 + 1;
                w3 w3Var = x3.f19289c;
                long j10 = x3.f19292f;
                w3Var.a((Object) bArr2, ((long) i12) + j10, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & (-128)) == 0) {
                    byte[] bArr3 = this.f19295d;
                    int i14 = this.f19297f;
                    this.f19297f = i14 + 1;
                    w3Var.a((Object) bArr3, j10 + ((long) i14), (byte) i13);
                    return;
                }
                byte[] bArr4 = this.f19295d;
                int i15 = this.f19297f;
                this.f19297f = i15 + 1;
                w3Var.a((Object) bArr4, ((long) i15) + j10, (byte) (i13 | 128));
                int i16 = i10 >>> 14;
                if ((i16 & (-128)) == 0) {
                    byte[] bArr5 = this.f19295d;
                    int i17 = this.f19297f;
                    this.f19297f = i17 + 1;
                    w3Var.a((Object) bArr5, j10 + ((long) i17), (byte) i16);
                    return;
                }
                byte[] bArr6 = this.f19295d;
                int i18 = this.f19297f;
                this.f19297f = i18 + 1;
                w3Var.a((Object) bArr6, ((long) i18) + j10, (byte) (i16 | 128));
                int i19 = i10 >>> 21;
                if ((i19 & (-128)) == 0) {
                    byte[] bArr7 = this.f19295d;
                    int i20 = this.f19297f;
                    this.f19297f = i20 + 1;
                    w3Var.a((Object) bArr7, j10 + ((long) i20), (byte) i19);
                    return;
                }
                byte[] bArr8 = this.f19295d;
                int i21 = this.f19297f;
                this.f19297f = i21 + 1;
                w3Var.a((Object) bArr8, ((long) i21) + j10, (byte) (i19 | 128));
                byte[] bArr9 = this.f19295d;
                int i22 = this.f19297f;
                this.f19297f = i22 + 1;
                w3Var.a((Object) bArr9, j10 + ((long) i22), (byte) (i10 >>> 28));
                return;
            }
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr10 = this.f19295d;
                int i23 = this.f19297f;
                this.f19297f = i23 + 1;
                bArr10[i23] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f19297f), Integer.valueOf(this.f19296e), 1), e10);
            }
        }
        byte[] bArr11 = this.f19295d;
        int i24 = this.f19297f;
        this.f19297f = i24 + 1;
        bArr11[i24] = (byte) i10;
    }
}
