package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
/* JADX INFO: loaded from: classes6.dex */
public final class j<T, U extends Collection<? super T>, B> extends mm.a<T, U> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable<? extends xl.p<B>> f74458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Callable<U> f74459d;

    /* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
    public static final class a<T, U extends Collection<? super T>, B> extends sm.c<B> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b<T, U, B> f74460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f74461d;

        public a(b<T, U, B> bVar) {
            this.f74460c = bVar;
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74461d) {
                return;
            }
            this.f74461d = true;
            this.f74460c.m();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74461d) {
                tm.a.s(th2);
            } else {
                this.f74461d = true;
                this.f74460c.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(B b10) {
            if (this.f74461d) {
                return;
            }
            this.f74461d = true;
            dispose();
            this.f74460c.m();
        }
    }

    /* JADX INFO: compiled from: ObservableBufferBoundarySupplier.java */
    public static final class b<T, U extends Collection<? super T>, B> extends hm.j<T, U, U> implements bm.b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Callable<U> f74462h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Callable<? extends xl.p<B>> f74463i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public bm.b f74464j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AtomicReference<bm.b> f74465k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public U f74466l;

        public b(xl.r<? super U> rVar, Callable<U> callable, Callable<? extends xl.p<B>> callable2) {
            super(rVar, new MpscLinkedQueue());
            this.f74465k = new AtomicReference<>();
            this.f74462h = callable;
            this.f74463i = callable2;
        }

        @Override // bm.b
        public void dispose() {
            if (this.f63542e) {
                return;
            }
            this.f63542e = true;
            this.f74464j.dispose();
            l();
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
            DisposableHelper.dispose(this.f74465k);
        }

        public void m() {
            try {
                U u10 = (U) fm.a.e(this.f74462h.call(), "The buffer supplied is null");
                try {
                    xl.p pVar = (xl.p) fm.a.e(this.f74463i.call(), "The boundary ObservableSource supplied is null");
                    a aVar = new a(this);
                    if (DisposableHelper.replace(this.f74465k, aVar)) {
                        synchronized (this) {
                            U u11 = this.f74466l;
                            if (u11 == null) {
                                return;
                            }
                            this.f74466l = u10;
                            pVar.subscribe(aVar);
                            i(u11, false, this);
                        }
                    }
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    this.f63542e = true;
                    this.f74464j.dispose();
                    this.f63540c.onError(th2);
                }
            } catch (Throwable th3) {
                cm.a.b(th3);
                dispose();
                this.f63540c.onError(th3);
            }
        }

        @Override // xl.r
        public void onComplete() {
            synchronized (this) {
                U u10 = this.f74466l;
                if (u10 == null) {
                    return;
                }
                this.f74466l = null;
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
                U u10 = this.f74466l;
                if (u10 == null) {
                    return;
                }
                u10.add(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74464j, bVar)) {
                this.f74464j = bVar;
                xl.r<? super V> rVar = this.f63540c;
                try {
                    this.f74466l = (U) fm.a.e(this.f74462h.call(), "The buffer supplied is null");
                    try {
                        xl.p pVar = (xl.p) fm.a.e(this.f74463i.call(), "The boundary ObservableSource supplied is null");
                        a aVar = new a(this);
                        this.f74465k.set(aVar);
                        rVar.onSubscribe(this);
                        if (this.f63542e) {
                            return;
                        }
                        pVar.subscribe(aVar);
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        this.f63542e = true;
                        bVar.dispose();
                        EmptyDisposable.error(th2, rVar);
                    }
                } catch (Throwable th3) {
                    cm.a.b(th3);
                    this.f63542e = true;
                    bVar.dispose();
                    EmptyDisposable.error(th3, rVar);
                }
            }
        }
    }

    public j(xl.p<T> pVar, Callable<? extends xl.p<B>> callable, Callable<U> callable2) {
        super(pVar);
        this.f74458c = callable;
        this.f74459d = callable2;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super U> rVar) {
        this.f74327b.subscribe(new b(new sm.e(rVar), this.f74459d, this.f74458c));
    }
}
