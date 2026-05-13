package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class f7 implements z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g7 f89498a;

    public f7(g7 g7Var) {
        this.f89498a = g7Var;
    }

    @Override // yads.z3
    public final void a() {
        this.f89498a.b();
    }

    @Override // yads.z3
    public final void b() {
        g7 g7Var = this.f89498a;
        int i10 = g7Var.f89842m - 1;
        if (i10 == g7Var.f89833d.f88376c && !g7Var.f89843n) {
            g7Var.f89843n = true;
            g7Var.f89831b.b();
        }
        j7 j7Var = (j7) cn.f0.w0(this.f89498a.f89840k, i10);
        if ((j7Var != null ? j7Var.f91109c : null) != l7.f91897c || j7Var.f91108b == null) {
            this.f89498a.b();
        }
    }
}
