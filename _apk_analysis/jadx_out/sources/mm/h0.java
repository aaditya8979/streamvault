package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;

/* JADX INFO: compiled from: ObservableFlattenIterable.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h0<T, R> extends mm.a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.o<? super T, ? extends Iterable<? extends R>> f74443c;

    /* JADX INFO: compiled from: ObservableFlattenIterable.java */
    public static final class a<T, R> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super R> f74444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dm.o<? super T, ? extends Iterable<? extends R>> f74445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74446d;

        public a(xl.r<? super R> rVar, dm.o<? super T, ? extends Iterable<? extends R>> oVar) {
            this.f74444b = rVar;
            this.f74445c = oVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74446d.dispose();
            this.f74446d = DisposableHelper.DISPOSED;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74446d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            bm.b bVar = this.f74446d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                return;
            }
            this.f74446d = disposableHelper;
            this.f74444b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            bm.b bVar = this.f74446d;
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (bVar == disposableHelper) {
                tm.a.s(th2);
            } else {
                this.f74446d = disposableHelper;
                this.f74444b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74446d == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f74445c.apply(t10).iterator();
                xl.r<? super R> rVar = this.f74444b;
                while (it.hasNext()) {
                    try {
                        try {
                            rVar.onNext((Object) fm.a.e(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th2) {
                            cm.a.b(th2);
                            this.f74446d.dispose();
                            onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        cm.a.b(th3);
                        this.f74446d.dispose();
                        onError(th3);
                        return;
                    }
                }
            } catch (Throwable th4) {
                cm.a.b(th4);
                this.f74446d.dispose();
                onError(th4);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74446d, bVar)) {
                this.f74446d = bVar;
                this.f74444b.onSubscribe(this);
            }
        }
    }

    public h0(xl.p<T> pVar, dm.o<? super T, ? extends Iterable<? extends R>> oVar) {
        super(pVar);
        this.f74443c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super R> rVar) {
        this.f74327b.subscribe(new a(rVar, this.f74443c));
    }
}
