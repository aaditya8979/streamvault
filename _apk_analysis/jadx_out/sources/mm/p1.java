package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeLastOne.java */
/* JADX INFO: loaded from: classes11.dex */
public final class p1<T> extends mm.a<T, T> {

    /* JADX INFO: compiled from: ObservableTakeLastOne.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74598c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74599d;

        public a(xl.r<? super T> rVar) {
            this.f74597b = rVar;
        }

        public void a() {
            T t10 = this.f74599d;
            if (t10 != null) {
                this.f74599d = null;
                this.f74597b.onNext(t10);
            }
            this.f74597b.onComplete();
        }

        @Override // bm.b
        public void dispose() {
            this.f74599d = null;
            this.f74598c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74598c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            a();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74599d = null;
            this.f74597b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74599d = t10;
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74598c, bVar)) {
                this.f74598c = bVar;
                this.f74597b.onSubscribe(this);
            }
        }
    }

    public p1(xl.p<T> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
