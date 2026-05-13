package io.reactivex.internal.operators.observable;

import dm.g;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservablePublish<T> extends rm.a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<T> f71512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<a<T>> f71513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p<T> f71514d;

    public static final class InnerDisposable<T> extends AtomicReference<Object> implements bm.b {
        private static final long serialVersionUID = -1100270633763673112L;
        public final r<? super T> child;

        public InnerDisposable(r<? super T> rVar) {
            this.child = rVar;
        }

        @Override // bm.b
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((a) andSet).b(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get() == this;
        }

        public void setParent(a<T> aVar) {
            if (compareAndSet(null, aVar)) {
                return;
            }
            aVar.b(this);
        }
    }

    public static final class a<T> implements r<T>, bm.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final InnerDisposable[] f71515f = new InnerDisposable[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final InnerDisposable[] f71516g = new InnerDisposable[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<a<T>> f71517b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReference<bm.b> f71520e = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReference<InnerDisposable<T>[]> f71518c = new AtomicReference<>(f71515f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f71519d = new AtomicBoolean();

        public a(AtomicReference<a<T>> atomicReference) {
            this.f71517b = atomicReference;
        }

        public boolean a(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f71518c.get();
                if (innerDisposableArr == f71516g) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!androidx.compose.animation.core.a.a(this.f71518c, innerDisposableArr, innerDisposableArr2));
            return true;
        }

        public void b(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.f71518c.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = f71515f;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!androidx.compose.animation.core.a.a(this.f71518c, innerDisposableArr, innerDisposableArr2));
        }

        @Override // bm.b
        public void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.f71518c;
            InnerDisposable<T>[] innerDisposableArr = f71516g;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                androidx.compose.animation.core.a.a(this.f71517b, this, null);
                DisposableHelper.dispose(this.f71520e);
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f71518c.get() == f71516g;
        }

        @Override // xl.r
        public void onComplete() {
            androidx.compose.animation.core.a.a(this.f71517b, this, null);
            for (InnerDisposable<T> innerDisposable : this.f71518c.getAndSet(f71516g)) {
                innerDisposable.child.onComplete();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            androidx.compose.animation.core.a.a(this.f71517b, this, null);
            InnerDisposable<T>[] andSet = this.f71518c.getAndSet(f71516g);
            if (andSet.length == 0) {
                tm.a.s(th2);
                return;
            }
            for (InnerDisposable<T> innerDisposable : andSet) {
                innerDisposable.child.onError(th2);
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            for (InnerDisposable<T> innerDisposable : this.f71518c.get()) {
                innerDisposable.child.onNext(t10);
            }
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            DisposableHelper.setOnce(this.f71520e, bVar);
        }
    }

    public static final class b<T> implements p<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<a<T>> f71521b;

        public b(AtomicReference<a<T>> atomicReference) {
            this.f71521b = atomicReference;
        }

        @Override // xl.p
        public void subscribe(r<? super T> rVar) {
            InnerDisposable innerDisposable = new InnerDisposable(rVar);
            rVar.onSubscribe(innerDisposable);
            while (true) {
                a<T> aVar = this.f71521b.get();
                if (aVar == null || aVar.isDisposed()) {
                    a<T> aVar2 = new a<>(this.f71521b);
                    if (androidx.compose.animation.core.a.a(this.f71521b, aVar, aVar2)) {
                        aVar = aVar2;
                    } else {
                        continue;
                    }
                }
                if (aVar.a(innerDisposable)) {
                    innerDisposable.setParent(aVar);
                    return;
                }
            }
        }
    }

    public ObservablePublish(p<T> pVar, p<T> pVar2, AtomicReference<a<T>> atomicReference) {
        this.f71514d = pVar;
        this.f71512b = pVar2;
        this.f71513c = atomicReference;
    }

    public static <T> rm.a<T> d(p<T> pVar) {
        AtomicReference atomicReference = new AtomicReference();
        return tm.a.k(new ObservablePublish(new b(atomicReference), pVar, atomicReference));
    }

    @Override // rm.a
    public void b(g<? super bm.b> gVar) {
        a<T> aVar;
        while (true) {
            aVar = this.f71513c.get();
            if (aVar != null && !aVar.isDisposed()) {
                break;
            }
            a<T> aVar2 = new a<>(this.f71513c);
            if (androidx.compose.animation.core.a.a(this.f71513c, aVar, aVar2)) {
                aVar = aVar2;
                break;
            }
        }
        boolean z10 = !aVar.f71519d.get() && aVar.f71519d.compareAndSet(false, true);
        try {
            gVar.accept(aVar);
            if (z10) {
                this.f71512b.subscribe(aVar);
            }
        } catch (Throwable th2) {
            cm.a.b(th2);
            throw ExceptionHelper.d(th2);
        }
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        this.f71514d.subscribe(rVar);
    }
}
