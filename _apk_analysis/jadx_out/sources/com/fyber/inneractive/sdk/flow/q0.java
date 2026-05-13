package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IAmraidWebViewController f16528i;

    public q0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(s0Var, rVar);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.l0 l0Var;
        UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f16698d;
        if (s0Var == null || (l0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f16095c) == null || (unitDisplayType = l0Var.f16080b) == null) {
            return false;
        }
        return unitDisplayType.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        AdSession adSession;
        if (this.f16675g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f16675g;
            v0Var.f19734y = true;
            v0Var.D = false;
            v0Var.f19711b.f16736h.remove(v0Var);
            v0Var.f19718i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f16675g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.f16528i;
        if (iAmraidWebViewController != null) {
            com.fyber.inneractive.sdk.measurement.tracker.e eVar = iAmraidWebViewController.I;
            if (eVar != null && (adSession = eVar.f16780a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(new com.fyber.inneractive.sdk.measurement.tracker.c(eVar), 1000);
                eVar.f16780a = null;
                eVar.f16781b = null;
            }
            this.f16528i.e();
            this.f16528i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        IAmraidWebViewController iAmraidWebViewController = this.f16528i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.f19631b == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return false;
    }
}
