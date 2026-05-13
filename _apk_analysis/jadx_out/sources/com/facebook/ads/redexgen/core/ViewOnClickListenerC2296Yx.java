package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2296Yx implements View.OnClickListener {
    public final /* synthetic */ C2280Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC2296Yx(LS ls2, C2280Yh c2280Yh) {
        this.A01 = ls2;
        this.A00 = c2280Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AEC(O4.A04);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
