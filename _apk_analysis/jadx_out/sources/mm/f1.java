package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableScan.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.c<T, T, T> f74417c;

    /* JADX INFO: compiled from: ObservableScan.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.c<T, T, T> f74419c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74420d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74421e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74422f;

        public a(xl.r<? super T> rVar, dm.c<T, T, T> cVar) {
            this.f74418b = rVar;
            this.f74419c = cVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74420d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74420d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74422f) {
                return;
            }
            this.f74422f = true;
            this.f74418b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74422f) {
                tm.a.s(th2);
            } else {
                this.f74422f = true;
                this.f74418b.onError(th2);
            }
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.Object] */
        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74422f) {
                return;
            }
            xl.r<? super T> rVar = this.f74418b;
            T t11 = this.f74421e;
            if (t11 == null) {
                this.f74421e = t10;
                rVar.onNext(t10);
                return;
            }
            try {
                ?? r42 = (T) fm.a.e(this.f74419c.apply(t11, t10), "The value returned by the accumulator is null");
                this.f74421e = r42;
                rVar.onNext(r42);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74420d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74420d, bVar)) {
                this.f74420d = bVar;
                this.f74418b.onSubscribe(this);
            }
        }
    }

    public f1(xl.p<T> pVar, dm.c<T, T, T> cVar) {
        super(pVar);
        this.f74417c = cVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74417c));
    }
}
