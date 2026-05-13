package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class rx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f94631a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n73 f94634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public re0 f94635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f94636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f94637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f94638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f94639i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f94642l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g73 f94632b = new g73();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f94633c = new jb2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb2 f94640j = new jb2(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jb2 f94641k = new jb2();

    public rx0(m73 m73Var, n73 n73Var, re0 re0Var) {
        this.f94631a = m73Var;
        this.f94634d = n73Var;
        this.f94635e = re0Var;
        a(n73Var, re0Var);
    }

    public final int a(int i10, int i11) {
        jb2 jb2Var;
        f73 f73VarA = a();
        if (f73VarA == null) {
            return 0;
        }
        int length = f73VarA.f89504d;
        if (length != 0) {
            jb2Var = this.f94632b.f89861n;
        } else {
            byte[] bArr = f73VarA.f89505e;
            int i12 = ib3.f90737a;
            jb2 jb2Var2 = this.f94641k;
            int length2 = bArr.length;
            jb2Var2.f91147a = bArr;
            jb2Var2.f91149c = length2;
            jb2Var2.f91148b = 0;
            length = bArr.length;
            jb2Var = jb2Var2;
        }
        g73 g73Var = this.f94632b;
        boolean z10 = g73Var.f89858k && g73Var.f89859l[this.f94636f];
        boolean z11 = z10 || i11 != 0;
        jb2 jb2Var3 = this.f94640j;
        jb2Var3.f91147a[0] = (byte) ((z11 ? 128 : 0) | length);
        jb2Var3.e(0);
        this.f94631a.a(1, this.f94640j);
        this.f94631a.a(length, jb2Var);
        if (!z11) {
            return length + 1;
        }
        if (!z10) {
            this.f94633c.c(8);
            jb2 jb2Var4 = this.f94633c;
            byte[] bArr2 = jb2Var4.f91147a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            this.f94631a.a(8, jb2Var4);
            return length + 9;
        }
        jb2 jb2Var5 = this.f94632b.f89861n;
        int iR = jb2Var5.r();
        jb2Var5.e(jb2Var5.f91148b - 2);
        int i13 = (iR * 6) + 2;
        if (i11 != 0) {
            this.f94633c.c(i13);
            byte[] bArr3 = this.f94633c.f91147a;
            jb2Var5.a(bArr3, 0, i13);
            int i14 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i14 >> 8) & 255);
            bArr3[3] = (byte) (i14 & 255);
            jb2Var5 = this.f94633c;
        }
        this.f94631a.a(i13, jb2Var5);
        return length + 1 + i13;
    }

    public final f73 a() {
        if (!this.f94642l) {
            return null;
        }
        g73 g73Var = this.f94632b;
        re0 re0Var = g73Var.f89848a;
        int i10 = ib3.f90737a;
        int i11 = re0Var.f94402a;
        f73 f73Var = g73Var.f89860m;
        if (f73Var == null) {
            f73[] f73VarArr = this.f94634d.f92764a.f89150k;
            f73Var = f73VarArr == null ? null : f73VarArr[i11];
        }
        if (f73Var == null || !f73Var.f89501a) {
            return null;
        }
        return f73Var;
    }

    public final void a(n73 n73Var, re0 re0Var) {
        this.f94634d = n73Var;
        this.f94635e = re0Var;
        this.f94631a.a(n73Var.f92764a.f89145f);
        b();
    }

    public final void b() {
        g73 g73Var = this.f94632b;
        g73Var.f89851d = 0;
        g73Var.f89863p = 0L;
        g73Var.f89864q = false;
        g73Var.f89858k = false;
        g73Var.f89862o = false;
        g73Var.f89860m = null;
        this.f94636f = 0;
        this.f94638h = 0;
        this.f94637g = 0;
        this.f94639i = 0;
        this.f94642l = false;
    }
}
