package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class f93 implements rw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib2 f89519a = new ib2(new byte[4]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h93 f89520b;

    public f93(h93 h93Var) {
        this.f89520b = h93Var;
    }

    @Override // yads.rw2
    public final void a(jb2 jb2Var) {
        if (jb2Var.m() == 0 && (jb2Var.m() & 128) != 0) {
            jb2Var.e(jb2Var.f91148b + 6);
            int i10 = (jb2Var.f91149c - jb2Var.f91148b) / 4;
            for (int i11 = 0; i11 < i10; i11++) {
                ib2 ib2Var = this.f89519a;
                jb2Var.a(ib2Var.f90733a, 0, 4);
                ib2Var.b(0);
                int iA = this.f89519a.a(16);
                this.f89519a.c(3);
                if (iA == 0) {
                    this.f89519a.c(13);
                } else {
                    int iA2 = this.f89519a.a(13);
                    if (this.f89520b.f90314g.get(iA2) == null) {
                        h93 h93Var = this.f89520b;
                        h93Var.f90314g.put(iA2, new sw2(new g93(h93Var, iA2)));
                        this.f89520b.f90320m++;
                    }
                }
            }
            h93 h93Var2 = this.f89520b;
            if (h93Var2.f90308a != 2) {
                h93Var2.f90314g.remove(0);
            }
        }
    }

    @Override // yads.rw2
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
    }
}
