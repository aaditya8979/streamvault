package mm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* JADX INFO: compiled from: ObservableDetach.java */
/* JADX INFO: loaded from: classes6.dex */
public final class v<T> extends mm.a<T, T> {

    /* JADX INFO: compiled from: ObservableDetach.java */
    public static final class a<T> implements xl.r<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public xl.r<? super T> f74705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f74706c;

        public a(xl.r<? super T> rVar) {
            this.f74705b = rVar;
        }

        @Override // bm.b
        public void dispose() {
            bm.b bVar = this.f74706c;
            this.f74706c = EmptyComponent.INSTANCE;
            this.f74705b = EmptyComponent.asObserver();
            bVar.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74706c.isDisposed();
        }

        @Override // xl.r
        public void onComplete() {
            xl.r<? super T> rVar = this.f74705b;
            this.f74706c = EmptyComponent.INSTANCE;
            this.f74705b = EmptyComponent.asObserver();
            rVar.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            xl.r<? super T> rVar = this.f74705b;
            this.f74706c = EmptyComponent.INSTANCE;
            this.f74705b = EmptyComponent.asObserver();
            rVar.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f74705b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            if (DisposableHelper.validate(this.f74706c, bVar)) {
                this.f74706c = bVar;
                this.f74705b.onSubscribe(this);
            }
        }
    }

    public v(xl.p<T> pVar) {
        super(pVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new a(rVar));
    }
}
