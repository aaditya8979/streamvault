package com.unity3d.ironsourceads.interstitial;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C4318w9;
import com.ironsource.InterfaceC4335x9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class InterstitialAd implements InterfaceC4335x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4318w9 f53444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private InterstitialAdListener f53445b;

    public InterstitialAd(@NotNull C4318w9 c4318w9) {
        p.k(c4318w9, "interstitialAdInternal");
        this.f53444a = c4318w9;
        c4318w9.a(this);
    }

    @NotNull
    public final InterstitialAdInfo getAdInfo() {
        return this.f53444a.b();
    }

    @Nullable
    public final InterstitialAdListener getListener() {
        return this.f53445b;
    }

    public final boolean isReadyToShow() {
        IronLog.API.info();
        return this.f53444a.d();
    }

    @Override // com.ironsource.InterfaceC4335x9
    public void onAdInstanceDidBecomeVisible() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f53445b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC4335x9
    public void onAdInstanceDidClick() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdClicked adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f53445b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC4335x9
    public void onAdInstanceDidDismiss() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdDismissed adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f53445b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC4335x9
    public void onAdInstanceDidFailedToShow(@NotNull IronSourceError ironSourceError) {
        p.k(ironSourceError, "error");
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdFailedToShow error : " + ironSourceError + " adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f53445b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdFailedToShow(this, ironSourceError);
        }
    }

    @Override // com.ironsource.InterfaceC4335x9
    public void onAdInstanceDidReward(@Nullable String str, int i10) {
    }

    @Override // com.ironsource.InterfaceC4335x9
    public void onAdInstanceDidShow() {
        IronLog.CALLBACK.info("InterstitialAdListener onInterstitialAdShown adInfo: " + getAdInfo());
        InterstitialAdListener interstitialAdListener = this.f53445b;
        if (interstitialAdListener != null) {
            interstitialAdListener.onInterstitialAdShown(this);
        }
    }

    public final void setListener(@Nullable InterstitialAdListener interstitialAdListener) {
        this.f53445b = interstitialAdListener;
    }

    public final void show(@NotNull Activity activity) {
        p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info();
        this.f53444a.a(activity);
    }
}
