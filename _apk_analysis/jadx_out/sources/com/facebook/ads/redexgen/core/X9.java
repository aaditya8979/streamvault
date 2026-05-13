package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class X9 {
    public static byte[] A00;
    public static String[] A01 = {"4IRJGuEovS11eWhLlTHcTHgAIcL0Dfrc", "lMuOXcilHIakoSNiM9TiHcKlty4yon92", "2r", "0", "YIb1Fa9ANLl8YhZPR0dNpX70Iddjh9PH", "Y", "pnRx8X5Hy3x4IRuF7DDbibtYxh7eaWKw", "bsDursaggw8Ai2drbHqfQpiV"};

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(String str) {
        if (str == null) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, A00(0, 1, 57), true);
        int i10 = 0;
        if (str.length() <= 90) {
            return str;
        }
        int length = str.length();
        String[] strArr = A01;
        if (strArr[1].charAt(16) == strArr[0].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "q4cROosmp2j6ascm330FkUlu";
        strArr2[5] = ExifInterface.LONGITUDE_EAST;
        String strA00 = A00(1, 3, 108);
        if (length <= 93 && str.endsWith(strA00)) {
            return str;
        }
        while (stringTokenizer.hasMoreTokens()) {
            int length2 = stringTokenizer.nextToken().length();
            if (i10 + length2 < 90) {
                i10 += length2;
            }
        }
        return i10 == 0 ? str.substring(0, 90) + strA00 : str.substring(0, i10) + strA00;
    }

    public static void A02() {
        A00 = new byte[]{76, 23, 23, 23};
    }
}
