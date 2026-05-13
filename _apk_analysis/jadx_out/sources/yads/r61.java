package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class r61 extends cu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fu f94290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public eu f94291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f94292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f94293m;

    public r61(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, fu fuVar) {
        super(p30Var, u30Var, 2, mx0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f94290j = fuVar;
    }

    @Override // yads.bg1
    public final void a() {
        if (this.f94292l == 0) {
            ((ar) this.f94290j).a(this.f94291k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            u30 u30Var = this.f88606b;
            long j10 = this.f94292l;
            long j11 = u30Var.f95528g;
            long j12 = -1;
            if (j11 != -1) {
                j12 = j11 - j10;
            }
            u30 u30VarA = u30Var.a(j10, j12);
            r33 r33Var = this.f88613i;
            ld0 ld0Var = new ld0(r33Var, u30VarA.f95527f, r33Var.a(u30VarA));
            while (!this.f94293m) {
                try {
                    int iA = ((ar) this.f94290j).f87780b.a(ld0Var, ar.f87779l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                    if (iA != 0) {
                        break;
                    }
                } finally {
                    this.f94292l = ld0Var.f91938d - this.f88606b.f95527f;
                }
            }
        } finally {
            s30.a(this.f88613i);
        }
    }

    @Override // yads.bg1
    public final void b() {
        this.f94293m = true;
    }
}
