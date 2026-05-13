package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C4I {
    public static String[] A04 = {"2nOz0KIFgcZZRyVuqo5bgbDjVecAtY1v", "p1", "VjnGs3e14C04tf63tHLQ77fvb0vUFjjn", "IkQ8iUjtLJey7cJCEXqpfqsJOKT4tfzv", "YU3RrDfZvA3XfQSmqlFrDyJy2XBZ9ug4", "OCexcvgEmqqQdA89aMsn", "lWBBh2DwBKc0yUEroYjNXxq0TEDXKrUS", "n4CP0YvmwhnKHbqe32bPZYKzOuFmYPOb"};
    public byte[] A00;
    public int A01;
    public int A02;
    public int A03;

    public C4I() {
    }

    public C4I(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C4I(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A02 = i10;
    }

    private void A00() {
        C3M.A08(this.A03 >= 0 && (this.A03 < this.A02 || (this.A03 == this.A02 && this.A01 == 0)));
    }

    public final int A01() {
        return ((this.A02 - this.A03) * 8) - this.A01;
    }

    public final int A02() {
        C3M.A08(this.A01 == 0);
        return this.A03;
    }

    public final int A03() {
        return (this.A03 * 8) + this.A01;
    }

    public final int A04(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 0;
        this.A01 += i10;
        while (this.A01 > 8) {
            this.A01 -= 8;
            byte[] bArr = this.A00;
            int i12 = this.A03;
            this.A03 = i12 + 1;
            i11 |= (bArr[i12] & 255) << this.A01;
        }
        int i13 = (i11 | ((this.A00[this.A03] & 255) >> (8 - this.A01))) & ((-1) >>> (32 - i10));
        if (this.A01 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
        return i13;
    }

    public final long A05(int i10) {
        if (i10 > 32) {
            return AbstractC15184a.A0N(A04(i10 - 32), A04(32));
        }
        long jA0M = AbstractC15184a.A0M(A04(i10));
        String[] strArr = A04;
        if (strArr[1].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "hPuSpAkHwt40nYe5baQSvI4ZKxCRAlL0";
        strArr2[0] = "ANsKpIz8SdbAQh9e0XlF7KjBsp30BEL1";
        return jA0M;
    }

    public final void A06() {
        if (this.A01 == 0) {
            return;
        }
        this.A01 = 0;
        this.A03++;
        A00();
    }

    public final void A07() {
        int i10 = this.A01 + 1;
        this.A01 = i10;
        if (i10 == 8) {
            this.A01 = 0;
            int i11 = this.A03;
            String[] strArr = A04;
            if (strArr[3].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[3] = "IsW8CSRSYhigEF2wlh1BrMeLUc4CvJhM";
            strArr2[0] = "lfcfpjtp1JtJxQNQeccncamol0LRwTjJ";
            this.A03 = i11 + 1;
        }
        A00();
    }

    public final void A08(int i10) {
        this.A03 = i10 / 8;
        this.A01 = i10 - (this.A03 * 8);
        A00();
    }

    public final void A09(int i10) {
        int i11 = i10 / 8;
        this.A03 += i11;
        this.A01 += i10 - (i11 * 8);
        if (this.A01 > 7) {
            this.A03++;
            this.A01 -= 8;
        }
        A00();
    }

    public final void A0A(int i10) {
        C3M.A08(this.A01 == 0);
        this.A03 += i10;
        A00();
    }

    public final void A0B(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.A01, i11);
        int i12 = (8 - this.A01) - iMin;
        this.A00[this.A03] = (byte) (this.A00[this.A03] & ((65280 >> this.A01) | ((1 << i12) - 1)));
        this.A00[this.A03] = (byte) (this.A00[this.A03] | ((i10 >>> (i11 - iMin)) << i12));
        int i13 = i11 - iMin;
        int i14 = this.A03 + 1;
        while (i13 > 8) {
            this.A00[i14] = (byte) (i10 >>> (i13 - 8));
            i13 -= 8;
            i14++;
        }
        int i15 = 8 - i13;
        this.A00[i14] = (byte) (this.A00[i14] & ((1 << i15) - 1));
        this.A00[i14] = (byte) (this.A00[i14] | ((i10 & ((1 << i13) - 1)) << i15));
        A09(i11);
        A00();
    }

    public final void A0C(C4J c4j) {
        A0E(c4j.A0l(), c4j.A0A());
        A08(c4j.A09() * 8);
    }

    public final void A0D(byte[] bArr) {
        A0E(bArr, bArr.length);
    }

    public final void A0E(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A03 = 0;
        this.A01 = 0;
        this.A02 = i10;
    }

    public final void A0F(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.A00;
            int i13 = this.A03;
            this.A03 = i13 + 1;
            bArr[i10] = (byte) (bArr2[i13] << this.A01);
            bArr[i10] = (byte) (((255 & this.A00[this.A03]) >> (8 - this.A01)) | bArr[i10]);
            i10++;
        }
        int i14 = i11 & 7;
        if (i14 == 0) {
            return;
        }
        bArr[i12] = (byte) (bArr[i12] & (255 >> i14));
        if (this.A01 + i14 > 8) {
            byte b10 = bArr[i12];
            byte[] bArr3 = this.A00;
            int i15 = this.A03;
            this.A03 = i15 + 1;
            bArr[i12] = (byte) (b10 | ((bArr3[i15] & 255) << this.A01));
            this.A01 -= 8;
        }
        this.A01 += i14;
        bArr[i12] = (byte) (bArr[i12] | ((byte) (((255 & this.A00[this.A03]) >> (8 - this.A01)) << (8 - i14))));
        if (this.A01 == 8) {
            this.A01 = 0;
            this.A03++;
        }
        A00();
    }

    public final void A0G(byte[] bArr, int i10, int i11) {
        C3M.A08(this.A01 == 0);
        System.arraycopy(this.A00, this.A03, bArr, i10, i11);
        this.A03 += i11;
        A00();
    }

    public final boolean A0H() {
        boolean z10 = (this.A00[this.A03] & (128 >> this.A01)) != 0;
        A07();
        return z10;
    }
}
