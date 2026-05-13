package yads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public final class ib2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f90733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f90736d;

    public ib2() {
        this.f90733a = ib3.f90742f;
    }

    public ib2(int i10, byte[] bArr) {
        this.f90733a = bArr;
        this.f90736d = i10;
    }

    public ib2(byte[] bArr) {
        this(bArr.length, bArr);
    }

    public final int a(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f90735c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f90735c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f90735c = i13;
            byte[] bArr = this.f90733a;
            int i14 = this.f90734b;
            this.f90734b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f90733a;
        int i15 = this.f90734b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f90735c = 0;
            this.f90734b = i15 + 1;
        }
        a();
        return i16;
    }

    public final String a(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        if (this.f90735c != 0) {
            throw new IllegalStateException();
        }
        System.arraycopy(this.f90733a, this.f90734b, bArr, 0, i10);
        this.f90734b += i10;
        a();
        return new String(bArr, charset);
    }

    public final void a() {
        int i10 = this.f90734b;
        if (i10 >= 0) {
            int i11 = this.f90736d;
            if (i10 < i11) {
                return;
            }
            if (i10 == i11 && this.f90735c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(int i10, byte[] bArr) {
        this.f90733a = bArr;
        this.f90734b = 0;
        this.f90735c = 0;
        this.f90736d = i10;
    }

    public final void a(byte[] bArr, int i10) {
        int i11 = i10 >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            byte[] bArr2 = this.f90733a;
            int i13 = this.f90734b;
            int i14 = i13 + 1;
            this.f90734b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f90735c;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f90735c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f90733a;
            int i18 = this.f90734b;
            this.f90734b = i18 + 1;
            bArr[i11] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f90735c = i17 - 8;
        }
        int i19 = this.f90735c + i16;
        this.f90735c = i19;
        byte[] bArr4 = this.f90733a;
        int i20 = this.f90734b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
        if (i19 == 8) {
            this.f90735c = 0;
            this.f90734b = i20 + 1;
        }
        a();
    }

    public final int b() {
        return ((this.f90736d - this.f90734b) * 8) - this.f90735c;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        this.f90734b = i11;
        this.f90735c = i10 - (i11 * 8);
        a();
    }

    public final int c() {
        if (this.f90735c == 0) {
            return this.f90734b;
        }
        throw new IllegalStateException();
    }

    public final void c(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f90734b + i11;
        this.f90734b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f90735c;
        this.f90735c = i13;
        if (i13 > 7) {
            this.f90734b = i12 + 1;
            this.f90735c = i13 - 8;
        }
        a();
    }

    public final int d() {
        return (this.f90734b * 8) + this.f90735c;
    }

    public final void d(int i10) {
        if (this.f90735c != 0) {
            throw new IllegalStateException();
        }
        this.f90734b += i10;
        a();
    }

    public final boolean e() {
        boolean z10 = (this.f90733a[this.f90734b] & (128 >> this.f90735c)) != 0;
        g();
        return z10;
    }

    public final long f() {
        int iA = a(4);
        int iA2 = a(32);
        int i10 = ib3.f90737a;
        return ((((long) iA) & 4294967295L) << 32) | (((long) iA2) & 4294967295L);
    }

    public final void g() {
        int i10 = this.f90735c + 1;
        this.f90735c = i10;
        if (i10 == 8) {
            this.f90735c = 0;
            this.f90734b++;
        }
        a();
    }
}
