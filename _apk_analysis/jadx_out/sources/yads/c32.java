package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class c32 implements ac2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e32 f88327a;

    public c32(e32 e32Var) {
        this.f88327a = e32Var;
    }

    @Override // yads.ac2
    public final void a() {
        e32 e32Var = this.f88327a;
        tj2 tj2Var = e32Var.f89083d;
        if (tj2Var != null) {
            tj2Var.a();
        }
        z3 z3Var = e32Var.f89082c;
        if (z3Var != null) {
            z3Var.b();
        }
    }
}
