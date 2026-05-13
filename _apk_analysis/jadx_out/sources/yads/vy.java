package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f96222a;

    public vy() {
        this(0);
    }

    public vy(int i10) {
    }

    public final synchronized void a() {
        while (!this.f96222a) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z10 = false;
        while (!this.f96222a) {
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

    public final synchronized boolean c() {
        return this.f96222a;
    }

    public final synchronized boolean d() {
        if (this.f96222a) {
            return false;
        }
        this.f96222a = true;
        notifyAll();
        return true;
    }
}
