package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableReduceSeedSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d1<T, R> extends xl.t<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R f74395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.c<R, ? super T, R> f74396c;

    /* JADX INFO: compiled from: ObservableReduceSeedSingle.java */
    public static final class a<T, R> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super R> f74397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.c<R, ? super T, R> f74398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public R f74399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74400e;

        public a(xl.u<? super R> uVar, dm.c<R, ? super T, R> cVar, R r10) {
            this.f74397b = uVar;
            this.f74399d = r10;
            this.f74398c = cVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74400e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74400e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            R r10 = this.f74399d;
            if (r10 != null) {
                this.f74399d = null;
                this.f74397b.onSuccess(r10);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74399d == null) {
                tm.a.s(th2);
            } else {
                this.f74399d = null;
                this.f74397b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            R r10 = this.f74399d;
            if (r10 != null) {
                try {
                    this.f74399d = (R) fm.a.e(this.f74398c.apply(r10, t10), "The reducer returned a null value");
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    this.f74400e.dispose();
                    onError(th2);
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74400e, bVar)) {
                this.f74400e = bVar;
                this.f74397b.onSubscribe(this);
            }
        }
    }

    public d1(xl.p<T> pVar, R r10, dm.c<R, ? super T, R> cVar) {
        this.f74394a = pVar;
        this.f74395b = r10;
        this.f74396c = cVar;
    }

    @Override // xl.t
    public void m(xl.u<? super R> uVar) {
        this.f74394a.subscribe(new a(uVar, this.f74396c, this.f74395b));
    }
}
