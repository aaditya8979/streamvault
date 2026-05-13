package mm;

import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkipUntil.java */
/* JADX INFO: loaded from: classes11.dex */
public final class l1<T, U> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.p<U> f74533c;

    /* JADX INFO: compiled from: ObservableSkipUntil.java */
    public final class a implements xl.r<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayCompositeDisposable f74534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<T> f74535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final sm.e<T> f74536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74537e;

        public a(ArrayCompositeDisposable arrayCompositeDisposable, b<T> bVar, sm.e<T> eVar) {
            this.f74534b = arrayCompositeDisposable;
            this.f74535c = bVar;
            this.f74536d = eVar;
        }

        @Override // xl.r
        public void onComplete() {
            this.f74535c.f74542e = true;
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74534b.dispose();
            this.f74536d.onError(th2);
        }

        @Override // xl.r
        public void onNext(U u10) {
            this.f74537e.dispose();
            this.f74535c.f74542e = true;
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74537e, bVar)) {
                this.f74537e = bVar;
                this.f74534b.setResource(1, bVar);
            }
        }
    }

    /* JADX INFO: compiled from: ObservableSkipUntil.java */
    public static final class b<T> implements xl.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayCompositeDisposable f74540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f74542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74543f;

        public b(xl.r<? super T> rVar, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f74539b = rVar;
            this.f74540c = arrayCompositeDisposable;
        }

        @Override // xl.r
        public void onComplete() {
            this.f74540c.dispose();
            this.f74539b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74540c.dispose();
            this.f74539b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74543f) {
                this.f74539b.onNext(t10);
            } else if (this.f74542e) {
                this.f74543f = true;
                this.f74539b.onNext(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74541d, bVar)) {
                this.f74541d = bVar;
                this.f74540c.setResource(0, bVar);
            }
        }
    }

    public l1(xl.p<T> pVar, xl.p<U> pVar2) {
        super(pVar);
        this.f74533c = pVar2;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        sm.e eVar = new sm.e(rVar);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        eVar.onSubscribe(arrayCompositeDisposable);
        b bVar = new b(eVar, arrayCompositeDisposable);
        this.f74533c.subscribe(new a(arrayCompositeDisposable, bVar, eVar));
        this.f74327b.subscribe(bVar);
    }
}
