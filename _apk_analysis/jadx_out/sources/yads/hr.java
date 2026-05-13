package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class hr extends po2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final up2 f90486s;

    public hr(String str, jw0 jw0Var, kw0 kw0Var) {
        super(0, str, kw0Var);
        this.f90486s = jw0Var;
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        try {
            return new vp2(e82Var.f89158b, v11.a(e82Var));
        } catch (Exception e10) {
            return new vp2(new im3((Throwable) e10));
        }
    }

    @Override // yads.po2
    public final void a(Object obj) {
        this.f90486s.a((byte[]) obj);
    }
}
