package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2317Zs {
    public static void A00(View view, boolean z10, View.OnClickListener onClickListener) {
        if (!z10) {
            view.setOnClickListener(onClickListener);
        } else if (z10) {
            ViewOnClickListenerC2316Zr viewOnClickListenerC2316Zr = new ViewOnClickListenerC2316Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2316Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC2315Zq(viewOnClickListenerC2316Zr));
        }
    }
}
