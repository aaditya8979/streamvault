package mm;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: compiled from: ObservableDematerialize.java */
/* JADX INFO: loaded from: classes6.dex */
public final class u<T> extends mm.a<xl.j<T>, T> {

    /* JADX INFO: compiled from: ObservableDematerialize.java */
    public static final class a<T> implements xl.r<xl.j<T>>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f74692c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74693d;

        public a(xl.r<? super T> rVar) {
            this.f74691b = rVar;
        }

        @Override // xl.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(xl.j<T> jVar) {
            if (this.f74692c) {
                if (jVar.g()) {
                    tm.a.s(jVar.d());
                }
            } else if (jVar.g()) {
                this.f74693d.dispose();
                onError(jVar.d());
            } else if (!jVar.f()) {
                this.f74691b.onNext(jVar.e());
            } else {
                this.f74693d.dispose();
                onComplete();
            }
        }

        @Override // bm.b
        public void dispose() {
            this.f74693d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74693d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74692c) {
                return;
            }
            this.f74692c = true;
            this.f74691b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74692c) {
                tm.a.s(th2);
            } else {
                this.f74692c = true;
                this.f74691b.onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74693d, bVar)) {
                this.f74693d = bVar;
                this.f74691b.onSubscribe(this);
            }
        }
    }

    public u(xl.p<xl.j<T>> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
