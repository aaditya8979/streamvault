package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class zv0 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bw0 f97797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97798b;

    public zv0(bw0 bw0Var, long j10) {
        this.f97797a = bw0Var;
        this.f97798b = j10;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        bw0 bw0Var = this.f97797a;
        aw0 aw0Var = bw0Var.f88172k;
        if (aw0Var == null) {
            throw new IllegalStateException();
        }
        long[] jArr = aw0Var.f87818a;
        long[] jArr2 = aw0Var.f87819b;
        int iB = ib3.b(jArr, bw0Var.a(j10), false);
        long j11 = iB == -1 ? 0L : jArr[iB];
        long j12 = iB != -1 ? jArr2[iB] : 0L;
        long j13 = this.f97797a.f88166e;
        long j14 = (j11 * 1000000) / j13;
        long j15 = this.f97798b;
        xw2 xw2Var = new xw2(j14, j12 + j15);
        if (j14 == j10 || iB == jArr.length - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var, new xw2((jArr[i10] * 1000000) / j13, j15 + jArr2[i10]));
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f97797a.b();
    }
}
