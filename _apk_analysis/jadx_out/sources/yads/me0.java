package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class me0 implements p92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f92333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f92334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f92335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z33 f92336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f92337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f92338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f92339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f92340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f92341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f92342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f92343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f92344l;

    public me0(z33 z33Var, long j10, long j11, long j12, long j13, boolean z10) {
        ni.a(j10 >= 0 && j11 > j10);
        this.f92336d = z33Var;
        this.f92334b = j10;
        this.f92335c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f92338f = j13;
            this.f92337e = 4;
        } else {
            this.f92337e = 0;
        }
        this.f92333a = new o92();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    @Override // yads.p92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(yads.ld0 r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.me0.a(yads.ld0):long");
    }

    @Override // yads.p92
    public final vw2 a() {
        if (this.f92338f != 0) {
            return new le0(this);
        }
        return null;
    }

    @Override // yads.p92
    public final void a(long j10) {
        long j11 = this.f92338f - 1;
        int i10 = ib3.f90737a;
        this.f92340h = Math.max(0L, Math.min(j10, j11));
        this.f92337e = 2;
        this.f92341i = this.f92334b;
        this.f92342j = this.f92335c;
        this.f92343k = 0L;
        this.f92344l = this.f92338f;
    }
}
