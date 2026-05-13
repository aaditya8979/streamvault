package com.ironsource.adqualitysdk.sdk.i;

import android.text.AndroidCharacter;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bh extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f816 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f817 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f818 = {'E', 'N', 'A', 'B', 'L', 'D', 'F', 'G', 'H'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f819 = 3;

    public bh(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4899(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2151) {
            char[] cArr2 = f818;
            char c10 = f819;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo4887() {
        int i10 = f816;
        int i11 = i10 + 7;
        f817 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 61;
        f817 = i13 % 128;
        if ((i13 % 2 == 0 ? '\'' : 'L') == 'L') {
            return true;
        }
        int i14 = 98 / 0;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        int i10 = f816 + 11;
        f817 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f816 + 105;
        f817 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m4899("\u0001\u0002\u0000\u0005\u0003\u0001À", 7 - TextUtils.indexOf("", "", 0), (byte) (172 - AndroidCharacter.getMirror('0'))).intern();
        int i12 = f816 + 83;
        f817 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 11 : 'K') != 11) {
            return strIntern;
        }
        int i13 = 56 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo4814(String str) {
        int i10 = f816;
        int i11 = i10 + 1;
        f817 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 65;
        f817 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 22 : (char) 2) == 2) {
            return null;
        }
        throw null;
    }
}
