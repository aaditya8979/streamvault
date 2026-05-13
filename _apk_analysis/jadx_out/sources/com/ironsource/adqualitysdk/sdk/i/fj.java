package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class fj extends ed {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f2065 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2066 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2067 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2068;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static fj f2069;

    static {
        m6259();
        f2069 = new fj();
        int i10 = f2068 + 111;
        f2067 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 22 : '\\') == '\\') {
        } else {
            throw null;
        }
    }

    public fj() {
        super(dm.m6086("", -1));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m6259() {
        f2066 = (char) 2;
        f2065 = new char[]{'n', 'u', 'l', 'o'};
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static synchronized fj m6260() {
        fj fjVar;
        int i10 = f2068 + 81;
        int i11 = i10 % 128;
        f2067 = i11;
        int i12 = i10 % 2;
        fjVar = f2069;
        int i13 = i11 + 99;
        f2068 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 0 : '%') == 0) {
            throw null;
        }
        return fjVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6261(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f2065;
            char c10 = f2066;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2156 = 0;
                while (true) {
                    int i11 = g.f2156;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2155 = cArr[i11];
                    g.f2153 = cArr[g.f2156 + 1];
                    if (g.f2155 == g.f2153) {
                        cArr3[g.f2156] = (char) (g.f2155 - b10);
                        cArr3[g.f2156 + 1] = (char) (g.f2153 - b10);
                    } else {
                        g.f2154 = g.f2155 / c10;
                        g.f2152 = g.f2155 % c10;
                        g.f2157 = g.f2153 / c10;
                        g.f2150 = g.f2153 % c10;
                        if (g.f2152 == g.f2150) {
                            g.f2154 = ((g.f2154 + c10) - 1) % c10;
                            g.f2157 = ((g.f2157 + c10) - 1) % c10;
                            int i12 = (g.f2154 * c10) + g.f2152;
                            int i13 = (g.f2157 * c10) + g.f2150;
                            int i14 = g.f2156;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2154 == g.f2157) {
                            g.f2152 = ((g.f2152 + c10) - 1) % c10;
                            g.f2150 = ((g.f2150 + c10) - 1) % c10;
                            int i15 = (g.f2154 * c10) + g.f2152;
                            int i16 = (g.f2157 * c10) + g.f2150;
                            int i17 = g.f2156;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2154 * c10) + g.f2150;
                            int i19 = (g.f2157 * c10) + g.f2152;
                            int i20 = g.f2156;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2156 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    public final String toString() {
        int mode;
        int iMyPid;
        int i10 = f2067 + 103;
        f2068 = i10 % 128;
        if ((i10 % 2 != 0 ? '=' : 'b') != '=') {
            mode = View.MeasureSpec.getMode(0) + 4;
            iMyPid = 91 - (Process.myPid() >> 22);
        } else {
            mode = 2 >>> View.MeasureSpec.getMode(0);
            iMyPid = 53 / (Process.myPid() * 121);
        }
        String strIntern = m6261("\u0001\u0000ÇÇ", mode, (byte) iMyPid).intern();
        int i11 = f2067 + 13;
        f2068 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        dr drVar = new dr(null);
        int i10 = f2068 + 71;
        f2067 = i10 % 128;
        if (i10 % 2 != 0) {
            return drVar;
        }
        throw null;
    }
}
