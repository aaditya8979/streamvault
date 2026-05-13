package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableCollect.java */
/* JADX INFO: loaded from: classes6.dex */
public final class m<T, U> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends U> f74544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.b<? super U, ? super T> f74545d;

    /* JADX INFO: compiled from: ObservableCollect.java */
    public static final class a<T, U> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super U> f74546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.b<? super U, ? super T> f74547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final U f74548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74550f;

        public a(xl.r<? super U> rVar, U u10, dm.b<? super U, ? super T> bVar) {
            this.f74546b = rVar;
            this.f74547c = bVar;
            this.f74548d = u10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74549e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74549e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74550f) {
                return;
            }
            this.f74550f = true;
            this.f74546b.onNext(this.f74548d);
            this.f74546b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74550f) {
                tm.a.s(th2);
            } else {
                this.f74550f = true;
                this.f74546b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74550f) {
                return;
            }
            try {
                this.f74547c.accept(this.f74548d, t10);
            } catch (Throwable th2) {
                this.f74549e.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74549e, bVar)) {
                this.f74549e = bVar;
                this.f74546b.onSubscribe(this);
            }
        }
    }

    public m(xl.p<T> pVar, Callable<? extends U> callable, dm.b<? super U, ? super T> bVar) {
        super(pVar);
        this.f74544c = callable;
        this.f74545d = bVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super U> rVar) {
        try {
            this.f74327b.subscribe(new a(rVar, fm.a.e(this.f74544c.call(), "The initialSupplier returned a null value"), this.f74545d));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, rVar);
        }
    }
}
