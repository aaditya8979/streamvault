package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2273Ya implements View.OnClickListener {
    public final /* synthetic */ C2275Yc A00;

    public ViewOnClickListenerC2273Ya(C2275Yc c2275Yc) {
        this.A00 = c2275Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A04.AAg();
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
