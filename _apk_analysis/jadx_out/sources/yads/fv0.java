package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class fv0 implements zg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f89683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g62 f89684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gv0 f89685c;

    public fv0(w5 w5Var, g62 g62Var, z52 z52Var, Iterator it, z30 z30Var) {
        this.f89683a = w5Var;
        this.f89684b = g62Var;
        this.f89685c = new gv0(w5Var, g62Var, z52Var, it, z30Var);
    }

    @Override // yads.zg3
    public final void a() {
        this.f89683a.a(v5.f95937p);
        this.f89684b.a();
        this.f89685c.a();
    }

    @Override // yads.zg3
    public final void b() {
        this.f89683a.a(v5.f95937p);
        this.f89684b.a();
        this.f89685c.f90132e.a(y30.f96983f);
    }

    @Override // yads.zg3
    public final void c() {
    }
}
