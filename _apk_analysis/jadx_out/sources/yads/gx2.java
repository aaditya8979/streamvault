package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class gx2 extends hx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f90149e;

    public gx2(pl2 pl2Var, long j10, long j11, long j12, long j13) {
        super(pl2Var, j10, j11);
        this.f90148d = j12;
        this.f90149e = j13;
    }

    public final pl2 b() {
        long j10 = this.f90149e;
        if (j10 <= 0) {
            return null;
        }
        return new pl2(null, this.f90148d, j10);
    }
}
