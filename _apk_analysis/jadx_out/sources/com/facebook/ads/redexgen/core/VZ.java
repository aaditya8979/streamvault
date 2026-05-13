package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class VZ {
    public static byte[] A00;
    public static final AtomicReference<String> A01;
    public static final AtomicReference<String> A02;

    static {
        A09();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(SQ sq2) {
        return A05(sq2) + A00(47, 19, 53);
    }

    public static String A02(SQ sq2) {
        return A07(sq2, U7.A0X(sq2)) + A00(22, 14, 18);
    }

    public static String A03(SQ sq2) {
        return A05(sq2) + A00(1, 21, 59);
    }

    public static String A04(SQ sq2) {
        return A07(sq2, U7.A0Y(sq2)) + A00(36, 11, 107);
    }

    public static String A05(SQ sq2) {
        String str = A01.get();
        return !TextUtils.isEmpty(str) ? str : A06(sq2, A00(66, 28, 123));
    }

    public static String A06(SQ sq2, String str) {
        String strA9I = sq2.A05().A9I();
        return String.format(Locale.US, str, TextUtils.isEmpty(strA9I) ? A00(0, 0, 61) : A00(0, 1, 7) + strA9I);
    }

    public static String A07(SQ sq2, String str) {
        String str2 = A02.get();
        return !TextUtils.isEmpty(str2) ? str2 : A08(A06(sq2, A00(94, 26, 15)), str);
    }

    public static String A08(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : str.replace(A00(120, 3, 79), str2);
    }

    public static void A09() {
        A00 = new byte[]{31, 34, 59, 52, 62, 52, 56, 62, 52, 57, 61, 52, 52, 58, 52, 61, 60, 34, 111, 120, 106, 126, 11, 69, 64, 74, 83, 123, 72, 75, 67, 67, 77, 74, 67, 11, 114, 60, 57, 51, ExifInterface.START_CODE, 2, 46, 36, 51, 62, 111, 44, 109, 102, 119, 116, 108, 113, 104, 92, 98, 103, 112, 92, 96, 108, 110, 110, 108, 109, 37, 57, 57, 61, 62, 119, 98, 98, ExifInterface.START_CODE, 63, 44, 61, 37, 104, 62, 99, 43, 44, 46, 40, 47, 34, 34, 38, 99, 46, 34, 32, 81, 77, 77, 73, 74, 3, 22, 22, 78, 78, 78, 28, 74, 23, 95, 88, 90, 92, 91, 86, 86, 82, 23, 90, 86, 84, 14, 14, 14};
    }
}
