package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class t92 implements up2, tp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld3 f95113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u92 f95114c;

    public t92(u92 u92Var, String str, w92 w92Var) {
        this.f95114c = u92Var;
        this.f95112a = str;
        this.f95113b = w92Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        ((tg1) this.f95114c.f95581b.f97047a).a("YmadOmSdkJs", (String) obj);
        y92 y92Var = this.f95114c.f95581b;
        ((tg1) y92Var.f97047a).a("YmadOmSdkJsUrl", this.f95112a);
        this.f95113b.a();
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f95113b.a();
    }
}
