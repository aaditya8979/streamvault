package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class py implements cn1, pk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f93825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bn1 f93826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ok0 f93827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry f93828d;

    public py(ry ryVar, Object obj) {
        this.f93828d = ryVar;
        this.f93826b = ryVar.b((ym1) null);
        this.f93827c = ryVar.a((ym1) null);
        this.f93825a = obj;
    }

    public final hm1 a(hm1 hm1Var) {
        ry ryVar = this.f93828d;
        long j10 = hm1Var.f90463f;
        ryVar.getClass();
        ry ryVar2 = this.f93828d;
        long j11 = hm1Var.f90464g;
        ryVar2.getClass();
        return (j10 == hm1Var.f90463f && j11 == hm1Var.f90464g) ? hm1Var : new hm1(hm1Var.f90458a, hm1Var.f90459b, hm1Var.f90460c, hm1Var.f90461d, hm1Var.f90462e, j10, j11);
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f93827c.a();
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, int i11) {
        if (e(i10, ym1Var)) {
            this.f93827c.a(i11);
        }
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, Exception exc) {
        if (e(i10, ym1Var)) {
            this.f93827c.a(exc);
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f93826b.b(a(hm1Var));
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f93826b.b(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10) {
        if (e(i10, ym1Var)) {
            this.f93826b.a(vf1Var, a(hm1Var), iOException, z10);
        }
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f93827c.d();
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f93826b.a(a(hm1Var));
        }
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f93826b.c(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f93827c.c();
        }
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, vf1 vf1Var, hm1 hm1Var) {
        if (e(i10, ym1Var)) {
            this.f93826b.a(vf1Var, a(hm1Var));
        }
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        if (e(i10, ym1Var)) {
            this.f93827c.b();
        }
    }

    public final boolean e(int i10, ym1 ym1Var) {
        ym1 ym1VarA;
        if (ym1Var != null) {
            ym1VarA = this.f93828d.a(this.f93825a, ym1Var);
            if (ym1VarA == null) {
                return false;
            }
        } else {
            ym1VarA = null;
        }
        this.f93828d.getClass();
        bn1 bn1Var = this.f93826b;
        if (bn1Var.f88091a != i10 || !ib3.a(bn1Var.f88092b, ym1VarA)) {
            this.f93826b = new bn1(this.f93828d.f92476c.f88093c, i10, ym1VarA, 0L);
        }
        ok0 ok0Var = this.f93827c;
        if (ok0Var.f93243a == i10 && ib3.a(ok0Var.f93244b, ym1VarA)) {
            return true;
        }
        this.f93827c = new ok0(this.f93828d.f92477d.f93245c, i10, ym1VarA);
        return true;
    }
}
