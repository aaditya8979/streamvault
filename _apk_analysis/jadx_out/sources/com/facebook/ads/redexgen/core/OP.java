package com.facebook.ads.redexgen.core;

import android.graphics.Color;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class OP {
    public static byte[] A00;
    public static String[] A01 = {"OxqqmxACKcMb9rgd4flgeoqO4FLkDXK8", "hO921EE08Z5YovLaOXzv", "4KPhJxryuqZouci8ltOnoaa6GepMOFR6", "Qaf3Cf9SMgDDqCFg3avrhgzCiMtnLJnE", "vZFktEahG3bWOXRkYAMaCi8nGdaO1v3Q", "tZHqmUfqpLYo8cwpqndw", "zlaA7TXYCJ", "adeIrckSIlUrZ7yW4ZooAIUWBthMSkAF"};
    public static final ThreadLocal<double[]> A02;

    static {
        A08();
        A02 = new ThreadLocal<>();
    }

    public static double A00(int i10) {
        double[] dArrA0B = A0B();
        A0A(i10, dArrA0B);
        return dArrA0B[1] / 100.0d;
    }

    public static double A01(int i10, int i11) {
        if (Color.alpha(i11) != 255) {
            throw new IllegalArgumentException(A07(32, 36, 97) + Integer.toHexString(i11));
        }
        if (Color.alpha(i10) < 255) {
            i10 = A04(i10, i11);
        }
        double dA00 = A00(i10) + 0.05d;
        double dA002 = A00(i11) + 0.05d;
        return Math.max(dA00, dA002) / Math.min(dA00, dA002);
    }

    public static int A02(int i10, int i11) {
        if (i11 < 0 || i11 > 255) {
            throw new IllegalArgumentException(A07(0, 32, 67));
        }
        String[] strArr = A01;
        if (strArr[5].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A01[0] = "DAqAm14HDJv7tSHiVIRuluRO44d0lStM";
        return (16777215 & i10) | (i11 << 24);
    }

    public static int A03(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int A04(int i10, int i11) {
        int iAlpha = Color.alpha(i11);
        int iAlpha2 = Color.alpha(i10);
        int iA03 = A03(iAlpha2, iAlpha);
        return Color.argb(iA03, A06(Color.red(i10), iAlpha2, Color.red(i11), iAlpha, iA03), A06(Color.green(i10), iAlpha2, Color.green(i11), iAlpha, iA03), A06(Color.blue(i10), iAlpha2, Color.blue(i11), iAlpha, iA03));
    }

    public static int A05(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public static int A06(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{26, 23, 11, 19, 26, 91, 22, 14, 8, 15, 91, 25, 30, 91, 25, 30, 15, 12, 30, 30, 21, 91, 75, 91, 26, 21, 31, 91, 73, 78, 78, 85, 59, 56, 58, 50, 62, 43, 54, 44, 55, 61, 121, 58, 56, 55, 121, 55, 54, 45, 121, 59, 60, 121, 45, 43, 56, 55, ExifInterface.START_CODE, 53, 44, 58, 60, 55, 45, 99, 121, 122, 63, 37, 36, 8, 41, ExifInterface.START_CODE, 112, 61, 37, 35, 36, 112, 56, 49, 38, 53, 112, 49, 112, 60, 53, 62, 55, 36, 56, 112, 63, 54, 112, 99, 126};
    }

    public static void A09(int i10, int i11, int i12, double[] dArr) {
        double dPow;
        double dPow2;
        if (dArr.length != 3) {
            throw new IllegalArgumentException(A07(68, 31, 104));
        }
        double d10 = ((double) i10) / 255.0d;
        double dPow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        double d11 = ((double) i11) / 255.0d;
        if (d11 >= 0.04045d) {
            double d12 = d11 + 0.055d;
            if (A01[2].charAt(0) != 'Y') {
                String[] strArr = A01;
                strArr[3] = "aAOO9yx7jRsDtZ33Oh1YUTlwgCOJU7qQ";
                strArr[4] = "tiIjGPCneBcQleUKUeg5FNX5aBHKyIuK";
                dPow = Math.pow(d12 / 1.055d, 2.4d);
            }
            throw new RuntimeException();
        }
        dPow = d11 / 12.92d;
        double d13 = ((double) i12) / 255.0d;
        if (d13 >= 0.04045d) {
            String[] strArr2 = A01;
            if (strArr2[5].length() == strArr2[1].length()) {
                String[] strArr3 = A01;
                strArr3[5] = "axgx58ekBr3JsKBSYEIr";
                strArr3[1] = "AyWuGeE7FNinezs3svxh";
                dPow2 = Math.pow((0.055d + d13) / 1.055d, 2.4d);
            }
            throw new RuntimeException();
        }
        dPow2 = d13 / 12.92d;
        dArr[0] = ((0.4124d * dPow3) + (0.3576d * dPow) + (0.1805d * dPow2)) * 100.0d;
        dArr[1] = ((0.2126d * dPow3) + (0.7152d * dPow) + (0.0722d * dPow2)) * 100.0d;
        dArr[2] = ((0.0193d * dPow3) + (0.1192d * dPow) + (0.9505d * dPow2)) * 100.0d;
    }

    public static void A0A(int i10, double[] dArr) {
        A09(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    public static double[] A0B() {
        double[] dArr = A02.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        A02.set(dArr2);
        return dArr2;
    }
}
