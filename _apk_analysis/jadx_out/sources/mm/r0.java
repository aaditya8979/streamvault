package mm;

/* JADX INFO: compiled from: ObservableIgnoreElementsCompletable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r0<T> extends xl.a implements gm.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74620a;

    /* JADX INFO: compiled from: ObservableIgnoreElementsCompletable.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.b f74621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74622c;

        public a(xl.b bVar) {
            this.f74621b = bVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74622c.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74622c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74621b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74621b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f74622c = bVar;
            this.f74621b.onSubscribe(this);
        }
    }

    public r0(xl.p<T> pVar) {
        this.f74620a = pVar;
    }

    @Override // gm.b
    public xl.k<T> a() {
        return tm.a.o(new q0(this.f74620a));
    }

    @Override // xl.a
    public void f(xl.b bVar) {
        this.f74620a.subscribe(new a(bVar));
    }
}
