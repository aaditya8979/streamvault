package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class qm3 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to2 f94085a;

    public qm3(to2 to2Var) {
        this.f94085a = to2Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        to2 to2Var = this.f94085a;
        if (to2Var != null) {
            to2Var.onSuccess(obj);
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        if (this.f94085a != null) {
            this.f94085a.a(pm3.a(im3Var));
        }
    }
}
