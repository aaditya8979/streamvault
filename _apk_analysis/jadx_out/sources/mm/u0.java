package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableLastSingle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u0<T> extends xl.t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f74695b;

    /* JADX INFO: compiled from: ObservableLastSingle.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super T> f74696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f74697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74699e;

        public a(xl.u<? super T> uVar, T t10) {
            this.f74696b = uVar;
            this.f74697c = t10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74698d.dispose();
            this.f74698d = DisposableHelper.DISPOSED;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74698d == DisposableHelper.DISPOSED;
        }

        @Override // xl.r
        public void onComplete() {
            this.f74698d = DisposableHelper.DISPOSED;
            T t10 = this.f74699e;
            if (t10 != null) {
                this.f74699e = null;
                this.f74696b.onSuccess(t10);
                return;
            }
            T t11 = this.f74697c;
            if (t11 != null) {
                this.f74696b.onSuccess(t11);
            } else {
                this.f74696b.onError(new NoSuchElementException());
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74698d = DisposableHelper.DISPOSED;
            this.f74699e = null;
            this.f74696b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74699e = t10;
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74698d, bVar)) {
                this.f74698d = bVar;
                this.f74696b.onSubscribe(this);
            }
        }
    }

    public u0(xl.p<T> pVar, T t10) {
        this.f74694a = pVar;
        this.f74695b = t10;
    }

    @Override // xl.t
    public void m(xl.u<? super T> uVar) {
        this.f74694a.subscribe(new a(uVar, this.f74695b));
    }
}
