package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
/* JADX INFO: loaded from: classes6.dex */
public final class k<T, U extends Collection<? super T>, B> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.p<B> f74475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<U> f74476d;

    /* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
    public static final class a<T, U extends Collection<? super T>, B> extends sm.c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<T, U, B> f74477c;

        public a(b<T, U, B> bVar) {
            this.f74477c = bVar;
        }

        @Override // xl.r
        public void onComplete() {
            this.f74477c.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f74477c.onError(th2);
        }

        @Override // xl.r
        public void onNext(B b10) {
            this.f74477c.l();
        }
    }

    /* JADX INFO: compiled from: ObservableBufferExactBoundary.java */
    public static final class b<T, U extends Collection<? super T>, B> extends hm.j<T, U, U> implements bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74478h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final xl.p<B> f74479i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public bm.b f74480j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public bm.b f74481k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public U f74482l;

        public b(xl.r<? super U> rVar, Callable<U> callable, xl.p<B> pVar) {
            super(rVar, new MpscLinkedQueue());
            this.f74478h = callable;
            this.f74479i = pVar;
        }

        @Override // bm.b
        public void dispose() {
            if (this.f63542e) {
                return;
            }
            this.f63542e = true;
            this.f74481k.dispose();
            this.f74480j.dispose();
            if (g()) {
                this.f63541d.clear();
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f63542e;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // hm.j, qm.h
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(xl.r<? super U> rVar, U u10) {
            this.f63540c.onNext((Object) u10);
        }

        public void l() {
            try {
                U u10 = (U) fm.a.e(this.f74478h.call(), "The buffer supplied is null");
                synchronized (this) {
                    U u11 = this.f74482l;
                    if (u11 == null) {
                        return;
                    }
                    this.f74482l = u10;
                    i(u11, false, this);
                }
            } catch (Throwable th2) {
                cm.a.b(th2);
                dispose();
                this.f63540c.onError(th2);
            }
        }

        @Override // xl.r
        public void onComplete() {
            synchronized (this) {
                U u10 = this.f74482l;
                if (u10 == null) {
                    return;
                }
                this.f74482l = null;
                this.f63541d.offer(u10);
                this.f63543f = true;
                if (g()) {
                    qm.k.c(this.f63541d, this.f63540c, false, this, this);
                }
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            dispose();
            this.f63540c.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            synchronized (this) {
                U u10 = this.f74482l;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74480j, bVar)) {
                this.f74480j = bVar;
                try {
                    this.f74482l = (U) fm.a.e(this.f74478h.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f74481k = aVar;
                    this.f63540c.onSubscribe(this);
                    if (this.f63542e) {
                        return;
                    }
                    this.f74479i.subscribe(aVar);
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    this.f63542e = true;
                    bVar.dispose();
                    EmptyDisposable.error(th2, this.f63540c);
                }
            }
        }
    }

    public k(xl.p<T> pVar, xl.p<B> pVar2, Callable<U> callable) {
        super(pVar);
        this.f74475c = pVar2;
        this.f74476d = callable;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super U> rVar) {
        this.f74327b.subscribe(new b(new sm.e(rVar), this.f74476d, this.f74475c));
    }
}
