package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.g7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2698g7 implements QI {
    public final /* synthetic */ C15766g A00;

    public C2698g7(C15766g c15766g) {
        this.A00 = c15766g;
    }

    @Override // com.facebook.ads.redexgen.core.QI
    public final void ACK(AbstractC2076Qg abstractC2076Qg) {
        abstractC2076Qg.A0d(true);
        if (abstractC2076Qg.A06 != null && abstractC2076Qg.A07 == null) {
            abstractC2076Qg.A06 = null;
        }
        abstractC2076Qg.A07 = null;
        if (abstractC2076Qg.A0G() || this.A00.A1x(abstractC2076Qg.A0H) || !abstractC2076Qg.A0i()) {
            return;
        }
        this.A00.removeDetachedView(abstractC2076Qg.A0H, false);
    }
}
