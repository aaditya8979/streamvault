package mm;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableOnErrorNext.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super Throwable, ? extends xl.p<? extends T>> f74330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f74331d;

    /* JADX INFO: compiled from: ObservableOnErrorNext.java */
    public static final class a<T> implements xl.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super Throwable, ? extends xl.p<? extends T>> f74333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f74334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SequentialDisposable f74335e = new SequentialDisposable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74337g;

        public a(xl.r<? super T> rVar, dm.o<? super Throwable, ? extends xl.p<? extends T>> oVar, boolean z10) {
            this.f74332b = rVar;
            this.f74333c = oVar;
            this.f74334d = z10;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74337g) {
                return;
            }
            this.f74337g = true;
            this.f74336f = true;
            this.f74332b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74336f) {
                if (this.f74337g) {
                    tm.a.s(th2);
                    return;
                } else {
                    this.f74332b.onError(th2);
                    return;
                }
            }
            this.f74336f = true;
            if (this.f74334d && !(th2 instanceof Exception)) {
                this.f74332b.onError(th2);
                return;
            }
            try {
                xl.p<? extends T> pVarApply = this.f74333c.apply(th2);
                if (pVarApply != null) {
                    pVarApply.subscribe(this);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("Observable is null");
                nullPointerException.initCause(th2);
                this.f74332b.onError(nullPointerException);
            } catch (Throwable th3) {
                cm.a.b(th3);
                this.f74332b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74337g) {
                return;
            }
            this.f74332b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f74335e.replace(bVar);
        }
    }

    public a1(xl.p<T> pVar, dm.o<? super Throwable, ? extends xl.p<? extends T>> oVar, boolean z10) {
        super(pVar);
        this.f74330c = oVar;
        this.f74331d = z10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        a aVar = new a(rVar, this.f74330c, this.f74331d);
        rVar.onSubscribe(aVar.f74335e);
        this.f74327b.subscribe(aVar);
    }
}
