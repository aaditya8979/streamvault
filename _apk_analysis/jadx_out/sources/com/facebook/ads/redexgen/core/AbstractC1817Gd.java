package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1817Gd {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C4J c4j, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c4j.A0I() + 1;
            case 7:
                int iA0M = c4j.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return iA0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC2995lN interfaceC2995lN, C1821Gh c1821Gh) throws IOException {
        interfaceC2995lN.AI1();
        interfaceC2995lN.A3z(1);
        byte[] bArr = new byte[1];
        interfaceC2995lN.AG9(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC2995lN.A3z(2);
        int i10 = z10 ? 7 : 6;
        C4J c4j = new C4J(i10);
        c4j.A0e(GZ.A00(interfaceC2995lN, c4j.A0l(), 0, i10));
        interfaceC2995lN.AI1();
        C1816Gc c1816Gc = new C1816Gc();
        if (A08(c4j, c1821Gh, z10, c1816Gc)) {
            return c1816Gc.A00;
        }
        throw C14742i.A01(null, null);
    }

    public static boolean A02(int i10, C1821Gh c1821Gh) {
        if (i10 == 0) {
            return true;
        }
        int i11 = c1821Gh.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i10 == i11;
    }

    public static boolean A03(int i10, C1821Gh c1821Gh) {
        if (i10 <= 7) {
            return i10 == c1821Gh.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i10 <= 10 && c1821Gh.A02 == 2;
    }

    public static boolean A04(C4J c4j, int i10) {
        return c4j.A0I() == AbstractC15184a.A0J(c4j.A0l(), i10, c4j.A09() + (-1), 0);
    }

    public static boolean A05(C4J c4j, C1821Gh c1821Gh, int i10) {
        int iA00 = A00(c4j, i10);
        return iA00 != -1 && iA00 <= c1821Gh.A03;
    }

    public static boolean A06(C4J c4j, C1821Gh c1821Gh, int i10) {
        int i11 = c1821Gh.A07;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == c1821Gh.A08;
        }
        if (i10 == 12) {
            return c4j.A0I() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int iA0M = c4j.A0M();
        if (i10 == 14) {
            iA0M *= 10;
        }
        return iA0M == i11;
    }

    public static boolean A07(C4J c4j, C1821Gh c1821Gh, int i10, C1816Gc c1816Gc) {
        int iA09 = c4j.A09();
        long jA0Q = c4j.A0Q();
        if ((jA0Q >>> 16) != i10) {
            return false;
        }
        return A03((int) ((jA0Q >> 4) & 15), c1821Gh) && A02((int) ((jA0Q >> 1) & 7), c1821Gh) && !(((jA0Q & 1) > 1L ? 1 : ((jA0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c4j, c1821Gh, (((jA0Q >>> 16) & 1) > 1L ? 1 : (((jA0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, c1816Gc) && A05(c4j, c1821Gh, (int) ((jA0Q >> 12) & 15)) && A06(c4j, c1821Gh, (int) ((jA0Q >> 8) & 15)) && A04(c4j, iA09);
    }

    public static boolean A08(C4J c4j, C1821Gh c1821Gh, boolean z10, C1816Gc c1816Gc) {
        try {
            long jA0S = c4j.A0S();
            c1816Gc.A00 = z10 ? jA0S : ((long) c1821Gh.A03) * jA0S;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC2995lN interfaceC2995lN, C1821Gh c1821Gh, int i10, C1816Gc c1816Gc) throws IOException {
        long jA8a = interfaceC2995lN.A8a();
        byte[] bArr = new byte[2];
        interfaceC2995lN.AG9(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC2995lN.AI1();
            interfaceC2995lN.A3z((int) (jA8a - interfaceC2995lN.A8f()));
            return false;
        }
        C4J c4j = new C4J(16);
        System.arraycopy(bArr, 0, c4j.A0l(), 0, 2);
        c4j.A0e(GZ.A00(interfaceC2995lN, c4j.A0l(), 2, 14));
        interfaceC2995lN.AI1();
        interfaceC2995lN.A3z((int) (jA8a - interfaceC2995lN.A8f()));
        return A07(c4j, c1821Gh, i10, c1816Gc);
    }
}
