package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableSkip.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74486c;

    /* JADX INFO: compiled from: ObservableSkip.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f74488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74489d;

        public a(xl.r<? super T> rVar, long j10) {
            this.f74487b = rVar;
            this.f74488c = j10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74489d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74489d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74487b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74487b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            long j10 = this.f74488c;
            if (j10 != 0) {
                this.f74488c = j10 - 1;
            } else {
                this.f74487b.onNext(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74489d, bVar)) {
                this.f74489d = bVar;
                this.f74487b.onSubscribe(this);
            }
        }
    }

    public k1(xl.p<T> pVar, long j10) {
        super(pVar);
        this.f74486c = j10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74486c));
    }
}
