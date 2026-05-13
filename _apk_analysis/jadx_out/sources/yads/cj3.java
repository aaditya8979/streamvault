package yads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes12.dex */
public final class cj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f88477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj3 f88478b;

    public cj3(Handler handler, wn0 wn0Var) {
        this.f88477a = (Handler) ni.a(handler);
        this.f88478b = wn0Var;
    }

    public final void a(final int i10, final long j10) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6432b.b(i10, j10);
                }
            });
        }
    }

    public final void a(long j10, int i10) {
        dj3 dj3Var = this.f88478b;
        int i11 = ib3.f90737a;
        ((kb0) ((wn0) dj3Var).f96456a.f97713o).b(i10, j10);
    }

    public final void a(final Surface surface) {
        if (this.f88477a != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f88477a.post(new Runnable() { // from class: bt.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5944b.a(surface, jElapsedRealtime);
                }
            });
        }
    }

    public final void a(Exception exc) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dj3Var).f96456a.f97713o).c(exc);
    }

    public final void a(Object obj, long j10) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        ((wn0) dj3Var).a(obj, j10);
    }

    public final void a(final String str) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5964b.b(str);
                }
            });
        }
    }

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6385b.b(str, j10, j11);
                }
            });
        }
    }

    public final void a(final mx0 mx0Var, final va0 va0Var) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.v
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6330b.b(mx0Var, va0Var);
                }
            });
        }
    }

    public final void a(oj3 oj3Var) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        ((wn0) dj3Var).a(oj3Var);
    }

    public final void a(final pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.w
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6357b.c(pa0Var);
                }
            });
        }
    }

    public final void b(int i10, long j10) {
        dj3 dj3Var = this.f88478b;
        int i11 = ib3.f90737a;
        ((kb0) ((wn0) dj3Var).f96456a.f97713o).a(i10, j10);
    }

    public final void b(final Exception exc) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6409b.a(exc);
                }
            });
        }
    }

    public final void b(String str) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dj3Var).f96456a.f97713o).b(str);
    }

    public final void b(String str, long j10, long j11) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        ((kb0) ((wn0) dj3Var).f96456a.f97713o).b(str, j10, j11);
    }

    public final void b(mx0 mx0Var, va0 va0Var) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        dj3Var.getClass();
        wn0 wn0Var = (wn0) this.f88478b;
        wn0Var.f96456a.getClass();
        ((kb0) wn0Var.f96456a.f97713o).b(mx0Var, va0Var);
    }

    public final void b(final oj3 oj3Var) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5980b.a(oj3Var);
                }
            });
        }
    }

    public final void b(final pa0 pa0Var) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5927b.d(pa0Var);
                }
            });
        }
    }

    public final void c(final int i10, final long j10) {
        Handler handler = this.f88477a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: bt.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6004b.a(j10, i10);
                }
            });
        }
    }

    public final void c(pa0 pa0Var) {
        synchronized (pa0Var) {
        }
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        wn0 wn0Var = (wn0) dj3Var;
        ((kb0) wn0Var.f96456a.f97713o).c(pa0Var);
        wn0Var.f96456a.getClass();
        wn0Var.f96456a.getClass();
    }

    public final void d(pa0 pa0Var) {
        dj3 dj3Var = this.f88478b;
        int i10 = ib3.f90737a;
        wn0 wn0Var = (wn0) dj3Var;
        wn0Var.f96456a.getClass();
        ((kb0) wn0Var.f96456a.f97713o).d(pa0Var);
    }
}
