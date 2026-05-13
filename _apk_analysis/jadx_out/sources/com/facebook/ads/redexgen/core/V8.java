package com.facebook.ads.redexgen.core;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class V8 {
    public static String[] A00 = {"TYvyTugW0LIK7CMS2wYs9G2uUGgA7Dke", "WsEiqL7ZS4BTI966aPHoJ2dPx2Ea0F4I", "bsmL1TSWcO8d5RdSDpnXrtDP3Rd3pXtR", "xkYelsmw9O3RFB2zMTQOqufEggZJfpsf", "Ou1dyJktpNGGcf9tDpPKvHuJxEoqg2O4", "MwtSqX2RTtZq4kMpP", "Xg7OrQNETkr2DWt43s", "zI20iJtpElrzvKbVLZsd1iWpdjTxU8BC"};

    public static V6 A00(DisplayMetrics displayMetrics) {
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i11 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (C2233Wm.A04(i10, i11)) {
            return V6.A0I;
        }
        if (i11 <= i10) {
            return V6.A0H;
        }
        V6 v62 = V6.A0K;
        String[] strArr = A00;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A00[7] = "zEjIxhk858iOsdYr9SgRsiKXnD8rO3VU";
        return v62;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, V4 v42) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(((int) (((float) displayMetrics.widthPixels) / displayMetrics.density)) >= v42.A04() ? displayMetrics.widthPixels : (int) Math.ceil(v42.A04() * displayMetrics.density), (int) Math.ceil(v42.A03() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
