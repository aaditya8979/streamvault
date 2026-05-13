package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class HP implements InterfaceC2225Wc {
    public final /* synthetic */ C15314n A00;

    public HP(C15314n c15314n) {
        this.A00 = c15314n;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2225Wc
    public final void ACp() {
        this.A00.A0M.ACy(this.A00.A0C);
        this.A00.A0M.ACZ();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2225Wc
    public final void AEn(float f10) {
        this.A00.A0M.AJs(((this.A00.A0C - f10) + (this.A00.A0a ? 0 : this.A00.A0P.getDuration())) / (this.A00.A0a ? this.A00.A0C : this.A00.A0B));
    }
}
