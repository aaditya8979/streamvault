package com.fyber.inneractive.sdk.flow.endcard;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.i1;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class u extends a implements ValueCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.flow.vast.a f16376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.controller.d f16377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewGroup f16380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f16381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f16382i;

    public u(b bVar) {
        super(bVar);
        this.f16379f = false;
        this.f16381h = new AtomicBoolean(false);
        this.f16382i = new s(this);
        x0 x0Var = bVar.f16308c;
        t0 t0Var = x0Var.f16702b;
        InneractiveAdRequest inneractiveAdRequest = x0Var.f16703c;
        com.fyber.inneractive.sdk.response.g gVar = x0Var.f16704d;
        this.f16376c = new com.fyber.inneractive.sdk.flow.vast.a(gVar.f19396p, inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen(), gVar.f19385e, gVar.f19386f, t0Var.f16698d);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        com.fyber.inneractive.sdk.util.v.a(b());
        i1 i1Var = e().f17149a;
        if (i1Var != null) {
            i1Var.a(false);
        }
    }

    public final void a(com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.a aVar) {
        String str = this.f16378e;
        if (TextUtils.isEmpty(str)) {
            throw new com.fyber.inneractive.sdk.flow.vast.h("End-Card HTML not loaded", "No template");
        }
        e().a(str, aVar == null ? this.f16382i : new t(this, aVar), !(this instanceof p));
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        ViewGroup viewGroup = this.f16380g;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (!this.f16379f) {
            return null;
        }
        i1 i1Var = e().f17149a;
        com.fyber.inneractive.sdk.web.m mVar = i1Var == null ? null : i1Var.f19631b;
        if (mVar == null) {
            return null;
        }
        ViewGroup viewGroupA = a.a(mVar);
        this.f16380g = viewGroupA;
        return viewGroupA;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a
    public final void c() {
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f17149a;
        if (i1Var != null) {
            UnitDisplayType unitDisplayType = dVarE.f17151c;
            if (!UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) && !UnitDisplayType.REWARDED.equals(unitDisplayType)) {
                UnitDisplayType.VERTICAL.equals(unitDisplayType);
            }
            i1Var.l();
        }
    }

    public q d() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        a();
        com.fyber.inneractive.sdk.player.controller.d dVarE = e();
        i1 i1Var = dVarE.f17149a;
        if (i1Var != null) {
            i1Var.e();
            dVarE.f17149a = null;
        }
    }

    public final com.fyber.inneractive.sdk.player.controller.d e() {
        com.fyber.inneractive.sdk.player.controller.d dVar = this.f16377d;
        if (dVar == null) {
            b bVar = this.f16305b;
            dVar = new com.fyber.inneractive.sdk.player.controller.d(bVar.f16308c.f16701a, this.f16376c, bVar.i(), d());
            x0 x0Var = this.f16305b.f16308c;
            i1 i1Var = dVar.f17149a;
            if (i1Var != null) {
                if (i1Var.f19648s == null) {
                    i1Var.setAdContent(x0Var.f16702b);
                }
                if (i1Var.f19647r == null) {
                    i1Var.setAdRequest(x0Var.f16703c);
                }
                if (i1Var.f19649t == null) {
                    i1Var.setAdResponse(x0Var.f16704d);
                }
            }
            this.f16377d = dVar;
        }
        return dVar;
    }

    public boolean f() {
        com.fyber.inneractive.sdk.config.s sVar = IAConfigManager.O.f15975u;
        return sVar != null && sVar.f16144b.a(false, "dt_plbl");
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str = (String) obj;
        if (!TextUtils.isEmpty(str)) {
            IAlog.a("%s Playable detected: %s", this.f16304a, str);
            try {
                this.f16305b.a(new JSONArray(str));
            } catch (JSONException e10) {
                IAlog.f("%s invalid playable detection method: %s", this.f16304a, e10.getMessage());
            }
        }
        this.f16305b.m();
    }
}
