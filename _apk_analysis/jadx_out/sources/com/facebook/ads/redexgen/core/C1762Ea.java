package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1762Ea extends C2344aL {
    public final ImageView A00;
    public final C2529dL A01;

    public C1762Ea(C2529dL c2529dL) {
        super(c2529dL);
        this.A01 = c2529dL;
        this.A00 = new ImageView(c2529dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        KZ kz = new KZ(this.A00, this.A01);
        kz.A04();
        kz.A07(str);
    }
}
