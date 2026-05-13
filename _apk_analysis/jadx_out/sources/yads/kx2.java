package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class kx2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u30 f91800c;

    public kx2(long j10, u30 u30Var) {
        this.f91799b = j10;
        this.f91800c = u30Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j10 = this.f91799b;
        long j11 = ((kx2) obj).f91799b;
        int i10 = ib3.f90737a;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }
}
