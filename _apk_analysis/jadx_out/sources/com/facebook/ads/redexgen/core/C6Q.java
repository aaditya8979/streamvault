package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6Q extends C2672fg {
    public InterfaceC2530dM A00;

    public final void A06(NativeAdLayout nativeAdLayout, C2529dL c2529dL, NativeAd nativeAd, C2189Ur c2189Ur) {
        C2343aK c2343aK = new C2343aK(c2529dL);
        MediaView mediaView = new MediaView(c2529dL);
        AdOptionsView adOptionsView = new AdOptionsView(c2529dL, nativeAd, nativeAdLayout);
        c2189Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c2529dL, nativeAd, c2189Ur, C2072Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c2343aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c2189Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c2343aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
