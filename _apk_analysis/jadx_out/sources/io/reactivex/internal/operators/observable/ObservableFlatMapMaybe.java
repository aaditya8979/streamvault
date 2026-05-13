package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.h;
import xl.i;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableFlatMapMaybe<T, R> extends mm.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends i<? extends R>> f71479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71480d;

    public static final class FlatMapMaybeObserver<T, R> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 8600231336733376951L;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public final r<? super R> downstream;
        public final o<? super T, ? extends i<? extends R>> mapper;
        public b upstream;
        public final bm.a set = new bm.a();
        public final AtomicThrowable errors = new AtomicThrowable();
        public final AtomicInteger active = new AtomicInteger(1);
        public final AtomicReference<om.a<R>> queue = new AtomicReference<>();

        public final class InnerObserver extends AtomicReference<b> implements h<R>, b {
            private static final long serialVersionUID = -502562646270949838L;

            public InnerObserver() {
            }

            @Override // bm.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // bm.b
            public boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // xl.h
            public void onComplete() {
                FlatMapMaybeObserver.this.innerComplete(this);
            }

            @Override // xl.h
            public void onError(Throwable th2) {
                FlatMapMaybeObserver.this.innerError(this, th2);
            }

            @Override // xl.h
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // xl.h
            public void onSuccess(R r10) {
                FlatMapMaybeObserver.this.innerSuccess(this, r10);
            }
        }

        public FlatMapMaybeObserver(r<? super R> rVar, o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.delayErrors = z10;
        }

        public void clear() {
            om.a<R> aVar = this.queue.get();
            if (aVar != null) {
                aVar.clear();
            }
        }

        @Override // bm.b
        public void dispose() {
            this.cancelled = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            r<? super R> rVar = this.downstream;
            AtomicInteger atomicInteger = this.active;
            AtomicReference<om.a<R>> atomicReference = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!this.delayErrors && this.errors.get() != null) {
                    Throwable thTerminate = this.errors.terminate();
                    clear();
                    rVar.onError(thTerminate);
                    return;
                }
                boolean z10 = atomicInteger.get() == 0;
                om.a<R> aVar = atomicReference.get();
                a.i iVarPoll = aVar != null ? aVar.poll() : null;
                boolean z11 = iVarPoll == null;
                if (z10 && z11) {
                    Throwable thTerminate2 = this.errors.terminate();
                    if (thTerminate2 != null) {
                        rVar.onError(thTerminate2);
                        return;
                    } else {
                        rVar.onComplete();
                        return;
                    }
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    rVar.onNext(iVarPoll);
                }
            }
            clear();
        }

        public om.a<R> getOrCreateQueue() {
            om.a<R> aVar;
            do {
                om.a<R> aVar2 = this.queue.get();
                if (aVar2 != null) {
                    return aVar2;
                }
                aVar = new om.a<>(k.bufferSize());
            } while (!androidx.compose.animation.core.a.a(this.queue, null, aVar));
            return aVar;
        }

        public void innerComplete(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver) {
            this.set.delete(innerObserver);
            if (get() == 0) {
                if (compareAndSet(0, 1)) {
                    boolean z10 = this.active.decrementAndGet() == 0;
                    om.a<R> aVar = this.queue.get();
                    if (!z10 || (aVar != null && !aVar.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        drainLoop();
                        return;
                    } else {
                        Throwable thTerminate = this.errors.terminate();
                        if (thTerminate != null) {
                            this.downstream.onError(thTerminate);
                            return;
                        } else {
                            this.downstream.onComplete();
                            return;
                        }
                    }
                }
            }
            this.active.decrementAndGet();
            drain();
        }

        public void innerError(FlatMapMaybeObserver<T, R>.InnerObserver innerObserver, Throwable th2) {
            this.set.delete(innerObserver);
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                this.upstream.dispose();
                this.set.dispose();
            }
            this.active.decrementAndGet();
            drain();
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void innerSuccess(io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver<T, R>.InnerObserver r3, R r4) {
            /*
                r2 = this;
                bm.a r0 = r2.set
                r0.delete(r3)
                int r3 = r2.get()
                if (r3 != 0) goto L4e
                r3 = 0
                r0 = 1
                boolean r1 = r2.compareAndSet(r3, r0)
                if (r1 == 0) goto L4e
                xl.r<? super R> r1 = r2.downstream
                r1.onNext(r4)
                java.util.concurrent.atomic.AtomicInteger r4 = r2.active
                int r4 = r4.decrementAndGet()
                if (r4 != 0) goto L21
                r3 = r0
            L21:
                java.util.concurrent.atomic.AtomicReference<om.a<R>> r4 = r2.queue
                java.lang.Object r4 = r4.get()
                om.a r4 = (om.a) r4
                if (r3 == 0) goto L47
                if (r4 == 0) goto L33
                boolean r3 = r4.isEmpty()
                if (r3 == 0) goto L47
            L33:
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                if (r3 == 0) goto L41
                xl.r<? super R> r4 = r2.downstream
                r4.onError(r3)
                goto L46
            L41:
                xl.r<? super R> r3 = r2.downstream
                r3.onComplete()
            L46:
                return
            L47:
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L63
                return
            L4e:
                om.a r3 = r2.getOrCreateQueue()
                monitor-enter(r3)
                r3.offer(r4)     // Catch: java.lang.Throwable -> L67
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicInteger r3 = r2.active
                r3.decrementAndGet()
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L63
                return
            L63:
                r2.drainLoop()
                return
            L67:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L67
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMapMaybe.FlatMapMaybeObserver.innerSuccess(io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver, java.lang.Object):void");
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // xl.r
        public void onComplete() {
            this.active.decrementAndGet();
            drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.active.decrementAndGet();
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (!this.delayErrors) {
                this.set.dispose();
            }
            drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            try {
                i iVar = (i) fm.a.e(this.mapper.apply(t10), "The mapper returned a null MaybeSource");
                this.active.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.cancelled || !this.set.a(innerObserver)) {
                    return;
                }
                iVar.b(innerObserver);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapMaybe(p<T> pVar, o<? super T, ? extends i<? extends R>> oVar, boolean z10) {
        super(pVar);
        this.f71479c = oVar;
        this.f71480d = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        this.f74327b.subscribe(new FlatMapMaybeObserver(rVar, this.f71479c, this.f71480d));
    }
}
