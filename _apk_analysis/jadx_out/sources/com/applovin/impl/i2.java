package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class i2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.applovin.impl.sdk.k f8486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppLovinAdServiceImpl f8487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppLovinAd f8488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8489e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SoftReference f8490f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile String f8492h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile double f8494j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8485a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8491g = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f8493i = false;

    public class a implements AppLovinAdRewardListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().b("IncentivizedAdController", "Reward validation failed: " + i10);
            }
        }
    }

    public class b implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAdLoadListener f8496a;

        public b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f8496a = appLovinAdLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(int i10) {
            try {
                this.f8496a.failedToReceiveAd(i10);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th2);
                i2.this.f8486b.D().a("IncentivizedAdController", "adLoadFailed", th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(AppLovinAd appLovinAd) {
            try {
                this.f8496a.adReceived(appLovinAd);
            } catch (Throwable th2) {
                com.applovin.impl.sdk.o.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th2);
                i2.this.f8486b.D().a("IncentivizedAdController", com.safedk.android.analytics.brandsafety.creatives.discoveries.f.I, th2);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            i2.this.f8488d = appLovinAd;
            if (this.f8496a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ab
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7663b.a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i10) {
            if (this.f8496a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.za
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f11078b.a(i10);
                    }
                });
            }
        }
    }

    public class c implements l2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AppLovinAd f8498a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AppLovinAdDisplayListener f8499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AppLovinAdClickListener f8500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f8501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final AppLovinAdRewardListener f8502e;

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f8498a = appLovinAd;
            this.f8499b = appLovinAdDisplayListener;
            this.f8500c = appLovinAdClickListener;
            this.f8501d = appLovinAdVideoPlaybackListener;
            this.f8502e = appLovinAdRewardListener;
        }

        public /* synthetic */ c(i2 i2Var, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        private String a(com.applovin.impl.sdk.ad.b bVar, boolean z10) {
            if (StringUtils.isValidString(bVar.v())) {
                return bVar.v();
            }
            if (z10) {
                return "ad_display_failure";
            }
            return null;
        }

        private void a(com.applovin.impl.sdk.ad.b bVar, String str) {
            String str2;
            int i10;
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strB = i2.this.b();
            if (!StringUtils.isValidString(strB) || !i2.this.f8493i) {
                i2.this.f8486b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f8486b.O().b("IncentivizedAdController", "Invalid reward state - result: " + strB + " and wasFullyEngaged: " + i2.this.f8493i);
                }
                i2.this.f8486b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f8486b.O().a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                bVar.d();
                if (i2.this.f8493i) {
                    i2.this.f8486b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.f8486b.O().b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    i10 = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str2 = "network_timeout";
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    i2.this.f8486b.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        i2.this.f8486b.O().b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    str2 = str;
                    i10 = -600;
                }
                bVar.a(o4.a(str2));
                i2.this.f8486b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f8486b.O().a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                t2.a(this.f8502e, bVar, i10);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(i2.this.f8494j));
                CollectionUtils.putStringIfValid("source", str2, mapHashMap);
                i2.this.f8486b.g().a(d2.J, bVar, mapHashMap);
            }
            if (bVar.z0().getAndSet(true)) {
                return;
            }
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            i2.this.f8486b.q0().a((i5) new m6(bVar, i2.this.f8486b), d6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            t2.a(this.f8500c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            t2.a(this.f8499b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, false));
            } else {
                if (appLovinAdF == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdF;
                }
                i2.this.f8486b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    i2.this.f8486b.O().b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            i2.this.a(appLovinAdF);
            i2.this.f8486b.O();
            if (com.applovin.impl.sdk.o.a()) {
                i2.this.f8486b.O().a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            t2.b(this.f8499b, appLovinAd);
        }

        @Override // com.applovin.impl.l2
        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAdF = this.f8498a;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.c) {
                appLovinAdF = ((com.applovin.impl.sdk.ad.c) appLovinAdF).f();
            }
            boolean z10 = this.f8499b instanceof l2;
            if (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) {
                com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) appLovinAdF;
                a(bVar, a(bVar, StringUtils.isValidString(str)));
            } else {
                if (appLovinAdF == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAdF;
                }
                i2.this.f8486b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVarO = i2.this.f8486b.O();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Received `");
                    sb2.append(z10 ? "adDisplayFailed" : "adHidden");
                    sb2.append("` callback for ");
                    sb2.append(str2);
                    oVarO.b("IncentivizedAdController", sb2.toString());
                }
            }
            i2.this.a(appLovinAdF);
            if (z10) {
                t2.a(this.f8499b, str);
            } else {
                t2.b(this.f8499b, this.f8498a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            i2.this.a("quota_exceeded");
            t2.b(this.f8502e, appLovinAd, map);
            i2.this.f8486b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            i2.this.a("rejected");
            t2.a(this.f8502e, appLovinAd, map);
            i2.this.f8486b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            i2.this.a("accepted");
            t2.c(this.f8502e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i10) {
            i2.this.a("network_timeout");
            t2.a(this.f8502e, appLovinAd, i10);
            i2.this.f8486b.g().a(d2.I, (com.applovin.impl.sdk.ad.b) appLovinAd, CollectionUtils.hashMap("error_message", "network_timeout"));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            t2.a(this.f8501d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            AppLovinAd appLovinAdF = appLovinAd instanceof com.applovin.impl.sdk.ad.c ? ((com.applovin.impl.sdk.ad.c) appLovinAd).f() : appLovinAd;
            boolean z11 = true;
            boolean z12 = (appLovinAdF instanceof com.applovin.impl.sdk.ad.b) && ((com.applovin.impl.sdk.ad.b) appLovinAdF).G0();
            i2 i2Var = i2.this;
            if (z12) {
                d10 = 100.0d;
            }
            i2Var.f8494j = d10;
            i2 i2Var2 = i2.this;
            if (!z10 && !z12) {
                z11 = false;
            }
            i2Var2.f8493i = z11;
            t2.a(this.f8501d, appLovinAd, i2.this.f8494j, i2.this.f8493i);
        }
    }

    public i2(String str, AppLovinSdk appLovinSdk) {
        this.f8486b = appLovinSdk.a();
        this.f8487c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f8489e = str;
    }

    private AppLovinAdRewardListener a() {
        return new a();
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapA);
        this.f8486b.g().d(d2.C, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = n7.a(appLovinAdImpl, this.f8486b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f8486b.y0(), context);
        for (String str : this.f8485a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f8485a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapA = f2.a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapA);
        this.f8486b.g().d(d2.C, mapA);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdA = n7.a(appLovinAdImpl, this.f8486b);
        String strA = a(appLovinAdA, appLovinAdImpl);
        if (StringUtils.isValidString(strA)) {
            a(appLovinAdImpl, strA, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f8486b.y0(), context);
        for (String str : this.f8485a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f8485a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdA, viewGroup, lifecycle);
        a((com.applovin.impl.sdk.ad.b) appLovinAdA, cVar);
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f8486b.q0().a((i5) new t6(bVar, appLovinAdRewardListener, this.f8486b), d6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f8488d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof com.applovin.impl.sdk.ad.c)) {
            if (appLovinAd == appLovinAd2) {
                this.f8488d = null;
            }
        } else {
            com.applovin.impl.sdk.ad.c cVar = (com.applovin.impl.sdk.ad.c) appLovinAd2;
            if (cVar.f() == null || appLovinAd == cVar.f()) {
                this.f8488d = null;
            }
        }
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f8488d;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f8488d;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            com.applovin.impl.sdk.o.h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            e();
        }
    }

    private void a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, l2 l2Var) {
        t2.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        t2.a(l2Var, str);
        Map mapA = f2.a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapA);
        CollectionUtils.putStringIfValid("error_message", str, mapA);
        this.f8486b.g().d(d2.F, mapA);
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8487c.loadNextIncentivizedAd(this.f8489e, appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f8491g) {
            this.f8492h = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b() {
        String str;
        synchronized (this.f8491g) {
            str = this.f8492h;
        }
        return str;
    }

    private void e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f8490f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    public void a(String str, Object obj) {
        this.f8485a.put(str, obj);
    }

    public void b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = a();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? a() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f8486b.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8486b.O().a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f8490f = new SoftReference(appLovinAdLoadListener);
        if (!d()) {
            a(new b(appLovinAdLoadListener));
            return;
        }
        com.applovin.impl.sdk.o.h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f8488d);
        }
    }

    public String c() {
        return this.f8489e;
    }

    public boolean d() {
        return this.f8488d != null;
    }
}
