package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class ck implements ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f88479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jb2 f88481c;

    public ck(wj wjVar, mx0 mx0Var) {
        jb2 jb2Var = wjVar.f96399b;
        this.f88481c = jb2Var;
        jb2Var.e(12);
        int iP = jb2Var.p();
        if ("audio/raw".equals(mx0Var.f92610m)) {
            int iB = ib3.b(mx0Var.B, mx0Var.f92623z);
            if (iP == 0 || iP % iB != 0) {
                ih1.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iP);
                iP = iB;
            }
        }
        this.f88479a = iP == 0 ? -1 : iP;
        this.f88480b = jb2Var.p();
    }

    @Override // yads.ak
    public final int a() {
        return this.f88479a;
    }

    @Override // yads.ak
    public final int b() {
        return this.f88480b;
    }

    @Override // yads.ak
    public final int c() {
        int i10 = this.f88479a;
        return i10 == -1 ? this.f88481c.p() : i10;
    }
}
