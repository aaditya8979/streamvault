package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class dg3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eg3 f88853b;

    public dg3(eg3 eg3Var) {
        this.f88853b = eg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eg3 eg3Var = this.f88853b;
        if (eg3Var.f89249d || !eg3Var.f89246a.a()) {
            this.f88853b.f89248c.postDelayed(this, 200L);
            return;
        }
        ((yf3) this.f88853b.f89247b).a();
        eg3 eg3Var2 = this.f88853b;
        eg3Var2.f89249d = true;
        eg3Var2.f89248c.removeCallbacksAndMessages(null);
        eg3Var2.f89250e = false;
    }
}
