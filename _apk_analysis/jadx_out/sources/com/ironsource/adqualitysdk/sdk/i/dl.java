package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class dl {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1791 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1792 = 96;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1793;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1794;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1795;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f1796;

    public dl(JSONObject jSONObject) {
        this.f1795 = jSONObject.optBoolean(m6082("\u0002\f\uffff\ufffb\ufffe\u0007\ufffb\u0003\b￮", (ViewConfiguration.getWindowTouchSlop() >> 8) + 10, false, ImageFormat.getBitsPerPixel(0) + 6, 199 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
        this.f1796 = jSONObject.optBoolean(m6082("\uffe7\ufffb\u0003\b\ufffb\u0000\u000e\uffff\f", 9 - Color.alpha(0), false, 4 - (ViewConfiguration.getTapTimeout() >> 16), 197 - TextUtils.lastIndexOf("", '0')).intern());
        this.f1794 = dz.m6209(jSONObject.optString(m6082("\u0003\ufffa\u0005\ufffe\n\ufffb", 7 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), true, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.red(0) + 202).intern()));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6082(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f1792);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m6083() {
        int i10 = f1793 + 41;
        int i11 = i10 % 128;
        f1791 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        boolean z10 = this.f1795;
        int i12 = i11 + 77;
        f1793 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m6084() {
        int i10 = f1793 + 93;
        f1791 = i10 % 128;
        if ((i10 % 2 == 0 ? '.' : 'X') != '.') {
            return this.f1796;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6085() {
        int i10 = f1791 + 87;
        f1793 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 18 : 'W') == 18) {
            return this.f1794;
        }
        throw null;
    }
}
