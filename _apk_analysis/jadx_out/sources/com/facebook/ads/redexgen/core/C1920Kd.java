package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1920Kd extends AbstractRunnableC2216Vt {
    public final /* synthetic */ C2311Zm A00;

    public C1920Kd(C2311Zm c2311Zm) {
        this.A00 = c2311Zm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        this.A00.A03();
        if (this.A00.A08) {
            this.A00.A0D.postDelayed(this.A00.A0F, 250L);
        }
    }
}
