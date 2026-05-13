package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a32 implements ay0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr2 f87556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw f87557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f87558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wb2 f87559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z22 f87560e;

    public a32(lr2 lr2Var, lw lwVar, long j10, wb2 wb2Var) {
        this.f87556a = lr2Var;
        this.f87557b = lwVar;
        this.f87558c = j10;
        this.f87559d = wb2Var;
        this.f87560e = new z22(this);
    }

    public /* synthetic */ a32(v9 v9Var, lr2 lr2Var, k63 k63Var) {
        this(lr2Var, k63Var.b(), b32.a(v9Var), vb2.a(false));
    }

    @Override // yads.ay0
    public final void invalidate() {
        ((zb2) this.f87559d).a();
    }

    @Override // yads.ay0
    public final void pause() {
        ((zb2) this.f87559d).b();
    }

    @Override // yads.ay0
    public final void resume() {
        ((zb2) this.f87559d).d();
    }

    @Override // yads.ay0
    public final void start() {
        long jMax = Math.max(0L, this.f87558c - this.f87557b.f92129a);
        zb2 zb2Var = (zb2) this.f87559d;
        zb2Var.f97486e = this.f87557b;
        zb2Var.a(jMax, this.f87560e);
    }
}
