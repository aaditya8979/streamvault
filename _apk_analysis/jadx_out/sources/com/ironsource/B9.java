package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class B9 implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f28849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterstitialAdLoaderListener f28850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3993e1 f28851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4192p1 f28852d;

    public B9(@NotNull InterstitialAdRequest interstitialAdRequest, @NotNull InterstitialAdLoaderListener interstitialAdLoaderListener, @NotNull InterfaceC3993e1 interfaceC3993e1, @NotNull InterfaceC4192p1 interfaceC4192p1) {
        tn.p.k(interstitialAdRequest, "adRequest");
        tn.p.k(interstitialAdLoaderListener, "publisherListener");
        tn.p.k(interfaceC3993e1, "adapterConfigProvider");
        tn.p.k(interfaceC4192p1, "analyticsFactory");
        this.f28849a = interstitialAdRequest;
        this.f28850b = interstitialAdLoaderListener;
        this.f28851c = interfaceC3993e1;
        this.f28852d = interfaceC4192p1;
    }

    public /* synthetic */ B9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC3993e1 interfaceC3993e1, InterfaceC4192p1 interfaceC4192p1, int i10, tn.i iVar) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC3993e1, (i10 & 8) != 0 ? new C4174o1(IronSource.a.INTERSTITIAL) : interfaceC4192p1);
    }

    @Override // com.ironsource.Fb
    @NotNull
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorB;
        String instanceId = this.f28849a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.INTERSTITIAL;
        tn.p.j(sDKVersion, "getSDKVersion()");
        InterfaceC4209q1 interfaceC4209q1A = this.f28852d.a(new C4100k1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f28849a.getAdm(), this.f28849a.getProviderName$mediationsdk_release(), this.f28851c, C4093jc.f32072e.a().c().get()).a();
            new C4369z9(dbA).a();
            C4304vc c4304vc = new C4304vc();
            C4119l2 c4119l2 = new C4119l2(this.f28849a.getAdm(), this.f28849a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f28849a;
            tn.p.h(dbA);
            V7 v72 = V7.f30593a;
            return new C4352y9(interstitialAdRequest, dbA, new A9(v72, this.f28850b), c4119l2, c4304vc, interfaceC4209q1A, new C4284u9(interfaceC4209q1A, v72.c()), null, null, 384, null);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            if (e10 instanceof C4205pe) {
                ironSourceErrorB = ((C4205pe) e10).a();
            } else {
                C4365z5 c4365z5 = C4365z5.f34494a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c4365z5.b(message);
            }
            return new A5(this.f28849a, new A9(V7.f30593a, this.f28850b), interfaceC4209q1A, ironSourceErrorB);
        }
    }
}
