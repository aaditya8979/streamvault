package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2478cV {
    public String A02;
    public String A03;
    public String A04;
    public final C1990Mw A06;
    public final N9 A07;
    public final C2529dL A08;
    public C1992My A01 = C1992My.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public C2478cV(C2529dL c2529dL, C1990Mw c1990Mw, N9 n92) {
        this.A08 = c2529dL;
        this.A06 = c1990Mw;
        this.A07 = n92;
    }

    public final C2478cV A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final C2478cV A0A(C1992My c1992My) {
        this.A01 = c1992My;
        return this;
    }

    public final C2478cV A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final C2478cV A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final C2478cV A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final C2478cV A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C2480cX A0F() {
        return new C2480cX(this, null);
    }
}
