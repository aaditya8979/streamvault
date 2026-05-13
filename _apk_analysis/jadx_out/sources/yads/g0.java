package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f89743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f89744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f89746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m73 f89747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f89748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f89749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f89750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f89751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0 f89752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f89753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f89754l;

    public g0() {
        this(null);
    }

    public g0(String str) {
        byte[] bArr = new byte[128];
        this.f89743a = new ib2(bArr);
        this.f89744b = new jb2(bArr);
        this.f89748f = 0;
        this.f89754l = -9223372036854775807L;
        this.f89745c = str;
    }

    @Override // yads.ul0
    public final void a() {
        this.f89748f = 0;
        this.f89749g = 0;
        this.f89750h = false;
        this.f89754l = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f89754l = j10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    @Override // yads.ul0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(yads.jb2 r23) {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.g0.a(yads.jb2):void");
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f89746d = l93Var.f91915e;
        l93Var.b();
        this.f89747e = pq0Var.a(l93Var.f91914d, 1);
    }

    @Override // yads.ul0
    public final void b() {
    }
}
