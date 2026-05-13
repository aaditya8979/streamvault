package io.reactivex.internal.operators.observable;

import a.h;
import dm.o;
import gm.c;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableScalarXMap {

    public static final class ScalarDisposable<T> extends AtomicInteger implements c<T>, Runnable {
        public static final int FUSED = 1;
        public static final int ON_COMPLETE = 3;
        public static final int ON_NEXT = 2;
        public static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        public final r<? super T> observer;
        public final T value;

        public ScalarDisposable(r<? super T> rVar, T t10) {
            this.observer = rVar;
            this.value = t10;
        }

        @Override // gm.h
        public void clear() {
            lazySet(3);
        }

        @Override // bm.b
        public void dispose() {
            set(3);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get() == 3;
        }

        @Override // gm.h
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // gm.h
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public boolean offer(T t10, T t11) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // gm.h
        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        @Override // gm.d
        public int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }

    public static final class a<T, R> extends k<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f71567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super T, ? extends p<? extends R>> f71568c;

        public a(T t10, o<? super T, ? extends p<? extends R>> oVar) {
            this.f71567b = t10;
            this.f71568c = oVar;
        }

        @Override // xl.k
        public void subscribeActual(r<? super R> rVar) {
            try {
                p pVar = (p) fm.a.e(this.f71568c.apply(this.f71567b), "The mapper returned a null ObservableSource");
                if (!(pVar instanceof Callable)) {
                    pVar.subscribe(rVar);
                    return;
                }
                try {
                    Object objCall = ((Callable) pVar).call();
                    if (objCall == null) {
                        EmptyDisposable.complete(rVar);
                        return;
                    }
                    ScalarDisposable scalarDisposable = new ScalarDisposable(rVar, objCall);
                    rVar.onSubscribe(scalarDisposable);
                    scalarDisposable.run();
                } catch (Throwable th2) {
                    cm.a.b(th2);
                    EmptyDisposable.error(th2, rVar);
                }
            } catch (Throwable th3) {
                EmptyDisposable.error(th3, rVar);
            }
        }
    }

    public static <T, U> k<U> a(T t10, o<? super T, ? extends p<? extends U>> oVar) {
        return tm.a.o(new a(t10, oVar));
    }

    public static <T, R> boolean b(p<T> pVar, r<? super R> rVar, o<? super T, ? extends p<? extends R>> oVar) {
        if (!(pVar instanceof Callable)) {
            return false;
        }
        try {
            h hVar = (Object) ((Callable) pVar).call();
            if (hVar == null) {
                EmptyDisposable.complete(rVar);
                return true;
            }
            try {
                p pVar2 = (p) fm.a.e(oVar.apply(hVar), "The mapper returned a null ObservableSource");
                if (pVar2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) pVar2).call();
                        if (objCall == null) {
                            EmptyDisposable.complete(rVar);
                            return true;
                        }
                        ScalarDisposable scalarDisposable = new ScalarDisposable(rVar, objCall);
                        rVar.onSubscribe(scalarDisposable);
                        scalarDisposable.run();
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        EmptyDisposable.error(th2, rVar);
                        return true;
                    }
                } else {
                    pVar2.subscribe(rVar);
                }
                return true;
            } catch (Throwable th3) {
                cm.a.b(th3);
                EmptyDisposable.error(th3, rVar);
                return true;
            }
        } catch (Throwable th4) {
            cm.a.b(th4);
            EmptyDisposable.error(th4, rVar);
            return true;
        }
    }
}
