package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends w {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.t f16643i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16644j;

    public t0(com.fyber.inneractive.sdk.config.s0 s0Var, com.fyber.inneractive.sdk.config.global.r rVar, com.fyber.inneractive.sdk.response.g gVar, InneractiveAdRequest inneractiveAdRequest) {
        super(s0Var, rVar);
        this.f16644j = false;
        this.f16696b = gVar;
        this.f16695a = inneractiveAdRequest;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean c() {
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.s0 s0Var = this.f16698d;
        if (s0Var == null || (t0Var = ((com.fyber.inneractive.sdk.config.r0) s0Var).f16098f) == null) {
            IAlog.f("%s : isFullscreenAd() called with unit config: %s or mUnitConfig.getVideo is null", IAlog.a(this), this.f16698d);
            return false;
        }
        UnitDisplayType unitDisplayType = t0Var.f16158j;
        return UnitDisplayType.INTERSTITIAL.equals(unitDisplayType) || UnitDisplayType.REWARDED.equals(unitDisplayType) || UnitDisplayType.VERTICAL.equals(unitDisplayType);
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final void destroy() {
        com.fyber.inneractive.sdk.player.n nVar;
        if (this.f16675g != null && c()) {
            com.fyber.inneractive.sdk.web.v0 v0Var = this.f16675g;
            v0Var.f19734y = true;
            v0Var.D = false;
            v0Var.f19711b.f16736h.remove(v0Var);
            v0Var.f19718i = null;
            IAlog.a("destroy internalStoreWebpageController", new Object[0]);
            this.f16675g = null;
        }
        com.fyber.inneractive.sdk.player.t tVar = this.f16643i;
        if (tVar != null) {
            com.fyber.inneractive.sdk.player.b bVar = tVar.f18988a;
            if (bVar != null && (nVar = bVar.f17095b) != null) {
                nVar.f18920i = true;
                IAlog.a("IAMediaPlayerFlowManager: destroy", new Object[0]);
                nVar.a();
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = nVar.f18978t.f16325b.a();
                if (bVarA != null) {
                    bVarA.destroy();
                }
                if (nVar.f18912a != null) {
                    IAlog.a("%s : destroy() : playerController being destroyed", com.fyber.inneractive.sdk.player.f.class.getSimpleName());
                    nVar.f18912a.a();
                    nVar.f18912a = null;
                }
                nVar.f18923l = null;
                com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f18978t;
                if (kVar != null) {
                    com.fyber.inneractive.sdk.flow.endcard.m mVar = kVar.f16325b;
                    Iterator it = mVar.f16360a.iterator();
                    while (it.hasNext()) {
                        ((com.fyber.inneractive.sdk.flow.endcard.b) it.next()).destroy();
                    }
                    mVar.f16360a.clear();
                    mVar.f16361b.clear();
                    mVar.f16362c = -1;
                }
                com.fyber.inneractive.sdk.player.ui.remote.g gVar = nVar.f18979u;
                if (gVar != null) {
                    gVar.f19068a.a();
                }
                com.fyber.inneractive.sdk.flow.storepromo.b bVar2 = nVar.f18980v;
                if (bVar2 != null) {
                    bVar2.f16533a.a();
                    bVar2.a();
                    bVar2.f16537e = null;
                    bVar2.f16540h.clear();
                }
            }
            this.f16643i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public final boolean e() {
        return this.f16643i != null;
    }

    @Override // com.fyber.inneractive.sdk.flow.x
    public boolean isVideoAd() {
        return true;
    }
}
