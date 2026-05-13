package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class o22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh3 f93102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d42 f93103b;

    public o22(lh3 lh3Var, d42 d42Var) {
        this.f93102a = lh3Var;
        this.f93103b = d42Var;
    }

    public final p22 a() {
        d62 d62Var = this.f93103b.f88757a;
        if (d62Var != null) {
            return new p22(d62Var, this.f93102a);
        }
        return null;
    }
}
