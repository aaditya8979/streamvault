package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class G6 implements InterfaceC2225Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC2216Vt A01;
    public final /* synthetic */ G2 A02;
    public final /* synthetic */ C1732Cw A03;

    public G6(G2 g22, int i10, C1732Cw c1732Cw, AbstractRunnableC2216Vt abstractRunnableC2216Vt) {
        this.A02 = g22;
        this.A00 = i10;
        this.A03 = c1732Cw;
        this.A01 = abstractRunnableC2216Vt;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2225Wc
    public final void ACp() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2225Wc
    public final void AEn(float f10) {
        this.A02.A08.setProgress(100.0f * (1.0f - (f10 / this.A00)));
        if (this.A03 != null) {
            this.A03.A07((int) ((this.A00 - f10) * 1000.0f));
        }
    }
}
