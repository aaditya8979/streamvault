package bp;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f5844b;

    public n1(n0 n0Var) {
        this.f5844b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n0 n0Var = this.f5844b;
        if (n0Var.f5838s) {
            return;
        }
        n0.c(n0Var, "load ad time out!");
        this.f5844b.f5839t = true;
    }
}
