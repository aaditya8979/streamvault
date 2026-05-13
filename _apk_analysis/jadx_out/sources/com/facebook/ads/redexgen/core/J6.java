package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class J6 extends AbstractRunnableC2216Vt {
    public final /* synthetic */ C1883Is A00;
    public final /* synthetic */ boolean A01;

    public J6(C1883Is c1883Is, boolean z10) {
        this.A00 = c1883Is;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        AbstractC2259Xm abstractC2259XmA0C = this.A00.A0c.A0C();
        if (abstractC2259XmA0C != null) {
            abstractC2259XmA0C.setPageDetailsVisible((this.A01 || abstractC2259XmA0C.A0B()) ? false : true);
            abstractC2259XmA0C.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }
}
