package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableCountSingle.java */
/* JADX INFO: loaded from: classes6.dex */
public final class p<T> extends xl.t<Long> implements gm.b<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74591a;

    /* JADX INFO: compiled from: ObservableCountSingle.java */
    public static final class a implements xl.r<Object>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super Long> f74592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74593c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f74594d;

        public a(xl.u<? super Long> uVar) {
            this.f74592b = uVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74593c.dispose();
            this.f74593c = DisposableHelper.DISPOSED;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74593c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74593c = DisposableHelper.DISPOSED;
            this.f74592b.onSuccess(Long.valueOf(this.f74594d));
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74593c = DisposableHelper.DISPOSED;
            this.f74592b.onError(th2);
        }

        @Override // xl.r
        public void onNext(Object obj) {
            this.f74594d++;
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74593c, bVar)) {
                this.f74593c = bVar;
                this.f74592b.onSubscribe(this);
            }
        }
    }

    public p(xl.p<T> pVar) {
        this.f74591a = pVar;
    }

    @Override // gm.b
    public xl.k<Long> a() {
        return tm.a.o(new o(this.f74591a));
    }

    @Override // xl.t
    public void m(xl.u<? super Long> uVar) {
        this.f74591a.subscribe(new a(uVar));
    }
}
