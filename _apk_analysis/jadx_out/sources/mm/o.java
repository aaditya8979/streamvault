package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableCount.java */
/* JADX INFO: loaded from: classes6.dex */
public final class o<T> extends mm.a<T, Long> {

    /* JADX INFO: compiled from: ObservableCount.java */
    public static final class a implements xl.r<Object>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super Long> f74573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f74575d;

        public a(xl.r<? super Long> rVar) {
            this.f74573b = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74574c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74574c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74573b.onNext(Long.valueOf(this.f74575d));
            this.f74573b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74573b.onError(th2);
        }

        @Override // xl.r
        public void onNext(Object obj) {
            this.f74575d++;
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74574c, bVar)) {
                this.f74574c = bVar;
                this.f74573b.onSubscribe(this);
            }
        }
    }

    public o(xl.p<T> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super Long> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
