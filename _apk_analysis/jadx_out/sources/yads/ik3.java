package yads;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class ik3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f90870a;

    public ik3(hk3 hk3Var) {
        this.f90870a = hk3Var;
    }

    public final void a() {
        View viewB = this.f90870a.b();
        if (viewB == null) {
            return;
        }
        this.f90870a.a(viewB);
    }

    public final void a(oi oiVar, kk3 kk3Var, Object obj) {
        if (this.f90870a.b() == null) {
            return;
        }
        this.f90870a.a(oiVar, kk3Var, obj);
    }

    public final boolean a(Object obj) {
        View viewB = this.f90870a.b();
        return viewB != null && this.f90870a.a(viewB, obj);
    }

    public final void b(Object obj) {
        View viewB = this.f90870a.b();
        if (viewB == null) {
            return;
        }
        this.f90870a.b(viewB, obj);
        viewB.setVisibility(0);
    }
}
