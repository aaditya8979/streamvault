package yads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cx2 extends hx2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f88638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f88639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f88640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f88641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f88642i;

    public cx2(pl2 pl2Var, long j10, long j11, long j12, long j13, List list, long j14, long j15, long j16) {
        super(pl2Var, j10, j11);
        this.f88637d = j12;
        this.f88638e = j13;
        this.f88639f = list;
        this.f88642i = j14;
        this.f88640g = j15;
        this.f88641h = j16;
    }

    public abstract long a(long j10);

    public final long a(long j10, long j11) {
        if (a(j10) == -1) {
            long j12 = this.f88640g;
            if (j12 != -9223372036854775807L) {
                return Math.max(this.f88637d, c((j11 - this.f88641h) - j12, j10));
            }
        }
        return this.f88637d;
    }

    public abstract pl2 a(long j10, lo2 lo2Var);

    public final long b(long j10) {
        List list = this.f88639f;
        return ib3.a(list != null ? ((fx2) list.get((int) (j10 - this.f88637d))).f89720a - this.f90590c : (j10 - this.f88637d) * this.f88638e, 1000000L, this.f90589b);
    }

    public final long b(long j10, long j11) {
        List list = this.f88639f;
        if (list != null) {
            return (((fx2) list.get((int) (j10 - this.f88637d))).f89721b * 1000000) / this.f90589b;
        }
        long jA = a(j11);
        return (jA == -1 || j10 != (this.f88637d + jA) - 1) ? (this.f88638e * 1000000) / this.f90589b : j11 - b(j10);
    }

    public boolean b() {
        return this.f88639f != null;
    }

    public final long c(long j10, long j11) {
        long j12 = this.f88637d;
        long jA = a(j11);
        if (jA == 0) {
            return j12;
        }
        if (this.f88639f == null) {
            long j13 = (j10 / ((this.f88638e * 1000000) / this.f90589b)) + this.f88637d;
            return j13 < j12 ? j12 : jA == -1 ? j13 : Math.min(j13, (j12 + jA) - 1);
        }
        long j14 = (jA + j12) - 1;
        long j15 = j12;
        while (j15 <= j14) {
            long j16 = ((j14 - j15) / 2) + j15;
            long jB = b(j16);
            if (jB < j10) {
                j15 = j16 + 1;
            } else {
                if (jB <= j10) {
                    return j16;
                }
                j14 = j16 - 1;
            }
        }
        return j15 == j12 ? j15 : j14;
    }
}
