package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ObservableTimeInterval.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s1<T> extends mm.a<T, vm.b<T>> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.s f74669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f74670d;

    /* JADX INFO: compiled from: ObservableTimeInterval.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super vm.b<T>> f74671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f74672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final xl.s f74673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f74674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public bm.b f74675f;

        public a(xl.r<? super vm.b<T>> rVar, TimeUnit timeUnit, xl.s sVar) {
            this.f74671b = rVar;
            this.f74673d = sVar;
            this.f74672c = timeUnit;
        }

        @Override // bm.b
        public void dispose() {
            this.f74675f.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74675f.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74671b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74671b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            long jB = this.f74673d.b(this.f74672c);
            long j10 = this.f74674e;
            this.f74674e = jB;
            this.f74671b.onNext(new vm.b(t10, jB - j10, this.f74672c));
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74675f, bVar)) {
                this.f74675f = bVar;
                this.f74674e = this.f74673d.b(this.f74672c);
                this.f74671b.onSubscribe(this);
            }
        }
    }

    public s1(xl.p<T> pVar, TimeUnit timeUnit, xl.s sVar) {
        super(pVar);
        this.f74669c = sVar;
        this.f74670d = timeUnit;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super vm.b<T>> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74670d, this.f74669c));
    }
}
