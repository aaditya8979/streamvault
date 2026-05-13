package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2991lJ implements InterfaceC1836Gw {
    public final long A00;
    public final boolean A01;
    public final long[] A02;
    public final long[] A03;

    public C2991lJ(long[] jArr, long[] jArr2, long j10) {
        C3M.A07(jArr.length == jArr2.length);
        int length = jArr2.length;
        this.A01 = length > 0;
        if (!this.A01 || jArr2[0] <= 0) {
            this.A02 = jArr;
            this.A03 = jArr2;
        } else {
            this.A02 = new long[length + 1];
            this.A03 = new long[length + 1];
            System.arraycopy(jArr, 0, this.A02, 1, length);
            System.arraycopy(jArr2, 0, this.A03, 1, length);
        }
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        if (!this.A01) {
            return new C1835Gv(C1837Gx.A04);
        }
        int iA0L = AbstractC15184a.A0L(this.A03, j10, true, true);
        C1837Gx c1837Gx = new C1837Gx(this.A03[iA0L], this.A02[iA0L]);
        return (c1837Gx.A01 == j10 || iA0L == this.A03.length - 1) ? new C1835Gv(c1837Gx) : new C1835Gv(c1837Gx, new C1837Gx(this.A03[iA0L + 1], this.A02[iA0L + 1]));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return this.A01;
    }
}
