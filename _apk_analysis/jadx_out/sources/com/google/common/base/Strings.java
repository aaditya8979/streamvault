package com.google.common.base;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    static {
        A03();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(@CheckForNull Object obj) {
        if (obj == null) {
            return A00(94, 4, 87);
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, 119) + str, (Throwable) e10);
            return A00(27, 1, 44) + str + A00(2, 7, 119) + e10.getClass().getName() + A00(28, 1, 70);
        }
    }

    public static String A02(@CheckForNull String str, @CheckForNull Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        if (objArr == null) {
            objArr = new Object[]{A00(11, 14, 70)};
        } else {
            for (int i10 = 0; i10 < objArr.length; i10++) {
                objArr[i10] = A01(objArr[i10]);
            }
        }
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i11 = 0;
        int i12 = 0;
        while (i12 < objArr.length && (iIndexOf = strValueOf.indexOf(A00(9, 2, 51), i11)) != -1) {
            sb2.append((CharSequence) strValueOf, i11, iIndexOf);
            sb2.append(objArr[i12]);
            i11 = iIndexOf + 2;
            i12++;
        }
        sb2.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i12 < objArr.length) {
            sb2.append(A00(0, 2, 94));
            sb2.append(objArr[i12]);
            for (int i13 = i12 + 1; i13 < objArr.length; i13++) {
                sb2.append(A00(25, 2, 100));
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        String string = sb2.toString();
        String[] strArr = A01;
        if (strArr[6].charAt(10) == strArr[2].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu";
        strArr2[4] = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f";
        return string;
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, 29, 7, 16, 2, 85, 20, 66, 108, 11, 38, 46, 33, 39, 48, 31, 25, 109, ExifInterface.START_CODE, 49, 40, 40, 74, 70, 18, 122, 48, 13, 22, 16, 5, 1, 28, 26, 27, 85, 17, 0, 7, 28, 27, 18, 85, 25, 16, 27, 28, 16, 27, 1, 51, 26, 7, 24, 20, 1, 85, 19, 26, 7, 85, 38, ExifInterface.START_CODE, 40, 107, 34, ExifInterface.START_CODE, ExifInterface.START_CODE, 34, 41, 32, 107, 38, ExifInterface.START_CODE, 40, 40, ExifInterface.START_CODE, 43, 107, 39, 36, 54, 32, 107, 22, 49, 55, 44, 43, 34, 54, 59, 32, 57, 57};
    }
}
