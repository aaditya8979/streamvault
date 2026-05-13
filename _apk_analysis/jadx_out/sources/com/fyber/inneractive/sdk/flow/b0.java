package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRenderer;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerWithImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.network.z0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.y0;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 implements InneractiveAdRenderer, InneractiveInternalBrowserActivity.InternalBrowserListener, com.fyber.inneractive.sdk.click.f, com.fyber.inneractive.sdk.web.t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InneractiveAdSpot f16281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f16282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveUnitController.EventsListener f16283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16284d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16285e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16286f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Runnable f16287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.click.r f16288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z f16289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f16290j;

    public static void a(com.fyber.inneractive.sdk.cache.session.enums.a aVar, com.fyber.inneractive.sdk.cache.session.enums.c cVar) {
        com.fyber.inneractive.sdk.cache.session.e eVar = IAConfigManager.O.f15978x.f16170a;
        if (eVar != null) {
            com.fyber.inneractive.sdk.util.r.f19555a.execute(new com.fyber.inneractive.sdk.cache.session.d(eVar, aVar, cVar));
        }
    }

    public static void a(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f19392l;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.d("AD_CLICKED", new Object[0]);
        z0.b(str);
    }

    public int A() {
        return -1;
    }

    public int B() {
        return -1;
    }

    public final boolean C() {
        com.fyber.inneractive.sdk.config.global.r rVar;
        x xVar = this.f16282b;
        if (xVar != null && (rVar = xVar.f16697c) != null && rVar.a(com.fyber.inneractive.sdk.config.global.features.c.class) != null) {
            com.fyber.inneractive.sdk.config.global.features.c cVar = (com.fyber.inneractive.sdk.config.global.features.c) this.f16282b.f16697c.a(com.fyber.inneractive.sdk.config.global.features.c.class);
            cVar.getClass();
            if (new ArrayList(cVar.f16040c.values()).size() > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean D() {
        return false;
    }

    public boolean E() {
        x xVar = this.f16282b;
        if (xVar != null) {
            return xVar.c();
        }
        return true;
    }

    public boolean F() {
        return this instanceof com.fyber.inneractive.sdk.renderers.a0;
    }

    public final void G() {
        com.fyber.inneractive.sdk.response.e eVarB;
        Context contextY = y();
        if (this.f16285e || this.f16283c == null) {
            return;
        }
        IAlog.a("%sCalling external interface onAdImpression", IAlog.a(this));
        this.f16283c.onAdImpression(this.f16281a);
        x xVar = this.f16282b;
        if (xVar != null && (eVarB = xVar.b()) != null) {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager.f15978x;
            if (x0Var != null) {
                UnitDisplayType unitDisplayType = eVarB.f19396p;
                ImpressionData impressionData = eVarB.f19400t;
                x0Var.a(unitDisplayType, "LAST_DOMAIN_SHOWED", impressionData != null ? impressionData.getAdvertiserDomain() : null);
                x0Var.a(unitDisplayType, "LAST_APP_BUNDLE_ID", eVarB.A);
                if (this.f16282b.isVideoAd()) {
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_SKIPED"}[0], "0");
                    x0Var.a(unitDisplayType, new String[]{"LAST_VAST_CLICKED_TYPE"}[0], "0");
                }
                x0Var.a(unitDisplayType, new String[]{"LAST_CLICKED"}[0], "0");
            }
            y0 y0Var = iAConfigManager.A;
            com.fyber.inneractive.sdk.config.s0 s0Var = this.f16282b.f16698d;
            ImpressionData impressionData2 = eVarB.f19400t;
            if (s0Var != null) {
                OnGlobalImpressionDataListener onGlobalImpressionDataListener = y0Var.f19583a;
                if (onGlobalImpressionDataListener != null) {
                    com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) s0Var;
                    SpecialsBridge.fyberOnImpression(onGlobalImpressionDataListener, r0Var.f16094b, r0Var.f16093a, impressionData2);
                }
            } else {
                y0Var.getClass();
            }
            InneractiveUnitController.EventsListener eventsListener = this.f16283c;
            if (eventsListener instanceof InneractiveFullscreenAdEventsListenerWithImpressionData) {
                ((InneractiveFullscreenAdEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f16281a, eVarB.f19400t);
            } else if (eventsListener instanceof InneractiveAdViewEventsListenerWithImpressionData) {
                ((InneractiveAdViewEventsListenerWithImpressionData) eventsListener).onAdImpression(this.f16281a, eVarB.f19400t);
            }
            com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(contextY);
            if (bVarA == null) {
                bVarA = null;
            }
            String str = eVarB.f19393m;
            if (!TextUtils.isEmpty(str) && bVarA != null) {
                bVarA.a(str, null);
            }
        }
        this.f16285e = true;
    }

    public final void H() {
        if (this.f16283c != null) {
            IAlog.a("%sCalling external interface onAdWillOpenExternalApp", IAlog.a(this));
            this.f16283c.onAdWillOpenExternalApp(this.f16281a);
        }
    }

    public void I() {
        View viewZ = z();
        if (viewZ == null || this.f16290j == null || viewZ.getParent() == null || !(viewZ.getParent() instanceof ViewGroup)) {
            return;
        }
        viewZ.getLayoutParams();
        ((ViewGroup) viewZ.getParent()).removeView(this.f16290j);
        e(this.f16290j);
        this.f16290j = null;
    }

    public final void J() {
        x xVar = this.f16282b;
        if (xVar == null || xVar.b() == null) {
            return;
        }
        String str = this.f16282b.b().f19397q;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.e("%sfiring rewarded completion!", IAlog.a(this));
        IAlog.d("AD_REWARDED_COMPLETION", new Object[0]);
        z0.b(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.util.d0 a(android.content.Context r16, java.lang.String r17, com.fyber.inneractive.sdk.util.g1 r18, com.fyber.inneractive.sdk.util.g r19, boolean r20, com.fyber.inneractive.sdk.click.o r21) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.b0.a(android.content.Context, java.lang.String, com.fyber.inneractive.sdk.util.g1, com.fyber.inneractive.sdk.util.g, boolean, com.fyber.inneractive.sdk.click.o):com.fyber.inneractive.sdk.util.d0");
    }

    public final void a(Context context, boolean z10, float f10, float f11) {
        com.fyber.inneractive.sdk.response.e eVarB;
        if (z10) {
            IAlog.a("%s : will not notify click on fallback", IAlog.a(this));
            return;
        }
        if (this.f16283c != null) {
            IAlog.a("%sCalling external interface onAdClicked", IAlog.a(this));
            this.f16283c.onAdClicked(this.f16281a);
        }
        x xVar = this.f16282b;
        if (xVar == null || (eVarB = xVar.b()) == null) {
            return;
        }
        IAConfigManager.O.f15978x.a(eVarB.f19396p, "LAST_CLICKED", "1");
        com.fyber.inneractive.sdk.privacysandbox.b bVarA = com.fyber.inneractive.sdk.privacysandbox.b.a(context);
        if (bVarA == null) {
            bVarA = null;
        }
        String str = eVarB.f19394n;
        Float fValueOf = Float.valueOf(f10);
        Float fValueOf2 = Float.valueOf(f11);
        if (fValueOf.isNaN() || fValueOf2.isNaN() || f10 < 0.0f || f11 < 0.0f) {
            if (TextUtils.isEmpty(str) || bVarA == null) {
                return;
            }
            bVarA.a(str, null);
            return;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f10, f11, 0);
        if (TextUtils.isEmpty(str) || bVarA == null) {
            return;
        }
        bVarA.a(str, motionEventObtain);
    }

    @Override // com.fyber.inneractive.sdk.click.f
    public final void a(com.fyber.inneractive.sdk.click.b bVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        b(bVar, g1Var, gVar);
    }

    public final void a(WebViewRendererProcessHasGoneError webViewRendererProcessHasGoneError) {
        String simpleName = webViewRendererProcessHasGoneError.getClass().getSimpleName();
        String message = webViewRendererProcessHasGoneError.getMessage();
        x xVar = this.f16282b;
        com.fyber.inneractive.sdk.network.z.a(simpleName, message, xVar != null ? xVar.f16695a : null, xVar != null ? xVar.b() : null);
        if (this.f16283c != null) {
            IAlog.a("%sCalling external interface onAdEnteredErrorState: %s", IAlog.a(this), webViewRendererProcessHasGoneError.getMessage());
            this.f16283c.onAdEnteredErrorState(this.f16281a, webViewRendererProcessHasGoneError);
        }
    }

    public final void a(String str, com.fyber.inneractive.sdk.click.q qVar) {
        com.fyber.inneractive.sdk.response.e eVarB;
        JSONArray jSONArrayB;
        InneractiveAdRequest inneractiveAdRequest;
        x xVar = this.f16282b;
        if (xVar != null) {
            eVarB = xVar.b();
            x xVar2 = this.f16282b;
            inneractiveAdRequest = xVar2.f16695a;
            com.fyber.inneractive.sdk.config.global.r rVar = xVar2.f16697c;
            jSONArrayB = rVar != null ? rVar.b() : null;
        } else {
            eVarB = null;
            jSONArrayB = null;
            inneractiveAdRequest = null;
        }
        com.fyber.inneractive.sdk.network.u uVar = com.fyber.inneractive.sdk.network.u.EXTERNAL_BROWSER_OPENED;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(eVarB);
        wVar.f17078c = uVar;
        wVar.f17076a = inneractiveAdRequest;
        wVar.f17079d = jSONArrayB;
        wVar.a("url", str).a("fallback", (qVar == com.fyber.inneractive.sdk.click.q.OPENED_USING_CHROME_NAVIGATE || qVar == com.fyber.inneractive.sdk.click.q.OPENED_IN_EXTERNAL_BROWSER) ? "chrome" : "na").a((String) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.fyber.inneractive.sdk.click.b r11, com.fyber.inneractive.sdk.util.g1 r12, com.fyber.inneractive.sdk.util.g r13) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.b0.b(com.fyber.inneractive.sdk.click.b, com.fyber.inneractive.sdk.util.g1, com.fyber.inneractive.sdk.util.g):void");
    }

    public final void b(com.fyber.inneractive.sdk.response.e eVar) {
        String str = eVar.f19391k;
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        IAlog.e("%sfiring impression!", IAlog.a(this));
        IAlog.d("AD_IMPRESSION", new Object[0]);
        z0.b(str);
    }

    public final Context c(View view) {
        View view2;
        int i10 = 0;
        View[] viewArr = {view, z()};
        while (true) {
            if (i10 >= 2) {
                view2 = null;
                break;
            }
            view2 = viewArr[i10];
            if (view2 != null) {
                break;
            }
            i10++;
        }
        return com.fyber.inneractive.sdk.util.o.a(view2);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public boolean canRefreshAd() {
        return true;
    }

    public void d(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        if (this.f16284d) {
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
            this.f16284d = false;
        }
        Runnable runnable = this.f16287g;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.removeCallbacks(runnable);
            this.f16287g = null;
        }
        this.f16282b = null;
        this.f16283c = null;
        this.f16281a = null;
        if (this.f16288h != null) {
            I();
            com.fyber.inneractive.sdk.click.r rVar = this.f16288h;
            rVar.f15946e = true;
            Iterator it = rVar.f15950i.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.click.a) it.next()).cancel();
            }
            rVar.f15950i.clear();
            h1 h1Var = rVar.f15949h;
            if (h1Var != null) {
                h1Var.f17034a = true;
            }
            rVar.f15945d = null;
            this.f16288h = null;
            this.f16289i = null;
        }
    }

    public void e(View view) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.f16281a = inneractiveAdSpot;
        this.f16282b = inneractiveAdSpot.getAdContent();
        this.f16283c = inneractiveAdSpot.getSelectedUnitController().getEventsListener();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onApplicationInBackground() {
        H();
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity.InternalBrowserListener
    public final void onInternalBrowserDismissed() {
        IAlog.a("onInternalBrowserDismissed callback called", new Object[0]);
        if (this.f16284d) {
            this.f16284d = false;
            InneractiveInternalBrowserActivity.setInternalBrowserListener(null);
        }
        if (this.f16283c != null) {
            IAlog.a("%sCalling external interface onAdWillCloseInternalBrowser", IAlog.a(this));
            this.f16283c.onAdWillCloseInternalBrowser(this.f16281a);
        }
    }

    public final com.fyber.inneractive.sdk.ignite.m p() {
        x xVar = this.f16282b;
        return (xVar == null || !xVar.d() || this.f16282b.b() == null) ? com.fyber.inneractive.sdk.ignite.m.NONE : this.f16282b.b().H;
    }

    public void u() {
        G();
    }

    public void x() {
        View viewZ = z();
        if (viewZ == null || viewZ.getParent() == null || !(viewZ.getParent() instanceof ViewGroup) || this.f16290j != null) {
            return;
        }
        View viewInflate = View.inflate(viewZ.getContext(), R.layout.ia_layout_click_overlay, null);
        this.f16290j = viewInflate;
        if (viewInflate != null) {
            ((ViewGroup) viewZ.getParent()).addView(this.f16290j, viewZ.getLayoutParams());
            d(this.f16290j);
        }
    }

    public Context y() {
        return com.fyber.inneractive.sdk.util.o.a(z());
    }

    public abstract View z();
}
