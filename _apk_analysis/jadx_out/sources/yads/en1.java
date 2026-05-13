package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class en1 implements cn1, pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gn1 f89319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bn1 f89320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ok0 f89321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in1 f89322d;

    public en1(in1 in1Var, gn1 gn1Var) {
        this.f89322d = in1Var;
        this.f89320b = in1Var.f90912f;
        this.f89321c = in1Var.f90913g;
        this.f89319a = gn1Var;
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f89321c.a();
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, int i11) {
        if (e(i10, ym1Var)) {
            this.f89321c.a(i11);
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, Exception exc) {
        if (e(i10, ym1Var)) {
            this.f89321c.a(exc);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f89320b.b(hm1Var);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f89320b.b(vf1Var, hm1Var);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        if (e(i10, ym1Var)) {
            this.f89320b.a(vf1Var, hm1Var, iOException, z10);
        }
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f89321c.d();
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f89320b.a(hm1Var);
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f89320b.c(vf1Var, hm1Var);
        }
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f89321c.c();
        }
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f89320b.a(vf1Var, hm1Var);
        }
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f89321c.b();
        }
    }

    public final boolean e(int i10, ym1 ym1Var) {
        ym1 ym1VarA = null;
        if (ym1Var != null) {
            gn1 gn1Var = this.f89319a;
            int i11 = 0;
            while (true) {
                if (i11 >= gn1Var.f90043c.size()) {
                    break;
                }
                if (((ym1) gn1Var.f90043c.get(i11)).f94495d == ym1Var.f94495d) {
                    ym1VarA = ym1Var.a(e.a(gn1Var.f90042b, ym1Var.f94492a));
                    break;
                }
                i11++;
            }
            if (ym1VarA == null) {
                return false;
            }
        }
        int i12 = i10 + this.f89319a.f90044d;
        bn1 bn1Var = this.f89320b;
        if (bn1Var.f88091a != i12 || !ib3.a(bn1Var.f88092b, ym1VarA)) {
            this.f89320b = new bn1(this.f89322d.f90912f.f88093c, i12, ym1VarA, 0L);
        }
        ok0 ok0Var = this.f89321c;
        if (ok0Var.f93243a == i12 && ib3.a(ok0Var.f93244b, ym1VarA)) {
            return true;
        }
        this.f89321c = new ok0(this.f89322d.f90913g.f93245c, i12, ym1VarA);
        return true;
    }
}
