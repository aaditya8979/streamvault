package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends d0 {
    public a(com.fyber.inneractive.sdk.player.t tVar) {
        super(tVar);
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public com.fyber.inneractive.sdk.player.controller.b a(InneractiveAdSpot inneractiveAdSpot, t0 t0Var) {
        if (this.f19319a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f19319a = new com.fyber.inneractive.sdk.player.controller.s(this.f19321c, (com.fyber.inneractive.sdk.player.ui.o) this.f19320b, com.fyber.inneractive.sdk.config.a.a(inneractiveAdSpot.getAdContent().b().f19395o), t0Var.f16697c, selectedUnitController instanceof u0 ? ((u0) selectedUnitController).isOverlayOutside() : false, a());
        }
        return this.f19319a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public com.fyber.inneractive.sdk.player.ui.m a(Context context, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f19320b;
        return sVar == null ? new com.fyber.inneractive.sdk.player.ui.i(context, new com.fyber.inneractive.sdk.player.ui.h(), this.f19321c, rVar, a()) : sVar;
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void a(com.fyber.inneractive.sdk.player.e eVar) {
    }

    @Override // com.fyber.inneractive.sdk.renderers.d0
    public final void b() {
        this.f19321c.getClass();
    }
}
