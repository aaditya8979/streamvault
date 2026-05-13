package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Sd implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f30419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RewardedAdLoaderListener f30420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3993e1 f30421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4192p1 f30422d;

    public Sd(@NotNull RewardedAdRequest rewardedAdRequest, @NotNull RewardedAdLoaderListener rewardedAdLoaderListener, @NotNull InterfaceC3993e1 interfaceC3993e1, @NotNull InterfaceC4192p1 interfaceC4192p1) {
        tn.p.k(rewardedAdRequest, "adRequest");
        tn.p.k(rewardedAdLoaderListener, "publisherListener");
        tn.p.k(interfaceC3993e1, "adapterConfigProvider");
        tn.p.k(interfaceC4192p1, "analyticsFactory");
        this.f30419a = rewardedAdRequest;
        this.f30420b = rewardedAdLoaderListener;
        this.f30421c = interfaceC3993e1;
        this.f30422d = interfaceC4192p1;
    }

    public /* synthetic */ Sd(RewardedAdRequest rewardedAdRequest, RewardedAdLoaderListener rewardedAdLoaderListener, InterfaceC3993e1 interfaceC3993e1, InterfaceC4192p1 interfaceC4192p1, int i10, tn.i iVar) {
        this(rewardedAdRequest, rewardedAdLoaderListener, interfaceC3993e1, (i10 & 8) != 0 ? new C4174o1(IronSource.a.REWARDED_VIDEO) : interfaceC4192p1);
    }

    @Override // com.ironsource.Fb
    @NotNull
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorD;
        String instanceId = this.f30419a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.REWARDED_VIDEO;
        tn.p.j(sDKVersion, "getSDKVersion()");
        InterfaceC4209q1 interfaceC4209q1A = this.f30422d.a(new C4100k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f30419a.getAdm(), this.f30419a.getProviderName$mediationsdk_release(), this.f30421c, C4093jc.f32072e.a().c().get()).a();
            new Qd(dbA).a();
            C4304vc c4304vc = new C4304vc();
            C4119l2 c4119l2 = new C4119l2(this.f30419a.getAdm(), this.f30419a.getProviderName$mediationsdk_release());
            RewardedAdRequest rewardedAdRequest = this.f30419a;
            tn.p.h(dbA);
            V7 v72 = V7.f30593a;
            return new Pd(rewardedAdRequest, dbA, new Rd(v72, this.f30420b), c4119l2, c4304vc, interfaceC4209q1A, new Kd(interfaceC4209q1A, v72.c()), null, null, 384, null);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            if (e10 instanceof C4205pe) {
                ironSourceErrorD = ((C4205pe) e10).a();
            } else {
                C4365z5 c4365z5 = C4365z5.f34494a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorD = c4365z5.d(message);
            }
            return new B5(this.f30419a, new Rd(V7.f30593a, this.f30420b), interfaceC4209q1A, ironSourceErrorD);
        }
    }
}
