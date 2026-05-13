package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class c42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y00 f88337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f88338b;

    public c42(y00 y00Var, cq2 cq2Var) {
        this.f88337a = y00Var;
        this.f88338b = cq2Var;
    }

    public final boolean a() {
        y00 y00Var = this.f88337a;
        return (y00Var.f96960n == null && y00Var.f96953g == null && y00Var.f96955i == null && y00Var.f96949c == null && y00Var.f96948b == null) ? false : true;
    }

    public final boolean b() {
        return this.f88337a.f96954h != null && (cq2.f88584c == this.f88338b || (d() ^ true));
    }

    public final boolean c() {
        a10 a10Var = this.f88337a.f96950d;
        return a10Var != null && (tn.p.f("large", a10Var.f87540b) || tn.p.f("wide", this.f88337a.f96950d.f87540b));
    }

    public final boolean d() {
        y00 y00Var = this.f88337a;
        return (y00Var.f96957k == null && y00Var.f96958l == null) ? false : true;
    }
}
