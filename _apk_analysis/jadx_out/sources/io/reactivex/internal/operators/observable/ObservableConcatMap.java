package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import gm.c;
import gm.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import sm.e;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableConcatMap<T, U> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends p<? extends U>> f71445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ErrorMode f71447e;

    public static final class ConcatMapDelayErrorObserver<T, R> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -6951100001833242599L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable error = new AtomicThrowable();
        public final o<? super T, ? extends p<? extends R>> mapper;
        public final DelayErrorInnerObserver<R> observer;
        public h<T> queue;
        public int sourceMode;
        public final boolean tillTheEnd;
        public b upstream;

        public static final class DelayErrorInnerObserver<R> extends AtomicReference<b> implements r<R> {
            private static final long serialVersionUID = 2620149119579502636L;
            public final r<? super R> downstream;
            public final ConcatMapDelayErrorObserver<?, R> parent;

            public DelayErrorInnerObserver(r<? super R> rVar, ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver) {
                this.downstream = rVar;
                this.parent = concatMapDelayErrorObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // xl.r
            public void onComplete() {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.drain();
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                ConcatMapDelayErrorObserver<?, R> concatMapDelayErrorObserver = this.parent;
                if (!concatMapDelayErrorObserver.error.addThrowable(th2)) {
                    tm.a.s(th2);
                    return;
                }
                if (!concatMapDelayErrorObserver.tillTheEnd) {
                    concatMapDelayErrorObserver.upstream.dispose();
                }
                concatMapDelayErrorObserver.active = false;
                concatMapDelayErrorObserver.drain();
            }

            @Override // xl.r
            public void onNext(R r10) {
                this.downstream.onNext(r10);
            }

            @Override // xl.r
            public void onSubscribe(b bVar) {
                DisposableHelper.replace(this, bVar);
            }
        }

        public ConcatMapDelayErrorObserver(r<? super R> rVar, o<? super T, ? extends p<? extends R>> oVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.bufferSize = i10;
            this.tillTheEnd = z10;
            this.observer = new DelayErrorInnerObserver<>(rVar, this);
        }

        @Override // bm.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.observer.dispose();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super R> rVar = this.downstream;
            h<T> hVar = this.queue;
            AtomicThrowable atomicThrowable = this.error;
            while (true) {
                if (!this.active) {
                    if (this.cancelled) {
                        hVar.clear();
                        return;
                    }
                    if (!this.tillTheEnd && atomicThrowable.get() != null) {
                        hVar.clear();
                        this.cancelled = true;
                        rVar.onError(atomicThrowable.terminate());
                        return;
                    }
                    boolean z10 = this.done;
                    try {
                        T tPoll = hVar.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.cancelled = true;
                            Throwable thTerminate = atomicThrowable.terminate();
                            if (thTerminate != null) {
                                rVar.onError(thTerminate);
                                return;
                            } else {
                                rVar.onComplete();
                                return;
                            }
                        }
                        if (!z11) {
                            try {
                                p pVar = (p) fm.a.e(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (pVar instanceof Callable) {
                                    try {
                                        a.h hVar2 = (Object) ((Callable) pVar).call();
                                        if (hVar2 != null && !this.cancelled) {
                                            rVar.onNext(hVar2);
                                        }
                                    } catch (Throwable th2) {
                                        cm.a.b(th2);
                                        atomicThrowable.addThrowable(th2);
                                    }
                                } else {
                                    this.active = true;
                                    pVar.subscribe(this.observer);
                                }
                            } catch (Throwable th3) {
                                cm.a.b(th3);
                                this.cancelled = true;
                                this.upstream.dispose();
                                hVar.clear();
                                atomicThrowable.addThrowable(th3);
                                rVar.onError(atomicThrowable.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th4) {
                        cm.a.b(th4);
                        this.cancelled = true;
                        this.upstream.dispose();
                        atomicThrowable.addThrowable(th4);
                        rVar.onError(atomicThrowable.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // xl.r
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.error.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.sourceMode == 0) {
                this.queue.offer(t10);
            }
            drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new om.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public static final class SourceObserver<T, U> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 8828587559905699186L;
        public volatile boolean active;
        public final int bufferSize;
        public volatile boolean disposed;
        public volatile boolean done;
        public final r<? super U> downstream;
        public int fusionMode;
        public final InnerObserver<U> inner;
        public final o<? super T, ? extends p<? extends U>> mapper;
        public h<T> queue;
        public b upstream;

        public static final class InnerObserver<U> extends AtomicReference<b> implements r<U> {
            private static final long serialVersionUID = -7449079488798789337L;
            public final r<? super U> downstream;
            public final SourceObserver<?, ?> parent;

            public InnerObserver(r<? super U> rVar, SourceObserver<?, ?> sourceObserver) {
                this.downstream = rVar;
                this.parent = sourceObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // xl.r
            public void onComplete() {
                this.parent.innerComplete();
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                this.parent.dispose();
                this.downstream.onError(th2);
            }

            @Override // xl.r
            public void onNext(U u10) {
                this.downstream.onNext(u10);
            }

            @Override // xl.r
            public void onSubscribe(b bVar) {
                DisposableHelper.set(this, bVar);
            }
        }

        public SourceObserver(r<? super U> rVar, o<? super T, ? extends p<? extends U>> oVar, int i10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.bufferSize = i10;
            this.inner = new InnerObserver<>(rVar, this);
        }

        @Override // bm.b
        public void dispose() {
            this.disposed = true;
            this.inner.dispose();
            this.upstream.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.disposed) {
                if (!this.active) {
                    boolean z10 = this.done;
                    try {
                        T tPoll = this.queue.poll();
                        boolean z11 = tPoll == null;
                        if (z10 && z11) {
                            this.disposed = true;
                            this.downstream.onComplete();
                            return;
                        } else if (!z11) {
                            try {
                                p pVar = (p) fm.a.e(this.mapper.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.active = true;
                                pVar.subscribe(this.inner);
                            } catch (Throwable th2) {
                                cm.a.b(th2);
                                dispose();
                                this.queue.clear();
                                this.downstream.onError(th2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        cm.a.b(th3);
                        dispose();
                        this.queue.clear();
                        this.downstream.onError(th3);
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

        @Override // bm.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.done) {
                tm.a.s(th2);
                return;
            }
            this.done = true;
            dispose();
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.fusionMode == 0) {
                this.queue.offer(t10);
            }
            drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.fusionMode = iRequestFusion;
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.fusionMode = iRequestFusion;
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new om.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableConcatMap(p<T> pVar, o<? super T, ? extends p<? extends U>> oVar, int i10, ErrorMode errorMode) {
        super(pVar);
        this.f71445c = oVar;
        this.f71447e = errorMode;
        this.f71446d = Math.max(8, i10);
    }

    @Override // xl.k
    public void subscribeActual(r<? super U> rVar) {
        if (ObservableScalarXMap.b(this.f74327b, rVar, this.f71445c)) {
            return;
        }
        if (this.f71447e == ErrorMode.IMMEDIATE) {
            this.f74327b.subscribe(new SourceObserver(new e(rVar), this.f71445c, this.f71446d));
        } else {
            this.f74327b.subscribe(new ConcatMapDelayErrorObserver(rVar, this.f71445c, this.f71446d, this.f71447e == ErrorMode.END));
        }
    }
}
