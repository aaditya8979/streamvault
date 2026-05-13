package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements j, com.fyber.inneractive.sdk.util.m0, l, x0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f19631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j0 f19632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k0 f19633d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f19635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j1 f19636g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f19639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19640k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f19641l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f19642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f19643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e f19644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f19645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f19646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InneractiveAdRequest f19647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.x f19648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.fyber.inneractive.sdk.response.e f19649t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f19630a = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f19637h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Rect f19638i = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19634e = false;

    public i(boolean z10, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.f19640k = z10;
        this.f19631b = a(rVar);
        i1 i1Var = (i1) this;
        this.f19643n = new c(i1Var);
        this.f19642m = new d(i1Var);
    }

    public final m a(com.fyber.inneractive.sdk.config.global.r rVar) {
        int iMax;
        boolean z10;
        int i10;
        int i11;
        m mVar = new m();
        if (rVar != null) {
            com.fyber.inneractive.sdk.config.global.features.f fVar = (com.fyber.inneractive.sdk.config.global.features.f) rVar.a(com.fyber.inneractive.sdk.config.global.features.f.class);
            Boolean boolC = fVar.c("agg_res");
            boolean zBooleanValue = boolC != null ? boolC.booleanValue() : false;
            Integer numA = fVar.a("agg_res_ct");
            int iMax2 = Math.max(numA != null ? numA.intValue() : 500, 50);
            Integer numA2 = fVar.a("agg_res_rt");
            int iMax3 = Math.max(numA2 != null ? numA2.intValue() : 500, 50);
            Integer numA3 = fVar.a("agg_res_retries");
            iMax = Math.max(numA3 != null ? numA3.intValue() : 2, 1);
            z10 = zBooleanValue;
            i11 = iMax3;
            i10 = iMax2;
        } else {
            iMax = 2;
            z10 = false;
            i10 = 500;
            i11 = 500;
        }
        k0 k0Var = new k0(this, z10, i10, i11, iMax);
        this.f19633d = k0Var;
        mVar.setWebViewClient(k0Var);
        return mVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a() {
        j1 j1Var = this.f19636g;
        if (j1Var != null) {
            j1Var.a();
        }
        b(true);
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        if (f10 == this.f19637h && rect.equals(this.f19638i)) {
            return;
        }
        this.f19637h = f10;
        this.f19638i.set(rect);
        m mVar = this.f19631b;
        if (mVar != null) {
            mVar.a();
        }
    }

    public final void a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f19631b;
        if (mVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(mVar, layoutParams);
            } else {
                viewGroup.addView(mVar);
            }
            com.fyber.inneractive.sdk.util.l0.f19539a.a(viewGroup.getContext(), this.f19631b, this);
            this.f19631b.setTapListener(this);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void a(WebView webView) {
    }

    public final void a(f fVar) {
        IAlog.e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f19639j) {
            IAlog.e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            fVar.d();
            i();
            return;
        }
        if (!this.f19640k) {
            d dVar = this.f19642m;
            if (dVar != null) {
                com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar);
            }
            this.f19641l = null;
            fVar.d();
            return;
        }
        IAlog.e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
        d dVar2 = this.f19642m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar2);
        }
        this.f19641l = fVar;
        if (this.f19642m != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(this.f19642m, IAConfigManager.O.f15975u.f16144b.a("click_timeout", 1000, 1000));
        }
    }

    public void a(boolean z10) {
        IAlog.a("%sonWebViewVisibilityChanged called with: %s", IAlog.a(this), Boolean.valueOf(z10));
        j1 j1Var = this.f19636g;
        if (j1Var != null) {
            j1Var.a(z10);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public boolean a(WebView webView, String str) {
        IAlog.a("%shandleUrl called with: %s", IAlog.a(this), str);
        if (this.f19631b == null) {
            IAlog.a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (com.fyber.inneractive.sdk.util.j1.a(str)) {
            DTExchangeNetworkBridge.webviewLoadUrl(this.f19631b, "chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        com.fyber.inneractive.sdk.util.g1 g1VarG = g();
        if (a(str, g1VarG)) {
            return true;
        }
        a(new h(this, str, g1VarG));
        return true;
    }

    public abstract boolean a(String str, com.fyber.inneractive.sdk.util.g1 g1Var);

    public void b(boolean z10) {
        IAlog.a("%s destroy is fatal: %b", IAlog.a(this), Boolean.valueOf(z10));
        e eVar = this.f19644o;
        if (eVar != null && !eVar.f19606a.isTerminated() && !eVar.f19606a.isShutdown()) {
            e eVar2 = this.f19644o;
            eVar2.f19611f = true;
            eVar2.f19606a.shutdownNow();
            Handler handler = eVar2.f19607b;
            if (handler != null) {
                com.fyber.inneractive.sdk.util.d dVar = eVar2.f19609d;
                if (dVar != null) {
                    handler.removeCallbacks(dVar);
                }
                com.fyber.inneractive.sdk.util.e eVar3 = eVar2.f19608c;
                if (eVar3 != null) {
                    eVar2.f19607b.removeCallbacks(eVar3);
                }
                eVar2.f19607b = null;
            }
            this.f19644o = null;
        }
        m mVar = this.f19631b;
        if (mVar != null) {
            com.fyber.inneractive.sdk.util.l0.f19539a.a(mVar);
            com.fyber.inneractive.sdk.util.v.a(this.f19631b);
            this.f19631b.setWebChromeClient(null);
            if (f() == null) {
                this.f19631b.destroy();
            } else {
                com.fyber.inneractive.sdk.measurement.tracker.e eVarF = f();
                AdSession adSession = eVarF.f16780a;
                if (adSession != null) {
                    try {
                        adSession.finish();
                    } catch (Throwable unused) {
                    }
                    com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVarF), z10 ? 0 : 1000);
                    eVarF.f16780a = null;
                    eVarF.f16781b = null;
                }
            }
        }
        k0 k0Var = this.f19633d;
        if (k0Var != null) {
            k0Var.f19676e = null;
        }
        c cVar = this.f19643n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(cVar);
        }
        d dVar2 = this.f19642m;
        if (dVar2 != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar2);
        }
        this.f19636g = null;
        if (!z10) {
            this.f19635f = null;
        }
        this.f19631b = null;
        this.f19632c = null;
        this.f19633d = null;
        this.f19648s = null;
        this.f19647r = null;
    }

    @Override // com.fyber.inneractive.sdk.web.j
    public void d() {
    }

    public void e() {
        b(false);
    }

    public abstract com.fyber.inneractive.sdk.measurement.tracker.e f();

    public com.fyber.inneractive.sdk.util.g1 g() {
        m mVar = this.f19631b;
        return mVar != null ? mVar.getLastClickedLocation() : new com.fyber.inneractive.sdk.util.g1();
    }

    public void h() {
        WebSettings settings = this.f19631b.getSettings();
        boolean z10 = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.O.f15971q && com.fyber.inneractive.sdk.util.s.a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f19634e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        m mVar = this.f19631b;
        mVar.setHorizontalScrollBarEnabled(false);
        mVar.setHorizontalScrollbarOverlay(false);
        mVar.setVerticalScrollBarEnabled(false);
        mVar.setVerticalScrollbarOverlay(false);
        mVar.getSettings().setSupportZoom(false);
        this.f19631b.setFocusable(true);
        this.f19631b.setBackgroundColor(0);
        j0 j0Var = new j0();
        this.f19632c = j0Var;
        this.f19631b.setWebChromeClient(j0Var);
        try {
            Context context = this.f19631b.getContext();
            ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z10 = false;
            }
            WebView.setWebContentsDebuggingEnabled(z10);
        } catch (Exception unused) {
            IAlog.a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f19631b.setListener(this);
    }

    public final void i() {
        IAlog.a("IAWebViewController resetClick()", new Object[0]);
        c cVar = this.f19643n;
        if (cVar != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(cVar);
        }
        d dVar = this.f19642m;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar);
        }
        this.f19639j = false;
    }

    public void setAdContent(com.fyber.inneractive.sdk.flow.x xVar) {
        this.f19648s = xVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f19647r = inneractiveAdRequest;
    }

    public void setAdResponse(com.fyber.inneractive.sdk.response.e eVar) {
        this.f19649t = eVar;
    }

    public void setListener(j1 j1Var) {
        this.f19636g = j1Var;
    }
}
