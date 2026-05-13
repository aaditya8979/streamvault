package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class x21 implements ul0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m73 f96606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96607c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f96609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f96610f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f96605a = new jb2(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f96608d = -9223372036854775807L;

    @Override // yads.ul0
    public final void a() {
        this.f96607c = false;
        this.f96608d = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f96607c = true;
        if (j10 != -9223372036854775807L) {
            this.f96608d = j10;
        }
        this.f96609e = 0;
        this.f96610f = 0;
    }

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f96606b == null) {
            throw new IllegalStateException();
        }
        if (this.f96607c) {
            int i10 = jb2Var.f91149c - jb2Var.f91148b;
            int i11 = this.f96610f;
            if (i11 < 10) {
                int iMin = Math.min(i10, 10 - i11);
                System.arraycopy(jb2Var.f91147a, jb2Var.f91148b, this.f96605a.f91147a, this.f96610f, iMin);
                if (this.f96610f + iMin == 10) {
                    this.f96605a.e(0);
                    if (73 != this.f96605a.m() || 68 != this.f96605a.m() || 51 != this.f96605a.m()) {
                        ih1.d("Id3Reader", "Discarding invalid ID3 tag");
                        this.f96607c = false;
                        return;
                    } else {
                        jb2 jb2Var2 = this.f96605a;
                        jb2Var2.e(jb2Var2.f91148b + 3);
                        this.f96609e = this.f96605a.l() + 10;
                    }
                }
            }
            int iMin2 = Math.min(i10, this.f96609e - this.f96610f);
            this.f96606b.a(iMin2, jb2Var);
            this.f96610f += iMin2;
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f91914d, 5);
        this.f96606b = m73VarA;
        lx0 lx0Var = new lx0();
        l93Var.b();
        lx0Var.f92138a = l93Var.f91915e;
        lx0Var.f92148k = "application/id3";
        m73VarA.a(new mx0(lx0Var));
    }

    @Override // yads.ul0
    public final void b() {
        int i10;
        m73 m73Var = this.f96606b;
        if (m73Var == null) {
            throw new IllegalStateException();
        }
        if (this.f96607c && (i10 = this.f96609e) != 0 && this.f96610f == i10) {
            long j10 = this.f96608d;
            if (j10 != -9223372036854775807L) {
                m73Var.a(j10, 1, i10, 0, null);
            }
            this.f96607c = false;
        }
    }
}
