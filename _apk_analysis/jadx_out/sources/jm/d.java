package jm;

import xl.k;
import xl.r;

/* JADX INFO: compiled from: FlowableFromObservable.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> extends xl.e<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k<T> f72493c;

    /* JADX INFO: compiled from: FlowableFromObservable.java */
    public static final class a<T> implements r<T>, ms.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ms.b<? super T> f72494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public bm.b f72495c;

        public a(ms.b<? super T> bVar) {
            this.f72494b = bVar;
        }

        @Override // ms.c
        public void cancel() {
            this.f72495c.dispose();
        }

        @Override // xl.r
        public void onComplete() {
            this.f72494b.onComplete();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f72494b.onError(th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f72494b.onNext(t10);
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f72495c = bVar;
            this.f72494b.onSubscribe(this);
        }

        @Override // ms.c
        public void request(long j10) {
        }
    }

    public d(k<T> kVar) {
        this.f72493c = kVar;
    }

    @Override // xl.e
    public void n(ms.b<? super T> bVar) {
        this.f72493c.subscribe(new a(bVar));
    }
}
