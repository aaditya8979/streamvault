package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class zm0 implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f97660b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f97662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f97663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public an0 f97664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f97665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f97666h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ym0 f97661c = new ym0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f97667i = -9223372036854775807L;

    public zm0(an0 an0Var, mx0 mx0Var, boolean z10) {
        this.f97660b = mx0Var;
        this.f97664f = an0Var;
        this.f97662d = an0Var.f87753b;
        a(an0Var, z10);
    }

    @Override // yads.ns2
    public final int a(long j10) {
        int iMax = Math.max(this.f97666h, ib3.a(this.f97662d, j10, true));
        int i10 = iMax - this.f97666h;
        this.f97666h = iMax;
        return i10;
    }

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        int i11 = this.f97666h;
        boolean z10 = i11 == this.f97662d.length;
        if (z10 && !this.f97663e) {
            sa0Var.f94912b = 4;
            return -4;
        }
        if ((i10 & 2) != 0 || !this.f97665g) {
            nx0Var.f93035b = this.f97660b;
            this.f97665g = true;
            return -5;
        }
        if (z10) {
            return -3;
        }
        if ((i10 & 1) == 0) {
            this.f97666h = i11 + 1;
        }
        if ((i10 & 4) == 0) {
            byte[] bArrA = this.f97661c.a(this.f97664f.f87752a[i11]);
            sa0Var.c(bArrA.length);
            sa0Var.f94749d.put(bArrA);
        }
        sa0Var.f94751f = this.f97662d[i11];
        sa0Var.f94912b = 1;
        return -4;
    }

    @Override // yads.ns2
    public final void a() {
    }

    public final void a(an0 an0Var, boolean z10) {
        int i10 = this.f97666h;
        long j10 = -9223372036854775807L;
        long j11 = i10 == 0 ? -9223372036854775807L : this.f97662d[i10 - 1];
        this.f97663e = z10;
        this.f97664f = an0Var;
        long[] jArr = an0Var.f87753b;
        this.f97662d = jArr;
        long j12 = this.f97667i;
        if (j12 == -9223372036854775807L) {
            if (j11 != -9223372036854775807L) {
                this.f97666h = ib3.a(jArr, j11, false);
            }
        } else {
            int iA = ib3.a(jArr, j12, true);
            this.f97666h = iA;
            if (this.f97663e && iA == this.f97662d.length) {
                j10 = j12;
            }
            this.f97667i = j10;
        }
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return true;
    }
}
