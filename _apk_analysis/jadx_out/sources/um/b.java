package um;

import io.reactivex.internal.util.NotificationLite;
import ms.c;

/* JADX INFO: compiled from: SerializedProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f85727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f85728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public qm.a<Object> f85729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f85730f;

    public b(a<T> aVar) {
        this.f85727c = aVar;
    }

    @Override // xl.e
    public void n(ms.b<? super T> bVar) {
        this.f85727c.a(bVar);
    }

    @Override // ms.b
    public void onComplete() {
        if (this.f85730f) {
            return;
        }
        synchronized (this) {
            if (this.f85730f) {
                return;
            }
            this.f85730f = true;
            if (!this.f85728d) {
                this.f85728d = true;
                this.f85727c.onComplete();
                return;
            }
            qm.a<Object> aVar = this.f85729e;
            if (aVar == null) {
                aVar = new qm.a<>(4);
                this.f85729e = aVar;
            }
            aVar.c(NotificationLite.complete());
        }
    }

    @Override // ms.b
    public void onError(Throwable th2) {
        if (this.f85730f) {
            tm.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f85730f) {
                this.f85730f = true;
                if (this.f85728d) {
                    qm.a<Object> aVar = this.f85729e;
                    if (aVar == null) {
                        aVar = new qm.a<>(4);
                        this.f85729e = aVar;
                    }
                    aVar.e(NotificationLite.error(th2));
                    return;
                }
                this.f85728d = true;
                z10 = false;
            }
            if (z10) {
                tm.a.s(th2);
            } else {
                this.f85727c.onError(th2);
            }
        }
    }

    @Override // ms.b
    public void onNext(T t10) {
        if (this.f85730f) {
            return;
        }
        synchronized (this) {
            if (this.f85730f) {
                return;
            }
            if (!this.f85728d) {
                this.f85728d = true;
                this.f85727c.onNext(t10);
                s();
            } else {
                qm.a<Object> aVar = this.f85729e;
                if (aVar == null) {
                    aVar = new qm.a<>(4);
                    this.f85729e = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // ms.b
    public void onSubscribe(c cVar) {
        boolean z10 = true;
        if (!this.f85730f) {
            synchronized (this) {
                if (!this.f85730f) {
                    if (this.f85728d) {
                        qm.a<Object> aVar = this.f85729e;
                        if (aVar == null) {
                            aVar = new qm.a<>(4);
                            this.f85729e = aVar;
                        }
                        aVar.c(NotificationLite.subscription(cVar));
                        return;
                    }
                    this.f85728d = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            cVar.cancel();
        } else {
            this.f85727c.onSubscribe(cVar);
            s();
        }
    }

    public void s() {
        qm.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f85729e;
                if (aVar == null) {
                    this.f85728d = false;
                    return;
                }
                this.f85729e = null;
            }
            aVar.a(this.f85727c);
        }
    }
}
