package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class cl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f88486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl f88487b;

    public cl(Handler handler, wn0 wn0Var) {
        this.f88486a = (Handler) ni.a(handler);
        this.f88487b = wn0Var;
    }

    public final void a(int i10, long j10, long j11) {
        dl dlVar = this.f88487b;
        int i11 = ib3.f90737a;
        ((kb0) ((wn0) dlVar).f96456a.f97713o).a(i10, j10, j11);
    }

    public final void a(long j10) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dlVar).f96456a.f97713o).a(j10);
    }

    public final void a(final Exception exc) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.o0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6193b.c(exc);
                }
            });
        }
    }

    public final void a(final String str) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.m0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6151b.b(str);
                }
            });
        }
    }

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6089b.b(str, j10, j11);
                }
            });
        }
    }

    public final void a(final mx0 mx0Var, final va0 va0Var) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6169b.b(mx0Var, va0Var);
                }
            });
        }
    }

    public final void a(final pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6061b.c(pa0Var);
                }
            });
        }
    }

    public final void a(boolean z10) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        ((wn0) dlVar).a(z10);
    }

    public final void b(final int i10, final long j10, final long j11) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6075b.a(i10, j10, j11);
                }
            });
        }
    }

    public final void b(final long j10) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.f0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6027b.a(j10);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.k0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6109b.d(exc);
                }
            });
        }
    }

    public final void b(String str) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dlVar).f96456a.f97713o).a(str);
    }

    public final void b(String str, long j10, long j11) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dlVar).f96456a.f97713o).a(str, j10, j11);
    }

    public final void b(mx0 mx0Var, va0 va0Var) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        dlVar.getClass();
        wn0 wn0Var = (wn0) this.f88487b;
        wn0Var.f96456a.getClass();
        ((kb0) wn0Var.f96456a.f97713o).a(mx0Var, va0Var);
    }

    public final void b(final pa0 pa0Var) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6041b.d(pa0Var);
                }
            });
        }
    }

    public final void b(final boolean z10) {
        Handler handler = this.f88486a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.l0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6127b.a(z10);
                }
            });
        }
    }

    public final void c(Exception exc) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dlVar).f96456a.f97713o).a(exc);
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        wn0 wn0Var = (wn0) dlVar;
        ((kb0) wn0Var.f96456a.f97713o).a(pa0Var);
        wn0Var.f96456a.getClass();
        wn0Var.f96456a.getClass();
    }

    public final void d(Exception exc) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dlVar).f96456a.f97713o).b(exc);
    }

    public final void d(pa0 pa0Var) {
        dl dlVar = this.f88487b;
        int i10 = ib3.f90737a;
        wn0 wn0Var = (wn0) dlVar;
        wn0Var.f96456a.getClass();
        ((kb0) wn0Var.f96456a.f97713o).b(pa0Var);
    }
}
