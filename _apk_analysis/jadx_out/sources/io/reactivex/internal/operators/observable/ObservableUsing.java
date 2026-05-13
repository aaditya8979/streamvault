package io.reactivex.internal.operators.observable;

import bm.b;
import dm.g;
import dm.o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableUsing<T, D> extends k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends D> f71634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super D, ? extends p<? extends T>> f71635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<? super D> f71636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f71637e;

    public static final class UsingObserver<T, D> extends AtomicBoolean implements r<T>, b {
        private static final long serialVersionUID = 5904473792286235046L;
        public final g<? super D> disposer;
        public final r<? super T> downstream;
        public final boolean eager;
        public final D resource;
        public b upstream;

        public UsingObserver(r<? super T> rVar, D d10, g<? super D> gVar, boolean z10) {
            this.downstream = rVar;
            this.resource = d10;
            this.disposer = gVar;
            this.eager = z10;
        }

        @Override // bm.b
        public void dispose() {
            disposeAfter();
            this.upstream.dispose();
        }

        public void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    tm.a.s(th2);
                }
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get();
        }

        @Override // xl.r
        public void onComplete() {
            if (!this.eager) {
                this.downstream.onComplete();
                this.upstream.dispose();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    this.downstream.onError(th2);
                    return;
                }
            }
            this.upstream.dispose();
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.eager) {
                this.downstream.onError(th2);
                this.upstream.dispose();
                disposeAfter();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th3) {
                    cm.a.b(th3);
                    th2 = new CompositeException(th2, th3);
                }
            }
            this.upstream.dispose();
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableUsing(Callable<? extends D> callable, o<? super D, ? extends p<? extends T>> oVar, g<? super D> gVar, boolean z10) {
        this.f71634b = callable;
        this.f71635c = oVar;
        this.f71636d = gVar;
        this.f71637e = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        try {
            D dCall = this.f71634b.call();
            try {
                ((p) fm.a.e(this.f71635c.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new UsingObserver(rVar, dCall, this.f71636d, this.f71637e));
            } catch (Throwable th2) {
                cm.a.b(th2);
                try {
                    this.f71636d.accept(dCall);
                    EmptyDisposable.error(th2, rVar);
                } catch (Throwable th3) {
                    cm.a.b(th3);
                    EmptyDisposable.error(new CompositeException(th2, th3), rVar);
                }
            }
        } catch (Throwable th4) {
            cm.a.b(th4);
            EmptyDisposable.error(th4, rVar);
        }
    }
}
