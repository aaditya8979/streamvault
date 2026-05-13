package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ac3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf3 f87647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ek3 f87648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je3 f87649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jg3 f87650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yj3 f87651e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w5 f87652f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yf3 f87653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vf3 f87654h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ze3 f87655i;

    public ac3(Context context, lu2 lu2Var, hf3 hf3Var, ek3 ek3Var, je3 je3Var, bj3 bj3Var, jg3 jg3Var, zj3 zj3Var, rf3 rf3Var, af3 af3Var, v9 v9Var, boolean z10) {
        this.f87647a = hf3Var;
        this.f87648b = ek3Var;
        this.f87649c = je3Var;
        this.f87650d = jg3Var;
        this.f87651e = zj3Var;
        w5 w5Var = new w5();
        this.f87652f = w5Var;
        yf3 yf3Var = new yf3(context, lu2Var, v9Var, je3Var, w5Var, jg3Var, ek3Var, bj3Var, zj3Var);
        this.f87653g = yf3Var;
        vf3 vf3Var = new vf3(hf3Var, rf3Var);
        this.f87654h = vf3Var;
        this.f87655i = new ze3(je3Var, hf3Var, vf3Var, yf3Var, jg3Var, w5Var, zj3Var, af3Var, z10);
        new tf3(context, je3Var, ek3Var, jg3Var, zj3Var, hf3Var, af3Var).a(rf3Var, z10);
    }

    public final void a() {
        this.f87647a.a(this.f87655i);
        this.f87647a.a(this.f87649c);
        this.f87652f.a(v5.f95943v, null);
        View view = this.f87648b.getView();
        if (view != null) {
            this.f87651e.a(view, this.f87648b.a());
        }
        eg3 eg3Var = this.f87653g.f97122d;
        if (!eg3Var.f89250e && !eg3Var.f89249d) {
            eg3Var.f89250e = true;
            eg3Var.f89248c.post(new dg3(eg3Var));
        }
        this.f87650d.a(hg3.f90402c);
    }

    public final void a(ag3 ag3Var) {
        yf3 yf3Var = this.f87653g;
        yf3Var.f97127i.setValue(yf3Var, yf3.f97117k[0], ag3Var);
    }
}
