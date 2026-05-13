package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2202Vf implements ViewpointAction<UE, UJ> {
    public VN A00;

    public C2202Vf(VN vn2) {
        this.A00 = vn2;
    }

    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6J(C3253pu<UE, UJ> c3253pu, InterfaceC3244pk interfaceC3244pk) {
        switch (interfaceC3244pk.A9M(c3253pu)) {
            case A02:
            case A04:
                this.A00.A02(c3253pu, interfaceC3244pk);
                break;
        }
    }
}
