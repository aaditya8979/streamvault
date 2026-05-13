package io.reactivex.internal.operators.maybe;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import km.a;
import xl.h;
import xl.i;

/* JADX INFO: loaded from: classes8.dex */
public final class MaybeTakeUntilMaybe<T, U> extends a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i<U> f71382b;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<b> implements h<T>, b {
        private static final long serialVersionUID = -2187421758664251153L;
        public final h<? super T> downstream;
        public final TakeUntilOtherMaybeObserver<U> other = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<b> implements h<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            public final TakeUntilMainMaybeObserver<?, U> parent;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.parent = takeUntilMainMaybeObserver;
            }

            @Override // xl.h
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // xl.h
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // xl.h
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // xl.h
            public void onSuccess(Object obj) {
                this.parent.otherComplete();
            }
        }

        public TakeUntilMainMaybeObserver(h<? super T> hVar) {
            this.downstream = hVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.other);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.h
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onComplete();
            }
        }

        @Override // xl.h
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onError(th2);
            } else {
                tm.a.s(th2);
            }
        }

        @Override // xl.h
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // xl.h
        public void onSuccess(T t10) {
            DisposableHelper.dispose(this.other);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.downstream.onSuccess(t10);
            }
        }

        public void otherComplete() {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onComplete();
            }
        }

        public void otherError(Throwable th2) {
            if (DisposableHelper.dispose(this)) {
                this.downstream.onError(th2);
            } else {
                tm.a.s(th2);
            }
        }
    }

    public MaybeTakeUntilMaybe(i<T> iVar, i<U> iVar2) {
        super(iVar);
        this.f71382b = iVar2;
    }

    @Override // xl.g
    public void d(h<? super T> hVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(hVar);
        hVar.onSubscribe(takeUntilMainMaybeObserver);
        this.f71382b.b(takeUntilMainMaybeObserver.other);
        this.f73175a.b(takeUntilMainMaybeObserver);
    }
}
