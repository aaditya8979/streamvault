package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2241Wu {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 124);
        }
        return new String(bArrCopyOfRange);
    }

    public static String A01(long j10) {
        String str;
        String strA00 = A00(0, 0, 78);
        if (j10 < 1000) {
            str = j10 + strA00;
        } else {
            String strA002 = A00(0, 4, 79);
            str = j10 < 1000000 ? String.format(Locale.US, strA002, Double.valueOf(j10 / 1000.0d)) + A00(8, 1, 55) : j10 < 1000000000 ? String.format(Locale.US, strA002, Double.valueOf(j10 / 1000000.0d)) + A00(9, 1, 46) : String.format(Locale.US, strA002, Double.valueOf(j10 / 1.0E9d)) + A00(7, 1, 67);
        }
        String strA003 = A00(4, 3, 1);
        return str.contains(strA003) ? str.replace(strA003, strA00) : str;
    }

    public static void A02() {
        A00 = new byte[]{-16, -7, -3, 49, -85, -83, -83, 1, -2, -9};
    }
}
