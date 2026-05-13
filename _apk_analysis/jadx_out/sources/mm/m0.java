package mm;

import io.reactivex.internal.subscriptions.SubscriptionHelper;

/* JADX INFO: compiled from: ObservableFromPublisher.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m0<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms.a<? extends T> f74551b;

    /* JADX INFO: compiled from: ObservableFromPublisher.java */
    public static final class a<T> implements xl.f<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.r<? super T> f74552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ms.c f74553c;

        public a(xl.r<? super T> rVar) {
            this.f74552b = rVar;
        }

        @Override // bm.b
        public void dispose() {
            this.f74553c.cancel();
            this.f74553c = SubscriptionHelper.CANCELLED;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f74553c == SubscriptionHelper.CANCELLED;
        }

        @Override // ms.b
        public void onComplete() {
            this.f74552b.onComplete();
        }

        @Override // ms.b
        public void onError(Throwable th2) {
            this.f74552b.onError(th2);
        }

        @Override // ms.b
        public void onNext(T t10) {
            this.f74552b.onNext(t10);
        }

        @Override // xl.f, ms.b
        public void onSubscribe(ms.c cVar) {
            if (SubscriptionHelper.validate(this.f74553c, cVar)) {
                this.f74553c = cVar;
                this.f74552b.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public m0(ms.a<? extends T> aVar) {
        this.f74551b = aVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74551b.a(new a(rVar));
    }
}
