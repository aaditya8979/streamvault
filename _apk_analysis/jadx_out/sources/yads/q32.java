package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class q32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f93876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f93877b;

    public q32(y00 y00Var, cq2 cq2Var) {
        this.f93876a = y00Var;
        this.f93877b = cq2Var;
    }

    public static boolean a(a10 a10Var) {
        return tn.p.f("large", a10Var.f87540b) || tn.p.f("wide", a10Var.f87540b);
    }

    public final boolean a() {
        a10 a10Var;
        y00 y00Var = this.f93876a;
        return (b() || this.f93876a.f96948b == null || !(y00Var.f96947a != null || (a10Var = y00Var.f96950d) == null || a(a10Var))) ? false : true;
    }

    public final boolean b() {
        return this.f93876a.f96949c != null && (cq2.f88585d == this.f93877b || !c());
    }

    public final boolean c() {
        a10 a10Var;
        y00 y00Var = this.f93876a;
        return (y00Var.f96947a != null || (a10Var = y00Var.f96950d) == null || a(a10Var) || cq2.f88585d == this.f93877b) ? false : true;
    }
}
