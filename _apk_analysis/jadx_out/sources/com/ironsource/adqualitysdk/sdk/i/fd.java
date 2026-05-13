package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;

/* JADX INFO: loaded from: classes8.dex */
public final class fd extends eg {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2058 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2059 = 63693;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2060 = 41695;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2061 = 10911;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2062 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2063 = 62374;

    public fd(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6258(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2060)) ^ ((c11 >>> 5) + f2059)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2063) ^ ((c12 + i12) ^ ((c12 << 4) + f2061))));
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
        int i10 = f2062 + 5;
        f2058 = i10 % 128;
        String strIntern = ((i10 % 2 == 0 ? '#' : (char) 0) != '#' ? m6258("䅘颖", 1 - Color.blue(0)) : m6258("䅘颖", Color.blue(1) + 1)).intern();
        int i11 = f2062 + 41;
        f2058 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        dr drVarM6222 = m6232().m6222(duVar, cqVar);
        dr drVarM62222 = m6233().m6222(duVar, cqVar);
        if ((!(drVarM6222.m6165() instanceof String) ? '=' : '0') != '=' || (drVarM62222.m6165() instanceof String)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(drVarM6222.m6165());
            sb2.append(drVarM62222.m6165());
            return new dr(sb2.toString());
        }
        Number numberM6166 = drVarM6222.m6166();
        Number numberM61662 = drVarM62222.m6166();
        if (!(numberM6166 instanceof Double)) {
            int i10 = f2062 + 51;
            f2058 = i10 % 128;
            if ((i10 % 2 == 0 ? '+' : '3') == '+') {
                boolean z10 = numberM61662 instanceof Double;
                throw null;
            }
            if (!(numberM61662 instanceof Double)) {
                return (!(!(numberM6166 instanceof Long)) || (numberM61662 instanceof Long)) ? new dr(Long.valueOf(numberM6166.longValue() + numberM61662.longValue())) : new dr(Integer.valueOf(numberM6166.intValue() + numberM61662.intValue()));
            }
        }
        dr drVar = new dr(Double.valueOf(numberM6166.doubleValue() + numberM61662.doubleValue()));
        int i11 = f2058 + 45;
        f2062 = i11 % 128;
        int i12 = i11 % 2;
        return drVar;
    }
}
