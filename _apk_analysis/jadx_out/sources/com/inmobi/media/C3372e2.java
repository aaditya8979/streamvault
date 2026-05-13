package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3372e2;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3372e2 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f27078h = "InMobi";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f27079i = C3372e2.class.getSimpleName();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C3269a2 f27080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C3269a2 f27081k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C3269a2 f27082l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3269a2 f27083m;

    public static final void a(C3372e2 c3372e2, int i10) throws JSONException {
        C3269a2 c3269a2 = c3372e2.f27082l;
        if (c3269a2 != null) {
            c3269a2.a(i10, false);
        }
    }

    public static final void a(C3372e2 c3372e2, AdMetaInfo adMetaInfo) {
        C3605n9 c3605n9 = c3372e2.f25338f;
        if (c3605n9 != null) {
            String str = c3372e2.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "callback - onAdFetchSuccessful");
        }
        PublisherCallbacks publisherCallbacks = c3372e2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
            return;
        }
        C3605n9 c3605n92 = c3372e2.f25338f;
        if (c3605n92 != null) {
            String str2 = c3372e2.f27079i;
            tn.p.j(str2, "TAG");
            c3605n92.b(str2, "callback null");
        }
    }

    public static final void b(C3372e2 c3372e2, AdMetaInfo adMetaInfo) {
        C3605n9 c3605n9 = c3372e2.f25338f;
        if (c3605n9 != null) {
            String str = c3372e2.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "callback - onAdLoadSucceeded");
        }
        PublisherCallbacks publisherCallbacks = c3372e2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        } else {
            c3372e2.b((short) 2184);
        }
    }

    public final int a(int i10, int i11) {
        AdConfig adConfig;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "getRefreshInterval " + this);
        }
        C3269a2 c3269a2 = this.f27083m;
        return (c3269a2 == null || (adConfig = c3269a2.f27507c) == null) ? i11 : i10 < adConfig.getMinimumRefreshInterval() ? adConfig.getMinimumRefreshInterval() : i10;
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void a() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onAdDismissed " + this);
        }
        this.f25333a = (byte) 0;
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = this.f27079i;
            tn.p.j(str2, "TAG");
            c3605n92.d(str2, "AdManager state - CREATED");
        }
        super.a();
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void a(int i10, final int i11, GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        ViewParent parent;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onShowNextPodAd " + this);
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = this.f27079i;
            tn.p.j(str2, "TAG");
            c3605n92.a(str2, "on Show next pod ad index: " + i10);
        }
        if (gestureDetectorOnGestureListenerC3337ci != null) {
            try {
                parent = gestureDetectorOnGestureListenerC3337ci.getParent();
            } catch (Exception unused) {
                C3269a2 c3269a2 = this.f27082l;
                if (c3269a2 != null) {
                    c3269a2.e(i11);
                }
                C3269a2 c3269a22 = this.f27082l;
                if (c3269a22 != null) {
                    c3269a22.b(i11, false);
                    return;
                }
                return;
            }
        } else {
            parent = null;
        }
        InMobiBanner inMobiBanner = parent instanceof InMobiBanner ? (InMobiBanner) parent : null;
        if (inMobiBanner != null) {
            C3269a2 c3269a23 = this.f27082l;
            if (c3269a23 != null) {
                c3269a23.b(i11, true);
            }
            b(inMobiBanner);
            this.f25336d.post(new Runnable() { // from class: n9.s6
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    C3372e2.a(this.f75611b, i11);
                }
            });
            return;
        }
        C3269a2 c3269a24 = this.f27082l;
        if (c3269a24 != null) {
            c3269a24.e(i11);
        }
        C3269a2 c3269a25 = this.f27082l;
        if (c3269a25 != null) {
            c3269a25.b(i11, false);
        }
    }

    public final void a(Context context, Jg jg2, String str) {
        String str2;
        String str3;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(jg2, "pubSettings");
        tn.p.k(str, C3978d4.i.O);
        tn.p.k("banner", "logType");
        tn.p.j(this.f27079i, "TAG");
        tn.p.k("banner", "mAdType");
        String string = UUID.randomUUID().toString();
        tn.p.j(string, "toString(...)");
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        String str4 = context instanceof Activity ? ActivityChooserModel.ATTRIBUTE_ACTIVITY : "others";
        tn.p.k(str4, "m10Context");
        long j10 = jg2.f25731a;
        String str5 = jg2.f25732b;
        Map map = jg2.f25733c;
        tn.p.k(str, C3978d4.i.O);
        boolean z10 = jg2.f25734d;
        String str6 = jg2.f25737g;
        String str7 = jg2.f25735e;
        if (j10 == Long.MIN_VALUE) {
            throw new IllegalStateException("When the integration type is IM, IM-Plc can't be empty");
        }
        if (map == null || (str2 = (String) map.get("tp")) == null) {
            str2 = "";
        }
        C3795v0 c3795v0 = new C3795v0(j10, str2, "banner", str6);
        c3795v0.f28304d = str5;
        c3795v0.f28303c = map;
        tn.p.k(str, "<set-?>");
        c3795v0.f28308h = str;
        tn.p.k(str4, "<set-?>");
        c3795v0.f28309i = str4;
        c3795v0.f28307g = string;
        c3795v0.f28310j = z10;
        c3795v0.f28311k = str7;
        String str8 = jg2.f25737g;
        if (str8 != null) {
            C3605n9 c3605n9 = this.f25338f;
            if (c3605n9 != null) {
                c3605n9.a();
            }
            this.f25338f = Jh.a("banner", str8);
        }
        C3269a2 c3269a2 = this.f27080j;
        if (c3269a2 == null || this.f27081k == null) {
            this.f27080j = new C3269a2(context, c3795v0, this);
            C3269a2 c3269a22 = new C3269a2(context, c3795v0, this);
            this.f27081k = c3269a22;
            this.f27083m = this.f27080j;
            this.f27082l = c3269a22;
        } else {
            c3269a2.a(context, c3795v0, this);
            C3269a2 c3269a23 = this.f27081k;
            if (c3269a23 != null) {
                c3269a23.a(context, c3795v0, this);
            }
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            C3269a2 c3269a24 = this.f27080j;
            if (c3269a24 != null) {
                tn.p.k(c3605n92, "logger");
                c3269a24.f27513i = c3605n92;
                C3293b0 c3293b0 = c3269a24.f27525u;
                c3293b0.getClass();
                tn.p.k(c3605n92, "logger");
                c3293b0.f26825f = c3605n92;
            }
            C3269a2 c3269a25 = this.f27081k;
            if (c3269a25 != null) {
                tn.p.k(c3605n92, "logger");
                c3269a25.f27513i = c3605n92;
                C3293b0 c3293b02 = c3269a25.f27525u;
                c3293b02.getClass();
                tn.p.k(c3605n92, "logger");
                c3293b02.f26825f = c3605n92;
            }
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                String str9 = this.f27079i;
                str3 = "TAG";
                tn.p.j(str9, str3);
                c3605n93.a(str9, "adding mBannerAdUnit1 to reference tracker");
            } else {
                str3 = "TAG";
            }
            Ab ab2 = Jh.f25738a;
            C3269a2 c3269a26 = this.f27080j;
            tn.p.h(c3269a26);
            Jh.a(c3269a26, this.f25338f);
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                String str10 = this.f27079i;
                tn.p.j(str10, str3);
                c3605n94.a(str10, "adding mBannerAdUnit2 to reference tracker");
            }
            C3269a2 c3269a27 = this.f27081k;
            tn.p.h(c3269a27);
            Jh.a(c3269a27, this.f25338f);
        }
        WatermarkData watermarkData = this.f25339g;
        if (watermarkData != null) {
            C3269a2 c3269a28 = this.f27080j;
            if (c3269a28 != null) {
                tn.p.k(watermarkData, "watermarkData");
                c3269a28.A = watermarkData;
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciQ = c3269a28.q();
                if (gestureDetectorOnGestureListenerC3337ciQ != null) {
                    gestureDetectorOnGestureListenerC3337ciQ.setWatermark(watermarkData);
                }
            }
            C3269a2 c3269a29 = this.f27081k;
            if (c3269a29 != null) {
                tn.p.k(watermarkData, "watermarkData");
                c3269a29.A = watermarkData;
                GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciQ2 = c3269a29.q();
                if (gestureDetectorOnGestureListenerC3337ciQ2 != null) {
                    gestureDetectorOnGestureListenerC3337ciQ2.setWatermark(watermarkData);
                }
            }
        }
    }

    public final void a(InMobiBanner inMobiBanner) {
        C3795v0 c3795v0;
        tn.p.k(inMobiBanner, "banner");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "displayAd " + this);
        }
        C3269a2 c3269a2 = this.f27082l;
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = c3269a2 != null ? c3269a2.i() : null;
        if (!(gestureDetectorOnGestureListenerC3337ciI instanceof GestureDetectorOnGestureListenerC3337ci)) {
            gestureDetectorOnGestureListenerC3337ciI = null;
        }
        if (gestureDetectorOnGestureListenerC3337ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3337ciI.getViewableAd();
        C3269a2 c3269a22 = this.f27082l;
        if (c3269a22 != null && (c3795v0 = c3269a22.f27516l) != null && c3795v0.f28310j) {
            gestureDetectorOnGestureListenerC3337ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3337ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        C3269a2 c3269a23 = this.f27083m;
        if (c3269a23 != null) {
            c3269a23.W();
        }
        C3269a2 c3269a24 = this.f27082l;
        if (c3269a24 != null && c3269a24.f27506b == 8) {
            View view = new View(inMobiBanner.getContext());
            view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            if (viewGroup == null) {
                inMobiBanner.addView(view, layoutParams);
            } else {
                viewGroup.removeAllViews();
                viewGroup.addView(view, layoutParams);
            }
            r();
        } else if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        C3269a2 c3269a25 = this.f27083m;
        if (c3269a25 != null) {
            c3269a25.d();
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(WatermarkData watermarkData) {
        tn.p.k(watermarkData, "watermarkData");
        super.a(watermarkData);
        C3269a2 c3269a2 = this.f27080j;
        if (c3269a2 != null) {
            tn.p.k(watermarkData, "watermarkData");
            c3269a2.A = watermarkData;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciQ = c3269a2.q();
            if (gestureDetectorOnGestureListenerC3337ciQ != null) {
                gestureDetectorOnGestureListenerC3337ciQ.setWatermark(watermarkData);
            }
        }
        C3269a2 c3269a22 = this.f27081k;
        if (c3269a22 != null) {
            tn.p.k(watermarkData, "watermarkData");
            c3269a22.A = watermarkData;
            GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciQ2 = c3269a22.q();
            if (gestureDetectorOnGestureListenerC3337ciQ2 != null) {
                gestureDetectorOnGestureListenerC3337ciQ2.setWatermark(watermarkData);
            }
        }
    }

    public final void a(PublisherCallbacks publisherCallbacks, String str, boolean z10) {
        C3269a2 c3269a2;
        tn.p.k(publisherCallbacks, "callbacks");
        tn.p.k(str, C3978d4.i.O);
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str2 = this.f27079i;
            tn.p.j(str2, "TAG");
            c3605n9.c(str2, "load 1 " + this);
        }
        if (tn.p.f(this.f25334b, Boolean.FALSE)) {
            b(this.f27083m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3269a2 c3269a22 = this.f27083m;
            if (c3269a22 != null) {
                c3269a22.b((short) 2006);
            }
            Kb.a((byte) 1, this.f27078h, "Cannot call load() API after calling load(byte[])");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                String str3 = this.f27079i;
                tn.p.j(str3, "TAG");
                c3605n92.b(str3, "Cannot call load() API after calling load(byte[])");
                return;
            }
            return;
        }
        this.f25334b = Boolean.TRUE;
        if (this.f25335c == null) {
            this.f25335c = publisherCallbacks;
        }
        C3269a2 c3269a23 = this.f27083m;
        if (c3269a23 == null || !a(this.f27078h, String.valueOf(c3269a23.f27516l), publisherCallbacks) || (c3269a2 = this.f27083m) == null) {
            return;
        }
        PublisherCallbacks publisherCallbacks2 = this.f25335c;
        if (c3269a2.d((publisherCallbacks2 == null || publisherCallbacks2.getType() != 1) ? (byte) 1 : (byte) 2)) {
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                String str4 = this.f27079i;
                tn.p.j(str4, "TAG");
                c3605n93.d(str4, "AdManager state - LOADING");
            }
            this.f25333a = (byte) 1;
            this.f25337e = null;
            C3269a2 c3269a24 = this.f27083m;
            tn.p.h(c3269a24);
            c3269a24.c(str);
            C3269a2 c3269a25 = this.f27083m;
            tn.p.h(c3269a25);
            c3269a25.b(z10);
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        C3269a2 c3269a2;
        tn.p.k(publisherCallbacks, "callbacks");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "load 2 " + this);
        }
        if (tn.p.f(this.f25334b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                String str2 = this.f27079i;
                tn.p.j(str2, "TAG");
                c3605n92.b(str2, "Cannot call load(byte[]) API after load() API is called");
                return;
            }
            return;
        }
        this.f25334b = Boolean.FALSE;
        this.f25333a = (byte) 1;
        this.f25335c = publisherCallbacks;
        if (this.f27083m != null) {
            C3269a2 c3269a22 = this.f27082l;
            if ((c3269a22 == null || !c3269a22.B()) && (c3269a2 = this.f27083m) != null && c3269a2.d((byte) 1)) {
                C3605n9 c3605n93 = this.f25338f;
                if (c3605n93 != null) {
                    String str3 = this.f27079i;
                    tn.p.j(str3, "TAG");
                    c3605n93.a(str3, "timer started - load banner");
                }
                C3269a2 c3269a23 = this.f27083m;
                if (c3269a23 != null) {
                    c3269a23.D();
                }
                C3269a2 c3269a24 = this.f27083m;
                if (c3269a24 != null) {
                    c3269a24.a(bArr);
                }
            }
        }
    }

    public final boolean a(long j10) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "checkForRefreshRate " + this);
        }
        C3269a2 c3269a2 = this.f27083m;
        if (c3269a2 == null) {
            return false;
        }
        AdConfig adConfig = c3269a2.f27507c;
        tn.p.h(adConfig);
        int minimumRefreshInterval = adConfig.getMinimumRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minimumRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = this.f27079i;
            tn.p.j(str2, "TAG");
            c3605n92.b(str2, "Early refresh request");
        }
        b(this.f27083m, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minimumRefreshInterval + " seconds"));
        String str3 = this.f27079i;
        tn.p.j(str3, "TAG");
        C3269a2 c3269a22 = this.f27083m;
        Kb.a((byte) 1, str3, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3269a22 != null ? c3269a22.f27516l : null) + ")");
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null) {
            String str4 = this.f27079i;
            tn.p.j(str4, "TAG");
            C3269a2 c3269a23 = this.f27083m;
            c3605n93.b(str4, "Ad cannot be refreshed before " + minimumRefreshInterval + " seconds (AdPlacement Id = " + (c3269a23 != null ? c3269a23.f27516l : null) + ")");
        }
        return false;
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void b(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onAdFetchSuccess " + this);
        }
        this.f25337e = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C3269a2 c3269a2 = this.f27083m;
        if ((c3269a2 != null ? c3269a2.b(0) : null) == null) {
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                String str2 = this.f27079i;
                tn.p.j(str2, "TAG");
                c3605n92.b(str2, "backgroundAdUnit ad object is null");
            }
            a((AbstractC3547l1) null, inMobiAdRequestStatus);
            b((short) 2189);
            return;
        }
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null) {
            String str3 = this.f27079i;
            tn.p.j(str3, "TAG");
            c3605n93.a(str3, "Ad fetch successful, calling loadAd()");
        }
        super.b(adMetaInfo);
        this.f25336d.post(new Runnable() { // from class: n9.t6
            @Override // java.lang.Runnable
            public final void run() {
                C3372e2.a(this.f75627b, adMetaInfo);
            }
        });
    }

    public final void b(InMobiBanner inMobiBanner) {
        C3795v0 c3795v0;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "displayInternal " + this);
        }
        C3269a2 c3269a2 = this.f27082l;
        if (c3269a2 == null) {
            return;
        }
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI = c3269a2.i();
        if (!(gestureDetectorOnGestureListenerC3337ciI instanceof GestureDetectorOnGestureListenerC3337ci)) {
            gestureDetectorOnGestureListenerC3337ciI = null;
        }
        if (gestureDetectorOnGestureListenerC3337ciI == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3337ciI.getViewableAd();
        C3269a2 c3269a22 = this.f27082l;
        if (c3269a22 != null && (c3795v0 = c3269a22.f27516l) != null && c3795v0.f28310j) {
            gestureDetectorOnGestureListenerC3337ciI.k();
        }
        View viewC = viewableAd.c();
        viewableAd.a(new HashMap());
        ViewParent parent = gestureDetectorOnGestureListenerC3337ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (viewGroup == null) {
            inMobiBanner.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
    }

    public final void b(short s10) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "submitAdLoadFailed " + this);
        }
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F != null) {
            abstractC3547l1F.c(s10);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void c(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(adMetaInfo);
        this.f25333a = (byte) 0;
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = this.f27079i;
            tn.p.j(str2, "TAG");
            c3605n92.a(str2, "Ad load successful, providing callback");
        }
        this.f25336d.post(new Runnable() { // from class: n9.r6
            @Override // java.lang.Runnable
            public final void run() {
                C3372e2.b(this.f75599b, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3547l1 f() {
        return q() ? this.f27082l : this.f27083m;
    }

    public final void h() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "canProceedForSuccess " + this);
        }
    }

    public final boolean i() {
        C3269a2 c3269a2;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "canScheduleRefresh " + this);
        }
        C3269a2 c3269a22 = this.f27083m;
        if (c3269a22 == null) {
            return false;
        }
        byte b10 = c3269a22.f27506b;
        if (b10 != 4 && b10 != 1 && b10 != 2 && ((c3269a2 = this.f27082l) == null || c3269a2.f27506b != 7)) {
            return true;
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = this.f27079i;
            tn.p.j(str2, "TAG");
            c3605n92.a(str2, "Ignoring an attempt to schedule refresh when an ad is already loading or active.");
        }
        return false;
    }

    public final void j() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "clear " + this);
        }
        t();
        C3269a2 c3269a2 = this.f27080j;
        if (c3269a2 != null) {
            c3269a2.d();
        }
        this.f27080j = null;
        C3269a2 c3269a22 = this.f27081k;
        if (c3269a22 != null) {
            c3269a22.d();
        }
        this.f27081k = null;
        this.f25338f = null;
        this.f27082l = null;
        this.f27083m = null;
        this.f25334b = null;
    }

    public final int k() {
        AdConfig adConfig;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "defaultRefreshInterval " + this);
        }
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F == null || (adConfig = abstractC3547l1F.f27507c) == null) {
            return -1;
        }
        return adConfig.getDefaultRefreshInterval();
    }

    public final boolean l() {
        tn.p.j(this.f27079i, "TAG");
        tn.p.f(this.f27082l, this.f27080j);
        tn.p.j(this.f27079i, "TAG");
        tn.p.f(this.f27083m, this.f27080j);
        tn.p.j(this.f27079i, "TAG");
        tn.p.f(this.f27082l, this.f27081k);
        tn.p.j(this.f27079i, "TAG");
        tn.p.f(this.f27083m, this.f27081k);
        tn.p.j(this.f27079i, "TAG");
        C3269a2 c3269a2 = this.f27080j;
        Objects.toString(this.f27080j);
        tn.p.j(this.f27079i, "TAG");
        C3269a2 c3269a22 = this.f27081k;
        Objects.toString(this.f27081k);
        C3269a2 c3269a23 = this.f27082l;
        return c3269a23 != null && c3269a23.f27506b == 7;
    }

    public final void m() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "pause " + this);
        }
        C3269a2 c3269a2 = this.f27082l;
        if (c3269a2 != null) {
            c3269a2.W();
        }
    }

    public final void n() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        C3269a2 c3269a2 = this.f27080j;
        if (c3269a2 != null) {
            c3269a2.Y();
        }
        C3269a2 c3269a22 = this.f27081k;
        if (c3269a22 != null) {
            c3269a22.Y();
        }
    }

    public final void o() {
        C3269a2 c3269a2;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "render " + this);
        }
        C3269a2 c3269a22 = this.f27083m;
        if (c3269a22 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a(this.f27078h, String.valueOf(c3269a22.f27516l.f28301a))) {
            PublisherCallbacks publisherCallbacks = this.f25335c;
            if (publisherCallbacks != null && publisherCallbacks.getType() == 1 && (c3269a2 = this.f27083m) != null) {
                c3269a2.d((byte) 1);
            }
            this.f25333a = (byte) 8;
            c3269a22.Z();
        }
    }

    public final void p() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.a(str, "resume " + this);
        }
        C3269a2 c3269a2 = this.f27082l;
        if (c3269a2 != null) {
            c3269a2.X();
        }
    }

    public final boolean q() {
        C3269a2 c3269a2 = this.f27082l;
        Byte bValueOf = c3269a2 != null ? Byte.valueOf(c3269a2.f27506b) : null;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "shouldUseForegroundUnit " + this + " state - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void r() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "submitAdShowFail " + this);
        }
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F != null) {
            abstractC3547l1F.d((short) 2239);
        }
    }

    public final void s() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "swapAdUnits " + this);
        }
        C3269a2 c3269a2 = this.f27082l;
        if (c3269a2 == null) {
            this.f27082l = this.f27080j;
            this.f27083m = this.f27081k;
        } else if (tn.p.f(c3269a2, this.f27080j)) {
            this.f27082l = this.f27081k;
            this.f27083m = this.f27080j;
        } else if (tn.p.f(c3269a2, this.f27081k)) {
            this.f27082l = this.f27080j;
            this.f27083m = this.f27081k;
        }
    }

    public final void t() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = this.f27079i;
            tn.p.j(str, "TAG");
            c3605n9.c(str, "unregisterLifeCycleCallbacks " + this);
        }
        C3269a2 c3269a2 = this.f27080j;
        if (c3269a2 != null) {
            c3269a2.b0();
        }
        C3269a2 c3269a22 = this.f27081k;
        if (c3269a22 != null) {
            c3269a22.b0();
        }
    }
}
