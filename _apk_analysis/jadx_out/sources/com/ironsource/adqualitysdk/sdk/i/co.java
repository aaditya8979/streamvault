package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public final class co {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1398 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f1399 = {351, 350, 344, 300, 315};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f1400 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1401 = 268;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f1402 = true;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1403;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m5699(String str, String str2, Throwable th2) {
        int i10 = f1398 + 73;
        f1403 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m5700(str, str2, th2);
        if (z10) {
            return;
        }
        int i11 = 65 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m5700(String str, String str2, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5701(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u0085\u0083\u0082\u0081").intern());
        sb2.append(str);
        kd.m6951(sb2.toString(), str2, Integer.toHexString(str2.hashCode()), th2, null, false);
        int i10 = f1398 + 79;
        f1403 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 11 : 'L') != 'L') {
            int i11 = 68 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5701(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f3010) {
            char[] cArr2 = f1399;
            int i11 = f1401;
            if (f1402) {
                int length = bArr.length;
                m.f3012 = length;
                char[] cArr3 = new char[length];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i12 = m.f3011;
                    int i13 = m.f3012 - 1;
                    int i14 = m.f3011;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f3011 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f1400) {
                int length2 = cArr.length;
                m.f3012 = length2;
                char[] cArr4 = new char[length2];
                m.f3011 = 0;
                while (m.f3011 < m.f3012) {
                    int i15 = m.f3011;
                    int i16 = m.f3012 - 1;
                    int i17 = m.f3011;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f3011 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f3012 = length3;
            char[] cArr5 = new char[length3];
            m.f3011 = 0;
            while (m.f3011 < m.f3012) {
                int i18 = m.f3011;
                int i19 = m.f3012 - 1;
                int i20 = m.f3011;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f3011 = i20 + 1;
            }
            return new String(cArr5);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m5702(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m5701(null, 127 - View.combineMeasuredStates(0, 0), null, "\u0084\u0083\u0082\u0081").intern());
        sb2.append(str);
        k.m6905(sb2.toString(), str2);
        int i10 = f1403 + 19;
        f1398 = i10 % 128;
        int i11 = i10 % 2;
    }
}
