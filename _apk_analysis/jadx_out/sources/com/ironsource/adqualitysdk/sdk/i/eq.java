package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes8.dex */
public final class eq extends eo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2010 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2011 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2009 = {'>', 29252};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f2008 = -7149399757008571783L;

    public eq(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6247(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2009[i10 + i12]) ^ (((long) i12) * f2008)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6231() {
        int iResolveSize;
        char maxKeyCode;
        int i10;
        int i11 = f2010 + 17;
        f2011 = i11 % 128;
        if ((i11 % 2 == 0 ? (char) 5 : '1') != '1') {
            iResolveSize = View.resolveSize(0, 0);
            maxKeyCode = (char) (KeyEvent.getMaxKeyCode() << 53);
            i10 = 0 % (ViewConfiguration.getScrollFriction() > 2.0f ? 1 : (ViewConfiguration.getScrollFriction() == 2.0f ? 0 : -1));
        } else {
            iResolveSize = View.resolveSize(0, 0);
            maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
            i10 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1;
        }
        String strIntern = m6247(iResolveSize, maxKeyCode, i10).intern();
        int i12 = f2011 + 57;
        f2010 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.el
    /* JADX INFO: renamed from: ﾇ */
    public final boolean mo6240(int i10) {
        int i11 = f2011;
        int i12 = i11 + 77;
        f2010 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            throw null;
        }
        if ((i10 >= 0 ? '.' : (char) 6) != '.') {
            return false;
        }
        int i13 = i11 + 107;
        f2010 = i13 % 128;
        if (i13 % 2 == 0) {
            return true;
        }
        throw null;
    }
}
