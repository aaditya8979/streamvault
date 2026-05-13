package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class j61 implements zw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh1 f91104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kh1 f91105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f91106d;

    public j61(long j10, long j11, long j12) {
        this.f91106d = j10;
        this.f91103a = j12;
        kh1 kh1Var = new kh1();
        this.f91104b = kh1Var;
        kh1 kh1Var2 = new kh1();
        this.f91105c = kh1Var2;
        kh1Var.a(0L);
        kh1Var2.a(j11);
    }

    @Override // yads.zw2
    public final long a() {
        return this.f91103a;
    }

    @Override // yads.zw2
    public final long a(long j10) {
        return this.f91104b.a(ib3.a(this.f91105c, j10));
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iA = ib3.a(this.f91104b, j10);
        long jA = this.f91104b.a(iA);
        xw2 xw2Var = new xw2(jA, this.f91105c.a(iA));
        if (jA != j10) {
            kh1 kh1Var = this.f91104b;
            if (iA != kh1Var.f91593a - 1) {
                int i10 = iA + 1;
                return new tw2(xw2Var, new xw2(kh1Var.a(i10), this.f91105c.a(i10)));
            }
        }
        return new tw2(xw2Var, xw2Var);
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f91106d;
    }

    public final boolean c(long j10) {
        kh1 kh1Var = this.f91104b;
        return j10 - kh1Var.a(kh1Var.f91593a - 1) < 100000;
    }
}
