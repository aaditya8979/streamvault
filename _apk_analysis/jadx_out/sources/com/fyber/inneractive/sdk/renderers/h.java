package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.l0;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.s0;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.q0;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.safedk.android.internal.special.SpecialsBridge;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements com.fyber.inneractive.sdk.web.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f19324a;

    public h(l lVar) {
        this.f19324a = lVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        s0 s0Var;
        l0 l0Var;
        l lVar = this.f19324a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(lVar));
        ViewGroup viewGroup = this.f19324a.f19332p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? com.fyber.inneractive.sdk.util.o.f19548a : this.f19324a.f19332p.getContext();
        if (context != null) {
            l lVar2 = this.f19324a;
            if (lVar2.f16286f) {
                com.fyber.inneractive.sdk.flow.x xVar = lVar2.f16282b;
                com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f16696b : null;
                if (eVar != null) {
                    com.fyber.inneractive.sdk.flow.b0.a(eVar);
                }
                com.fyber.inneractive.sdk.flow.x xVar2 = this.f19324a.f16282b;
                if (xVar2 != null && (s0Var = ((q0) xVar2).f16698d) != null && (l0Var = ((r0) s0Var).f16095c) != null) {
                    com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.CLICK, l0Var.f16080b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
                }
                return this.f19324a.a(context, str, g1Var, com.fyber.inneractive.sdk.util.g.DISPLAY, false, null);
            }
        }
        return new com.fyber.inneractive.sdk.util.d0(g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        this.f19324a.a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        l lVar = this.f19324a;
        InneractiveUnitController.EventsListener eventsListener = lVar.f16283c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(lVar.f16281a, mraidVideoFailedToDisplayError);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        l lVar = this.f19324a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.a(lVar));
        ViewGroup viewGroup = this.f19324a.f19332p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        l lVar2 = this.f19324a;
        if (lVar2.f19338v) {
            IAlog.a("%sredirect already reported for this ad", IAlog.a(lVar2));
            return;
        }
        com.fyber.inneractive.sdk.network.b0.a(lVar2.f19332p.getContext(), str, str2, this.f19324a.f16282b);
        l lVar3 = this.f19324a;
        lVar3.f19338v = true;
        IAlog.a("%sreporting auto redirect", IAlog.a(lVar3));
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(boolean z10) {
        s0 s0Var;
        l0 l0Var;
        l lVar = this.f19324a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onVisibilityChanged: %s", IAlog.a(lVar), Boolean.valueOf(z10));
        if (!z10) {
            d dVar = this.f19324a.f19341y;
            if (dVar != null && dVar.f19315g) {
                dVar.f19315g = false;
                com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(dVar.f19318j);
            }
            this.f19324a.c(false);
            return;
        }
        l lVar2 = this.f19324a;
        if (lVar2.f19331o) {
            d dVar2 = lVar2.f19341y;
            if (dVar2 != null && !dVar2.f19316h && !dVar2.f19315g && dVar2.f19314f != 0) {
                dVar2.f19314f = 0L;
                dVar2.f19315g = true;
                dVar2.a();
            }
            this.f19324a.O();
            return;
        }
        IAlog.a("%sonShownForTheFirstTime called", IAlog.a(lVar2));
        com.fyber.inneractive.sdk.flow.x xVar = lVar2.f16282b;
        com.fyber.inneractive.sdk.response.e eVar = xVar != null ? ((q0) xVar).f16696b : null;
        if (eVar != null) {
            IAmraidWebViewController iAmraidWebViewController = lVar2.f19329m;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.l();
            }
            lVar2.b(eVar);
            lVar2.G();
        }
        long jM = lVar2.M();
        lVar2.f19327k = jM;
        if (jM != 0) {
            lVar2.a(true, jM);
        }
        com.fyber.inneractive.sdk.flow.x xVar2 = lVar2.f16282b;
        if (xVar2 != null && (s0Var = ((q0) xVar2).f16698d) != null && (l0Var = ((r0) s0Var).f16095c) != null) {
            com.fyber.inneractive.sdk.flow.b0.a(com.fyber.inneractive.sdk.cache.session.enums.a.IMPRESSION, l0Var.f16080b == UnitDisplayType.MRECT ? com.fyber.inneractive.sdk.cache.session.enums.c.RECTANGLE_DISPLAY : com.fyber.inneractive.sdk.cache.session.enums.c.BANNER_DISPLAY);
        }
        this.f19324a.f19331o = true;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z10, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        Context contextA = com.fyber.inneractive.sdk.util.o.a(this.f19324a.z());
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(contextA, str);
        if (zStartRichMediaIntent) {
            l lVar = this.f19324a;
            if (lVar.f16283c != null) {
                lVar.a(contextA, false, Float.NaN, Float.NaN);
            }
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b() {
        this.f19324a.c(true);
        l lVar = this.f19324a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onResize", IAlog.a(lVar));
        l lVar2 = this.f19324a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f16283c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(lVar2.f16281a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z10) {
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        l lVar = this.f19324a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(lVar));
        l lVar2 = this.f19324a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f16283c;
        if (eventsListener != null) {
            SpecialsBridge.fyberOnAdExpanded((InneractiveAdViewEventsListener) eventsListener, lVar2.f16281a);
        }
        l lVar3 = this.f19324a;
        lVar3.getClass();
        IAlog.a("%sweb view callback: onExpand", IAlog.a(lVar3));
        this.f19324a.c(true);
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        l lVar = this.f19324a;
        lVar.a(lVar.y(), false, Float.NaN, Float.NaN);
        this.f19324a.H();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        l lVar = this.f19324a;
        lVar.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(lVar));
        l lVar2 = this.f19324a;
        InneractiveUnitController.EventsListener eventsListener = lVar2.f16283c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(lVar2.f16281a);
        }
        this.f19324a.O();
        l lVar3 = this.f19324a;
        lVar3.getClass();
        IAlog.a("%sweb view callback: onClose", IAlog.a(lVar3));
    }
}
