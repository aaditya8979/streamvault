package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class u32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj2 f95535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb2 f95536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj2 f95537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f95538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ic0 f95539e;

    public u32(x42 x42Var, wb2 wb2Var, sj2 sj2Var, u2 u2Var, ic0 ic0Var) {
        this.f95535a = x42Var;
        this.f95536b = wb2Var;
        this.f95537c = sj2Var;
        this.f95538d = u2Var;
        this.f95539e = ic0Var;
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f95536b).a();
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f95536b).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f95536b).d();
    }

    @Override // yads.ay0
    public final void start() {
        t32 t32Var = new t32(this);
        ((zb2) this.f95536b).a(this.f95539e.a(), t32Var);
        ((zb2) this.f95536b).f97486e = t32Var;
    }
}
