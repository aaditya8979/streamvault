package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class op3 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f93302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f93304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f93305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f93306f;

    public op3(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f93301a = j10;
        this.f93302b = i10;
        this.f93303c = j11;
        this.f93306f = jArr;
        this.f93304d = j12;
        this.f93305e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // yads.zw2
    public final long a() {
        return this.f93305e;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        long j11 = j10 - this.f93301a;
        if (!b() || j11 <= this.f93302b) {
            return 0L;
        }
        long[] jArr = this.f93306f;
        if (jArr == null) {
            throw new IllegalStateException();
        }
        double d10 = (j11 * 256.0d) / this.f93304d;
        int iB = ib3.b(jArr, (long) d10, true);
        long j12 = this.f93303c;
        long j13 = (((long) iB) * j12) / 100;
        long j14 = jArr[iB];
        int i10 = iB + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        return Math.round((j14 == (iB == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        if (!b()) {
            xw2 xw2Var = new xw2(0L, this.f93301a + ((long) this.f93302b));
            return new tw2(xw2Var, xw2Var);
        }
        long j11 = this.f93303c;
        int i10 = ib3.f90737a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / this.f93303c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i11 = (int) d10;
                long[] jArr = this.f93306f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d12 = jArr[i11];
                d11 = d12 + (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d12) * (d10 - ((double) i11)));
            }
        }
        xw2 xw2Var2 = new xw2(jMax, this.f93301a + Math.max(this.f93302b, Math.min(Math.round((d11 / 256.0d) * this.f93304d), this.f93304d - 1)));
        return new tw2(xw2Var2, xw2Var2);
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f93306f != null;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f93303c;
    }
}
