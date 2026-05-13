package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class BZ implements InterfaceC2872jB<Character> {
    public static byte[] A00;
    public static String[] A01 = {"hclkFSbi6Vg1BfvH0wmaDr4dbn73", "G9lpasi9RBaNNLModxK5K8gUTz14LheK", "Gftcr", "paUG0VLHuMGB0YhbqyP1Nk9wNO1yz", "Gk6etbpP6dMkcTEXSV9xUYuIVF", "di9Lt", "", "3ewjDWS3ktgbM1wBomSiDURsX5cxFOtv"};

    static {
        A07();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.0b] */
    public static C14170b A02(final char c10) {
        return new AbstractC14571p(c10) { // from class: com.facebook.ads.redexgen.X.0b
            public static byte[] A01;
            public static String[] A02 = {"9yE19", "zOI7IBt", "QcxtIsV3beme0fSshBZEiAbzAb", "54lX5AjhAsj9h7", "50Stt6", "IBfS2nVlEcQ7MYOv0zA4iOMcJ", "2Gh0ygEYZnFezhOBR", "xA0qoezlN6x4dJxmGj9eAbu4w6XV572R"};
            public final char A00;

            static {
                A01();
            }

            {
                this.A00 = c10;
            }

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    byte b10 = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
                    if (A02[2].length() != 26) {
                        throw new RuntimeException();
                    }
                    A02[1] = "Dls36CWZuql1";
                    bArrCopyOfRange[i13] = b10;
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                byte[] bArr = {55, 57, 25, 50, 59, 40, 23, 59, 46, 57, 50, 63, 40, 116, 51, 41, 114, 125};
                if (A02[1].length() == 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[0] = "urSdB";
                strArr[6] = "hh6CYTzAaza6NCd4D";
                A01 = bArr;
            }

            @Override // com.facebook.ads.redexgen.core.BZ
            public final boolean A09(char c11) {
                return c11 == this.A00;
            }

            public final String toString() {
                return A00(2, 16, 41) + BZ.A04(this.A00) + A00(0, 2, 99);
            }
        };
    }

    public static BZ A03() {
        BZ bz = C0J.A01;
        if (A01[1].charAt(7) == 'R') {
            throw new RuntimeException();
        }
        A01[1] = "RCT2CzV9IWXJqUHkaSW8fbkoFpPJrj9F";
        return bz;
    }

    public static String A04(char c10) {
        String strA06 = A06(0, 16, 115);
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = 0;
        while (A01[7].charAt(17) != '8') {
            A01[3] = "qYlA5j1UP55Q3fDxlHttfnhdcQNgK";
            if (i10 >= 4) {
                return String.copyValueOf(cArr);
            }
            cArr[5 - i10] = strA06.charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
            i10++;
        }
        throw new RuntimeException();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{-80, -79, -78, -77, -76, -75, -74, -73, -72, -71, -63, -62, -61, -60, -59, -58};
    }

    public int A08(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        AbstractC2871jA.A01(i10, length);
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            String[] strArr = A01;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[1] = "6mJi9OgqL4fnjCQ1IPpC8dqdRNdbhMMp";
            if (A09(cCharAt)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public abstract boolean A09(char c10);

    @Deprecated
    public boolean A0A(Character ch2) {
        return A09(ch2.charValue());
    }
}
