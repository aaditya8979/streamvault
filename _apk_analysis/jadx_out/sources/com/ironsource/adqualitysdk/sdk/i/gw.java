package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.KeyEvent;
import com.tapjoy.Tapjoy;

/* JADX INFO: loaded from: classes11.dex */
public final class gw extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2270 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int[] f2271 = {237023377, -1261193102, 26886300, 2129666797, 883480481, -525317270, 568497132, 222011240, -130844568, -656906617, 494124251, 1225618912, 2029924080, -536174602, -1420327351, 1582464255, -2024329893, -77447959};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2272 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6311(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2271.clone();
            e.f1935 = 0;
            while (true) {
                int i11 = e.f1935;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1937 = (c10 << 16) + c11;
                    e.f1936 = (c12 << 16) + c13;
                    e.m6211(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1937 ^ iArr2[i13];
                        e.f1937 = i14;
                        e.f1936 = e.m6210(i14) ^ e.f1936;
                        int i15 = e.f1937;
                        e.f1937 = e.f1936;
                        e.f1936 = i15;
                    }
                    int i16 = e.f1937;
                    e.f1937 = e.f1936;
                    e.f1936 = i16;
                    e.f1936 = i16 ^ iArr2[16];
                    e.f1937 ^= iArr2[17];
                    int i17 = e.f1935;
                    int i18 = e.f1937;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1936;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m6211(iArr2);
                    int i20 = e.f1935;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1935 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        cg cgVar = new cg(mo6277());
        int i10 = f2270 + 27;
        f2272 = i10 % 128;
        int i11 = i10 % 2;
        return cgVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2272 + 3;
        f2270 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6311(new int[]{1979937019, -450923286, 1733951821, -2033202908, -884718765, 322353826, 1868310028, -889477476, -588360393, -1697353932}, (KeyEvent.getMaxKeyCode() >> 16) + 17).intern();
        int i12 = f2270 + 27;
        f2272 = i12 % 128;
        if ((i12 % 2 == 0 ? '*' : 'H') != '*') {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2270 + 11;
        f2272 = i10 % 128;
        if (i10 % 2 != 0) {
            return Tapjoy.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2272 + 59;
        f2270 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6311(new int[]{1733951821, -2033202908, 390019095, 1044856029}, 7 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern();
        int i12 = f2270 + 111;
        f2272 = i12 % 128;
        if ((i12 % 2 == 0 ? 'W' : '/') == '/') {
            return strIntern;
        }
        throw null;
    }
}
