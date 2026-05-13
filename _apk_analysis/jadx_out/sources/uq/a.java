package uq;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import uq.f;

/* JADX INFO: compiled from: AbstractLifeCycle.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final vq.c f85777j = vq.b.a(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f85778b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85779c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85780d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85781e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f85782f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f85783g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f85784h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList<f.a> f85785i = new CopyOnWriteArrayList<>();

    public static String g0(f fVar) {
        return fVar.D() ? "STARTING" : fVar.isStarted() ? "STARTED" : fVar.q() ? "STOPPING" : fVar.isStopped() ? "STOPPED" : "FAILED";
    }

    @Override // uq.f
    public boolean D() {
        return this.f85784h == 1;
    }

    public void d0() throws Exception {
    }

    public void e0() throws Exception {
    }

    public String f0() {
        int i10 = this.f85784h;
        if (i10 == -1) {
            return "FAILED";
        }
        if (i10 == 0) {
            return "STOPPED";
        }
        if (i10 == 1) {
            return "STARTING";
        }
        if (i10 == 2) {
            return "STARTED";
        }
        if (i10 != 3) {
            return null;
        }
        return "STOPPING";
    }

    public final void h0(Throwable th2) {
        this.f85784h = -1;
        f85777j.d("FAILED " + this + ": " + th2, th2);
        Iterator<f.a> it = this.f85785i.iterator();
        while (it.hasNext()) {
            it.next().E(this, th2);
        }
    }

    public final void i0() {
        this.f85784h = 2;
        f85777j.h("STARTED {}", this);
        Iterator<f.a> it = this.f85785i.iterator();
        while (it.hasNext()) {
            it.next().j(this);
        }
    }

    @Override // uq.f
    public boolean isRunning() {
        int i10 = this.f85784h;
        return i10 == 2 || i10 == 1;
    }

    @Override // uq.f
    public boolean isStarted() {
        return this.f85784h == 2;
    }

    @Override // uq.f
    public boolean isStopped() {
        return this.f85784h == 0;
    }

    public final void j0() {
        f85777j.h("starting {}", this);
        this.f85784h = 1;
        Iterator<f.a> it = this.f85785i.iterator();
        while (it.hasNext()) {
            it.next().h(this);
        }
    }

    public final void k0() {
        this.f85784h = 0;
        f85777j.h("{} {}", "STOPPED", this);
        Iterator<f.a> it = this.f85785i.iterator();
        while (it.hasNext()) {
            it.next().A(this);
        }
    }

    public final void l0() {
        f85777j.h("stopping {}", this);
        this.f85784h = 3;
        Iterator<f.a> it = this.f85785i.iterator();
        while (it.hasNext()) {
            it.next().m(this);
        }
    }

    @Override // uq.f
    public boolean q() {
        return this.f85784h == 3;
    }

    @Override // uq.f
    public final void start() throws Exception {
        synchronized (this.f85778b) {
            try {
                try {
                    if (this.f85784h != 2 && this.f85784h != 1) {
                        j0();
                        d0();
                        i0();
                    }
                } catch (Error e10) {
                    h0(e10);
                    throw e10;
                } catch (Exception e11) {
                    h0(e11);
                    throw e11;
                }
            } finally {
            }
        }
    }

    @Override // uq.f
    public final void stop() throws Exception {
        synchronized (this.f85778b) {
            try {
                try {
                    if (this.f85784h != 3 && this.f85784h != 0) {
                        l0();
                        e0();
                        k0();
                    }
                } catch (Error e10) {
                    h0(e10);
                    throw e10;
                } catch (Exception e11) {
                    h0(e11);
                    throw e11;
                }
            } finally {
            }
        }
    }
}
