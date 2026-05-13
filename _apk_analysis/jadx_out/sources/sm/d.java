package sm;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import xl.r;

/* JADX INFO: compiled from: SafeObserver.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d<T> implements r<T>, bm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super T> f84434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bm.b f84435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84436d;

    public d(r<? super T> rVar) {
        this.f84434b = rVar;
    }

    public void a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f84434b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f84434b.onError(nullPointerException);
            } catch (Throwable th2) {
                cm.a.b(th2);
                tm.a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            cm.a.b(th3);
            tm.a.s(new CompositeException(nullPointerException, th3));
        }
    }

    public void b() {
        this.f84436d = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f84434b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f84434b.onError(nullPointerException);
            } catch (Throwable th2) {
                cm.a.b(th2);
                tm.a.s(new CompositeException(nullPointerException, th2));
            }
        } catch (Throwable th3) {
            cm.a.b(th3);
            tm.a.s(new CompositeException(nullPointerException, th3));
        }
    }

    @Override // bm.b
    public void dispose() {
        this.f84435c.dispose();
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f84435c.isDisposed();
    }

    @Override // xl.r
    public void onComplete() {
        if (this.f84436d) {
            return;
        }
        this.f84436d = true;
        if (this.f84435c == null) {
            a();
            return;
        }
        try {
            this.f84434b.onComplete();
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.f84436d) {
            tm.a.s(th2);
            return;
        }
        this.f84436d = true;
        if (this.f84435c != null) {
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f84434b.onError(th2);
                return;
            } catch (Throwable th3) {
                cm.a.b(th3);
                tm.a.s(new CompositeException(th2, th3));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f84434b.onSubscribe(EmptyDisposable.INSTANCE);
            try {
                this.f84434b.onError(new CompositeException(th2, nullPointerException));
            } catch (Throwable th4) {
                cm.a.b(th4);
                tm.a.s(new CompositeException(th2, nullPointerException, th4));
            }
        } catch (Throwable th5) {
            cm.a.b(th5);
            tm.a.s(new CompositeException(th2, nullPointerException, th5));
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (this.f84436d) {
            return;
        }
        if (this.f84435c == null) {
            b();
            return;
        }
        if (t10 == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f84435c.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th2) {
                cm.a.b(th2);
                onError(new CompositeException(nullPointerException, th2));
                return;
            }
        }
        try {
            this.f84434b.onNext(t10);
        } catch (Throwable th3) {
            cm.a.b(th3);
            try {
                this.f84435c.dispose();
                onError(th3);
            } catch (Throwable th4) {
                cm.a.b(th4);
                onError(new CompositeException(th3, th4));
            }
        }
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        if (DisposableHelper.validate(this.f84435c, bVar)) {
            this.f84435c = bVar;
            try {
                this.f84434b.onSubscribe(this);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f84436d = true;
                try {
                    bVar.dispose();
                    tm.a.s(th2);
                } catch (Throwable th3) {
                    cm.a.b(th3);
                    tm.a.s(new CompositeException(th2, th3));
                }
            }
        }
    }
}
