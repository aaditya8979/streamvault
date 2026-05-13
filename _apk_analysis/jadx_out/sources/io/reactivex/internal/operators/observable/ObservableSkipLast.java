package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.ArrayDeque;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSkipLast<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f71591c;

    public static final class SkipLastObserver<T> extends ArrayDeque<T> implements r<T>, b {
        private static final long serialVersionUID = -3807491841935125653L;
        public final r<? super T> downstream;
        public final int skip;
        public b upstream;

        public SkipLastObserver(r<? super T> rVar, int i10) {
            super(i10);
            this.downstream = rVar;
            this.skip = i10;
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
            this.downstream.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.skip == size()) {
                this.downstream.onNext(poll());
            }
            offer(t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableSkipLast(p<T> pVar, int i10) {
        super(pVar);
        this.f71591c = i10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new SkipLastObserver(rVar, this.f71591c));
    }
}
