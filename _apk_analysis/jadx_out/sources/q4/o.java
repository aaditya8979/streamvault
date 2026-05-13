package q4;

import a6.k0;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f77807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f77809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f77810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f77812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f77813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f77814h;

    public o(l lVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        a6.a.a(iArr.length == jArr2.length);
        a6.a.a(jArr.length == jArr2.length);
        a6.a.a(iArr2.length == jArr2.length);
        this.f77807a = lVar;
        this.f77809c = jArr;
        this.f77810d = iArr;
        this.f77811e = i10;
        this.f77812f = jArr2;
        this.f77813g = iArr2;
        this.f77814h = j10;
        this.f77808b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iH = k0.h(this.f77812f, j10, true, false); iH >= 0; iH--) {
            if ((this.f77813g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iE = k0.e(this.f77812f, j10, true, false); iE < this.f77812f.length; iE++) {
            if ((this.f77813g[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }
}
