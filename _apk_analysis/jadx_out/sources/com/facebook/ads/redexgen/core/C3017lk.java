package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C3017lk extends E5<C3017lk> {
    public static String[] A0H = {"VuHjt8oOpq8N7C214wGoSA1AvoAEOrJ7", "uFvhlxS5lUy9ksGg6O4Xt3y9x", "z2gekC5V6p56SAeTbAO0jRL35", "AJl44cd0wjf7yp80NhOEfrZac9uQkeAm", "fvb2kSFN69PWkoJ4Ln26XpHSuOzso8Xv", "xYIwGH1EqCgaa9qjZOqbWgZcWwFFG4Ev", "iW7gA0b6LPVcA0KpSRoleRmfzjbkINez", "mxsnKoNumrVzSuMZZmY48wO5LDc3OokM"};
    public final int A00;
    public final int A01;
    public final int A02;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A03;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final AnonymousClass93 A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public C3017lk(int i10, C3172oH c3172oH, int i11, AnonymousClass93 anonymousClass93, int i12, String str, int i13, boolean z10) {
        super(i10, c3172oH, i11);
        this.A09 = anonymousClass93;
        int i14 = anonymousClass93.A07 ? 24 : 16;
        this.A0A = anonymousClass93.A06 && (i13 & i14) != 0;
        this.A0C = z10 && (super.A02.A0L == -1 || super.A02.A0L <= ((C3165oA) anonymousClass93).A06) && ((super.A02.A0A == -1 || super.A02.A0A <= ((C3165oA) anonymousClass93).A05) && ((super.A02.A01 == -1.0f || super.A02.A01 <= ((float) ((C3165oA) anonymousClass93).A04)) && (super.A02.A05 == -1 || super.A02.A05 <= ((C3165oA) anonymousClass93).A03)));
        this.A0D = z10 && (super.A02.A0L == -1 || super.A02.A0L >= ((C3165oA) anonymousClass93).A0A) && ((super.A02.A0A == -1 || super.A02.A0A >= ((C3165oA) anonymousClass93).A09) && ((super.A02.A01 == -1.0f || super.A02.A01 >= ((float) ((C3165oA) anonymousClass93).A08)) && (super.A02.A05 == -1 || super.A02.A05 >= ((C3165oA) anonymousClass93).A07)));
        this.A0E = AnonymousClass92.A0S(i12, false);
        int i15 = 0;
        int i16 = Integer.MAX_VALUE;
        int i17 = 0;
        while (true) {
            if (i17 >= anonymousClass93.A0L.size()) {
                break;
            }
            int iA02 = AnonymousClass92.A02(super.A02, anonymousClass93.A0L.get(i17), false);
            if (iA02 > 0) {
                i16 = i17;
                i15 = iA02;
                break;
            }
            i17++;
        }
        this.A03 = i16;
        this.A04 = i15;
        this.A00 = super.A02.A05;
        this.A02 = super.A02.A06();
        this.A06 = AnonymousClass92.A00(super.A02.A0E, ((C3165oA) anonymousClass93).A0D);
        this.A0B = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A07 = AnonymousClass92.A02(super.A02, str, AnonymousClass92.A0K(str) == null);
        int i18 = Integer.MAX_VALUE;
        int i19 = 0;
        while (true) {
            if (i19 < anonymousClass93.A0M.size()) {
                if (super.A02.A0W != null && super.A02.A0W.equals(anonymousClass93.A0M.get(i19))) {
                    i18 = i19;
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        this.A05 = i18;
        this.A0G = AnonymousClass76.A02(i12) == 128;
        this.A0F = AnonymousClass76.A04(i12) == 64;
        this.A01 = AnonymousClass92.A07(super.A02.A0W);
        this.A08 = A00(i12, i14);
    }

    private int A00(int i10, int i11) {
        if ((super.A02.A0E & 16384) != 0 || !AnonymousClass92.A0S(i10, this.A09.A0B)) {
            return 0;
        }
        if (this.A0C || this.A09.A0C) {
            return (!AnonymousClass92.A0S(i10, false) || !this.A0D || !this.A0C || super.A02.A05 == -1 || this.A09.A0N || this.A09.A0O || (i10 & i11) == 0) ? 1 : 2;
        }
        return 0;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D56211926, support language flag in video track")
    public static int A01(C3017lk c3017lk, C3017lk c3017lk2) {
        AbstractC3037m4 abstractC3037m4A09 = AbstractC3037m4.A01().A09(c3017lk.A0E, c3017lk2.A0E).A08(Integer.valueOf(c3017lk.A03), Integer.valueOf(c3017lk2.A03), AbstractC3185oV.A03().A06()).A06(c3017lk.A04, c3017lk2.A04).A06(c3017lk.A06, c3017lk2.A06).A09(c3017lk.A0B, c3017lk2.A0B).A06(c3017lk.A07, c3017lk2.A07).A09(c3017lk.A0C, c3017lk2.A0C).A09(c3017lk.A0D, c3017lk2.A0D).A08(Integer.valueOf(c3017lk.A05), Integer.valueOf(c3017lk2.A05), AbstractC3185oV.A03().A06()).A09(c3017lk.A0G, c3017lk2.A0G).A09(c3017lk.A0F, c3017lk2.A0F);
        if (c3017lk.A0G && c3017lk.A0F) {
            int i10 = c3017lk.A01;
            int i11 = c3017lk2.A01;
            if (A0H[4].charAt(7) == 'c') {
                throw new RuntimeException();
            }
            A0H[4] = "L7q4oO3o2NLjefqLZehpujqtxzeKbA5O";
            abstractC3037m4A09 = abstractC3037m4A09.A06(i10, i11);
        }
        int iA05 = abstractC3037m4A09.A05();
        if (A0H[7].charAt(14) != 'M') {
            return iA05;
        }
        A0H[0] = "TVm4CsN40i91TfwfawYUT3UYECpWhhhJ";
        return iA05;
    }

    public static int A02(C3017lk c3017lk, C3017lk c3017lk2) {
        AbstractC3185oV abstractC3185oVA06 = (c3017lk.A0C && c3017lk.A0E) ? AnonymousClass92.A09 : AnonymousClass92.A09.A06();
        AbstractC3037m4 abstractC3037m4A01 = AbstractC3037m4.A01();
        Integer numValueOf = Integer.valueOf(c3017lk.A00);
        Integer numValueOf2 = Integer.valueOf(c3017lk2.A00);
        boolean z10 = c3017lk.A09.A0O;
        String[] strArr = A0H;
        if (strArr[6].charAt(5) == strArr[5].charAt(5)) {
            throw new RuntimeException();
        }
        A0H[4] = "07GlML0JAKsk4TXVd5GQtUxHkz6E2kCF";
        return abstractC3037m4A01.A08(numValueOf, numValueOf2, z10 ? AnonymousClass92.A09.A06() : AnonymousClass92.A0A).A08(Integer.valueOf(c3017lk.A02), Integer.valueOf(c3017lk2.A02), abstractC3185oVA06).A08(Integer.valueOf(c3017lk.A00), Integer.valueOf(c3017lk2.A00), abstractC3185oVA06).A05();
    }

    public static int A05(List<C3017lk> list, List<C3017lk> list2) {
        return AbstractC3037m4.A01().A08((C3017lk) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.E6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3017lk.A01((C3017lk) obj, (C3017lk) obj2);
            }
        }), (C3017lk) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.E6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3017lk.A01((C3017lk) obj, (C3017lk) obj2);
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.E6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3017lk.A01((C3017lk) obj, (C3017lk) obj2);
            }
        }).A06(list.size(), list2.size()).A08((C3017lk) Collections.max(list, new Comparator() { // from class: com.facebook.ads.redexgen.X.E7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3017lk.A02((C3017lk) obj, (C3017lk) obj2);
            }
        }), (C3017lk) Collections.max(list2, new Comparator() { // from class: com.facebook.ads.redexgen.X.E7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3017lk.A02((C3017lk) obj, (C3017lk) obj2);
            }
        }), new Comparator() { // from class: com.facebook.ads.redexgen.X.E7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3017lk.A02((C3017lk) obj, (C3017lk) obj2);
            }
        }).A05();
    }

    public static AbstractC1673Am<C3017lk> A06(int i10, C3172oH c3172oH, AnonymousClass93 anonymousClass93, int[] iArr, String str, int i11) {
        int iA03 = AnonymousClass92.A03(c3172oH, ((C3165oA) anonymousClass93).A0F, ((C3165oA) anonymousClass93).A0E, anonymousClass93.A0Q);
        C14491h c14491hA01 = AbstractC1673Am.A01();
        int i12 = 0;
        while (true) {
            int i13 = c3172oH.A01;
            String[] strArr = A0H;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[6] = "2BgCu4KRvJ20zb7ljNDccj45OL5WeAVY";
            strArr2[5] = "2mW0v3SSZTDHEKi4uYotr9FneqRXRzcE";
            if (i12 >= i13) {
                return c14491hA01.A05();
            }
            int iA06 = c3172oH.A08(i12).A06();
            c14491hA01.A04(new C3017lk(i10, c3172oH, i12, anonymousClass93, iArr[i12], str, i11, iA03 == Integer.MAX_VALUE || (iA06 != -1 && iA06 <= iA03)));
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.E5
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final boolean A09(C3017lk c3017lk) {
        if (this.A0A || AbstractC15184a.A1E(super.A02.A0W, ((E5) c3017lk).A02.A0W)) {
            if (!this.A09.A05) {
                if (this.A0G == c3017lk.A0G) {
                    boolean z10 = this.A0F;
                    if (A0H[7].charAt(14) != 'M') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0H;
                    strArr[1] = "O482IHGDjbokfcz29RQKjL9l7";
                    strArr[2] = "cI8rqKrS6U71hTMAagWNF9taj";
                    if (z10 == c3017lk.A0F) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.E5
    public final int A08() {
        return this.A08;
    }
}
