package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1671 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1672 = -3665845259407612904L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1673;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
    
        if ((!r2) != true) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        if (r2 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> boolean m5926(java.util.List<java.lang.Object> r2, int r3, java.lang.Class<T> r4) {
        /*
            java.lang.Object r2 = r2.get(r3)
            r3 = 65
            if (r2 == 0) goto Lb
            r0 = 84
            goto Lc
        Lb:
            r0 = r3
        Lc:
            r1 = 1
            if (r0 == r3) goto L3a
            int r3 = com.ironsource.adqualitysdk.sdk.i.cz.f1671
            int r3 = r3 + 85
            int r0 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1673 = r0
            int r3 = r3 % 2
            r0 = 0
            if (r3 == 0) goto L1e
            r3 = r0
            goto L1f
        L1e:
            r3 = r1
        L1f:
            java.lang.Class r2 = r2.getClass()
            boolean r2 = r4.isAssignableFrom(r2)
            if (r3 == 0) goto L31
            if (r2 == 0) goto L2d
            r2 = r0
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 == r1) goto L37
            goto L3a
        L31:
            r3 = 79
            int r3 = r3 / r0
            if (r2 == 0) goto L37
            goto L3a
        L37:
            return r0
        L38:
            r2 = move-exception
            throw r2
        L3a:
            int r2 = com.ironsource.adqualitysdk.sdk.i.cz.f1673
            int r2 = r2 + 13
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1671 = r3
            int r2 = r2 % 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.m5926(java.util.List, int, java.lang.Class):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <T> T m5927(List<Object> list, int i10, Class<T> cls) {
        T t10 = (T) list.get(i10);
        if (t10 != null) {
            int i11 = f1673 + 99;
            f1671 = i11 % 128;
            int i12 = i11 % 2;
            if (!(cls.isAssignableFrom(t10.getClass()))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m5928("毟䰬䟸殜\ue855憎ྦᚯ\ufbd0砠齈虂䭾袇⽼\uf7a1", ViewConfiguration.getDoubleTapTimeout() >> 16).intern());
                sb2.append(t10.getClass().getName());
                sb2.append(m5928("ݰᬰ柷ݐ뽜\ue572⾨च", 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb2.append(cls.getName());
                throw new ClassCastException(sb2.toString());
            }
        }
        int i13 = f1673 + 85;
        f1671 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return t10;
        }
        int i14 = 40 / 0;
        return t10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m5928(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2306) {
            char[] cArrM6319 = h.m6319(f1672, cArr, i10);
            h.f2307 = 4;
            while (true) {
                int i11 = h.f2307;
                if (i11 < cArrM6319.length) {
                    h.f2305 = i11 - 4;
                    cArrM6319[h.f2307] = (char) (((long) (cArrM6319[r1] ^ cArrM6319[r1 % 4])) ^ (((long) h.f2305) * f1672));
                    h.f2307++;
                } else {
                    str2 = new String(cArrM6319, 4, cArrM6319.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static List<Object> m5929(List<Object> list, int i10) {
        ArrayList arrayList = new ArrayList();
        if ((list.size() > i10 ? 'C' : '%') != 'C') {
            return arrayList;
        }
        int i11 = f1671 + 59;
        f1673 = i11 % 128;
        int i12 = i11 % 2;
        if (!m5926(list, i10, List.class)) {
            return arrayList;
        }
        int i13 = f1673 + 21;
        f1671 = i13 % 128;
        if (i13 % 2 != 0) {
            return (List) m5927(list, i10, List.class);
        }
        throw null;
    }
}
