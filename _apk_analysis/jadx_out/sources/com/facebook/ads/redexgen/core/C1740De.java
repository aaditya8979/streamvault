package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1740De extends AbstractC2018Nz {
    public final /* synthetic */ C1738Dc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740De(C1738Dc c1738Dc, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = c1738Dc;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2018Nz
    public final void A00(boolean z10, boolean z11, O1 o12) {
        if (!(U7.A0z(this.A00.A0D) && this.A00.A09) && z11) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC2536dS.A03));
        }
    }
}
