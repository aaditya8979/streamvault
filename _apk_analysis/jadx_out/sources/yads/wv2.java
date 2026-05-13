package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class wv2 implements s42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xv2 f96531a;

    public wv2(xv2 xv2Var) {
        this.f96531a = xv2Var;
    }

    @Override // yads.s42
    public final void a(l4 l4Var) {
        xv2 xv2Var = this.f96531a;
        if (xv2Var.f96900k) {
            return;
        }
        xv2Var.f96899j = null;
        xv2Var.f96890a.b(l4Var);
    }

    @Override // yads.s42
    public final void a(w02 w02Var) {
        xv2 xv2Var = this.f96531a;
        if (xv2Var.f96900k) {
            return;
        }
        xv2Var.f96899j = w02Var;
        xv2Var.f96890a.l();
    }
}
