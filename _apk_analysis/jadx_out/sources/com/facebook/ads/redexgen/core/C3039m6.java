package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C3039m6 implements InterfaceC1749Dn {
    public static byte[] A00;
    public static String[] A01 = {"RZM4uVKUom5lpktBJEyc25x7FZDN3vpb", "gyiT966obFesLv2pc6lrzZfv63yxEjKJ", "VIDunhCfmmrKAvVQDuOofVowNsnrOYKS", "mSpbf5NAYyyPHT1f9KFsrup9mcKoYOHE", "zbmZ0JzF4Zq1L7424UboTB7UCymQSbun", "dFdj", "MzILoqUyJ5XWrj98JXnqdIxQxE4zJ", "8Kz26tJHiwFUzLhIg6rooXB"};

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 94);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-34, 17, 17, 2, 10, 13, 17, 2, 1, -67, 17, 12, -67, 0, 15, 2, -2, 17, 2, -67, 1, 2, 0, 12, 1, 2, 15, -67, 3, 12, 15, -67, 18, 11, 16, 18, 13, 13, 12, 15, 17, 2, 1, -67, -22, -26, -22, -30, -67, 17, 22, 13, 2, -41, -67, 19, 34, 34, 30, 27, 21, 19, 38, 27, 33, 32, ExifInterface.MARKER_APP1, 21, 23, 19, -33, -24, -30, -22, 29, 44, 44, 40, 37, 31, 29, 48, 37, 43, ExifInterface.START_CODE, -21, 31, 33, 29, -23, -13, -20, -12, -56, -41, -41, -45, -48, -54, -56, -37, -48, -42, -43, -106, -53, -35, -55, -38, -36, -55, -38, -3, 12, 12, 8, 5, -1, -3, 16, 5, 11, 10, -53, 12, 3, 15, 59, 74, 74, 70, 67, 61, 59, 78, 67, 73, 72, 9, 78, 78, 71, 70, 5, 82, 71, 70, -35, -20, -20, -24, -27, -33, -35, -16, -27, -21, -22, -85, -12, -87, -23, -20, -80, -87, -33, ExifInterface.MARKER_APP1, -35, -87, -78, -84, -76, 15, 30, 30, 26, 23, 17, 15, 34, 23, 29, 28, -35, 38, -37, 27, 30, -30, -37, 36, 34, 34, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -9, -84, -16, -12, -24, -30, -22, -13, -24, -20, -28, -84, -13, -9, -78, -26, -55, -40, -40, -44, -47, -53, -55, -36, -47, -41, -42, -105, -32, -107, -37, -35, -54, -38, -47, -40, -16, ExifInterface.MARKER_APP1, -12, -16, -85, -14, -16, -16, 61, 46, 65, 61, -8, 65, -10, 46, 65, 56, 57, 53, ExifInterface.START_CODE, 66, 46, 59, -10, 44, 62, 46, 60, -45, -60, -41, -45, -114, -41, -116, -46, -46, -64};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1749Dn
    public final InterfaceC2945kN A5C(C3206or c3206or) {
        byte b10;
        String str = c3206or.A0W;
        if (str != null) {
            switch (str.hashCode()) {
                case 1201784583:
                    if (str.equals(A00(249, 21, 107))) {
                        b10 = 0;
                        break;
                    }
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    return new AnonymousClass95();
            }
        }
        throw new IllegalArgumentException(A00(0, 55, 63) + str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1749Dn
    public final boolean AJc(C3206or c3206or) {
        String str = c3206or.A0W;
        if (!A00(241, 8, 30).equals(str) && !A00(270, 10, 1).equals(str) && !A00(127, 20, 124).equals(str) && !A00(172, 21, 80).equals(str)) {
            String[] strArr = A01;
            if (strArr[6].length() != strArr[7].length()) {
                A01[4] = "ilKJ2fcQQU31mDfBW0rq4wTAOnRwqntF";
                if (!A00(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, 20, 10).equals(str) && !A00(193, 28, 33).equals(str)) {
                    boolean zEquals = A00(55, 19, 84).equals(str);
                    if (A01[5].length() == 4) {
                        String[] strArr2 = A01;
                        strArr2[3] = "zagSEBYMwAryKt6uIWB8fghbt3YyxLCs";
                        strArr2[0] = "njnOkrTqvKyYsDLdiJrWbCfOV0ebYkea";
                        if (!zEquals && !A00(147, 25, 30).equals(str) && !A00(74, 19, 94).equals(str) && !A00(93, 19, 9).equals(str) && !A00(112, 15, 62).equals(str) && !A00(249, 21, 107).equals(str)) {
                            return false;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }
}
