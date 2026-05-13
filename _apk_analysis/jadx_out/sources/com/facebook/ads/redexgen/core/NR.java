package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class NR {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(C2529dL c2529dL, AbstractC2804hy abstractC2804hy, boolean z10, NP np2) {
        if (U7.A27(c2529dL)) {
            np2.AEa();
            return;
        }
        SF sf2 = new SF(c2529dL);
        NB nbA07 = abstractC2804hy.A20().A0H().A07();
        sf2.A0e(new C2172Ua(abstractC2804hy.A25(), c2529dL.A0A()));
        if (nbA07 == null) {
            np2.AEZ(AdError.CACHE_ERROR);
            return;
        }
        if (nbA07.A0O()) {
            np2.AEa();
            return;
        }
        SB sb2 = new SB(nbA07.A0F(), abstractC2804hy.A17(), abstractC2804hy.A0v());
        sb2.A04 = true;
        sb2.A03 = A00(0, 5, 86);
        switch (NO.A00[nbA07.A0A().ordinal()]) {
            case 1:
            case 2:
                sf2.A0Y(sb2);
                break;
        }
        sf2.A0c(new SD(abstractC2804hy.A23().A01(), -1, -1, abstractC2804hy.A17(), abstractC2804hy.A0v()));
        sf2.A0c(new SD(nbA07.A0E(), -1, -1, abstractC2804hy.A17(), abstractC2804hy.A0v()));
        sf2.A0X(new C2784hZ(c2529dL, np2, sf2, nbA07, z10), new S8(abstractC2804hy.A17(), abstractC2804hy.A0v()));
    }
}
