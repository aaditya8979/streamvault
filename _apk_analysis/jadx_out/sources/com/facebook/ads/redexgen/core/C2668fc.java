package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2668fc extends AbstractRunnableC2203Vg {
    public final /* synthetic */ C2667fb A00;

    public C2668fc(C2667fb c2667fb) {
        this.A00 = c2667fb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2203Vg
    public final void A01() {
        if (this.A00.A01.A00.A00() != null) {
            this.A00.A01.A00.A00().onAdsLoaded();
        }
    }
}
