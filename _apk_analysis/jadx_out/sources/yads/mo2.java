package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class mo2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f92487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f92488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po2 f92489d;

    public mo2(po2 po2Var, String str, long j10) {
        this.f92489d = po2Var;
        this.f92487b = str;
        this.f92488c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f92489d.f93669b.a(this.f92487b, this.f92488c);
        po2 po2Var = this.f92489d;
        km3 km3Var = po2Var.f93669b;
        po2Var.toString();
        km3Var.a();
    }
}
