package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class mh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh1 f92356a = new nh1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d63 f92357b = new d63();

    public final void a() {
        this.f92356a.f92855a.removeCallbacksAndMessages(null);
    }

    public final void a(Runnable runnable) {
        this.f92357b.getClass();
        if (d63.a()) {
            runnable.run();
        } else {
            this.f92356a.f92855a.post(runnable);
        }
    }
}
