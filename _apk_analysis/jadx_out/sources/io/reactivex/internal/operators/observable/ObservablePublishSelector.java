package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes.dex */
public final class ObservablePublishSelector<T, R> extends mm.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super k<T>, ? extends p<R>> f71522c;

    public static final class TargetObserver<T, R> extends AtomicReference<b> implements r<R>, b {
        private static final long serialVersionUID = 854110278590336484L;
        public final r<? super R> downstream;
        public b upstream;

        public TargetObserver(r<? super R> rVar) {
            this.downstream = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.upstream.dispose();
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this);
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(R r10) {
            this.downstream.onNext(r10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public static final class a<T, R> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PublishSubject<T> f71523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<b> f71524c;

        public a(PublishSubject<T> publishSubject, AtomicReference<b> atomicReference) {
            this.f71523b = publishSubject;
            this.f71524c = atomicReference;
        }

        @Override // xl.r
        public void onComplete() {
            this.f71523b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71523b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f71523b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.f71524c, bVar);
        }
    }

    public ObservablePublishSelector(p<T> pVar, o<? super k<T>, ? extends p<R>> oVar) {
        super(pVar);
        this.f71522c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        PublishSubject publishSubjectD = PublishSubject.d();
        try {
            p pVar = (p) fm.a.e(this.f71522c.apply(publishSubjectD), "The selector returned a null ObservableSource");
            TargetObserver targetObserver = new TargetObserver(rVar);
            pVar.subscribe(targetObserver);
            this.f74327b.subscribe(new a(publishSubjectD, targetObserver));
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
