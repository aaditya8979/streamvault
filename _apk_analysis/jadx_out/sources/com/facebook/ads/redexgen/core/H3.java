package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class H3 {
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public H3(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        C3M.A08(this.A01 >= 0 && (this.A01 < this.A02 || (this.A01 == this.A02 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i10) {
        int i11 = this.A01;
        int iMin = Math.min(i10, 8 - this.A00);
        int i12 = i11 + 1;
        int i13 = ((this.A03[i11] & 255) >> this.A00) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.A03[i12] & 255) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        A03(i10);
        return i14;
    }

    public final void A03(int i10) {
        int i11 = i10 / 8;
        this.A01 += i11;
        this.A00 += i10 - (i11 * 8);
        if (this.A00 > 7) {
            this.A01++;
            this.A00 -= 8;
        }
        A00();
    }

    public final boolean A04() {
        boolean z10 = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return z10;
    }
}
