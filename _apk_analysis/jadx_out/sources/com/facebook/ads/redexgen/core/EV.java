package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EV implements InterfaceC2627ew {
    public final /* synthetic */ C2526dI A00;

    public EV(C2526dI c2526dI) {
        this.A00 = c2526dI;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2627ew
    public final void AGQ() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2627ew
    public final void AGS(C2629ey c2629ey) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c2629ey == null || !c2629ey.A00()) {
            this.A00.A02.A4b(this.A00.A03.A8w());
        } else {
            this.A00.A02.A4b(this.A00.A03.A8x());
        }
    }
}
