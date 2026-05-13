package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class oh1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dt f93225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph1 f93226d;

    public oh1(ph1 ph1Var, long j10, xw1 xw1Var) {
        this.f93226d = ph1Var;
        this.f93224b = j10;
        this.f93225c = xw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dt dtVar = this.f93225c;
        if (dtVar.f88975b == ct.f88597b) {
            ((xw1) dtVar).run();
            this.f93226d.f93596a.postDelayed(this, this.f93224b);
        }
    }
}
