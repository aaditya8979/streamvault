package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class de0 implements zj1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j33 f88831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ce0 f88832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ro f88833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zj1 f88834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88835f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f88836g;

    public de0(ce0 ce0Var, f53 f53Var) {
        this.f88832c = ce0Var;
        this.f88831b = new j33(f53Var);
    }

    @Override // yads.zj1
    public final long a() {
        if (this.f88835f) {
            return this.f88831b.a();
        }
        zj1 zj1Var = this.f88834e;
        zj1Var.getClass();
        return zj1Var.a();
    }

    @Override // yads.zj1
    public final void a(ee2 ee2Var) {
        zj1 zj1Var = this.f88834e;
        if (zj1Var != null) {
            zj1Var.a(ee2Var);
            ee2Var = this.f88834e.getPlaybackParameters();
        }
        this.f88831b.a(ee2Var);
    }

    @Override // yads.zj1
    public final ee2 getPlaybackParameters() {
        zj1 zj1Var = this.f88834e;
        return zj1Var != null ? zj1Var.getPlaybackParameters() : this.f88831b.f91088f;
    }
}
