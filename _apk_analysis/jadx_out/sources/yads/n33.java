package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class n33 implements vw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vw2 f92729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o33 f92730b;

    public n33(o33 o33Var, vw2 vw2Var) {
        this.f92730b = o33Var;
        this.f92729a = vw2Var;
    }

    @Override // yads.vw2
    public final tw2 b(long j10) {
        tw2 tw2VarB = this.f92729a.b(j10);
        xw2 xw2Var = tw2VarB.f95410a;
        long j11 = xw2Var.f96908a;
        long j12 = xw2Var.f96909b;
        long j13 = this.f92730b.f93107b;
        xw2 xw2Var2 = new xw2(j11, j12 + j13);
        xw2 xw2Var3 = tw2VarB.f95411b;
        return new tw2(xw2Var2, new xw2(xw2Var3.f96908a, xw2Var3.f96909b + j13));
    }

    @Override // yads.vw2
    public final boolean b() {
        return this.f92729a.b();
    }

    @Override // yads.vw2
    public final long c() {
        return this.f92729a.c();
    }
}
