package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AD extends AbstractC3263q8 {
    public static byte[] A00;
    public static String[] A01 = {"siq85GDJwTeYE", "hCeAcOWL38esGxpCGhAcOByVvpt4rkG9", "m2sukptzj10OlAU9Tp5GtC3mJBPhtf8e", "xjjTaPx7kc7NMEZNqBPsTeRSC2dGu2kw", "w", "lzhISLab9GK0zTqogctfE75BYP1X9oPw", "tkIGufAtpO8Bl63czpB", ""};

    static {
        A0B();
    }

    public static int A00(int i10) {
        return i10;
    }

    public static int A01(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int A02(int i10, int i11, int i12) {
        AbstractC2871jA.A0G(i11 <= i12, A09(16, 47, 91), i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    public static int A03(long j10) {
        int i10 = (int) j10;
        AbstractC2871jA.A0H(((long) i10) == j10, A09(0, 16, 43), j10);
        return i10;
    }

    public static int A04(long j10) {
        if (j10 <= 2147483647L) {
            if (j10 < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            return (int) j10;
        }
        if (A01[7].length() != 0) {
            throw new RuntimeException();
        }
        A01[1] = "nVSCb9uBdS4Z5srNqmAxsZ9hxFd1bctQ";
        return Integer.MAX_VALUE;
    }

    public static int A05(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int A06(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static String A09(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            int i14 = bArrCopyOfRange[i13] ^ i12;
            if (A01[7].length() != 0) {
                throw new RuntimeException();
            }
            A01[7] = "";
            bArrCopyOfRange[i13] = (byte) (i14 ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static List<Integer> A0A(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new C3264q9(iArr);
    }

    public static void A0B() {
        A00 = new byte[]{44, 22, 23, 67, 12, 5, 67, 17, 2, 13, 4, 6, 89, 67, 70, 16, 126, 122, 125, 51, 59, 54, 96, 58, 51, 126, 102, 96, 103, 51, 113, 118, 51, 127, 118, 96, 96, 51, 103, 123, 114, 125, 51, 124, 97, 51, 118, 98, 102, 114, 127, 51, 103, 124, 51, 126, 114, 107, 51, 59, 54, 96, 58};
    }

    public static int[] A0C(Collection<? extends Number> collection) {
        if (collection instanceof C3264q9) {
            return ((C3264q9) collection).A04();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        if (A01[1].charAt(22) == 'l') {
            throw new RuntimeException();
        }
        A01[1] = "hGECTcBTlZrQNB5F5BgF8ddu5i2bV8V4";
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) AbstractC2871jA.A04(array[i10])).intValue();
        }
        return iArr;
    }
}
