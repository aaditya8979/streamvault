package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class Z1 extends Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f26678a;

    public Z1(BannerAdEventListener bannerAdEventListener) {
        tn.p.k(bannerAdEventListener, "adEventListener");
        this.f26678a = bannerAdEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(adMetaInfo, "info");
        this.f26678a.onAdFetchSuccessful(inMobiBanner, adMetaInfo);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(inMobiAdRequestStatus, "status");
        tn.p.j(Y1.class.getSimpleName(), "getSimpleName(...)");
        this.f26678a.onAdLoadFailed(inMobiBanner, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String str) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(str, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            tn.p.j(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f26678a, inMobiBanner, str);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map map) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(map, "params");
        this.f26678a.onAdClicked(inMobiBanner, map);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo adMetaInfo) {
        InMobiBanner inMobiBanner = (InMobiBanner) obj;
        tn.p.k(inMobiBanner, "ad");
        tn.p.k(adMetaInfo, "info");
        this.f26678a.onAdLoadSucceeded(inMobiBanner, adMetaInfo);
    }
}
