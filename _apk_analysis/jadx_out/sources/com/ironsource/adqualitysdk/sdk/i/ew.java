package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class ew extends eo {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2027 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2028 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2029 = 8812308453087429859L;

    public ew(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6252(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2041) {
            f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2040 = 0;
            while (true) {
                int i11 = f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f2029);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6231() {
        int i10 = f2028 + 79;
        f2027 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6252("쓟⇡", View.MeasureSpec.makeMeasureSpec(0, 0) + 58687).intern();
        int i12 = f2028 + 27;
        f2027 = i12 % 128;
        if (i12 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo6240(int i10) {
        int i11 = f2028;
        int i12 = i11 + 53;
        f2027 = i12 % 128;
        int i13 = i12 % 2;
        if (i10 > 0) {
            return false;
        }
        int i14 = i11 + 63;
        f2027 = i14 % 128;
        int i15 = i14 % 2;
        return true;
    }
}
