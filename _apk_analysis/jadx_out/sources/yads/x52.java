package yads;

/* JADX INFO: loaded from: classes8.dex */
public final class x52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de2 f96640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi3 f96641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vl3 f96642c;

    public x52(dk3 dk3Var, p52 p52Var, i72 i72Var, m62 m62Var) {
        r52 r52Var = new r52(p52Var);
        this.f96640a = new de2(m62Var);
        this.f96641b = new wi3(dk3Var);
        this.f96642c = new vl3(r52Var, i72Var);
    }

    public final void a(rf3 rf3Var) {
        cn.b0.G(rf3Var.f94432a, new qf3[]{this.f96640a, this.f96641b, this.f96642c});
    }
}
