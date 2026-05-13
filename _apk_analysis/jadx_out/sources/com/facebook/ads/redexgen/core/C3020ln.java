package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3020ln extends E5<C3020ln> implements Comparable<C3020ln> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C3020ln(int i10, C3172oH c3172oH, int i11, AnonymousClass93 anonymousClass93, int i12, String str) {
        super(i10, c3172oH, i11);
        int i13 = 0;
        this.A08 = AnonymousClass92.A0S(i12, false);
        int i14 = super.A02.A0H & (~((C3165oA) anonymousClass93).A00);
        this.A06 = (i14 & 1) != 0;
        this.A07 = (i14 & 2) != 0;
        int i15 = Integer.MAX_VALUE;
        int i16 = 0;
        List<String> listA03 = anonymousClass93.A0K.isEmpty() ? MetaExoPlayerCustomizedCollections.A03("") : anonymousClass93.A0K;
        int i17 = 0;
        while (true) {
            if (i17 >= listA03.size()) {
                break;
            }
            int iA02 = AnonymousClass92.A02(super.A02, listA03.get(i17), anonymousClass93.A0P);
            if (iA02 > 0) {
                i15 = i17;
                i16 = iA02;
                break;
            }
            i17++;
        }
        this.A00 = i15;
        this.A01 = i16;
        this.A02 = AnonymousClass92.A00(super.A02.A0E, ((C3165oA) anonymousClass93).A0C);
        this.A05 = (super.A02.A0E & 1088) != 0;
        this.A03 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        boolean z10 = this.A01 > 0 || (anonymousClass93.A0K.isEmpty() && this.A02 > 0) || this.A06 || (this.A07 && this.A03 > 0);
        if (AnonymousClass92.A0S(i12, anonymousClass93.A0B) && z10) {
            i13 = 1;
        }
        this.A04 = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3020ln c3020ln) {
        AbstractC3037m4 abstractC3037m4A06 = AbstractC3037m4.A01().A09(this.A08, c3020ln.A08).A08(Integer.valueOf(this.A00), Integer.valueOf(c3020ln.A00), AbstractC3185oV.A03().A06()).A06(this.A01, c3020ln.A01).A06(this.A02, c3020ln.A02).A09(this.A06, c3020ln.A06).A08(Boolean.valueOf(this.A07), Boolean.valueOf(c3020ln.A07), this.A01 == 0 ? AbstractC3185oV.A03() : AbstractC3185oV.A03().A06()).A06(this.A03, c3020ln.A03);
        if (this.A02 == 0) {
            abstractC3037m4A06 = abstractC3037m4A06.A0A(this.A05, c3020ln.A05);
        }
        return abstractC3037m4A06.A05();
    }

    public static int A01(List<C3020ln> list, List<C3020ln> list2) {
        return list.get(0).compareTo(list2.get(0));
    }

    public static AbstractC1673Am<C3020ln> A02(int i10, C3172oH c3172oH, AnonymousClass93 anonymousClass93, int[] iArr, String str) {
        C14491h c14491hA01 = AbstractC1673Am.A01();
        for (int i11 = 0; i11 < c3172oH.A01; i11++) {
            c14491hA01.A04(new C3020ln(i10, c3172oH, i11, anonymousClass93, iArr[i11], str));
        }
        return c14491hA01.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.E5
    /* JADX INFO: renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3020ln c3020ln) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A04;
    }
}
