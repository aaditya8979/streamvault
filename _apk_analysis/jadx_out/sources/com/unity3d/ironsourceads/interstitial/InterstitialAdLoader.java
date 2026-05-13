package com.unity3d.ironsourceads.interstitial;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.B9;
import com.ironsource.C4093jc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdLoader {

    @NotNull
    public static final InterstitialAdLoader INSTANCE = new InterstitialAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f53448a = V7.f30593a.c();

    private InterstitialAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb cb2) {
        p.k(cb2, "$loadTask");
        cb2.start();
    }

    public static final void loadAd(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener) {
        p.k(interstitialAdRequest, "adRequest");
        p.k(interstitialAdLoaderListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("instanceId: " + interstitialAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f53448a, new B9(interstitialAdRequest, interstitialAdLoaderListener, C4093jc.f32072e.a(IronSource.a.INTERSTITIAL), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Fb fb2) {
        p.k(executor, "executor");
        p.k(fb2, "loadTaskProvider");
        final Cb cbA = fb2.a();
        executor.execute(new Runnable() { // from class: ye.a
            @Override // java.lang.Runnable
            public final void run() {
                InterstitialAdLoader.a(cbA);
            }
        });
    }
}
