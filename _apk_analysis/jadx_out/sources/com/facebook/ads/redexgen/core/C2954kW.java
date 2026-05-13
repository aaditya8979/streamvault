package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2954kW implements InterfaceC1836Gw {
    public final /* synthetic */ C2953kV A00;

    public C2954kW(C2953kV c2953kV) {
        this.A00 = c2953kV;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        return new C1835Gv(new C1837Gx(j10, AbstractC15184a.A0T((this.A00.A09 + (((this.A00.A08 - this.A00.A09) * this.A00.A0B.A06(j10)) / this.A00.A07)) - 30000, this.A00.A09, this.A00.A08 - 1)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return true;
    }
}
