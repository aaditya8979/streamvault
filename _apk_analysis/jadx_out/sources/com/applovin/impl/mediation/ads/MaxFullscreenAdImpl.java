package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.c3;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.g0;
import com.applovin.impl.j;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.n7;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w3;
import com.applovin.impl.x3;
import com.applovin.impl.x4;
import com.applovin.impl.y2;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MaxFullscreenAdImpl extends com.applovin.impl.mediation.ads.a implements a.InterfaceC0152a, j.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f8887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f8888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f8889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.applovin.impl.mediation.b f8890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c3 f8892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f8893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f8894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f8895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g0 f8896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8897k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f8898l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f8899m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f8900n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f8901o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f8902p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private WeakReference f8903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private WeakReference f8904r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private WeakReference f8905s;

    public interface a {
        Activity getActivity();
    }

    public class b implements MaxAdListener, MaxAdRevenueListener, a.InterfaceC0148a {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            MaxFullscreenAdImpl.this.f8899m = true;
            MaxFullscreenAdImpl.this.loadAd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var) {
            if (c3Var.w().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.P().a(d2.f8032t0, c3Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(c3 c3Var, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f8899m) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Attempting ad failover");
                }
                c3Var.j(MaxFullscreenAdImpl.this.f8902p);
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f8044z0, c3Var, CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f8902p));
                MaxFullscreenAdImpl.this.g();
                return;
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.a(maxAd);
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(MaxAd maxAd, boolean z10, c3 c3Var, MaxError maxError) {
            MaxFullscreenAdImpl.this.a(maxAd);
            if (!z10 && c3Var.z0()) {
                if (MaxFullscreenAdImpl.this.b()) {
                    AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f8968b.a();
                        }
                    });
                    return;
                }
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Unable to attempt ad failover due to missing cached ad");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.f8042y0, c3Var);
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str, MaxError maxError) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final c3 c3Var = (c3) maxAd;
            MaxFullscreenAdImpl.this.d();
            final boolean z10 = MaxFullscreenAdImpl.this.f8899m;
            if (z10) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.b(maxFullscreenAdImpl.tag, "Ad failover failed");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.B0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f8899m = false;
            }
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8969b.a(maxAd, z10, c3Var, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final c3 c3Var = (c3) maxAd;
            if (MaxFullscreenAdImpl.this.f8899m) {
                com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
                if (com.applovin.impl.sdk.o.a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "Ad failover succeeded");
                }
                MaxFullscreenAdImpl.this.sdk.P().a(d2.A0, c3Var, CollectionUtils.hashMap("details", c3Var.u0()));
                MaxFullscreenAdImpl.this.f8899m = false;
            }
            MaxFullscreenAdImpl.this.sdk.f().a(c3Var);
            MaxFullscreenAdImpl.this.b(c3Var);
            MaxFullscreenAdImpl.this.f();
            if (((Integer) MaxFullscreenAdImpl.this.sdk.a(r3.f9749p8)).intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.q0().b(new r6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8977b.a(c3Var);
                    }
                }), d6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(r1.intValue()));
            }
            com.applovin.impl.sdk.o oVar2 = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            t2.c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f8899m = false;
            MaxFullscreenAdImpl.this.d();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8979b.a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.e();
            MaxFullscreenAdImpl.this.a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8981b.a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            c3 c3Var;
            synchronized (MaxFullscreenAdImpl.this.f8891e) {
                c3Var = MaxFullscreenAdImpl.this.f8892f;
            }
            MaxFullscreenAdImpl.this.sdk.H().a(MaxFullscreenAdImpl.this.adUnitId);
            final c3 c3Var2 = (c3) maxAd;
            MaxFullscreenAdImpl.this.a(c3Var2);
            if (!MaxFullscreenAdImpl.this.f8894h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.a(c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8974b.a(c3Var2, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f8895i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.g();
            }
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c3Var + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            t2.a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c3Var, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            t2.a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            com.applovin.impl.sdk.o oVar = MaxFullscreenAdImpl.this.logger;
            if (com.applovin.impl.sdk.o.a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            t2.a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }
    }

    public enum c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, a aVar, String str2, com.applovin.impl.sdk.k kVar, Context context) {
        super(str, maxAdFormat, str2, kVar);
        this.f8891e = new Object();
        this.f8892f = null;
        this.f8893g = c.IDLE;
        this.f8894h = new AtomicBoolean();
        this.f8895i = new AtomicBoolean();
        this.f8903q = new WeakReference(null);
        this.f8904r = new WeakReference(null);
        this.f8905s = new WeakReference(null);
        this.f8887a = aVar;
        this.f8889c = createAdListenerWrapper();
        this.f8890d = new com.applovin.impl.mediation.b(kVar);
        this.f8888b = new WeakReference(context);
        kVar.j().a(this);
        com.applovin.impl.sdk.o.g(str2, "Created new " + str2 + " (" + this + ")");
    }

    private void a() {
        c3 c3Var;
        synchronized (this.f8891e) {
            c3Var = this.f8892f;
            this.f8892f = null;
        }
        this.sdk.X().destroyAd(c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, Context context, com.applovin.impl.i iVar) {
        Context context2;
        Context contextU0 = activity;
        if (activity != null) {
            context2 = contextU0;
        } else if (context != null) {
            context2 = context;
        } else {
            contextU0 = this.sdk.u0() != null ? this.sdk.u0() : com.applovin.impl.sdk.k.o();
            context2 = contextU0;
        }
        this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, iVar, this.localExtraParameters, this.extraParameters, context2, this.f8889c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c3 c3Var) {
        if (!this.sdk.f().a(c3Var, this)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired(c3Var);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Handle ad loaded for regular ad: " + c3Var);
        }
        this.f8892f = c3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, Runnable runnable) {
        boolean z10;
        c cVar2 = this.f8893g;
        synchronized (this.f8891e) {
            c cVar3 = c.IDLE;
            if (cVar2 != cVar3) {
                c cVar4 = c.LOADING;
                if (cVar2 == cVar4) {
                    if (cVar != cVar3) {
                        if (cVar == cVar4) {
                            com.applovin.impl.sdk.o.h(this.tag, "An ad is already loading");
                        } else if (cVar != c.READY) {
                            if (cVar == c.SHOWING) {
                                com.applovin.impl.sdk.o.h(this.tag, "An ad is not ready to be shown yet");
                            } else if (cVar != c.DESTROYED) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                } else {
                    c cVar5 = c.READY;
                    if (cVar2 == cVar5) {
                        if (cVar != cVar3) {
                            if (cVar == cVar4) {
                                com.applovin.impl.sdk.o.h(this.tag, "An ad is already loaded");
                            } else if (cVar == cVar5) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.logger.b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (cVar != c.SHOWING && cVar != c.DESTROYED) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                }
                            }
                            z10 = false;
                        }
                        z10 = true;
                    } else {
                        c cVar6 = c.SHOWING;
                        if (cVar2 == cVar6) {
                            if (cVar != cVar3) {
                                if (cVar == cVar4) {
                                    com.applovin.impl.sdk.o.h(this.tag, "Can not load another ad while the ad is showing");
                                } else if (cVar == cVar5) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (cVar == cVar6) {
                                    com.applovin.impl.sdk.o.h(this.tag, "The ad is already showing, not showing another one");
                                } else if (cVar != c.DESTROYED) {
                                    if (com.applovin.impl.sdk.o.a()) {
                                        this.logger.b(this.tag, "Unable to transition to: " + cVar);
                                    }
                                }
                            }
                            z10 = true;
                        } else if (cVar2 == c.DESTROYED) {
                            com.applovin.impl.sdk.o.h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (com.applovin.impl.sdk.o.a()) {
                            this.logger.b(this.tag, "Unknown state: " + this.f8893g);
                        }
                        z10 = false;
                    }
                }
            } else if (cVar == c.LOADING || cVar == c.DESTROYED) {
                z10 = true;
            } else {
                if (cVar == c.SHOWING) {
                    com.applovin.impl.sdk.o.h(this.tag, "No ad is loading or loaded");
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.logger.b(this.tag, "Unable to transition to: " + cVar);
                }
                z10 = false;
            }
            if (z10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Transitioning from " + this.f8893g + " to " + cVar + "...");
                }
                this.f8893g = cVar;
            } else if (com.applovin.impl.sdk.o.a()) {
                this.logger.k(this.tag, "Not allowed to transition from " + this.f8893g + " to " + cVar);
            }
        }
        if (z10) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MaxAd maxAd) {
        this.sdk.f().a((c3) maxAd);
        this.f8890d.a();
        a();
        this.sdk.a0().a((y2) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Long l10) {
        this.f8897k += l10.longValue();
        this.sdk.p0().b(z4.S, Long.valueOf(this.f8897k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (this.f8895i.compareAndSet(true, false)) {
            com.applovin.impl.sdk.o.h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.H().c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f8892f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8892f);
            }
        }
    }

    private void a(String str, String str2) {
        this.f8890d.e(this.f8892f);
        this.f8892f.g(str);
        this.f8892f.f(str2);
        this.f8900n = str;
        this.f8901o = str2;
        this.f8902p = this.f8892f.getNetworkName();
        this.sdk.y().d(this.f8892f);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f8892f + "...");
        }
        a((y2) this.f8892f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity) {
        a(str, str2);
        this.f8898l = false;
        this.f8903q = new WeakReference(activity);
        this.sdk.X().showFullscreenAd(this.f8892f, activity, this.localExtraParameters, this.extraParameters, this.f8889c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        a(str, str2);
        this.f8898l = true;
        this.f8903q = new WeakReference(activity);
        this.f8904r = new WeakReference(viewGroup);
        this.f8905s = new WeakReference(lifecycle);
        this.sdk.X().showFullscreenAd(this.f8892f, viewGroup, lifecycle, activity, this.localExtraParameters, this.extraParameters, this.f8889c);
    }

    private boolean a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f8893g == c.DESTROYED) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            com.applovin.impl.sdk.o.h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            x3 x3Var = new x3(this.adUnitId, this.adFormat, str);
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + x3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) x3Var, (MaxError) maxErrorImpl, true);
            if (this.f8892f != null) {
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8892f);
            }
            return false;
        }
        Long l10 = (Long) this.sdk.a(r3.V7);
        Long l11 = (Long) this.sdk.a(r3.O7);
        if (l10.longValue() > 0 && (this.f8892f.getTimeToLiveMillis() < l11.longValue() || this.f8894h.get())) {
            this.f8895i.set(true);
            this.sdk.q0().a(new r6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8958b.a(str);
                }
            }), d6.b.TIMEOUT, l10.longValue());
            return false;
        }
        if (n7.a(com.applovin.impl.sdk.k.o()) != 0 && this.sdk.n0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (n7.c(this.sdk)) {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
            if (((Boolean) this.sdk.a(r3.f9739j8)).booleanValue()) {
                com.applovin.impl.sdk.o.h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f8892f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                }
                t2.a(this.adListener, (MaxAd) this.f8892f, (MaxError) maxErrorImpl2, true);
                this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f8892f);
                return false;
            }
        }
        if (!this.sdk.H().e() && !this.sdk.H().d()) {
            return true;
        }
        com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f8892f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) this.f8892f, (MaxError) maxErrorImpl3, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f8892f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(y2 y2Var) {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            List listB = y2Var.b("mappk_urls");
            if (CollectionUtils.isEmpty(listB)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listB));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(f2.a(y2Var)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(w3.a(y2Var, this.sdk)));
            this.sdk.p0().b(z4.R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        c3 c3Var = this.f8892f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return this.sdk.R() != null ? this.sdk.R().e(this.adUnitId) : this.sdk.Q().d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f8891e) {
            if (this.f8892f != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.logger.a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f8892f + "...");
                }
                this.sdk.X().destroyAd(this.f8892f);
            }
        }
        this.sdk.j().b(this);
        this.f8890d.a();
        g0 g0Var = this.f8896j;
        if (g0Var != null) {
            g0Var.a();
            this.f8896j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(String str) {
        c3 c3Var = this.f8892f;
        a((MaxAd) c3Var);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c3Var + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        t2.a(this.adListener, (MaxAd) c3Var, (MaxError) maxErrorImpl, true);
        this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (((Boolean) this.sdk.a(x4.C2)).booleanValue()) {
            this.sdk.p0().b(z4.R);
        }
        if (this.f8896j != null) {
            this.sdk.p0().b(z4.S);
            this.f8896j.a();
            this.f8896j = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c3 c3Var;
        if (this.f8894h.compareAndSet(true, false)) {
            synchronized (this.f8891e) {
                c3Var = this.f8892f;
                this.f8892f = null;
            }
            this.sdk.X().destroyAd(c3Var);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        final Long l10 = (Long) this.sdk.a(x4.D2);
        if (l10.longValue() <= 0) {
            return;
        }
        this.f8896j = g0.a(l10.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f8960b.a(l10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        Activity activityU0 = (Activity) this.f8903q.get();
        if (activityU0 == null) {
            activityU0 = this.sdk.u0();
        }
        Activity activity = activityU0;
        if (this.f8898l) {
            showAd(this.f8900n, this.f8901o, (ViewGroup) this.f8904r.get(), (Lifecycle) this.f8905s.get(), activity);
        } else {
            showAd(this.f8900n, this.f8901o, activity);
        }
    }

    public b createAdListenerWrapper() {
        return new b();
    }

    @Override // com.applovin.impl.mediation.ads.a
    public void destroy() {
        a(c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f8945b.c();
            }
        });
    }

    public boolean isReady() {
        boolean z10;
        synchronized (this.f8891e) {
            c3 c3Var = this.f8892f;
            z10 = c3Var != null && c3Var.X() && this.f8893g == c.READY;
        }
        if (!z10) {
            this.sdk.H().c(this.adUnitId);
        }
        return z10;
    }

    public void loadAd() {
        loadAd(com.applovin.impl.i.PUBLISHER_INITIATED);
    }

    public void loadAd(final com.applovin.impl.i iVar) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f8893g == c.DESTROYED) {
            boolean zC = n7.c(this.sdk);
            this.sdk.D().a(d2.S0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zC));
            if (zC) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            a aVar = this.f8887a;
            final Activity activity = aVar != null ? aVar.getActivity() : null;
            final Context context = (Context) this.f8888b.get();
            a(c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8954b.a(activity, context, iVar);
                }
            });
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f8892f + "), listener=" + this.adListener);
        }
        t2.f(this.adListener, (MaxAd) this.f8892f, true);
    }

    @Override // com.applovin.impl.sdk.a.InterfaceC0152a
    public void onAdExpired(t1 t1Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.logger.a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f8894h.set(true);
        a aVar = this.f8887a;
        Activity activity = aVar != null ? aVar.getActivity() : null;
        if (activity == null && (activity = this.sdk.e().b()) == null) {
            e();
            this.f8889c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.X().loadAd(this.adUnitId, null, this.adFormat, com.applovin.impl.i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f8889c);
        }
    }

    @Override // com.applovin.impl.j.b
    public void onCreativeIdGenerated(String str, String str2) {
        c3 c3Var = this.f8892f;
        if (c3Var == null || !c3Var.Q().equalsIgnoreCase(str)) {
            return;
        }
        this.f8892f.h(str2);
        t2.b(this.adReviewListener, str2, this.f8892f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        c3 c3Var;
        List listB = this.sdk.s0().b();
        if (!this.sdk.s0().d() || listB == null || (c3Var = this.f8892f) == null || listB.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            if (a(activity, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8964b.a(str, str2, activity);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f8892f.c() + "> which is not in the list of selected ad networks " + listB;
        com.applovin.impl.sdk.o.h(this.tag, str3);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f8962b.b(str3);
            }
        });
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        c3 c3Var;
        if (viewGroup == null || lifecycle == null) {
            com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
            if (com.applovin.impl.sdk.o.a()) {
                this.logger.a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f8892f + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            t2.a(this.adListener, (MaxAd) this.f8892f, (MaxError) maxErrorImpl, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f8892f);
            return;
        }
        if (!viewGroup.isShown() && ((Boolean) this.sdk.a(r3.f9740k8)).booleanValue()) {
            com.applovin.impl.sdk.o.h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
            MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
            t2.a(this.adListener, (MaxAd) this.f8892f, (MaxError) maxErrorImpl2, true);
            this.sdk.X().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f8892f);
            return;
        }
        List listB = this.sdk.s0().b();
        if (!this.sdk.s0().d() || listB == null || (c3Var = this.f8892f) == null || listB.contains(c3Var.c())) {
            if (activity == null) {
                activity = this.sdk.u0();
            }
            final Activity activity2 = activity;
            if (a(activity2, str)) {
                a(c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8948b.a(str, str2, activity2, viewGroup, lifecycle);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f8892f.c() + "> which is not in the list of selected ad networks " + listB;
        com.applovin.impl.sdk.o.h(this.tag, str3);
        a(c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f8946b.c(str3);
            }
        });
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.tag);
        sb2.append("{adUnitId='");
        sb2.append(this.adUnitId);
        sb2.append('\'');
        sb2.append(", adListener=");
        Object obj = this.adListener;
        if (obj == this.f8887a) {
            obj = "this";
        }
        sb2.append(obj);
        sb2.append(", revenueListener=");
        sb2.append(this.revenueListener);
        sb2.append(", requestListener");
        sb2.append(this.requestListener);
        sb2.append(", adReviewListener");
        sb2.append(this.adReviewListener);
        sb2.append(", isReady=");
        sb2.append(isReady());
        sb2.append('}');
        return sb2.toString();
    }
}
