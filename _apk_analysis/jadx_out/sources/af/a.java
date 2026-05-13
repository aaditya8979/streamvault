package af;

/* JADX INFO: compiled from: DispatchGroup.java */
/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3752a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Runnable f3753b;

    public synchronized void a() {
        this.f3752a++;
    }

    public synchronized void b() {
        this.f3752a--;
        d();
    }

    public void c(Runnable runnable) {
        this.f3753b = runnable;
        d();
    }

    public final void d() {
        Runnable runnable;
        if (this.f3752a > 0 || (runnable = this.f3753b) == null) {
            return;
        }
        runnable.run();
    }
}
