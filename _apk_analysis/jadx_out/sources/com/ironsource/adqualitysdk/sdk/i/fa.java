package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes8.dex */
public final class fa extends eg {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2042 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2043 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2044 = 16633;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2045 = 28030;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2046 = 16548;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2047 = 36552;

    public fa(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6255(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2047)) ^ ((c11 >>> 5) + f2046)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2045) ^ ((c12 + i12) ^ ((c12 << 4) + f2044))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6231() {
        int i10 = f2043 + 33;
        f2042 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6255("\ufae6㊧", (ViewConfiguration.getPressedStateDuration() >> 16) + 2).intern();
        int i12 = f2042 + 55;
        f2043 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        int i10 = f2042 + 93;
        f2043 = i10 % 128;
        int i11 = i10 % 2;
        dr drVarM6222 = m6232().m6222(duVar, cqVar);
        if ((drVarM6222.m6167() ? ',' : (char) 24) != ',') {
            return m6233().m6222(duVar, cqVar);
        }
        int i12 = f2043 + 73;
        f2042 = i12 % 128;
        int i13 = i12 % 2;
        return drVarM6222;
    }
}
