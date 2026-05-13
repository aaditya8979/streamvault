package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableAmb<T> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T>[] f71414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<? extends p<? extends T>> f71415c;

    public static final class AmbInnerObserver<T> extends AtomicReference<b> implements r<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        public final r<? super T> downstream;
        public final int index;
        public final a<T> parent;
        public boolean won;

        public AmbInnerObserver(a<T> aVar, int i10, r<? super T> rVar) {
            this.parent = aVar;
            this.index = i10;
            this.downstream = rVar;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // xl.r
        public void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.b(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.won) {
                this.downstream.onError(th2);
            } else if (!this.parent.b(this.index)) {
                tm.a.s(th2);
            } else {
                this.won = true;
                this.downstream.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.won) {
                this.downstream.onNext(t10);
            } else if (!this.parent.b(this.index)) {
                get().dispose();
            } else {
                this.won = true;
                this.downstream.onNext(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class a<T> implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f71416b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AmbInnerObserver<T>[] f71417c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicInteger f71418d = new AtomicInteger();

        public a(r<? super T> rVar, int i10) {
            this.f71416b = rVar;
            this.f71417c = new AmbInnerObserver[i10];
        }

        public void a(p<? extends T>[] pVarArr) {
            AmbInnerObserver<T>[] ambInnerObserverArr = this.f71417c;
            int length = ambInnerObserverArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                ambInnerObserverArr[i10] = new AmbInnerObserver<>(this, i11, this.f71416b);
                i10 = i11;
            }
            this.f71418d.lazySet(0);
            this.f71416b.onSubscribe(this);
            for (int i12 = 0; i12 < length && this.f71418d.get() == 0; i12++) {
                pVarArr[i12].subscribe(ambInnerObserverArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = this.f71418d.get();
            int i12 = 0;
            if (i11 != 0) {
                return i11 == i10;
            }
            if (!this.f71418d.compareAndSet(0, i10)) {
                return false;
            }
            AmbInnerObserver<T>[] ambInnerObserverArr = this.f71417c;
            int length = ambInnerObserverArr.length;
            while (i12 < length) {
                int i13 = i12 + 1;
                if (i13 != i10) {
                    ambInnerObserverArr[i12].dispose();
                }
                i12 = i13;
            }
            return true;
        }

        @Override // bm.b
        public void dispose() {
            if (this.f71418d.get() != -1) {
                this.f71418d.lazySet(-1);
                for (AmbInnerObserver<T> ambInnerObserver : this.f71417c) {
                    ambInnerObserver.dispose();
                }
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f71418d.get() == -1;
        }
    }

    public ObservableAmb(p<? extends T>[] pVarArr, Iterable<? extends p<? extends T>> iterable) {
        this.f71414b = pVarArr;
        this.f71415c = iterable;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        int length;
        p<? extends T>[] pVarArr = this.f71414b;
        if (pVarArr == null) {
            pVarArr = new k[8];
            try {
                length = 0;
                for (p<? extends T> pVar : this.f71415c) {
                    if (pVar == null) {
                        EmptyDisposable.error(new NullPointerException("One of the sources is null"), rVar);
                        return;
                    }
                    if (length == pVarArr.length) {
                        p<? extends T>[] pVarArr2 = new p[(length >> 2) + length];
                        System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                        pVarArr = pVarArr2;
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
            EmptyDisposable.complete(rVar);
        } else if (length == 1) {
            pVarArr[0].subscribe(rVar);
        } else {
            new a(rVar, length).a(pVarArr);
        }
    }
}
