package z0;

import com.danikula.videocache.InterruptedProxyCacheException;
import com.danikula.videocache.ProxyCacheException;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: ProxyCache.java */
/* JADX INFO: loaded from: classes8.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f98172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0.a f98173b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Thread f98177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f98178g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f98174c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f98175d = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f98179h = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f98176e = new AtomicInteger();

    /* JADX INFO: compiled from: ProxyCache.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.k();
        }
    }

    public l(n nVar, z0.a aVar) {
        this.f98172a = (n) k.c(nVar);
        this.f98173b = (z0.a) k.c(aVar);
    }

    public final void b() throws ProxyCacheException {
        int i10 = this.f98176e.get();
        if (i10 < 1) {
            return;
        }
        this.f98176e.set(0);
        throw new ProxyCacheException("Error reading source " + i10 + " times");
    }

    public final void c() {
        try {
            this.f98172a.close();
        } catch (ProxyCacheException e10) {
            h(new ProxyCacheException("Error closing source " + this.f98172a, e10));
        }
    }

    public final boolean d() {
        return Thread.currentThread().isInterrupted() || this.f98178g;
    }

    public final void e(long j10, long j11) {
        f(j10, j11);
        synchronized (this.f98174c) {
            this.f98174c.notifyAll();
        }
    }

    public void f(long j10, long j11) {
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) == 0 ? 100 : (int) ((j10 / j11) * 100.0f);
        boolean z10 = i10 != this.f98179h;
        if ((j11 >= 0) && z10) {
            g(i10);
        }
        this.f98179h = i10;
    }

    public void g(int i10) {
        throw null;
    }

    public final void h(Throwable th2) {
        if (th2 instanceof InterruptedProxyCacheException) {
            j.a("ProxyCache is interrupted");
        } else {
            j.b("ProxyCache error");
        }
    }

    public final void i() {
        this.f98179h = 100;
        g(this.f98179h);
    }

    public int j(byte[] bArr, long j10, int i10) throws ProxyCacheException {
        m.a(bArr, j10, i10);
        while (!this.f98173b.d() && this.f98173b.available() < ((long) i10) + j10 && !this.f98178g) {
            l();
            o();
            b();
        }
        int iB = this.f98173b.b(bArr, j10, i10);
        if (this.f98173b.d() && this.f98179h != 100) {
            this.f98179h = 100;
            g(100);
        }
        return iB;
    }

    public final void k() {
        long length = -1;
        long jAvailable = 0;
        try {
            jAvailable = this.f98173b.available();
            this.f98172a.a(jAvailable);
            length = this.f98172a.length();
            byte[] bArr = new byte[8192];
            while (true) {
                int i10 = this.f98172a.read(bArr);
                if (i10 == -1) {
                    n();
                    i();
                    break;
                }
                synchronized (this.f98175d) {
                    if (d()) {
                        return;
                    } else {
                        this.f98173b.a(bArr, i10);
                    }
                }
                jAvailable += (long) i10;
                e(jAvailable, length);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final synchronized void l() throws ProxyCacheException {
        boolean z10 = (this.f98177f == null || this.f98177f.getState() == Thread.State.TERMINATED) ? false : true;
        if (!this.f98178g && !this.f98173b.d() && !z10) {
            this.f98177f = new Thread(new b(), "Source reader for " + this.f98172a);
            this.f98177f.start();
        }
    }

    public void m() {
        synchronized (this.f98175d) {
            j.a("Shutdown proxy for " + this.f98172a);
            try {
                this.f98178g = true;
                if (this.f98177f != null) {
                    this.f98177f.interrupt();
                }
                this.f98173b.close();
            } catch (ProxyCacheException e10) {
                h(e10);
            }
        }
    }

    public final void n() throws ProxyCacheException {
        synchronized (this.f98175d) {
            if (!d() && this.f98173b.available() == this.f98172a.length()) {
                this.f98173b.complete();
            }
        }
    }

    public final void o() throws ProxyCacheException {
        synchronized (this.f98174c) {
            try {
                try {
                    this.f98174c.wait(1000L);
                } catch (InterruptedException e10) {
                    throw new ProxyCacheException("Waiting source data is interrupted!", e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
