package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class e32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb2 f89080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic0 f89081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3 f89082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public tj2 f89083d;

    public /* synthetic */ e32(z3 z3Var, k63 k63Var, tj2 tj2Var) {
        this(z3Var, tj2Var, vb2.a(false), k63Var.c());
    }

    public e32(z3 z3Var, tj2 tj2Var, wb2 wb2Var, ic0 ic0Var) {
        this.f89080a = wb2Var;
        this.f89081b = ic0Var;
        this.f89082c = z3Var;
        this.f89083d = tj2Var;
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f89080a).a();
        ((zb2) this.f89080a).f97486e = null;
        this.f89082c = null;
        this.f89083d = null;
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f89080a).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f89080a).d();
    }

    @Override // yads.ay0
    public final void start() {
        c32 c32Var = new c32(this);
        long jA = this.f89081b.a();
        d32 d32Var = new d32(this, jA);
        zb2 zb2Var = (zb2) this.f89080a;
        zb2Var.f97486e = d32Var;
        zb2Var.a(jA, c32Var);
    }
}
