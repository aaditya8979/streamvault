package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.smaato.sdk.core.SmaatoSdk;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes11.dex */
public final class gv extends gl {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2264 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2265 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2266 = {384, 396, 394, 331, 400, 382, 401, 385, 392, 399, 386, 368};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2267 = 285;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2268 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2269 = true;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6310(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f2266;
            int i11 = f2267;
            if (f2265) {
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
            if (f2269) {
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
        cb cbVar = new cb(mo6277());
        int i10 = f2264 + 89;
        f2268 = i10 % 128;
        int i11 = i10 % 2;
        return cbVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2264 + 1;
        f2268 = i10 % 128;
        return m6310(null, i10 % 2 == 0 ? 126 - MotionEvent.axisFromString("") : MotionEvent.axisFromString("") + 6, null, "\u0089\u0088\u008c\u0082\u0087\u0086\u0086\u0083\u008c\u0084\u008b\u008a\u0082\u0081\u0084\u0089\u0088\u0085\u0084\u0082\u0087\u0086\u0086\u0083\u0085\u0084\u0083\u0082\u0081").intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2268 + 123;
        int i11 = i10 % 128;
        f2264 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 59;
        f2268 = i13 % 128;
        if (i13 % 2 == 0) {
            return SmaatoSdk.class;
        }
        int i14 = 97 / 0;
        return SmaatoSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2268 + 45;
        f2264 = i10 % 128;
        return m6310(null, (i10 % 2 == 0 ? '.' : (char) 28) != '.' ? 127 - View.resolveSize(0, 0) : 123 >> View.resolveSize(0, 0), null, "\u0082\u0087\u0086\u0086\u0083\u0085").intern();
    }
}
