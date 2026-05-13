package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class cu extends cz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1547 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1548 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1549 = 354585702;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1550 = 111;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1551 = 1133685387;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f1552;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1553 = {-78, -33, -42, -61, 20, -114, -63, 17, -120, -37, -34, -28, -83, -35, -41, 9, -127, -47, -52, 19, -121, -57, -37, -59, -32, -57, -35, 46, 114, -35, -61, -32, -13, -83, -112, -123, -4, 75, 61, -6, 74, 41, -116, 0, -121, -114, -114, 81, 56, -8, -108, -10, -113, -8, -114, 93, 41, -114, -4, -113, -84};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m5862(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f3015) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1550;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1553;
                i14 = bArr != null ? (byte) (bArr[f1549 + i10] + i13) : (short) (f1552[f1549 + i10] + i13);
            }
            if (i14 > 0) {
                o.f3016 = ((i10 + i14) - 2) + f1549 + (z10 ? 1 : 0);
                o.f3017 = b10;
                char c10 = (char) (i11 + f1551);
                o.f3019 = c10;
                sb2.append(c10);
                o.f3018 = o.f3019;
                o.f3020 = 1;
                while (o.f3020 < i14) {
                    byte[] bArr2 = f1553;
                    if (bArr2 != null) {
                        int i15 = o.f3016;
                        o.f3016 = i15 - 1;
                        o.f3019 = (char) (o.f3018 + (((byte) (bArr2[i15] + s10)) ^ o.f3017));
                    } else {
                        short[] sArr = f1552;
                        int i16 = o.f3016;
                        o.f3016 = i16 - 1;
                        o.f3019 = (char) (o.f3018 + (((short) (sArr[i16] + s10)) ^ o.f3017));
                    }
                    sb2.append(o.f3019);
                    o.f3018 = o.f3019;
                    o.f3020++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m5863(cq cqVar, List<Object> list) {
        cq cqVar2;
        List list2 = (List) cz.m5927(list, 0, List.class);
        try {
            ds dsVar = (ds) cz.m5927(list, 1, ds.class);
            List<Object> arrayList = new ArrayList<>();
            if ((list.size() > 2 ? 'V' : (char) 0) == 0) {
                cqVar2 = cqVar;
            } else {
                if (!(!cz.m5926(list, 2, cq.class))) {
                    cqVar2 = (cq) cz.m5927(list, 2, cq.class);
                    if (list.size() > 3) {
                        int i10 = f1547 + 15;
                        f1548 = i10 % 128;
                        arrayList = i10 % 2 != 0 ? cz.m5929(list, 5) : cz.m5929(list, 3);
                    }
                } else {
                    arrayList = cz.m5929(list, 2);
                    int i11 = f1547 + 65;
                    f1548 = i11 % 128;
                    int i12 = i11 % 2;
                    cqVar2 = cqVar;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (i13 < list2.size()) {
                arrayList.add(0, list2.get(i13));
                arrayList2.add(dsVar.m6173(cqVar2.m5761(), cqVar2, arrayList).m6165());
                arrayList.remove(0);
                i13++;
                int i14 = f1548 + 49;
                f1547 = i14 % 128;
                int i15 = i14 % 2;
            }
            return arrayList2;
        } catch (Exception e10) {
            co.m5699(cqVar.m5759(), m5862((ViewConfiguration.getScrollBarSize() >> 8) - 354585702, (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47), KeyEvent.keyCodeFromString("") - 1133685318, (byte) (15 - KeyEvent.keyCodeFromString("")), (-113) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), e10);
            return list2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.cz.m5926(r12, 2, com.ironsource.adqualitysdk.sdk.i.cq.class)) != false) goto L23;
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m5864(com.ironsource.adqualitysdk.sdk.i.cq r11, java.util.List<java.lang.Object> r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cu.m5864(com.ironsource.adqualitysdk.sdk.i.cq, java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m5865(cq cqVar, List<Object> list) {
        int i10 = f1547 + 117;
        f1548 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 11 : '<') == '<') {
            m5863(cqVar, list);
            return null;
        }
        m5863(cqVar, list);
        throw null;
    }
}
