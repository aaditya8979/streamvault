package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class zv1 implements o11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wv1 f97799a;

    public zv1(wv1 wv1Var) {
        this.f97799a = wv1Var;
    }

    @Override // yads.o11
    public final void a() {
        this.f97799a.a();
    }

    @Override // yads.o11
    public final void a(String str) throws tv1 {
        this.f97799a.b(str);
    }

    @Override // yads.o11
    public final void a(hb2 hb2Var, Map map) {
        o11 o11Var;
        wv1 wv1Var = this.f97799a;
        hb2 hb2Var2 = wv1Var.f96513a;
        z43 z43Var = new z43(hb2Var2);
        wv1Var.f96516d.getClass();
        rl3 rl3Var = new rl3(nl3.a(hb2Var2));
        bq0 bq0VarA = wv1Var.f96518f.a(wv1Var.f96513a);
        dq0 dq0Var = new dq0(bq0VarA.f88111a, bq0VarA.f88112b);
        gl3 gl3Var = gl3.f90029c;
        wv1Var.f96529q = gl3Var;
        wv1Var.f96514b.a(gl3Var, rl3Var, dq0Var, z43Var);
        wv1Var.f96514b.b("notifyReadyEvent();");
        hw1 hw1Var = wv1Var.f96524l;
        if (hw1Var == null || (o11Var = (o11) hw1Var.f90583a.get()) == null) {
            return;
        }
        o11Var.a(hb2Var, map);
    }

    @Override // yads.o11
    public final void a(boolean z10) {
        wv1 wv1Var = this.f97799a;
        wv1Var.getClass();
        wv1Var.f96514b.a(new rl3(z10));
        if (z10) {
            fq0 fq0Var = wv1Var.f96522j;
            if (fq0Var.f89666e == null) {
                eq0 eq0Var = new eq0(fq0Var.f89665d, fq0Var.f89662a, fq0Var.f89663b, fq0Var.f89664c);
                fq0Var.f89666e = eq0Var;
                fq0Var.f89665d.post(eq0Var);
                return;
            }
            return;
        }
        fq0 fq0Var2 = wv1Var.f96522j;
        fq0Var2.f89665d.removeCallbacksAndMessages(null);
        fq0Var2.f89666e = null;
        bq0 bq0VarA = wv1Var.f96518f.a(wv1Var.f96513a);
        if (tn.p.f(bq0VarA, wv1Var.f96530r)) {
            return;
        }
        wv1Var.f96530r = bq0VarA;
        wv1Var.f96514b.a(new dq0(bq0VarA.f88111a, bq0VarA.f88112b));
    }
}
