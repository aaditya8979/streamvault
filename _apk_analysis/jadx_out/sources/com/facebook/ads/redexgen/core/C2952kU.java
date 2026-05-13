package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2952kU implements InterfaceC1887Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C1820Gg A02;
    public C1821Gh A03;

    public C2952kU(C1821Gh c1821Gh, C1820Gg c1820Gg) {
        this.A03 = c1821Gh;
        this.A02 = c1820Gg;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1887Iw
    public final InterfaceC1836Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C2992lK(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1887Iw
    public final long AGd(InterfaceC2995lN interfaceC2995lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long j10 = -(this.A01 + 2);
        this.A01 = -1L;
        return j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1887Iw
    public final void AJR(long j10) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC15184a.A0L(jArr, j10, true, true)];
    }
}
