package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KK {
    public static final byte[] A04 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public KK(int i10) {
        this.A02 = new byte[i10];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i10, int i11) {
        if (this.A03) {
            int i12 = i11 - i10;
            if (this.A02.length < this.A00 + i12) {
                this.A02 = Arrays.copyOf(this.A02, (this.A00 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.A02, this.A00, i12);
            this.A00 += i12;
        }
    }

    public final boolean A02(int i10, int i11) {
        if (this.A03) {
            this.A00 -= i11;
            if (this.A01 != 0 || i10 != 181) {
                this.A03 = false;
                return true;
            }
            this.A01 = this.A00;
        } else if (i10 == 179) {
            this.A03 = true;
        }
        A01(A04, 0, A04.length);
        return false;
    }
}
