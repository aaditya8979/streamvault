package yads;

/* JADX INFO: loaded from: classes3.dex */
public class gz implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f90156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f90157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f90158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f90159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f90162g;

    public gz(int i10, int i11, long j10, long j11, boolean z10) {
        this.f90156a = j10;
        this.f90157b = j11;
        this.f90158c = i11 == -1 ? 1 : i11;
        this.f90160e = i10;
        this.f90162g = z10;
        if (j10 == -1) {
            this.f90159d = -1L;
            this.f90161f = -9223372036854775807L;
        } else {
            this.f90159d = j10 - j11;
            this.f90161f = a(i10, j10, j11);
        }
    }

    public static long a(int i10, long j10, long j11) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        long j11 = this.f90159d;
        if (j11 == -1 && !this.f90162g) {
            xw2 xw2Var = new xw2(0L, this.f90157b);
            return new tw2(xw2Var, xw2Var);
        }
        long j12 = (((long) this.f90160e) * j10) / 8000000;
        long j13 = this.f90158c;
        long jMin = (j12 / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L);
        long j14 = this.f90157b;
        long j15 = jMax + j14;
        long jA = a(this.f90160e, j15, j14);
        xw2 xw2Var2 = new xw2(jA, j15);
        if (this.f90159d != -1 && jA < j10) {
            long j16 = j15 + ((long) this.f90158c);
            if (j16 < this.f90156a) {
                return new tw2(xw2Var2, new xw2(a(this.f90160e, j16, this.f90157b), j16));
            }
        }
        return new tw2(xw2Var2, xw2Var2);
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f90159d != -1 || this.f90162g;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f90161f;
    }
}
