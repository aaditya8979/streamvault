package com.applovin.impl.mediation.ads;

import android.view.ViewGroup;
import com.applovin.impl.d3;
import com.applovin.impl.f8;
import com.applovin.impl.g8;
import com.applovin.impl.mediation.ads.a;

/* JADX INFO: loaded from: classes2.dex */
public class b implements g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d3 f8932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g8 f8933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8 f8934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a.InterfaceC0148a f8935e;

    public b(d3 d3Var, ViewGroup viewGroup, a.InterfaceC0148a interfaceC0148a, com.applovin.impl.sdk.k kVar) {
        this.f8931a = kVar;
        this.f8932b = d3Var;
        this.f8935e = interfaceC0148a;
        this.f8934d = new f8(viewGroup, kVar);
        g8 g8Var = new g8(viewGroup, kVar, this);
        this.f8933c = g8Var;
        g8Var.a(d3Var);
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    private void a(long j10) {
        if (this.f8932b.v0().compareAndSet(false, true)) {
            this.f8931a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8931a.O().a("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f8931a.X().processViewabilityAdImpressionPostback(this.f8932b, j10, this.f8935e);
        }
    }

    public void a() {
        this.f8933c.b();
    }

    public d3 b() {
        return this.f8932b;
    }

    public void c() {
        this.f8931a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f8931a.O().a("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f8932b.u0().compareAndSet(false, true)) {
            this.f8931a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8931a.O().a("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            if (this.f8932b.getNativeAd().isExpired()) {
                com.applovin.impl.sdk.o.h("MaxNativeAdView", "Attempting to display an expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            } else {
                this.f8931a.f().a(this.f8932b);
            }
            this.f8931a.X().processRawAdImpression(this.f8932b, this.f8935e);
        }
    }

    @Override // com.applovin.impl.g8.a
    public void onLogVisibilityImpression() {
        a(this.f8934d.a(this.f8932b));
    }
}
