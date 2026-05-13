package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSingleMaybe.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i1<T> extends xl.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74453a;

    /* JADX INFO: compiled from: ObservableSingleMaybe.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.h<? super T> f74454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public T f74456d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74457e;

        public a(xl.h<? super T> hVar) {
            this.f74454b = hVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74455c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74455c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74457e) {
                return;
            }
            this.f74457e = true;
            T t10 = this.f74456d;
            this.f74456d = null;
            if (t10 == null) {
                this.f74454b.onComplete();
            } else {
                this.f74454b.onSuccess(t10);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74457e) {
                tm.a.s(th2);
            } else {
                this.f74457e = true;
                this.f74454b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74457e) {
                return;
            }
            if (this.f74456d == null) {
                this.f74456d = t10;
                return;
            }
            this.f74457e = true;
            this.f74455c.dispose();
            this.f74454b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74455c, bVar)) {
                this.f74455c = bVar;
                this.f74454b.onSubscribe(this);
            }
        }
    }

    public i1(xl.p<T> pVar) {
        this.f74453a = pVar;
    }

    @Override // xl.g
    public void d(xl.h<? super T> hVar) {
        this.f74453a.subscribe(new a(hVar));
    }
}
