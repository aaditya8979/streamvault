package com.unity3d.ironsourceads.rewarded;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4093jc;
import com.ironsource.Cb;
import com.ironsource.Fb;
import com.ironsource.Sd;
import com.ironsource.V7;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes2.dex */
public final class RewardedAdLoader {

    @NotNull
    public static final RewardedAdLoader INSTANCE = new RewardedAdLoader();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Executor f53461a = V7.f30593a.c();

    private RewardedAdLoader() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Cb cb2) {
        p.k(cb2, "$loadTask");
        cb2.start();
    }

    public static final void loadAd(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull RewardedAdLoaderListener rewardedAdLoaderListener) {
        p.k(rewardedAdRequest, "adRequest");
        p.k(rewardedAdLoaderListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        IronLog.API.info("instanceId: " + rewardedAdRequest.getInstanceId());
        INSTANCE.internalLoadAd$mediationsdk_release(f53461a, new Sd(rewardedAdRequest, rewardedAdLoaderListener, C4093jc.f32072e.a(IronSource.a.REWARDED_VIDEO), null, 8, null));
    }

    public final void internalLoadAd$mediationsdk_release(@NotNull Executor executor, @NotNull Fb fb2) {
        p.k(executor, "executor");
        p.k(fb2, "loadTaskProvider");
        final Cb cbA = fb2.a();
        executor.execute(new Runnable() { // from class: ze.a
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdLoader.a(cbA);
            }
        });
    }
}
