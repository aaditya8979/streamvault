package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import sm.e;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes11.dex */
public final class ObservableDebounceTimed<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeUnit f71457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f71458e;

    public static final class DebounceEmitter<T> extends AtomicReference<b> implements Runnable, b {
        private static final long serialVersionUID = 6812032969491025141L;
        public final long idx;
        public final AtomicBoolean once = new AtomicBoolean();
        public final a<T> parent;
        public final T value;

        public DebounceEmitter(T t10, long j10, a<T> aVar) {
            this.value = t10;
            this.idx = j10;
            this.parent = aVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.a(this.idx, this.value, this);
            }
        }

        public void setResource(b bVar) {
            DisposableHelper.replace(this, bVar);
        }
    }

    public static final class a<T> implements r<T>, b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r<? super T> f71459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f71460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeUnit f71461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final s.c f71462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f71463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f71464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile long f71465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f71466i;

        public a(r<? super T> rVar, long j10, TimeUnit timeUnit, s.c cVar) {
            this.f71459b = rVar;
            this.f71460c = j10;
            this.f71461d = timeUnit;
            this.f71462e = cVar;
        }

        public void a(long j10, T t10, DebounceEmitter<T> debounceEmitter) {
            if (j10 == this.f71465h) {
                this.f71459b.onNext(t10);
                debounceEmitter.dispose();
            }
        }

        @Override // bm.b
        public void dispose() {
            this.f71463f.dispose();
            this.f71462e.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f71462e.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f71466i) {
                return;
            }
            this.f71466i = true;
            b bVar = this.f71464g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) bVar;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.f71459b.onComplete();
            this.f71462e.dispose();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f71466i) {
                tm.a.s(th2);
                return;
            }
            b bVar = this.f71464g;
            if (bVar != null) {
                bVar.dispose();
            }
            this.f71466i = true;
            this.f71459b.onError(th2);
            this.f71462e.dispose();
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f71466i) {
                return;
            }
            long j10 = this.f71465h + 1;
            this.f71465h = j10;
            b bVar = this.f71464g;
            if (bVar != null) {
                bVar.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t10, j10, this);
            this.f71464g = debounceEmitter;
            debounceEmitter.setResource(this.f71462e.c(debounceEmitter, this.f71460c, this.f71461d));
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.f71463f, bVar)) {
                this.f71463f = bVar;
                this.f71459b.onSubscribe(this);
            }
        }
    }

    public ObservableDebounceTimed(p<T> pVar, long j10, TimeUnit timeUnit, s sVar) {
        super(pVar);
        this.f71456c = j10;
        this.f71457d = timeUnit;
        this.f71458e = sVar;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f74327b.subscribe(new a(new e(rVar), this.f71456c, this.f71457d, this.f71458e.a()));
    }
}
