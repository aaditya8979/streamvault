package com.facebook.ads.redexgen.core;

import java.util.Set;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2612eh {
    public C2616el A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C2612eh A00(C2616el c2616el) {
        this.A00 = c2616el;
        return this;
    }

    public final C2612eh A01(Set<String> set) {
        this.A01 = set;
        return this;
    }

    public final C2612eh A02(Set<String> set) {
        this.A02 = set;
        return this;
    }

    public final C2612eh A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C2612eh A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C2613ei A05() {
        return new C2613ei(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
