package j;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f71890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0 f71891d;

    public j0(x0 x0Var, int i10, String str) {
        this.f71891d = x0Var;
        this.f71889b = i10;
        this.f71890c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x0 x0Var = this.f71891d;
        x0Var.f72039c.IL1Iii(this.f71889b, this.f71890c, x0Var.f72038b);
    }
}
