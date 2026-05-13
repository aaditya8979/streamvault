package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.view.ViewConfiguration;
import com.amazon.device.ads.DTBAdRequest;

/* JADX INFO: loaded from: classes8.dex */
public final class fy extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2140 = 5;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2141 = {'c', 'o', 'm', '.', 'a', 'z', 'n', 'd', 'e', 'v', 'i', 's', 'D', 'T', 'B', 'A', 'R', 'q', 'u', 't', 'p', 'f', 'g', 'h', 'j'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2142 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2143 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m6282(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f2141;
            char c10 = f2140;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        bm bmVar = new bm(mo6277());
        int i10 = f2142 + 105;
        f2143 = i10 % 128;
        if (i10 % 2 != 0) {
            return bmVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int iAlpha;
        byte mirror;
        int i10 = f2142 + 17;
        f2143 = i10 % 128;
        if ((i10 % 2 == 0 ? '2' : '5') != '5') {
            iAlpha = 105 - Color.alpha(0);
            mirror = (byte) (5 / AndroidCharacter.getMirror('c'));
        } else {
            iAlpha = Color.alpha(0) + 34;
            mirror = (byte) (AndroidCharacter.getMirror('0') + 5);
        }
        return m6282("\u0001\u0002\u0003\u0004\u0000\u0003\u0000\t\u0006\u000b\u0002\b\t\u0005\u000f\u0005\r\b\u0002\t\r\u0001\r\u000e\n\u0013\u0006\u0011\u0007\u0012\u0017\r\u000e\u0010", iAlpha, mirror).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2143;
        int i11 = i10 + 55;
        f2142 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 7;
        f2142 = i13 % 128;
        int i14 = i13 % 2;
        return DTBAdRequest.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2142 + 89;
        f2143 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6282("\u0000\u0003\u0000\t\u0006\u000b\u0000\u0018¤", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49)).intern();
        int i12 = f2142 + 37;
        f2143 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
