package wm;

import io.reactivex.internal.util.NotificationLite;
import qm.a;
import xl.r;

/* JADX INFO: compiled from: SerializedSubject.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> extends c<T> implements a.InterfaceC0938a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c<T> f86468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qm.a<Object> f86470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f86471e;

    public b(c<T> cVar) {
        this.f86468b = cVar;
    }

    public void c() {
        qm.a<Object> aVar;
        while (true) {
            synchronized (this) {
                aVar = this.f86470d;
                if (aVar == null) {
                    this.f86469c = false;
                    return;
                }
                this.f86470d = null;
            }
            aVar.d(this);
        }
    }

    @Override // xl.r
    public void onComplete() {
        if (this.f86471e) {
            return;
        }
        synchronized (this) {
            if (this.f86471e) {
                return;
            }
            this.f86471e = true;
            if (!this.f86469c) {
                this.f86469c = true;
                this.f86468b.onComplete();
                return;
            }
            qm.a<Object> aVar = this.f86470d;
            if (aVar == null) {
                aVar = new qm.a<>(4);
                this.f86470d = aVar;
            }
            aVar.c(NotificationLite.complete());
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.f86471e) {
            tm.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f86471e) {
                this.f86471e = true;
                if (this.f86469c) {
                    qm.a<Object> aVar = this.f86470d;
                    if (aVar == null) {
                        aVar = new qm.a<>(4);
                        this.f86470d = aVar;
                    }
                    aVar.e(NotificationLite.error(th2));
                    return;
                }
                this.f86469c = true;
                z10 = false;
            }
            if (z10) {
                tm.a.s(th2);
            } else {
                this.f86468b.onError(th2);
            }
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.f86471e) {
            return;
        }
        synchronized (this) {
            if (this.f86471e) {
                return;
            }
            if (!this.f86469c) {
                this.f86469c = true;
                this.f86468b.onNext(t10);
                c();
            } else {
                qm.a<Object> aVar = this.f86470d;
                if (aVar == null) {
                    aVar = new qm.a<>(4);
                    this.f86470d = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        boolean z10 = true;
        if (!this.f86471e) {
            synchronized (this) {
                if (!this.f86471e) {
                    if (this.f86469c) {
                        qm.a<Object> aVar = this.f86470d;
                        if (aVar == null) {
                            aVar = new qm.a<>(4);
                            this.f86470d = aVar;
                        }
                        aVar.c(NotificationLite.disposable(bVar));
                        return;
                    }
                    this.f86469c = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            bVar.dispose();
        } else {
            this.f86468b.onSubscribe(bVar);
            c();
        }
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f86468b.subscribe(rVar);
    }

    @Override // qm.a.InterfaceC0938a, dm.q
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f86468b);
    }
}
