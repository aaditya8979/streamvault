package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class F4 extends QC<C1783Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC2259Xm A04;
    public InterfaceC2260Xn A05;
    public String A06;
    public List<C2496cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2804hy A0A;
    public final SF A0B;
    public final C2529dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C2602eX A0G;

    public F4(C2529dL c2529dL, List<C2496cn> list, AbstractC2804hy abstractC2804hy, US us2, SF sf2, C2602eX c2602eX, XH xh2, InterfaceC2260Xn interfaceC2260Xn, String str, int i10, int i11, int i12, int i13, FH fh2, AbstractC2259Xm abstractC2259Xm) {
        this.A0C = c2529dL;
        this.A0D = us2;
        this.A0B = sf2;
        this.A0G = c2602eX;
        this.A0E = xh2;
        this.A05 = interfaceC2260Xn;
        this.A0A = abstractC2804hy;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = fh2;
        this.A04 = abstractC2259Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1783Ev A0F(ViewGroup viewGroup, int i10) {
        return new C1783Ev(AbstractC2426bf.A00(new C2366ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C1783Ev c1783Ev, int i10) {
        c1783Ev.A0q(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (this.A08 || i10 != 0) {
            return;
        }
        c1783Ev.AIV();
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}
