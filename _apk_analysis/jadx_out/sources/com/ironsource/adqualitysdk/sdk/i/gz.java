package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.i.ce;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes10.dex */
public final class gz extends gl {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2292 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2293 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2294 = 1396974205;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2295 = null;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2296 = 122;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2297 = -184600376;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2298 = {-88, -22, -10, -34, -25, -12, -19, 6, -66, -11, -17, -33, 1, 19, -97, -22, -10, -34, -25, -12, -19, -26, 53, -82, 41, -98, -11, -17, -33, ExifInterface.MARKER_APP1, 51, -71, -38, -20, -114, -50, -46, -87, -44, -54, -102, -104};

    public static class d extends gl {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2299 = 1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f2300 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2301 = 295;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f2302 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean f2303 = true;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char[] f2304 = {394, 406, 404, 341, 412, 405, 400, 411, 416, 346, 395, 410, 396, 409, 413, 392, 360, 380};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static boolean m6317() {
            boolean zM4878 = bc.m4878(new gz());
            int i10 = f2300 + 95;
            f2299 = i10 % 128;
            if ((i10 % 2 == 0 ? '\"' : '\f') != '\"') {
                return zM4878;
            }
            int i11 = 26 / 0;
            return zM4878;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m6318(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f2304;
                int i11 = f2301;
                if (f2302) {
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
                if (f2303) {
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

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﻐ */
        public final bd mo6274() {
            ce.d dVar = new ce.d(mo6277());
            int i10 = f2300 + 95;
            f2299 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                return dVar;
            }
            int i11 = 76 / 0;
            return dVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ｋ */
        public final String mo6275() {
            int i10 = f2300 + 83;
            f2299 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                m6317();
                throw null;
            }
            if ((m6317() ? (char) 5 : '!') == '!') {
                return m6318(null, 127 - View.MeasureSpec.getMode(0), null, "\u0089\u0088\u0087\u008f\u0087\u0088\u0081\u0091\u0088\u0087\u0086\u0092\u008b\u0091\u0084\u0088\u0087\u0086\u0085\u008b\u0090\u0084\u008c\u008b\u0090\u0084\u008c\u008d\u0081\u0087\u008f\u008e\u008d\u008c\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            }
            int i11 = f2300 + 23;
            f2299 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 11 : '.') == 11) {
                int i12 = 91 / 0;
            }
            return null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾇ */
        public final Class mo6276() {
            int i10 = f2300 + 83;
            f2299 = i10 % 128;
            int i11 = i10 % 2;
            if (!m6317()) {
                return AdUnitActivity.class;
            }
            int i12 = f2299 + 77;
            f2300 = i12 % 128;
            if (i12 % 2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.gl
        /* JADX INFO: renamed from: ﾒ */
        public final String mo6277() {
            int i10 = f2300 + 25;
            f2299 = i10 % 128;
            String strIntern = (i10 % 2 == 0 ? m6318(null, 24 / (ViewConfiguration.getMaximumDrawingCacheSize() >>> 77), null, "\u008c\u008b\u0090\u0089\u0088\u0087\u0086\u0085") : m6318(null, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 127, null, "\u008c\u008b\u0090\u0089\u0088\u0087\u0086\u0085")).intern();
            int i11 = f2300 + 21;
            f2299 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return strIntern;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6316(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f2296;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f2298;
                i14 = bArr != null ? (byte) (bArr[f2294 + i10] + i13) : (short) (f2295[f2294 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f2294 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f2297);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f2298;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f2295;
                        int i16 = o.f3016;
                        o.f3016 = i16 - 1;
                        o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                    }
                    sb2.append(o.f3019);
                    o.f3018 = o.f3019;
                    o.f3020++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        ce ceVar = new ce(mo6277());
        int i10 = f2292 + 55;
        f2293 = i10 % 128;
        if (i10 % 2 == 0) {
            return ceVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2293 + 17;
        f2292 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6316((-1396974204) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 105), (ViewConfiguration.getFadingEdgeLength() >> 16) + 184600475, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 114), KeyEvent.getDeadChar(0, 0) - 123).intern();
        int i12 = f2292 + 5;
        f2293 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2293;
        int i11 = i10 + 63;
        f2292 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 111;
        f2292 = i13 % 128;
        int i14 = i13 % 2;
        return UnityServices.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2293 + 103;
        f2292 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6316(TextUtils.getTrimmedLength("") - 1396974171, (short) ((Process.myTid() >> 22) - 56), 184600493 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) (TextUtils.lastIndexOf("", '0', 0) - 102), (ViewConfiguration.getEdgeSlop() >> 16) - 123).intern();
        int i12 = f2293 + 17;
        f2292 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
