package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.W1;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class W1 extends Dk {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public N1 f26514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N1 f26515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public N1 f26516j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public N1 f26517k;

    public W1(InMobiAudio.a aVar) {
        tn.p.k(aVar, "callbacks");
        this.f25335c = aVar;
    }

    public static final void a(W1 w12) {
        C3605n9 c3605n9 = w12.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "callback - onAdDisplayFailed");
        }
        PublisherCallbacks publisherCallbacks = w12.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayFailed();
        }
        C3605n9 c3605n92 = w12.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    public static final void a(W1 w12, RelativeLayout relativeLayout) {
        w12.b(relativeLayout);
    }

    public static final void a(W1 w12, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w12.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchSuccessful(adMetaInfo);
        }
    }

    public static final void b(W1 w12, AdMetaInfo adMetaInfo) {
        PublisherCallbacks publisherCallbacks = w12.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadSucceeded(adMetaInfo);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void a() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "onAdDismissed " + this);
        }
        this.f25333a = (byte) 0;
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = X1.f26573a;
            tn.p.j(str2, "access$getTAG$p(...)");
            c3605n92.d(str2, "AdManager state - CREATED");
        }
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null) {
            c3605n93.a();
        }
        super.a();
    }

    public final void a(Context context, Jg jg2, String str) {
        String str2;
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(jg2, "pubSettings");
        tn.p.k(str, C3978d4.i.O);
        String str3 = X1.f26573a;
        tn.p.j(str3, "access$getTAG$p(...)");
        tn.p.k("audio", "mAdType");
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
        C3795v0 c3795v0 = new C3795v0(j10, str2, "audio", str6);
        c3795v0.f28304d = str5;
        c3795v0.f28303c = map;
        tn.p.k(str, "<set-?>");
        c3795v0.f28308h = str;
        tn.p.k(str4, "<set-?>");
        c3795v0.f28309i = str4;
        c3795v0.f28307g = string;
        c3795v0.f28310j = z10;
        c3795v0.f28311k = str7;
        N1 n12 = this.f26514h;
        if (n12 == null || this.f26515i == null) {
            this.f26514h = new N1(context, c3795v0, this);
            this.f26515i = new N1(context, c3795v0, this);
            this.f26517k = this.f26514h;
        } else {
            n12.a(context, c3795v0, this);
            N1 n13 = this.f26515i;
            if (n13 != null) {
                n13.a(context, c3795v0, this);
            }
        }
        String str8 = jg2.f25737g;
        if (str8 != null) {
            C3605n9 c3605n9 = this.f25338f;
            if (c3605n9 != null) {
                c3605n9.a();
            }
            C3605n9 c3605n9A = Jh.a("audio", str8);
            this.f25338f = c3605n9A;
            if (c3605n9A != null) {
                tn.p.j(str3, "access$getTAG$p(...)");
                c3605n9A.a(str3, "adding audioAdUnit1 to reference tracker");
            }
            N1 n14 = this.f26514h;
            tn.p.h(n14);
            Jh.a(n14, this.f25338f);
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                tn.p.j(str3, "access$getTAG$p(...)");
                c3605n92.a(str3, "adding audioAdUnit2 to reference tracker");
            }
            N1 n15 = this.f26515i;
            tn.p.h(n15);
            Jh.a(n15, this.f25338f);
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ciI;
        C3795v0 c3795v0;
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "displayAd " + this);
        }
        N1 n12 = this.f26516j;
        if (n12 == null || (gestureDetectorOnGestureListenerC3337ciI = n12.i()) == null) {
            return;
        }
        Fn viewableAd = gestureDetectorOnGestureListenerC3337ciI.getViewableAd();
        N1 n13 = this.f26516j;
        if (n13 != null && (c3795v0 = n13.f27516l) != null && c3795v0.f28310j) {
            gestureDetectorOnGestureListenerC3337ciI.k();
        }
        ViewParent parent = gestureDetectorOnGestureListenerC3337ciI.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        View viewC = viewableAd.c();
        viewableAd.a((Map) null);
        N1 n14 = this.f26517k;
        if (n14 != null) {
            n14.W();
        }
        if (viewGroup == null) {
            relativeLayout.addView(viewC, layoutParams);
        } else {
            viewGroup.removeAllViews();
            viewGroup.addView(viewC, layoutParams);
        }
        N1 n15 = this.f26517k;
        if (n15 != null) {
            n15.d();
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void a(AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "onAdDisplayed");
        }
        super.a(adMetaInfo);
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F != null) {
            abstractC3547l1F.R();
        }
    }

    public final void a(final InMobiAudio inMobiAudio) {
        tn.p.k(inMobiAudio, "audio");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "show called");
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                b(inMobiAudio);
            } else {
                this.f25336d.post(new Runnable() { // from class: n9.a5
                    @Override // java.lang.Runnable
                    public final void run() {
                        W1.a(this.f75283b, inMobiAudio);
                    }
                });
            }
        } catch (Exception e10) {
            N1 n12 = this.f26517k;
            if (n12 != null) {
                n12.e((short) 26);
            }
            String str2 = X1.f26573a;
            tn.p.j(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "Unable to show ad; SDK encountered an unexpected error");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                tn.p.j(str2, "access$getTAG$p(...)");
                c3605n92.b(str2, "Show failed with unexpected error: " + e10.getMessage());
            }
            bn.g gVar = P9.f26117a;
            AbstractC3481i9.a(e10);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void a(AbstractC3547l1 abstractC3547l1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.b(str, com.ironsource.Mf.f29848b);
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    @Override // com.inmobi.media.Dk
    public final void a(short s10) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.b(str, "submitAdLoadDroppedAtSDK " + this);
        }
        N1 n12 = this.f26517k;
        if (n12 != null) {
            n12.b(s10);
        }
    }

    public final boolean a(long j10) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.c(str, "checkForRefreshRate " + this);
        }
        if (this.f26517k == null) {
            return false;
        }
        C3476i4 c3476i4 = Y3.f26611a;
        tn.p.k(AdConfig.class, "clazz");
        int minRefreshInterval = ((AdConfig) Y3.f26611a.a(AdConfig.class)).getAudio().getMinRefreshInterval();
        if (SystemClock.elapsedRealtime() - j10 >= minRefreshInterval * 1000) {
            return true;
        }
        a((short) 2175);
        b(this.f26517k, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST).setCustomMessage("Ad cannot be refreshed before " + minRefreshInterval + " seconds"));
        String str2 = X1.f26573a;
        tn.p.j(str2, "access$getTAG$p(...)");
        N1 n12 = this.f26517k;
        Kb.a((byte) 1, str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n12 != null ? n12.f27516l : null) + ")");
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            tn.p.j(str2, "access$getTAG$p(...)");
            N1 n13 = this.f26517k;
            c3605n92.b(str2, "Ad cannot be refreshed before " + minRefreshInterval + " seconds (AdPlacement Id = " + (n13 != null ? n13.f27516l : null) + ")");
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void b() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "onAdShowFailed " + this);
        }
        this.f25336d.post(new Runnable() { // from class: n9.d5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f75330b);
            }
        });
    }

    public final void b(RelativeLayout relativeLayout) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "showAudioAd");
        }
        N1 n12 = this.f26516j;
        if (n12 != null && n12.f27506b == 7) {
            String str2 = X1.f26573a;
            tn.p.j(str2, "access$getTAG$p(...)");
            Kb.a((byte) 1, str2, "An ad is currently being viewed by the user. Please wait for the user to close the ad before showing another ad.");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                tn.p.j(str2, "access$getTAG$p(...)");
                c3605n92.b(str2, "ad is active");
            }
            N1 n13 = this.f26517k;
            if (n13 != null) {
                n13.e((short) 15);
                return;
            }
            return;
        }
        N1 n14 = this.f26517k;
        if (n14 != null) {
            C3605n9 c3605n93 = n14.f27513i;
            if (c3605n93 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n93.c("l1", "canProceedToShow");
            }
            if (n14.z()) {
                tn.p.j("l1", "<get-TAG>(...)");
                Kb.a((byte) 1, "l1", "Ad Show has failed because current ad is expired. Please call load() again.");
                C3605n9 c3605n94 = n14.f27513i;
                if (c3605n94 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n94.b("l1", "ad is expired");
                }
                n14.c0();
                return;
            }
            byte b10 = n14.f27506b;
            if (b10 == 1 || b10 == 2) {
                Kb.a((byte) 1, "InMobi", "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
                C3605n9 c3605n95 = n14.f27513i;
                if (c3605n95 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n95.b("l1", "ad is not ready");
                }
                C3605n9 c3605n96 = n14.f27513i;
                if (c3605n96 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n96.a("l1", "callback - onShowFailure");
                }
                n14.e((short) 2152);
                return;
            }
            if (b10 == 3) {
                Kb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n14.e((short) 0);
                C3605n9 c3605n97 = n14.f27513i;
                if (c3605n97 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n97.a("l1", "callback - onShowFailure");
                }
                C3605n9 c3605n98 = n14.f27513i;
                if (c3605n98 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n98.b("l1", "ad is failed");
                    return;
                }
                return;
            }
            if (b10 == 8) {
                Kb.a((byte) 1, "InMobi", "Ad Load has Failed. Please call load() again.");
                n14.e((short) 0);
                C3605n9 c3605n99 = n14.f27513i;
                if (c3605n99 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n99.a("l1", "callback - onShowFailure");
                }
                C3605n9 c3605n910 = n14.f27513i;
                if (c3605n910 != null) {
                    tn.p.j("l1", "<get-TAG>(...)");
                    c3605n910.b("l1", "ad is unloaded");
                    return;
                }
                return;
            }
            if (b10 != 0) {
                o();
                a(relativeLayout);
                return;
            }
            Kb.a((byte) 1, "InMobi", "Ad Show has Failed. Please call load() before calling show().");
            n14.e((short) 0);
            C3605n9 c3605n911 = n14.f27513i;
            if (c3605n911 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n911.a("l1", "callback - onShowFailure");
            }
            C3605n9 c3605n912 = n14.f27513i;
            if (c3605n912 != null) {
                tn.p.j("l1", "<get-TAG>(...)");
                c3605n912.b("l1", "show called before load");
            }
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void b(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.c(str, "onAdFetchSuccess " + this);
        }
        N1 n12 = this.f26517k;
        if ((n12 != null ? n12.b(0) : null) == null) {
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                String str2 = X1.f26573a;
                tn.p.j(str2, "access$getTAG$p(...)");
                c3605n92.b(str2, "adObject is null, fetch failed");
            }
            a((AbstractC3547l1) null, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            return;
        }
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null) {
            String str3 = X1.f26573a;
            tn.p.j(str3, "access$getTAG$p(...)");
            c3605n93.a(str3, "Ad fetch successful, calling loadIntoView()");
        }
        super.b(adMetaInfo);
        this.f25336d.post(new Runnable() { // from class: n9.b5
            @Override // java.lang.Runnable
            public final void run() {
                W1.a(this.f75297b, adMetaInfo);
            }
        });
    }

    public final void b(String str) {
        tn.p.k(str, C3978d4.i.O);
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str2 = X1.f26573a;
            tn.p.j(str2, "access$getTAG$p(...)");
            c3605n9.a(str2, "load 1 " + this);
        }
        N1 n12 = this.f26517k;
        if (n12 != null && a("InMobi", String.valueOf(n12.f27516l.f28301a), this.f25335c) && n12.d((byte) 1)) {
            this.f25333a = (byte) 1;
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                String str3 = X1.f26573a;
                tn.p.j(str3, "access$getTAG$p(...)");
                c3605n92.d(str3, "AdManager state - LOADING");
            }
            this.f25337e = null;
            n12.c(str);
            n12.b(false);
        }
    }

    public final void b(short s10) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.b(str, "submitAdLoadFailed " + this);
        }
        N1 n12 = this.f26517k;
        if (n12 != null) {
            n12.c((short) 15);
        }
    }

    @Override // com.inmobi.media.Dk, com.inmobi.media.AbstractC3423g1
    public final void c(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.c(str, "onAdLoadSucceeded " + this);
        }
        super.c(adMetaInfo);
        this.f25333a = (byte) 0;
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = X1.f26573a;
            tn.p.j(str2, "access$getTAG$p(...)");
            c3605n92.d(str2, "AdManager state - CREATED");
        }
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null) {
            String str3 = X1.f26573a;
            tn.p.j(str3, "access$getTAG$p(...)");
            c3605n93.a(str3, "Ad load successful, providing callback");
        }
        this.f25336d.post(new Runnable() { // from class: n9.c5
            @Override // java.lang.Runnable
            public final void run() {
                W1.b(this.f75315b, adMetaInfo);
            }
        });
    }

    @Override // com.inmobi.media.Dk
    public final AbstractC3547l1 f() {
        return m() ? this.f26516j : this.f26517k;
    }

    @Override // com.inmobi.media.Dk
    public final void g() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "submitAdLoadCalled " + this);
        }
        N1 n12 = this.f26517k;
        if (n12 != null) {
            n12.O();
        }
    }

    public final void h() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "clear " + this);
        }
        p();
        N1 n12 = this.f26514h;
        if (n12 != null) {
            n12.d();
        }
        this.f26514h = null;
        N1 n13 = this.f26515i;
        if (n13 != null) {
            n13.d();
        }
        this.f26515i = null;
        this.f26516j = null;
        this.f26517k = null;
        this.f25334b = null;
    }

    public final void i() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "pause " + this);
        }
        N1 n12 = this.f26516j;
        if (n12 != null) {
            n12.W();
        }
    }

    public final void j() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.c(str, "registerLifeCycleCallbacks " + this);
        }
        N1 n12 = this.f26514h;
        if (n12 != null) {
            n12.Y();
        }
        N1 n13 = this.f26515i;
        if (n13 != null) {
            n13.Y();
        }
    }

    public final void k() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "loadIntoView " + this);
        }
        N1 n12 = this.f26517k;
        if (n12 == null) {
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        if (a("InMobi", String.valueOf(n12.f27516l.f28301a))) {
            this.f25333a = (byte) 8;
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                String str2 = X1.f26573a;
                tn.p.j(str2, "access$getTAG$p(...)");
                c3605n92.d(str2, "AdManager state - LOADING_INTO_VIEW");
            }
            n12.Z();
        }
    }

    public final void l() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "resume " + this);
        }
        N1 n12 = this.f26516j;
        if (n12 != null) {
            n12.X();
        }
    }

    public final boolean m() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.c(str, "shouldUseForegroundUnit " + this);
        }
        N1 n12 = this.f26516j;
        Byte bValueOf = n12 != null ? Byte.valueOf(n12.f27506b) : null;
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            String str2 = X1.f26573a;
            tn.p.j(str2, "access$getTAG$p(...)");
            c3605n92.d(str2, "State - " + bValueOf);
        }
        if (bValueOf != null && bValueOf.byteValue() == 4) {
            return true;
        }
        if (bValueOf == null || bValueOf.byteValue() != 7) {
            return bValueOf != null && bValueOf.byteValue() == 6;
        }
        return true;
    }

    public final void n() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "submitAdShowCalled " + this);
        }
        N1 n12 = this.f26517k;
        if (n12 != null) {
            n12.Q();
        }
    }

    public final void o() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.a(str, "swapAdUnits " + this);
        }
        N1 n12 = this.f26516j;
        if (tn.p.f(n12, this.f26514h)) {
            this.f26516j = this.f26515i;
            this.f26517k = this.f26514h;
        } else if (tn.p.f(n12, this.f26515i) || n12 == null) {
            this.f26516j = this.f26514h;
            this.f26517k = this.f26515i;
        }
    }

    public final void p() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            String str = X1.f26573a;
            tn.p.j(str, "access$getTAG$p(...)");
            c3605n9.c(str, "unregisterLifecycleCallbacks " + this);
        }
        N1 n12 = this.f26514h;
        if (n12 != null) {
            n12.b0();
        }
        N1 n13 = this.f26515i;
        if (n13 != null) {
            n13.b0();
        }
    }
}
