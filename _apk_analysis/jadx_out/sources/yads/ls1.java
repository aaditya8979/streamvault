package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ls1 implements pm1, om1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pm1 f92081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92082c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public om1 f92083d;

    public ls1(pm1 pm1Var, long j10) {
        this.f92081b = pm1Var;
        this.f92082c = j10;
    }

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        return this.f92081b.a(j10 - this.f92082c, ww2Var) + this.f92082c;
    }

    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        ns2[] ns2VarArr2 = new ns2[ns2VarArr.length];
        int i10 = 0;
        while (true) {
            ns2 ns2Var = null;
            if (i10 >= ns2VarArr.length) {
                break;
            }
            ms1 ms1Var = (ms1) ns2VarArr[i10];
            if (ms1Var != null) {
                ns2Var = ms1Var.f92529b;
            }
            ns2VarArr2[i10] = ns2Var;
            i10++;
        }
        long jA = this.f92081b.a(op0VarArr, zArr, ns2VarArr2, zArr2, j10 - this.f92082c);
        for (int i11 = 0; i11 < ns2VarArr.length; i11++) {
            ns2 ns2Var2 = ns2VarArr2[i11];
            if (ns2Var2 == null) {
                ns2VarArr[i11] = null;
            } else {
                ns2 ns2Var3 = ns2VarArr[i11];
                if (ns2Var3 == null || ((ms1) ns2Var3).f92529b != ns2Var2) {
                    ns2VarArr[i11] = new ms1(ns2Var2, this.f92082c);
                }
            }
        }
        return jA + this.f92082c;
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f92083d = om1Var;
        this.f92081b.a(this, j10 - this.f92082c);
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        om1 om1Var = this.f92083d;
        om1Var.getClass();
        om1Var.a((pm1) this);
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        om1 om1Var = this.f92083d;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        return this.f92081b.continueLoading(j10 - this.f92082c);
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        this.f92081b.discardBuffer(j10 - this.f92082c, z10);
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.f92081b.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f92082c + bufferedPositionUs;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.f92081b.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f92082c + nextLoadPositionUs;
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        return this.f92081b.getTrackGroups();
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        return this.f92081b.isLoading();
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() {
        this.f92081b.maybeThrowPrepareError();
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        long discontinuity = this.f92081b.readDiscontinuity();
        if (discontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f92082c + discontinuity;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        this.f92081b.reevaluateBuffer(j10 - this.f92082c);
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        return this.f92081b.seekToUs(j10 - this.f92082c) + this.f92082c;
    }
}
