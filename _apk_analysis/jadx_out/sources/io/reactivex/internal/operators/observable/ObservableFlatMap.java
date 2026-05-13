package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import gm.c;
import gm.g;
import gm.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableFlatMap<T, U> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super T, ? extends p<? extends U>> f71469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f71472f;

    public static final class InnerObserver<T, U> extends AtomicReference<b> implements r<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        public volatile boolean done;
        public int fusionMode;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        public final long f71473id;
        public final MergeObserver<T, U> parent;
        public volatile h<U> queue;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j10) {
            this.f71473id = j10;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // xl.r
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.parent.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            MergeObserver<T, U> mergeObserver = this.parent;
            if (!mergeObserver.delayErrors) {
                mergeObserver.disposeAll();
            }
            this.done = true;
            this.parent.drain();
        }

        @Override // xl.r
        public void onNext(U u10) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u10, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this, bVar) && (bVar instanceof c)) {
                c cVar = (c) bVar;
                int iRequestFusion = cVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (iRequestFusion == 2) {
                    this.fusionMode = iRequestFusion;
                    this.queue = cVar;
                }
            }
        }
    }

    public static final class MergeObserver<T, U> extends AtomicInteger implements b, r<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final boolean delayErrors;
        public volatile boolean done;
        public final r<? super U> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public long lastId;
        public int lastIndex;
        public final o<? super T, ? extends p<? extends U>> mapper;
        public final int maxConcurrency;
        public final AtomicReference<InnerObserver<?, ?>[]> observers;
        public volatile g<U> queue;
        public Queue<p<? extends U>> sources;
        public long uniqueId;
        public b upstream;
        public int wip;
        public static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        public static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        public MergeObserver(r<? super U> rVar, o<? super T, ? extends p<? extends U>> oVar, boolean z10, int i10, int i11) {
            this.downstream = rVar;
            this.mapper = oVar;
            this.delayErrors = z10;
            this.maxConcurrency = i10;
            this.bufferSize = i11;
            if (i10 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i10);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        public boolean addInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
            } while (!androidx.compose.animation.core.a.a(this.observers, innerObserverArr, innerObserverArr2));
            return true;
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th2 = this.errors.get();
            if (this.delayErrors || th2 == null) {
                return false;
            }
            disposeAll();
            Throwable thTerminate = this.errors.terminate();
            if (thTerminate != ExceptionHelper.f71695a) {
                this.downstream.onError(thTerminate);
            }
            return true;
        }

        @Override // bm.b
        public void dispose() {
            Throwable thTerminate;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!disposeAll() || (thTerminate = this.errors.terminate()) == null || thTerminate == ExceptionHelper.f71695a) {
                return;
            }
            tm.a.s(thTerminate);
        }

        public boolean disposeAll() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:118:0x00ea A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x00f1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drainLoop() {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableFlatMap.MergeObserver.drainLoop():void");
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
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
            } else if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
            } else {
                this.done = true;
                drain();
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            try {
                p<? extends U> pVar = (p) fm.a.e(this.mapper.apply(t10), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i10 = this.wip;
                        if (i10 == this.maxConcurrency) {
                            this.sources.offer(pVar);
                            return;
                        }
                        this.wip = i10 + 1;
                    }
                }
                subscribeInner(pVar);
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

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (innerObserverArr[i11] == innerObserver) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = EMPTY;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i10);
                    System.arraycopy(innerObserverArr, i10 + 1, innerObserverArr3, i10, (length - i10) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!androidx.compose.animation.core.a.a(this.observers, innerObserverArr, innerObserverArr2));
        }

        public void subscribeInner(p<? extends U> pVar) {
            p<? extends U> pVarPoll;
            while (pVar instanceof Callable) {
                if (!tryEmitScalar((Callable) pVar) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                boolean z10 = false;
                synchronized (this) {
                    pVarPoll = this.sources.poll();
                    if (pVarPoll == null) {
                        this.wip--;
                        z10 = true;
                    }
                }
                if (z10) {
                    drain();
                    return;
                }
                pVar = pVarPoll;
            }
            long j10 = this.uniqueId;
            this.uniqueId = 1 + j10;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j10);
            if (addInner(innerObserver)) {
                pVar.subscribe(innerObserver);
            }
        }

        public void tryEmit(U u10, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u10);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                h aVar = innerObserver.queue;
                if (aVar == null) {
                    aVar = new om.a(this.bufferSize);
                    innerObserver.queue = aVar;
                }
                aVar.offer(u10);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    g<U> aVar = this.queue;
                    if (aVar == null) {
                        aVar = this.maxConcurrency == Integer.MAX_VALUE ? new om.a<>(this.bufferSize) : new SpscArrayQueue<>(this.maxConcurrency);
                        this.queue = aVar;
                    }
                    if (!aVar.offer(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.errors.addThrowable(th2);
                drain();
                return true;
            }
        }
    }

    public ObservableFlatMap(p<T> pVar, o<? super T, ? extends p<? extends U>> oVar, boolean z10, int i10, int i11) {
        super(pVar);
        this.f71469c = oVar;
        this.f71470d = z10;
        this.f71471e = i10;
        this.f71472f = i11;
    }

    @Override // xl.k
    public void subscribeActual(r<? super U> rVar) {
        if (ObservableScalarXMap.b(this.f74327b, rVar, this.f71469c)) {
            return;
        }
        this.f74327b.subscribe(new MergeObserver(rVar, this.f71469c, this.f71470d, this.f71471e, this.f71472f));
    }
}
