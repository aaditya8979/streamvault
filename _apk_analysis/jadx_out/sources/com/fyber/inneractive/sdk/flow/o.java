package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o implements com.fyber.inneractive.sdk.interfaces.a, com.fyber.inneractive.sdk.interfaces.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.interfaces.c f16507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f16508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.fyber.inneractive.sdk.config.global.r f16509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.network.m f16510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16512f = false;

    public o(String str) {
        this.f16511e = str;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public void a(InneractiveAdRequest inneractiveAdRequest) {
        x xVar;
        com.fyber.inneractive.sdk.response.e eVar;
        s0 s0Var;
        IAlog.e("%sgot onAdLoaded!", d());
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16507a;
        if (cVar != null) {
            n nVar = this.f16508b;
            if (nVar == null || (xVar = ((k) cVar).f16414c) == null) {
                IAlog.b("%sgot onAdLoaded! but content or listener is null", d());
            } else {
                e0 e0Var = (e0) nVar;
                if (e0Var.f16303a.f16409m.get()) {
                    IAlog.a("%s: onAdLoaded: spot is already destroyed", h0.a(e0Var.f16303a));
                    h0 h0Var = e0Var.f16303a;
                    p pVar = h0Var.f16408l;
                    h0Var.a(xVar);
                } else {
                    h0 h0Var2 = e0Var.f16303a;
                    if (h0Var2.f16406j || (s0Var = h0Var2.f16402f) == null || !s0Var.supportsRefresh()) {
                        h0 h0Var3 = e0Var.f16303a;
                        h0Var3.f16401e = xVar;
                        xVar.f16695a = inneractiveAdRequest;
                        for (s0 s0Var2 : h0Var3.f16403g) {
                            if (s0Var2.supports(h0Var3)) {
                                h0Var3.f16402f = s0Var2;
                                h0 h0Var4 = e0Var.f16303a;
                                InneractiveAdSpot.RequestListener requestListener = h0Var4.f16398b;
                                if (requestListener != null) {
                                    if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                        InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                        s0 s0Var3 = h0Var4.f16402f;
                                        if ((xVar instanceof w0) && (s0Var3 instanceof NativeAdUnitController)) {
                                            w0 w0Var = (w0) xVar;
                                            w0Var.f16692v = (NativeAdUnitController) s0Var3;
                                            nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(h0Var4, w0Var);
                                        } else {
                                            IAlog.b("%s: Invalid native response: controller or/and content mismatch", IAlog.a(h0Var4));
                                            nativeAdRequestListener.onInneractiveFailedAdRequest(h0Var4, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                        }
                                    } else {
                                        requestListener.onInneractiveSuccessfulAdRequest(h0Var4);
                                    }
                                }
                                e0Var.f16303a.f16406j = false;
                            }
                        }
                        IAlog.a("%sCannot find appropriate unit controller for unit: %s", h0.a(e0Var.f16303a), e0Var.f16303a.f16401e.f16698d);
                        m mVar = e0Var.f16303a.f16404h;
                        com.fyber.inneractive.sdk.response.e eVarC = mVar != null ? mVar.c() : null;
                        e0Var.a(inneractiveAdRequest, eVarC, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + e0Var.f16303a.f16401e.f16698d)));
                        h0 h0Var5 = e0Var.f16303a;
                        h0Var5.f16401e = null;
                        h0Var5.f16406j = false;
                    } else if (e0Var.f16303a.f16402f.canRefreshAd()) {
                        h0 h0Var6 = e0Var.f16303a;
                        h0Var6.f16401e = xVar;
                        xVar.f16695a = inneractiveAdRequest;
                        g0 g0Var = h0Var6.f16405i;
                        if (g0Var != null) {
                            g0Var.onAdRefreshed(h0Var6);
                        } else {
                            s0 s0Var4 = h0Var6.f16402f;
                            if (s0Var4 instanceof InneractiveAdViewUnitController) {
                                ((InneractiveAdViewUnitController) s0Var4).onAdRefreshed(h0Var6);
                            }
                        }
                    } else {
                        IAlog.a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", h0.a(e0Var.f16303a));
                        h0 h0Var7 = e0Var.f16303a;
                        h0Var7.f16405i.onAdRefreshFailed(h0Var7, InneractiveErrorCode.CANCELLED);
                    }
                    String str = e0Var.f16303a.f16397a;
                    com.fyber.inneractive.sdk.metrics.d dVar = com.fyber.inneractive.sdk.metrics.d.f16798d;
                    dVar.a(str).e();
                    dVar.a(str).b();
                    h0 h0Var8 = e0Var.f16303a;
                    x xVar2 = h0Var8.f16401e;
                    if (xVar2 != null && (eVar = xVar2.f16696b) != null && eVar.f19396p != null) {
                        x xVar3 = h0Var8.f16401e;
                        com.fyber.inneractive.sdk.response.e eVar2 = xVar3.f16696b;
                        new com.fyber.inneractive.sdk.metrics.c(eVar2, h0Var8.f16399c, h0Var8.f16397a, eVar2.f19396p, xVar3.f16697c.b()).a();
                    }
                }
            }
            this.f16507a = null;
        }
        b(inneractiveAdRequest);
    }

    public void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
    }

    public final void a(InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.f19500a <= 3) {
            Thread.dumpStack();
        }
        IAlog.e("%sgot onAdRequestFailed! with: %s", d(), inneractiveInfrastructureError.getErrorCode());
        if (this.f16508b != null) {
            if (eVar != null && eVar.f19389i != null) {
                inneractiveInfrastructureError.setCause(new Exception(eVar.f19389i + ": " + eVar.f19390j));
            }
            ((e0) this.f16508b).a(inneractiveAdRequest, eVar, inneractiveInfrastructureError);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.a
    public final void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        x xVar;
        IAlog.e("%sgot onFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16507a;
        InneractiveAdRequest inneractiveAdRequest = (cVar == null || (xVar = ((k) cVar).f16414c) == null) ? null : xVar.f16695a;
        com.fyber.inneractive.sdk.response.e eVarC = c();
        IAlog.e("%sgot handleFailedLoading! with: %s", d(), inneractiveInfrastructureError);
        n nVar = this.f16508b;
        if (nVar != null) {
            ((e0) nVar).a(inneractiveAdRequest, eVarC, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != i.NATIVE_AD_PARSING_ERROR) {
            a(inneractiveAdRequest, eVarC);
        }
    }

    public void a(boolean z10) {
        this.f16512f = true;
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16507a;
        if (cVar == null || !z10) {
            return;
        }
        cVar.cancel();
        x xVar = ((k) this.f16507a).f16414c;
        if (xVar != null) {
            xVar.destroy();
        }
        this.f16507a = null;
    }

    public void b(InneractiveAdRequest inneractiveAdRequest) {
    }

    public final com.fyber.inneractive.sdk.response.e c() {
        com.fyber.inneractive.sdk.interfaces.c cVar = this.f16507a;
        if (cVar == null) {
            return null;
        }
        k kVar = (k) cVar;
        x xVar = kVar.f16414c;
        return xVar != null ? xVar.b() : kVar.f16413b;
    }

    public String d() {
        return IAlog.a(this);
    }
}
