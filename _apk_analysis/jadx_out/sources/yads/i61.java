package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class i61 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f90682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f90683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f90685d;

    public i61(long j10, long[] jArr, long[] jArr2) {
        ni.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f90685d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f90682a = jArr;
            this.f90683b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f90682a = jArr3;
            long[] jArr4 = new long[i10];
            this.f90683b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f90684c = j10;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        if (!this.f90685d) {
            xw2 xw2Var = xw2.f96907c;
            return new tw2(xw2Var, xw2Var);
        }
        int iB = ib3.b(this.f90683b, j10, true);
        long[] jArr = this.f90683b;
        long j11 = jArr[iB];
        long[] jArr2 = this.f90682a;
        xw2 xw2Var2 = new xw2(j11, jArr2[iB]);
        if (j11 == j10 || iB == jArr.length - 1) {
            return new tw2(xw2Var2, xw2Var2);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var2, new xw2(jArr[i10], jArr2[i10]));
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f90685d;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f90684c;
    }
}
