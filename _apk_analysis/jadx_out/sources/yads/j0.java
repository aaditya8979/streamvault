package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f91039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f91040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f91042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m73 f91043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f91044f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f91045g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f91046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f91047i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mx0 f91048j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f91049k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f91050l;

    public j0() {
        this(null);
    }

    public j0(String str) {
        byte[] bArr = new byte[16];
        this.f91039a = new ib2(bArr);
        this.f91040b = new jb2(bArr);
        this.f91044f = 0;
        this.f91045g = 0;
        this.f91046h = false;
        this.f91050l = -9223372036854775807L;
        this.f91041c = str;
    }

    @Override // yads.ul0
    public final void a() {
        this.f91044f = 0;
        this.f91045g = 0;
        this.f91046h = false;
        this.f91050l = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f91050l = j10;
        }
    }

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f91043e == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = jb2Var.f91149c - jb2Var.f91148b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f91044f;
            if (i11 == 0) {
                while (jb2Var.f91149c - jb2Var.f91148b > 0) {
                    if (this.f91046h) {
                        int iM = jb2Var.m();
                        this.f91046h = iM == 172;
                        if (iM == 64 || iM == 65) {
                            boolean z10 = iM == 65;
                            this.f91044f = 1;
                            byte[] bArr = this.f91040b.f91147a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z10 ? 65 : 64);
                            this.f91045g = 2;
                        }
                    } else {
                        this.f91046h = jb2Var.m() == 172;
                    }
                }
            } else if (i11 == 1) {
                byte[] bArr2 = this.f91040b.f91147a;
                int iMin = Math.min(i10, 16 - this.f91045g);
                jb2Var.a(bArr2, this.f91045g, iMin);
                int i12 = this.f91045g + iMin;
                this.f91045g = i12;
                if (i12 == 16) {
                    this.f91039a.b(0);
                    k0 k0VarA = l0.a(this.f91039a);
                    mx0 mx0Var = this.f91048j;
                    if (mx0Var == null || 2 != mx0Var.f92623z || k0VarA.f91434a != mx0Var.A || !"audio/ac4".equals(mx0Var.f92610m)) {
                        lx0 lx0Var = new lx0();
                        lx0Var.f92138a = this.f91042d;
                        lx0Var.f92148k = "audio/ac4";
                        lx0Var.f92161x = 2;
                        lx0Var.f92162y = k0VarA.f91434a;
                        lx0Var.f92140c = this.f91041c;
                        mx0 mx0Var2 = new mx0(lx0Var);
                        this.f91048j = mx0Var2;
                        this.f91043e.a(mx0Var2);
                    }
                    this.f91049k = k0VarA.f91435b;
                    this.f91047i = (((long) k0VarA.f91436c) * 1000000) / ((long) this.f91048j.A);
                    this.f91040b.e(0);
                    this.f91043e.a(16, this.f91040b);
                    this.f91044f = 2;
                }
            } else if (i11 == 2) {
                int iMin2 = Math.min(i10, this.f91049k - this.f91045g);
                this.f91043e.a(iMin2, jb2Var);
                int i13 = this.f91045g + iMin2;
                this.f91045g = i13;
                int i14 = this.f91049k;
                if (i13 == i14) {
                    long j10 = this.f91050l;
                    if (j10 != -9223372036854775807L) {
                        this.f91043e.a(j10, 1, i14, 0, null);
                        this.f91050l += this.f91047i;
                    }
                    this.f91044f = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f91042d = l93Var.f91915e;
        l93Var.b();
        this.f91043e = pq0Var.a(l93Var.f91914d, 1);
    }

    @Override // yads.ul0
    public final void b() {
    }
}
