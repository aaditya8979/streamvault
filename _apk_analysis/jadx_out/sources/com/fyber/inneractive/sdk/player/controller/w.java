package com.fyber.inneractive.sdk.player.controller;

import android.view.View;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.h0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f17203a;

    public w(z zVar) {
        this.f17203a = zVar;
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final com.fyber.inneractive.sdk.util.d0 a(String str, g1 g1Var) {
        z zVar = this.f17203a;
        zVar.getClass();
        IAlog.a("%sweb view callback: onClicked", IAlog.a(zVar));
        this.f17203a.a(w0.COMPANION.a());
        z zVar2 = this.f17203a;
        if (zVar2.f17213g == null) {
            return new com.fyber.inneractive.sdk.util.d0(com.fyber.inneractive.sdk.util.g0.FAILED, new Exception("mListener is null, internal SDK fatal error"));
        }
        com.fyber.inneractive.sdk.player.f fVar = zVar2.f17207a;
        if (fVar != null) {
            com.fyber.inneractive.sdk.player.n nVar = (com.fyber.inneractive.sdk.player.n) fVar;
            com.fyber.inneractive.sdk.flow.endcard.k kVar = nVar.f18978t;
            com.fyber.inneractive.sdk.flow.endcard.b bVarA = kVar.f16325b.a();
            Object obj = bVarA;
            if (bVarA != null) {
                boolean zJ = bVarA.j();
                obj = bVarA;
                if (zJ) {
                    com.fyber.inneractive.sdk.flow.endcard.c cVar = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f16325b.a(com.fyber.inneractive.sdk.model.vast.i.Other);
                    obj = cVar;
                    if (cVar == null) {
                        com.fyber.inneractive.sdk.flow.endcard.c cVar2 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f16325b.a(com.fyber.inneractive.sdk.model.vast.i.Html);
                        obj = cVar2;
                        if (cVar2 == null) {
                            com.fyber.inneractive.sdk.flow.endcard.c cVar3 = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f16325b.a(com.fyber.inneractive.sdk.model.vast.i.Iframe);
                            obj = cVar3;
                            if (cVar3 == null) {
                                obj = (com.fyber.inneractive.sdk.flow.endcard.c) kVar.f16325b.a(com.fyber.inneractive.sdk.model.vast.i.Static);
                            }
                        }
                    }
                }
            }
            com.fyber.inneractive.sdk.flow.endcard.b bVarA2 = nVar.f18978t.f16325b.a();
            com.fyber.inneractive.sdk.model.vast.x xVar = com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK;
            com.fyber.inneractive.sdk.response.i iVar = obj instanceof com.fyber.inneractive.sdk.response.i ? (com.fyber.inneractive.sdk.response.i) obj : null;
            List listA = iVar != null ? iVar.a(xVar) : null;
            if (listA == null || listA.isEmpty()) {
                this.f17203a.getClass();
                if ((bVarA2 instanceof com.fyber.inneractive.sdk.flow.endcard.o) && ((com.fyber.inneractive.sdk.flow.endcard.o) bVarA2).f16365h.f19586b > 0) {
                    nVar.a(nVar.f18974p, VideoClickOrigin.COMPANION, xVar);
                }
            } else {
                fVar.a((com.fyber.inneractive.sdk.response.i) obj, VideoClickOrigin.COMPANION, xVar);
            }
        }
        IAlog.d("AD_CLICKED", new Object[0]);
        com.fyber.inneractive.sdk.player.ui.s sVar = this.f17203a.f17210d;
        if (sVar != null) {
            sVar.f();
        }
        return this.f17203a.f17213g.a(str, g1Var, false);
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a() {
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var != null) {
            g0Var.i();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var != null) {
            g0Var.onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.j1
    public final void a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        z zVar = this.f17203a;
        zVar.getClass();
        sb2.append(IAlog.a(zVar));
        sb2.append("web view callback: onSuspiciousNoUserWebActionDetected");
        IAlog.a(sb2.toString(), new Object[0]);
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var != null) {
            g0Var.a(str, str2);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void a(boolean z10, Orientation orientation) {
        z zVar = this.f17203a;
        zVar.getClass();
        IAlog.a("%sonOrientationProperties: allowOrientationChange: %s, forceOrientationType: %s", IAlog.a(zVar), Boolean.valueOf(z10), orientation.toString());
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var != null) {
            g0Var.a(z10, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final boolean a(String str) {
        View endCardView = this.f17203a.f17210d.getEndCardView();
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var == null) {
            return false;
        }
        g0Var.a(endCardView, str);
        return true;
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b() {
        z zVar = this.f17203a;
        if (zVar.f17213g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.f17210d;
            this.f17203a.f17213g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void b(boolean z10) {
        z zVar = this.f17203a;
        zVar.getClass();
        IAlog.a("%sonCustomCloseButtonAvailableEnabled : %s", IAlog.a(zVar), Boolean.valueOf(z10));
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var == null || !z10) {
            return;
        }
        g0Var.g();
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void c() {
        z zVar = this.f17203a;
        if (zVar.f17213g != null) {
            com.fyber.inneractive.sdk.player.ui.s sVar = zVar.f17210d;
            this.f17203a.f17213g.a(sVar != null ? sVar.getEndCardView() : null);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void d() {
        z zVar = this.f17203a;
        zVar.getClass();
        IAlog.a("%sweb view callback: onClickedAndOpen", IAlog.a(zVar));
        this.f17203a.a(w0.COMPANION.a());
        z zVar2 = this.f17203a;
        if (zVar2.f17213g != null) {
            com.fyber.inneractive.sdk.player.f fVar = zVar2.f17207a;
            if (fVar != null) {
                com.fyber.inneractive.sdk.flow.endcard.b bVarA = ((com.fyber.inneractive.sdk.player.n) fVar).f18978t.f16325b.a();
                if (bVarA instanceof com.fyber.inneractive.sdk.flow.endcard.c) {
                    fVar.a((com.fyber.inneractive.sdk.flow.endcard.c) bVarA, VideoClickOrigin.COMPANION, com.fyber.inneractive.sdk.model.vast.x.EVENT_CLICK);
                }
            }
            IAlog.d("AD_CLICKED", new Object[0]);
            this.f17203a.f17213g.f();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.b0
    public final void onClose() {
        g0 g0Var = this.f17203a.f17213g;
        if (g0Var != null) {
            g0Var.j();
        }
    }
}
