package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class kn3 implements jn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq0 f91668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m73 f91669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mn3 f91670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f91671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f91673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f91674g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f91675h;

    public kn3(pq0 pq0Var, m73 m73Var, mn3 mn3Var, String str, int i10) throws ob2 {
        this.f91668a = pq0Var;
        this.f91669b = m73Var;
        this.f91670c = mn3Var;
        int i11 = (mn3Var.f92469a * mn3Var.f92472d) / 8;
        if (mn3Var.f92471c != i11) {
            throw ob2.a("Expected block size: " + i11 + "; got: " + mn3Var.f92471c);
        }
        int i12 = mn3Var.f92470b * i11;
        int i13 = i12 * 8;
        int iMax = Math.max(i11, i12 / 10);
        this.f91672e = iMax;
        this.f91671d = new lx0().d(str).a(i13).e(i13).c(iMax).b(mn3Var.f92469a).g(mn3Var.f92470b).d(i10).a();
    }

    @Override // yads.jn3
    public final void a(int i10, long j10) {
        this.f91668a.a(new pn3(this.f91670c, 1, i10, j10));
        this.f91669b.a(this.f91671d);
    }

    @Override // yads.jn3
    public final void a(long j10) {
        this.f91673f = j10;
        this.f91674g = 0;
        this.f91675h = 0L;
    }

    @Override // yads.jn3
    public final boolean a(ld0 ld0Var, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f91674g) < (i11 = this.f91672e)) {
            int iA = this.f91669b.a(ld0Var, (int) Math.min(i11 - i10, j11), true);
            if (iA == -1) {
                j11 = 0;
            } else {
                this.f91674g += iA;
                j11 -= (long) iA;
            }
        }
        int i12 = this.f91670c.f92471c;
        int i13 = this.f91674g / i12;
        if (i13 > 0) {
            long jA = this.f91673f + ib3.a(this.f91675h, 1000000L, r1.f92470b);
            int i14 = i13 * i12;
            int i15 = this.f91674g - i14;
            this.f91669b.a(jA, 1, i14, i15, null);
            this.f91675h += (long) i13;
            this.f91674g = i15;
        }
        return j11 <= 0;
    }
}
