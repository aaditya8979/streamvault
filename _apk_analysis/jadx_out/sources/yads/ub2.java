package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class ub2 implements rw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mx0 f95594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public y63 f95595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m73 f95596c;

    public ub2(String str) {
        this.f95594a = new lx0().d(str).a();
    }

    @Override // yads.rw2
    public final void a(jb2 jb2Var) {
        long jA;
        y63 y63Var = this.f95595b;
        if (y63Var == null) {
            throw new IllegalStateException();
        }
        int i10 = ib3.f90737a;
        synchronized (y63Var) {
            long j10 = y63Var.f97016c;
            jA = j10 != -9223372036854775807L ? j10 + y63Var.f97015b : y63Var.a();
        }
        long jB = this.f95595b.b();
        if (jA == -9223372036854775807L || jB == -9223372036854775807L) {
            return;
        }
        mx0 mx0Var = this.f95594a;
        if (jB != mx0Var.f92614q) {
            lx0 lx0Var = new lx0(mx0Var);
            lx0Var.f92152o = jB;
            mx0 mx0Var2 = new mx0(lx0Var);
            this.f95594a = mx0Var2;
            this.f95596c.a(mx0Var2);
        }
        int i11 = jb2Var.f91149c - jb2Var.f91148b;
        this.f95596c.a(i11, jb2Var);
        this.f95596c.a(jA, 1, i11, 0, null);
    }

    @Override // yads.rw2
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f95595b = y63Var;
        l93Var.a();
        l93Var.b();
        m73 m73VarA = pq0Var.a(l93Var.f91914d, 5);
        this.f95596c = m73VarA;
        m73VarA.a(this.f95594a);
    }
}
