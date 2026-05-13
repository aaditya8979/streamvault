package mm;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.p<? extends T> f74568c;

    /* JADX INFO: compiled from: ObservableSwitchIfEmpty.java */
    public static final class a<T> implements xl.r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xl.p<? extends T> f74570c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f74572e = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SequentialDisposable f74571d = new SequentialDisposable();

        public a(xl.r<? super T> rVar, xl.p<? extends T> pVar) {
            this.f74569b = rVar;
            this.f74570c = pVar;
        }

        @Override // xl.r
        public void onComplete() {
            if (!this.f74572e) {
                this.f74569b.onComplete();
            } else {
                this.f74572e = false;
                this.f74570c.subscribe(this);
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74569b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74572e) {
                this.f74572e = false;
            }
            this.f74569b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f74571d.update(bVar);
        }
    }

    public n1(xl.p<T> pVar, xl.p<? extends T> pVar2) {
        super(pVar);
        this.f74568c = pVar2;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        a aVar = new a(rVar, this.f74568c);
        rVar.onSubscribe(aVar.f74571d);
        this.f74327b.subscribe(aVar);
    }
}
