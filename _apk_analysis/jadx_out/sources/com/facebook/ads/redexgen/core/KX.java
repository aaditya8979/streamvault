package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KX {
    public static byte[] A02;
    public final List<C3206or> A00;
    public final H1[] A01;

    static {
        A01();
    }

    public KX(List<C3206or> list) {
        this.A00 = list;
        this.A01 = new H1[list.size()];
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{119, -100, -92, -113, -102, -105, -110, 78, -111, -102, -99, -95, -109, -110, 78, -111, -113, -98, -94, -105, -99, -100, 78, -101, -105, -101, -109, 78, -94, -89, -98, -109, 78, -98, -96, -99, -92, -105, -110, -109, -110, 104, 78, -123, -108, -108, -112, -115, -121, -123, -104, -115, -109, -110, 83, -121, -119, -123, 81, 90, 84, 92, -49, -34, -34, -38, -41, -47, -49, -30, -41, -35, -36, -99, -47, -45, -49, -101, -91, -98, -90};
    }

    public final void A02(long j10, C4J c4j) {
        GR.A03(j10, c4j, this.A01);
    }

    public final void A03(GY gy, C1921Ke c1921Ke) {
        for (int i10 = 0; i10 < this.A01.length; i10++) {
            c1921Ke.A05();
            H1 h1AJh = gy.AJh(c1921Ke.A03(), 3);
            C3206or c3206or = this.A00.get(i10);
            String str = c3206or.A0W;
            C3M.A09(A00(43, 19, 7).equals(str) || A00(62, 19, 81).equals(str), A00(0, 43, 17) + str);
            h1AJh.A6W(new C2D().A0y(c3206or.A0T != null ? c3206or.A0T : c1921Ke.A04()).A11(str).A0n(c3206or.A0H).A10(c3206or.A0V).A0Z(c3206or.A03).A12(c3206or.A0X).A14());
            this.A01[i10] = h1AJh;
        }
    }
}
