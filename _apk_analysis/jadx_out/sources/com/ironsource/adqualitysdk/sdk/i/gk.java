package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.widget.ExpandableListView;
import com.hyprmx.android.sdk.placement.PlacementType;

/* JADX INFO: loaded from: classes11.dex */
public final class gk extends gl {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2210 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2211 = 1400;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2212 = 22706;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2213 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2214 = 30494;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2215 = 16338;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m6296(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2211)) ^ ((c11 >>> 5) + f2214)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2215) ^ ((c12 + i12) ^ ((c12 << 4) + f2212))));
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
        bp bpVar = new bp(mo6277());
        int i10 = f2213 + 119;
        f2210 = i10 % 128;
        int i11 = i10 % 2;
        return bpVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2210 + 107;
        f2213 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6296("똹인藪⿴ꝃ鴬琊ሑ▼臶ꮌ뫦⋓ᢣ䣆鑚䥃一ഩ飠ㄧ寉繄\ue24d䬛\ue94dา\uee19燮\uf0db젓ឯⲸ泇䬛\ue94dา\uee19燮\uf0db젓ឯ矸\ud8f1孂瓠", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47).intern();
        int i12 = f2210 + 49;
        f2213 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : '\t') == '\t') {
            return strIntern;
        }
        int i13 = 40 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2210;
        int i11 = i10 + 61;
        f2213 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 25;
        f2213 = i13 % 128;
        if (i13 % 2 == 0) {
            return PlacementType.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2213 + 125;
        f2210 = i10 % 128;
        String strIntern = m6296("ꝃ鴬琊ሑ▼臶", (i10 % 2 == 0 ? 'A' : 'K') != 'A' ? (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5 : 4 >> (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern();
        int i11 = f2210 + 119;
        f2213 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }
}
