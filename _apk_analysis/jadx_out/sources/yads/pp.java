package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class pp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f93699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f93700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f93701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f93702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f93703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f93704h;

    public pp(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f93697a = j10;
        this.f93698b = j11;
        this.f93700d = j12;
        this.f93701e = j13;
        this.f93702f = j14;
        this.f93703g = j15;
        this.f93699c = j16;
        this.f93704h = a(j11, j12, j13, j14, j15, j16);
    }

    public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
        if (j13 + 1 >= j14 || j11 + 1 >= j12) {
            return j13;
        }
        long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
        long j17 = j16 / 20;
        int i10 = ib3.f90737a;
        return Math.max(j13, Math.min(((j16 + j13) - j15) - j17, j14 - 1));
    }
}
