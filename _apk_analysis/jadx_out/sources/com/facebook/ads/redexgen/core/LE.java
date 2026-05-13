package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC2260Xn A03;
    public C2602eX A04;
    public String A05;
    public List<C2496cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2804hy A08;
    public final SF A09;
    public final C2529dL A0A;
    public final US A0B;
    public final C2072Qc A0C;
    public final XH A0D;
    public final C15625s A0E;
    public final C1732Cw A0F;

    public LE(C2529dL c2529dL, List<C2496cn> list, AbstractC2804hy abstractC2804hy, US us2, C2072Qc c2072Qc, InterfaceC2260Xn interfaceC2260Xn, String str, C15625s c15625s, C1732Cw c1732Cw) {
        this.A0A = c2529dL;
        this.A0B = us2;
        this.A0C = c2072Qc;
        this.A09 = c2072Qc.A11();
        this.A04 = c2072Qc.A1B();
        this.A0D = c2072Qc.A1A();
        this.A03 = interfaceC2260Xn;
        this.A08 = abstractC2804hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c15625s;
        this.A0F = c1732Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i10) {
        return new FD(AbstractC2330a6.A00(new C2366ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd2, int i10) {
        C2496cn c2496cn = this.A06.get(i10);
        fd2.A0q(this.A04);
        fd2.A0p(c2496cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean z10 = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (z10) {
            A0G();
        }
    }

    public final void A0P(C2602eX c2602eX) {
        this.A04 = c2602eX;
    }
}
