package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class cm {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f1382 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1385;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private dp f1386;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private List<cq> f1387 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private dh f1388;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private az f1389;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private db f1390;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Context f1391;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bd f1392;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1384 = {'n', 2941, 5708, 8509, 11270, 14313, 17130, 19894, 22665, 25496, 28543, 31313, 'E', 2898, 5753, 8470, 11324, 14281, 17132, 'D', 2901, 5739, 8469, 11314, 14272, 17133, 19840};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f1383 = -1433742800500225252L;

    public cm(Context context, dh dhVar, az azVar, db dbVar, bd bdVar) {
        this.f1388 = dhVar;
        this.f1389 = azVar;
        this.f1390 = dbVar;
        this.f1392 = bdVar;
        this.f1391 = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized List<cq> m5666() {
        int i10 = f1385 + 89;
        f1382 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f1387 != null) {
            return new ArrayList(this.f1387);
        }
        ArrayList arrayList = new ArrayList();
        int i12 = f1382 + 57;
        f1385 = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m5667(cm cmVar) {
        int i10 = f1382 + 51;
        int i11 = i10 % 128;
        f1385 = i11;
        char c10 = i10 % 2 != 0 ? '8' : (char) 11;
        List<cq> list = cmVar.f1387;
        if (c10 != 11) {
            int i12 = 90 / 0;
        }
        int i13 = i11 + 61;
        f1382 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return list;
        }
        int i14 = 32 / 0;
        return list;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hs m5668(dn dnVar) {
        int i10 = f1385 + 61;
        f1382 = i10 % 128;
        int i11 = i10 % 2;
        if (dnVar == null) {
            return null;
        }
        hs hsVar = new hs(dnVar, m5668(this.f1388.m5990().get(dnVar.m6096())));
        int i12 = f1382 + 5;
        f1385 = i12 % 128;
        if (i12 % 2 == 0) {
            return hsVar;
        }
        int i13 = 84 / 0;
        return hsVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5669(cq cqVar) {
        int i10 = f1385 + 91;
        f1382 = i10 % 128;
        int i11 = i10 % 2;
        this.f1387.add(cqVar);
        int i12 = f1385 + 15;
        f1382 = i12 % 128;
        if ((i12 % 2 == 0 ? 'A' : (char) 19) == 19) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private synchronized void m5670(dh dhVar, bd bdVar) {
        if (bdVar.mo4887()) {
            int i10 = f1382 + 53;
            f1385 = i10 % 128;
            int i11 = i10 % 2;
            Iterator<cq> it = m5666().iterator();
            while (true) {
                if ((it.hasNext() ? '#' : (char) 5) != '#') {
                    break;
                }
                int i12 = f1382 + 111;
                f1385 = i12 % 128;
                int i13 = i12 % 2;
                cq next = it.next();
                dhVar.m5991().m6184().m6185(next.m5764().m6414(), next);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m5671(dp dpVar) {
        int i10 = f1385 + 41;
        f1382 = i10 % 128;
        int i11 = i10 % 2;
        m5673(dpVar);
        int i12 = f1385 + 103;
        f1382 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 31 : '@') != 31) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m5672(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1675) {
            char[] cArr = new char[i11];
            d.f1674 = 0;
            while (true) {
                int i12 = d.f1674;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f1384[i10 + i12]) ^ (((long) i12) * f1383)) ^ ((long) c10));
                    d.f1674 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m5673(dp dpVar) {
        int i10 = f1385;
        int i11 = i10 + 33;
        f1382 = i11 % 128;
        if ((i11 % 2 == 0 ? '$' : (char) 31) != 31) {
            throw null;
        }
        if (!(dpVar == null)) {
            this.f1386 = dpVar;
        }
        int i12 = i10 + 5;
        f1382 = i12 % 128;
        if ((i12 % 2 == 0 ? '0' : 'M') != 'M') {
            int i13 = 66 / 0;
            return;
        }
        return;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public final synchronized boolean m5674() {
        boolean zMo4887;
        int i10 = f1385 + 47;
        f1382 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 5 : (char) 15) != 15) {
            zMo4887 = this.f1392.mo4887();
            int i11 = 71 / 0;
        } else {
            zMo4887 = this.f1392.mo4887();
        }
        return zMo4887;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final Context m5675() {
        int i10 = f1382 + 101;
        int i11 = i10 % 128;
        f1385 = i11;
        int i12 = i10 % 2;
        Context context = this.f1391;
        int i13 = i11 + 25;
        f1382 = i13 % 128;
        int i14 = i13 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final az m5676() {
        int i10 = f1382;
        int i11 = i10 + 79;
        f1385 = i11 % 128;
        int i12 = i11 % 2;
        az azVar = this.f1389;
        int i13 = i10 + 3;
        f1385 = i13 % 128;
        if ((i13 % 2 != 0 ? ':' : '\f') == '\f') {
            return azVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final synchronized dp m5677() {
        dp dpVar;
        int i10 = f1382;
        int i11 = i10 + 77;
        f1385 = i11 % 128;
        int i12 = i11 % 2;
        dpVar = this.f1386;
        int i13 = i10 + 71;
        f1385 = i13 % 128;
        if ((i13 % 2 != 0 ? '1' : '0') == '1') {
            throw null;
        }
        return dpVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final String m5678() {
        int i10 = f1382 + 27;
        f1385 = i10 % 128;
        int i11 = i10 % 2;
        String strMo4895 = this.f1392.mo4895();
        int i12 = f1385 + 89;
        f1382 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        return strMo4895;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final String m5679() {
        int i10 = f1382 + 125;
        f1385 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return this.f1392.m4893();
        }
        int i11 = 14 / 0;
        return this.f1392.m4893();
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final String m5680() {
        int i10 = f1382 + 33;
        f1385 = i10 % 128;
        int i11 = i10 % 2;
        String strM5993 = this.f1388.m5993();
        int i12 = f1385 + 101;
        f1382 = i12 % 128;
        int i13 = i12 % 2;
        return strM5993;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m5681() {
        int i10 = f1382 + 113;
        f1385 = i10 % 128;
        int i11 = i10 % 2;
        String strM5994 = this.f1388.m5994();
        int i12 = f1382 + 15;
        f1385 = i12 % 128;
        if ((i12 % 2 != 0 ? 'C' : '1') != 'C') {
            return strM5994;
        }
        int i13 = 57 / 0;
        return strM5994;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final String m5682() {
        int i10 = f1385 + 103;
        f1382 = i10 % 128;
        if (i10 % 2 == 0) {
            TextUtils.isEmpty(m5679());
            throw null;
        }
        String strM5679 = m5679();
        if (!TextUtils.isEmpty(strM5679)) {
            if ((!m5672((ViewConfiguration.getScrollBarSize() >> 8) + 12, (char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 7).intern().equals(strM5679) ? (char) 30 : 'F') == 30) {
                if (!(m5672((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, (char) Color.argb(0, 0, 0, 0), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern().equals(strM5679))) {
                    String strM5997 = this.f1388.m5997(m5679());
                    int i11 = f1382 + 97;
                    f1385 = i11 % 128;
                    int i12 = i11 % 2;
                    return strM5997;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m5683() {
        int i10 = f1385 + 115;
        f1382 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            this.f1387.iterator();
            throw null;
        }
        Iterator<cq> it = this.f1387.iterator();
        while (true) {
            if (!it.hasNext()) {
                t.m7076(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.cm.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo4352() {
                        cm.m5667(cm.this).clear();
                    }
                });
                return;
            }
            int i11 = f1385 + 87;
            f1382 = i11 % 128;
            if (!(i11 % 2 != 0)) {
                it.next().m5757();
                throw null;
            }
            it.next().m5757();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final String m5684() {
        int i10 = f1382 + 111;
        f1385 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f1388.m5995();
            throw null;
        }
        String strM5995 = this.f1388.m5995();
        int i11 = f1385 + 57;
        f1382 = i11 % 128;
        if (i11 % 2 != 0) {
            return strM5995;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00be A[PHI: r3
      0x00be: PHI (r3v20 com.ironsource.adqualitysdk.sdk.i.dn) = (r3v16 com.ironsource.adqualitysdk.sdk.i.dn), (r3v25 com.ironsource.adqualitysdk.sdk.i.dn) binds: [B:32:0x00bc, B:27:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5685() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cm.m5685():void");
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m5686(String str, List<Object> list) {
        int i10 = f1385 + 23;
        f1382 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<cq> it = m5666().iterator();
        while (true) {
            if ((it.hasNext() ? (char) 7 : (char) 4) == 4) {
                return;
            }
            int i12 = f1385 + 7;
            f1382 = i12 % 128;
            int i13 = i12 % 2;
            it.next().m5770(str, list);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String m5687() {
        int i10 = f1385 + 49;
        f1382 = i10 % 128;
        int i11 = i10 % 2;
        String strM5998 = this.f1388.m5998();
        int i12 = f1385 + 55;
        f1382 = i12 % 128;
        int i13 = i12 % 2;
        return strM5998;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m5688() {
        int i10 = f1382 + 121;
        f1385 = i10 % 128;
        int i11 = i10 % 2;
        String strM5996 = this.f1388.m5996();
        int i12 = f1385 + 119;
        f1382 = i12 % 128;
        int i13 = i12 % 2;
        return strM5996;
    }
}
