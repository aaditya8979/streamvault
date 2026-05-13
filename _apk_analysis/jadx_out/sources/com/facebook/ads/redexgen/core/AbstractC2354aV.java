package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2354aV {
    public static float A00(C1983Mp c1983Mp) {
        int iA01 = c1983Mp.A0H().A01();
        int iA00 = c1983Mp.A0H().A00();
        if (iA00 > 0) {
            return iA01 / iA00;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        return (int) (((double) (AbstractC2231Wk.A00().widthPixels - (AbstractC2363ae.A07 * 2))) / d10);
    }

    public static int A02(int i10) {
        return (AbstractC2231Wk.A00().heightPixels - i10) - ((XP.A01(16) + (AbstractC2334aB.A0D * 2)) + (AbstractC2363ae.A07 * 2));
    }

    public static ViewOnClickListenerC2353aU A03(KE ke2, String str) {
        return new ViewOnClickListenerC2353aU(ke2, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
