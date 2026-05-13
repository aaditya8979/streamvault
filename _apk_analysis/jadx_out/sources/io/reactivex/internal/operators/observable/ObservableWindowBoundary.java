package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sm.c;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableWindowBoundary<T, B> extends mm.a<T, k<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<B> f71641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71642d;

    public static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements r<T>, b, Runnable {
        public static final Object NEXT_WINDOW = new Object();
        private static final long serialVersionUID = 2233020065421370272L;
        public final int capacityHint;
        public volatile boolean done;
        public final r<? super k<T>> downstream;
        public UnicastSubject<T> window;
        public final a<T, B> boundaryObserver = new a<>(this);
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public final AtomicInteger windows = new AtomicInteger(1);
        public final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicBoolean stopWindows = new AtomicBoolean();

        public WindowBoundaryMainObserver(r<? super k<T>> rVar, int i10) {
            this.downstream = rVar;
            this.capacityHint = i10;
        }

        @Override // bm.b
        public void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                this.boundaryObserver.dispose();
                if (this.windows.decrementAndGet() == 0) {
                    DisposableHelper.dispose(this.upstream);
                }
            }
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
                        rVar.onNext(unicastSubjectE);
                    }
                }
            }
            mpscLinkedQueue.clear();
            this.window = null;
        }

        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            this.done = true;
            drain();
        }

        public void innerError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        public void innerNext() {
            this.queue.offer(NEXT_WINDOW);
            drain();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // xl.r
        public void onComplete() {
            this.boundaryObserver.dispose();
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.boundaryObserver.dispose();
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
            if (DisposableHelper.setOnce(this.upstream, bVar)) {
                innerNext();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.windows.decrementAndGet() == 0) {
                DisposableHelper.dispose(this.upstream);
            }
        }
    }

    public static final class a<T, B> extends c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowBoundaryMainObserver<T, B> f71643c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f71644d;

        public a(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.f71643c = windowBoundaryMainObserver;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f71644d) {
                return;
            }
            this.f71644d = true;
            this.f71643c.innerComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f71644d) {
                tm.a.s(th2);
            } else {
                this.f71644d = true;
                this.f71643c.innerError(th2);
            }
        }

        @Override // xl.r
        public void onNext(B b10) {
            if (this.f71644d) {
                return;
            }
            this.f71643c.innerNext();
        }
    }

    public ObservableWindowBoundary(p<T> pVar, p<B> pVar2, int i10) {
        super(pVar);
        this.f71641c = pVar2;
        this.f71642d = i10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super k<T>> rVar) {
        WindowBoundaryMainObserver windowBoundaryMainObserver = new WindowBoundaryMainObserver(rVar, this.f71642d);
        rVar.onSubscribe(windowBoundaryMainObserver);
        this.f71641c.subscribe(windowBoundaryMainObserver.boundaryObserver);
        this.f74327b.subscribe(windowBoundaryMainObserver);
    }
}
