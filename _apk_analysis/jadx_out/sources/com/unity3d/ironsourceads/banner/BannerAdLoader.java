package com.unity3d.ironsourceads.banner;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4013f3;
import com.ironsource.C4093jc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerAdLoader {

    @NotNull
    public static final BannerAdLoader INSTANCE = new BannerAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f53414a = V7.f30593a.c();

    private BannerAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb cb2) {
        p.k(cb2, "$loadTask");
        cb2.start();
    }

    public static final void loadAd(@NotNull BannerAdRequest bannerAdRequest, @NotNull BannerAdLoaderListener bannerAdLoaderListener) {
        p.k(bannerAdRequest, "adRequest");
        p.k(bannerAdLoaderListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("instanceId: " + bannerAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f53414a, new C4013f3(bannerAdRequest, bannerAdLoaderListener, C4093jc.f32072e.a(IronSource.a.BANNER), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Fb fb2) {
        p.k(executor, "executor");
        p.k(fb2, "loadTaskProvider");
        final Cb cbA = fb2.a();
        executor.execute(new Runnable() { // from class: xe.a
            @Override // java.lang.Runnable
            public final void run() {
                BannerAdLoader.a(cbA);
            }
        });
    }
}
