package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableTakeWhile.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.q<? super T> f74623c;

    /* JADX INFO: compiled from: ObservableTakeWhile.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74627e;

        public a(xl.r<? super T> rVar, dm.q<? super T> qVar) {
            this.f74624b = rVar;
            this.f74625c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74626d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74626d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74627e) {
                return;
            }
            this.f74627e = true;
            this.f74624b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74627e) {
                tm.a.s(th2);
            } else {
                this.f74627e = true;
                this.f74624b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74627e) {
                return;
            }
            try {
                if (this.f74625c.test(t10)) {
                    this.f74624b.onNext(t10);
                    return;
                }
                this.f74627e = true;
                this.f74626d.dispose();
                this.f74624b.onComplete();
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74626d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74626d, bVar)) {
                this.f74626d = bVar;
                this.f74624b.onSubscribe(this);
            }
        }
    }

    public r1(xl.p<T> pVar, dm.q<? super T> qVar) {
        super(pVar);
        this.f74623c = qVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74623c));
    }
}
