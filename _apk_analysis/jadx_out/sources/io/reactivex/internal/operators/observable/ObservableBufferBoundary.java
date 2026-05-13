package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<U> f71428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<? extends Open> f71429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o<? super Open, ? extends p<? extends Close>> f71430e;

    public static final class BufferBoundaryObserver<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -8466418554264089604L;
        public final o<? super Open, ? extends p<? extends Close>> bufferClose;
        public final p<? extends Open> bufferOpen;
        public final Callable<C> bufferSupplier;
        public volatile boolean cancelled;
        public volatile boolean done;
        public final r<? super C> downstream;
        public long index;
        public final om.a<C> queue = new om.a<>(k.bufferSize());
        public final bm.a observers = new bm.a();
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public Map<Long, C> buffers = new LinkedHashMap();
        public final AtomicThrowable errors = new AtomicThrowable();

        public static final class BufferOpenObserver<Open> extends AtomicReference<b> implements r<Open>, b {
            private static final long serialVersionUID = -8498650778633225126L;
            public final BufferBoundaryObserver<?, ?, Open, ?> parent;

            public BufferOpenObserver(BufferBoundaryObserver<?, ?, Open, ?> bufferBoundaryObserver) {
                this.parent = bufferBoundaryObserver;
            }

            @Override // bm.b
            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // bm.b
            public boolean isDisposed() {
                return get() == DisposableHelper.DISPOSED;
            }

            @Override // xl.r
            public void onComplete() {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.openComplete(this);
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.boundaryError(this, th2);
            }

            @Override // xl.r
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // xl.r
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public BufferBoundaryObserver(r<? super C> rVar, p<? extends Open> pVar, o<? super Open, ? extends p<? extends Close>> oVar, Callable<C> callable) {
            this.downstream = rVar;
            this.bufferSupplier = callable;
            this.bufferOpen = pVar;
            this.bufferClose = oVar;
        }

        public void boundaryError(b bVar, Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            this.observers.delete(bVar);
            onError(th2);
        }

        public void close(BufferCloseObserver<T, C> bufferCloseObserver, long j10) {
            boolean z10;
            this.observers.delete(bufferCloseObserver);
            if (this.observers.e() == 0) {
                DisposableHelper.dispose(this.upstream);
                z10 = true;
            } else {
                z10 = false;
            }
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                this.queue.offer(map.remove(Long.valueOf(j10)));
                if (z10) {
                    this.done = true;
                }
                drain();
            }
        }

        @Override // bm.b
        public void dispose() {
            if (DisposableHelper.dispose(this.upstream)) {
                this.cancelled = true;
                this.observers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super C> rVar = this.downstream;
            om.a<C> aVar = this.queue;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = this.done;
                if (z10 && this.errors.get() != null) {
                    aVar.clear();
                    rVar.onError(this.errors.terminate());
                    return;
                }
                C cPoll = aVar.poll();
                boolean z11 = cPoll == null;
                if (z10 && z11) {
                    rVar.onComplete();
                    return;
                } else if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    rVar.onNext(cPoll);
                }
            }
            aVar.clear();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            this.observers.dispose();
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    this.queue.offer(it.next());
                }
                this.buffers = null;
                this.done = true;
                drain();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.errors.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            this.observers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            synchronized (this) {
                Map<Long, C> map = this.buffers;
                if (map == null) {
                    return;
                }
                Iterator<C> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().add(t10);
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.setOnce(this.upstream, bVar)) {
                BufferOpenObserver bufferOpenObserver = new BufferOpenObserver(this);
                this.observers.a(bufferOpenObserver);
                this.bufferOpen.subscribe(bufferOpenObserver);
            }
        }

        public void open(Open open) {
            try {
                Collection collection = (Collection) fm.a.e(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                p pVar = (p) fm.a.e(this.bufferClose.apply(open), "The bufferClose returned a null ObservableSource");
                long j10 = this.index;
                this.index = 1 + j10;
                synchronized (this) {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    map.put(Long.valueOf(j10), (C) collection);
                    BufferCloseObserver bufferCloseObserver = new BufferCloseObserver(this, j10);
                    this.observers.a(bufferCloseObserver);
                    pVar.subscribe(bufferCloseObserver);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                DisposableHelper.dispose(this.upstream);
                onError(th2);
            }
        }

        public void openComplete(BufferOpenObserver<Open> bufferOpenObserver) {
            this.observers.delete(bufferOpenObserver);
            if (this.observers.e() == 0) {
                DisposableHelper.dispose(this.upstream);
                this.done = true;
                drain();
            }
        }
    }

    public static final class BufferCloseObserver<T, C extends Collection<? super T>> extends AtomicReference<b> implements r<Object>, b {
        private static final long serialVersionUID = -8498650778633225126L;
        public final long index;
        public final BufferBoundaryObserver<T, C, ?, ?> parent;

        public BufferCloseObserver(BufferBoundaryObserver<T, C, ?, ?> bufferBoundaryObserver, long j10) {
            this.parent = bufferBoundaryObserver;
            this.index = j10;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // xl.r
        public void onComplete() {
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                tm.a.s(th2);
            } else {
                lazySet(disposableHelper);
                this.parent.boundaryError(this, th2);
            }
        }

        @Override // xl.r
        public void onNext(Object obj) {
            b bVar = get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar != disposableHelper) {
                lazySet(disposableHelper);
                bVar.dispose();
                this.parent.close(this, this.index);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public ObservableBufferBoundary(p<T> pVar, p<? extends Open> pVar2, o<? super Open, ? extends p<? extends Close>> oVar, Callable<U> callable) {
        super(pVar);
        this.f71429d = pVar2;
        this.f71430e = oVar;
        this.f71428c = callable;
    }

    @Override // xl.k
    public void subscribeActual(r<? super U> rVar) {
        BufferBoundaryObserver bufferBoundaryObserver = new BufferBoundaryObserver(rVar, this.f71429d, this.f71430e, this.f71428c);
        rVar.onSubscribe(bufferBoundaryObserver);
        this.f74327b.subscribe(bufferBoundaryObserver);
    }
}
