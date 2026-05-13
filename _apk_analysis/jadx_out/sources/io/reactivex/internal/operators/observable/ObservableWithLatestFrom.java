package io.reactivex.internal.operators.observable;

import bm.b;
import dm.c;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import sm.e;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes8.dex */
public final class ObservableWithLatestFrom<T, U, R> extends mm.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<? super T, ? super U, ? extends R> f71649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<? extends U> f71650d;

    public static final class WithLatestFromObserver<T, U, R> extends AtomicReference<U> implements r<T>, b {
        private static final long serialVersionUID = -312246233408980075L;
        public final c<? super T, ? super U, ? extends R> combiner;
        public final r<? super R> downstream;
        public final AtomicReference<b> upstream = new AtomicReference<>();
        public final AtomicReference<b> other = new AtomicReference<>();

        public WithLatestFromObserver(r<? super R> rVar, c<? super T, ? super U, ? extends R> cVar) {
            this.downstream = rVar;
            this.combiner = cVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.other);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            DisposableHelper.dispose(this.other);
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.other);
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            U u10 = get();
            if (u10 != null) {
                try {
                    this.downstream.onNext(fm.a.e(this.combiner.apply(t10, u10), "The combiner returned a null value"));
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    dispose();
                    this.downstream.onError(th2);
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.upstream, bVar);
        }

        public void otherError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            this.downstream.onError(th2);
        }

        public boolean setOther(b bVar) {
            return DisposableHelper.setOnce(this.other, bVar);
        }
    }

    public final class a implements r<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WithLatestFromObserver<T, U, R> f71651b;

        public a(WithLatestFromObserver<T, U, R> withLatestFromObserver) {
            this.f71651b = withLatestFromObserver;
        }

        @Override // xl.r
        public void onComplete() {
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71651b.otherError(th2);
        }

        @Override // xl.r
        public void onNext(U u10) {
            this.f71651b.lazySet(u10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.f71651b.setOther(bVar);
        }
    }

    public ObservableWithLatestFrom(p<T> pVar, c<? super T, ? super U, ? extends R> cVar, p<? extends U> pVar2) {
        super(pVar);
        this.f71649c = cVar;
        this.f71650d = pVar2;
    }

    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        e eVar = new e(rVar);
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(eVar, this.f71649c);
        eVar.onSubscribe(withLatestFromObserver);
        this.f71650d.subscribe(new a(withLatestFromObserver));
        this.f74327b.subscribe(withLatestFromObserver);
    }
}
