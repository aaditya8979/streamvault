package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3181oR {
    public static byte[] A00;
    public static String[] A01 = {"c6xksnT41HcsUKTJQNKQUUgPizIoQEq7", "WxNXiQtoIPtkZSOvfQD2WRgz0FRR9nHB", "0W3ozcXeUf0HHNgljiWCV2HF0oAsRQbi", "fgzW1UUUZ", "O0bR9ZeclLezQy3Qbc2ToHrC1rtck2lk", "lkeBgJo9Q0VPEUMwx37sMSkp8PGnIPOP", "djrdLhPsa8uKbU3eQglu3qx0uljp8azj", "xtpRaDH0t"};

    static {
        A02();
    }

    public static Object A00(@CheckForNull Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(A01(0, 9, 81) + i10);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 21);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {37, 48, 100, 45, ExifInterface.START_CODE, 32, 33, 60, 100};
        String[] strArr = A01;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[1] = "M9elCsu2ZKCRxn57Vnxvtjkp0iclIc1e";
        strArr2[2] = "8jrrMw1RDLVSnYLZpZuKU5Zh0pORqyYH";
        A00 = bArr;
    }

    public static Object[] A03(Object... objArr) {
        A04(objArr, objArr.length);
        return objArr;
    }

    public static Object[] A04(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            A00(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] A05(T[] tArr, int i10) {
        return (T[]) AbstractC3187oY.A01(tArr, i10);
    }
}
