package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes11.dex */
public final class hh extends hb<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2334 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2335 = {'O', 'n', 'T', 'o', 'u', 'c', 'h', 'L', 'i', 's', 't', 'e', 'r', 'D', 'a', 'E', ' ', 'm', 'b', 'P', 'Q', 'R', 'S', 'U', 'V'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2336 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2337 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private c f2338;

    public interface c {
        /* JADX INFO: renamed from: ｋ */
        boolean mo5909(hh hhVar, View view, MotionEvent motionEvent);
    }

    public hh(View.OnTouchListener onTouchListener, c cVar) {
        super(onTouchListener);
        this.f2338 = cVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6325(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f2335;
            char c10 = f2334;
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

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f2338.mo5909(this, view, motionEvent);
        } catch (Throwable th2) {
            kd.m6948(m6325("\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f\u0006\u0010\r\u000e\n\u0006\u0002\r\n\u000b\u0002\r", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23, (byte) (Color.rgb(0, 0, 0) + 16777314)).intern(), m6325("\u0011\n\r\u0002\u000b\u0011\u0006\u0003\u0011\u0012\u0003\u0011\b\t\u0005\u000e\u0010\u0006\f\r\u0012\u0001\u0002\u0003\u0004\u0000\u0006\u0007", View.combineMeasuredStates(0, 0) + 28, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 83)).intern(), th2, false);
        }
        if ((mo4818() != null ? (char) 4 : (char) 11) != 4) {
            int i10 = f2337 + 35;
            f2336 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        int i12 = f2337 + 103;
        f2336 = i12 % 128;
        int i13 = i12 % 2;
        return mo4818().onTouch(view, motionEvent);
    }
}
