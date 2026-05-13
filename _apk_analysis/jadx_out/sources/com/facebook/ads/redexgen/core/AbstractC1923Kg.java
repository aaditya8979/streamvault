package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1923Kg {
    public static String[] A00 = {"zHvJnNiJi0M", "FniiyLS950t5mTu4QlbfX1TrXuc", "I7PZw93cjLP5IpZ6BbWCD", "9iobBdNwIxtUK2g", "LhRCEY8vP1M7TerIjGAXS82kM3fiu", "vMv2t0fFsfhvwPnbOb52fPF3dg3aW", "XvTrrYiBPPp7CW1", "g12euaG6mbsrKt48m9yyXN0g2MG"};

    public static int A00(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    public static long A01(C4J c4j, int i10, int i11) {
        c4j.A0f(i10);
        if (c4j.A07() < 5) {
            return -9223372036854775807L;
        }
        int iA0C = c4j.A0C();
        if ((8388608 & iA0C) != 0 || ((2096896 & iA0C) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((iA0C & 32) != 0) && c4j.A0I() >= 7 && c4j.A07() >= 7) {
            if ((c4j.A0I() & 16) == 16) {
                byte[] bArr = new byte[6];
                c4j.A0k(bArr, 0, bArr.length);
                long jA02 = A02(bArr);
                String[] strArr = A00;
                if (strArr[4].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A00[2] = "oAb2qjZGj";
                return jA02;
            }
        }
        return -9223372036854775807L;
    }

    public static long A02(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static boolean A03(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = i14 * 188;
            String[] strArr = A00;
            if (strArr[3].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[3] = "Qn38sx03S77VT5y";
            strArr2[6] = "gfX0N6dqp84BCDo";
            int i16 = i15 + i12;
            if (i16 < i10 || i16 >= i11 || bArr[i16] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
