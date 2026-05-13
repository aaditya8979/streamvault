package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2111Rp {
    public final long A00;
    public final EnumC2110Ro A01;
    public final String A02;
    public final boolean A03;

    public C2111Rp(String str, boolean z10, EnumC2110Ro enumC2110Ro) {
        this(str, z10, enumC2110Ro, System.currentTimeMillis());
    }

    public C2111Rp(String str, boolean z10, EnumC2110Ro enumC2110Ro, long j10) {
        this.A02 = str;
        this.A03 = z10;
        this.A01 = enumC2110Ro;
        this.A00 = j10;
    }

    public static C2111Rp A00() {
        return new C2111Rp("", true, EnumC2110Ro.A05, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC2110Ro A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
