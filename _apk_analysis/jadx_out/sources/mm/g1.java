package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableScanSeed.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g1<T, R> extends mm.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.c<R, ? super T, R> f74430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<R> f74431d;

    /* JADX INFO: compiled from: ObservableScanSeed.java */
    public static final class a<T, R> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super R> f74432b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.c<R, ? super T, R> f74433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public R f74434d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74435e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74436f;

        public a(xl.r<? super R> rVar, dm.c<R, ? super T, R> cVar, R r10) {
            this.f74432b = rVar;
            this.f74433c = cVar;
            this.f74434d = r10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74435e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74435e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74436f) {
                return;
            }
            this.f74436f = true;
            this.f74432b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74436f) {
                tm.a.s(th2);
            } else {
                this.f74436f = true;
                this.f74432b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74436f) {
                return;
            }
            try {
                R r10 = (R) fm.a.e(this.f74433c.apply(this.f74434d, t10), "The accumulator returned a null value");
                this.f74434d = r10;
                this.f74432b.onNext(r10);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74435e.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74435e, bVar)) {
                this.f74435e = bVar;
                this.f74432b.onSubscribe(this);
                this.f74432b.onNext(this.f74434d);
            }
        }
    }

    public g1(xl.p<T> pVar, Callable<R> callable, dm.c<R, ? super T, R> cVar) {
        super(pVar);
        this.f74430c = cVar;
        this.f74431d = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super R> rVar) {
        try {
            this.f74327b.subscribe(new a(rVar, this.f74430c, fm.a.e(this.f74431d.call(), "The seed supplied is null")));
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
