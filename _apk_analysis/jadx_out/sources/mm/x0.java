package mm;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableMapNotification.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x0<T, R> extends mm.a<T, xl.p<? extends R>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super T, ? extends xl.p<? extends R>> f74780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.o<? super Throwable, ? extends xl.p<? extends R>> f74781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Callable<? extends xl.p<? extends R>> f74782e;

    /* JADX INFO: compiled from: ObservableMapNotification.java */
    public static final class a<T, R> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super xl.p<? extends R>> f74783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super T, ? extends xl.p<? extends R>> f74784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final dm.o<? super Throwable, ? extends xl.p<? extends R>> f74785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Callable<? extends xl.p<? extends R>> f74786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bm.b f74787f;

        public a(xl.r<? super xl.p<? extends R>> rVar, dm.o<? super T, ? extends xl.p<? extends R>> oVar, dm.o<? super Throwable, ? extends xl.p<? extends R>> oVar2, Callable<? extends xl.p<? extends R>> callable) {
            this.f74783b = rVar;
            this.f74784c = oVar;
            this.f74785d = oVar2;
            this.f74786e = callable;
        }

        @Override // bm.b
        public void dispose() {
            this.f74787f.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74787f.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            try {
                this.f74783b.onNext((xl.p) fm.a.e(this.f74786e.call(), "The onComplete ObservableSource returned is null"));
                this.f74783b.onComplete();
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74783b.onError(th2);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            try {
                this.f74783b.onNext((xl.p) fm.a.e(this.f74785d.apply(th2), "The onError ObservableSource returned is null"));
                this.f74783b.onComplete();
            } catch (Throwable th3) {
                cm.a.b(th3);
                this.f74783b.onError(new CompositeException(th2, th3));
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            try {
                this.f74783b.onNext((xl.p) fm.a.e(this.f74784c.apply(t10), "The onNext ObservableSource returned is null"));
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74783b.onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74787f, bVar)) {
                this.f74787f = bVar;
                this.f74783b.onSubscribe(this);
            }
        }
    }

    public x0(xl.p<T> pVar, dm.o<? super T, ? extends xl.p<? extends R>> oVar, dm.o<? super Throwable, ? extends xl.p<? extends R>> oVar2, Callable<? extends xl.p<? extends R>> callable) {
        super(pVar);
        this.f74780c = oVar;
        this.f74781d = oVar2;
        this.f74782e = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super xl.p<? extends R>> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74780c, this.f74781d, this.f74782e));
    }
}
