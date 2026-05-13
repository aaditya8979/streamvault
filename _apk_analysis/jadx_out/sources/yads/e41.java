package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class e41 implements tp2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f89093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f89094b;

    public e41(k41 k41Var, String str) {
        this.f89094b = k41Var;
        this.f89093a = str;
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        k41 k41Var = this.f89094b;
        String str = this.f89093a;
        g41 g41Var = (g41) k41Var.f91480c.remove(str);
        if (g41Var != null) {
            g41Var.f89807c = im3Var;
            k41Var.f91481d.put(str, g41Var);
            if (k41Var.f91483f == null) {
                f41 f41Var = new f41(k41Var);
                k41Var.f91483f = f41Var;
                k41Var.f91482e.postDelayed(f41Var, 100);
            }
        }
    }
}
