package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.m0;
import com.fyber.inneractive.sdk.util.n0;

/* JADX INFO: loaded from: classes2.dex */
public class p extends e implements com.fyber.inneractive.sdk.interfaces.d, InneractiveNativeVideoContentController.Renderer, m0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public FrameLayout f19345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.ui.m f19346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VideoContentListener f19347n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f19349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public d0 f19350q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f19353t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f19348o = new m(this);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f19351r = 0.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f19352s = new Rect();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f19354u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final o f19355v = new o(this);

    public void K() {
        com.fyber.inneractive.sdk.flow.x xVar = this.f16282b;
        if (xVar != null) {
            t0 t0Var = (t0) xVar;
            if (t0Var.f16644j) {
                return;
            }
            t0Var.f16644j = true;
            G();
        }
    }

    public VideoContentListener a(InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof InneractiveAdViewVideoContentController) {
            return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
        }
        IAlog.f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.a(this), inneractiveContentController.getClass().getSimpleName());
        return null;
    }

    public d0 a(com.fyber.inneractive.sdk.player.t tVar) {
        if (tVar == null || tVar.f18993f == null) {
            return null;
        }
        return new a(tVar);
    }

    @Override // com.fyber.inneractive.sdk.util.m0
    public final void a(float f10, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f19351r == f10 && this.f19352s.equals(rect)) {
            return;
        }
        this.f19351r = f10;
        this.f19352s.set(rect);
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19322k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).D = false;
            ((com.fyber.inneractive.sdk.player.ui.e) this.f19346m).e();
            ((com.fyber.inneractive.sdk.player.controller.s) this.f19322k).a(f10);
        }
        if (f10 <= 0.0f) {
            n nVar = this.f19353t;
            if (nVar == null || (viewGroup = this.f19349p) == null) {
                return;
            }
            viewGroup.removeCallbacks(nVar);
            this.f19353t = null;
            return;
        }
        n nVar2 = this.f19353t;
        if (nVar2 != null && (viewGroup2 = this.f19349p) != null) {
            viewGroup2.removeCallbacks(nVar2);
            this.f19353t = null;
        }
        n nVar3 = new n(this);
        this.f19353t = nVar3;
        this.f19349p.postDelayed(nVar3, 100L);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void a(int i10) {
    }

    public void a(ViewGroup viewGroup) {
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
        this.f19354u = false;
        this.f19345l = new FrameLayout(viewGroup.getContext());
        com.fyber.inneractive.sdk.flow.x xVar = this.f16282b;
        com.fyber.inneractive.sdk.player.t tVar = xVar != null ? ((t0) xVar).f16643i : null;
        Context context = viewGroup.getContext();
        d0 d0VarA = a(tVar);
        this.f19350q = d0VarA;
        if (d0VarA != null) {
            this.f19346m = d0VarA.a(context, ((t0) this.f16282b).f16697c);
            this.f19322k = (com.fyber.inneractive.sdk.player.controller.s) this.f19350q.a(this.f16281a, (t0) this.f16282b);
            this.f19349p.addView(this.f19345l, new ViewGroup.LayoutParams(-1, -2));
            this.f19349p.setLayoutTransition(null);
            this.f19345l.addView((View) this.f19346m, new FrameLayout.LayoutParams(-2, -2, 17));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f19322k;
            o oVar = this.f19355v;
            sVar.getClass();
            sVar.f17213g = oVar;
            com.fyber.inneractive.sdk.player.controller.s sVar2 = (com.fyber.inneractive.sdk.player.controller.s) this.f19322k;
            this.f19350q.b();
            sVar2.b(false);
            this.f19350q.a(this.f19348o);
            n0 n0Var = l0.f19539a;
            ViewGroup viewGroup2 = this.f19349p;
            n0Var.getClass();
            n0Var.a(viewGroup2.getContext(), viewGroup2, this);
        }
    }

    public boolean a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    public boolean a(com.fyber.inneractive.sdk.flow.x xVar) {
        return xVar instanceof t0;
    }

    public void b(ViewGroup viewGroup) {
        a(viewGroup);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final boolean b(View view) {
        return view != null && view.equals(this.f19349p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.f19347n = null;
        t();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int e() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void m() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19322k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final int o() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19322k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19322k;
        if (bVar != null) {
            ((com.fyber.inneractive.sdk.player.controller.s) bVar).c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void q() {
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void r() {
        com.fyber.inneractive.sdk.player.controller.q qVar;
        com.fyber.inneractive.sdk.ui.controller.b bVar = this.f19322k;
        if (bVar != null) {
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) bVar;
            IAlog.a("%sfullscreenExited called", IAlog.a(sVar));
            sVar.E = false;
            sVar.j(sVar.D);
            com.fyber.inneractive.sdk.player.f fVar = sVar.f17207a;
            if (fVar == null || (qVar = fVar.f18912a) == null) {
                return;
            }
            sVar.a(qVar.f17186e);
            sVar.a(sVar.f17207a.f18912a.b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.d
    public final void t() {
        ViewGroup viewGroup;
        n nVar = this.f19353t;
        if (nVar != null && (viewGroup = this.f19349p) != null) {
            viewGroup.removeCallbacks(nVar);
            this.f19353t = null;
        }
        l0.f19539a.a(this.f19349p);
        IAlog.a("%sunbind called. root is %s", IAlog.a(this), this.f19349p);
        if (this.f19322k != null) {
            IAlog.a("%sdestroying video ui controller", IAlog.a(this));
            com.fyber.inneractive.sdk.player.controller.s sVar = (com.fyber.inneractive.sdk.player.controller.s) this.f19322k;
            sVar.getClass();
            sVar.f17213g = null;
            ((com.fyber.inneractive.sdk.player.controller.s) this.f19322k).destroy();
            this.f19322k = null;
        }
        if (this.f19346m != null) {
            this.f19349p.setLayoutTransition(null);
            this.f19349p.removeView(this.f19345l);
            this.f19346m.destroy();
            this.f19346m = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public final Context y() {
        return c(this.f19349p);
    }

    @Override // com.fyber.inneractive.sdk.flow.b0
    public View z() {
        return this.f19345l;
    }
}
