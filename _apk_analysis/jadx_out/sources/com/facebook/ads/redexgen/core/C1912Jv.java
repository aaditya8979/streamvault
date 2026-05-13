package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1912Jv {
    public static byte[] A02;
    public static String[] A03 = {"WgUeKuj9wfEgVxNwMhsYWmskS6gvsk4u", "lY3t8mYoNwyGRU5cssOmtzsYdTPyfvrC", "tzc0Un4Rz02llsU2wRoiLNj111WzmA0w", "wjCansXDTCdJlU5xzgIWdtLXD8W6m4ff", "dSf2E5RYsrIqqVu4QtCEIfuVexQKgaAl", "hprG2SUWJwqzwErLsBPmt0UTVTrRmWBo", "Dvzgny", "YcbZLjapWumuyxPaIgpkq7v611"};
    public static final Pattern A04;
    public static final Pattern A05;
    public final C4J A00 = new C4J();
    public final StringBuilder A01 = new StringBuilder();

    static {
        A07();
        A05 = Pattern.compile(A01(49, 19, 56));
        A04 = Pattern.compile(A01(68, 32, 3));
    }

    public static char A00(C4J c4j, int i10) {
        return (char) c4j.A0l()[i10];
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 113);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A02(C4J c4j) {
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        boolean z10 = false;
        while (iA09 < iA0A && !z10) {
            int i10 = iA09 + 1;
            z10 = ((char) c4j.A0l()[iA09]) == ')';
            iA09 = i10;
        }
        String strTrim = c4j.A0W((iA09 - 1) - c4j.A09()).trim();
        if (A03[6].length() == 22) {
            throw new RuntimeException();
        }
        A03[6] = "T";
        return strTrim;
    }

    public static String A03(C4J c4j, StringBuilder sb2) {
        sb2.setLength(0);
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        boolean z10 = false;
        while (iA09 < iA0A && !z10) {
            char c10 = (char) c4j.A0l()[iA09];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                iA09++;
                sb2.append(c10);
            }
        }
        c4j.A0g(iA09 - c4j.A09());
        return sb2.toString();
    }

    public static String A04(C4J c4j, StringBuilder sb2) {
        A09(c4j);
        if (c4j.A07() == 0) {
            return null;
        }
        String strA03 = A03(c4j, sb2);
        String strA01 = A01(0, 0, 111);
        return !strA01.equals(strA03) ? strA03 : strA01 + ((char) c4j.A0I());
    }

    public static String A05(C4J c4j, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int iA09 = c4j.A09();
            String strA04 = A04(c4j, sb2);
            if (strA04 == null) {
                return null;
            }
            if (A01(252, 1, 127).equals(strA04) || A01(11, 1, 32).equals(strA04)) {
                c4j.A0f(iA09);
                z10 = true;
            } else {
                sb3.append(strA04);
            }
        }
        String string = sb3.toString();
        String[] strArr = A03;
        if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
            throw new RuntimeException();
        }
        A03[1] = "H7IbVoVWHhMCEaN9uIz63JDuRBiIUDdu";
        return string;
    }

    public static String A06(C4J c4j, StringBuilder sb2) {
        A09(c4j);
        if (c4j.A07() < 5) {
            return null;
        }
        if (!A01(6, 5, 105).equals(c4j.A0W(5))) {
            return null;
        }
        int iA09 = c4j.A09();
        String strA04 = A04(c4j, sb2);
        if (strA04 == null) {
            return null;
        }
        if (A01(251, 1, 47).equals(strA04)) {
            c4j.A0f(iA09);
            return A01(0, 0, 111);
        }
        String strA02 = A01(3, 1, 78).equals(strA04) ? A02(c4j) : null;
        String strA042 = A04(c4j, sb2);
        if (A03[1].charAt(23) == '0') {
            throw new RuntimeException();
        }
        A03[2] = "kXJ9Slail85MSzeGoJKC016PF6DECpEt";
        if (A01(4, 1, 97).equals(strA042)) {
            return strA02;
        }
        return null;
    }

    public static void A07() {
        A02 = new byte[]{8, 90, 83, 23, 57, 121, 34, 34, 123, 109, 125, 106, 96, 71, 95, 72, 69, 64, 77, 9, 79, 70, 71, 93, 4, 90, 64, 83, 76, 19, 9, 14, 95, 109, 106, 126, 124, 124, 75, 123, 123, 88, 105, 122, 123, 109, 122, 36, 86, 21, 18, 63, 38, 32, ExifInterface.START_CODE, 44, 116, 107, 97, 18, 23, 107, 20, 99, 96, 107, 21, 20, 44, 90, 90, 77, 72, 41, 66, 95, 75, 47, 88, 46, 92, 91, 77, 41, 66, 95, 75, 47, 89, 91, 90, 2, 10, 14, 23, 31, 14, 87, 91, 86, 39, ExifInterface.START_CODE, ExifInterface.START_CODE, 19, 16, 18, 26, 22, 3, 30, 4, 31, 21, 92, 18, 30, 29, 30, 3, 93, 80, 83, 91, 52, 56, 59, 56, 37, 6, 11, 5, 11, 22, 17, 116, 124, 51, 58, 59, 33, 120, 51, 52, 56, 60, 57, 44, 100, 109, 108, 118, 47, 113, 107, 120, 103, 111, 102, 103, 125, 36, 122, 125, 112, 101, 108, 40, 33, 32, 58, 99, 57, 43, 39, 41, 38, 58, 101, 120, 109, 96, 101, 111, 18, 11, 24, 15, 119, 127, 124, 123, 108, 119, 35, 126, 97, 125, 103, 122, 103, 97, 96, ExifInterface.START_CODE, 59, 38, ExifInterface.START_CODE, 115, 61, 49, 51, 60, 55, 48, 59, 115, 43, 46, 44, 55, 57, 54, ExifInterface.START_CODE, 69, 84, 73, 69, 28, 85, 84, 82, 94, 67, 80, 69, 88, 94, 95, 117, 110, 100, 101, 114, 18, 9, 3, 2, 21, 11, 14, 9, 2, 37, 115};
    }

    public static void A08(C4J c4j) {
        while (!TextUtils.isEmpty(c4j.A0T())) {
        }
    }

    public static void A09(C4J c4j) {
        boolean z10 = true;
        while (c4j.A07() > 0 && z10) {
            boolean zA0E = A0E(c4j);
            String[] strArr = A03;
            if (strArr[5].charAt(6) == strArr[0].charAt(6)) {
                throw new RuntimeException();
            }
            A03[4] = "0TKGD6osFOak97huLTwvjNDJFBkvRURl";
            z10 = zA0E || A0D(c4j);
        }
    }

    public static void A0A(C4J c4j, C1916Jz c1916Jz, StringBuilder sb2) {
        A09(c4j);
        String strA03 = A03(c4j, sb2);
        String strA01 = A01(0, 0, 111);
        if (strA01.equals(strA03)) {
            return;
        }
        if (A03[7].length() != 9) {
            String[] strArr = A03;
            strArr[5] = "0USPULEwqSqheHB8AwvifNHGUwFlc4Dk";
            strArr[0] = "K61Ol0RKHiZGAookV7xLX0vZAqBJUPJk";
            if (!A01(5, 1, 50).equals(A04(c4j, sb2))) {
                return;
            }
            A09(c4j);
            String strA05 = A05(c4j, sb2);
            if (strA05 == null || strA01.equals(strA05)) {
                return;
            }
            int iA09 = c4j.A09();
            String strA04 = A04(c4j, sb2);
            if (!A01(11, 1, 32).equals(strA04)) {
                if (!A01(252, 1, 127).equals(strA04)) {
                    return;
                } else {
                    c4j.A0f(iA09);
                }
            }
            if (A01(123, 5, 38).equals(strA03)) {
                c1916Jz.A0C(C3V.A00(strA05));
                return;
            }
            if (A01(103, 16, 0).equals(strA03)) {
                c1916Jz.A0B(C3V.A00(strA05));
                return;
            }
            boolean z10 = true;
            if (A01(189, 13, 127).equals(strA03)) {
                if (A01(183, 4, 12).equals(strA05)) {
                    c1916Jz.A0E(1);
                    return;
                } else {
                    if (A01(237, 5, 113).equals(strA05)) {
                        c1916Jz.A0E(2);
                        return;
                    }
                    return;
                }
            }
            String[] strArr2 = A03;
            if (strArr2[5].charAt(6) != strArr2[0].charAt(6)) {
                A03[7] = "r";
                if (A01(202, 20, 47).equals(strA03)) {
                    if (!A01(100, 3, 55).equals(strA05) && !strA05.startsWith(A01(128, 6, 19))) {
                        z10 = false;
                    }
                    c1916Jz.A0H(z10);
                    return;
                }
                boolean zEquals = A01(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, 15, 64).equals(strA03);
                if (A03[1].charAt(23) == '0') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A03;
                strArr3[5] = "yV6z32KBYC5kRTQJBEYXfmL3n0QpULhq";
                strArr3[0] = "ddMdMWLPn2YWu0ZxAW3O28brDgrMgVms";
                if (zEquals) {
                    if (A01(242, 9, 22).equals(strA05)) {
                        c1916Jz.A0J(true);
                        return;
                    }
                    return;
                }
                if (A01(136, 11, 36).equals(strA03)) {
                    c1916Jz.A0F(strA05);
                    return;
                }
                if (A01(166, 11, 63).equals(strA03)) {
                    if (A01(119, 4, 78).equals(strA05)) {
                        c1916Jz.A0G(true);
                        return;
                    }
                    return;
                } else if (A01(156, 10, 120).equals(strA03)) {
                    if (A01(177, 6, 125).equals(strA05)) {
                        c1916Jz.A0I(true);
                        return;
                    }
                    return;
                } else {
                    if (A01(147, 9, 115).equals(strA03)) {
                        A0C(strA05, c1916Jz);
                        return;
                    }
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0B(C1916Jz c1916Jz, String str) {
        if (A01(0, 0, 111).equals(str)) {
            return;
        }
        int iIndexOf = str.indexOf(91);
        if (iIndexOf != -1) {
            Matcher matcher = A05.matcher(str.substring(iIndexOf));
            if (matcher.matches()) {
                c1916Jz.A0N((String) C3M.A01(matcher.group(1)));
            }
            str = str.substring(0, iIndexOf);
        }
        String[] strArrA1O = AbstractC15184a.A1O(str, A01(47, 2, 9));
        String str2 = strArrA1O[0];
        int iIndexOf2 = str2.indexOf(35);
        if (iIndexOf2 != -1) {
            c1916Jz.A0M(str2.substring(0, iIndexOf2));
            c1916Jz.A0L(str2.substring(iIndexOf2 + 1));
        } else {
            c1916Jz.A0M(str2);
        }
        if (strArrA1O.length > 1) {
            c1916Jz.A0O((String[]) AbstractC15184a.A1J(strArrA1O, 1, strArrA1O.length));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0C(java.lang.String r6, com.facebook.ads.redexgen.core.C1916Jz r7) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1912Jv.A0C(java.lang.String, com.facebook.ads.redexgen.X.Jz):void");
    }

    public static boolean A0D(C4J c4j) {
        int iA09 = c4j.A09();
        int iA0A = c4j.A0A();
        byte[] bArrA0l = c4j.A0l();
        if (iA09 + 2 > iA0A) {
            return false;
        }
        int i10 = iA09 + 1;
        if (bArrA0l[iA09] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (bArrA0l[i10] != 42) {
            return false;
        }
        while (i11 + 1 < iA0A) {
            int i12 = i11 + 1;
            if (((char) bArrA0l[i11]) == '*' && ((char) bArrA0l[i12]) == '/') {
                iA0A = i12 + 1;
                i11 = iA0A;
            } else {
                i11 = i12;
            }
        }
        c4j.A0g(iA0A - c4j.A09());
        return true;
    }

    public static boolean A0E(C4J c4j) {
        switch (A00(c4j, c4j.A09())) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
                c4j.A0g(1);
                return true;
            default:
                return false;
        }
    }

    public final List<C1916Jz> A0F(C4J c4j) {
        String strA01;
        this.A01.setLength(0);
        int iA09 = c4j.A09();
        A08(c4j);
        this.A00.A0j(c4j.A0l(), c4j.A09());
        this.A00.A0f(iA09);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strA06 = A06(this.A00, this.A01);
            if (strA06 == null) {
                return arrayList;
            }
            if (!A01(251, 1, 47).equals(A04(this.A00, this.A01))) {
                return arrayList;
            }
            C1916Jz c1916Jz = new C1916Jz();
            A0B(c1916Jz, strA06);
            String strA04 = null;
            boolean z10 = false;
            while (true) {
                strA01 = A01(252, 1, 127);
                if (z10) {
                    break;
                }
                int iA092 = this.A00.A09();
                strA04 = A04(this.A00, this.A01);
                z10 = strA04 == null || strA01.equals(strA04);
                if (!z10) {
                    this.A00.A0f(iA092);
                    A0A(this.A00, c1916Jz, this.A01);
                }
            }
            if (strA01.equals(strA04)) {
                arrayList.add(c1916Jz);
            }
        }
    }
}
