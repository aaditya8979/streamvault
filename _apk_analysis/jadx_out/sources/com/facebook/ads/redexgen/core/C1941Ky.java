package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ky, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1941Ky<T> {
    public boolean A00;
    public boolean A01 = true;
    public final InterfaceC1935Ks<T> A02;

    public C1941Ky(InterfaceC1935Ks<T> interfaceC1935Ks) {
        this.A02 = interfaceC1935Ks;
    }

    public final InterfaceC1935Ks<T> A00() {
        return this.A02;
    }

    public final void A01(boolean z10) {
        this.A00 = z10;
    }

    public final void A02(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A03() {
        return this.A00;
    }

    public final boolean A04() {
        return this.A01;
    }
}
