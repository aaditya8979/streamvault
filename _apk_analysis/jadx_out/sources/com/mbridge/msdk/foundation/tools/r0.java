package com.mbridge.msdk.foundation.tools;

import com.ironsource.G5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: SameMVEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f38160a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f38161b = new byte[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f38162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static char[] f38163d;

    static {
        HashMap map = new HashMap();
        f38162c = map;
        map.put('A', 'v');
        f38162c.put('B', 'S');
        f38162c.put('C', 'o');
        f38162c.put('D', 'a');
        f38162c.put('E', 'j');
        f38162c.put('F', 'c');
        f38162c.put('G', '7');
        f38162c.put('H', 'd');
        f38162c.put('I', 'R');
        f38162c.put('J', 'z');
        f38162c.put('K', 'p');
        f38162c.put('L', 'W');
        f38162c.put('M', 'i');
        f38162c.put('N', 'f');
        f38162c.put('O', 'G');
        f38162c.put('P', 'y');
        f38162c.put('Q', 'N');
        f38162c.put('R', 'x');
        f38162c.put('S', 'Z');
        f38162c.put('T', 'n');
        f38162c.put('U', 'V');
        f38162c.put('V', '5');
        f38162c.put('W', 'k');
        f38162c.put('X', '+');
        f38162c.put('Y', 'D');
        f38162c.put('Z', 'H');
        f38162c.put('a', 'L');
        f38162c.put('b', 'Y');
        f38162c.put('c', 'h');
        f38162c.put('d', 'J');
        f38162c.put('e', '4');
        f38162c.put('f', '6');
        f38162c.put('g', 'l');
        f38162c.put('h', 't');
        f38162c.put('i', '0');
        f38162c.put('j', 'U');
        f38162c.put('k', '3');
        f38162c.put('l', 'Q');
        f38162c.put('m', 'r');
        f38162c.put('n', 'g');
        f38162c.put('o', 'E');
        f38162c.put('p', 'u');
        f38162c.put('q', 'q');
        f38162c.put('r', '8');
        f38162c.put('s', 's');
        f38162c.put('t', 'w');
        f38162c.put('u', '/');
        f38162c.put('v', 'X');
        f38162c.put('w', 'M');
        f38162c.put('x', 'e');
        f38162c.put('y', 'B');
        f38162c.put('z', 'A');
        f38162c.put('0', 'T');
        f38162c.put('1', '2');
        f38162c.put('2', 'F');
        f38162c.put('3', 'b');
        f38162c.put('4', '9');
        f38162c.put('5', 'P');
        f38162c.put('6', '1');
        f38162c.put('7', 'O');
        f38162c.put('8', 'I');
        f38162c.put('9', 'K');
        f38162c.put('+', 'm');
        f38162c.put('/', 'C');
        f38163d = new char[64];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char[] cArr = f38160a;
            if (i11 >= cArr.length) {
                break;
            }
            f38163d[i11] = f38162c.get(Character.valueOf(cArr[i11])).charValue();
            i11++;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr = f38161b;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 127;
            i12++;
        }
        while (true) {
            char[] cArr2 = f38163d;
            if (i10 >= cArr2.length) {
                return;
            }
            f38161b[cArr2[i10]] = (byte) i10;
            i10++;
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i10) {
        try {
            char c10 = cArr[3];
            char c11 = c10 == '=' ? (char) 2 : (char) 3;
            char c12 = cArr[2];
            if (c12 == '=') {
                c11 = 1;
            }
            byte[] bArr2 = f38161b;
            byte b10 = bArr2[cArr[0]];
            byte b11 = bArr2[cArr[1]];
            byte b12 = bArr2[c12];
            byte b13 = bArr2[c10];
            if (c11 == 1) {
                bArr[i10] = (byte) (((b11 >> 4) & 3) | ((b10 << 2) & 252));
                return 1;
            }
            if (c11 == 2) {
                bArr[i10] = (byte) ((3 & (b11 >> 4)) | ((b10 << 2) & 252));
                bArr[i10 + 1] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
                return 2;
            }
            if (c11 != 3) {
                throw new RuntimeException("Internal Error");
            }
            int i11 = i10 + 1;
            bArr[i10] = (byte) (((b10 << 2) & 252) | ((b11 >> 4) & 3));
            bArr[i11] = (byte) (((b11 << 4) & 240) | ((b12 >> 2) & 15));
            bArr[i11 + 1] = (byte) (((b12 << 6) & 192) | (b13 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i10, int i11) {
        if (i11 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i11 / 3) << 2) + 4];
            int i12 = 0;
            while (i11 >= 3) {
                int i13 = ((bArr[i10] & 255) << 16) + ((bArr[i10 + 1] & 255) << 8) + (bArr[i10 + 2] & 255);
                int i14 = i12 + 1;
                char[] cArr2 = f38163d;
                cArr[i12] = cArr2[i13 >> 18];
                int i15 = i14 + 1;
                cArr[i14] = cArr2[(i13 >> 12) & 63];
                int i16 = i15 + 1;
                cArr[i15] = cArr2[(i13 >> 6) & 63];
                i12 = i16 + 1;
                cArr[i16] = cArr2[i13 & 63];
                i10 += 3;
                i11 -= 3;
            }
            if (i11 == 1) {
                int i17 = bArr[i10] & 255;
                int i18 = i12 + 1;
                char[] cArr3 = f38163d;
                cArr[i12] = cArr3[i17 >> 2];
                int i19 = i18 + 1;
                cArr[i18] = cArr3[(i17 << 4) & 63];
                int i20 = i19 + 1;
                cArr[i19] = G5.T;
                i12 = i20 + 1;
                cArr[i20] = G5.T;
            } else if (i11 == 2) {
                int i21 = ((bArr[i10] & 255) << 8) + (bArr[i10 + 1] & 255);
                int i22 = i12 + 1;
                char[] cArr4 = f38163d;
                cArr[i12] = cArr4[i21 >> 10];
                int i23 = i22 + 1;
                cArr[i22] = cArr4[(i21 >> 4) & 63];
                int i24 = i23 + 1;
                cArr[i23] = cArr4[(i21 << 2) & 63];
                i12 = i24 + 1;
                cArr[i24] = G5.T;
            }
            return new String(cArr, 0, i12);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(java.lang.String r13) {
        /*
            int r0 = r13.length()     // Catch: java.lang.Exception -> L5b
            r1 = 259(0x103, float:3.63E-43)
            if (r0 >= r1) goto L9
            r1 = r0
        L9:
            char[] r1 = new char[r1]     // Catch: java.lang.Exception -> L5b
            int r2 = r0 >> 2
            int r2 = r2 * 3
            int r2 = r2 + 3
            byte[] r3 = new byte[r2]     // Catch: java.lang.Exception -> L5b
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
        L17:
            if (r5 >= r0) goto L52
            int r8 = r5 + 256
            if (r8 > r0) goto L23
            r13.getChars(r5, r8, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r7 + 256
            goto L29
        L23:
            r13.getChars(r5, r0, r1, r7)     // Catch: java.lang.Exception -> L5b
            int r5 = r0 - r5
            int r5 = r5 + r7
        L29:
            r9 = r7
        L2a:
            if (r7 >= r5) goto L4f
            char r10 = r1[r7]     // Catch: java.lang.Exception -> L5b
            r11 = 61
            if (r10 == r11) goto L3d
            byte[] r11 = com.mbridge.msdk.foundation.tools.r0.f38161b     // Catch: java.lang.Exception -> L5b
            int r12 = r11.length     // Catch: java.lang.Exception -> L5b
            if (r10 >= r12) goto L4c
            r11 = r11[r10]     // Catch: java.lang.Exception -> L5b
            r12 = 127(0x7f, float:1.78E-43)
            if (r11 == r12) goto L4c
        L3d:
            int r11 = r9 + 1
            r1[r9] = r10     // Catch: java.lang.Exception -> L5b
            r9 = 4
            if (r11 != r9) goto L4b
            int r9 = a(r1, r3, r6)     // Catch: java.lang.Exception -> L5b
            int r6 = r6 + r9
            r9 = r4
            goto L4c
        L4b:
            r9 = r11
        L4c:
            int r7 = r7 + 1
            goto L2a
        L4f:
            r5 = r8
            r7 = r9
            goto L17
        L52:
            if (r6 != r2) goto L55
            return r3
        L55:
            byte[] r13 = new byte[r6]     // Catch: java.lang.Exception -> L5b
            java.lang.System.arraycopy(r3, r4, r13, r4, r6)     // Catch: java.lang.Exception -> L5b
            return r13
        L5b:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.r0.a(java.lang.String):byte[]");
    }

    public static String b(String str) {
        byte[] bArrA = a(str);
        if (bArrA == null || bArrA.length <= 0) {
            return null;
        }
        return new String(bArrA);
    }

    public static String c(String str) {
        return a(str.getBytes());
    }
}
