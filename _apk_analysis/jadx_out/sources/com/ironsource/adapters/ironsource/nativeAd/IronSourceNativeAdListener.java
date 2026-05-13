package com.ironsource.adapters.ironsource.nativeAd;

import com.ironsource.G8;
import com.ironsource.I8;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class IronSourceNativeAdListener implements I8.a {

    @NotNull
    private final IronSourceNativeAdViewBinder binder;

    @NotNull
    private final NativeAdSmashListener smashListener;

    public IronSourceNativeAdListener(@NotNull IronSourceNativeAdViewBinder ironSourceNativeAdViewBinder, @NotNull NativeAdSmashListener nativeAdSmashListener) {
        p.k(ironSourceNativeAdViewBinder, "binder");
        p.k(nativeAdSmashListener, "smashListener");
        this.binder = ironSourceNativeAdViewBinder;
        this.smashListener = nativeAdSmashListener;
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdClicked() {
        this.smashListener.onNativeAdClicked();
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdLoadFailed(@NotNull String str) {
        p.k(str, "reason");
        this.smashListener.onNativeAdLoadFailed(new IronSourceError(510, "Load failed - " + str));
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdLoadSuccess(@NotNull G8 g82) {
        p.k(g82, "adData");
        this.smashListener.onNativeAdLoaded(new IronSourceNativeAdData(g82), this.binder);
    }

    @Override // com.ironsource.I8.a
    public void onNativeAdShown() {
        this.smashListener.onNativeAdShown();
    }
}
