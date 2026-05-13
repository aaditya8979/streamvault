package s7;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f79465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f79466b;

    public g() {
        this(d.f79450a);
    }

    public g(d dVar) {
        this.f79465a = dVar;
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f79466b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f79466b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f79466b;
        this.f79466b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f79466b;
    }

    public synchronized boolean e() {
        if (this.f79466b) {
            return false;
        }
        this.f79466b = true;
        notifyAll();
        return true;
    }
}
