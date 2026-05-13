package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class cu2 implements yo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dw2 f88620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eq2 f88621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au2 f88622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f88623d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu2(Context context, at1 at1Var) {
        this(context, cw2.a(), new fu2(at1Var), new au2());
        Object obj = dw2.f89000j;
    }

    public cu2(Context context, dw2 dw2Var, eq2 eq2Var, au2 au2Var) {
        this.f88620a = dw2Var;
        this.f88621b = eq2Var;
        this.f88622c = au2Var;
        this.f88623d = context.getApplicationContext();
    }

    @Override // yads.yo2
    public final Object a(e82 e82Var) {
        return (nt2) this.f88621b.a(e82Var);
    }

    @Override // yads.yo2
    public final boolean a() {
        nt2 nt2VarA = this.f88620a.a(this.f88623d);
        if (nt2VarA == null) {
            return true;
        }
        au2 au2Var = this.f88622c;
        au2Var.f87810a.f93771a.getClass();
        if (System.currentTimeMillis() >= nt2VarA.f92944e) {
            return true;
        }
        au2Var.f87811b.getClass();
        if (!tn.p.f("7.18.1", nt2VarA.R)) {
            return true;
        }
        au2Var.f87812c.getClass();
        Object obj = dw2.f89000j;
        if (!tn.p.f(cw2.a().d(), nt2VarA.L)) {
            return true;
        }
        au2Var.f87812c.getClass();
        if (cw2.a().a() != nt2VarA.f92982x) {
            return true;
        }
        au2Var.f87812c.getClass();
        return tn.p.f(cw2.a().b(), nt2VarA.M) ^ true;
    }
}
