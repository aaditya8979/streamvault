package com.facebook.ads.redexgen.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC2316Zr implements View.OnClickListener {
    public float A00;
    public float A01;
    public View.OnClickListener A02;

    public ViewOnClickListenerC2316Zr(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
    }

    public final void A00(float f10, float f11) {
        this.A00 = f10;
        this.A01 = f11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC2208Vl.A02(this)) {
            return;
        }
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            int iAbs = Math.abs(width - height) / 2;
            if (width == height || ((width > height && this.A00 >= iAbs && this.A00 <= width - iAbs) || (height > width && this.A01 >= iAbs && this.A01 <= height - iAbs))) {
                this.A02.onClick(view);
            }
        } catch (Throwable th2) {
            AbstractC2208Vl.A00(th2, this);
        }
    }
}
