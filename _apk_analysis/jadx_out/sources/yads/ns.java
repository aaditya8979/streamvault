package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class ns implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f92920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ps f92921b;

    public ns(ps psVar, g9 g9Var) {
        this.f92921b = psVar;
        this.f92920a = g9Var;
    }

    @Override // yads.w00
    public final void a(jd1 jd1Var) {
        qd1 qd1Var = this.f92921b.f93740e;
        g9 g9Var = this.f92920a;
        synchronized (qd1Var) {
            ki2 ki2Var = qd1Var.f94013a;
            qd1Var.f94014b.getClass();
            ki2Var.a(oy0.a(g9Var), jd1Var);
        }
    }

    @Override // yads.w00
    public final void a(l4 l4Var) {
    }
}
