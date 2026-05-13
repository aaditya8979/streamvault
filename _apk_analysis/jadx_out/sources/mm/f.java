package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableAllSingle.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f<T> extends xl.t<Boolean> implements gm.b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm.q<? super T> f74411b;

    /* JADX INFO: compiled from: ObservableAllSingle.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super Boolean> f74412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.q<? super T> f74413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74415e;

        public a(xl.u<? super Boolean> uVar, dm.q<? super T> qVar) {
            this.f74412b = uVar;
            this.f74413c = qVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74414d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74414d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74415e) {
                return;
            }
            this.f74415e = true;
            this.f74412b.onSuccess(Boolean.TRUE);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74415e) {
                tm.a.s(th2);
            } else {
                this.f74415e = true;
                this.f74412b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74415e) {
                return;
            }
            try {
                if (this.f74413c.test(t10)) {
                    return;
                }
                this.f74415e = true;
                this.f74414d.dispose();
                this.f74412b.onSuccess(Boolean.FALSE);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74414d.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74414d, bVar)) {
                this.f74414d = bVar;
                this.f74412b.onSubscribe(this);
            }
        }
    }

    public f(xl.p<T> pVar, dm.q<? super T> qVar) {
        this.f74410a = pVar;
        this.f74411b = qVar;
    }

    @Override // gm.b
    public xl.k<Boolean> a() {
        return tm.a.o(new e(this.f74410a, this.f74411b));
    }

    @Override // xl.t
    public void m(xl.u<? super Boolean> uVar) {
        this.f74410a.subscribe(new a(uVar, this.f74411b));
    }
}
