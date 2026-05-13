package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableZipIterable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class x1<T, U, V> extends xl.k<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl.k<? extends T> f74788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<U> f74789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.c<? super T, ? super U, ? extends V> f74790d;

    /* JADX INFO: compiled from: ObservableZipIterable.java */
    public static final class a<T, U, V> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super V> f74791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Iterator<U> f74792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final dm.c<? super T, ? super U, ? extends V> f74793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74795f;

        public a(xl.r<? super V> rVar, Iterator<U> it, dm.c<? super T, ? super U, ? extends V> cVar) {
            this.f74791b = rVar;
            this.f74792c = it;
            this.f74793d = cVar;
        }

        public void a(Throwable th2) {
            this.f74795f = true;
            this.f74794e.dispose();
            this.f74791b.onError(th2);
        }

        @Override // bm.b
        public void dispose() {
            this.f74794e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74794e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74795f) {
                return;
            }
            this.f74795f = true;
            this.f74791b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74795f) {
                tm.a.s(th2);
            } else {
                this.f74795f = true;
                this.f74791b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74795f) {
                return;
            }
            try {
                try {
                    this.f74791b.onNext(fm.a.e(this.f74793d.apply(t10, fm.a.e(this.f74792c.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f74792c.hasNext()) {
                            return;
                        }
                        this.f74795f = true;
                        this.f74794e.dispose();
                        this.f74791b.onComplete();
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        a(th2);
                    }
                } catch (Throwable th3) {
                    cm.a.b(th3);
                    a(th3);
                }
            } catch (Throwable th4) {
                cm.a.b(th4);
                a(th4);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74794e, bVar)) {
                this.f74794e = bVar;
                this.f74791b.onSubscribe(this);
            }
        }
    }

    public x1(xl.k<? extends T> kVar, Iterable<U> iterable, dm.c<? super T, ? super U, ? extends V> cVar) {
        this.f74788b = kVar;
        this.f74789c = iterable;
        this.f74790d = cVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super V> rVar) {
        try {
            Iterator it = (Iterator) fm.a.e(this.f74789c.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f74788b.subscribe(new a(rVar, it, this.f74790d));
                } else {
                    EmptyDisposable.complete(rVar);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                EmptyDisposable.error(th2, rVar);
            }
        } catch (Throwable th3) {
            cm.a.b(th3);
            EmptyDisposable.error(th3, rVar);
        }
    }
}
