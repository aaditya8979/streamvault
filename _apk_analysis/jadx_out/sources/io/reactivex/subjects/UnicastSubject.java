package io.reactivex.subjects;

import bm.b;
import gm.h;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import om.a;
import wm.c;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class UnicastSubject<T> extends c<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<T> f71718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<r<? super T>> f71719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Runnable> f71720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f71721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f71722f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f71723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Throwable f71724h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f71725i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BasicIntQueueDisposable<T> f71726j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f71727k;

    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public void clear() {
            UnicastSubject.this.f71718b.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            if (UnicastSubject.this.f71722f) {
                return;
            }
            UnicastSubject.this.f71722f = true;
            UnicastSubject.this.f();
            UnicastSubject.this.f71719c.lazySet(null);
            if (UnicastSubject.this.f71726j.getAndIncrement() == 0) {
                UnicastSubject.this.f71719c.lazySet(null);
                UnicastSubject.this.f71718b.clear();
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public boolean isDisposed() {
            return UnicastSubject.this.f71722f;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public boolean isEmpty() {
            return UnicastSubject.this.f71718b.isEmpty();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public T poll() throws Exception {
            return UnicastSubject.this.f71718b.poll();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.f71727k = true;
            return 2;
        }
    }

    public UnicastSubject(int i10, Runnable runnable, boolean z10) {
        this.f71718b = new a<>(fm.a.f(i10, "capacityHint"));
        this.f71720d = new AtomicReference<>(fm.a.e(runnable, "onTerminate"));
        this.f71721e = z10;
        this.f71719c = new AtomicReference<>();
        this.f71725i = new AtomicBoolean();
        this.f71726j = new UnicastQueueDisposable();
    }

    public UnicastSubject(int i10, boolean z10) {
        this.f71718b = new a<>(fm.a.f(i10, "capacityHint"));
        this.f71720d = new AtomicReference<>();
        this.f71721e = z10;
        this.f71719c = new AtomicReference<>();
        this.f71725i = new AtomicBoolean();
        this.f71726j = new UnicastQueueDisposable();
    }

    public static <T> UnicastSubject<T> c() {
        return new UnicastSubject<>(k.bufferSize(), true);
    }

    public static <T> UnicastSubject<T> d(int i10) {
        return new UnicastSubject<>(i10, true);
    }

    public static <T> UnicastSubject<T> e(int i10, Runnable runnable) {
        return new UnicastSubject<>(i10, runnable, true);
    }

    public void f() {
        Runnable runnable = this.f71720d.get();
        if (runnable == null || !androidx.compose.animation.core.a.a(this.f71720d, runnable, null)) {
            return;
        }
        runnable.run();
    }

    public void g() {
        if (this.f71726j.getAndIncrement() != 0) {
            return;
        }
        r<? super T> rVar = this.f71719c.get();
        int iAddAndGet = 1;
        while (rVar == null) {
            iAddAndGet = this.f71726j.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                rVar = this.f71719c.get();
            }
        }
        if (this.f71727k) {
            h(rVar);
        } else {
            i(rVar);
        }
    }

    public void h(r<? super T> rVar) {
        a<T> aVar = this.f71718b;
        int iAddAndGet = 1;
        boolean z10 = !this.f71721e;
        while (!this.f71722f) {
            boolean z11 = this.f71723g;
            if (z10 && z11 && k(aVar, rVar)) {
                return;
            }
            rVar.onNext(null);
            if (z11) {
                j(rVar);
                return;
            } else {
                iAddAndGet = this.f71726j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f71719c.lazySet(null);
        aVar.clear();
    }

    public void i(r<? super T> rVar) {
        a<T> aVar = this.f71718b;
        boolean z10 = !this.f71721e;
        boolean z11 = true;
        int iAddAndGet = 1;
        while (!this.f71722f) {
            boolean z12 = this.f71723g;
            T tPoll = this.f71718b.poll();
            boolean z13 = tPoll == null;
            if (z12) {
                if (z10 && z11) {
                    if (k(aVar, rVar)) {
                        return;
                    } else {
                        z11 = false;
                    }
                }
                if (z13) {
                    j(rVar);
                    return;
                }
            }
            if (z13) {
                iAddAndGet = this.f71726j.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                rVar.onNext(tPoll);
            }
        }
        this.f71719c.lazySet(null);
        aVar.clear();
    }

    public void j(r<? super T> rVar) {
        this.f71719c.lazySet(null);
        Throwable th2 = this.f71724h;
        if (th2 != null) {
            rVar.onError(th2);
        } else {
            rVar.onComplete();
        }
    }

    public boolean k(h<T> hVar, r<? super T> rVar) {
        Throwable th2 = this.f71724h;
        if (th2 == null) {
            return false;
        }
        this.f71719c.lazySet(null);
        hVar.clear();
        rVar.onError(th2);
        return true;
    }

    @Override // xl.r
    public void onComplete() {
        if (this.f71723g || this.f71722f) {
            return;
        }
        this.f71723g = true;
        f();
        g();
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        fm.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f71723g || this.f71722f) {
            tm.a.s(th2);
            return;
        }
        this.f71724h = th2;
        this.f71723g = true;
        f();
        g();
    }

    @Override // xl.r
    public void onNext(T t10) {
        fm.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f71723g || this.f71722f) {
            return;
        }
        this.f71718b.offer(t10);
        g();
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        if (this.f71723g || this.f71722f) {
            bVar.dispose();
        }
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        if (this.f71725i.get() || !this.f71725i.compareAndSet(false, true)) {
            EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), rVar);
            return;
        }
        rVar.onSubscribe(this.f71726j);
        this.f71719c.lazySet(rVar);
        if (this.f71722f) {
            this.f71719c.lazySet(null);
        } else {
            g();
        }
    }
}
