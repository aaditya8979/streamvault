package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2770hL implements InterfaceC1973Me {
    public C2072Qc A00;

    public final void A00(C2072Qc c2072Qc) {
        this.A00 = c2072Qc;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1973Me
    public final void AEG(C2825iN c2825iN) {
        if (this.A00 == null || this.A00.A16() == null) {
            return;
        }
        this.A00.A16().ACD();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1973Me
    public final void AEI(C2825iN c2825iN) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1973Me
    public final void AEK(C2825iN c2825iN, V1 v12) {
    }
}
