package mm;

/* JADX INFO: compiled from: ObservableIgnoreElements.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q0<T> extends mm.a<T, T> {

    /* JADX INFO: compiled from: ObservableIgnoreElements.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74613c;

        public a(xl.r<? super T> rVar) {
            this.f74612b = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74613c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74613c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74612b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74612b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f74613c = bVar;
            this.f74612b.onSubscribe(this);
        }
    }

    public q0(xl.p<T> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
