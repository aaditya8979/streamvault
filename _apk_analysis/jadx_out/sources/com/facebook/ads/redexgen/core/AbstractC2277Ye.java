package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2277Ye {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (AbstractC2232Wl.A02 * 200.0f);
    public static final int A03 = (int) (AbstractC2232Wl.A02 * 200.0f);
    public static final int A02 = (int) (AbstractC2232Wl.A02 * 50.0f);

    public static EnumC1972Md A00(NativeAdLayout nativeAdLayout) {
        return nativeAdLayout == null ? EnumC1972Md.A04 : A03(nativeAdLayout) ? EnumC1972Md.A05 : EnumC1972Md.A03;
    }

    public static AbstractC2276Yd A01(C2529dL c2529dL, US us2, String str, View view) {
        if (view == null) {
            return null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width >= A01 && height >= A01) {
            return new LS(c2529dL, us2, str);
        }
        if (width >= A03) {
            int i10 = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i10) {
                return new LU(c2529dL, us2, str);
            }
        }
        return null;
    }

    public static LV A02(C2529dL c2529dL, US us2, String str, N9 n92, InterfaceC2261Xo interfaceC2261Xo, InterfaceC2260Xn interfaceC2260Xn) {
        return new LV(c2529dL, us2, str, n92, interfaceC2261Xo, interfaceC2260Xn);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        if (width < A01 || height < A01) {
            int i10 = A03;
            String[] strArr = A00;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[1] = "e";
            strArr2[0] = "I";
            if (width < i10 || height < A02) {
                return true;
            }
        }
        return false;
    }
}
