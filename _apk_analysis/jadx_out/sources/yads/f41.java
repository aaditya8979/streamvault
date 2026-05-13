package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class f41 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f89477b;

    public f41(k41 k41Var) {
        this.f89477b = k41Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (g41 g41Var : this.f89477b.f91481d.values()) {
            for (i41 i41Var : g41Var.f89808d) {
                j41 j41Var = i41Var.f90664b;
                if (j41Var != null) {
                    im3 im3Var = g41Var.f89807c;
                    if (im3Var == null) {
                        i41Var.f90663a = g41Var.f89806b;
                        j41Var.a(i41Var, false);
                    } else {
                        j41Var.a(im3Var);
                    }
                }
            }
        }
        this.f89477b.f91481d.clear();
        this.f89477b.f91483f = null;
    }
}
