package io.reactivex.internal.operators.observable;

import bm.b;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import qm.g;
import xl.k;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableCache<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a<T> f71431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f71432d;

    public static final class ReplayDisposable<T> extends AtomicInteger implements b {
        private static final long serialVersionUID = 7058506693698832024L;
        public volatile boolean cancelled;
        public final r<? super T> child;
        public Object[] currentBuffer;
        public int currentIndexInBuffer;
        public int index;
        public final a<T> state;

        public ReplayDisposable(r<? super T> rVar, a<T> aVar) {
            this.child = rVar;
            this.state = aVar;
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.f(this);
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void replay() {
            if (getAndIncrement() != 0) {
                return;
            }
            r<? super T> rVar = this.child;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                int iC = this.state.c();
                if (iC != 0) {
                    Object[] objArrB = this.currentBuffer;
                    if (objArrB == null) {
                        objArrB = this.state.b();
                        this.currentBuffer = objArrB;
                    }
                    int length = objArrB.length - 1;
                    int i10 = this.index;
                    int i11 = this.currentIndexInBuffer;
                    while (i10 < iC) {
                        if (this.cancelled) {
                            return;
                        }
                        if (i11 == length) {
                            objArrB = (Object[]) objArrB[length];
                            i11 = 0;
                        }
                        if (NotificationLite.accept(objArrB[i11], rVar)) {
                            return;
                        }
                        i11++;
                        i10++;
                    }
                    if (this.cancelled) {
                        return;
                    }
                    this.index = i10;
                    this.currentIndexInBuffer = i11;
                    this.currentBuffer = objArrB;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    public static final class a<T> extends g implements r<T> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final ReplayDisposable[] f71433l = new ReplayDisposable[0];

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final ReplayDisposable[] f71434m = new ReplayDisposable[0];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final k<? extends T> f71435g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final SequentialDisposable f71436h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final AtomicReference<ReplayDisposable<T>[]> f71437i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f71438j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f71439k;

        public a(k<? extends T> kVar, int i10) {
            super(i10);
            this.f71435g = kVar;
            this.f71437i = new AtomicReference<>(f71433l);
            this.f71436h = new SequentialDisposable();
        }

        public boolean d(ReplayDisposable<T> replayDisposable) {
            ReplayDisposable<T>[] replayDisposableArr;
            ReplayDisposable[] replayDisposableArr2;
            do {
                replayDisposableArr = this.f71437i.get();
                if (replayDisposableArr == f71434m) {
                    return false;
                }
                int length = replayDisposableArr.length;
                replayDisposableArr2 = new ReplayDisposable[length + 1];
                System.arraycopy(replayDisposableArr, 0, replayDisposableArr2, 0, length);
                replayDisposableArr2[length] = replayDisposable;
            } while (!androidx.compose.animation.core.a.a(this.f71437i, replayDisposableArr, replayDisposableArr2));
            return true;
        }

        public void e() {
            this.f71435g.subscribe(this);
            this.f71438j = true;
        }

        public void f(ReplayDisposable<T> replayDisposable) {
            ReplayDisposable<T>[] replayDisposableArr;
            ReplayDisposable[] replayDisposableArr2;
            do {
                replayDisposableArr = this.f71437i.get();
                int length = replayDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    }
                    if (replayDisposableArr[i11].equals(replayDisposable)) {
                        i10 = i11;
                        break;
                    }
                    i11++;
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    replayDisposableArr2 = f71433l;
                } else {
                    ReplayDisposable[] replayDisposableArr3 = new ReplayDisposable[length - 1];
                    System.arraycopy(replayDisposableArr, 0, replayDisposableArr3, 0, i10);
                    System.arraycopy(replayDisposableArr, i10 + 1, replayDisposableArr3, i10, (length - i10) - 1);
                    replayDisposableArr2 = replayDisposableArr3;
                }
            } while (!androidx.compose.animation.core.a.a(this.f71437i, replayDisposableArr, replayDisposableArr2));
        }

        @Override // xl.r
        public void onComplete() {
            if (this.f71439k) {
                return;
            }
            this.f71439k = true;
            a(NotificationLite.complete());
            this.f71436h.dispose();
            for (ReplayDisposable<T> replayDisposable : this.f71437i.getAndSet(f71434m)) {
                replayDisposable.replay();
            }
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.f71439k) {
                return;
            }
            this.f71439k = true;
            a(NotificationLite.error(th2));
            this.f71436h.dispose();
            for (ReplayDisposable<T> replayDisposable : this.f71437i.getAndSet(f71434m)) {
                replayDisposable.replay();
            }
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.f71439k) {
                return;
            }
            a(NotificationLite.next(t10));
            for (ReplayDisposable<T> replayDisposable : this.f71437i.get()) {
                replayDisposable.replay();
            }
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.f71436h.update(bVar);
        }
    }

    public ObservableCache(k<T> kVar, a<T> aVar) {
        super(kVar);
        this.f71431c = aVar;
        this.f71432d = new AtomicBoolean();
    }

    public static <T> k<T> b(k<T> kVar) {
        return c(kVar, 16);
    }

    public static <T> k<T> c(k<T> kVar, int i10) {
        fm.a.f(i10, "capacityHint");
        return tm.a.o(new ObservableCache(kVar, new a(kVar, i10)));
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        ReplayDisposable<T> replayDisposable = new ReplayDisposable<>(rVar, this.f71431c);
        rVar.onSubscribe(replayDisposable);
        this.f71431c.d(replayDisposable);
        if (!this.f71432d.get() && this.f71432d.compareAndSet(false, true)) {
            this.f71431c.e();
        }
        replayDisposable.replay();
    }
}
