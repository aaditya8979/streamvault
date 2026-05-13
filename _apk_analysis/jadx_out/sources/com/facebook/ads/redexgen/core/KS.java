package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Making NalUnitTargetBuffer public to be accessible by the Oculus Readers")
public final class KS {
    public int A00;
    public byte[] A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public KS(int i10, int i11) {
        this.A04 = i10;
        this.A01 = new byte[i11 + 3];
        this.A01[2] = 1;
    }

    public final void A00() {
        this.A03 = false;
        this.A02 = false;
    }

    public final void A01(int i10) {
        C3M.A08(!this.A03);
        this.A03 = i10 == this.A04;
        if (this.A03) {
            this.A00 = 3;
            this.A02 = false;
        }
    }

    public final void A02(byte[] bArr, int i10, int i11) {
        if (this.A03) {
            int i12 = i11 - i10;
            if (this.A01.length < this.A00 + i12) {
                this.A01 = Arrays.copyOf(this.A01, (this.A00 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.A01, this.A00, i12);
            this.A00 += i12;
        }
    }

    public final boolean A03() {
        return this.A02;
    }

    public final boolean A04(int i10) {
        if (!this.A03) {
            return false;
        }
        this.A00 -= i10;
        this.A03 = false;
        this.A02 = true;
        return true;
    }
}
