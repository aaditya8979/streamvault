package io.reactivex.subjects;

import bm.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tm.a;
import wm.c;
import xl.r;

/* JADX INFO: loaded from: classes5.dex */
public final class PublishSubject<T> extends c<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final PublishDisposable[] f71714d = new PublishDisposable[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PublishDisposable[] f71715e = new PublishDisposable[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<PublishDisposable<T>[]> f71716b = new AtomicReference<>(f71715e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f71717c;

    public static final class PublishDisposable<T> extends AtomicBoolean implements b {
        private static final long serialVersionUID = 3562861878281475070L;
        public final r<? super T> downstream;
        public final PublishSubject<T> parent;

        public PublishDisposable(r<? super T> rVar, PublishSubject<T> publishSubject) {
            this.downstream = rVar;
            this.parent = publishSubject;
        }

        @Override // bm.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.e(this);
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return get();
        }

        public void onComplete() {
            if (get()) {
                return;
            }
            this.downstream.onComplete();
        }

        public void onError(Throwable th2) {
            if (get()) {
                a.s(th2);
            } else {
                this.downstream.onError(th2);
            }
        }

        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.downstream.onNext(t10);
        }
    }

    public static <T> PublishSubject<T> d() {
        return new PublishSubject<>();
    }

    public boolean c(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f71716b.get();
            if (publishDisposableArr == f71714d) {
                return false;
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!androidx.compose.animation.core.a.a(this.f71716b, publishDisposableArr, publishDisposableArr2));
        return true;
    }

    public void e(PublishDisposable<T> publishDisposable) {
        PublishDisposable<T>[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        do {
            publishDisposableArr = this.f71716b.get();
            if (publishDisposableArr == f71714d || publishDisposableArr == f71715e) {
                return;
            }
            int length = publishDisposableArr.length;
            int i10 = -1;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                if (publishDisposableArr[i11] == publishDisposable) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                publishDisposableArr2 = f71715e;
            } else {
                PublishDisposable[] publishDisposableArr3 = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr, 0, publishDisposableArr3, 0, i10);
                System.arraycopy(publishDisposableArr, i10 + 1, publishDisposableArr3, i10, (length - i10) - 1);
                publishDisposableArr2 = publishDisposableArr3;
            }
        } while (!androidx.compose.animation.core.a.a(this.f71716b, publishDisposableArr, publishDisposableArr2));
    }

    @Override // xl.r
    public void onComplete() {
        PublishDisposable<T>[] publishDisposableArr = this.f71716b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f71714d;
        if (publishDisposableArr == publishDisposableArr2) {
            return;
        }
        for (PublishDisposable<T> publishDisposable : this.f71716b.getAndSet(publishDisposableArr2)) {
            publishDisposable.onComplete();
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        fm.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        PublishDisposable<T>[] publishDisposableArr = this.f71716b.get();
        PublishDisposable<T>[] publishDisposableArr2 = f71714d;
        if (publishDisposableArr == publishDisposableArr2) {
            a.s(th2);
            return;
        }
        this.f71717c = th2;
        for (PublishDisposable<T> publishDisposable : this.f71716b.getAndSet(publishDisposableArr2)) {
            publishDisposable.onError(th2);
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        fm.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (PublishDisposable<T> publishDisposable : this.f71716b.get()) {
            publishDisposable.onNext(t10);
        }
    }

    @Override // xl.r
    public void onSubscribe(b bVar) {
        if (this.f71716b.get() == f71714d) {
            bVar.dispose();
        }
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        PublishDisposable<T> publishDisposable = new PublishDisposable<>(rVar, this);
        rVar.onSubscribe(publishDisposable);
        if (c(publishDisposable)) {
            if (publishDisposable.isDisposed()) {
                e(publishDisposable);
            }
        } else {
            Throwable th2 = this.f71717c;
            if (th2 != null) {
                rVar.onError(th2);
            } else {
                rVar.onComplete();
            }
        }
    }
}
