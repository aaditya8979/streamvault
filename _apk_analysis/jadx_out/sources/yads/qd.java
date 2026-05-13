package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class qd implements jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f94009b;

    public qd(String str, Runnable runnable) {
        this.f94008a = str;
        this.f94009b = runnable;
    }

    public final void a() {
        this.f94009b.run();
    }

    public final boolean a(String str, String str2) {
        return tn.p.f("mobileads", str) && tn.p.f(this.f94008a, str2);
    }
}
