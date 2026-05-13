package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4013f3 implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final BannerAdRequest f31658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAdLoaderListener f31659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3993e1 f31660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4192p1 f31661d;

    public C4013f3(@NotNull BannerAdRequest bannerAdRequest, @NotNull BannerAdLoaderListener bannerAdLoaderListener, @NotNull InterfaceC3993e1 interfaceC3993e1, @NotNull InterfaceC4192p1 interfaceC4192p1) {
        tn.p.k(bannerAdRequest, "adRequest");
        tn.p.k(bannerAdLoaderListener, "publisherListener");
        tn.p.k(interfaceC3993e1, "adapterConfigProvider");
        tn.p.k(interfaceC4192p1, "analyticsFactory");
        this.f31658a = bannerAdRequest;
        this.f31659b = bannerAdLoaderListener;
        this.f31660c = interfaceC3993e1;
        this.f31661d = interfaceC4192p1;
    }

    public /* synthetic */ C4013f3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC3993e1 interfaceC3993e1, InterfaceC4192p1 interfaceC4192p1, int i10, tn.i iVar) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC3993e1, (i10 & 8) != 0 ? new C4174o1(IronSource.a.BANNER) : interfaceC4192p1);
    }

    @Override // com.ironsource.Fb
    @NotNull
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorA;
        String instanceId = this.f31658a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        tn.p.j(sDKVersion, "getSDKVersion()");
        InterfaceC4209q1 interfaceC4209q1A = this.f31661d.a(new C4100k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f31658a.getAdm(), this.f31658a.getProviderName$mediationsdk_release(), this.f31660c, C4093jc.f32072e.a().c().get()).a();
            new C3977d3(dbA, this.f31658a.getSize()).a();
            C4304vc c4304vc = new C4304vc();
            C4119l2 c4119l2 = new C4119l2(this.f31658a.getAdm(), this.f31658a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f31658a;
            AdSize size = bannerAdRequest.getSize();
            tn.p.h(dbA);
            V7 v72 = V7.f30593a;
            return new C3959c3(bannerAdRequest, size, c4119l2, dbA, c4304vc, interfaceC4209q1A, new C3995e3(v72, this.f31659b), new E2(interfaceC4209q1A, v72.c()), null, null, 768, null);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            if (e10 instanceof C4205pe) {
                ironSourceErrorA = ((C4205pe) e10).a();
            } else {
                C4365z5 c4365z5 = C4365z5.f34494a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c4365z5.a(message);
            }
            return new C4348y5(ironSourceErrorA, new C3995e3(V7.f30593a, this.f31659b), interfaceC4209q1A);
        }
    }
}
