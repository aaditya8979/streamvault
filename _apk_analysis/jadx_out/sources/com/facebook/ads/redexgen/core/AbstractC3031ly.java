package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC3031ly {
    public static byte[] A00;
    public static String[] A01 = {"fJDf", "VkLLWE3ELp7DsfFuFenvwwLsPjI8q3w8", "s9GcUvLboBZm1e6Ekj11FftjBiZdTcWD", "kTl0WqBBPCgx1YUBrq8Yk7FHC1rOJ5oT", "2c7Ei341qIBi4", "zzPJEXqVRlvEQi82OrUT3CEPhy8UQIOr", "ZG1Rx4gICbV4uv7Dpzg", "07yiSgf44iyORMUUp2pTD8D2q1F4zIaZ"};

    static {
        A09();
    }

    public static int A00(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    public static int A01(int i10) {
        return Math.max(4, AbstractC3062mU.A01(i10 + 1, 1.0d));
    }

    public static int A02(int i10, int i11) {
        return (~i11) & i10;
    }

    public static int A03(int i10, int i11) {
        return i10 & i11;
    }

    public static int A04(int i10, int i11, int i12) {
        return ((~i12) & i10) | (i11 & i12);
    }

    public static int A05(Object obj, int i10) {
        if (!(obj instanceof byte[])) {
            return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
        }
        byte[] bArr = (byte[]) obj;
        String[] strArr = A01;
        if (strArr[7].charAt(2) == strArr[1].charAt(2)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "gOsQhpmuBfY4V5Uh9EOVYoJDHQZIMaPr";
        strArr2[1] = "iXjLr0Nzfsbh2eLMx3OKOYlS2nK033Z5";
        return bArr[i10] & 255;
    }

    public static int A06(@CheckForNull Object obj, @CheckForNull Object obj2, @CheckForNull int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iA02 = AbstractC3062mU.A02(obj);
        int i11 = iA02 & i10;
        int iA05 = A05(obj3, i11);
        if (iA05 == 0) {
            return -1;
        }
        int iA022 = A02(iA02, i10);
        int i12 = -1;
        do {
            int i13 = iA05 - 1;
            int i14 = iArr[i13];
            if (A02(i14, i10) == iA022 && BX.A01(obj, objArr[i13]) && (objArr2 == null || BX.A01(obj2, objArr2[i13]))) {
                int iA03 = A03(i14, i10);
                if (i12 == -1) {
                    A0B(obj3, i11, iA03);
                } else {
                    iArr[i12] = A04(iArr[i12], iA03, i10);
                }
                return i13;
            }
            i12 = i13;
            iA05 = A03(i14, i10);
        } while (iA05 != 0);
        return -1;
    }

    public static Object A07(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(A08(0, 41, 90) + i10);
        }
        String[] strArr = A01;
        if (strArr[7].charAt(2) == strArr[1].charAt(2)) {
            throw new RuntimeException();
        }
        A01[4] = "VDEftDKNqOp";
        return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{65, 89, 95, 88, 12, 78, 73, 12, 92, 67, 91, 73, 94, 12, 67, 74, 12, 30, 12, 78, 73, 88, 91, 73, 73, 66, 12, 30, 114, 29, 12, 77, 66, 72, 12, 30, 114, 31, 28, 22, 12};
    }

    public static void A0A(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
            return;
        }
        if (!(obj instanceof short[])) {
            Arrays.fill((int[]) obj, 0);
            return;
        }
        short[] sArr = (short[]) obj;
        String[] strArr = A01;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "hUcb6ZsCLqLA1C86WZWvJTtWEnkRLSAT";
        strArr2[3] = "OMeqeXOrCHp61xmAuW8PqHFLEwFvqHIh";
        Arrays.fill(sArr, (short) 0);
    }

    public static void A0B(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
            return;
        }
        boolean z10 = obj instanceof short[];
        String[] strArr = A01;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "nPoOEr0hPUqtXLframy";
        strArr2[0] = "fOVN";
        if (z10) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
