package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import jp.maio.sdk.android.MaioAds;

/* JADX INFO: loaded from: classes11.dex */
public final class gp extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2234 = {466222555, -1415867750, -826109828, -76992019, 872917414, 957241494, -1580637402, -305054276, -1207167165, 1766766734, 423897227, -272693523, -541437047, 82883115, 648651132, -1994170108, -29457662, -1268561349};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2235 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2236;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m6302(int[] iArr, int i10) {
        String str;
        synchronized (e.f1934) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2234.clone();
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
        bu buVar = new bu(mo6277());
        int i10 = f2236 + 85;
        f2235 = i10 % 128;
        int i11 = i10 % 2;
        return buVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2235 + 103;
        f2236 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6302(new int[]{205632231, -204140976, 919235390, -1329049541, -2005671753, 183694889, -1026868245, -1954004351, 2049927356, 1991180000, 1798293245, 1630322398, 424261212, -829557321}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26).intern();
        int i12 = f2236 + 17;
        f2235 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2236;
        int i11 = i10 + 39;
        f2235 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 55;
        f2235 = i13 % 128;
        int i14 = i13 % 2;
        return MaioAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2235 + 59;
        f2236 = i10 % 128;
        return (i10 % 2 == 0 ? m6302(new int[]{1234510871, -163039237}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4) : m6302(new int[]{1234510871, -163039237}, 5 >>> (ViewConfiguration.getJumpTapTimeout() % 5))).intern();
    }
}
