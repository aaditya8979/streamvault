package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class o33 implements pq0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pq0 f93108c;

    public o33(long j10, pq0 pq0Var) {
        this.f93107b = j10;
        this.f93108c = pq0Var;
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        return this.f93108c.a(i10, i11);
    }

    @Override // yads.pq0
    public final void a() {
        this.f93108c.a();
    }

    @Override // yads.pq0
    public final void a(vw2 vw2Var) {
        this.f93108c.a(new n33(this, vw2Var));
    }
}
