package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class A9 implements U<InterstitialAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Tf f28732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterstitialAdLoaderListener f28733b;

    public A9(@NotNull Tf tf2, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener) {
        tn.p.k(tf2, "threadManager");
        tn.p.k(interstitialAdLoaderListener, "publisherListener");
        this.f28732a = tf2;
        this.f28733b = interstitialAdLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, A9 a92) {
        tn.p.k(ironSourceError, "$error");
        tn.p.k(a92, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + ironSourceError);
        a92.f28733b.onInterstitialAdLoadFailed(ironSourceError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(InterstitialAd interstitialAd, A9 a92) {
        tn.p.k(interstitialAd, "$adObject");
        tn.p.k(a92, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + interstitialAd.getAdInfo());
        a92.f28733b.onInterstitialAdLoaded(interstitialAd);
    }

    @Override // com.ironsource.U
    public void a(@NotNull final InterstitialAd interstitialAd) {
        tn.p.k(interstitialAd, "adObject");
        this.f28732a.a(new Runnable() { // from class: com.ironsource.hh
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(interstitialAd, this);
            }
        });
    }

    @Override // com.ironsource.U
    public void b(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        this.f28732a.a(new Runnable() { // from class: com.ironsource.ih
            @Override // java.lang.Runnable
            public final void run() {
                A9.a(ironSourceError, this);
            }
        });
    }
}
