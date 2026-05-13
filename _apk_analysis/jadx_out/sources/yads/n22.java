package yads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class n22 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p22 f92714a;

    public /* synthetic */ n22(d42 d42Var, lh3 lh3Var) {
        this(new o22(lh3Var, d42Var));
    }

    public n22(o22 o22Var) {
        this.f92714a = o22Var.a();
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        p22 p22Var = this.f92714a;
        if (p22Var != null) {
            p22Var.f93393a.f88769a.add(p22Var);
        }
    }

    @Override // yads.zf0
    public final void c() {
        p22 p22Var = this.f92714a;
        if (p22Var != null) {
            p22Var.f93393a.f88769a.remove(p22Var);
            p22Var.f93394b = null;
        }
    }
}
