package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3556la;
import com.ironsource.C4157n2;
import com.ironsource.C4254sd;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3556la extends Dk {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f27553j = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C3506ja f27554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f27555i;

    public static final void a(C3556la c3556la) {
        C3605n9 c3605n9 = c3556la.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = c3556la.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
        }
    }

    public static final void a(C3556la c3556la, AdMetaInfo adMetaInfo) {
        C3605n9 c3605n9 = c3556la.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3556la.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(C3556la c3556la) {
        C3605n9 c3605n9 = c3556la.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3556la.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3506ja c3506ja = c3556la.f27554h;
        if (c3506ja != null) {
            c3506ja.b((byte) 4);
        }
    }

    public static final void b(C3556la c3556la, AdMetaInfo adMetaInfo) {
        C3605n9 c3605n9 = c3556la.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3556la.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    public static final void c(C3556la c3556la) {
        C3605n9 c3605n9 = c3556la.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = c3556la.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3605n9 c3605n92 = c3556la.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
        C3506ja c3506ja = c3556la.f27554h;
        if (c3506ja != null) {
            c3506ja.b((byte) 4);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void a() throws JSONException {
        this.f25336d.post(new Runnable() { // from class: n9.k9
            @Override // java.lang.Runnable
            public final void run() {
                C3556la.a(this.f75464b);
            }
        });
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.d("InterstitialUnifiedAdManager", "AdManager state - CREATED");
        }
        this.f25333a = (byte) 0;
        this.f25334b = null;
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null) {
            c3506ja.d();
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    public final void a(Activity activity) throws JSONException {
        Pj pj2;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", C4157n2.f33013v);
        }
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null && (pj2 = c3506ja.H) != null) {
            pj2.f26140b = true;
        }
        if (c3506ja != null) {
            c3506ja.Q();
        }
        if (h()) {
            if (!W6.a()) {
                if (this.f27554h != null) {
                    a(true, (short) 2141);
                    return;
                }
                return;
            }
            C3506ja c3506ja2 = this.f27554h;
            if (c3506ja2 == null || !c3506ja2.d((byte) 4)) {
                return;
            }
            this.f27555i = true;
            C3506ja c3506ja3 = this.f27554h;
            if (c3506ja3 != null) {
                c3506ja3.a(this, activity);
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void a(AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        super.a(adMetaInfo);
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null) {
            c3506ja.R();
        }
        this.f27555i = false;
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        tn.p.k(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null) {
            tn.p.k(watermarkData, "watermarkData");
            c3506ja.A = watermarkData;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciQ = c3506ja.q();
            if (gestureDetectorOnGestureListenerC3337ciQ != null) {
                gestureDetectorOnGestureListenerC3337ciQ.setWatermark(watermarkData);
            }
        }
    }

    public final void a(Jg jg2, Context context, boolean z10, String str) {
        C3506ja c3506ja;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI;
        C3506ja c3506ja2;
        String str2;
        String str3;
        tn.p.k(jg2, "pubSettings");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(str, "logType");
        if (this.f27554h == null) {
            tn.p.k(ImpressionLog.f51753w, "mAdType");
            String string = UUID.randomUUID().toString();
            tn.p.j(string, "toString(...)");
            long j10 = jg2.f25731a;
            String str4 = jg2.f25732b;
            Map map = jg2.f25733c;
            String str5 = jg2.f25737g;
            String str6 = jg2.f25735e;
            if (j10 == Long.MIN_VALUE) {
                throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
            }
            if (map == null || (str3 = (String) map.get("tp")) == null) {
                str2 = "";
                str3 = str2;
            } else {
                str2 = "";
            }
            C3795v0 c3795v0 = new C3795v0(j10, str3, ImpressionLog.f51753w, str5);
            c3795v0.f28304d = str4;
            c3795v0.f28303c = map;
            tn.p.k(str2, "<set-?>");
            c3795v0.f28308h = str2;
            tn.p.k(ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<set-?>");
            c3795v0.f28309i = ActivityChooserModel.ATTRIBUTE_ACTIVITY;
            c3795v0.f28307g = string;
            c3795v0.f28310j = false;
            c3795v0.f28311k = str6;
            this.f27554h = new C3506ja(context, c3795v0, this);
        }
        if (z10) {
            g();
        }
        String str7 = jg2.f25737g;
        if (str7 != null) {
            C3605n9 c3605n9 = this.f25338f;
            if (c3605n9 != null) {
                c3605n9.a();
            }
            C3605n9 c3605n9A = Jh.a(str, str7);
            this.f25338f = c3605n9A;
            if (c3605n9A != null) {
                c3605n9A.a("InterstitialUnifiedAdManager", "Ad Unit initialised");
            }
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null && (c3506ja2 = this.f27554h) != null) {
                tn.p.k(c3605n92, "logger");
                c3506ja2.f27513i = c3605n92;
                C3293b0 c3293b0 = c3506ja2.f27525u;
                c3293b0.getClass();
                tn.p.k(c3605n92, "logger");
                c3293b0.f26825f = c3605n92;
            }
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                c3605n93.a("InterstitialUnifiedAdManager", "adding interstitialAdUnit in referenceTracker");
            }
            C3506ja c3506ja3 = this.f27554h;
            tn.p.h(c3506ja3);
            Jh.a(c3506ja3, this.f25338f);
        }
        C3506ja c3506ja4 = this.f27554h;
        if (c3506ja4 != null) {
            c3506ja4.a(context);
        }
        C3506ja c3506ja5 = this.f27554h;
        if (c3506ja5 != null) {
            c3506ja5.a(jg2.f25733c);
        }
        C3506ja c3506ja6 = this.f27554h;
        if (c3506ja6 != null) {
            c3506ja6.K();
        }
        if (jg2.f25734d && (c3506ja = this.f27554h) != null && (gestureDetectorOnGestureListenerC3337ciI = c3506ja.i()) != null) {
            c3506ja.G = true;
            gestureDetectorOnGestureListenerC3337ciI.k();
        }
        WatermarkData watermarkData = this.f25339g;
        if (watermarkData != null) {
            C3506ja c3506ja7 = this.f27554h;
            if (c3506ja7 != null) {
                tn.p.k(watermarkData, "watermarkData");
                c3506ja7.A = watermarkData;
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciQ = c3506ja7.q();
                if (gestureDetectorOnGestureListenerC3337ciQ != null) {
                    gestureDetectorOnGestureListenerC3337ciQ.setWatermark(watermarkData);
                }
            }
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                c3605n94.c("InterstitialUnifiedAdManager", "setting up watermark");
            }
        }
    }

    public final void a(boolean z10, short s10) throws JSONException {
        C3506ja c3506ja;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.c("InterstitialUnifiedAdManager", "onShowFailure");
        }
        if (s10 != 0 && (c3506ja = this.f27554h) != null) {
            c3506ja.d(s10);
        }
        this.f25336d.post(new Runnable() { // from class: n9.l9
            @Override // java.lang.Runnable
            public final void run() {
                C3556la.c(this.f75483b);
            }
        });
        if (z10) {
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                c3605n92.d("InterstitialUnifiedAdManager", "AdManager state - FAILED");
            }
            this.f25333a = (byte) 6;
            C3506ja c3506ja2 = this.f27554h;
            if (c3506ja2 != null) {
                c3506ja2.d();
            }
        }
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null) {
            c3605n93.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void b() throws JSONException {
        this.f25336d.post(new Runnable() { // from class: n9.h9
            @Override // java.lang.Runnable
            public final void run() {
                C3556la.b(this.f75403b);
            }
        });
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.d("InterstitialUnifiedAdManager", "AdManager state - DISPLAY_FAILED");
        }
        this.f25333a = (byte) 6;
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null) {
            c3506ja.d();
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void b(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.c("InterstitialUnifiedAdManager", "onAdFetchSuccess");
        }
        this.f25337e = adMetaInfo;
        if (this.f27554h != null) {
            super.b(adMetaInfo);
            this.f25336d.post(new Runnable() { // from class: n9.j9
                @Override // java.lang.Runnable
                public final void run() {
                    C3556la.a(this.f75446b, adMetaInfo);
                }
            });
            return;
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.b("InterstitialUnifiedAdManager", "onAdFetchSuccess - adUnit is null - fail");
        }
        a((AbstractC3547l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        a((short) 2190);
    }

    public final void b(PublisherCallbacks publisherCallbacks) {
        C3506ja c3506ja;
        tn.p.k(publisherCallbacks, "callbacks");
        if (this.f25335c == null) {
            this.f25335c = publisherCallbacks;
        }
        if (tn.p.f(this.f25334b, Boolean.FALSE)) {
            C3506ja c3506ja2 = this.f27554h;
            if (c3506ja2 != null) {
                c3506ja2.b((short) 2006);
            }
            publisherCallbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3605n9 c3605n9 = this.f25338f;
            if (c3605n9 != null) {
                c3605n9.b("InMobi", "Cannot call load() API after calling load(byte[])");
            }
            Kb.a((byte) 1, "InMobi", "Cannot call load() API after calling load(byte[])");
            return;
        }
        if (this.f27555i) {
            C3506ja c3506ja3 = this.f27554h;
            if (c3506ja3 != null) {
                c3506ja3.b((short) 2004);
            }
            publisherCallbacks.onAdLoadFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                c3605n92.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            return;
        }
        this.f25334b = Boolean.TRUE;
        C3506ja c3506ja4 = this.f27554h;
        if (c3506ja4 == null || !a("InMobi", String.valueOf(c3506ja4.f27516l), publisherCallbacks) || (c3506ja = this.f27554h) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks2 = this.f25335c;
        if (c3506ja.d((publisherCallbacks2 == null || publisherCallbacks2.getType() != 1) ? (byte) 1 : (byte) 2)) {
            this.f25333a = (byte) 1;
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                C3506ja c3506ja5 = this.f27554h;
                c3605n93.c("InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3506ja5 != null ? c3506ja5.f27516l : null));
            }
            C3506ja c3506ja6 = this.f27554h;
            Kb.a((byte) 2, "InterstitialUnifiedAdManager", "Fetching an Interstitial ad for placement id: " + (c3506ja6 != null ? c3506ja6.f27516l : null));
            C3506ja c3506ja7 = this.f27554h;
            if (c3506ja7 != null) {
                c3506ja7.e(this);
            }
            C3506ja c3506ja8 = this.f27554h;
            if (c3506ja8 != null) {
                c3506ja8.C();
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void c(AdMetaInfo adMetaInfo) throws JSONException {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.c("InterstitialUnifiedAdManager", "onAdLoadSucceeded");
        }
        if (this.f27554h != null) {
            d(adMetaInfo);
            return;
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.b("InterstitialUnifiedAdManager", "adUnit is null");
        }
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        byte b10 = this.f25333a;
        if (b10 == 8 || b10 == 1) {
            b((AbstractC3547l1) null, inMobiAdRequestStatus);
            return;
        }
        if (b10 == 2) {
            Kb.a((byte) 1, "InMobi", "Unable to Show Ad, canShowAd Failed");
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                c3605n93.b("InMobi", "Unable to Show Ad, canShowAd Failed");
            }
            a(true, (short) 0);
            return;
        }
        if (b10 != 5) {
            Kb.a((byte) 1, "InMobi", "Invalid state passed in fireErrorScenarioCallback");
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                c3605n94.b("InMobi", "Invalid state passed in fireErrorScenarioCallback");
                return;
            }
            return;
        }
        Kb.a((byte) 1, "InMobi", "Ad will be dismissed, Internal error");
        C3605n9 c3605n95 = this.f25338f;
        if (c3605n95 != null) {
            c3605n95.b("InMobi", "Ad will be dismissed, Internal error");
        }
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null) {
            c3506ja.b((byte) 4);
        }
        a();
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void d() throws JSONException {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "showTimeOut");
        }
        C3506ja c3506ja = this.f27554h;
        if (c3506ja != null) {
            byte b10 = c3506ja.f27506b;
            if (b10 == 6 || b10 == 7) {
                c3506ja.f(this);
            } else {
                a(true, (short) 2159);
            }
        }
    }

    public final void d(final AdMetaInfo adMetaInfo) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.c("InterstitialUnifiedAdManager", C4254sd.f33528f);
        }
        super.c(adMetaInfo);
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.d("InterstitialUnifiedAdManager", "AdManager state - LOADED");
        }
        this.f25333a = (byte) 2;
        this.f25336d.post(new Runnable() { // from class: n9.i9
            @Override // java.lang.Runnable
            public final void run() {
                C3556la.b(this.f75430b, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3547l1 f() {
        return this.f27554h;
    }

    public final boolean h() throws JSONException {
        byte b10 = this.f25333a;
        if (b10 == 1) {
            C3605n9 c3605n9 = this.f25338f;
            if (c3605n9 != null) {
                c3605n9.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            a(false, (short) 2147);
            return false;
        }
        if (b10 == 7) {
            Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                c3605n92.b("InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            }
            a(false, (short) 2168);
            return false;
        }
        if (b10 != 5) {
            if (!this.f27555i) {
                return true;
            }
            C3506ja c3506ja = this.f27554h;
            if (c3506ja != null) {
                c3506ja.d((short) 2149);
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                c3605n93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            return false;
        }
        C3506ja c3506ja2 = this.f27554h;
        if (c3506ja2 != null) {
            Kb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + c3506ja2.f27516l);
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                C3506ja c3506ja3 = this.f27554h;
                c3605n94.b("InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + (c3506ja3 != null ? c3506ja3.f27516l : null));
            }
            a(false, (short) 2148);
        }
        return false;
    }

    public final void i() throws JSONException {
        C3506ja c3506ja;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.a("InterstitialUnifiedAdManager", "render");
        }
        C3506ja c3506ja2 = this.f27554h;
        if (c3506ja2 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (c3506ja2.f27506b == 4 && this.f25337e != null) {
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                c3605n92.c("InterstitialUnifiedAdManager", "already in ready state");
            }
            AdMetaInfo adMetaInfo = this.f25337e;
            tn.p.h(adMetaInfo);
            d(adMetaInfo);
            return;
        }
        if (this.f27555i) {
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                c3605n93.b("InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            }
            Kb.a((byte) 1, "InMobi", "Ad show is already called. Please wait for the the ad to be shown.");
            b(this.f27554h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3506ja c3506ja3 = this.f27554h;
            if (c3506ja3 != null) {
                c3506ja3.c((short) 2128);
                return;
            }
            return;
        }
        com.inmobi.media.ads.network.common.model.Ad adB = c3506ja2.b(0);
        C3506ja c3506ja4 = this.f27554h;
        boolean zA = a("InMobi", String.valueOf(c3506ja4 != null ? c3506ja4.f27516l : null));
        if (adB == null) {
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                c3605n94.b("InterstitialUnifiedAdManager", "ad is null. failure");
            }
            b(this.f27554h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3506ja c3506ja5 = this.f27554h;
            if (c3506ja5 != null) {
                c3506ja5.b((short) 2166);
            }
        }
        if (this.f25337e == null) {
            C3605n9 c3605n95 = this.f25338f;
            if (c3605n95 != null) {
                c3605n95.b("InterstitialUnifiedAdManager", "ad meta info is null. failure");
            }
            b(this.f27554h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            C3506ja c3506ja6 = this.f27554h;
            if (c3506ja6 != null) {
                c3506ja6.b((short) 2167);
            }
        }
        if (adB == null || !zA) {
            return;
        }
        PublisherCallbacks publisherCallbacks = this.f25335c;
        if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3506ja = this.f27554h) != null) {
            c3506ja.d((byte) 1);
        }
        C3605n9 c3605n96 = this.f25338f;
        if (c3605n96 != null) {
            c3605n96.d("InterstitialUnifiedAdManager", "AdManager state - LOADING_INTO_VIEW");
        }
        this.f25333a = (byte) 8;
        C3506ja c3506ja7 = this.f27554h;
        if (c3506ja7 != null) {
            c3506ja7.X();
        }
    }
}
