package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableElementAt.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b0<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74342c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T f74343d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f74344e;

    /* JADX INFO: compiled from: ObservableElementAt.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T f74347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f74348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bm.b f74349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f74350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74351h;

        public a(xl.r<? super T> rVar, long j10, T t10, boolean z10) {
            this.f74345b = rVar;
            this.f74346c = j10;
            this.f74347d = t10;
            this.f74348e = z10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74349f.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74349f.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74351h) {
                return;
            }
            this.f74351h = true;
            T t10 = this.f74347d;
            if (t10 == null && this.f74348e) {
                this.f74345b.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                this.f74345b.onNext(t10);
            }
            this.f74345b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74351h) {
                tm.a.s(th2);
            } else {
                this.f74351h = true;
                this.f74345b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74351h) {
                return;
            }
            long j10 = this.f74350g;
            if (j10 != this.f74346c) {
                this.f74350g = j10 + 1;
                return;
            }
            this.f74351h = true;
            this.f74349f.dispose();
            this.f74345b.onNext(t10);
            this.f74345b.onComplete();
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74349f, bVar)) {
                this.f74349f = bVar;
                this.f74345b.onSubscribe(this);
            }
        }
    }

    public b0(xl.p<T> pVar, long j10, T t10, boolean z10) {
        super(pVar);
        this.f74342c = j10;
        this.f74343d = t10;
        this.f74344e = z10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74342c, this.f74343d, this.f74344e));
    }
}
