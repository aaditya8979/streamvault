package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class dp {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1830 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f1831 = -3367701063337788816L;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1832 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1833;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1834;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1835;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1836;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1837;

    public dp(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f1837 = jSONObject.optString(m6106("ϱ屼ꑬ៖Ά\ue67e탭㣶\uea41\uf829諭", ViewConfiguration.getMaximumDrawingCacheSize() >> 24).intern());
            this.f1834 = jSONObject.optString(m6106("㋬읺Κᓝ㊏絥眗㯠\udb43挤", ExpandableListView.getPackedPositionGroup(0L)).intern());
            this.f1836 = jSONObject.optString(m6106("擣넖瞊놡撆ଞ̞麃赂", ExpandableListView.getPackedPositionType(0L)).intern());
            this.f1835 = jSONObject.optString(m6106("砤៷䎙셧硓귢㜛\uee41醍뎢ᵎ", 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            this.f1833 = jSONObject.optBoolean(m6106("翝臭攛帽羨㯮ᆞ焨陥▩㯉䝌갗౮", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6106(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f1831, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f1831));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final String m6107() {
        int i10 = f1830 + 51;
        int i11 = i10 % 128;
        f1832 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1836;
        int i12 = i11 + 53;
        f1830 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m6108() {
        int i10 = f1830 + 47;
        f1832 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1834;
        }
        int i11 = 22 / 0;
        return this.f1834;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final boolean m6109() {
        boolean z10;
        int i10 = f1830 + 19;
        int i11 = i10 % 128;
        f1832 = i11;
        if ((i10 % 2 == 0 ? '4' : 'B') != 'B') {
            z10 = this.f1833;
            int i12 = 25 / 0;
        } else {
            z10 = this.f1833;
        }
        int i13 = i11 + 45;
        f1830 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return z10;
        }
        int i14 = 69 / 0;
        return z10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m6110() {
        int i10 = f1830;
        int i11 = i10 + 105;
        f1832 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1837;
        int i13 = i10 + 103;
        f1832 = i13 % 128;
        if (i13 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m6111() {
        int i10 = f1830 + 51;
        int i11 = i10 % 128;
        f1832 = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        String str = this.f1835;
        int i12 = i11 + 53;
        f1830 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return str;
    }
}
