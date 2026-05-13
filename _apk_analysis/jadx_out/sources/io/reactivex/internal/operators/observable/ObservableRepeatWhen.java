package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qm.f;
import wm.c;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableRepeatWhen<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o<? super k<Object>, ? extends p<?>> f71538c;

    public static final class RepeatWhenObserver<T> extends AtomicInteger implements r<T>, b {
        private static final long serialVersionUID = 802743776666017014L;
        public volatile boolean active;
        public final r<? super T> downstream;
        public final c<Object> signaller;
        public final p<T> source;
        public final AtomicInteger wip = new AtomicInteger();
        public final AtomicThrowable error = new AtomicThrowable();
        public final RepeatWhenObserver<T>.InnerRepeatObserver inner = new InnerRepeatObserver();
        public final AtomicReference<b> upstream = new AtomicReference<>();

        public final class InnerRepeatObserver extends AtomicReference<b> implements r<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            public InnerRepeatObserver() {
            }

            @Override // xl.r
            public void onComplete() {
                RepeatWhenObserver.this.innerComplete();
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                RepeatWhenObserver.this.innerError(th2);
            }

            @Override // xl.r
            public void onNext(Object obj) {
                RepeatWhenObserver.this.innerNext();
            }

            @Override // xl.r
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public RepeatWhenObserver(r<? super T> rVar, c<Object> cVar, p<T> pVar) {
            this.downstream = rVar;
            this.signaller = cVar;
            this.source = pVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.inner);
        }

        public void innerComplete() {
            DisposableHelper.dispose(this.upstream);
            f.b(this.downstream, this, this.error);
        }

        public void innerError(Throwable th2) {
            DisposableHelper.dispose(this.upstream);
            f.d(this.downstream, th2, this, this.error);
        }

        public void innerNext() {
            subscribeNext();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        @Override // xl.r
        public void onComplete() {
            this.active = false;
            this.signaller.onNext(0);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.inner);
            f.d(this.downstream, th2, this, this.error);
        }

        @Override // xl.r
        public void onNext(T t10) {
            f.f(this.downstream, t10, this, this.error);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.replace(this.upstream, bVar);
        }

        public void subscribeNext() {
            if (this.wip.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.active) {
                        this.active = true;
                        this.source.subscribe(this);
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    public ObservableRepeatWhen(p<T> pVar, o<? super k<Object>, ? extends p<?>> oVar) {
        super(pVar);
        this.f71538c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        c<T> cVarB = PublishSubject.d().b();
        try {
            p pVar = (p) fm.a.e(this.f71538c.apply(cVarB), "The handler returned a null ObservableSource");
            RepeatWhenObserver repeatWhenObserver = new RepeatWhenObserver(rVar, cVarB, this.f74327b);
            rVar.onSubscribe(repeatWhenObserver);
            pVar.subscribe(repeatWhenObserver.inner);
            repeatWhenObserver.subscribeNext();
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
