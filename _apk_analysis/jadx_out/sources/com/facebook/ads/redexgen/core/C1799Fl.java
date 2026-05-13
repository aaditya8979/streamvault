package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1799Fl implements InterfaceC2258Xl {
    public static String[] A01 = {"ziFc1AxLwl06l9cm2ro8EEkTqcfxuLTc", "Ot3h47XlIqwqlb0VDKX34tYNREgAb88h", "XErmhi3UBKLFfekLEXmFG5T5AXnu", "x4ahbzSdp8w2tJq97wkZytqruvrbxvGd", "5eNtQA6JlDjBFR49aczWqHsgt2phfPFu", "5gzf4", "tgwS2khKEZgsCudiehRL6tpdm2kFQW", "Wy"};
    public final /* synthetic */ C15093r A00;

    public C1799Fl(C15093r c15093r) {
        this.A00 = c15093r;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2258Xl
    public final void ACC(AbstractC2259Xm abstractC2259Xm) {
        if (abstractC2259Xm.getToolbarActionMode() == 8) {
            this.A00.A0e();
            return;
        }
        ((G2) this.A00).A06.A04(UZ.A07, null);
        if (this.A00.A0i()) {
            return;
        }
        InterfaceC2260Xn interfaceC2260Xn = ((G2) this.A00).A09;
        YY yy = ((G2) this.A00).A0A;
        if (A01[7].length() != 2) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "aiGFPxx8CXfEdquuZVm2W5wuPm6cCNUb";
        strArr[3] = "iaZJUoQxe1noplKpEgf5PzuXPp1HxeHv";
        interfaceC2260Xn.A4b(yy.A7o());
    }
}
