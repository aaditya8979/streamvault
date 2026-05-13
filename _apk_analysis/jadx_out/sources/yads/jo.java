package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jo extends cu {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f91311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f91312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f91313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public lo f91314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f91315n;

    public jo(p30 p30Var, u30 u30Var, mx0 mx0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(p30Var, u30Var, 1, mx0Var, i10, obj, j10, j11);
        mx0Var.getClass();
        this.f91311j = j14;
        this.f91312k = j12;
        this.f91313l = j13;
    }

    public final int a(int i10) {
        int[] iArr = this.f91315n;
        if (iArr != null) {
            return iArr[i10];
        }
        throw new IllegalStateException();
    }

    public long c() {
        long j10 = this.f91311j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean d();
}
