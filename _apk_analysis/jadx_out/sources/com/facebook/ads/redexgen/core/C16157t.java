package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C16157t implements InterfaceC2968kk {
    public long A00;
    public final long A01;
    public final AnonymousClass45 A03 = new AnonymousClass45();
    public final AnonymousClass45 A02 = new AnonymousClass45();

    public C16157t(long j10, long j11, long j12) {
        this.A00 = j10;
        this.A01 = j12;
        this.A03.A04(0L);
        this.A02.A04(j11);
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(long j10, long j11) {
        if (A02(j10)) {
            return;
        }
        this.A03.A04(j10);
        this.A02.A04(j11);
    }

    public final boolean A02(long j10) {
        return j10 - this.A03.A03(this.A03.A02() - 1) < 100000;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968kk
    public final long A7b() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        int iA0C = AbstractC15184a.A0C(this.A03, j10, true, true);
        C1837Gx c1837Gx = new C1837Gx(this.A03.A03(iA0C), this.A02.A03(iA0C));
        return (c1837Gx.A01 == j10 || iA0C == this.A03.A02() - 1) ? new C1835Gv(c1837Gx) : new C1835Gv(c1837Gx, new C1837Gx(this.A03.A03(iA0C + 1), this.A02.A03(iA0C + 1)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2968kk
    public final long A99(long j10) {
        return this.A03.A03(AbstractC15184a.A0C(this.A02, j10, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return true;
    }
}
