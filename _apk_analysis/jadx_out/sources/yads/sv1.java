package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class sv1 implements fv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gw1 f94949a;

    public sv1(gw1 gw1Var) {
        this.f94949a = gw1Var;
    }

    @Override // yads.fv
    public final void a(if1 if1Var, hv hvVar) {
        this.f94949a.setClickListener(new rv1(if1Var, hvVar));
    }
}
