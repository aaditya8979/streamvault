package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.applovin.sdk.AppLovinSdk;

/* JADX INFO: loaded from: classes8.dex */
public final class gb extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2162 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f2163 = -1193984871553583857L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2164 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6285(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2041) {
            f.f2039 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2040 = 0;
            while (true) {
                int i11 = f.f2040;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f2163);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        bi biVar = new bi(mo6277());
        int i10 = f2162 + 63;
        f2164 = i10 % 128;
        if ((i10 % 2 == 0 ? ')' : (char) 29) != ')') {
            return biVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2162 + 33;
        f2164 = i10 % 128;
        return (i10 % 2 == 0 ? m6285("땬睁ㄠ\uf342뷪翚㦹ﮄꑨ晐\u202c\ue20a겭滑⢥\uea8b霱兿ጭ\udd0c鿗姕ᮯ양虹䁥ȱ찟", 49697 << (ViewConfiguration.getScrollBarFadeDuration() * 79)) : m6285("땬睁ㄠ\uf342뷪翚㦹ﮄꑨ晐\u202c\ue20a겭滑⢥\uea8b霱兿ጭ\udd0c鿗姕ᮯ양虹䁥ȱ찟", 49697 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2164;
        int i11 = i10 + 45;
        f2162 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 33;
        f2162 = i13 % 128;
        if ((i13 % 2 != 0 ? '`' : ',') == ',') {
            return AppLovinSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2162 + 17;
        f2164 = i10 % 128;
        return m6285("땮ퟪ灕鋜㼴妐礼ݲ", (i10 % 2 == 0 ? '@' : '0') != '@' ? 25236 - MotionEvent.axisFromString("") : 3258 >>> MotionEvent.axisFromString("")).intern();
    }
}
