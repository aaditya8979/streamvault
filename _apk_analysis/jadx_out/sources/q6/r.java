package q6;

import s7.m0;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f77992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f77994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f77995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f77997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f77998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f77999h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        s7.a.a(iArr.length == jArr2.length);
        s7.a.a(jArr.length == jArr2.length);
        s7.a.a(iArr2.length == jArr2.length);
        this.f77992a = oVar;
        this.f77994c = jArr;
        this.f77995d = iArr;
        this.f77996e = i10;
        this.f77997f = jArr2;
        this.f77998g = iArr2;
        this.f77999h = j10;
        this.f77993b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = m0.i(this.f77997f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f77998g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iE = m0.e(this.f77997f, j10, true, false); iE < this.f77997f.length; iE++) {
            if ((this.f77998g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
