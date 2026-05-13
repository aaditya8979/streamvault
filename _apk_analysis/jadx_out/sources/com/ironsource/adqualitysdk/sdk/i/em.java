package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes8.dex */
public final class em extends eg {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1998 = 181;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1999 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2000;

    public em(ed edVar, ed edVar2, dm dmVar) {
        super(edVar, edVar2, dmVar);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m6243(String str, int i10, boolean z10, int i11, int i12) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f728) {
            char[] cArr2 = new char[i10];
            b.f726 = 0;
            while (true) {
                int i13 = b.f726;
                if (i13 >= i10) {
                    break;
                }
                b.f727 = cArr[i13];
                cArr2[b.f726] = (char) (b.f727 + i12);
                int i14 = b.f726;
                cArr2[i14] = (char) (cArr2[i14] - f1998);
                b.f726 = i14 + 1;
            }
            if (i11 > 0) {
                b.f729 = i11;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f729;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f729;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f726 = 0;
                while (true) {
                    int i17 = b.f726;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f726 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.eg
    /* JADX INFO: renamed from: ﻛ */
    public final String mo6231() {
        int i10 = f1999 + 57;
        f2000 = i10 % 128;
        String strIntern = ((i10 % 2 != 0 ? '#' : (char) 1) != '#' ? m6243("\u0000\u0000", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2, true, View.getDefaultSize(0, 0) + 1, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE) : m6243("\u0000\u0000", (ViewConfiguration.getScrollBarFadeDuration() >>> 44) + 4, false, 1 >> View.getDefaultSize(1, 0), 5094 / (ViewConfiguration.getMaximumFlingVelocity() * 16))).intern();
        int i11 = f2000 + 35;
        f1999 = i11 % 128;
        if (i11 % 2 != 0) {
            return strIntern;
        }
        int i12 = 80 / 0;
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo6189(du duVar, cq cqVar) {
        return new dr(Boolean.valueOf(m6232().m6222(duVar, cqVar).m6167() && m6233().m6222(duVar, cqVar).m6167()));
    }
}
