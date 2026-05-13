package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class fn0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final po2 f89635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vp2 f89636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f89637d;

    public fn0(po2 po2Var, vp2 vp2Var, sr srVar) {
        this.f89635b = po2Var;
        this.f89636c = vp2Var;
        this.f89637d = srVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tp2 tp2Var;
        if (this.f89635b.i()) {
            this.f89635b.c("canceled-at-delivery");
            return;
        }
        vp2 vp2Var = this.f89636c;
        im3 im3Var = vp2Var.f96163c;
        if (im3Var == null) {
            this.f89635b.a(vp2Var.f96161a);
        } else {
            po2 po2Var = this.f89635b;
            synchronized (po2Var.f93673f) {
                tp2Var = po2Var.f93674g;
            }
            if (tp2Var != null) {
                tp2Var.a(im3Var);
            }
        }
        if (this.f89636c.f96164d) {
            this.f89635b.a("intermediate-response");
        } else {
            this.f89635b.c("done");
        }
        Runnable runnable = this.f89637d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
