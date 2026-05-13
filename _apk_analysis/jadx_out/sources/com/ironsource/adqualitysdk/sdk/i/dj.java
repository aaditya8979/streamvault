package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media.AudioAttributesCompat;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class dj extends cz implements cl {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1761 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1763 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1771;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String f1772;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1774;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1768 = {3780, 55073, 48418, 33580, 26889, 20239, 5396, 64381, 49527, 42858, 'b', 55703, 45954, 36236, 26557, 16828, 2020, 56858, 46081, 35330, 24624, 17971, 7204, 62044, 51287, 44545, 25051, 47163, 53808, 60423, 1557, 8194, 31237, 38003, 44652, 51307, 57936, 15476, 22085, 28834, 35499, 42157, 65210, 6293, 12970, 19595, 26365, 32995, 'g', 55699, 45976, 36259, 26556, 16796, 7073, 62924, 53205, 43464, 33769, 24055, 16835, 38967, 62012, 52239, 9743, ',', 23061, 46194, 36472, 59505, 49755, 7236, 30281, 20671, 43710, 33935, 56992, 33365, 23457, 12714, 3993, 58777, 50111, 39299, 30715, 19958, 11259, 451, 'g', 55699, 45976, 36256, 26538, 16801, 7077, 62942, 53203, 43463, 33775, 24038, 14285, 4360, 60177, 50436, 40724, 31000, 21293, 11567, 1885};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1766 = 1655881082737973750L;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static boolean f1762 = true;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static boolean f1764 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1767 = AudioAttributesCompat.FLAG_ALL_PUBLIC;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f1765 = {319, 388, 374, 389, 340, 384, 383, 372, 387, 351, 370, 382, 376, 350, 373, 378, 392, 380, 338, 355, 391, 390, 346, 343, 381, 353, 347};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1773 = "";

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private double f1770 = -1.0d;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean f1769 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private String m6027() {
        String strIntern;
        int i10 = f1763 + 33;
        f1761 = i10 % 128;
        if (i10 % 2 != 0) {
            m6028();
            throw null;
        }
        if (m6028()) {
            strIntern = m6033(View.resolveSize(0, 0), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 3746), 10 - TextUtils.indexOf("", "", 0, 0)).intern();
            int i11 = f1763 + 117;
            f1761 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            strIntern = m6033(Process.getGidForName("") + 11, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 7 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m6033((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1929), 10 - TextUtils.getCapsMode("", 0, 0)).intern());
        sb2.append(this.f1773);
        sb2.append(m6034(null, 127 - TextUtils.getOffsetBefore("", 0), null, "\u0081").intern());
        sb2.append(strIntern);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean m6028() {
        int i10 = f1761 + 53;
        f1763 = i10 % 128;
        if ((i10 % 2 == 0 ? '<' : 'c') == 'c') {
            return this.f1771;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m6029() {
        int i10 = f1761;
        int i11 = i10 + 71;
        f1763 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f1772;
        int i13 = i10 + 21;
        f1763 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String m6030() {
        int i10 = f1761 + 113;
        f1763 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.f1774;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m6031() {
        int i10 = f1763 + 121;
        f1761 = i10 % 128;
        if ((i10 % 2 != 0 ? '^' : 'M') != '^') {
            return this.f1773;
        }
        int i11 = 54 / 0;
        return this.f1773;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Double m6032() {
        int i10 = f1763 + 95;
        f1761 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 23 : (char) 17) != 23) {
            return Double.valueOf(this.f1770);
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6033(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1768[i10 + i12]) ^ (((long) i12) * f1766)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6034(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f1765;
            int i11 = f1767;
            if (f1764) {
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
            if (f1762) {
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

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m6035(boolean z10) {
        int i10 = f1761;
        int i11 = i10 + 43;
        f1763 = i11 % 128;
        int i12 = i11 % 2;
        this.f1771 = z10;
        int i13 = i10 + 93;
        f1763 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 1 : '$') != 1) {
            return;
        }
        int i14 = 89 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m6036() {
        int i10 = f1761;
        int i11 = i10 + 69;
        f1763 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f1769;
        int i13 = i10 + 25;
        f1763 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m6037(String str) {
        int i10 = f1761 + 61;
        int i11 = i10 % 128;
        f1763 = i11;
        int i12 = i10 % 2;
        this.f1773 = str;
        int i13 = i11 + 95;
        f1761 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0229  */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4888(java.lang.String r21, java.util.List<java.lang.Object> r22, com.ironsource.adqualitysdk.sdk.i.ch r23) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dj.mo4888(java.lang.String, java.util.List, com.ironsource.adqualitysdk.sdk.i.ch):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6038(String str) {
        int i10 = f1761 + 89;
        int i11 = i10 % 128;
        f1763 = i11;
        int i12 = i10 % 2;
        this.f1774 = str;
        int i13 = i11 + 111;
        f1761 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m6039(boolean z10) {
        int i10 = f1763 + 91;
        int i11 = i10 % 128;
        f1761 = i11;
        int i12 = i10 % 2;
        this.f1769 = z10;
        int i13 = i11 + 37;
        f1763 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6040(Double d10) {
        int i10 = f1763 + 61;
        f1761 = i10 % 128;
        int i11 = i10 % 2;
        this.f1770 = d10.doubleValue();
        int i12 = f1763 + 71;
        f1761 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6041(String str) {
        int i10 = f1761 + 43;
        int i11 = i10 % 128;
        f1763 = i11;
        int i12 = i10 % 2;
        this.f1772 = str;
        int i13 = i11 + 115;
        f1761 = i13 % 128;
        int i14 = i13 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject m6042() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit2.put(ih.f2564, this.f1774);
            double d10 = this.f1770;
            if (d10 > -1.0d) {
                int i10 = f1763 + 25;
                f1761 = i10 % 128;
                if ((i10 % 2 != 0 ? '<' : ',') != ',') {
                    jSONObjectJsonObjectInit2.put(ih.f2513, d10);
                    throw null;
                }
                jSONObjectJsonObjectInit2.put(ih.f2513, d10);
            }
            jSONObjectJsonObjectInit2.put(ih.f2516, this.f1772);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObjectJsonObjectInit2.length() > 0) {
                if (this.f1769) {
                    int i11 = f1763 + 37;
                    f1761 = i11 % 128;
                    int i12 = i11 % 2;
                    jSONObjectJsonObjectInit2.put(ih.f2512, true);
                    int i13 = f1761 + 89;
                    f1763 = i13 % 128;
                    int i14 = i13 % 2;
                }
                jSONObjectJsonObjectInit.put(ih.f2515, jSONObjectJsonObjectInit2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObjectJsonObjectInit;
    }
}
