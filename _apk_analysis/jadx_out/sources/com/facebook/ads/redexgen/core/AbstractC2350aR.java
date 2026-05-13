package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2350aR {
    public static final int A00 = XP.A00();

    public static void A00(C2529dL c2529dL, ViewGroup viewGroup, String str) {
        new KZ(viewGroup, c2529dL).A07(str);
        View view = new View(c2529dL);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        XP.A0P(view, c2529dL);
        viewGroup.addView(view, 0);
    }
}
