package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3995e3 implements U<BannerAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Tf f31521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAdLoaderListener f31522b;

    public C3995e3(@NotNull Tf tf2, @NotNull BannerAdLoaderListener bannerAdLoaderListener) {
        tn.p.k(tf2, "threadManager");
        tn.p.k(bannerAdLoaderListener, "publisherListener");
        this.f31521a = tf2;
        this.f31522b = bannerAdLoaderListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError ironSourceError, C3995e3 c3995e3) {
        tn.p.k(ironSourceError, "$error");
        tn.p.k(c3995e3, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + ironSourceError);
        c3995e3.f31522b.onBannerAdLoadFailed(ironSourceError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView bannerAdView, C3995e3 c3995e3) {
        tn.p.k(bannerAdView, "$adObject");
        tn.p.k(c3995e3, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + bannerAdView.getAdInfo());
        c3995e3.f31522b.onBannerAdLoaded(bannerAdView);
    }

    @Override // com.ironsource.U
    public void a(@NotNull final BannerAdView bannerAdView) {
        tn.p.k(bannerAdView, "adObject");
        this.f31521a.a(new Runnable() { // from class: com.ironsource.vk
            @Override // java.lang.Runnable
            public final void run() {
                C3995e3.a(bannerAdView, this);
            }
        });
    }

    @Override // com.ironsource.U
    public void b(@NotNull final IronSourceError ironSourceError) {
        tn.p.k(ironSourceError, "error");
        this.f31521a.a(new Runnable() { // from class: com.ironsource.wk
            @Override // java.lang.Runnable
            public final void run() {
                C3995e3.a(ironSourceError, this);
            }
        });
    }
}
