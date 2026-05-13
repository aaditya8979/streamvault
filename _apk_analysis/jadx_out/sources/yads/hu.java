package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hu implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f90556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f90557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f90558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f90559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f90560f;

    public hu(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f90556b = iArr;
        this.f90557c = jArr;
        this.f90558d = jArr2;
        this.f90559e = jArr3;
        int length = iArr.length;
        this.f90555a = length;
        if (length <= 0) {
            this.f90560f = 0L;
        } else {
            int i10 = length - 1;
            this.f90560f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        int iB = ib3.b(this.f90559e, j10, true);
        long[] jArr = this.f90559e;
        long j11 = jArr[iB];
        long[] jArr2 = this.f90557c;
        xw2 xw2Var = new xw2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == this.f90555a - 1) {
            return new tw2(xw2Var, xw2Var);
        }
        int i10 = iB + 1;
        return new tw2(xw2Var, new xw2(jArr[i10], jArr2[i10]));
    }

    @Override // yads.vw2
    public final boolean b() {
        return true;
    }

    @Override // yads.vw2
    public final long c() {
        return this.f90560f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f90555a + ", sizes=" + Arrays.toString(this.f90556b) + ", offsets=" + Arrays.toString(this.f90557c) + ", timeUs=" + Arrays.toString(this.f90559e) + ", durationsUs=" + Arrays.toString(this.f90558d) + ")";
    }
}
