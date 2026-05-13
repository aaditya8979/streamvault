package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableMaterialize.java */
/* JADX INFO: loaded from: classes10.dex */
public final class y0<T> extends mm.a<T, xl.j<T>> {

    /* JADX INFO: compiled from: ObservableMaterialize.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super xl.j<T>> f74798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74799c;

        public a(xl.r<? super xl.j<T>> rVar) {
            this.f74798b = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74799c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74799c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74798b.onNext(xl.j.a());
            this.f74798b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74798b.onNext(xl.j.b(th2));
            this.f74798b.onComplete();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74798b.onNext(xl.j.c(t10));
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74799c, bVar)) {
                this.f74799c = bVar;
                this.f74798b.onSubscribe(this);
            }
        }
    }

    public y0(xl.p<T> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super xl.j<T>> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
