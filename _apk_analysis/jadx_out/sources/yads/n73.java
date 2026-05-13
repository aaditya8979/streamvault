package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e73 f92764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f92766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f92767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f92769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f92770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f92771h;

    public n73(e73 e73Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        ni.a(iArr.length == jArr2.length);
        ni.a(jArr.length == jArr2.length);
        ni.a(iArr2.length == jArr2.length);
        this.f92764a = e73Var;
        this.f92766c = jArr;
        this.f92767d = iArr;
        this.f92768e = i10;
        this.f92769f = jArr2;
        this.f92770g = iArr2;
        this.f92771h = j10;
        this.f92765b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j10) {
        for (int iA = ib3.a(this.f92769f, j10, true); iA < this.f92769f.length; iA++) {
            if ((this.f92770g[iA] & 1) != 0) {
                return iA;
            }
        }
        return -1;
    }
}
