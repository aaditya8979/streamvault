package mm;

import io.reactivex.internal.disposables.SequentialDisposable;

/* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t<T, U> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl.p<? extends T> f74676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.p<U> f74677c;

    /* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
    public final class a implements xl.r<U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SequentialDisposable f74678b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xl.r<? super T> f74679c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74680d;

        /* JADX INFO: renamed from: mm.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDelaySubscriptionOther.java */
        public final class C0884a implements xl.r<T> {
            public C0884a() {
            }

            @Override // xl.r
            public void onComplete() {
                a.this.f74679c.onComplete();
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                a.this.f74679c.onError(th2);
            }

            @Override // xl.r
            public void onNext(T t10) {
                a.this.f74679c.onNext(t10);
            }

            @Override // xl.r
            public void onSubscribe(bm.b bVar) {
                a.this.f74678b.update(bVar);
            }
        }

        public a(SequentialDisposable sequentialDisposable, xl.r<? super T> rVar) {
            this.f74678b = sequentialDisposable;
            this.f74679c = rVar;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74680d) {
                return;
            }
            this.f74680d = true;
            t.this.f74676b.subscribe(new C0884a());
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74680d) {
                tm.a.s(th2);
            } else {
                this.f74680d = true;
                this.f74679c.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(U u10) {
            onComplete();
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f74678b.update(bVar);
        }
    }

    public t(xl.p<? extends T> pVar, xl.p<U> pVar2) {
        this.f74676b = pVar;
        this.f74677c = pVar2;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        rVar.onSubscribe(sequentialDisposable);
        this.f74677c.subscribe(new a(sequentialDisposable, rVar));
    }
}
