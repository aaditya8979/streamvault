package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: SameBase64Decoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f38114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f38115b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f38114a = charArray;
        int[] iArr = new int[256];
        f38115b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            f38115b[f38114a[i10]] = i10;
        }
        f38115b[61] = 0;
    }

    public static String a(String str) {
        byte[] bArrB = b(str);
        return (bArrB == null || bArrB.length == 0) ? "" : new String(bArrB, StandardCharsets.UTF_8);
    }

    public static byte[] b(String str) {
        int i10;
        int length = str.length();
        int i11 = 0;
        if (length == 0) {
            return new byte[0];
        }
        int i12 = length - 1;
        int i13 = 0;
        while (i13 < i12 && f38115b[str.charAt(i13) & 255] < 0) {
            i13++;
        }
        while (i12 > 0 && f38115b[str.charAt(i12) & 255] < 0) {
            i12--;
        }
        int i14 = str.charAt(i12) == '=' ? str.charAt(i12 + (-1)) == '=' ? 2 : 1 : 0;
        int i15 = (i12 - i13) + 1;
        if (length > 76) {
            i10 = (str.charAt(76) == '\r' ? i15 / 78 : 0) << 1;
        } else {
            i10 = 0;
        }
        int i16 = (((i15 - i10) * 6) >> 3) - i14;
        byte[] bArr = new byte[i16];
        int i17 = (i16 / 3) * 3;
        int i18 = 0;
        int i19 = 0;
        while (i18 < i17) {
            int[] iArr = f38115b;
            int i20 = i13 + 1;
            int i21 = i20 + 1;
            int i22 = (iArr[str.charAt(i13)] << 18) | (iArr[str.charAt(i20)] << 12);
            int i23 = i21 + 1;
            int i24 = i22 | (iArr[str.charAt(i21)] << 6);
            int i25 = i23 + 1;
            int i26 = i24 | iArr[str.charAt(i23)];
            int i27 = i18 + 1;
            bArr[i18] = (byte) (i26 >> 16);
            int i28 = i27 + 1;
            bArr[i27] = (byte) (i26 >> 8);
            int i29 = i28 + 1;
            bArr[i28] = (byte) i26;
            if (i10 <= 0 || (i19 = i19 + 1) != 19) {
                i18 = i29;
                i13 = i25;
            } else {
                i13 = i25 + 2;
                i19 = 0;
                i18 = i29;
            }
        }
        if (i18 < i16) {
            int i30 = 0;
            while (i13 <= i12 - i14) {
                i11 |= f38115b[str.charAt(i13)] << (18 - (i30 * 6));
                i30++;
                i13++;
            }
            int i31 = 16;
            while (i18 < i16) {
                bArr[i18] = (byte) (i11 >> i31);
                i31 -= 8;
                i18++;
            }
        }
        return bArr;
    }
}
