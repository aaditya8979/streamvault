package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableReduceMaybe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c1<T> extends xl.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm.c<T, T, T> f74369b;

    /* JADX INFO: compiled from: ObservableReduceMaybe.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.h<? super T> f74370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.c<T, T, T> f74371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74373e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bm.b f74374f;

        public a(xl.h<? super T> hVar, dm.c<T, T, T> cVar) {
            this.f74370b = hVar;
            this.f74371c = cVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74374f.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74374f.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74372d) {
                return;
            }
            this.f74372d = true;
            T t10 = this.f74373e;
            this.f74373e = null;
            if (t10 != null) {
                this.f74370b.onSuccess(t10);
            } else {
                this.f74370b.onComplete();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74372d) {
                tm.a.s(th2);
                return;
            }
            this.f74372d = true;
            this.f74373e = null;
            this.f74370b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74372d) {
                return;
            }
            T t11 = this.f74373e;
            if (t11 == null) {
                this.f74373e = t10;
                return;
            }
            try {
                this.f74373e = (T) fm.a.e(this.f74371c.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f74374f.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74374f, bVar)) {
                this.f74374f = bVar;
                this.f74370b.onSubscribe(this);
            }
        }
    }

    public c1(xl.p<T> pVar, dm.c<T, T, T> cVar) {
        this.f74368a = pVar;
        this.f74369b = cVar;
    }

    @Override // xl.g
    public void d(xl.h<? super T> hVar) {
        this.f74368a.subscribe(new a(hVar, this.f74369b));
    }
}
