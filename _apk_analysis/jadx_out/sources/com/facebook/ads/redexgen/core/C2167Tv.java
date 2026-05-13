package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2167Tv implements InterfaceC2313Zo {
    public final /* synthetic */ TD A00;

    public C2167Tv(TD td2) {
        this.A00 = td2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2313Zo
    public final void ADT(C2312Zn c2312Zn) {
        this.A00.A0D.set(c2312Zn.A00() != null);
        if (!this.A00.A0E.get() || this.A00.A02 == null) {
            return;
        }
        this.A00.A02.AEW(c2312Zn.A00() != null);
    }
}
