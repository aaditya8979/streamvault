package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class qs implements q10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9 f94127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ts f94128b;

    public qs(ts tsVar, g9 g9Var) {
        this.f94128b = tsVar;
        this.f94127a = g9Var;
    }

    @Override // yads.q10
    public final void a(dr2 dr2Var) {
        tr2 tr2Var = this.f94128b.f95340e;
        g9 g9Var = this.f94127a;
        synchronized (tr2Var) {
            ki2 ki2Var = tr2Var.f95334a;
            tr2Var.f95335b.getClass();
            ki2Var.a(oy0.a(g9Var), dr2Var);
        }
    }

    @Override // yads.q10
    public final void a(l4 l4Var) {
    }
}
