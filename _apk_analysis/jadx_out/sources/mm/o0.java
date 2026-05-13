package mm;

import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableGenerate.java */
/* JADX INFO: loaded from: classes11.dex */
public final class o0<T, S> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable<S> f74576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.c<S, xl.d<T>, S> f74577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.g<? super S> f74578d;

    /* JADX INFO: compiled from: ObservableGenerate.java */
    public static final class a<T, S> implements xl.d<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.c<S, ? super xl.d<T>, S> f74580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final dm.g<? super S> f74581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public S f74582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public volatile boolean f74583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f74584g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f74585h;

        public a(xl.r<? super T> rVar, dm.c<S, ? super xl.d<T>, S> cVar, dm.g<? super S> gVar, S s10) {
            this.f74579b = rVar;
            this.f74580c = cVar;
            this.f74581d = gVar;
            this.f74582e = s10;
        }

        public final void a(S s10) {
            try {
                this.f74581d.accept(s10);
            } catch (Throwable th2) {
                cm.a.b(th2);
                tm.a.s(th2);
            }
        }

        public void b() {
            S sApply = this.f74582e;
            if (this.f74583f) {
                this.f74582e = null;
                a(sApply);
                return;
            }
            dm.c<S, ? super xl.d<T>, S> cVar = this.f74580c;
            while (!this.f74583f) {
                this.f74585h = false;
                try {
                    sApply = cVar.apply(sApply, this);
                    if (this.f74584g) {
                        this.f74583f = true;
                        this.f74582e = null;
                        a(sApply);
                        return;
                    }
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    this.f74582e = null;
                    this.f74583f = true;
                    onError(th2);
                    a(sApply);
                    return;
                }
            }
            this.f74582e = null;
            a(sApply);
        }

        @Override // bm.b
        public void dispose() {
            this.f74583f = true;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74583f;
        }

        @Override // xl.d
        public void onError(Throwable th2) {
            if (this.f74584g) {
                tm.a.s(th2);
                return;
            }
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.f74584g = true;
            this.f74579b.onError(th2);
        }
    }

    public o0(Callable<S> callable, dm.c<S, xl.d<T>, S> cVar, dm.g<? super S> gVar) {
        this.f74576b = callable;
        this.f74577c = cVar;
        this.f74578d = gVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        try {
            a aVar = new a(rVar, this.f74577c, this.f74578d, this.f74576b.call());
            rVar.onSubscribe(aVar);
            aVar.b();
        } catch (Throwable th2) {
            cm.a.b(th2);
            EmptyDisposable.error(th2, rVar);
        }
    }
}
