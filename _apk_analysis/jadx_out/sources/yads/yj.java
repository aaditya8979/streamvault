package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f97183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f97184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f97185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f97186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f97187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f97188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f97189g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f97190h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f97191i;

    public yj(jb2 jb2Var, jb2 jb2Var2, boolean z10) throws ob2 {
        this.f97189g = jb2Var;
        this.f97188f = jb2Var2;
        this.f97187e = z10;
        jb2Var2.e(12);
        this.f97183a = jb2Var2.p();
        jb2Var.e(12);
        this.f97191i = jb2Var.p();
        qq0.a("first_chunk must be 1", jb2Var.b() == 1);
        this.f97184b = -1;
    }

    public final boolean a() {
        int i10 = this.f97184b + 1;
        this.f97184b = i10;
        if (i10 == this.f97183a) {
            return false;
        }
        this.f97186d = this.f97187e ? this.f97188f.q() : this.f97188f.n();
        if (this.f97184b == this.f97190h) {
            this.f97185c = this.f97189g.p();
            jb2 jb2Var = this.f97189g;
            jb2Var.e(jb2Var.f91148b + 4);
            int i11 = this.f97191i - 1;
            this.f97191i = i11;
            this.f97190h = i11 > 0 ? this.f97189g.p() - 1 : -1;
        }
        return true;
    }
}
