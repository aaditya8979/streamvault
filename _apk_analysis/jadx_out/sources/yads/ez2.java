package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class ez2 extends x43 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fz2 f89414f;

    public ez2(fz2 fz2Var) {
        this.f89414f = fz2Var;
    }

    @Override // yads.ua0
    public final void b() {
        fz2 fz2Var = this.f89414f;
        synchronized (fz2Var.f87849b) {
            this.f94912b = 0;
            this.f96631d = null;
            ua0[] ua0VarArr = fz2Var.f87853f;
            int i10 = fz2Var.f87855h;
            fz2Var.f87855h = i10 + 1;
            ua0VarArr[i10] = this;
            fz2Var.f();
        }
    }
}
