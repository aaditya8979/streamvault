package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableDebounce.java */
/* JADX INFO: loaded from: classes6.dex */
public final class q<T, U> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super T, ? extends xl.p<U>> f74600c;

    /* JADX INFO: compiled from: ObservableDebounce.java */
    public static final class a<T, U> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super T, ? extends xl.p<U>> f74602c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<bm.b> f74604e = new AtomicReference<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile long f74605f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74606g;

        /* JADX INFO: renamed from: mm.q$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDebounce.java */
        public static final class C0882a<T, U> extends sm.c<U> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final a<T, U> f74607c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final long f74608d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final T f74609e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f74610f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final AtomicBoolean f74611g = new AtomicBoolean();

            public C0882a(a<T, U> aVar, long j10, T t10) {
                this.f74607c = aVar;
                this.f74608d = j10;
                this.f74609e = t10;
            }

            public void b() {
                if (this.f74611g.compareAndSet(false, true)) {
                    this.f74607c.a(this.f74608d, this.f74609e);
                }
            }

            @Override // xl.r
            public void onComplete() {
                if (this.f74610f) {
                    return;
                }
                this.f74610f = true;
                b();
            }

            @Override // xl.r
            public void onError(Throwable th2) {
                if (this.f74610f) {
                    tm.a.s(th2);
                } else {
                    this.f74610f = true;
                    this.f74607c.onError(th2);
                }
            }

            @Override // xl.r
            public void onNext(U u10) {
                if (this.f74610f) {
                    return;
                }
                this.f74610f = true;
                dispose();
                b();
            }
        }

        public a(xl.r<? super T> rVar, dm.o<? super T, ? extends xl.p<U>> oVar) {
            this.f74601b = rVar;
            this.f74602c = oVar;
        }

        public void a(long j10, T t10) {
            if (j10 == this.f74605f) {
                this.f74601b.onNext(t10);
            }
        }

        @Override // bm.b
        public void dispose() {
            this.f74603d.dispose();
            DisposableHelper.dispose(this.f74604e);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74603d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74606g) {
                return;
            }
            this.f74606g = true;
            bm.b bVar = this.f74604e.get();
            if (bVar != DisposableHelper.DISPOSED) {
                ((C0882a) bVar).b();
                DisposableHelper.dispose(this.f74604e);
                this.f74601b.onComplete();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            DisposableHelper.dispose(this.f74604e);
            this.f74601b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74606g) {
                return;
            }
            long j10 = this.f74605f + 1;
            this.f74605f = j10;
            bm.b bVar = this.f74604e.get();
            if (bVar != null) {
                bVar.dispose();
            }
            try {
                xl.p pVar = (xl.p) fm.a.e(this.f74602c.apply(t10), "The ObservableSource supplied is null");
                C0882a c0882a = new C0882a(this, j10, t10);
                if (androidx.compose.animation.core.a.a(this.f74604e, bVar, c0882a)) {
                    pVar.subscribe(c0882a);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                dispose();
                this.f74601b.onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74603d, bVar)) {
                this.f74603d = bVar;
                this.f74601b.onSubscribe(this);
            }
        }
    }

    public q(xl.p<T> pVar, dm.o<? super T, ? extends xl.p<U>> oVar) {
        super(pVar);
        this.f74600c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(new sm.e(rVar), this.f74600c));
    }
}
