package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class dk implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb2 f88877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f88880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88881e;

    public dk(wj wjVar) {
        jb2 jb2Var = wjVar.f96399b;
        this.f88877a = jb2Var;
        jb2Var.e(12);
        this.f88879c = jb2Var.p() & 255;
        this.f88878b = jb2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return -1;
    }

    @Override // yads.ak
    public final int b() {
        return this.f88878b;
    }

    @Override // yads.ak
    public final int c() {
        int i10 = this.f88879c;
        if (i10 == 8) {
            return this.f88877a.m();
        }
        if (i10 == 16) {
            return this.f88877a.r();
        }
        int i11 = this.f88880d;
        this.f88880d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f88881e & 15;
        }
        int iM = this.f88877a.m();
        this.f88881e = iM;
        return (iM & 240) >> 4;
    }
}
