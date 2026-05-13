package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes8.dex */
public final class dm {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1797 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f1798 = {2079880854, -917310781, -1740524842, -1533885123, -66225104, -1155740387, -1509317618, 489272800, -425835252, -547440015, 847524947, -191329785, -1539798976, -564369660, -2055889111, 1785479563, 198575438, -433954121};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1799;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1800;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private int f1801;

    private dm(String str, int i10) {
        this.f1800 = str;
        this.f1801 = i10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static dm m6086(String str, int i10) {
        int i11 = f1799 + 99;
        f1797 = i11 % 128;
        int i12 = i11 % 2;
        if (s.m7027().m7055()) {
            return new dm(str, i10);
        }
        int i13 = f1799 + 43;
        f1797 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6087(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f1798.clone();
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

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1800);
        sb2.append(m6087(new int[]{-555983378, 170641764}, -((byte) KeyEvent.getModifierMetaStateMask())).intern());
        sb2.append(this.f1801);
        String string = sb2.toString();
        int i10 = f1799 + 33;
        f1797 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 7 : ')') != 7) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int m6088() {
        int i10 = f1799 + 113;
        f1797 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 17 : '?') != 17) {
            return this.f1801;
        }
        throw null;
    }
}
