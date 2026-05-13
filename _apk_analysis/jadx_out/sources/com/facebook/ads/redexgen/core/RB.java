package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RB {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static LH A00(Context context, SS ss2) {
        return A01(context, ss2, null);
    }

    public static LH A01(Context context, SS ss2, String str) {
        LL llA84 = ss2.A84(A09(context));
        return llA84 != null ? str != null ? llA84.ABo(str) : llA84.ABn() : new C2865j3();
    }

    public static C2529dL A02(Activity activity) {
        return new C2529dL(activity, (SS) A0A(), A00(activity, A0A()));
    }

    public static C2529dL A03(Context context) {
        return new C2529dL(context, A0A(), new C2865j3());
    }

    public static C2529dL A04(Context context) {
        if (U7.A0w(context)) {
            return new C2529dL(context, A0A(), A00(context, A0A()));
        }
        C2529dL c2529dLA03 = A03(context);
        if (A00[2].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return c2529dLA03;
    }

    public static C2529dL A05(Context context, String str) {
        LH lhA01 = A01(context, A0A(), str);
        lhA01.AIj(1000);
        return new C2529dL(context, A0A(), lhA01);
    }

    public static C2529dL A06(Context context, String str) {
        return new C2529dL(context, A0A(), A01(context, A0A(), str));
    }

    public static C2529dL A07(Context context, String str) {
        return new C2529dL(context, A0A(), A01(context, A0A(), str));
    }

    public static C6M A08(Context context) {
        return new C6M(context, A0A(), A0A().A84(A09(context)));
    }

    public static C2503cu A09(Context context) {
        return new C2503cu(context, A0A());
    }

    public static synchronized C2240Wt A0A() {
        return C2240Wt.A02();
    }
}
