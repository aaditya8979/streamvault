package yads;

import android.view.View;

/* JADX INFO: loaded from: classes12.dex */
public class lb0 implements pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hk3 f91922a;

    public lb0(hk3 hk3Var) {
        this.f91922a = hk3Var;
    }

    @Override // yads.pi
    public final void a() {
        View viewB = this.f91922a.b();
        if (viewB == null) {
            return;
        }
        this.f91922a.a(viewB);
    }

    @Override // yads.pi
    public final void a(oi oiVar, kk3 kk3Var) {
        this.f91922a.a(oiVar, kk3Var, oiVar.f93231c);
    }

    @Override // yads.pi
    public final boolean a(Object obj) {
        View viewB = this.f91922a.b();
        return viewB != null && this.f91922a.a(viewB, obj);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.pi
    public final boolean b() {
        return this.f91922a.b() != null;
    }

    @Override // yads.pi
    public final zk3 c() {
        View viewB = this.f91922a.b();
        if (viewB != null) {
            return new zk3(viewB.getWidth(), viewB.getHeight());
        }
        return null;
    }

    @Override // yads.pi
    public final void c(Object obj) {
        View viewB = this.f91922a.b();
        if (viewB == null) {
            return;
        }
        this.f91922a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    @Override // yads.pi
    public final boolean d() {
        return kl3.a(this.f91922a.b()) >= 100;
    }

    @Override // yads.pi
    public final void destroy() {
    }

    @Override // yads.pi
    public final boolean e() {
        return this.f91922a.c();
    }
}
