package com.ironsource.adqualitysdk.sdk.i;

import androidx.exifinterface.media.ExifInterface;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
public class ie {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2476 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2477;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static /* synthetic */ boolean f2478;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2479;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final byte[] f2480;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static final byte[] f2481;

    static {
        m6541();
        int i10 = f2476 + 1;
        f2479 = i10 % 128;
        int i11 = i10 % 2;
        f2478 = true;
        f2481 = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f2480 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, ExifInterface.START_CODE, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
    }

    private ie() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] m6538(byte[] r16, int r17, int r18, byte[] r19) throws com.ironsource.adqualitysdk.sdk.i.ic {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m6538(byte[], int, int, byte[]):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] m6539(byte[] r7, int r8, int r9, byte[] r10, int r11, byte[] r12) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.ie.f2479
            int r0 = r0 + 107
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2476 = r1
            r2 = 2
            int r0 = r0 % r2
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L16
            r0 = 75
            int r0 = r0 / r3
            if (r9 <= 0) goto L24
            goto L1d
        L14:
            r7 = move-exception
            throw r7
        L16:
            if (r9 <= 0) goto L1a
            r0 = r4
            goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r0 == 0) goto L24
        L1d:
            r0 = r7[r8]
            int r0 = r0 << 24
            int r0 = r0 >>> 8
            goto L25
        L24:
            r0 = r3
        L25:
            r5 = 93
            if (r9 <= r4) goto L2b
            r6 = r5
            goto L2d
        L2b:
            r6 = 17
        L2d:
            if (r6 == r5) goto L31
            r1 = r3
            goto L40
        L31:
            int r1 = r1 + 23
            int r5 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2479 = r5
            int r1 = r1 % r2
            int r1 = r8 + 1
            r1 = r7[r1]
            int r1 = r1 << 24
            int r1 = r1 >>> 16
        L40:
            r0 = r0 | r1
            if (r9 <= r2) goto L45
            r1 = r3
            goto L46
        L45:
            r1 = r4
        L46:
            if (r1 == r4) goto L58
            int r1 = com.ironsource.adqualitysdk.sdk.i.ie.f2479
            int r1 = r1 + 51
            int r3 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2476 = r3
            int r1 = r1 % r2
            int r8 = r8 + r2
            r7 = r7[r8]
            int r7 = r7 << 24
            int r3 = r7 >>> 24
        L58:
            r7 = r0 | r3
            r8 = 61
            r0 = 3
            if (r9 == r4) goto La4
            if (r9 == r2) goto L86
            if (r9 == r0) goto L64
            return r10
        L64:
            int r8 = r7 >>> 18
            r8 = r12[r8]
            r10[r11] = r8
            int r8 = r11 + 1
            int r9 = r7 >>> 12
            r9 = r9 & 63
            r9 = r12[r9]
            r10[r8] = r9
            int r8 = r11 + 2
            int r9 = r7 >>> 6
            r9 = r9 & 63
            r9 = r12[r9]
            r10[r8] = r9
            int r11 = r11 + r0
            r7 = r7 & 63
            r7 = r12[r7]
            r10[r11] = r7
            return r10
        L86:
            int r9 = r7 >>> 18
            r9 = r12[r9]
            r10[r11] = r9
            int r9 = r11 + 1
            int r1 = r7 >>> 12
            r1 = r1 & 63
            r1 = r12[r1]
            r10[r9] = r1
            int r9 = r11 + 2
            int r7 = r7 >>> 6
            r7 = r7 & 63
            r7 = r12[r7]
            r10[r9] = r7
            int r11 = r11 + r0
            r10[r11] = r8
            return r10
        La4:
            int r9 = r7 >>> 18
            r9 = r12[r9]
            r10[r11] = r9
            int r9 = r11 + 1
            int r7 = r7 >>> 12
            r7 = r7 & 63
            r7 = r12[r7]
            r10[r9] = r7
            int r7 = r11 + 2
            r10[r7] = r8
            int r11 = r11 + r0
            r10[r11] = r8
            int r7 = com.ironsource.adqualitysdk.sdk.i.ie.f2479
            int r7 = r7 + 107
            int r8 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.ie.f2476 = r8
            int r7 = r7 % r2
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m6539(byte[], int, int, byte[], int, byte[]):byte[]");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] m6540(byte[] bArr, int i10) throws ic {
        int i11 = f2476 + 21;
        f2479 = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArrM6538 = m6538(bArr, 0, i10, f2480);
        int i13 = f2476 + 101;
        f2479 = i13 % 128;
        int i14 = i13 % 2;
        return bArrM6538;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6541() {
        f2477 = new char[]{16, 'J', 'l', 'l', 'l', 'f', 'j', 'G', 'B', 'l', 'v', 'm', 'A', 'J', 'j', '@', '#', '2', '2', '#', 'B', 'l', 'v', 'm', 'A', 'C', 'j', 'k', 'f', 'd', 'b', 'h', 'H', 'B', 'f', 'j', 'f', 'k', 'r', 'k', '2', 'B', '#', '2', '2', '#', 'C', 'c', 'f', 'o', 'l', 'h', 'r', 'L', 'I', 'n', 'h', 'j', 'g', 'f', 'o', 'I', 'B', 'i', 'i', 'B', 'G', 'j', 'C', 'B', 'i', 'h', 'i', 'i', 'd', 'd', 'B', 'K', 'k', 'f', 'p', 'm', 'B', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J', 'H', 'h', 'b', 'd', 'f', 'k', 'j', 'C', 'A', 'm', 'v', 144, 288, 288, 254, 263, 295, 290, 300, 297, 254, 256, 288, 294, 261, 256, 295, 302, 295, 290, 294, 290, 254, 262, 303, 293, 289, 294, 294, 295, 294, 255, 253, 297, 306, 296, 289, 293, 292, 293, 'N', 146, 172, 211, 215, 218, 220, 178, 169, 205, 204, 209, 209, 202, 211, 212, 211, 177, 168, 210, 178, 153, 185, 202, 170, 153, 185, 210, 212, 181, 26, 'A', 20, 'J', 'f', 'g', 'k', 'f', 'd', 'd', 'F', '9', 'n', 'k', 'j', 'i', 'h', 'B', 'J', 's', 'i', 'e', 'j', 'j', 'k', 'j', 'C', 'A', 'e', 'd', 'i', 'i', 'b', 'k', 'l', 'k', 'I', '@', 'j', 'J', 'G', 'j', 'f', 'l', 'l', 'l', 'J'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int m6542(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        int i11 = f2479 + 31;
        int i12 = i11 % 128;
        f2476 = i12;
        int i13 = i11 % 2;
        byte b10 = bArr[2];
        if (b10 == 61) {
            bArr2[i10] = (byte) ((((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6)) >>> 16);
            return 1;
        }
        byte b11 = bArr[3];
        if (!(b11 == 61)) {
            int i14 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18) | ((bArr3[b11] << 24) >>> 24);
            bArr2[i10] = (byte) (i14 >> 16);
            bArr2[i10 + 1] = (byte) (i14 >> 8);
            bArr2[i10 + 2] = (byte) i14;
            return 3;
        }
        int i15 = ((bArr3[bArr[1]] << 24) >>> 12) | ((bArr3[bArr[0]] << 24) >>> 6) | ((bArr3[b10] << 24) >>> 18);
        bArr2[i10] = (byte) (i15 >>> 16);
        bArr2[i10 + 1] = (byte) (i15 >>> 8);
        int i16 = i12 + 63;
        f2479 = i16 % 128;
        if (i16 % 2 == 0) {
            return 2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static byte[] m6543(byte[] r15, int r16, int r17, byte[] r18) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ie.m6543(byte[], int, int, byte[]):byte[]");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m6544(byte[] bArr) {
        int i10 = f2479 + 119;
        f2476 = i10 % 128;
        if (i10 % 2 == 0) {
            m6545(bArr, bArr.length, f2481);
            throw null;
        }
        String strM6545 = m6545(bArr, bArr.length, f2481);
        int i11 = f2479 + 117;
        f2476 = i11 % 128;
        int i12 = i11 % 2;
        return strM6545;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6545(byte[] bArr, int i10, byte[] bArr2) {
        byte[] bArrM6543 = m6543(bArr, 0, i10, bArr2);
        String str = new String(bArrM6543, 0, bArrM6543.length);
        int i11 = f2479 + 81;
        f2476 = i11 % 128;
        int i12 = i11 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6546(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2470) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f2477, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2469 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2469;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2469 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2469 = 0;
                while (true) {
                    int i16 = i.f2469;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2469 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2469 = 0;
                while (true) {
                    int i17 = i.f2469;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2469 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m6547(String str) throws ic {
        byte[] bArrM6540;
        int i10 = f2476 + 91;
        f2479 = i10 % 128;
        if ((i10 % 2 != 0 ? 'O' : 'T') != 'T') {
            byte[] bytes = str.getBytes();
            bArrM6540 = m6540(bytes, bytes.length);
            int i11 = 47 / 0;
        } else {
            byte[] bytes2 = str.getBytes();
            bArrM6540 = m6540(bytes2, bytes2.length);
        }
        int i12 = f2479 + 17;
        f2476 = i12 % 128;
        if (i12 % 2 != 0) {
            return bArrM6540;
        }
        int i13 = 54 / 0;
        return bArrM6540;
    }
}
