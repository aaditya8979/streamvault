package yads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z33 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f97377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pq0 f97378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p92 f97379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f97380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f97381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f97382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f97383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97384i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f97386k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f97387l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f97388m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n92 f97376a = new n92();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x33 f97385j = new x33();

    public abstract long a(jb2 jb2Var);

    public void a(long j10) {
        this.f97382g = j10;
    }

    public void a(boolean z10) {
        if (z10) {
            this.f97385j = new x33();
            this.f97381f = 0L;
            this.f97383h = 0;
        } else {
            this.f97383h = 1;
        }
        this.f97380e = -1L;
        this.f97382g = 0L;
    }

    public abstract boolean a(jb2 jb2Var, long j10, x33 x33Var);
}
