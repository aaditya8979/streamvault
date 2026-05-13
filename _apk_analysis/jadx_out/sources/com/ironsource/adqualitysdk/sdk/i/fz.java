package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes8.dex */
public final class fz extends gl {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2144 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2145 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2146 = 103;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2147 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2148;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2149 = {202, 214, 212, 149, 208, 217, 213, 218, 220, 204, 200, 203, 216, 211, 219, 224, 210, 176, 186, 168, 184, 207};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6283(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2149;
            int i11 = f2146;
            if (f2147) {
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
            if (f2145) {
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
        bh bhVar = new bh(mo6277());
        int i10 = f2144 + 99;
        f2148 = i10 % 128;
        int i11 = i10 % 2;
        return bhVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2148 + 93;
        f2144 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6283(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u0090\u008f\u0085\u008e\u008b\u0089\u0095\u008c\u0094\u008a\u0081\u0086\u0089\u0082\u0093\u0087\u0082\u0086\u0092\u0084\u0091\u008c\u0088\u0084\u0091\u008c\u0088\u0090\u008f\u0085\u008e\u008b\u0089\u008d\u008c\u008b\u0084\u008a\u0081\u0086\u0089\u0082\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i12 = f2144 + 7;
        f2148 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2148 + 79;
        int i11 = i10 % 128;
        f2144 = i11;
        if ((i10 % 2 == 0 ? '#' : (char) 30) == '#') {
            throw null;
        }
        int i12 = i11 + 101;
        f2148 = i12 % 128;
        int i13 = i12 % 2;
        return IronSourceAdQuality.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2148 + 15;
        f2144 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6283(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0088\u008e\u0085\u008f\u0089\u008c\u008a\u0086\u008b\u0096\u0088\u008d\u008c\u008b").intern();
        int i12 = f2144 + 75;
        f2148 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return strIntern;
        }
        throw null;
    }
}
