package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import xl.s;

/* JADX INFO: compiled from: ObservableDelay.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f74628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f74629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xl.s f74630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f74631f;

    /* JADX INFO: compiled from: ObservableDelay.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f74633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f74634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s.c f74635e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f74636f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public bm.b f74637g;

        /* JADX INFO: renamed from: mm.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class RunnableC0883a implements Runnable {
            public RunnableC0883a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f74632b.onComplete();
                } finally {
                    a.this.f74635e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f74639b;

            public b(Throwable th2) {
                this.f74639b = th2;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f74632b.onError(this.f74639b);
                } finally {
                    a.this.f74635e.dispose();
                }
            }
        }

        /* JADX INFO: compiled from: ObservableDelay.java */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final T f74641b;

            public c(T t10) {
                this.f74641b = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f74632b.onNext(this.f74641b);
            }
        }

        public a(xl.r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar, boolean z10) {
            this.f74632b = rVar;
            this.f74633c = j10;
            this.f74634d = timeUnit;
            this.f74635e = cVar;
            this.f74636f = z10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74637g.dispose();
            this.f74635e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74635e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            this.f74635e.c(new RunnableC0883a(), this.f74633c, this.f74634d);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74635e.c(new b(th2), this.f74636f ? this.f74633c : 0L, this.f74634d);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74635e.c(new c(t10), this.f74633c, this.f74634d);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74637g, bVar)) {
                this.f74637g = bVar;
                this.f74632b.onSubscribe(this);
            }
        }
    }

    public s(xl.p<T> pVar, long j10, TimeUnit timeUnit, xl.s sVar, boolean z10) {
        super(pVar);
        this.f74628c = j10;
        this.f74629d = timeUnit;
        this.f74630e = sVar;
        this.f74631f = z10;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(this.f74631f ? rVar : new sm.e(rVar), this.f74628c, this.f74629d, this.f74630e.a(), this.f74631f));
    }
}
