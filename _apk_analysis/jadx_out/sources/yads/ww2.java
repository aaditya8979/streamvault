package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ww2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ww2 f96549c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96551b;

    static {
        ww2 ww2Var = new ww2(0L, 0L);
        new ww2(Long.MAX_VALUE, Long.MAX_VALUE);
        new ww2(Long.MAX_VALUE, 0L);
        new ww2(0L, Long.MAX_VALUE);
        f96549c = ww2Var;
    }

    public ww2(long j10, long j11) {
        ni.a(j10 >= 0);
        ni.a(j11 >= 0);
        this.f96550a = j10;
        this.f96551b = j11;
    }

    public final long a(long j10, long j11, long j12) {
        long j13 = this.f96550a;
        if (j13 == 0 && this.f96551b == 0) {
            return j10;
        }
        int i10 = ib3.f90737a;
        long j14 = j10 - j13;
        long j15 = ((j13 ^ j10) & (j10 ^ j14)) >= 0 ? j14 : Long.MIN_VALUE;
        long j16 = this.f96551b;
        long j17 = j10 + j16;
        long j18 = ((j16 ^ j17) & (j10 ^ j17)) >= 0 ? j17 : Long.MAX_VALUE;
        boolean z10 = j15 <= j11 && j11 <= j18;
        boolean z11 = j15 <= j12 && j12 <= j18;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ww2.class != obj.getClass()) {
            return false;
        }
        ww2 ww2Var = (ww2) obj;
        return this.f96550a == ww2Var.f96550a && this.f96551b == ww2Var.f96551b;
    }

    public final int hashCode() {
        return (((int) this.f96550a) * 31) + ((int) this.f96551b);
    }
}
