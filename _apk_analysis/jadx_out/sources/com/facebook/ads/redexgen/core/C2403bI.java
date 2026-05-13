package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2403bI extends AbstractRunnableC2216Vt {
    public final /* synthetic */ C2503cu A00;

    public C2403bI(C2503cu c2503cu) {
        this.A00 = c2503cu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        for (C2137Sq c2137Sq : C2136Sp.A02()) {
            C2136Sp.A0A(this.A00, c2137Sq.A02(), c2137Sq.A00(), c2137Sq.A01(), false);
        }
        C2136Sp.A02().clear();
    }
}
