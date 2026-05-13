package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableHide.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p0<T> extends mm.a<T, T> {

    /* JADX INFO: compiled from: ObservableHide.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74596c;

        public a(xl.r<? super T> rVar) {
            this.f74595b = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74596c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74596c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74595b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74595b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74595b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74596c, bVar)) {
                this.f74596c = bVar;
                this.f74595b.onSubscribe(this);
            }
        }
    }

    public p0(xl.p<T> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
