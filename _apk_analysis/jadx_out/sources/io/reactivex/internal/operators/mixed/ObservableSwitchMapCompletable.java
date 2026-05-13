package io.reactivex.internal.operators.mixed;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.a;
import xl.c;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableSwitchMapCompletable<T> extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k<T> f71395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends c> f71396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71397c;

    public static final class SwitchMapCompletableObserver<T> implements r<T>, b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final SwitchMapInnerObserver f71398i = new SwitchMapInnerObserver(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xl.b f71399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super T, ? extends c> f71400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f71401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicThrowable f71402e = new AtomicThrowable();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference<SwitchMapInnerObserver> f71403f = new AtomicReference<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public volatile boolean f71404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public b f71405h;

        public static final class SwitchMapInnerObserver extends AtomicReference<b> implements xl.b {
            private static final long serialVersionUID = -8003404460084760287L;
            public final SwitchMapCompletableObserver<?> parent;

            public SwitchMapInnerObserver(SwitchMapCompletableObserver<?> switchMapCompletableObserver) {
                this.parent = switchMapCompletableObserver;
            }

            public void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // xl.b, xl.h
            public void onComplete() {
                this.parent.b(this);
            }

            @Override // xl.b
            public void onError(Throwable th2) {
                this.parent.c(this, th2);
            }

            @Override // xl.b
            public void onSubscribe(b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public SwitchMapCompletableObserver(xl.b bVar, o<? super T, ? extends c> oVar, boolean z10) {
            this.f71399b = bVar;
            this.f71400c = oVar;
            this.f71401d = z10;
        }

        public void a() {
            AtomicReference<SwitchMapInnerObserver> atomicReference = this.f71403f;
            SwitchMapInnerObserver switchMapInnerObserver = f71398i;
            SwitchMapInnerObserver andSet = atomicReference.getAndSet(switchMapInnerObserver);
            if (andSet == null || andSet == switchMapInnerObserver) {
                return;
            }
            andSet.dispose();
        }

        public void b(SwitchMapInnerObserver switchMapInnerObserver) {
            if (androidx.compose.animation.core.a.a(this.f71403f, switchMapInnerObserver, null) && this.f71404g) {
                Throwable thTerminate = this.f71402e.terminate();
                if (thTerminate == null) {
                    this.f71399b.onComplete();
                } else {
                    this.f71399b.onError(thTerminate);
                }
            }
        }

        public void c(SwitchMapInnerObserver switchMapInnerObserver, Throwable th2) {
            if (!androidx.compose.animation.core.a.a(this.f71403f, switchMapInnerObserver, null) || !this.f71402e.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (this.f71401d) {
                if (this.f71404g) {
                    this.f71399b.onError(this.f71402e.terminate());
                    return;
                }
                return;
            }
            dispose();
            Throwable thTerminate = this.f71402e.terminate();
            if (thTerminate != ExceptionHelper.f71695a) {
                this.f71399b.onError(thTerminate);
            }
        }

        @Override // bm.b
        public void dispose() {
            this.f71405h.dispose();
            a();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f71403f.get() == f71398i;
        }

        @Override // xl.r
        public void onComplete() {
            this.f71404g = true;
            if (this.f71403f.get() == null) {
                Throwable thTerminate = this.f71402e.terminate();
                if (thTerminate == null) {
                    this.f71399b.onComplete();
                } else {
                    this.f71399b.onError(thTerminate);
                }
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (!this.f71402e.addThrowable(th2)) {
                tm.a.s(th2);
                return;
            }
            if (this.f71401d) {
                onComplete();
                return;
            }
            a();
            Throwable thTerminate = this.f71402e.terminate();
            if (thTerminate != ExceptionHelper.f71695a) {
                this.f71399b.onError(thTerminate);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            SwitchMapInnerObserver switchMapInnerObserver;
            try {
                c cVar = (c) fm.a.e(this.f71400c.apply(t10), "The mapper returned a null CompletableSource");
                SwitchMapInnerObserver switchMapInnerObserver2 = new SwitchMapInnerObserver(this);
                do {
                    switchMapInnerObserver = this.f71403f.get();
                    if (switchMapInnerObserver == f71398i) {
                        return;
                    }
                } while (!androidx.compose.animation.core.a.a(this.f71403f, switchMapInnerObserver, switchMapInnerObserver2));
                if (switchMapInnerObserver != null) {
                    switchMapInnerObserver.dispose();
                }
                cVar.b(switchMapInnerObserver2);
            } catch (Throwable th2) {
                cm.a.b(th2);
                this.f71405h.dispose();
                onError(th2);
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.f71405h, bVar)) {
                this.f71405h = bVar;
                this.f71399b.onSubscribe(this);
            }
        }
    }

    public ObservableSwitchMapCompletable(k<T> kVar, o<? super T, ? extends c> oVar, boolean z10) {
        this.f71395a = kVar;
        this.f71396b = oVar;
        this.f71397c = z10;
    }

    @Override // xl.a
    public void f(xl.b bVar) {
        if (lm.a.a(this.f71395a, this.f71396b, bVar)) {
            return;
        }
        this.f71395a.subscribe(new SwitchMapCompletableObserver(bVar, this.f71396b, this.f71397c));
    }
}
