package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class pn2 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e72 f93652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final un2 f93653c;

    public pn2(e72 e72Var, un2 un2Var) {
        this.f93652b = e72Var;
        this.f93653c = un2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f93652b.f89136b.setVisibility(4);
        this.f93653c.f95729a.setVisibility(0);
    }
}
