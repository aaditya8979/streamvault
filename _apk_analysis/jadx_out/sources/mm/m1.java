package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkipWhile.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.q<? super T> f74554c;

    /* JADX INFO: compiled from: ObservableSkipWhile.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74556c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74557d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74558e;

        public a(xl.r<? super T> rVar, dm.q<? super T> qVar) {
            this.f74555b = rVar;
            this.f74556c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74557d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74557d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74555b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74555b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74558e) {
                this.f74555b.onNext(t10);
                return;
            }
            try {
                if (this.f74556c.test(t10)) {
                    return;
                }
                this.f74558e = true;
                this.f74555b.onNext(t10);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74557d.dispose();
                this.f74555b.onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74557d, bVar)) {
                this.f74557d = bVar;
                this.f74555b.onSubscribe(this);
            }
        }
    }

    public m1(xl.p<T> pVar, dm.q<? super T> qVar) {
        super(pVar);
        this.f74554c = qVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74554c));
    }
}
