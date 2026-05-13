package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n72 implements ay0, p72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o72 f92762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z3 f92763b;

    public n72(o72 o72Var, z3 z3Var) {
        this.f92762a = o72Var;
        this.f92763b = z3Var;
    }

    @Override // yads.p72
    public final void a() {
        z3 z3Var = this.f92763b;
        if (z3Var != null) {
            z3Var.b();
        }
        this.f92762a.f93137a.remove(this);
        this.f92763b = null;
    }

    @Override // yads.p72
    public final void a(boolean z10) {
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f92762a.f93137a.remove(this);
        this.f92763b = null;
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.ay0
    public final void start() {
        this.f92762a.f93137a.add(this);
    }
}
