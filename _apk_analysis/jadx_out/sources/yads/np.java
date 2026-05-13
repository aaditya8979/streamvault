package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class np implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qp f92903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92905c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f92906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f92907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f92908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f92909g;

    public np(qp qpVar, long j10, long j11, long j12, long j13, long j14) {
        this.f92903a = qpVar;
        this.f92904b = j10;
        this.f92906d = j11;
        this.f92907e = j12;
        this.f92908f = j13;
        this.f92909g = j14;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        xw2 xw2Var = new xw2(j10, pp.a(this.f92903a.a(j10), this.f92905c, this.f92906d, this.f92907e, this.f92908f, this.f92909g));
        return new tw2(xw2Var, xw2Var);
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f92904b;
    }
}
