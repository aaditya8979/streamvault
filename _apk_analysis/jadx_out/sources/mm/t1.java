package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableToList.java */
/* JADX INFO: loaded from: classes10.dex */
public final class t1<T, U extends Collection<? super T>> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<U> f74687c;

    /* JADX INFO: compiled from: ObservableToList.java */
    public static final class a<T, U extends Collection<? super T>> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super U> f74688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public U f74690d;

        public a(xl.r<? super U> rVar, U u10) {
            this.f74688b = rVar;
            this.f74690d = u10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74689c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74689c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            U u10 = this.f74690d;
            this.f74690d = null;
            this.f74688b.onNext(u10);
            this.f74688b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74690d = null;
            this.f74688b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74690d.add(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74689c, bVar)) {
                this.f74689c = bVar;
                this.f74688b.onSubscribe(this);
            }
        }
    }

    public t1(xl.p<T> pVar, int i10) {
        super(pVar);
        this.f74687c = Functions.e(i10);
    }

    public t1(xl.p<T> pVar, Callable<U> callable) {
        super(pVar);
        this.f74687c = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super U> rVar) {
        try {
            this.f74327b.subscribe(new a(rVar, (Collection) fm.a.e(this.f74687c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
