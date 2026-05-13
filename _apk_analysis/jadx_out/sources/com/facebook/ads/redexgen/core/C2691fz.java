package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2691fz extends QT {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC2690fy A01;

    public C2691fz(AbstractC2690fy abstractC2690fy) {
        this.A01 = abstractC2690fy;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C15766g c15766g, int i10) {
        super.A0L(c15766g, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0M(C15766g c15766g, int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.A00 = true;
    }
}
