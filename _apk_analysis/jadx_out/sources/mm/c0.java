package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableElementAtMaybe.java */
/* JADX INFO: loaded from: classes12.dex */
public final class c0<T> extends xl.g<T> implements gm.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74362b;

    /* JADX INFO: compiled from: ObservableElementAtMaybe.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.h<? super T> f74363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f74366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74367f;

        public a(xl.h<? super T> hVar, long j10) {
            this.f74363b = hVar;
            this.f74364c = j10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74365d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74365d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74367f) {
                return;
            }
            this.f74367f = true;
            this.f74363b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74367f) {
                tm.a.s(th2);
            } else {
                this.f74367f = true;
                this.f74363b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74367f) {
                return;
            }
            long j10 = this.f74366e;
            if (j10 != this.f74364c) {
                this.f74366e = j10 + 1;
                return;
            }
            this.f74367f = true;
            this.f74365d.dispose();
            this.f74363b.onSuccess(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74365d, bVar)) {
                this.f74365d = bVar;
                this.f74363b.onSubscribe(this);
            }
        }
    }

    public c0(xl.p<T> pVar, long j10) {
        this.f74361a = pVar;
        this.f74362b = j10;
    }

    @Override // gm.b
    public xl.k<T> a() {
        return tm.a.o(new b0(this.f74361a, this.f74362b, null, false));
    }

    @Override // xl.g
    public void d(xl.h<? super T> hVar) {
        this.f74361a.subscribe(new a(hVar, this.f74362b));
    }
}
