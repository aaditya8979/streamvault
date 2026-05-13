package com.ironsource.adqualitysdk.sdk.i;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class fl extends fr {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2076 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2077;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2078 = {'_', 185, 182, 190, 189, 161};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6264(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f2078, i10, cArr, 0, i11);
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

    public final String toString() {
        int i10 = f2076 + 119;
        f2077 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6264(new int[]{0, 6, 83, 5}, "\u0000\u0000\u0000\u0001\u0000\u0001", true).intern();
        int i12 = f2076 + 103;
        f2077 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.fr
    /* JADX INFO: renamed from: ﾒ */
    public final dr mo6263(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        drVar.m6164();
        int i10 = f2076 + 15;
        f2077 = i10 % 128;
        int i11 = i10 % 2;
        return drVar;
    }
}
