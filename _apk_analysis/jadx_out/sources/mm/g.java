package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAny.java */
/* JADX INFO: loaded from: classes6.dex */
public final class g<T> extends mm.a<T, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.q<? super T> f74423c;

    /* JADX INFO: compiled from: ObservableAny.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super Boolean> f74424b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74427e;

        public a(xl.r<? super Boolean> rVar, dm.q<? super T> qVar) {
            this.f74424b = rVar;
            this.f74425c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74426d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74426d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74427e) {
                return;
            }
            this.f74427e = true;
            this.f74424b.onNext(Boolean.FALSE);
            this.f74424b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74427e) {
                tm.a.s(th2);
            } else {
                this.f74427e = true;
                this.f74424b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74427e) {
                return;
            }
            try {
                if (this.f74425c.test(t10)) {
                    this.f74427e = true;
                    this.f74426d.dispose();
                    this.f74424b.onNext(Boolean.TRUE);
                    this.f74424b.onComplete();
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74426d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74426d, bVar)) {
                this.f74426d = bVar;
                this.f74424b.onSubscribe(this);
            }
        }
    }

    public g(xl.p<T> pVar, dm.q<? super T> qVar) {
        super(pVar);
        this.f74423c = qVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super Boolean> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74423c));
    }
}
