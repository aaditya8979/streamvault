package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GV {
    public static byte[] A00;
    public static String[] A01 = {"Y8HEI18e1GadHrln0qmDFCEaxi", "oL2ricEuOMEwxHFhMskly09xAYMP2tCR", "T", "KMY19rMWfOVULyqsMixIRosvw7BV", "hLcN9Ked", "HwmbqduaXfn6sstptA", "kxZRIOPiX6BuamdrhGUbsB3Guhn0rTOf", "HgYihtPWg4cBhJSwUBMvBFzsg3tZPPZN"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;

    static {
        A06();
        A02 = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
        A03 = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
        A04 = new int[]{64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    }

    public static int A00(ByteBuffer byteBuffer) {
        int i10;
        int iPosition = byteBuffer.position();
        switch (byteBuffer.get(iPosition)) {
            case -2:
                i10 = ((byteBuffer.get(iPosition + 5) & 1) << 6) | ((byteBuffer.get(iPosition + 4) & 252) >> 2);
                break;
            case -1:
                i10 = ((byteBuffer.get(iPosition + 4) & 7) << 4) | ((byteBuffer.get(iPosition + 7) & 60) >> 2);
                break;
            case 31:
                i10 = ((byteBuffer.get(iPosition + 5) & 7) << 4) | ((byteBuffer.get(iPosition + 6) & 60) >> 2);
                break;
            default:
                i10 = ((byteBuffer.get(iPosition + 4) & 1) << 6) | ((byteBuffer.get(iPosition + 5) & 252) >> 2);
                break;
        }
        return (i10 + 1) * 32;
    }

    public static int A01(byte[] bArr) {
        int i10;
        boolean z10 = false;
        switch (bArr[0]) {
            case -2:
                byte b10 = bArr[4];
                String[] strArr = A01;
                if (strArr[5].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[5] = "4XRrhZnjb0Sc0OiDCf";
                strArr2[0] = "emycfV24cXaR3M70231yELMb9K";
                i10 = (((b10 & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[6] & 240) >> 4)) + 1;
                break;
                break;
            case -1:
                i10 = (((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[9] & 60) >> 2)) + 1;
                z10 = true;
                break;
            case 31:
                i10 = (((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4) | ((bArr[8] & 60) >> 2)) + 1;
                z10 = true;
                break;
            default:
                i10 = (((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4) | ((bArr[7] & 240) >> 4)) + 1;
                break;
        }
        return z10 ? (i10 * 16) / 14 : i10;
    }

    public static int A02(byte[] bArr) {
        int i10;
        switch (bArr[0]) {
            case -2:
                i10 = ((bArr[5] & 1) << 6) | ((bArr[4] & 252) >> 2);
                break;
            case -1:
                i10 = ((bArr[4] & 7) << 4) | ((bArr[7] & 60) >> 2);
                break;
            case 31:
                i10 = ((bArr[5] & 7) << 4) | ((bArr[6] & 60) >> 2);
                break;
            default:
                i10 = ((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2);
                break;
        }
        return (i10 + 1) * 32;
    }

    public static C3206or A03(byte[] bArr, String str, String str2, DrmInitData drmInitData) {
        C4I c4iA04 = A04(bArr);
        c4iA04.A09(60);
        int i10 = A02[c4iA04.A04(6)];
        int i11 = A03[c4iA04.A04(4)];
        int iA04 = c4iA04.A04(5);
        int i12 = iA04 >= A04.length ? -1 : (A04[iA04] * 1000) / 2;
        c4iA04.A09(10);
        return new C2D().A0y(str).A11(A05(0, 13, 27)).A0a(i12).A0b(i10 + (c4iA04.A04(2) > 0 ? 1 : 0)).A0m(i11).A0u(drmInitData).A10(str2).A14();
    }

    public static C4I A04(byte[] bArr) {
        if (bArr[0] == 127) {
            return new C4I(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (A08(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b10 = bArrCopyOf[i10];
                bArrCopyOf[i10] = bArrCopyOf[i10 + 1];
                bArrCopyOf[i10 + 1] = b10;
            }
        }
        C4I c4i = new C4I(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C4I c4i2 = new C4I(bArrCopyOf);
            while (c4i2.A01() >= 16) {
                c4i2.A09(2);
                int iA04 = c4i2.A04(14);
                if (A01[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "nbIesC19CiuPXGAO1XmsVCjTSWLNlLKJ";
                strArr[7] = "ltOJbsz7vYOuZPV8QSj4f10zt4SJvXCJ";
                c4i.A0B(iA04, 14);
            }
        }
        c4i.A0D(bArrCopyOf);
        return c4i;
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{7, 19, 2, 15, 9, 73, 16, 8, 2, 72, 2, 18, 21};
    }

    public static boolean A07(int i10) {
        return i10 == 2147385345 || i10 == -25230976 || i10 == 536864768 || i10 == -14745368;
    }

    public static boolean A08(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
