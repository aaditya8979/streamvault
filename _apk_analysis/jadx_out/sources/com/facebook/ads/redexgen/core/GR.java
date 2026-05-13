package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GR {
    public static byte[] A00;

    static {
        A02();
    }

    public static int A00(C4J c4j) {
        int i10 = 0;
        while (c4j.A07() != 0) {
            int iA0I = c4j.A0I();
            i10 += iA0I;
            if (iA0I != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 121);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-65, ExifInterface.MARKER_APP1, -35, -47, -16, -27, -24, -36, -12, -14, -7, -7, -14, -9, -16, -87, -5, -18, -10, -22, -14, -9, -19, -18, -5, -87, -8, -17, -87, -10, -22, -11, -17, -8, -5, -10, -18, -19, -87, -36, -50, -46, -87, -41, -54, -43, -87, -2, -9, -14, -3, -73};
    }

    public static void A03(long j10, C4J c4j, H1[] h1Arr) {
        while (true) {
            if (c4j.A07() <= 1) {
                return;
            }
            int iA00 = A00(c4j);
            int iA002 = A00(c4j);
            int iA09 = c4j.A09() + iA002;
            if (iA002 == -1 || iA002 > c4j.A07()) {
                AnonymousClass44.A07(A01(0, 7, 3), A01(7, 45, 16));
                iA09 = c4j.A0A();
            } else if (iA00 == 4 && iA002 >= 8) {
                int iA0I = c4j.A0I();
                int iA0M = c4j.A0M();
                int iA0C = iA0M == 49 ? c4j.A0C() : 0;
                int iA0I2 = c4j.A0I();
                if (iA0M == 47) {
                    c4j.A0g(1);
                }
                boolean z10 = iA0I == 181 && (iA0M == 49 || iA0M == 47) && iA0I2 == 3;
                if (iA0M == 49) {
                    z10 &= iA0C == 1195456820;
                }
                if (z10) {
                    A04(j10, c4j, h1Arr);
                }
            }
            c4j.A0f(iA09);
        }
    }

    public static void A04(long j10, C4J c4j, H1[] h1Arr) {
        int iA0I = c4j.A0I();
        if ((iA0I & 64) != 0) {
            c4j.A0g(1);
            int i10 = (iA0I & 31) * 3;
            int iA09 = c4j.A09();
            for (H1 h12 : h1Arr) {
                c4j.A0f(iA09);
                h12.AI7(c4j, i10);
                if (j10 != -9223372036854775807L) {
                    h12.AIA(j10, 1, i10, 0, null);
                }
            }
        }
    }
}
