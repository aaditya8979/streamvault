package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableLastMaybe.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t0<T> extends xl.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74683a;

    /* JADX INFO: compiled from: ObservableLastMaybe.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.h<? super T> f74684b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74685c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74686d;

        public a(xl.h<? super T> hVar) {
            this.f74684b = hVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74685c.dispose();
            this.f74685c = DisposableHelper.DISPOSED;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74685c == DisposableHelper.DISPOSED;
        }

        @Override // xl.r
        public void onComplete() {
            this.f74685c = DisposableHelper.DISPOSED;
            T t10 = this.f74686d;
            if (t10 == null) {
                this.f74684b.onComplete();
            } else {
                this.f74686d = null;
                this.f74684b.onSuccess(t10);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74685c = DisposableHelper.DISPOSED;
            this.f74686d = null;
            this.f74684b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74686d = t10;
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74685c, bVar)) {
                this.f74685c = bVar;
                this.f74684b.onSubscribe(this);
            }
        }
    }

    public t0(xl.p<T> pVar) {
        this.f74683a = pVar;
    }

    @Override // xl.g
    public void d(xl.h<? super T> hVar) {
        this.f74683a.subscribe(new a(hVar));
    }
}
