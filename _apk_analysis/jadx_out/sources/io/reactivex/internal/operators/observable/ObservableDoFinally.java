package io.reactivex.internal.operators.observable;

import bm.b;
import gm.c;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes6.dex */
public final class ObservableDoFinally<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.a f71467c;

    public static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements r<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        public final r<? super T> downstream;
        public final dm.a onFinally;

        /* JADX INFO: renamed from: qd, reason: collision with root package name */
        public c<T> f71468qd;
        public boolean syncFused;
        public b upstream;

        public DoFinallyObserver(r<? super T> rVar, dm.a aVar) {
            this.downstream = rVar;
            this.onFinally = aVar;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public void clear() {
            this.f71468qd.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            this.upstream.dispose();
            runFinally();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public boolean isEmpty() {
            return this.f71468qd.isEmpty();
        }

        @Override // xl.r
        public void onComplete() {
            this.downstream.onComplete();
            runFinally();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
            runFinally();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.downstream.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    this.f71468qd = (c) bVar;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public T poll() throws Exception {
            T tPoll = this.f71468qd.poll();
            if (tPoll == null && this.syncFused) {
                runFinally();
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.d
        public int requestFusion(int i10) {
            c<T> cVar = this.f71468qd;
            if (cVar == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = cVar.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.syncFused = iRequestFusion == 1;
            }
            return iRequestFusion;
        }

        public void runFinally() {
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    tm.a.s(th2);
                }
            }
        }
    }

    public ObservableDoFinally(p<T> pVar, dm.a aVar) {
        super(pVar);
        this.f71467c = aVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new DoFinallyObserver(rVar, this.f71467c));
    }
}
