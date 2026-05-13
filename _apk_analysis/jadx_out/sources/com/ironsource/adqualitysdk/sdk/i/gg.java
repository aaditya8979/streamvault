package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fyber.FairBid;

/* JADX INFO: loaded from: classes8.dex */
public final class gg extends gl {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2192 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2194 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2193 = {5998, 25266, 64704, 30291, 49195, 23140, 54671, 12248, 47615, 13171, 36203, 6300, 37540, 60655, 26159, 61524, 19049, 'f', 30129, 60361, 24834, 55074, 19833, 49796};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2191 = 4798225458005177808L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m6292(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2193[i10 + i12]) ^ (((long) i12) * f2191)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﻐ */
    public final bd mo6274() {
        br brVar = new br(mo6277());
        int i10 = f2194 + 7;
        f2192 = i10 % 128;
        int i11 = i10 % 2;
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ｋ */
    public final String mo6275() {
        int i10 = f2192 + 1;
        f2194 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6292(ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) (5901 - TextUtils.indexOf("", "")), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern();
        int i12 = f2192 + 93;
        f2194 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾇ */
    public final Class mo6276() {
        int i10 = f2194 + 51;
        int i11 = i10 % 128;
        f2192 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 97;
        f2194 = i13 % 128;
        int i14 = i13 % 2;
        return FairBid.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gl
    /* JADX INFO: renamed from: ﾒ */
    public final String mo6277() {
        int i10 = f2194 + 59;
        f2192 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m6292(MotionEvent.axisFromString("") + 18, (char) TextUtils.getCapsMode("", 0, 0), TextUtils.getTrimmedLength("") + 7).intern();
        int i12 = f2192 + 19;
        f2194 = i12 % 128;
        int i13 = i12 % 2;
        return strIntern;
    }
}
