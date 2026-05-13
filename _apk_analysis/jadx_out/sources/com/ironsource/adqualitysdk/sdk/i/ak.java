package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class ak {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f317 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f318 = 5;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f319 = {'g', 'e', 't', 'I', 'n', 's', 'a', 'c', 'r', 'i', 'R', 'v', 'u', 'd', 'o', 'x', '.', 'l', 'b', 'm', 'L', 'B', 'M', 'h', 'j'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f320 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Class m4503() {
        int i10 = f317 + 91;
        f320 = i10 % 128;
        int i11 = i10 % 2;
        Class clsM6924 = kb.m6924(m4504("\t\u0001\u0012\r\u0013\u000e\n\u0012\u0011\u0012\f\t\u0007\u0010\u0017\r\u000b\t\f\b\u0007\u0006\u0004\u0011\t\u0001\u0005\u0001\u0003\u0006\u0011\u0006\u0013\t\u0003\u0002\u0000\u0003\u000f\u0015\f\t\u0007\u0010\u0017\u0006\u000b\t\f\b\u0007\u0006\u0007\u0002\t\u0001\u0005\u0001\u0003\u0006", TextUtils.indexOf("", "", 0, 0) + 60, (byte) (Color.rgb(0, 0, 0) + 16777286)).intern(), false);
        int i12 = f320 + 93;
        f317 = i12 % 128;
        if ((i12 % 2 != 0 ? '3' : 'A') == 'A') {
            return clsM6924;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m4504(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f319;
            char c10 = f318;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m4505(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10 = f320 + 59;
        f317 = i10 % 128;
        int i11 = i10 % 2;
        try {
            kb.m6919(obj, m4504("\u0006\u0003\u0004\u0005\u0007\u0000\u0003\u0006\u000b\u0000\u0006\u0002\u0006\u000e\u0003\u0006", 16 - TextUtils.getOffsetAfter("", 0), (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1)).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            int i12 = f320 + 95;
            f317 = i12 % 128;
            int i13 = i12 % 2;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m4506(Context context) {
        int i10 = f317 + 117;
        f320 = i10 % 128;
        int i11 = i10 % 2;
        try {
            return kb.m6919(m4503(), m4504("\u0001\u0002\u0003\u0004\u0000\t\u0001\u0007\u0002\tÃ", 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (94 - Gravity.getAbsoluteGravity(0, 0))).intern(), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            int i12 = f317 + 117;
            f320 = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m4507(Object obj, BroadcastReceiver broadcastReceiver) {
        int i10 = f320 + 13;
        f317 = i10 % 128;
        int i11 = i10 % 2;
        try {
            kb.m6919(obj, m4504("\u000e\u0002\u0006\u0003\u0004\u0005\u0007\u0000\u0003\u0006\u000b\u0000\u0006\u0002\u0006\u000e\u0003\u0006", (ViewConfiguration.getScrollBarSize() >> 8) + 18, (byte) (124 - View.MeasureSpec.getSize(0))).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i12 = f320 + 77;
            f317 = i12 % 128;
            if ((i12 % 2 != 0 ? (char) 27 : (char) 4) != 27) {
            } else {
                throw null;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
