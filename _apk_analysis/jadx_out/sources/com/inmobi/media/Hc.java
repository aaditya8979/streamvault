package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.ads.listeners.VideoEventListener;
import com.inmobi.media.Hc;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class Hc extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rg f25601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3332cd f25602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f25603c;

    public Hc(InMobiNative inMobiNative, Rg rg2, C3332cd c3332cd) {
        tn.p.k(inMobiNative, "inMobiNative");
        tn.p.k(rg2, "publisherListenersModel");
        tn.p.k(c3332cd, "nativeFlowManagerNotifier");
        this.f25601a = rg2;
        this.f25602b = c3332cd;
        this.f25603c = new WeakReference(inMobiNative);
    }

    public static final bn.r a(Hc hc2, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        Ac ac2 = hc2.f25602b.f26926a.f27033d.f25528b;
        ac2.getClass();
        InterfaceC3338cj interfaceC3338cj = ac2.f25156c;
        O6 o62 = interfaceC3338cj instanceof O6 ? (O6) interfaceC3338cj : null;
        if (o62 != null) {
            InterfaceC3580m9 interfaceC3580m9L = o62.l();
            if (interfaceC3580m9L != null) {
                ((C3605n9) interfaceC3580m9L).a("AUM-FetchedState", "Inflate Called");
            }
            Yc yc2 = (Yc) o62;
            InterfaceC3580m9 interfaceC3580m9L2 = yc2.l();
            if (interfaceC3580m9L2 != null) {
                ((C3605n9) interfaceC3580m9L2).a("AUM-NativeFetchedState", "transitionToLoadingState Called - starting ad inflation");
            }
            yc2.f26641j.a(new Cd(yc2.f26637f, yc2.f26638g, yc2.f26639h, yc2.f26640i, yc2.f26641j), yc2);
        }
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFetchSuccessful(inMobiNative, adMetaInfo);
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(Hc hc2, InMobiAdRequestStatus inMobiAdRequestStatus, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadFailed(inMobiNative, inMobiAdRequestStatus);
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdClicked(inMobiNative);
        }
        InMobiNative.LockScreenListener lockScreenListener = hc2.f25601a.f26261c;
        if (lockScreenListener != null) {
            lockScreenListener.onActionRequired(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(Hc hc2, C3307be c3307be, AdMetaInfo adMetaInfo, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        C3332cd c3332cd = hc2.f25602b;
        c3332cd.getClass();
        tn.p.k(c3307be, "pubData");
        c3332cd.f26926a.f27034e = c3307be;
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdLoadSucceeded(inMobiNative, adMetaInfo);
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(Hc hc2, C3442gk c3442gk, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdImpression(inMobiNative);
        }
        if (c3442gk != null) {
            c3442gk.c();
        }
        return bn.r.f5635a;
    }

    public static final bn.r a(boolean z10, Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f25601a.f26260b;
        if (videoEventListener != null) {
            videoEventListener.onAudioStateChanged(inMobiNative, z10);
        }
        return bn.r.f5635a;
    }

    public static final bn.r b(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDismissed(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r c(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onAdFullScreenDisplayed(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r d(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        NativeAdEventListener nativeAdEventListener = hc2.f25601a.f26259a;
        if (nativeAdEventListener != null) {
            nativeAdEventListener.onUserWillLeaveApplication(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r e(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f25601a.f26260b;
        if (videoEventListener != null) {
            videoEventListener.onVideoCompleted(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r f(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f25601a.f26260b;
        if (videoEventListener != null) {
            videoEventListener.onVideoPaused(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r g(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f25601a.f26260b;
        if (videoEventListener != null) {
            videoEventListener.onVideoResumed(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public static final bn.r h(Hc hc2, InMobiNative inMobiNative) {
        tn.p.k(inMobiNative, "inMobiNative");
        VideoEventListener videoEventListener = hc2.f25601a.f26260b;
        if (videoEventListener != null) {
            videoEventListener.onVideoStarted(inMobiNative);
        }
        return bn.r.f5635a;
    }

    public final void a(final C3307be c3307be, final AdMetaInfo adMetaInfo) {
        tn.p.k(c3307be, "pubData");
        tn.p.k(adMetaInfo, "info");
        a(new sn.l() { // from class: n9.i1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f75418b, c3307be, adMetaInfo, (InMobiNative) obj);
            }
        });
    }

    public final void a(sn.l lVar) {
        InMobiNative inMobiNative = (InMobiNative) this.f25603c.get();
        if (inMobiNative == null) {
            Kb.a((byte) 1, "NativeCallbacks", "Lost reference to InMobiNative! callback cannot be given");
        } else {
            lVar.invoke(inMobiNative);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final byte getType() {
        return (byte) 0;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdClicked(Map map) {
        tn.p.k(map, "params");
        a(new sn.l() { // from class: n9.j1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f75439b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDismissed() {
        a(new sn.l() { // from class: n9.e1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.b(this.f75347b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdDisplayed(AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        a(new sn.l() { // from class: n9.h1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.c(this.f75396b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        onAdLoadFailed(inMobiAdRequestStatus);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdFetchSuccessful(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        a(new sn.l() { // from class: n9.k1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f75454b, adMetaInfo, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdImpression(final C3442gk c3442gk) {
        a(new sn.l() { // from class: n9.l1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f75474b, c3442gk, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAdLoadFailed(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        a(new sn.l() { // from class: n9.d1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.a(this.f75327b, inMobiAdRequestStatus, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onAudioStateChanged(final boolean z10) {
        a(new sn.l() { // from class: n9.g1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.a(z10, this, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onUserLeftApplication() {
        a(new sn.l() { // from class: n9.c1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.d(this.f75311b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoCompleted() {
        a(new sn.l() { // from class: n9.a1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.e(this.f75280b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoPaused() {
        a(new sn.l() { // from class: n9.b1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.f(this.f75294b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoResumed() {
        a(new sn.l() { // from class: n9.f1
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.g(this.f75362b, (InMobiNative) obj);
            }
        });
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public final void onVideoStarted() {
        a(new sn.l() { // from class: n9.z0
            @Override // sn.l
            public final Object invoke(Object obj) {
                return Hc.h(this.f75716b, (InMobiNative) obj);
            }
        });
    }
}
