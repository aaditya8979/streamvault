package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.i.ar;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class au extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f584 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f585 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f586 = 2051739644234859278L;

    public au(ax axVar) {
        m4596(axVar);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m4721(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f586, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f586));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m4722() {
        int i10 = f585 + 35;
        f584 = i10 % 128;
        int i11 = i10 % 2;
        boolean zOptBoolean = m4593().optBoolean(m4721("蟰螗፣裾通躁鎻\u1af2", Drawable.resolveOpacity(0, 0)).intern(), true);
        int i12 = f585 + 51;
        f584 = i12 % 128;
        if ((i12 % 2 != 0 ? 'c' : (char) 22) != 'c') {
            return zOptBoolean;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m4723() {
        int i10 = f585 + 113;
        f584 = i10 % 128;
        if ((i10 % 2 != 0 ? '.' : (char) 15) == '.') {
            m4594().m4747();
            throw null;
        }
        List<String> listM4747 = m4594().m4747();
        int i11 = f585 + 79;
        f584 = i11 % 128;
        int i12 = i11 % 2;
        return listM4747;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m4724() {
        int i10 = f585 + 53;
        f584 = i10 % 128;
        int i11 = i10 % 2;
        boolean zOptBoolean = m4593().optBoolean(m4721("䓜䒻눍␣ㅴ≉♷꼾", ViewConfiguration.getPressedStateDuration() >> 16).intern(), true);
        int i12 = f584 + 103;
        f585 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zOptBoolean;
        }
        int i13 = 52 / 0;
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m4725() {
        int i10 = f585 + 79;
        f584 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 18 : (char) 22) == 22) {
            return m4594().m4745();
        }
        m4594().m4745();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m4726() {
        int i10 = f585 + 47;
        f584 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return m4594().m4750();
        }
        int i11 = 37 / 0;
        return m4594().m4750();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m4727() {
        int i10 = f585 + 21;
        f584 = i10 % 128;
        int i11 = i10 % 2;
        int iM4748 = m4594().m4748();
        int i12 = f584 + 1;
        f585 = i12 % 128;
        int i13 = i12 % 2;
        return iM4748;
    }
}
