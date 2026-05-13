package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class fk0 extends po2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f89602v = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ek0 f89603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final sn.l f89604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t41 f89605u;

    public fk0(String str, ek0 ek0Var, ck0 ck0Var, tp2 tp2Var) {
        super(0, str, tp2Var);
        this.f89603s = ek0Var;
        this.f89604t = ck0Var;
        this.f89605u = new t41();
        a(new qe0(2.0f, 1000, 2));
        k();
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        vp2 vp2Var;
        synchronized (f89602v) {
            try {
                try {
                    t41 t41Var = this.f89605u;
                    byte[] bArr = e82Var.f89158b;
                    t41Var.getClass();
                    vp2Var = new vp2(new gk0(this.f89603s.a(e82Var.f89158b), t41.a(bArr)), v11.a(e82Var));
                } catch (Exception e10) {
                    vp2Var = new vp2(new mb2(e10));
                }
            } catch (OutOfMemoryError e11) {
                int length = e82Var.f89158b.length;
                boolean z10 = lm3.f92036a;
                boolean z11 = ad1.f87661a;
                vp2Var = new vp2(new mb2(e11));
            }
        }
        return vp2Var;
    }

    @Override // yads.po2
    public final void a(Object obj) {
        this.f89604t.invoke((gk0) obj);
    }
}
