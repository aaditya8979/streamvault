package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableToListSingle.java */
/* JADX INFO: loaded from: classes10.dex */
public final class u1<T, U extends Collection<? super T>> extends xl.t<U> implements gm.b<U> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<U> f74701b;

    /* JADX INFO: compiled from: ObservableToListSingle.java */
    public static final class a<T, U extends Collection<? super T>> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super U> f74702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public U f74703c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74704d;

        public a(xl.u<? super U> uVar, U u10) {
            this.f74702b = uVar;
            this.f74703c = u10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74704d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74704d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            U u10 = this.f74703c;
            this.f74703c = null;
            this.f74702b.onSuccess(u10);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74703c = null;
            this.f74702b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74703c.add(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74704d, bVar)) {
                this.f74704d = bVar;
                this.f74702b.onSubscribe(this);
            }
        }
    }

    public u1(xl.p<T> pVar, int i10) {
        this.f74700a = pVar;
        this.f74701b = Functions.e(i10);
    }

    public u1(xl.p<T> pVar, Callable<U> callable) {
        this.f74700a = pVar;
        this.f74701b = callable;
    }

    @Override // gm.b
    public xl.k<U> a() {
        return tm.a.o(new t1(this.f74700a, this.f74701b));
    }

    @Override // xl.t
    public void m(xl.u<? super U> uVar) {
        try {
            this.f74700a.subscribe(new a(uVar, (Collection) fm.a.e(this.f74701b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, uVar);
        }
    }
}
