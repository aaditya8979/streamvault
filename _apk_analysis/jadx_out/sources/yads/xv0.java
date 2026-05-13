package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class xv0 implements p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f96883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0 f96884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f96885c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f96886d = -1;

    public xv0(bw0 bw0Var, aw0 aw0Var) {
        this.f96883a = bw0Var;
        this.f96884b = aw0Var;
    }

    @Override // yads.p92
    public final long a(ld0 ld0Var) {
        long j10 = this.f96886d;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.f96886d = -1L;
        return j11;
    }

    @Override // yads.p92
    public final vw2 a() {
        long j10 = this.f96885c;
        if (j10 != -1) {
            return new zv0(this.f96883a, j10);
        }
        throw new IllegalStateException();
    }

    @Override // yads.p92
    public final void a(long j10) {
        long[] jArr = this.f96884b.f87818a;
        this.f96886d = jArr[ib3.b(jArr, j10, true)];
    }
}
