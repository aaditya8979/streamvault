package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pl2 f90588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90590c;

    public hx2(pl2 pl2Var, long j10, long j11) {
        this.f90588a = pl2Var;
        this.f90589b = j10;
        this.f90590c = j11;
    }

    public final long a() {
        return ib3.a(this.f90590c, 1000000L, this.f90589b);
    }

    public pl2 a(lo2 lo2Var) {
        return this.f90588a;
    }
}
