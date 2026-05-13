package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: loaded from: classes11.dex */
public final class gr extends gl {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2243 = 7563637630334370911L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2244 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2245 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6305(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f2243, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f2243));
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
        bt btVar = new bt(mo6277());
        int i10 = f2245 + 99;
        f2244 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 26 : ' ') != 26) {
            return btVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2245 + 43;
        f2244 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6305("ꢯ唒쀰쟺\ua8cc턢죣䫉릺삻\uda65复訤\uf22a\uebf3瞝鲸\ueda4ﴬ؆\ued3a鼹軷ᒖﾷ躰ꁵ⌝쀴렱뇽㇑튂ꮣ䍽쀕⌜䕂哛\udf75㖐瓌", 1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern();
        int i12 = f2244 + 75;
        f2245 = i12 % 128;
        if ((i12 % 2 == 0 ? 'I' : 'B') == 'B') {
            return strIntern;
        }
        int i13 = 47 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2245 + 61;
        int i11 = i10 % 128;
        f2244 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 73;
        f2245 = i13 % 128;
        int i14 = i13 % 2;
        return IronSource.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2244 + 109;
        f2245 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m6305("ꑫ絛멨ﮇꐂ纂늹直땤漛ꀧ敬蛰嶝", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
            throw null;
        }
        String strIntern = m6305("ꑫ絛멨ﮇꐂ纂늹直땤漛ꀧ敬蛰嶝", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern();
        int i11 = f2245 + 99;
        f2244 = i11 % 128;
        int i12 = i11 % 2;
        return strIntern;
    }
}
