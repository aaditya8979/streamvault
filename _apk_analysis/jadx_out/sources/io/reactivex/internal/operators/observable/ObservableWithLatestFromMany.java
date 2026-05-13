package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import mm.w0;
import qm.f;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableWithLatestFromMany<T, R> extends mm.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<?>[] f71653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterable<? extends p<?>> f71654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o<? super Object[], R> f71655e;

    public static final class WithLatestFromObserver<T, R> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 1577321883966341961L;
        public final o<? super Object[], R> combiner;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable error;
        public final WithLatestInnerObserver[] observers;
        public final AtomicReference<b> upstream;
        public final AtomicReferenceArray<Object> values;

        public WithLatestFromObserver(r<? super R> rVar, o<? super Object[], R> oVar, int i10) {
            this.downstream = rVar;
            this.combiner = oVar;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                withLatestInnerObserverArr[i11] = new WithLatestInnerObserver(this, i11);
            }
            this.observers = withLatestInnerObserverArr;
            this.values = new AtomicReferenceArray<>(i10);
            this.upstream = new AtomicReference<>();
            this.error = new AtomicThrowable();
        }

        public void cancelAllBut(int i10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.observers;
            for (int i11 = 0; i11 < withLatestInnerObserverArr.length; i11++) {
                if (i11 != i10) {
                    withLatestInnerObserverArr[i11].dispose();
                }
            }
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            for (WithLatestInnerObserver withLatestInnerObserver : this.observers) {
                withLatestInnerObserver.dispose();
            }
        }

        public void innerComplete(int i10, boolean z10) {
            if (z10) {
                return;
            }
            this.done = true;
            cancelAllBut(i10);
            f.b(this.downstream, this, this.error);
        }

        public void innerError(int i10, Throwable th2) {
            this.done = true;
            DisposableHelper.dispose(this.upstream);
            cancelAllBut(i10);
            f.d(this.downstream, th2, this, this.error);
        }

        public void innerNext(int i10, Object obj) {
            this.values.set(i10, obj);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            f.b(this.downstream, this, this.error);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.done) {
                tm.a.s(th2);
                return;
            }
            this.done = true;
            cancelAllBut(-1);
            f.d(this.downstream, th2, this, this.error);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i10 = 0;
            objArr[0] = t10;
            while (i10 < length) {
                Object obj = atomicReferenceArray.get(i10);
                if (obj == null) {
                    return;
                }
                i10++;
                objArr[i10] = obj;
            }
            try {
                f.f(this.downstream, fm.a.e(this.combiner.apply(objArr), "combiner returned a null value"), this, this.error);
            } catch (Throwable th2) {
                cm.a.b(th2);
                dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void subscribe(p<?>[] pVarArr, int i10) {
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.observers;
            AtomicReference<b> atomicReference = this.upstream;
            for (int i11 = 0; i11 < i10 && !DisposableHelper.isDisposed(atomicReference.get()) && !this.done; i11++) {
                pVarArr[i11].subscribe(withLatestInnerObserverArr[i11]);
            }
        }
    }

    public static final class WithLatestInnerObserver extends AtomicReference<b> implements r<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        public boolean hasValue;
        public final int index;
        public final WithLatestFromObserver<?, ?> parent;

        public WithLatestInnerObserver(WithLatestFromObserver<?, ?> withLatestFromObserver, int i10) {
            this.parent = withLatestFromObserver;
            this.index = i10;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // xl.r
        public void onComplete() {
            this.parent.innerComplete(this.index, this.hasValue);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // xl.r
        public void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            this.parent.innerNext(this.index, obj);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public final class a implements o<T, R> {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Object[]] */
        @Override // dm.o
        public R apply(T t10) throws Exception {
            return (R) fm.a.e(ObservableWithLatestFromMany.this.f71655e.apply(new Object[]{t10}), "The combiner returned a null value");
        }
    }

    public ObservableWithLatestFromMany(p<T> pVar, Iterable<? extends p<?>> iterable, o<? super Object[], R> oVar) {
        super(pVar);
        this.f71653c = null;
        this.f71654d = iterable;
        this.f71655e = oVar;
    }

    public ObservableWithLatestFromMany(p<T> pVar, p<?>[] pVarArr, o<? super Object[], R> oVar) {
        super(pVar);
        this.f71653c = pVarArr;
        this.f71654d = null;
        this.f71655e = oVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        int length;
        p<?>[] pVarArr = this.f71653c;
        if (pVarArr == null) {
            pVarArr = new p[8];
            try {
                length = 0;
                for (p<?> pVar : this.f71654d) {
                    if (length == pVarArr.length) {
                        pVarArr = (p[]) Arrays.copyOf(pVarArr, (length >> 1) + length);
                    }
                    int i10 = length + 1;
                    pVarArr[length] = pVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                EmptyDisposable.error(th2, rVar);
                return;
            }
        } else {
            length = pVarArr.length;
        }
        if (length == 0) {
            new w0(this.f74327b, new a()).subscribeActual(rVar);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(rVar, this.f71655e, length);
        rVar.onSubscribe(withLatestFromObserver);
        withLatestFromObserver.subscribe(pVarArr, length);
        this.f74327b.subscribe(withLatestFromObserver);
    }
}
