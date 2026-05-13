package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.bd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bf extends bd {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f806 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f808;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f807 = {'E', 33080, 685, 33824, 1428, 34571, 2176};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f805 = -4211819825991155338L;

    public bf(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m4897(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f807[i10 + i12]) ^ (((long) i12) * f805)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻏ */
    public final boolean mo4887() {
        int i10 = f808 + 51;
        int i11 = i10 % 128;
        f806 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 71;
        f808 = i13 % 128;
        int i14 = i13 % 2;
        return true;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo4812() {
        HashMap map = new HashMap();
        int i10 = f806 + 9;
        f808 = i10 % 128;
        int i11 = i10 % 2;
        return map;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo4813() {
        int i10 = f806 + 117;
        f808 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m4897(ViewConfiguration.getDoubleTapTimeout() >> 16, (char) TextUtils.indexOf("", "", 0), (KeyEvent.getMaxKeyCode() >> 16) + 7).intern();
        int i12 = f808 + 61;
        f806 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo4814(String str) {
        int i10 = f808 + 75;
        f806 = i10 % 128;
        if ((i10 % 2 == 0 ? 'c' : ':') != 'c') {
            return null;
        }
        throw null;
    }
}
