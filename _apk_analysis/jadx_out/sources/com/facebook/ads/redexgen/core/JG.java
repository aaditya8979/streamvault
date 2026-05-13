package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class JG {
    public static byte[] A00;
    public static String[] A01 = {"igoOoy3NY4UMRHdpx9h3UlwGdvMc0fc9", "i1My3cIv2txc6hnpPF2N9ufK5yKqcDwp", "ZPKM82HH2UhiHuE6c", "N8bcPF6", "fP1uMJr9juYIT", "Q74KZy4WGIwm3", "kYmec6ZLKDIoPLbK3wnMb68OSlbBsX7E", "P2I33wOyCa7MBOFZieFJQqH5gMHCVrks"};

    static {
        A02();
    }

    public static int A00(C4J c4j) {
        int i10 = 0;
        while (c4j.A07() != 0) {
            int iA0I = c4j.A0I();
            i10 += iA0I;
            if (A01[3].length() == 4) {
                throw new RuntimeException();
            }
            A01[2] = "hfDUXVNQknc2urmlb";
            if (iA0I != 255) {
                return i10;
            }
        }
        return -1;
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 63);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-17, 17, 13, 1, 32, 21, 24, -41, -17, -19, -12, -12, -19, -14, -21, -92, -10, -23, -15, -27, -19, -14, -24, -23, -10, -92, -13, -22, -92, -15, -27, -16, -22, -13, -10, -15, -23, -24, -92, -41, -55, -51, -92, -46, -59, -48, -92, -7, -14, -19, -8, -78};
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
                AnonymousClass44.A07(A01(0, 7, 109), A01(7, 45, 69));
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
                h12.AIA(j10, 1, i10, 0, null);
            }
        }
    }
}
