package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1942Kz {
    public static byte[] A00;
    public static String[] A01 = {"tEEVNd46OYTAYJSvyZnVijwEJ9mxfgyG", "BJ13dc7vhZee7KVmjVySYl", "uE9iMCRF0OSjC6XoeKPzOCY04vXFo0vs", "DUz1uNpjuvZzd5dAiuCT4alZ5wEF4BPh", "e8UGMtu5263EOY4JBlmpZ4vkWui3yNma", "jevJBWsVVFh2OOXdK4BBnA9fQcBAm7nu", "BtKAl", "xnRt56CD5b22yVN7z7QNi6lTzhm5niaa"};

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            if (A01[6].length() == 24) {
                throw new RuntimeException();
            }
            A01[5] = "03i3f9u06CqTOPMXzFUkxIwTnPnoVd6c";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 100);
        }
        return new String(bArrCopyOfRange);
    }

    private String A01(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return (iLastIndexOf == -1 || iLastIndexOf <= str.lastIndexOf(47) || (iLastIndexOf + 2) + 4 <= str.length()) ? A00(0, 0, 87) : str.substring(iLastIndexOf + 1, str.length());
    }

    public static void A02() {
        A00 = new byte[]{5};
    }

    public final String A03(String str) {
        String strA01 = A01(str);
        String strA02 = L7.A02(str);
        return TextUtils.isEmpty(strA01) ? strA02 : strA02 + A00(0, 1, 79) + strA01;
    }
}
