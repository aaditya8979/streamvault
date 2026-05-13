package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class er extends el {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2012 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2013 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2014 = {1166932487, -1624570980, 2028167702, -1820015429, -1802417976, -336997493, 1970603045, 777258662, -700893105, -359482004, 1859768531, 287352306, 50227391, -431504020, -2143571499, -201287529, 559890538, 157760912};

    public er(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6248(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2014.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6231() {
        int i10 = f2012 + 73;
        f2013 = i10 % 128;
        String strIntern = (!(i10 % 2 == 0) ? m6248(new int[]{-1000377692, -802653641}, TextUtils.lastIndexOf("", '0', 0) + 3) : m6248(new int[]{-1000377692, -802653641}, 4 % TextUtils.lastIndexOf("", (char) 23, 1))).intern();
        int i11 = f2012 + 77;
        f2013 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo6240(int i10) {
        int i11 = f2012;
        int i12 = i11 + 41;
        f2013 = i12 % 128;
        int i13 = i12 % 2;
        if (!(i10 == 0)) {
            return false;
        }
        int i14 = i11 + 77;
        f2013 = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo6241(Object obj, Object obj2) {
        int i10 = f2013;
        int i11 = i10 + 111;
        f2012 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            throw null;
        }
        if (obj == obj2) {
            return true;
        }
        int i12 = i10 + 43;
        f2012 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾒ */
    public final boolean mo6242(String str, String str2) {
        int i10 = f2012 + 23;
        f2013 = i10 % 128;
        int i11 = i10 % 2;
        boolean zEquals = str.equals(str2);
        int i12 = f2012 + 23;
        f2013 = i12 % 128;
        int i13 = i12 % 2;
        return zEquals;
    }
}
