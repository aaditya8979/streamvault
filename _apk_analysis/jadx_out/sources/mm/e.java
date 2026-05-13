package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAll.java */
/* JADX INFO: loaded from: classes6.dex */
public final class e<T> extends mm.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.q<? super T> f74401c;

    /* JADX INFO: compiled from: ObservableAll.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super Boolean> f74402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74405e;

        public a(xl.r<? super Boolean> rVar, dm.q<? super T> qVar) {
            this.f74402b = rVar;
            this.f74403c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74404d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74404d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74405e) {
                return;
            }
            this.f74405e = true;
            this.f74402b.onNext(Boolean.TRUE);
            this.f74402b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74405e) {
                tm.a.s(th2);
            } else {
                this.f74405e = true;
                this.f74402b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74405e) {
                return;
            }
            try {
                if (this.f74403c.test(t10)) {
                    return;
                }
                this.f74405e = true;
                this.f74404d.dispose();
                this.f74402b.onNext(Boolean.FALSE);
                this.f74402b.onComplete();
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74404d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74404d, bVar)) {
                this.f74404d = bVar;
                this.f74402b.onSubscribe(this);
            }
        }
    }

    public e(xl.p<T> pVar, dm.q<? super T> qVar) {
        super(pVar);
        this.f74401c = qVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super Boolean> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74401c));
    }
}
