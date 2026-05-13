package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2895jZ implements KW {
    public final C4I A00 = new C4I(new byte[4]);
    public final /* synthetic */ C2893jX A01;

    public C2895jZ(C2893jX c2893jX) {
        this.A01 = c2893jX;
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void A52(C4J c4j) {
        if (c4j.A0I() == 0 && (c4j.A0I() & 128) != 0) {
            c4j.A0g(6);
            int iA07 = c4j.A07() / 4;
            for (int i10 = 0; i10 < iA07; i10++) {
                c4j.A0h(this.A00, 4);
                int iA04 = this.A00.A04(16);
                this.A00.A09(3);
                if (iA04 == 0) {
                    this.A00.A09(13);
                } else {
                    int iA042 = this.A00.A04(13);
                    if (this.A01.A0B.get(iA042) == null) {
                        this.A01.A0B.put(iA042, new C2899jd(new C2894jY(this.A01, iA042)));
                        C2893jX.A02(this.A01);
                    }
                }
            }
            if (this.A01.A09 != 2) {
                this.A01.A0B.remove(0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KW
    public final void AA2(C4R c4r, GY gy, C1921Ke c1921Ke) {
    }
}
