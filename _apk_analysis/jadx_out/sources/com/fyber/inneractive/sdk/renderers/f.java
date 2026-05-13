package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends d0 {
    public f(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f19319a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f19319a = new com.fyber.inneractive.sdk.player.controller.g(this.f19321c, this.f19320b, inneractiveAdSpot.getAdContent().f16698d, t0Var.f16697c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.O.f15965k || t0Var.f16700f, a());
        }
        return this.f19319a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        if (this.f19320b == null) {
            this.f19320b = new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.f(), this.f19321c, rVar, a());
        }
        return this.f19320b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
        this.f19321c.getClass();
        eVar.a();
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void b() {
        this.f19321c.getClass();
    }
}
