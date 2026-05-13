package com.ironsource.adqualitysdk.sdk.i;

import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class be extends bd {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f802 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f803 = -6536688573272972428L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f804;

    public be(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m4896(String str, int i10) {
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
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2039 * i11))) ^ f803);
                    f.f2040++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﺙ */
    public final boolean mo4886() {
        int i10 = f804;
        int i11 = i10 + 49;
        f802 = i11 % 128;
        boolean z10 = (i11 % 2 == 0 ? (char) 20 : 'A') != 20;
        int i12 = i10 + 117;
        f802 = i12 % 128;
        if ((i12 % 2 == 0 ? ' ' : (char) 28) != ' ') {
            return z10;
        }
        int i13 = 79 / 0;
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo4887() {
        int i10 = f802 + 35;
        int i11 = i10 % 128;
        f804 = i11;
        boolean z10 = i10 % 2 == 0;
        int i12 = i11 + 93;
        f802 = i12 % 128;
        if (i12 % 2 != 0) {
            return z10;
        }
        int i13 = 28 / 0;
        return z10;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        int i10 = f804 + 79;
        f802 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f802 + 3;
        f804 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m4896("ꌱ乯禟擉ᙬƘⳎ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 60757).intern();
        int i12 = f804 + 81;
        f802 = i12 % 128;
        if (i12 % 2 != 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo4814(String str) {
        int i10 = f804 + 111;
        int i11 = i10 % 128;
        f802 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 71;
        f804 = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }
}
