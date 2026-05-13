package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class jx2 implements as {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qj0 f91407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91411e;

    public jx2(qj0 qj0Var, long j10, int i10, long j11, int i11) {
        this.f91407a = qj0Var;
        this.f91408b = j10;
        this.f91409c = i10;
        this.f91410d = j11;
        this.f91411e = i11;
    }

    @Override // yads.as
    public final void a(long j10, long j11, long j12) {
        float f10;
        float f11;
        long j13 = this.f91410d + j12;
        this.f91410d = j13;
        qj0 qj0Var = this.f91407a;
        long j14 = this.f91408b;
        if (j14 == -1 || j14 == 0) {
            int i10 = this.f91409c;
            if (i10 != 0) {
                f11 = (this.f91411e * 100.0f) / i10;
                ((lj0) qj0Var).a(j14, j13, f11);
            }
            f10 = -1.0f;
        } else {
            f10 = (j13 * 100.0f) / j14;
        }
        f11 = f10;
        ((lj0) qj0Var).a(j14, j13, f11);
    }
}
