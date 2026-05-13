package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class zd0 implements sf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib0 f97528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f97529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f97530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f97531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f97532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f97533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f97534g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f97535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f97536i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f97537j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f97538k;

    public zd0() {
        this(new ib0(), 50000, 50000, 2500, 5000, -1, false);
    }

    public zd0(ib0 ib0Var, int i10, int i11, int i12, int i13, int i14, boolean z10) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f97528a = ib0Var;
        this.f97529b = ib3.a(i10);
        this.f97530c = ib3.a(i11);
        this.f97531d = ib3.a(i12);
        this.f97532e = ib3.a(i13);
        this.f97533f = i14;
        this.f97537j = i14 == -1 ? 13107200 : i14;
        this.f97534g = z10;
        this.f97535h = ib3.a(0);
        this.f97536i = false;
    }

    public static void a(int i10, int i11, String str, String str2) {
        ni.a(str + " cannot be less than " + str2, i10 >= i11);
    }

    public final long a() {
        return this.f97535h;
    }

    public final void a(boolean z10) {
        int i10 = this.f97533f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f97537j = i10;
        this.f97538k = false;
        if (z10) {
            ib0 ib0Var = this.f97528a;
            synchronized (ib0Var) {
                if (ib0Var.f90726a) {
                    ib0Var.a(0);
                }
            }
        }
    }

    public final boolean b() {
        return this.f97536i;
    }
}
