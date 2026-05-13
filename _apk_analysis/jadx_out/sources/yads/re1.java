package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class re1 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f94407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ib2 f94408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m73 f94409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f94410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public mx0 f94411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f94412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f94413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f94414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f94415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f94416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f94417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f94418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f94419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f94420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f94421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f94422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f94423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f94424s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f94425t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f94426u;

    public re1(String str) {
        this.f94406a = str;
        jb2 jb2Var = new jb2(1024);
        this.f94407b = jb2Var;
        this.f94408c = new ib2(jb2Var.a());
        this.f94416k = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a() {
        this.f94412g = 0;
        this.f94416k = -9223372036854775807L;
        this.f94417l = false;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f94416k = j10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0180, code lost:
    
        throw new yads.ob2(null, null, true, 1);
     */
    @Override // yads.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.jb2 r18) throws yads.ob2 {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.re1.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f94409d = pq0Var.a(l93Var.f91914d, 1);
        l93Var.b();
        this.f94410e = l93Var.f91915e;
    }

    @Override // yads.ul0
    public final void b() {
    }
}
