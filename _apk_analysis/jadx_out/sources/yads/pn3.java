package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class pn3 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mn3 f93654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f93657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f93658e;

    public pn3(mn3 mn3Var, int i10, long j10, long j11) {
        this.f93654a = mn3Var;
        this.f93655b = i10;
        this.f93656c = j10;
        long j12 = (j11 - j10) / ((long) mn3Var.f92471c);
        this.f93657d = j12;
        this.f93658e = c(j12);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = (((long) this.f93654a.f92470b) * j10) / (((long) this.f93655b) * 1000000);
        long j12 = this.f93657d - 1;
        int i10 = ib3.f90737a;
        long jMax = Math.max(0L, Math.min(j11, j12));
        long j13 = (((long) this.f93654a.f92471c) * jMax) + this.f93656c;
        long jC = c(jMax);
        xw2 xw2Var = new xw2(jC, j13);
        if (jC >= j10 || jMax == this.f93657d - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        long j14 = jMax + 1;
        return new tw2(xw2Var, new xw2(c(j14), (((long) this.f93654a.f92471c) * j14) + this.f93656c));
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f93658e;
    }

    public final long c(long j10) {
        return ib3.a(j10 * ((long) this.f93655b), 1000000L, this.f93654a.f92470b);
    }
}
