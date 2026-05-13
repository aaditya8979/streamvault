package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class zv2 implements s42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw2 f97800a;

    public zv2(aw2 aw2Var) {
        this.f97800a = aw2Var;
    }

    @Override // yads.s42
    public final void a(l4 l4Var) {
        aw2 aw2Var = this.f97800a;
        if (aw2Var.f87830k) {
            return;
        }
        aw2Var.f87829j = null;
        aw2Var.f87820a.b(l4Var);
    }

    @Override // yads.s42
    public final void a(w02 w02Var) {
        aw2 aw2Var = this.f97800a;
        if (aw2Var.f87830k) {
            return;
        }
        aw2Var.f87829j = w02Var;
        aw2Var.f87820a.l();
    }
}
