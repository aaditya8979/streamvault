package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

/* JADX INFO: compiled from: ObservableTake.java */
/* JADX INFO: loaded from: classes11.dex */
public final class o1<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74586c;

    /* JADX INFO: compiled from: ObservableTake.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f74588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f74590e;

        public a(xl.r<? super T> rVar, long j10) {
            this.f74587b = rVar;
            this.f74590e = j10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74589d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74589d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74588c) {
                return;
            }
            this.f74588c = true;
            this.f74589d.dispose();
            this.f74587b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74588c) {
                tm.a.s(th2);
                return;
            }
            this.f74588c = true;
            this.f74589d.dispose();
            this.f74587b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74588c) {
                return;
            }
            long j10 = this.f74590e;
            long j11 = j10 - 1;
            this.f74590e = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f74587b.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74589d, bVar)) {
                this.f74589d = bVar;
                if (this.f74590e != 0) {
                    this.f74587b.onSubscribe(this);
                    return;
                }
                this.f74588c = true;
                bVar.dispose();
                EmptyDisposable.complete(this.f74587b);
            }
        }
    }

    public o1(xl.p<T> pVar, long j10) {
        super(pVar);
        this.f74586c = j10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74586c));
    }
}
