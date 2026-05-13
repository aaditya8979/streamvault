package com.facebook.ads.redexgen.core;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2906jk implements KJ {
    public static String[] A0C = {"sfI6nyeMmjCQTVuCF4qtLy1yjQ", "oMMkuqn3AEHt3nTJ2MOQ2D2uSIMoL5hR", "njiJ7f0cFz7yvYhslZfI3p6AsrETAKAq", "CO", "QYzjeJ7DBautBSe7mq0LOiDdFPwmAbmn", "JPkUATb4vKYtG67zqSLtKl3hIns3qHla", "LddklOggznimrifNDzyDRJC2bK2Jwwl3", "KQOf5F07mNCBpldsJ3B6cw89YczO0oD4"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public H1 A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public final C4J A09;
    public final C1825Gl A0A;
    public final String A0B;

    public C2906jk() {
        this(null);
    }

    public C2906jk(String str) {
        this.A02 = 0;
        this.A09 = new C4J(4);
        this.A09.A0l()[0] = -1;
        this.A0A = new C1825Gl();
        this.A04 = -9223372036854775807L;
        this.A0B = str;
    }

    private void A00(C4J c4j) {
        byte[] bArrA0l = c4j.A0l();
        int iA0A = c4j.A0A();
        for (int iA09 = c4j.A09(); iA09 < iA0A; iA09++) {
            boolean z10 = (bArrA0l[iA09] & 255) == 255;
            boolean z11 = this.A08 && (bArrA0l[iA09] & 224) == 224;
            this.A08 = z10;
            String[] strArr = A0C;
            if (strArr[1].charAt(11) != strArr[4].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "cXytat7P8iKtLP6TqIlLVzlvPDaZG4kX";
            strArr2[4] = "jOC7bwxKPNAtckDXCFNPXzZbhL30f8uL";
            if (z11) {
                c4j.A0f(iA09 + 1);
                this.A08 = false;
                this.A09.A0l()[1] = bArrA0l[iA09];
                this.A00 = 2;
                this.A02 = 1;
                return;
            }
        }
        c4j.A0f(iA0A);
    }

    @RequiresNonNull({"output"})
    private void A01(C4J c4j) {
        int iMin = Math.min(c4j.A07(), this.A01 - this.A00);
        this.A05.AI7(c4j, iMin);
        this.A00 += iMin;
        if (this.A00 < this.A01) {
            return;
        }
        if (this.A04 != -9223372036854775807L) {
            H1 h12 = this.A05;
            String[] strArr = A0C;
            if (strArr[5].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[2] = "FJBco80YTxCtRjQ9gQqQy4qETqBIMl0G";
            strArr2[7] = "R9O1kZ0wfg8ZyFlwYf0hmCttc3ths7ud";
            h12.AIA(this.A04, 1, this.A01, 0, null);
            this.A04 += this.A03;
        }
        this.A00 = 0;
        this.A02 = 0;
    }

    @RequiresNonNull({"output"})
    private void A02(C4J c4j) {
        int iMin = Math.min(c4j.A07(), 4 - this.A00);
        c4j.A0k(this.A09.A0l(), this.A00, iMin);
        this.A00 += iMin;
        if (this.A00 < 4) {
            return;
        }
        this.A09.A0f(0);
        if (!this.A0A.A00(this.A09.A0C())) {
            this.A00 = 0;
            this.A02 = 1;
            return;
        }
        this.A01 = this.A0A.A02;
        if (!this.A07) {
            this.A03 = (((long) this.A0A.A04) * 1000000) / ((long) this.A0A.A03);
            this.A05.A6W(new C2D().A0y(this.A06).A11(this.A0A.A06).A0h(4096).A0b(this.A0A.A01).A0m(this.A0A.A03).A10(this.A0B).A14());
            this.A07 = true;
        }
        this.A09.A0f(0);
        this.A05.AI7(this.A09, 4);
        this.A02 = 2;
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A52(C4J c4j) {
        C3M.A02(this.A05);
        while (c4j.A07() > 0) {
            switch (this.A02) {
                case 0:
                    A00(c4j);
                    break;
                case 1:
                    A02(c4j);
                    break;
                case 2:
                    A01(c4j);
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void A5U(GY gy, C1921Ke c1921Ke) {
        c1921Ke.A05();
        this.A06 = c1921Ke.A04();
        this.A05 = gy.AJh(c1921Ke.A03(), 1);
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG5() {
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AG6(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.A04 = j10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.KJ
    public final void AIL() {
        this.A02 = 0;
        this.A00 = 0;
        this.A08 = false;
        this.A04 = -9223372036854775807L;
    }
}
