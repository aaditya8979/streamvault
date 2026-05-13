package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2990lI implements InterfaceC1836Gw {
    public final long A00;
    public final C1835Gv A01;

    public C2990lI(long j10) {
        this(j10, 0L);
    }

    public C2990lI(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C1835Gv(j11 == 0 ? C1837Gx.A04 : new C1837Gx(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final C1835Gv A8t(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1836Gw
    public final boolean AAa() {
        return false;
    }
}
