package mm;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableDoOnEach.java */
/* JADX INFO: loaded from: classes6.dex */
public final class z<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.g<? super T> f74800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.g<? super Throwable> f74801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm.a f74802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dm.a f74803f;

    /* JADX INFO: compiled from: ObservableDoOnEach.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.g<? super T> f74805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final dm.g<? super Throwable> f74806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final dm.a f74807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final dm.a f74808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public bm.b f74809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74810h;

        public a(xl.r<? super T> rVar, dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar, dm.a aVar2) {
            this.f74804b = rVar;
            this.f74805c = gVar;
            this.f74806d = gVar2;
            this.f74807e = aVar;
            this.f74808f = aVar2;
        }

        @Override // bm.b
        public void dispose() {
            this.f74809g.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74809g.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74810h) {
                return;
            }
            try {
                this.f74807e.run();
                this.f74810h = true;
                this.f74804b.onComplete();
                try {
                    this.f74808f.run();
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    tm.a.s(th2);
                }
            } catch (Throwable th3) {
                cm.a.b(th3);
                onError(th3);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74810h) {
                tm.a.s(th2);
                return;
            }
            this.f74810h = true;
            try {
                this.f74806d.accept(th2);
            } catch (Throwable th3) {
                cm.a.b(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f74804b.onError(th2);
            try {
                this.f74808f.run();
            } catch (Throwable th4) {
                cm.a.b(th4);
                tm.a.s(th4);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74810h) {
                return;
            }
            try {
                this.f74805c.accept(t10);
                this.f74804b.onNext(t10);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74809g.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74809g, bVar)) {
                this.f74809g = bVar;
                this.f74804b.onSubscribe(this);
            }
        }
    }

    public z(xl.p<T> pVar, dm.g<? super T> gVar, dm.g<? super Throwable> gVar2, dm.a aVar, dm.a aVar2) {
        super(pVar);
        this.f74800c = gVar;
        this.f74801d = gVar2;
        this.f74802e = aVar;
        this.f74803f = aVar2;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74800c, this.f74801d, this.f74802e, this.f74803f));
    }
}
