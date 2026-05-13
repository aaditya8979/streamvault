package com.fyber.inneractive.sdk.renderers;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.p0;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.a1;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v1;
import com.iab.omid.library.fyber.adsession.AdSession;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends p0 {
    public v1 E;
    public com.fyber.inneractive.sdk.external.g I;
    public a1 J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public s f19359w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public IAmraidWebViewController f19361y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f19360x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f19362z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public UnitDisplayType F = UnitDisplayType.INTERSTITIAL;
    public boolean G = false;
    public boolean H = false;

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean K() {
        return !this.B && this.f19361y.X;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int M() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f16282b;
        if (xVar == null || (rVar = ((q0) xVar).f16697c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f16282b).f16697c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_clickable_area_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final int N() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        Integer numA;
        com.fyber.inneractive.sdk.flow.x xVar = this.f16282b;
        if (xVar == null || (rVar = ((q0) xVar).f16697c) == null || rVar.a(com.fyber.inneractive.sdk.config.global.features.e.class) == null || (numA = ((com.fyber.inneractive.sdk.config.global.features.e) ((q0) this.f16282b).f16697c.a(com.fyber.inneractive.sdk.config.global.features.e.class)).a("close_visible_size_dp")) == null) {
            return -1;
        }
        return numA.intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    @Override // com.fyber.inneractive.sdk.flow.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long O() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.t.O():long");
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final boolean P() {
        return false;
    }

    public final void Q() {
        IAlog.a("%sprovide reward called", IAlog.a(this));
        if (this.H) {
            IAlog.a("%sreward was already provided", IAlog.a(this));
            return;
        }
        IAlog.a("%sreward sent", IAlog.a(this));
        if (this.I != null) {
            com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.COMPLETION, com.fyber.inneractive.sdk.cache.session.enums.c.REWARDED_DISPLAY);
            com.fyber.inneractive.sdk.external.g gVar = this.I;
            i0 i0Var = (i0) com.fyber.inneractive.sdk.util.v.a(gVar.f16269a.mAdSpot);
            InneractiveFullScreenAdRewardedListener inneractiveFullScreenAdRewardedListener = gVar.f16269a.f16247b;
            if (inneractiveFullScreenAdRewardedListener != null && i0Var != null) {
                inneractiveFullScreenAdRewardedListener.onAdRewarded(i0Var);
            }
        }
        IAmraidWebViewController iAmraidWebViewController = this.f19361y;
        if (iAmraidWebViewController == null || !iAmraidWebViewController.D) {
            J();
        }
        this.H = true;
    }

    public final void R() {
        IAmraidWebViewController iAmraidWebViewController;
        if (this.f16282b == null || (iAmraidWebViewController = this.f19361y) == null) {
            IAlog.a("updateWebViewLayoutParams called, but web view is invalid", new Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.web.m mVar = iAmraidWebViewController.f19631b;
        if (mVar != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            mVar.setLayoutParams(layoutParams);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final long a(long j10) {
        if (this.F == UnitDisplayType.REWARDED) {
            return 0L;
        }
        if (this.f16524t) {
            return j10;
        }
        long j11 = 13;
        try {
            j11 = Long.parseLong(IAConfigManager.O.f15975u.f16144b.a("mraid_x_fallback_delay", Long.toString(13L)));
        } catch (Throwable unused) {
        }
        return j11 * 1000;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a() {
        R();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.external.g gVar) {
        this.I = gVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void a(com.fyber.inneractive.sdk.interfaces.e eVar, Activity activity) throws InneractiveUnitController.AdDisplayError {
        s0 s0Var;
        super.a(eVar, activity);
        com.fyber.inneractive.sdk.flow.x xVar = this.f16282b;
        l0 l0Var = (xVar == null || (s0Var = ((q0) xVar).f16698d) == null) ? null : ((r0) s0Var).f16095c;
        if (l0Var == null) {
            IAlog.f("%sNo display config for full screen mraid ad renderer! Cannot render", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No display config for full screen mraid");
        }
        IAmraidWebViewController iAmraidWebViewController = xVar != null ? ((q0) xVar).f16528i : null;
        this.f19361y = iAmraidWebViewController;
        if (iAmraidWebViewController == null || iAmraidWebViewController.f19631b == null) {
            IAlog.f("%sWeb view controller content is not valid. Web view might have crashed", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Web view could not be loaded");
        }
        ((q0) xVar).f();
        this.F = l0Var.f16080b;
        this.f19362z = false;
        this.A = false;
        this.J = new a1(this.f16281a);
        this.f16515k = eVar;
        IAmraidWebViewController iAmraidWebViewController2 = this.f19361y;
        if (iAmraidWebViewController2 == null) {
            IAlog.f("InneractiveFullscreenMraidAdRenderer.renderAd: Spot ad content is not the right content :( %s", this.f16282b);
            return;
        }
        iAmraidWebViewController2.a(eVar.getCloseButton(), com.fyber.inneractive.sdk.measurement.tracker.d.CloseButton);
        com.fyber.inneractive.sdk.response.f fVar = (com.fyber.inneractive.sdk.response.f) ((q0) this.f16282b).f16696b;
        int i10 = fVar.f19385e;
        int i11 = fVar.f19386f;
        boolean z10 = (i10 == 300 && i11 == 250) || (i10 == 600 && i11 == 500);
        this.B = z10;
        if (z10) {
            this.f19361y.setAdDefaultSize(com.fyber.inneractive.sdk.util.o.a(i10), com.fyber.inneractive.sdk.util.o.a(i11));
        }
        if (this.f19359w == null) {
            this.f19359w = new s(this);
        }
        this.f19361y.setListener(this.f19359w);
        InneractiveAdSpot inneractiveAdSpot = this.f16281a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && activity != null) {
            com.fyber.inneractive.sdk.flow.x adContent = this.f16281a.getAdContent();
            com.fyber.inneractive.sdk.flow.g gVar = new com.fyber.inneractive.sdk.flow.g(activity, false, adContent.f16695a, adContent.b(), adContent.f16697c);
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.ia_identifier_overlay);
            IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
            IFyberAdIdentifier iFyberAdIdentifier = gVar.f16396d;
            iFyberAdIdentifier.f19485k = corner;
            iFyberAdIdentifier.a(viewGroup);
            viewGroup.setVisibility(0);
            this.f19361y.a(viewGroup, com.fyber.inneractive.sdk.measurement.tracker.d.IdentifierView);
        }
        R();
        IAmraidWebViewController iAmraidWebViewController3 = this.f19361y;
        ViewGroup layout = this.f16515k.getLayout();
        InneractiveAdRequest inneractiveAdRequest = ((q0) this.f16282b).f16695a;
        iAmraidWebViewController3.a(layout, (ViewGroup.LayoutParams) null);
        this.f19362z = true;
        if (this.F == UnitDisplayType.REWARDED) {
            v1 v1Var = new v1(TimeUnit.SECONDS, IAConfigManager.O.f15975u.f16144b.a("rewarded_mraid_delay", 31, 30));
            this.E = v1Var;
            v1Var.f19580e = new r(this);
            t1 t1Var = new t1(v1Var);
            v1Var.f19578c = t1Var;
            v1Var.f19579d = false;
            t1Var.sendEmptyMessage(1932593528);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void b(boolean z10) {
        if (!K()) {
            if (z10) {
                this.f16525u.a((String) null);
            } else {
                com.fyber.inneractive.sdk.util.a aVar = this.f16525u;
                aVar.f19506d = 0L;
                aVar.f19507e = 0L;
                aVar.f19508f = 0L;
                aVar.f19504b = false;
            }
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f16515k;
        if (eVar != null) {
            eVar.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0
    public final /* bridge */ /* synthetic */ boolean b(com.fyber.inneractive.sdk.flow.x xVar) {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void d(View view) {
        IAmraidWebViewController iAmraidWebViewController = this.f19361y;
        if (iAmraidWebViewController != null) {
            iAmraidWebViewController.a(view, com.fyber.inneractive.sdk.measurement.tracker.d.ProgressOverlay);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        InneractiveUnitController.EventsListener eventsListener;
        if (this.f19362z && !this.A && (eventsListener = this.f16283c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f16281a);
        }
        this.f19359w = null;
        v1 v1Var = this.E;
        if (v1Var != null) {
            v1Var.f19580e = null;
            this.E = null;
        }
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final void e(View view) {
        com.fyber.inneractive.sdk.measurement.tracker.e eVar;
        IAmraidWebViewController iAmraidWebViewController = this.f19361y;
        if (iAmraidWebViewController == null || (eVar = iAmraidWebViewController.I) == null) {
            return;
        }
        try {
            AdSession adSession = eVar.f16780a;
            if (adSession == null || view == null) {
                return;
            }
            adSession.removeFriendlyObstruction(view);
        } catch (Throwable unused) {
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final void l() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        InneractiveUnitController.EventsListener eventsListener;
        if (this.F == UnitDisplayType.REWARDED && this.G) {
            Q();
        }
        if (!this.A && (eventsListener = this.f16283c) != null) {
            this.A = true;
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdDismissed(this.f16281a);
        }
        a1 a1Var = this.J;
        if (a1Var != null && a1Var.f19510b != 0) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - a1Var.f19510b) - a1Var.f19512d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long seconds = timeUnit.toSeconds(jCurrentTimeMillis);
            long millis = timeUnit.toMillis(jCurrentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
            Locale locale = Locale.US;
            String str = seconds + "." + millis;
            a1Var.f19510b = 0L;
            a1Var.f19511c = 0L;
            a1Var.f19512d = 0L;
            InneractiveAdSpot inneractiveAdSpot = a1Var.f19509a;
            com.fyber.inneractive.sdk.flow.x adContent = inneractiveAdSpot != null ? inneractiveAdSpot.getAdContent() : null;
            com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.INTERSTITIAL_VIEW_TIME;
            InneractiveAdRequest inneractiveAdRequest = adContent != null ? adContent.f16695a : null;
            com.fyber.inneractive.sdk.response.e eVarB = adContent != null ? adContent.b() : null;
            JSONArray jSONArrayB = (adContent == null || (rVar = adContent.f16697c) == null) ? null : rVar.b();
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
            wVar.f17078c = uVar;
            wVar.f17076a = inneractiveAdRequest;
            wVar.f17079d = jSONArrayB;
            wVar.a("time", str);
            wVar.a((String) null);
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f16281a;
        if (inneractiveAdSpot2 == null || !(inneractiveAdSpot2 instanceof i0)) {
            return;
        }
        ((i0) inneractiveAdSpot2).a();
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void n() {
        v1 v1Var;
        super.n();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f19579d = false;
            v1Var.a(SystemClock.uptimeMillis());
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            if (a1Var.f19510b == 0) {
                a1Var.f19510b = System.currentTimeMillis();
            }
            if (a1Var.f19511c > 0) {
                a1Var.f19512d += System.currentTimeMillis() - a1Var.f19511c;
                a1Var.f19511c = 0L;
            }
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f16525u;
        if (!aVar.f19504b || aVar.f19507e <= 0) {
            return;
        }
        aVar.f19508f += System.currentTimeMillis() - aVar.f19507e;
        aVar.f19507e = 0L;
    }

    @Override // com.fyber.inneractive.sdk.flow.p0, com.fyber.inneractive.sdk.interfaces.f
    public final void s() {
        v1 v1Var;
        super.s();
        if (this.F == UnitDisplayType.REWARDED && (v1Var = this.E) != null) {
            v1Var.f19579d = true;
            t1 t1Var = v1Var.f19578c;
            if (t1Var != null) {
                t1Var.removeMessages(1932593528);
            }
        }
        a1 a1Var = this.J;
        if (a1Var != null) {
            a1Var.f19511c = System.currentTimeMillis();
        }
        com.fyber.inneractive.sdk.util.a aVar = this.f16525u;
        if (aVar.f19504b) {
            aVar.f19507e = System.currentTimeMillis();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.f
    public final boolean v() {
        boolean z10;
        if (this.f16515k == null) {
            z10 = true;
        } else if (this.F == UnitDisplayType.REWARDED) {
            if (this.G) {
                Q();
            }
            z10 = this.G;
        } else {
            z10 = this.f16520p;
        }
        if (!z10) {
            return true;
        }
        com.fyber.inneractive.sdk.interfaces.e eVar = this.f16515k;
        if (eVar == null) {
            return false;
        }
        eVar.dismissAd(true);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        IAmraidWebViewController iAmraidWebViewController = this.f19361y;
        return c(iAmraidWebViewController != null ? iAmraidWebViewController.f19631b : null);
    }
}
