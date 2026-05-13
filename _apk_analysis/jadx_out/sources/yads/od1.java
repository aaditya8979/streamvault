package yads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class od1 implements bg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu2 f93184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nd1 f93185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dz1 f93186c;

    public od1(lu2 lu2Var, nd1 nd1Var, dz1 dz1Var) {
        this.f93184a = lu2Var;
        this.f93185b = nd1Var;
        this.f93186c = dz1Var;
    }

    @Override // yads.bg0
    public final List a(Context context, v9 v9Var, w02 w02Var, kz kzVar, b2 b2Var, z30 z30Var, z3 z3Var, ir2 ir2Var, k63 k63Var, ph0 ph0Var, gi0 gi0Var, j7 j7Var) {
        ki0 ki0Var;
        qw qwVar = new qw(v9Var, b2Var, new sl3(), kzVar, this.f93186c, z30Var, k63Var);
        at1 at1VarA = ((iu3) this.f93184a).a();
        List listP = cn.w.p(new eg2(qwVar, at1VarA, new rx()), new pe1(qwVar, at1VarA, new sp2(), new rx()), new oe1(qwVar, at1VarA, new sp2(), new rx()));
        nd1 nd1Var = this.f93185b;
        nd1Var.getClass();
        try {
            nd1Var.f92828e.getClass();
        } catch (Throwable unused) {
        }
        if (!oi0.a(context) || gi0Var == null) {
            ki0Var = null;
        } else {
            ki0Var = new ki0(gi0Var, nd1Var.f92824a, nd1Var.f92825b, new jy(new qw(v9Var, b2Var, nd1Var.f92829f, kzVar, nd1Var.f92830g, z30Var, k63Var), new mz(v9Var, b2Var, z3Var, w02Var.c(), k63Var, gi0Var), new q03(j7Var, b2Var, nd1Var.f92830g, h03.a(j7Var))), nd1Var.f92826c, ph0Var, nd1Var.f92827d);
        }
        return cn.f0.q0(cn.f0.O0(cn.v.e(ki0Var), listP));
    }
}
