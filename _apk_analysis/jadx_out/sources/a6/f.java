package a6;

/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3539b;

    public f() {
        this(c.f3524a);
    }

    public f(c cVar) {
        this.f3538a = cVar;
    }

    public synchronized void a() throws InterruptedException {
        while (!this.f3539b) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z10;
        z10 = this.f3539b;
        this.f3539b = false;
        return z10;
    }

    public synchronized boolean c() {
        return this.f3539b;
    }

    public synchronized boolean d() {
        if (this.f3539b) {
            return false;
        }
        this.f3539b = true;
        notifyAll();
        return true;
    }
}
