package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeUntilPredicate.java */
/* JADX INFO: loaded from: classes10.dex */
public final class q1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.q<? super T> f74614c;

    /* JADX INFO: compiled from: ObservableTakeUntilPredicate.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74618e;

        public a(xl.r<? super T> rVar, dm.q<? super T> qVar) {
            this.f74615b = rVar;
            this.f74616c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74617d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74617d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74618e) {
                return;
            }
            this.f74618e = true;
            this.f74615b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74618e) {
                tm.a.s(th2);
            } else {
                this.f74618e = true;
                this.f74615b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74618e) {
                return;
            }
            this.f74615b.onNext(t10);
            try {
                if (this.f74616c.test(t10)) {
                    this.f74618e = true;
                    this.f74617d.dispose();
                    this.f74615b.onComplete();
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74617d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74617d, bVar)) {
                this.f74617d = bVar;
                this.f74615b.onSubscribe(this);
            }
        }
    }

    public q1(xl.p<T> pVar, dm.q<? super T> qVar) {
        super(pVar);
        this.f74614c = qVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74614c));
    }
}
