package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes8.dex */
public final class dv extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1898 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1899 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1902;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f1901 = {'.', 18393, 36632, 55119, 7835, 26321};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1900 = 8917081582990215098L;

    public dv(String str, dm dmVar) {
        super(dmVar);
        this.f1902 = dz.m6209(str);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6188(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1901[i10 + i12]) ^ (((long) i12) * f1900)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (!(this != obj)) {
            return true;
        }
        if (obj != null) {
            int i10 = f1898 + 13;
            f1899 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if ((dv.class != obj.getClass() ? '2' : 'R') != '2') {
                dv dvVar = (dv) obj;
                String str = this.f1902;
                if (str == null) {
                    return dvVar.f1902 == null;
                }
                int i11 = f1899 + 53;
                f1898 = i11 % 128;
                int i12 = i11 % 2;
                boolean zEquals = str.equals(dvVar.f1902);
                if (i12 == 0) {
                    return zEquals;
                }
                int i13 = 33 / 0;
                return zEquals;
            }
        }
        int i14 = f1899 + 111;
        f1898 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    public final int hashCode() {
        String str = this.f1902;
        if ((str != null ? 'J' : 'V') != 'J') {
            return 0;
        }
        int i10 = f1898 + 101;
        f1899 = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = str.hashCode();
        int i12 = f1898 + 77;
        f1899 = i12 % 128;
        if ((i12 % 2 == 0 ? ':' : '\"') == '\"') {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        int i10 = f1898 + 95;
        f1899 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1902;
        }
        int i11 = 34 / 0;
        return this.f1902;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final dr mo6189(du duVar, cq cqVar) {
        dr drVar = new dr(cqVar.m5769().m4890(kc.m6940(this.f1902, m6188((-1) - MotionEvent.axisFromString(""), (char) Color.blue(0), MotionEvent.axisFromString("") + 7).intern())));
        int i10 = f1899 + 17;
        f1898 = i10 % 128;
        int i11 = i10 % 2;
        return drVar;
    }
}
