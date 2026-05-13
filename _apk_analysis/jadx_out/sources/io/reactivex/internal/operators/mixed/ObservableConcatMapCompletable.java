package io.reactivex.internal.operators.mixed;

import bm.b;
import dm.o;
import gm.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.a;
import xl.c;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableConcatMapCompletable<T> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f71383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends c> f71384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ErrorMode f71385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71386d;

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 3610901111000061034L;
        public volatile boolean active;
        public volatile boolean disposed;
        public volatile boolean done;
        public final xl.b downstream;
        public final ErrorMode errorMode;
        public final AtomicThrowable errors = new AtomicThrowable();
        public final ConcatMapInnerObserver inner = new ConcatMapInnerObserver(this);
        public final o<? super T, ? extends c> mapper;
        public final int prefetch;
        public h<T> queue;
        public b upstream;

        public static final class ConcatMapInnerObserver extends AtomicReference<b> implements xl.b {
            private static final long serialVersionUID = 5638352172918776687L;
            public final ConcatMapCompletableObserver<?> parent;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.parent = concatMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // xl.b, xl.h
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // xl.b
            public void onError(Throwable th2) {
                this.parent.innerError(th2);
            }

            @Override // xl.b
            public void onSubscribe(b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        public ConcatMapCompletableObserver(xl.b bVar, o<? super T, ? extends c> oVar, ErrorMode errorMode, int i10) {
            this.downstream = bVar;
            this.mapper = oVar;
            this.errorMode = errorMode;
            this.prefetch = i10;
        }

        @Override // bm.b
        public void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.inner.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            boolean z10;
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicThrowable atomicThrowable = this.errors;
            ErrorMode errorMode = this.errorMode;
            while (!this.disposed) {
                if (!this.active) {
                    if (errorMode == ErrorMode.BOUNDARY && atomicThrowable.get() != null) {
                        this.disposed = true;
                        this.queue.clear();
                        this.downstream.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z11 = this.done;
                    c cVar = null;
                    try {
                        T tPoll = this.queue.poll();
                        if (tPoll != null) {
                            cVar = (c) fm.a.e(this.mapper.apply(tPoll), "The mapper returned a null CompletableSource");
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z11 && z10) {
                            this.disposed = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                this.downstream.onError(thTerminate);
                                return;
                            } else {
                                this.downstream.onComplete();
                                return;
                            }
                        }
                        if (!z10) {
                            this.active = true;
                            cVar.b(this.inner);
                        }
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        this.disposed = true;
                        this.queue.clear();
                        this.upstream.dispose();
                        atomicThrowable.addThrowable(th2);
                        this.downstream.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.queue.clear();
        }

        public void innerComplete() {
            this.active = false;
            drain();
        }

        public void innerError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.active = false;
                drain();
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.f71695a) {
                this.downstream.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // xl.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (this.errorMode != ErrorMode.IMMEDIATE) {
                this.done = true;
                drain();
                return;
            }
            this.disposed = true;
            this.inner.dispose();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.f71695a) {
                this.downstream.onError(thTerminate);
            }
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (t10 != null) {
                this.queue.offer(t10);
            }
            drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof gm.c) {
                    gm.c cVar = (gm.c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new om.a(this.prefetch);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMapCompletable(k<T> kVar, o<? super T, ? extends c> oVar, ErrorMode errorMode, int i10) {
        this.f71383a = kVar;
        this.f71384b = oVar;
        this.f71385c = errorMode;
        this.f71386d = i10;
    }

    @Override // xl.a
    public void f(xl.b bVar) {
        if (lm.a.a(this.f71383a, this.f71384b, bVar)) {
            return;
        }
        this.f71383a.subscribe(new ConcatMapCompletableObserver(bVar, this.f71384b, this.f71385c, this.f71386d));
    }
}
