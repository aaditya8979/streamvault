package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1825Gl {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public String A06;

    public final boolean A00(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!AbstractC1826Gm.A06(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.A05 = i11;
        this.A06 = AbstractC1826Gm.A08[3 - i12];
        this.A03 = AbstractC1826Gm.A07[i14];
        if (i11 == 2) {
            this.A03 /= 2;
        } else if (i11 == 0) {
            this.A03 /= 4;
        }
        int i15 = (i10 >>> 9) & 1;
        this.A04 = AbstractC1826Gm.A02(i11, i12);
        if (i12 == 3) {
            this.A00 = i11 == 3 ? AbstractC1826Gm.A02[i13 - 1] : AbstractC1826Gm.A06[i13 - 1];
            this.A02 = (((this.A00 * 12) / this.A03) + i15) * 4;
        } else {
            if (i11 == 3) {
                this.A00 = i12 == 2 ? AbstractC1826Gm.A03[i13 - 1] : AbstractC1826Gm.A0C()[i13 - 1];
                this.A02 = ((this.A00 * 144) / this.A03) + i15;
            } else {
                this.A00 = AbstractC1826Gm.A05[i13 - 1];
                this.A02 = (((i12 == 1 ? 72 : 144) * this.A00) / this.A03) + i15;
            }
        }
        this.A01 = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
