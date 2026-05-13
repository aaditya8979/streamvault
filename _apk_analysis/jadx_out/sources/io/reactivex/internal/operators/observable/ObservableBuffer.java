package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes3.dex */
public final class ObservableBuffer<T, U extends Collection<? super T>> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71420d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<U> f71421e;

    public static final class BufferSkipObserver<T, U extends Collection<? super T>> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = -8223395059921494546L;
        public final Callable<U> bufferSupplier;
        public final ArrayDeque<U> buffers = new ArrayDeque<>();
        public final int count;
        public final r<? super U> downstream;
        public long index;
        public final int skip;
        public b upstream;

        public BufferSkipObserver(r<? super U> rVar, int i10, int i11, Callable<U> callable) {
            this.downstream = rVar;
            this.count = i10;
            this.skip = i11;
            this.bufferSupplier = callable;
        }

        @Override // bm.b
        public void dispose() {
            this.upstream.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            while (!this.buffers.isEmpty()) {
                this.downstream.onNext(this.buffers.poll());
            }
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.buffers.clear();
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            long j10 = this.index;
            this.index = 1 + j10;
            if (j10 % ((long) this.skip) == 0) {
                try {
                    this.buffers.offer((U) ((Collection) fm.a.e(this.bufferSupplier.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
                } catch (Throwable th2) {
                    this.buffers.clear();
                    this.upstream.dispose();
                    this.downstream.onError(th2);
                    return;
                }
            }
            Iterator<U> it = this.buffers.iterator();
            while (it.hasNext()) {
                U next = it.next();
                next.add(t10);
                if (this.count <= next.size()) {
                    it.remove();
                    this.downstream.onNext(next);
                }
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

    public static final class a<T, U extends Collection<? super T>> implements r<T>, b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super U> f71422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f71423c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Callable<U> f71424d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public U f71425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f71426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f71427g;

        public a(r<? super U> rVar, int i10, Callable<U> callable) {
            this.f71422b = rVar;
            this.f71423c = i10;
            this.f71424d = callable;
        }

        public boolean a() {
            try {
                this.f71425e = (U) fm.a.e(this.f71424d.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f71425e = null;
                b bVar = this.f71427g;
                if (bVar == null) {
                    EmptyDisposable.error(th2, this.f71422b);
                    return false;
                }
                bVar.dispose();
                this.f71422b.onError(th2);
                return false;
            }
        }

        @Override // bm.b
        public void dispose() {
            this.f71427g.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f71427g.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            U u10 = this.f71425e;
            if (u10 != null) {
                this.f71425e = null;
                if (!u10.isEmpty()) {
                    this.f71422b.onNext(u10);
                }
                this.f71422b.onComplete();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71425e = null;
            this.f71422b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            U u10 = this.f71425e;
            if (u10 != null) {
                u10.add(t10);
                int i10 = this.f71426f + 1;
                this.f71426f = i10;
                if (i10 >= this.f71423c) {
                    this.f71422b.onNext(u10);
                    this.f71426f = 0;
                    a();
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.f71427g, bVar)) {
                this.f71427g = bVar;
                this.f71422b.onSubscribe(this);
            }
        }
    }

    public ObservableBuffer(p<T> pVar, int i10, int i11, Callable<U> callable) {
        super(pVar);
        this.f71419c = i10;
        this.f71420d = i11;
        this.f71421e = callable;
    }

    @Override // xl.k
    public void subscribeActual(r<? super U> rVar) {
        int i10 = this.f71420d;
        int i11 = this.f71419c;
        if (i10 != i11) {
            this.f74327b.subscribe(new BufferSkipObserver(rVar, this.f71419c, this.f71420d, this.f71421e));
            return;
        }
        a aVar = new a(rVar, i11, this.f71421e);
        if (aVar.a()) {
            this.f74327b.subscribe(aVar);
        }
    }
}
