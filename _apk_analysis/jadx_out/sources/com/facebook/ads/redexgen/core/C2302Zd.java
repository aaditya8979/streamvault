package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2302Zd implements InterfaceC2141Su {
    public final SQ A00;

    public C2302Zd(SQ sq2) {
        this.A00 = sq2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void A4A(Throwable th2) {
        C2136Sp.A0E(th2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void A9v(String str) {
        C2175Ud.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void A9w(String str) {
        C2175Ud.A09(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void AAy(String str, int i10, C2143Sw c2143Sw) {
        C2136Sp.A06(this.A00, str, i10, c2143Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void AAz(String str, int i10, C2143Sw c2143Sw) {
        C2136Sp.A06(this.A00, str, i10, c2143Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void ABI(long j10, long j11, long j12, long j13, int i10, Exception exc) {
        T0.A03(this.A00, j10, j11, j12, j13, i10, exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void ABR(String str, int i10, C2143Sw c2143Sw) {
        C2136Sp.A07(this.A00, str, i10, c2143Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void ABZ(String str, int i10, C2143Sw c2143Sw) {
        C2136Sp.A08(this.A00, str, i10, c2143Sw);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2141Su
    public final void ABq() {
        this.A00.A04().ABq();
    }
}
