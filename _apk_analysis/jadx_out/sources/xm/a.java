package xm;

import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import ms.b;
import ms.c;
import xl.f;

/* JADX INFO: compiled from: SerializedSubscriber.java */
/* JADX INFO: loaded from: classes12.dex */
public final class a<T> implements f<T>, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<? super T> f87001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f87002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f87003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f87004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qm.a<Object> f87005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f87006g;

    public a(b<? super T> bVar) {
        this(bVar, false);
    }

    public a(b<? super T> bVar, boolean z10) {
        this.f87001b = bVar;
        this.f87002c = z10;
    }

    public void a() {
        qm.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f87005f;
                if (aVar == null) {
                    this.f87004e = false;
                    return;
                }
                this.f87005f = null;
            }
        } while (!aVar.a(this.f87001b));
    }

    @Override // ms.c
    public void cancel() {
        this.f87003d.cancel();
    }

    @Override // ms.b
    public void onComplete() {
        if (this.f87006g) {
            return;
        }
        synchronized (this) {
            if (this.f87006g) {
                return;
            }
            if (!this.f87004e) {
                this.f87006g = true;
                this.f87004e = true;
                this.f87001b.onComplete();
            } else {
                qm.a<Object> aVar = this.f87005f;
                if (aVar == null) {
                    aVar = new qm.a<>(4);
                    this.f87005f = aVar;
                }
                aVar.c(NotificationLite.complete());
            }
        }
    }

    @Override // ms.b
    public void onError(Throwable th2) {
        if (this.f87006g) {
            tm.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f87006g) {
                if (this.f87004e) {
                    this.f87006g = true;
                    qm.a<Object> aVar = this.f87005f;
                    if (aVar == null) {
                        aVar = new qm.a<>(4);
                        this.f87005f = aVar;
                    }
                    Object objError = NotificationLite.error(th2);
                    if (this.f87002c) {
                        aVar.c(objError);
                    } else {
                        aVar.e(objError);
                    }
                    return;
                }
                this.f87006g = true;
                this.f87004e = true;
                z10 = false;
            }
            if (z10) {
                tm.a.s(th2);
            } else {
                this.f87001b.onError(th2);
            }
        }
    }

    @Override // ms.b
    public void onNext(T t10) {
        if (this.f87006g) {
            return;
        }
        if (t10 == null) {
            this.f87003d.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f87006g) {
                return;
            }
            if (!this.f87004e) {
                this.f87004e = true;
                this.f87001b.onNext(t10);
                a();
            } else {
                qm.a<Object> aVar = this.f87005f;
                if (aVar == null) {
                    aVar = new qm.a<>(4);
                    this.f87005f = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // xl.f, ms.b
    public void onSubscribe(c cVar) {
        if (SubscriptionHelper.validate(this.f87003d, cVar)) {
            this.f87003d = cVar;
            this.f87001b.onSubscribe(this);
        }
    }

    @Override // ms.c
    public void request(long j10) {
        this.f87003d.request(j10);
    }
}
