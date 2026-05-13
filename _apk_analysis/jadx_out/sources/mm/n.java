package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableCollectSingle.java */
/* JADX INFO: loaded from: classes6.dex */
public final class n<T, U> extends xl.t<U> implements gm.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<? extends U> f74560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.b<? super U, ? super T> f74561c;

    /* JADX INFO: compiled from: ObservableCollectSingle.java */
    public static final class a<T, U> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super U> f74562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.b<? super U, ? super T> f74563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final U f74564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74566f;

        public a(xl.u<? super U> uVar, U u10, dm.b<? super U, ? super T> bVar) {
            this.f74562b = uVar;
            this.f74563c = bVar;
            this.f74564d = u10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74565e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74565e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74566f) {
                return;
            }
            this.f74566f = true;
            this.f74562b.onSuccess(this.f74564d);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74566f) {
                tm.a.s(th2);
            } else {
                this.f74566f = true;
                this.f74562b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74566f) {
                return;
            }
            try {
                this.f74563c.accept(this.f74564d, t10);
            } catch (Throwable th2) {
                this.f74565e.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74565e, bVar)) {
                this.f74565e = bVar;
                this.f74562b.onSubscribe(this);
            }
        }
    }

    public n(xl.p<T> pVar, Callable<? extends U> callable, dm.b<? super U, ? super T> bVar) {
        this.f74559a = pVar;
        this.f74560b = callable;
        this.f74561c = bVar;
    }

    @Override // gm.b
    public xl.k<U> a() {
        return tm.a.o(new m(this.f74559a, this.f74560b, this.f74561c));
    }

    @Override // xl.t
    public void m(xl.u<? super U> uVar) {
        try {
            this.f74559a.subscribe(new a(uVar, fm.a.e(this.f74560b.call(), "The initialSupplier returned a null value"), this.f74561c));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, uVar);
        }
    }
}
