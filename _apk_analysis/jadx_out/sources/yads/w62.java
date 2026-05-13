package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class w62 implements ay0, m62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d62 f96296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tj2 f96297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sj2 f96298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u2 f96299d;

    public w62(d62 d62Var, x42 x42Var, sj2 sj2Var, u2 u2Var) {
        this.f96296a = d62Var;
        this.f96297b = x42Var;
        this.f96298c = sj2Var;
        this.f96299d = u2Var;
    }

    @Override // yads.m62
    public final void a() {
        this.f96297b.a();
        invalidate();
    }

    @Override // yads.m62
    public final void a(long j10, long j11) {
        long j12 = j11 + this.f96298c.f94850a;
        long jA = this.f96299d.a(j10);
        if (j12 < jA) {
            this.f96297b.a(jA, j12);
        } else {
            invalidate();
            this.f96297b.a();
        }
    }

    @Override // yads.m62
    public final void b() {
        this.f96297b.a();
        invalidate();
    }

    @Override // yads.ay0
    public final void invalidate() {
        this.f96296a.f88769a.remove(this);
    }

    @Override // yads.ay0
    public final void pause() {
    }

    @Override // yads.ay0
    public final void resume() {
    }

    @Override // yads.ay0
    public final void start() {
        this.f96296a.f88769a.add(this);
    }
}
