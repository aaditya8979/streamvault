package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3482ia extends AbstractC3457ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f27343a;

    public C3482ia(InterstitialAdEventListener interstitialAdEventListener) {
        tn.p.k(interstitialAdEventListener, "adEventListener");
        this.f27343a = interstitialAdEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(adMetaInfo, "info");
        this.f27343a.onAdFetchSuccessful(inMobiInterstitial, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(inMobiAdRequestStatus, "status");
        this.f27343a.onAdLoadFailed(inMobiInterstitial, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String str) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(str, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            tn.p.j(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f27343a, inMobiInterstitial, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map map) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(map, "params");
        this.f27343a.onAdClicked(inMobiInterstitial, map);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiInterstitial inMobiInterstitial = (InMobiInterstitial) obj;
        tn.p.k(inMobiInterstitial, "ad");
        tn.p.k(adMetaInfo, "info");
        this.f27343a.onAdLoadSucceeded(inMobiInterstitial, adMetaInfo);
    }
}
