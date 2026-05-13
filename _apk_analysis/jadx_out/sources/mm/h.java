package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAnySingle.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h<T> extends xl.t<Boolean> implements gm.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm.q<? super T> f74438b;

    /* JADX INFO: compiled from: ObservableAnySingle.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super Boolean> f74439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74442e;

        public a(xl.u<? super Boolean> uVar, dm.q<? super T> qVar) {
            this.f74439b = uVar;
            this.f74440c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74441d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74441d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74442e) {
                return;
            }
            this.f74442e = true;
            this.f74439b.onSuccess(Boolean.FALSE);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74442e) {
                tm.a.s(th2);
            } else {
                this.f74442e = true;
                this.f74439b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74442e) {
                return;
            }
            try {
                if (this.f74440c.test(t10)) {
                    this.f74442e = true;
                    this.f74441d.dispose();
                    this.f74439b.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74441d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74441d, bVar)) {
                this.f74441d = bVar;
                this.f74439b.onSubscribe(this);
            }
        }
    }

    public h(xl.p<T> pVar, dm.q<? super T> qVar) {
        this.f74437a = pVar;
        this.f74438b = qVar;
    }

    @Override // gm.b
    public xl.k<Boolean> a() {
        return tm.a.o(new g(this.f74437a, this.f74438b));
    }

    @Override // xl.t
    public void m(xl.u<? super Boolean> uVar) {
        this.f74437a.subscribe(new a(uVar, this.f74438b));
    }
}
