package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.w0;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n0;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends p implements w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.fyber.inneractive.sdk.flow.nativead.trackers.a f19307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f19308x;

    static {
        IAlog.a(c0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean E() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final boolean F() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final void K() {
        com.fyber.inneractive.sdk.flow.x xVar;
        com.fyber.inneractive.sdk.player.n nVar;
        InneractiveAdSpot inneractiveAdSpot = this.f16281a;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || (xVar = this.f16282b) == null || ((t0) xVar).f16644j) {
            return;
        }
        IAlog.a("%sTracking impression", IAlog.a(this));
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = new com.fyber.inneractive.sdk.flow.nativead.trackers.a((w0) this.f16281a.getAdContent());
        this.f19307w = aVar;
        aVar.a(this);
        d0 d0Var = this.f19350q;
        if (d0Var != null && (nVar = d0Var.f19321c) != null) {
            if (nVar.f18981w.compareAndSet(false, true)) {
                nVar.a(nVar.f18974p, VideoClickOrigin.InvalidOrigin, com.fyber.inneractive.sdk.model.vast.x.EVENT_IMPRESSION, com.fyber.inneractive.sdk.model.vast.x.EVENT_START);
            } else {
                IAlog.a("%sreportPlayStartEvents called, but start events was already reported", IAlog.a(nVar));
            }
        }
        super.K();
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof NativeAdVideoContentController) {
            return (VideoContentListener) ((NativeAdVideoContentController) inneractiveContentController).getEventsListener();
        }
        IAlog.f("%s: Content controller expected to be NativeAdVideoContentController but it: %s", IAlog.a(this), inneractiveContentController);
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final d0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar != null) {
            return new x(tVar);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.interfaces.d
    public final void a(ViewGroup viewGroup) {
        com.fyber.inneractive.sdk.player.ui.t tVar;
        com.fyber.inneractive.sdk.player.n nVar;
        InneractiveAdSpot inneractiveAdSpot = this.f16281a;
        if (inneractiveAdSpot == null) {
            IAlog.f("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            return;
        }
        this.f19349p = viewGroup;
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        if (a(selectedUnitController)) {
            this.f19347n = a(selectedUnitController.getSelectedContentController());
        } else {
            IAlog.f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.a(this));
        }
        com.fyber.inneractive.sdk.flow.x xVar = this.f16282b;
        Float fValueOf = null;
        com.fyber.inneractive.sdk.player.t tVar2 = xVar != null ? ((t0) xVar).f16643i : null;
        Context context = viewGroup.getContext();
        d0 d0VarA = a(tVar2);
        this.f19350q = d0VarA;
        if (d0VarA == null) {
            IAlog.f("%s : can't render - video renderer is missing", IAlog.a(this));
            return;
        }
        com.fyber.inneractive.sdk.player.ui.m mVarA = d0VarA.a(context, ((t0) this.f16282b).f16697c);
        this.f19346m = mVarA;
        if (mVarA instanceof com.fyber.inneractive.sdk.player.ui.t) {
            tVar = (com.fyber.inneractive.sdk.player.ui.t) mVarA;
            tVar.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        } else {
            tVar = null;
        }
        this.f19308x = new WeakReference(tVar);
        this.f19322k = (com.fyber.inneractive.sdk.player.controller.s) this.f19350q.a(this.f16281a, (t0) this.f16282b);
        viewGroup.addView((View) this.f19346m, new ViewGroup.LayoutParams(-1, -1));
        com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f19322k;
        o oVar = this.f19355v;
        sVar.getClass();
        sVar.f17213g = oVar;
        com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f19322k;
        this.f19350q.b();
        sVar2.b(false);
        this.f19350q.a(this.f19348o);
        InneractiveAdSpot inneractiveAdSpot2 = this.f16281a;
        if (inneractiveAdSpot2 != null && (inneractiveAdSpot2.getAdContent() instanceof w0)) {
            w0 w0Var = (w0) this.f16281a.getAdContent();
            d0 d0Var = this.f19350q;
            com.fyber.inneractive.sdk.player.controller.q qVar = (d0Var == null || (nVar = d0Var.f19321c) == null) ? null : nVar.f18912a;
            if (qVar != null && qVar.e() > 0 && qVar.f() > 0) {
                fValueOf = Float.valueOf(qVar.f() / qVar.e());
            }
            w0Var.f16686p = fValueOf;
        }
        n0 n0Var = l0.f19539a;
        ViewGroup viewGroup2 = this.f19349p;
        n0Var.getClass();
        n0Var.a(viewGroup2.getContext(), viewGroup2, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.k
    public final void a(String str, boolean z10, com.fyber.inneractive.sdk.util.g gVar, com.fyber.inneractive.sdk.click.o oVar) {
        com.fyber.inneractive.sdk.flow.x xVar;
        InneractiveAdSpot inneractiveAdSpot = this.f16281a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && (xVar = this.f16282b) != null && !((t0) xVar).f16644j) {
            com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19322k;
            if (bVar instanceof com.fyber.inneractive.sdk.player.controller.c0) {
                ((com.fyber.inneractive.sdk.player.controller.c0) bVar).F.set(true);
            }
            com.fyber.inneractive.sdk.util.r.f19556b.post(new b0(this));
        }
        com.fyber.inneractive.sdk.util.r.f19556b.post(new com.fyber.inneractive.sdk.flow.y(this, c(this.f19349p), str, new g1(), gVar, z10, oVar));
    }

    @Override // com.fyber.inneractive.sdk.renderers.p
    public final boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof NativeAdUnitController;
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.interfaces.d
    public final boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.c
    public final void b() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f19307w;
        if (aVar != null) {
            aVar.a();
            this.f19307w = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        com.fyber.inneractive.sdk.flow.nativead.trackers.a aVar = this.f19307w;
        if (aVar != null) {
            aVar.a();
            this.f19307w = null;
        }
        WeakReference weakReference = this.f19308x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            tVar.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        l0.f19539a.a(this.f19349p);
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        if (inneractiveAdSpot.getAdContent() instanceof w0) {
            this.f16282b = ((w0) inneractiveAdSpot.getAdContent()).f16689s;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        l0.f19539a.a(c(this.f19349p).getApplicationContext());
        WeakReference weakReference = this.f19308x;
        com.fyber.inneractive.sdk.player.ui.t tVar = weakReference != null ? (com.fyber.inneractive.sdk.player.ui.t) weakReference.get() : null;
        if (tVar != null) {
            com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(new com.fyber.inneractive.sdk.player.ui.d(tVar, z10), 500L);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.p, com.fyber.inneractive.sdk.flow.b0
    public final View z() {
        InneractiveAdSpot inneractiveAdSpot = this.f16281a;
        MediaView mediaView = (inneractiveAdSpot == null || !(inneractiveAdSpot.getAdContent() instanceof w0)) ? null : ((w0) this.f16281a.getAdContent()).f16684n;
        return mediaView != null ? mediaView : this.f19349p;
    }
}
