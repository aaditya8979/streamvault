package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;

/* JADX INFO: loaded from: classes8.dex */
public final class ge extends gl {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2176 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2177 = 55040;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2178 = 29878;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f2179 = 41542;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2180 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2181 = 39924;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6288(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f3014) {
            char[] cArr2 = new char[cArr.length];
            n.f3013 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f3013;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2177)) ^ ((c11 >>> 5) + f2179)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2178) ^ ((c12 + i12) ^ ((c12 << 4) + f2181))));
                        i12 -= 40503;
                    }
                    int i14 = n.f3013;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f3013 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        bj bjVar = new bj(mo6277());
        int i10 = f2180 + 113;
        f2176 = i10 % 128;
        int i11 = i10 % 2;
        return bjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2176 + 119;
        f2180 = i10 % 128;
        return m6288("మ팆突緙嵝륨৲\ue695굅\ue799߅뤮伉\ua87eꖭ떎븼媪\uaad8햰\uf1cb\ue045鲣杆ꕢ㧽\udd5f\uedd7뽥傣", i10 % 2 == 0 ? (ViewConfiguration.getJumpTapTimeout() >> 16) + 29 : 79 - (ViewConfiguration.getJumpTapTimeout() / 115)).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2180 + 123;
        f2176 = i10 % 128;
        if ((i10 % 2 == 0 ? '8' : '7') == '7') {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2176 + 93;
        f2180 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6288("嵝륨৲\ue695굅\ue799߅뤮伉\ua87e", TextUtils.getOffsetBefore("", 0) + 10).intern();
        int i12 = f2176 + 25;
        f2180 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
