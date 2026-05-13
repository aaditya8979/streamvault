package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2683fr extends AbstractRunnableC2203Vg {
    public final /* synthetic */ C2682fq A00;

    public C2683fr(C2682fq c2682fq) {
        this.A00 = c2682fq;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2203Vg
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onLoggingImpression(this.A00.A01.A07());
        }
    }
}
