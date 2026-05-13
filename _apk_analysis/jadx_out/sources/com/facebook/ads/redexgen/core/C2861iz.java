package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2861iz implements InterfaceC15374t {
    public InterfaceC1956Ln A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C2861iz A00(InterfaceC1956Ln interfaceC1956Ln) {
        this.A02 = interfaceC1956Ln;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC15374t
    public final C2860iy A59() {
        return new C2860iy((InterfaceC1956Ln) C3M.A01(this.A02), this.A01, this.A00);
    }
}
