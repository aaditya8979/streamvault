package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sm.c;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends mm.a<T, k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends p<B>> f71645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71646d;

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements r<T>, b, Runnable {
        public static final a<Object, Object> BOUNDARY_DISPOSED = new a<>(null);
        public static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        public final int capacityHint;
        public volatile boolean done;
        public final r<? super k<T>> downstream;
        public final Callable<? extends p<B>> other;
        public b upstream;
        public UnicastSubject<T> window;
        public final AtomicReference<a<T, B>> boundaryObserver = new AtomicReference<>();
        public final AtomicInteger windows = new AtomicInteger(1);
        public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicBoolean stopWindows = new AtomicBoolean();

        public WindowBoundaryMainObserver(r<? super k<T>> rVar, int i10, Callable<? extends p<B>> callable) {
            this.downstream = rVar;
            this.capacityHint = i10;
            this.other = callable;
        }

        @Override // bm.b
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                disposeBoundary();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        public void disposeBoundary() {
            AtomicReference<a<T, B>> atomicReference = this.boundaryObserver;
            a<Object, Object> aVar = BOUNDARY_DISPOSED;
            a<T, B> andSet = atomicReference.getAndSet((a<T, B>) aVar);
            if (andSet == null || andSet == aVar) {
                return;
            }
            andSet.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super k<T>> rVar = this.downstream;
            MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
            AtomicThrowable atomicThrowable = this.errors;
            int iAddAndGet = 1;
            while (this.windows.get() != 0) {
                UnicastSubject<T> unicastSubject = this.window;
                boolean z10 = this.done;
                if (z10 && atomicThrowable.get() != null) {
                    mpscLinkedQueue.clear();
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(thTerminate);
                    }
                    rVar.onError(thTerminate);
                    return;
                }
                Object objPoll = mpscLinkedQueue.poll();
                boolean z11 = objPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate2 = atomicThrowable.terminate();
                    if (thTerminate2 == null) {
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onComplete();
                        }
                        rVar.onComplete();
                        return;
                    }
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onError(thTerminate2);
                    }
                    rVar.onError(thTerminate2);
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != NEXT_WINDOW) {
                    unicastSubject.onNext((T) objPoll);
                } else {
                    if (unicastSubject != null) {
                        this.window = null;
                        unicastSubject.onComplete();
                    }
                    if (!this.stopWindows.get()) {
                        UnicastSubject<T> unicastSubjectE = UnicastSubject.e(this.capacityHint, this);
                        this.window = unicastSubjectE;
                        this.windows.getAndIncrement();
                        try {
                            p pVar = (p) fm.a.e(this.other.call(), "The other Callable returned a null ObservableSource");
                            a aVar = new a(this);
                            if (androidx.compose.animation.core.a.a(this.boundaryObserver, null, aVar)) {
                                pVar.subscribe(aVar);
                                rVar.onNext(unicastSubjectE);
                            }
                        } catch (Throwable th2) {
                            cm.a.b(th2);
                            atomicThrowable.addThrowable(th2);
                            this.done = true;
                        }
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }

        public void innerComplete() {
            this.upstream.dispose();
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            this.upstream.dispose();
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext(a<T, B> aVar) {
            androidx.compose.animation.core.a.a(this.boundaryObserver, aVar, null);
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // xl.r
        public void onComplete() {
            disposeBoundary();
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            disposeBoundary();
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.queue.offer(t10);
            drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
                this.queue.offer(NEXT_WINDOW);
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }
    }

    public static final class a<T, B> extends c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowBoundaryMainObserver<T, B> f71647c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f71648d;

        public a(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f71647c = windowBoundaryMainObserver;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f71648d) {
                return;
            }
            this.f71648d = true;
            this.f71647c.innerComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f71648d) {
                tm.a.s(th2);
            } else {
                this.f71648d = true;
                this.f71647c.innerError(th2);
            }
        }

        @Override // xl.r
        public void onNext(B b10) {
            if (this.f71648d) {
                return;
            }
            this.f71648d = true;
            dispose();
            this.f71647c.innerNext(this);
        }
    }

    public ObservableWindowBoundarySupplier(p<T> pVar, Callable<? extends p<B>> callable, int i10) {
        super(pVar);
        this.f71645c = callable;
        this.f71646d = i10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super k<T>> rVar) {
        this.f74327b.subscribe(new WindowBoundaryMainObserver(rVar, this.f71646d, this.f71645c));
    }
}
