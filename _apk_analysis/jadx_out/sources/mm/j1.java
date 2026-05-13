package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: ObservableSingleSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class j1<T> extends xl.t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.p<? extends T> f74468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f74469b;

    /* JADX INFO: compiled from: ObservableSingleSingle.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.u<? super T> f74470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f74471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public bm.b f74472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public T f74473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f74474f;

        public a(xl.u<? super T> uVar, T t10) {
            this.f74470b = uVar;
            this.f74471c = t10;
        }

        @Override // bm.b
        public void dispose() {
            this.f74472d.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74472d.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f74474f) {
                return;
            }
            this.f74474f = true;
            T t10 = this.f74473e;
            this.f74473e = null;
            if (t10 == null) {
                t10 = this.f74471c;
            }
            if (t10 != null) {
                this.f74470b.onSuccess(t10);
            } else {
                this.f74470b.onError(new NoSuchElementException());
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f74474f) {
                tm.a.s(th2);
            } else {
                this.f74474f = true;
                this.f74470b.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f74474f) {
                return;
            }
            if (this.f74473e == null) {
                this.f74473e = t10;
                return;
            }
            this.f74474f = true;
            this.f74472d.dispose();
            this.f74470b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74472d, bVar)) {
                this.f74472d = bVar;
                this.f74470b.onSubscribe(this);
            }
        }
    }

    public j1(xl.p<? extends T> pVar, T t10) {
        this.f74468a = pVar;
        this.f74469b = t10;
    }

    @Override // xl.t
    public void m(xl.u<? super T> uVar) {
        this.f74468a.subscribe(new a(uVar, this.f74469b));
    }
}
