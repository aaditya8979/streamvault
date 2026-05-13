package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.Dk;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Dk extends AbstractC3423g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f25333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f25334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PublisherCallbacks f25335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f25336d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdMetaInfo f25337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3605n9 f25338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WatermarkData f25339g;

    public static final void a(Dk dk2) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAdDismissed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDismissed();
            return;
        }
        C3605n9 c3605n92 = dk2.f25338f;
        if (c3605n92 != null) {
            tn.p.j("Dk", "TAG");
            c3605n92.b("Dk", "callback is null");
        }
    }

    public static final void a(Dk dk2, AdMetaInfo adMetaInfo) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAdDisplayed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdDisplayed(adMetaInfo);
        }
    }

    public static final void a(Dk dk2, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAdFetchFailed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdFetchFailed(inMobiAdRequestStatus);
        }
        C3605n9 c3605n92 = dk2.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    public static final void a(Dk dk2, V1 v12) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAudioStatusChanged - " + v12.f26464a);
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAudioStatusChanged(v12);
        }
    }

    public static final void a(Dk dk2, C3442gk c3442gk) {
        if (dk2.f25335c == null) {
            C3605n9 c3605n9 = dk2.f25338f;
            if (c3605n9 != null) {
                tn.p.j("Dk", "TAG");
                c3605n9.b("Dk", "callback is null");
            }
            if (c3442gk != null) {
                c3442gk.b();
                return;
            }
            return;
        }
        C3605n9 c3605n92 = dk2.f25338f;
        if (c3605n92 != null) {
            tn.p.j("Dk", "TAG");
            c3605n92.a("Dk", "callback - onAdImpression");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdImpression(c3442gk);
        }
    }

    public static final void a(Dk dk2, String str) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onImraidLog");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onImraidLog(str);
        }
    }

    public static final void a(Dk dk2, Map map) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAdClicked");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdClicked(map);
        }
    }

    public static final void a(AbstractC3547l1 abstractC3547l1, Dk dk2, InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (abstractC3547l1 != null) {
            abstractC3547l1.b((byte) 1);
        }
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAdLoadFailed");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdLoadFailed(inMobiAdRequestStatus);
        }
        C3605n9 c3605n92 = dk2.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    public static final void b(Dk dk2) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onAdWillShow");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onAdWillDisplay();
        }
    }

    public static final void b(Dk dk2, Map map) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onRewardsUnlocked");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onRewardsUnlocked(map);
        }
    }

    public static final void c(Dk dk2) {
        C3605n9 c3605n9 = dk2.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "callback - onUserLeftApplication");
        }
        PublisherCallbacks publisherCallbacks = dk2.f25335c;
        if (publisherCallbacks != null) {
            publisherCallbacks.onUserLeftApplication();
        }
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public void a() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdDismissed " + this);
        }
        this.f25336d.post(new Runnable() { // from class: n9.l
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f75471b);
            }
        });
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            c3605n92.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public void a(final AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdDisplayed " + this);
        }
        if (this.f25333a != 5) {
            this.f25337e = adMetaInfo;
            this.f25336d.post(new Runnable() { // from class: n9.t
                @Override // java.lang.Runnable
                public final void run() {
                    Dk.a(this.f75617b, adMetaInfo);
                }
            });
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                tn.p.j("Dk", "TAG");
                c3605n92.d("Dk", "AdManager state - DISPLAYED");
            }
            this.f25333a = (byte) 5;
        }
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void a(final InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdFetchFailed " + this);
        }
        this.f25333a = (byte) 3;
        this.f25336d.post(new Runnable() { // from class: n9.n
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f75512b, inMobiAdRequestStatus);
            }
        });
    }

    public void a(WatermarkData watermarkData) {
        tn.p.k(watermarkData, "watermarkData");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "setWatermark - " + watermarkData.getWatermarkBase64EncodedString());
        }
        this.f25339g = watermarkData;
    }

    public final void a(PublisherCallbacks publisherCallbacks) {
        tn.p.k(publisherCallbacks, "callbacks");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.a("Dk", "getSignals " + this);
        }
        if (f() != null) {
            this.f25335c = publisherCallbacks;
            publisherCallbacks.onRequestPayloadCreationFailed(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
        }
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void a(final V1 v12) {
        tn.p.k(v12, "audioStatusInternal");
        this.f25336d.post(new Runnable() { // from class: n9.p
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f75556b, v12);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void a(final C3442gk c3442gk) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdImpression " + this);
        }
        this.f25336d.post(new Runnable() { // from class: n9.m
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f75490b, c3442gk);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public void a(AbstractC3547l1 abstractC3547l1, InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdLoadFailed " + this);
        }
        b(abstractC3547l1, inMobiAdRequestStatus);
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void a(final String str) {
        tn.p.k(str, CreativeInfo.f52469an);
        this.f25336d.post(new Runnable() { // from class: n9.k
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f75450b, str);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void a(final HashMap map) {
        tn.p.k(map, "params");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdInteraction " + this);
        }
        this.f25336d.post(new Runnable() { // from class: n9.s
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(this.f75604b, map);
            }
        });
    }

    public void a(short s10) {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "submitAdLoadDroppedAtSDK " + this);
        }
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F != null) {
            abstractC3547l1F.b(s10);
        }
    }

    public void a(byte[] bArr, PublisherCallbacks publisherCallbacks) {
        C3506ja c3506ja;
        tn.p.k(publisherCallbacks, "callbacks");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "load " + this);
        }
        if (tn.p.f(this.f25334b, Boolean.TRUE)) {
            Kb.a((byte) 1, "InMobi", "Cannot call load(byte[]) API after load() API is called");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                tn.p.j("Dk", "TAG");
                c3605n92.a("Dk", "Cannot call load(byte[]) API after load() API is called");
            }
            C3556la c3556la = (C3556la) this;
            b(c3556la.f27554h, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            C3506ja c3506ja2 = c3556la.f27554h;
            if (c3506ja2 != null) {
                c3506ja2.b((short) 2140);
                return;
            }
            return;
        }
        this.f25334b = Boolean.FALSE;
        this.f25333a = (byte) 1;
        C3605n9 c3605n93 = this.f25338f;
        if (c3605n93 != null && (c3506ja = ((C3556la) this).f27554h) != null) {
            tn.p.k(c3605n93, "logger");
            c3506ja.f27513i = c3605n93;
            C3293b0 c3293b0 = c3506ja.f27525u;
            c3293b0.getClass();
            tn.p.k(c3605n93, "logger");
            c3293b0.f26825f = c3605n93;
        }
        C3556la c3556la2 = (C3556la) this;
        C3506ja c3506ja3 = c3556la2.f27554h;
        if (c3506ja3 == null || !c3506ja3.d((byte) 1)) {
            return;
        }
        C3605n9 c3605n94 = this.f25338f;
        if (c3605n94 != null) {
            tn.p.j("Dk", "TAG");
            c3605n94.a("Dk", "load starting. Started INTERNAL_LOAD_TIMER");
        }
        this.f25335c = publisherCallbacks;
        C3506ja c3506ja4 = c3556la2.f27554h;
        if (c3506ja4 != null) {
            c3506ja4.a(bArr);
        }
    }

    public final boolean a(String str, String str2) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "placementString");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "canRender " + this);
        }
        byte b10 = this.f25333a;
        if (b10 == 1) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                tn.p.j("Dk", "TAG");
                c3605n92.b("Dk", "adload in progress");
            }
            AbstractC3547l1 abstractC3547l1F = f();
            if (abstractC3547l1F != null) {
                abstractC3547l1F.c((short) 2129);
            }
            return false;
        }
        if (b10 == 8) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                tn.p.j("Dk", "TAG");
                c3605n93.b("Dk", "ad loading into view is in progress");
            }
            AbstractC3547l1 abstractC3547l1F2 = f();
            if (abstractC3547l1F2 != null) {
                abstractC3547l1F2.c((short) 2164);
            }
            return false;
        }
        if (b10 != 5) {
            if (b10 == 7) {
                return true;
            }
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                tn.p.j("Dk", "TAG");
                c3605n94.b("Dk", "ad in illegal state");
            }
            AbstractC3547l1 abstractC3547l1F3 = f();
            if (abstractC3547l1F3 != null) {
                abstractC3547l1F3.c((short) 2165);
            }
            AbstractC3547l1 abstractC3547l1F4 = f();
            if (abstractC3547l1F4 != null) {
                abstractC3547l1F4.J();
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            throw new IllegalStateException("Please make an ad request first in order to start loading the ad.");
        }
        Kb.a((byte) 1, str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        C3605n9 c3605n95 = this.f25338f;
        if (c3605n95 != null) {
            tn.p.j("Dk", "TAG");
            c3605n95.b("Dk", "ad active before renderAd");
        }
        AbstractC3547l1 abstractC3547l1F5 = f();
        if (abstractC3547l1F5 != null) {
            abstractC3547l1F5.c((short) 2130);
        }
        AbstractC3547l1 abstractC3547l1F6 = f();
        if (abstractC3547l1F6 != null) {
            abstractC3547l1F6.J();
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        return false;
    }

    public final boolean a(String str, String str2, PublisherCallbacks publisherCallbacks) {
        tn.p.k(str, "tag");
        tn.p.k(str2, "placementString");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            c3605n9.c(str, "canProceedToLoad " + this);
        }
        PublisherCallbacks publisherCallbacks2 = this.f25335c;
        if (publisherCallbacks2 != null && publisherCallbacks != null && publisherCallbacks2.getType() != publisherCallbacks.getType()) {
            tn.p.j("Dk", "TAG");
            Kb.a((byte) 1, "Dk", "preload() and load() cannot be called on the same instance, please use a different instance.");
            C3605n9 c3605n92 = this.f25338f;
            if (c3605n92 != null) {
                c3605n92.b(str, "preload() and load() cannot be called on the same instance, please use a different instance.");
            }
            AbstractC3547l1 abstractC3547l1F = f();
            if (abstractC3547l1F != null) {
                abstractC3547l1F.b((short) 2005);
            }
            b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD));
            return false;
        }
        byte b10 = this.f25333a;
        if (b10 == 8) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3605n9 c3605n93 = this.f25338f;
            if (c3605n93 != null) {
                c3605n93.b(str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            }
            AbstractC3547l1 abstractC3547l1F2 = f();
            if (abstractC3547l1F2 != null) {
                abstractC3547l1F2.b((short) 2002);
            }
            return false;
        }
        if (b10 == 1) {
            Kb.a((byte) 1, str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            C3605n9 c3605n94 = this.f25338f;
            if (c3605n94 != null) {
                c3605n94.b(str, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: " + str2);
            }
            AbstractC3547l1 abstractC3547l1F3 = f();
            if (abstractC3547l1F3 != null) {
                abstractC3547l1F3.b((short) 2001);
            }
            return false;
        }
        if (b10 != 5) {
            return true;
        }
        Kb.a((byte) 1, str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        C3605n9 c3605n95 = this.f25338f;
        if (c3605n95 != null) {
            c3605n95.b(str, "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + str2);
        }
        b(f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
        AbstractC3547l1 abstractC3547l1F4 = f();
        if (abstractC3547l1F4 != null) {
            abstractC3547l1F4.c((short) 2003);
        }
        return false;
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public void b(AdMetaInfo adMetaInfo) {
        AbstractC3547l1 abstractC3547l1F;
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdFetchSuccess " + this);
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            tn.p.j("Dk", "TAG");
            c3605n92.d("Dk", "AdManager state - FETCHED");
        }
        this.f25333a = (byte) 7;
        PublisherCallbacks publisherCallbacks = this.f25335c;
        if (publisherCallbacks == null || publisherCallbacks.getType() != 1 || (abstractC3547l1F = f()) == null) {
            return;
        }
        abstractC3547l1F.b((byte) 2);
    }

    public final void b(final AbstractC3547l1 abstractC3547l1, final InMobiAdRequestStatus inMobiAdRequestStatus) {
        tn.p.k(inMobiAdRequestStatus, "status");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onLoadFailure " + this);
        }
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            tn.p.j("Dk", "TAG");
            c3605n92.d("Dk", "AdManager state - LOAD_FAILED");
        }
        this.f25333a = (byte) 3;
        this.f25336d.post(new Runnable() { // from class: n9.u
            @Override // java.lang.Runnable
            public final void run() {
                Dk.a(abstractC3547l1, this, inMobiAdRequestStatus);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void b(final HashMap map) {
        tn.p.k(map, "rewards");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdRewardActionCompleted " + this);
        }
        this.f25336d.post(new Runnable() { // from class: n9.q
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f75577b, map);
            }
        });
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void c() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdWillShow " + this);
        }
        byte b10 = this.f25333a;
        if (b10 == 4 || b10 == 5) {
            return;
        }
        this.f25336d.post(new Runnable() { // from class: n9.o
            @Override // java.lang.Runnable
            public final void run() {
                Dk.b(this.f75530b);
            }
        });
        C3605n9 c3605n92 = this.f25338f;
        if (c3605n92 != null) {
            tn.p.j("Dk", "TAG");
            c3605n92.d("Dk", "AdManager state - WILL_DISPLAY");
        }
        this.f25333a = (byte) 4;
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public void c(AdMetaInfo adMetaInfo) {
        tn.p.k(adMetaInfo, "info");
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onAdLoadSucceeded " + this);
        }
        this.f25337e = adMetaInfo;
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F != null) {
            abstractC3547l1F.b((byte) 1);
        }
    }

    @Override // com.inmobi.media.AbstractC3423g1
    public final void e() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "onUserLeftApplication " + this);
        }
        this.f25336d.post(new Runnable() { // from class: n9.r
            @Override // java.lang.Runnable
            public final void run() {
                Dk.c(this.f75593b);
            }
        });
    }

    public abstract AbstractC3547l1 f();

    public void g() {
        C3605n9 c3605n9 = this.f25338f;
        if (c3605n9 != null) {
            tn.p.j("Dk", "TAG");
            c3605n9.c("Dk", "submitAdLoadCalled " + this);
        }
        AbstractC3547l1 abstractC3547l1F = f();
        if (abstractC3547l1F != null) {
            abstractC3547l1F.O();
        }
    }
}
