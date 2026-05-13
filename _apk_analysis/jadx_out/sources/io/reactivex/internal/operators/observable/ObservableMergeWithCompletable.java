package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qm.f;
import xl.c;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableMergeWithCompletable<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f71506c;

    public static final class MergeWithObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = -4592979584110982903L;
        public final r<? super T> downstream;
        public volatile boolean mainDone;
        public volatile boolean otherDone;
        public final AtomicReference<b> mainDisposable = new AtomicReference<>();
        public final OtherObserver otherObserver = new OtherObserver(this);
        public final AtomicThrowable error = new AtomicThrowable();

        public static final class OtherObserver extends AtomicReference<b> implements xl.b {
            private static final long serialVersionUID = -2935427570954647017L;
            public final MergeWithObserver<?> parent;

            public OtherObserver(MergeWithObserver<?> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // xl.b, xl.h
            public void onComplete() {
                this.parent.otherComplete();
            }

            @Override // xl.b
            public void onError(Throwable th2) {
                this.parent.otherError(th2);
            }

            @Override // xl.b
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public MergeWithObserver(r<? super T> rVar) {
            this.downstream = rVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        @Override // xl.r
        public void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                f.b(this.downstream, this, this.error);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.mainDisposable);
            f.d(this.downstream, th2, this, this.error);
        }

        @Override // xl.r
        public void onNext(T t10) {
            f.f(this.downstream, t10, this, this.error);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.mainDisposable, bVar);
        }

        public void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                f.b(this.downstream, this, this.error);
            }
        }

        public void otherError(Throwable th2) {
            DisposableHelper.dispose(this.mainDisposable);
            f.d(this.downstream, th2, this, this.error);
        }
    }

    public ObservableMergeWithCompletable(k<T> kVar, c cVar) {
        super(kVar);
        this.f71506c = cVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(rVar);
        rVar.onSubscribe(mergeWithObserver);
        this.f74327b.subscribe(mergeWithObserver);
        this.f71506c.b(mergeWithObserver.otherObserver);
    }
}
