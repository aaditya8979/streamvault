package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class jz extends jo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f91420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f91421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fu f91422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f91423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f91424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f91425t;

    public jz(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, fu fuVar) {
        super(p30Var, u30Var, mx0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f91420o = i11;
        this.f91421p = j15;
        this.f91422q = fuVar;
    }

    @Override // yads.bg1
    public final void a() {
        int iA;
        if (this.f91423r == 0) {
            lo loVar = this.f91314m;
            if (loVar == null) {
                throw new IllegalStateException();
            }
            long j10 = this.f91421p;
            for (ms2 ms2Var : loVar.f92048b) {
                if (ms2Var.E != j10) {
                    ms2Var.E = j10;
                    ms2Var.f92556z = true;
                }
            }
            fu fuVar = this.f91422q;
            long j11 = this.f91312k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f91421p;
            long j13 = this.f91313l;
            ((ar) fuVar).a(loVar, j12, j13 != -9223372036854775807L ? j13 - this.f91421p : -9223372036854775807L);
        }
        try {
            u30 u30Var = this.f88606b;
            long j14 = this.f91423r;
            long j15 = u30Var.f95528g;
            long j16 = -1;
            if (j15 != -1) {
                j16 = j15 - j14;
            }
            u30 u30VarA = u30Var.a(j14, j16);
            r33 r33Var = this.f88613i;
            ld0 ld0Var = new ld0(r33Var, u30VarA.f95527f, r33Var.a(u30VarA));
            do {
                try {
                    if (this.f91424s) {
                        break;
                    }
                    iA = ((ar) this.f91422q).f87780b.a(ld0Var, ar.f87779l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                } finally {
                    this.f91423r = ld0Var.f91938d - this.f88606b.f95527f;
                }
            } while (iA == 0);
            s30.a(this.f88613i);
            this.f91425t = !this.f91424s;
        } catch (Throwable th2) {
            s30.a(this.f88613i);
            throw th2;
        }
    }

    @Override // yads.bg1
    public final void b() {
        this.f91424s = true;
    }

    @Override // yads.jo
    public final long c() {
        return this.f91311j + ((long) this.f91420o);
    }

    @Override // yads.jo
    public final boolean d() {
        return this.f91425t;
    }
}
