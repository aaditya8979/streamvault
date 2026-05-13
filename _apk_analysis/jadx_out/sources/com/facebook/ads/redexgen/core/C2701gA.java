package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2701gA implements InterfaceC2083Qn {
    public final /* synthetic */ C15766g A00;

    public C2701gA(C15766g c15766g) {
        this.A00 = c15766g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2083Qn
    public final void AGP(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3) {
        this.A00.A1l(abstractC2076Qg, qj2, qj3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2083Qn
    public final void AGR(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3) {
        this.A00.A0r.A0Y(abstractC2076Qg);
        this.A00.A1m(abstractC2076Qg, qj2, qj3);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2083Qn
    public final void AGT(AbstractC2076Qg abstractC2076Qg, QJ qj2, QJ qj3) {
        abstractC2076Qg.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(abstractC2076Qg, abstractC2076Qg, qj2, qj3)) {
                this.A00.A1O();
            }
        } else if (this.A00.A05.A0Q(abstractC2076Qg, qj2, qj3)) {
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2083Qn
    public final void AJo(AbstractC2076Qg abstractC2076Qg) {
        this.A00.A06.A1F(abstractC2076Qg.A0H, this.A00.A0r);
    }
}
