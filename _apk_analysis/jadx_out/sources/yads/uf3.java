package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class uf3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vf3 f95640b;

    public uf3(vf3 vf3Var) {
        this.f95640b = vf3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long adPosition = this.f95640b.f96079a.getAdPosition();
        this.f95640b.f96080b.a(this.f95640b.f96079a.b(), adPosition);
        vf3 vf3Var = this.f95640b;
        if (vf3Var.f96082d) {
            vf3Var.f96081c.postDelayed(this, 200L);
        }
    }
}
