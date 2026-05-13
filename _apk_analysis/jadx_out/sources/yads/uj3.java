package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class uj3 extends n53 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f95687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f95688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f95690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f95691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f95692g;

    public uj3(m73 m73Var) {
        super(m73Var);
        this.f95687b = new jb2(dy1.f89024a);
        this.f95688c = new jb2(4);
    }

    public final boolean a(long j10, jb2 jb2Var) throws ob2 {
        int iM = jb2Var.m();
        byte[] bArr = jb2Var.f91147a;
        int i10 = jb2Var.f91148b;
        int i11 = i10 + 2;
        int i12 = ((bArr[i10 + 1] & 255) << 8) | (((bArr[i10] & 255) << 24) >> 8);
        int i13 = i10 + 3;
        jb2Var.f91148b = i13;
        long j11 = (((long) ((bArr[i11] & 255) | i12)) * 1000) + j10;
        if (iM == 0 && !this.f95690e) {
            byte[] bArr2 = new byte[jb2Var.f91149c - i13];
            jb2 jb2Var2 = new jb2(bArr2);
            jb2Var.a(bArr2, 0, jb2Var.f91149c - jb2Var.f91148b);
            ul ulVarA = ul.a(jb2Var2);
            this.f95689d = ulVarA.f95708b;
            lx0 lx0Var = new lx0();
            lx0Var.f92148k = "video/avc";
            lx0Var.f92145h = ulVarA.f95712f;
            lx0Var.f92153p = ulVarA.f95709c;
            lx0Var.f92154q = ulVarA.f95710d;
            lx0Var.f92157t = ulVarA.f95711e;
            lx0Var.f92150m = ulVarA.f95707a;
            this.f92746a.a(new mx0(lx0Var));
            this.f95690e = true;
            return false;
        }
        if (iM != 1 || !this.f95690e) {
            return false;
        }
        int i14 = this.f95692g == 1 ? 1 : 0;
        if (!this.f95691f && i14 == 0) {
            return false;
        }
        byte[] bArr3 = this.f95688c.f91147a;
        bArr3[0] = 0;
        bArr3[1] = 0;
        bArr3[2] = 0;
        int i15 = 4 - this.f95689d;
        int i16 = 0;
        while (jb2Var.f91149c - jb2Var.f91148b > 0) {
            jb2Var.a(this.f95688c.f91147a, i15, this.f95689d);
            this.f95688c.e(0);
            int iP = this.f95688c.p();
            this.f95687b.e(0);
            this.f92746a.a(4, this.f95687b);
            this.f92746a.a(iP, jb2Var);
            i16 = i16 + 4 + iP;
        }
        this.f92746a.a(j11, i14, i16, 0, null);
        this.f95691f = true;
        return true;
    }

    public final boolean a(jb2 jb2Var) throws m53 {
        int iM = jb2Var.m();
        int i10 = (iM >> 4) & 15;
        int i11 = iM & 15;
        if (i11 != 7) {
            throw new m53(mg2.a("Video format not supported: ", i11));
        }
        this.f95692g = i10;
        return i10 != 5;
    }
}
