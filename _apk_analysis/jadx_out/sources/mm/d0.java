package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableElementAtSingle.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d0<T> extends xl.t<T> implements gm.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<T> f74385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f74386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f74387c;

    /* JADX INFO: compiled from: ObservableElementAtSingle.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super T> f74388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final T f74390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public bm.b f74391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f74392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74393g;

        public a(xl.u<? super T> uVar, long j10, T t10) {
            this.f74388b = uVar;
            this.f74389c = j10;
            this.f74390d = t10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74391e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74391e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74393g) {
                return;
            }
            this.f74393g = true;
            T t10 = this.f74390d;
            if (t10 != null) {
                this.f74388b.onSuccess(t10);
            } else {
                this.f74388b.onError(new NoSuchElementException());
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74393g) {
                tm.a.s(th2);
            } else {
                this.f74393g = true;
                this.f74388b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74393g) {
                return;
            }
            long j10 = this.f74392f;
            if (j10 != this.f74389c) {
                this.f74392f = j10 + 1;
                return;
            }
            this.f74393g = true;
            this.f74391e.dispose();
            this.f74388b.onSuccess(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74391e, bVar)) {
                this.f74391e = bVar;
                this.f74388b.onSubscribe(this);
            }
        }
    }

    public d0(xl.p<T> pVar, long j10, T t10) {
        this.f74385a = pVar;
        this.f74386b = j10;
        this.f74387c = t10;
    }

    @Override // gm.b
    public xl.k<T> a() {
        return tm.a.o(new b0(this.f74385a, this.f74386b, this.f74387c, true));
    }

    @Override // xl.t
    public void m(xl.u<? super T> uVar) {
        this.f74385a.subscribe(new a(uVar, this.f74386b, this.f74387c));
    }
}
