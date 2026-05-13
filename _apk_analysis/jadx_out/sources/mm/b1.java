package mm;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableOnErrorReturn.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super Throwable, ? extends T> f74352c;

    /* JADX INFO: compiled from: ObservableOnErrorReturn.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super Throwable, ? extends T> f74354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74355d;

        public a(xl.r<? super T> rVar, dm.o<? super Throwable, ? extends T> oVar) {
            this.f74353b = rVar;
            this.f74354c = oVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74355d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74355d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74353b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            try {
                T tApply = this.f74354c.apply(th2);
                if (tApply != null) {
                    this.f74353b.onNext(tApply);
                    this.f74353b.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th2);
                    this.f74353b.onError(nullPointerException);
                }
            } catch (Throwable th3) {
                cm.a.b(th3);
                this.f74353b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74353b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74355d, bVar)) {
                this.f74355d = bVar;
                this.f74353b.onSubscribe(this);
            }
        }
    }

    public b1(xl.p<T> pVar, dm.o<? super Throwable, ? extends T> oVar) {
        super(pVar);
        this.f74352c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74352c));
    }
}
