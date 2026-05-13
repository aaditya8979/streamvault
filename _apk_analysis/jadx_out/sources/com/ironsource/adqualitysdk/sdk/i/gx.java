package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.yandex.mobile.ads.common.MobileAds;

/* JADX INFO: loaded from: classes11.dex */
public final class gx extends gl {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2273 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2274 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2275 = -1466685836665518762L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6312(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f2275, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2275));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        cj cjVar = new cj(mo6277());
        int i10 = f2274 + 19;
        f2273 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        return cjVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2273 + 103;
        f2274 = i10 % 128;
        if ((i10 % 2 != 0 ? 'Q' : (char) 29) != 29) {
            m6312("녃넠\u0a46轿鑋麊둶\u245aꑢᖰ뻠腤鮖㼁꯸麅\uf124䩃푗\uf43c\ue446嗧ﻧ셜\udb88罟\ueb8d\ude8fㄾ詴ᑙ㐦␅閌㻱Œᯪ뼅⮃ộ焿쩢", TextUtils.getTrimmedLength("")).intern();
            throw null;
        }
        String strIntern = m6312("녃넠\u0a46轿鑋麊둶\u245aꑢᖰ뻠腤鮖㼁꯸麅\uf124䩃푗\uf43c\ue446嗧ﻧ셜\udb88罟\ueb8d\ude8fㄾ詴ᑙ㐦␅閌㻱Œᯪ뼅⮃ộ焿쩢", TextUtils.getTrimmedLength("")).intern();
        int i11 = f2273 + 47;
        f2274 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2273;
        int i11 = i10 + 117;
        f2274 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 69;
        f2274 = i13 % 128;
        int i14 = i13 % 2;
        return MobileAds.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2274 + 91;
        f2273 = i10 % 128;
        return m6312("✷❎㉂띵ௌĎꭀ㬦㈊ⶣ", i10 % 2 == 0 ? 1 >> TextUtils.lastIndexOf("", 'y', 0, 0) : TextUtils.lastIndexOf("", '0', 0, 0) + 1).intern();
    }
}
