package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class nv1 implements ul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f93001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ov1 f93002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f93003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m73 f93004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f93005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f93006f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f93007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f93008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f93009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f93010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f93011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f93012l;

    public nv1(String str) {
        jb2 jb2Var = new jb2(4);
        this.f93001a = jb2Var;
        jb2Var.a()[0] = -1;
        this.f93002b = new ov1();
        this.f93012l = -9223372036854775807L;
        this.f93003c = str;
    }

    @Override // yads.ul0
    public final void a() {
        this.f93006f = 0;
        this.f93007g = 0;
        this.f93009i = false;
        this.f93012l = -9223372036854775807L;
    }

    @Override // yads.ul0
    public final void a(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f93012l = j10;
        }
    }

    @Override // yads.ul0
    public final void a(jb2 jb2Var) {
        if (this.f93004d == null) {
            throw new IllegalStateException();
        }
        while (true) {
            int i10 = jb2Var.f91149c;
            int i11 = jb2Var.f91148b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f93006f;
            if (i13 == 0) {
                byte[] bArr = jb2Var.f91147a;
                while (true) {
                    if (i11 >= i10) {
                        jb2Var.e(i10);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f93009i && (b10 & 224) == 224;
                    this.f93009i = z10;
                    if (z11) {
                        jb2Var.e(i11 + 1);
                        this.f93009i = false;
                        this.f93001a.f91147a[1] = bArr[i11];
                        this.f93007g = 2;
                        this.f93006f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i13 == 1) {
                int iMin = Math.min(i12, 4 - this.f93007g);
                jb2Var.a(this.f93001a.f91147a, this.f93007g, iMin);
                int i14 = this.f93007g + iMin;
                this.f93007g = i14;
                if (i14 >= 4) {
                    this.f93001a.e(0);
                    if (this.f93002b.a(this.f93001a.b())) {
                        ov1 ov1Var = this.f93002b;
                        this.f93011k = ov1Var.f93339c;
                        if (!this.f93008h) {
                            long j10 = ((long) ov1Var.f93343g) * 1000000;
                            int i15 = ov1Var.f93340d;
                            this.f93010j = j10 / ((long) i15);
                            lx0 lx0Var = new lx0();
                            lx0Var.f92138a = this.f93005e;
                            lx0Var.f92148k = ov1Var.f93338b;
                            lx0Var.f92149l = 4096;
                            lx0Var.f92161x = ov1Var.f93341e;
                            lx0Var.f92162y = i15;
                            lx0Var.f92140c = this.f93003c;
                            this.f93004d.a(new mx0(lx0Var));
                            this.f93008h = true;
                        }
                        this.f93001a.e(0);
                        this.f93004d.a(4, this.f93001a);
                        this.f93006f = 2;
                    } else {
                        this.f93007g = 0;
                        this.f93006f = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int iMin2 = Math.min(i12, this.f93011k - this.f93007g);
                this.f93004d.a(iMin2, jb2Var);
                int i16 = this.f93007g + iMin2;
                this.f93007g = i16;
                int i17 = this.f93011k;
                if (i16 >= i17) {
                    long j11 = this.f93012l;
                    if (j11 != -9223372036854775807L) {
                        this.f93004d.a(j11, 1, i17, 0, null);
                        this.f93012l += this.f93010j;
                    }
                    this.f93007g = 0;
                    this.f93006f = 0;
                }
            }
        }
    }

    @Override // yads.ul0
    public final void a(pq0 pq0Var, l93 l93Var) {
        l93Var.a();
        l93Var.b();
        this.f93005e = l93Var.f91915e;
        l93Var.b();
        this.f93004d = pq0Var.a(l93Var.f91914d, 1);
    }

    @Override // yads.ul0
    public final void b() {
    }
}
