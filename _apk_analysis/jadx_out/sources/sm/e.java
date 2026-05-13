package sm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import xl.r;

/* JADX INFO: compiled from: SerializedObserver.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e<T> implements r<T>, bm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super T> f84437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bm.b f84439d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f84440e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qm.a<Object> f84441f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f84442g;

    public e(r<? super T> rVar) {
        this(rVar, false);
    }

    public e(r<? super T> rVar, boolean z10) {
        this.f84437b = rVar;
        this.f84438c = z10;
    }

    public void a() {
        qm.a<Object> aVar;
        do {
            synchronized (this) {
                aVar = this.f84441f;
                if (aVar == null) {
                    this.f84440e = false;
                    return;
                }
                this.f84441f = null;
            }
        } while (!aVar.b(this.f84437b));
    }

    @Override // bm.b
    public void dispose() {
        this.f84439d.dispose();
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f84439d.isDisposed();
    }

    @Override // xl.r
    public void onComplete() {
        if (this.f84442g) {
            return;
        }
        synchronized (this) {
            if (this.f84442g) {
                return;
            }
            if (!this.f84440e) {
                this.f84442g = true;
                this.f84440e = true;
                this.f84437b.onComplete();
            } else {
                qm.a<Object> aVar = this.f84441f;
                if (aVar == null) {
                    aVar = new qm.a<>(4);
                    this.f84441f = aVar;
                }
                aVar.c(NotificationLite.complete());
            }
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.f84442g) {
            tm.a.s(th2);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.f84442g) {
                if (this.f84440e) {
                    this.f84442g = true;
                    qm.a<Object> aVar = this.f84441f;
                    if (aVar == null) {
                        aVar = new qm.a<>(4);
                        this.f84441f = aVar;
                    }
                    Object objError = NotificationLite.error(th2);
                    if (this.f84438c) {
                        aVar.c(objError);
                    } else {
                        aVar.e(objError);
                    }
                    return;
                }
                this.f84442g = true;
                this.f84440e = true;
                z10 = false;
            }
            if (z10) {
                tm.a.s(th2);
            } else {
                this.f84437b.onError(th2);
            }
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.f84442g) {
            return;
        }
        if (t10 == null) {
            this.f84439d.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f84442g) {
                return;
            }
            if (!this.f84440e) {
                this.f84440e = true;
                this.f84437b.onNext(t10);
                a();
            } else {
                qm.a<Object> aVar = this.f84441f;
                if (aVar == null) {
                    aVar = new qm.a<>(4);
                    this.f84441f = aVar;
                }
                aVar.c(NotificationLite.next(t10));
            }
        }
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        if (DisposableHelper.validate(this.f84439d, bVar)) {
            this.f84439d = bVar;
            this.f84437b.onSubscribe(this);
        }
    }
}
