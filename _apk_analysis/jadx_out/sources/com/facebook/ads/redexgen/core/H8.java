package com.facebook.ads.redexgen.core;

import android.util.Base64;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class H8 {
    public static byte[] A00;
    public static String[] A01 = {"AQUfun8uWtpAPz6T54JXA8DVdz19i7cg", "A9xQ060X7I53O0IPhfx7pChTdPn89BVs", "HA6OUY8aFXslM4giueBriDg2S", "9RrkKnX7ioGd8UIKmUAG7ayOJ1mW6fCZ", "mjtW7HF4JFIVQBQAuWhSkP1cuiqQ", "mMlJtFouJ3Md3SAWQWV0HJ1iYftjtiDS", "", "7UUPgjEseHhf3IW21ENlLsXr9tr9mert"};

    static {
        A08();
    }

    public static int A00(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static long A01(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static Metadata A02(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrA1P = AbstractC15184a.A1P(str, A07(0, 1, 56));
            int length = strArrA1P.length;
            String strA07 = A07(85, 10, 6);
            if (length != 2) {
                AnonymousClass44.A07(strA07, A07(1, 32, 49) + str);
            } else {
                String[] strArr = A01;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "";
                strArr2[4] = "IFt3u6Tbn0k1mtPtGSJYRwNJh6dv";
                if (strArrA1P[0].equals(A07(63, 22, 85))) {
                    try {
                        arrayList.add(PictureFrame.A00(new C4J(Base64.decode(strArrA1P[1], 0))));
                    } catch (RuntimeException e10) {
                        AnonymousClass44.A0A(strA07, A07(33, 30, 0), e10);
                    }
                } else {
                    arrayList.add(new VorbisComment(strArrA1P[0], strArrA1P[1]));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static H4 A03(H3 h32) throws C14742i {
        long jA01;
        if (h32.A02(24) != 5653314) {
            throw C14742i.A01(A07(123, 55, 75) + h32.A01(), null);
        }
        int iA02 = h32.A02(16);
        int iA022 = h32.A02(24);
        long[] jArr = new long[iA022];
        boolean zA04 = h32.A04();
        if (zA04) {
            int iA023 = h32.A02(5) + 1;
            int i10 = 0;
            while (i10 < jArr.length) {
                int iA024 = h32.A02(A00(iA022 - i10));
                for (int i11 = 0; i11 < iA024 && i10 < jArr.length; i11++) {
                    jArr[i10] = iA023;
                    i10++;
                }
                iA023++;
            }
        } else {
            boolean zA042 = h32.A04();
            for (int i12 = 0; i12 < jArr.length; i12++) {
                if (!zA042) {
                    int iA025 = h32.A02(5);
                    String[] strArr = A01;
                    if (strArr[6].length() != strArr[4].length()) {
                        String[] strArr2 = A01;
                        strArr2[3] = "YIXxF7uzVQ2KRDIuTFnKuNVMBeAy43Wm";
                        strArr2[1] = "ZNrvF1xji8SwPYIxx9WGKrLEtje0Ya68";
                        jArr[i12] = iA025 + 1;
                    } else {
                        A01[2] = "PN1PQj6gHBTdVMYKSOEyBSZrD";
                        jArr[i12] = iA025 + 1;
                    }
                } else if (h32.A04()) {
                    jArr[i12] = h32.A02(5) + 1;
                } else {
                    String[] strArr3 = A01;
                    if (strArr3[7].charAt(2) != strArr3[0].charAt(2)) {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A01;
                    strArr4[7] = "HkUiXrMYXoP7dmmSwm7TlUKenEWhRSa7";
                    strArr4[0] = "g3UzzRsN8l9NwZbA9Pl4zDU4WOGu2UFV";
                    jArr[i12] = 0;
                }
            }
        }
        int iA026 = h32.A02(4);
        if (iA026 > 2) {
            throw C14742i.A01(A07(313, 42, 0) + iA026, null);
        }
        if (iA026 == 1 || iA026 == 2) {
            h32.A03(32);
            h32.A03(32);
            int iA027 = h32.A02(4) + 1;
            h32.A03(1);
            if (iA026 != 1) {
                jA01 = ((long) iA022) * ((long) iA02);
            } else if (iA02 != 0) {
                long j10 = iA022;
                String[] strArr5 = A01;
                if (strArr5[3].charAt(14) != strArr5[1].charAt(14)) {
                    throw new RuntimeException();
                }
                A01[5] = "D9mmqqJmTqnxQ2dihdU3MUH7YK6oq28f";
                jA01 = A01(j10, iA02);
            } else {
                jA01 = 0;
            }
            h32.A03((int) (((long) iA027) * jA01));
        }
        return new H4(iA02, iA022, jArr, iA026, zA04);
    }

    public static H5 A04(C4J c4j) throws C14742i {
        return A05(c4j, true, true);
    }

    public static H5 A05(C4J c4j, boolean z10, boolean z11) throws C14742i {
        if (z10) {
            A0C(3, c4j, false);
        }
        String strA0W = c4j.A0W((int) c4j.A0O());
        int length = 7 + 4 + strA0W.length();
        long jA0O = c4j.A0O();
        String[] strArr = new String[(int) jA0O];
        int length2 = length + 4;
        for (int i10 = 0; i10 < jA0O; i10++) {
            strArr[i10] = c4j.A0W((int) c4j.A0O());
            length2 = length2 + 4 + strArr[i10].length();
        }
        if (z11 && (c4j.A0I() & 1) == 0) {
            throw C14742i.A01(A07(283, 30, 46), null);
        }
        return new H5(strA0W, strArr, length2 + 1);
    }

    public static H7 A06(C4J c4j) throws C14742i {
        A0C(1, c4j, false);
        int iA0F = c4j.A0F();
        int iA0I = c4j.A0I();
        int iA0F2 = c4j.A0F();
        int iA0E = c4j.A0E();
        if (iA0E <= 0) {
            iA0E = -1;
        }
        int iA0E2 = c4j.A0E();
        if (iA0E2 <= 0) {
            iA0E2 = -1;
        }
        int iA0E3 = c4j.A0E();
        if (iA0E3 <= 0) {
            iA0E3 = -1;
            String[] strArr = A01;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "";
            strArr2[4] = "hx6vx8O5nOwfxHxHuzSsxOXMbdPf";
        }
        int iA0I2 = c4j.A0I();
        return new H7(iA0F, iA0I, iA0F2, iA0E, iA0E2, iA0E3, (int) Math.pow(2.0d, iA0I2 & 15), (int) Math.pow(2.0d, (iA0I2 & 240) >> 4), (c4j.A0I() & 1) > 0, Arrays.copyOf(c4j.A0l(), c4j.A0A()));
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 110);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{107, 25, 62, 54, 51, 58, 59, 127, 43, 48, 127, 47, 62, 45, 44, 58, 127, 9, 48, 45, 61, 54, 44, 127, 60, 48, 50, 50, 58, 49, 43, 101, 127, 40, 15, 7, 2, 11, 10, 78, 26, 1, 78, 30, 15, 28, 29, 11, 78, 24, 1, 28, 12, 7, 29, 78, 30, 7, 13, 26, 27, 28, 11, 118, 126, 111, 122, 127, 122, 111, 122, 100, 121, 119, 116, 120, 112, 100, 107, 114, 120, 111, 110, 105, 126, 62, 7, 26, 10, 1, 27, 61, 28, 1, 4, 58, 39, 47, 58, 60, 43, 58, 59, 127, 60, 55, 62, 45, 62, 60, 43, 58, 45, 44, 127, 120, 41, 48, 45, 61, 54, 44, 120, 64, 93, 85, 64, 70, 81, 64, 65, 5, 70, 74, 65, 64, 5, 71, 74, 74, 78, 5, 81, 74, 5, 86, 81, 68, 87, 81, 5, 82, 76, 81, 77, 5, 126, 21, 93, 16, 19, 9, 5, 21, 93, 17, 22, 9, 5, 21, 93, 17, 23, 120, 5, 68, 81, 5, 62, 35, 43, 62, 56, 47, 62, 63, 123, 51, 62, 58, 63, 62, 41, 123, 47, 34, 43, 62, 123, 107, 97, 98, 98, 127, 45, 121, 116, 125, 104, 45, 106, 127, 104, 108, 121, 104, 127, 45, 121, 101, 108, 99, 45, 60, 45, 99, 98, 121, 45, 105, 104, 110, 98, 105, 108, 111, 97, 104, 55, 45, 97, 117, 102, 106, 110, 105, 96, 39, 101, 110, 115, 39, 102, 97, 115, 98, 117, 39, 106, 104, 99, 98, 116, 39, 105, 104, 115, 39, 116, 98, 115, 39, 102, 116, 39, 98, 127, 119, 98, 100, 115, 98, 99, 38, 50, 33, 45, 41, 46, 39, 96, 34, 41, 52, 96, 37, 56, 48, 37, 35, 52, 37, 36, 96, 52, 47, 96, 34, 37, 96, 51, 37, 52, 2, 1, 1, 5, 27, 30, 78, 26, 23, 30, 11, 78, 9, 28, 11, 15, 26, 11, 28, 78, 26, 6, 15, 0, 78, 92, 78, 0, 1, 26, 78, 10, 11, 13, 1, 10, 15, 12, 2, 11, 84, 78, 56, 52, 37, 37, 60, 59, 50, 117, 33, 44, 37, 48, 117, 58, 33, 61, 48, 39, 117, 33, 61, 52, 59, 117, 101, 117, 59, 58, 33, 117, 38, 32, 37, 37, 58, 39, 33, 48, 49, 111, 117, 108, 112, 125, 127, 121, 116, 115, 112, 120, 121, 110, 60, 115, 122, 60, 104, 117, 113, 121, 60, 120, 115, 113, 125, 117, 114, 60, 104, 110, 125, 114, 111, 122, 115, 110, 113, 111, 60, 114, 115, 104, 60, 102, 121, 110, 115, 121, 120, 60, 115, 105, 104, 64, 87, 65, 91, 86, 71, 87, 102, 75, 66, 87, 18, 85, 64, 87, 83, 70, 87, 64, 18, 70, 90, 83, 92, 18, 0, 18, 91, 65, 18, 92, 93, 70, 18, 86, 87, 81, 93, 86, 83, 80, 94, 87, 93, 70, 9, 91, 76, 90, 76, 91, 95, 76, 77, 9, 75, 64, 93, 90, 9, 68, 92, 90, 93, 9, 75, 76, 9, 83, 76, 91, 70, 9, 72, 79, 93, 76, 91, 9, 68, 72, 89, 89, 64, 71, 78, 9, 74, 70, 92, 89, 69, 64, 71, 78, 9, 90, 93, 76, 89, 90, 16, 11, 11, 68, 23, 12, 11, 22, 16, 68, 12, 1, 5, 0, 1, 22, 94, 68};
    }

    public static void A09(int i10, H3 h32) throws C14742i {
        int i11;
        int iA02 = h32.A02(6) + 1;
        for (int i12 = 0; i12 < iA02; i12++) {
            int iA022 = h32.A02(16);
            if (iA022 != 0) {
                AnonymousClass44.A05(A07(85, 10, 6), A07(355, 41, 59) + iA022);
            } else {
                if (h32.A04()) {
                    int iA023 = h32.A02(4);
                    String[] strArr = A01;
                    if (strArr[7].charAt(2) != strArr[0].charAt(2)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "MSIFAaOSOQQOpmu0PO7aKrLsJb3QFagu";
                    i11 = iA023 + 1;
                } else {
                    i11 = 1;
                }
                if (h32.A04()) {
                    int iA024 = h32.A02(8) + 1;
                    for (int i13 = 0; i13 < iA024; i13++) {
                        h32.A03(A00(i10 - 1));
                        h32.A03(A00(i10 - 1));
                    }
                }
                if (h32.A02(2) != 0) {
                    throw C14742i.A01(A07(491, 58, 71), null);
                }
                if (i11 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        h32.A03(4);
                    }
                }
                for (int i15 = 0; i15 < i11; i15++) {
                    h32.A03(8);
                    String[] strArr2 = A01;
                    if (strArr2[6].length() == strArr2[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A01;
                    strArr3[3] = "W7H2tgam7pgMqyIqKZRQoufJib3tzvKG";
                    strArr3[1] = "g3J7gwvZXejdWYIpZtqDt0lnx57dRd6J";
                    h32.A03(8);
                    h32.A03(8);
                }
            }
        }
    }

    public static void A0A(H3 h32) throws C14742i {
        int iA02 = h32.A02(6) + 1;
        for (int i10 = 0; i10 < iA02; i10++) {
            int iA022 = h32.A02(16);
            switch (iA022) {
                case 0:
                    h32.A03(8);
                    h32.A03(16);
                    h32.A03(16);
                    String[] strArr = A01;
                    if (strArr[6].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    A01[2] = "puZWVQ2pTjmoQkTRd3XFOd7V6";
                    h32.A03(6);
                    h32.A03(8);
                    int iA023 = h32.A02(4) + 1;
                    for (int i11 = 0; i11 < iA023; i11++) {
                        h32.A03(8);
                    }
                    break;
                    break;
                case 1:
                    int iA024 = h32.A02(5);
                    int i12 = -1;
                    int[] iArr = new int[iA024];
                    for (int i13 = 0; i13 < iA024; i13++) {
                        iArr[i13] = h32.A02(4);
                        if (iArr[i13] > i12) {
                            i12 = iArr[i13];
                        }
                    }
                    int[] iArr2 = new int[i12 + 1];
                    for (int i14 = 0; i14 < iArr2.length; i14++) {
                        iArr2[i14] = h32.A02(3) + 1;
                        int iA025 = h32.A02(2);
                        if (iA025 > 0) {
                            h32.A03(8);
                        }
                        for (int i15 = 0; i15 < (1 << iA025); i15++) {
                            h32.A03(8);
                        }
                    }
                    h32.A03(2);
                    int iA026 = h32.A02(4);
                    int i16 = 0;
                    int i17 = 0;
                    for (int i18 = 0; i18 < iA024; i18++) {
                        int i19 = iArr[i18];
                        String[] strArr2 = A01;
                        if (strArr2[7].charAt(2) != strArr2[0].charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "4gRGDU2vGyXCYhT5FVmyq5RWvUvygEh7";
                        i16 += iArr2[i19];
                        while (i17 < i16) {
                            h32.A03(iA026);
                            i17++;
                        }
                    }
                    break;
                default:
                    throw C14742i.A01(A07(199, 41, 99) + iA022, null);
            }
        }
    }

    public static void A0B(H3 h32) throws C14742i {
        int iA02 = h32.A02(6) + 1;
        for (int i10 = 0; i10 < iA02; i10++) {
            if (h32.A02(16) > 2) {
                throw C14742i.A01(A07(448, 43, 92), null);
            }
            h32.A03(24);
            h32.A03(24);
            h32.A03(24);
            int iA022 = h32.A02(6) + 1;
            h32.A03(8);
            int[] iArr = new int[iA022];
            for (int i11 = 0; i11 < iA022; i11++) {
                int iA023 = 0;
                int iA024 = h32.A02(3);
                if (h32.A04()) {
                    String[] strArr = A01;
                    if (strArr[7].charAt(2) != strArr[0].charAt(2)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "QebxPehykfYMwUhUEUOD533arJF7pEEp";
                    iA023 = h32.A02(5);
                }
                iArr[i11] = (iA023 * 8) + iA024;
            }
            for (int i12 = 0; i12 < iA022; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        h32.A03(8);
                    }
                }
            }
        }
    }

    public static boolean A0C(int i10, C4J c4j, boolean z10) throws C14742i {
        if (c4j.A07() < 7) {
            if (z10) {
                return false;
            }
            throw C14742i.A01(A07(549, 18, 10) + c4j.A07(), null);
        }
        if (c4j.A0I() != i10) {
            if (z10) {
                return false;
            }
            throw C14742i.A01(A07(178, 21, 53) + Integer.toHexString(i10), null);
        }
        if (c4j.A0I() == 118 && c4j.A0I() == 111 && c4j.A0I() == 114 && c4j.A0I() == 98 && c4j.A0I() == 105 && c4j.A0I() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw C14742i.A01(A07(95, 28, 49), null);
    }

    public static H6[] A0D(C4J c4j, int i10) throws C14742i {
        A0C(5, c4j, false);
        int iA0I = c4j.A0I() + 1;
        H3 h32 = new H3(c4j.A0l());
        h32.A03(c4j.A09() * 8);
        for (int i11 = 0; i11 < iA0I; i11++) {
            A03(h32);
        }
        int iA02 = h32.A02(6) + 1;
        for (int i12 = 0; i12 < iA02; i12++) {
            if (h32.A02(16) != 0) {
                throw C14742i.A01(A07(396, 52, 114), null);
            }
        }
        A0A(h32);
        A0B(h32);
        A09(i10, h32);
        H6[] h6ArrA0E = A0E(h32);
        if (h32.A04()) {
            return h6ArrA0E;
        }
        throw C14742i.A01(A07(240, 43, 105), null);
    }

    public static H6[] A0E(H3 h32) {
        int iA02 = h32.A02(6) + 1;
        H6[] h6Arr = new H6[iA02];
        for (int i10 = 0; i10 < iA02; i10++) {
            h6Arr[i10] = new H6(h32.A04(), h32.A02(16), h32.A02(16), h32.A02(8));
        }
        return h6Arr;
    }
}
