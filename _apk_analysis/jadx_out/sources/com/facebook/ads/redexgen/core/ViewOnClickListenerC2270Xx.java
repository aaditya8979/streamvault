package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2270Xx implements View.OnClickListener {
    public final /* synthetic */ C2011Nr A00;

    public ViewOnClickListenerC2270Xx(C2011Nr c2011Nr) {
        this.A00 = c2011Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00.A01 == null || !this.A00.A02.A02()) {
                return;
            }
            this.A00.A01.ACC(this.A00);
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
