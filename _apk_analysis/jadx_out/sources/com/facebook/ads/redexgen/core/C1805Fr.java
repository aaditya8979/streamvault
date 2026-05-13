package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1805Fr extends AbstractRunnableC2216Vt {
    public final /* synthetic */ InterfaceC2479cW A00;
    public final /* synthetic */ C2480cX A01;

    public C1805Fr(C2480cX c2480cX, InterfaceC2479cW interfaceC2479cW) {
        this.A01 = c2480cX;
        this.A00 = interfaceC2479cW;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2216Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C1806Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
