package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class k30 implements i30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hu f91470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91471b;

    public k30(hu huVar, long j10) {
        this.f91470a = huVar;
        this.f91471b = j10;
    }

    @Override // yads.i30
    public final long a(long j10) {
        return this.f91470a.f90559e[(int) j10] - this.f91471b;
    }

    @Override // yads.i30
    public final long a(long j10, long j11) {
        hu huVar = this.f91470a;
        return ib3.b(huVar.f90559e, j10 + this.f91471b, true);
    }

    @Override // yads.i30
    public final boolean a() {
        return true;
    }

    @Override // yads.i30
    public final long b() {
        return 0L;
    }

    @Override // yads.i30
    public final long b(long j10, long j11) {
        return this.f91470a.f90558d[(int) j10];
    }

    @Override // yads.i30
    public final pl2 b(long j10) {
        return new pl2(null, this.f91470a.f90557c[(int) j10], r0.f90556b[r8]);
    }

    @Override // yads.i30
    public final long c(long j10) {
        return this.f91470a.f90555a;
    }

    @Override // yads.i30
    public final long c(long j10, long j11) {
        return 0L;
    }

    @Override // yads.i30
    public final long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // yads.i30
    public final long e(long j10, long j11) {
        return this.f91470a.f90555a;
    }
}
