package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2982lA extends HI {
    public static byte[] A03;
    public static String[] A04 = {"lB4dHhjpy3abWZhQq1wH5EBAR", "ZuPpDuw", "FbPLOQU", "", "U7rP1AfGJoZ3goBfYNThYKT2IP", "TmhX3SF8er8D0wPa9QxyxNkwR", "Alay8YZwXgHUhbAemAZh94CmGu", "aeAWKwor"};
    public static final int[] A05;
    public int A00;
    public boolean A01;
    public boolean A02;

    static {
        A01();
        A05 = new int[]{5512, 11025, 22050, 44100};
    }

    public C2982lA(H1 h12) {
        super(h12);
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        String[] strArr = A04;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[6] = "jv2UBL9GlnQlzNWQDlysyfO0pU";
        strArr2[4] = "rlPmYvRzpLfwn1KnxKXQ0LEEGB";
        A03 = new byte[]{-37, 15, -2, 3, 9, -70, 0, 9, 12, 7, -5, 14, -70, 8, 9, 14, -70, 13, 15, 10, 10, 9, 12, 14, -1, -2, -44, -70, -33, -13, -30, -25, -19, -83, -27, -75, -81, -81, -85, -33, -22, -33, -11, -88, -68, -85, -80, -74, 118, -82, 126, 120, 120, 116, -76, -77, -88, -66, 126, -110, -127, -122, -116, 76, -118, -115, 81, 126, 74, -119, 126, -111, -118, -72, -52, -69, -64, -58, -122, -60, -57, -68, -66};
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final boolean A0B(C4J c4j) throws C2978l6 {
        if (this.A02) {
            c4j.A0g(1);
        } else {
            int iA0I = c4j.A0I();
            this.A00 = (iA0I >> 4) & 15;
            if (this.A00 == 2) {
                super.A00.A6W(new C2D().A11(A00(73, 10, 58)).A0b(1).A0m(A05[(iA0I >> 2) & 3]).A14());
                this.A01 = true;
            } else if (this.A00 == 7 || this.A00 == 8) {
                super.A00.A6W(new C2D().A11(this.A00 == 7 ? A00(28, 15, 97) : A00(43, 15, 42)).A0b(1).A0m(8000).A14());
                this.A01 = true;
            } else if (this.A00 != 10) {
                throw new C2978l6(A00(0, 28, 125) + this.A00);
            }
            this.A02 = true;
        }
        return true;
    }

    @Override // com.facebook.ads.redexgen.core.HI
    public final boolean A0C(C4J c4j, long j10) throws C14742i {
        if (this.A00 == 2) {
            int iA07 = c4j.A07();
            super.A00.AI7(c4j, iA07);
            super.A00.AIA(j10, 1, iA07, 0, null);
            return true;
        }
        int iA0I = c4j.A0I();
        if (iA0I != 0 || this.A01) {
            if (this.A00 == 10 && iA0I != 1) {
                return false;
            }
            int iA072 = c4j.A07();
            super.A00.AI7(c4j, iA072);
            super.A00.AIA(j10, 1, iA072, 0, null);
            return true;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, bArr.length);
        GA gaA03 = GB.A03(bArr);
        super.A00.A6W(new C2D().A11(A00(58, 15, 0)).A0w(gaA03.A02).A0b(gaA03.A00).A0m(gaA03.A01).A12(Collections.singletonList(bArr)).A14());
        this.A01 = true;
        return false;
    }
}
