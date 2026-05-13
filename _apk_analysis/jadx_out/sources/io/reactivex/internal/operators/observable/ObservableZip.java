package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableZip<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T>[] f71657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<? extends p<? extends T>> f71658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super Object[], ? extends R> f71659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f71661f;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = 2983708048395377667L;
        public volatile boolean cancelled;
        public final boolean delayError;
        public final r<? super R> downstream;
        public final a<T, R>[] observers;
        public final T[] row;
        public final o<? super Object[], ? extends R> zipper;

        public ZipCoordinator(r<? super R> rVar, o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
            this.downstream = rVar;
            this.zipper = oVar;
            this.observers = new a[i10];
            this.row = (T[]) new Object[i10];
            this.delayError = z10;
        }

        public void cancel() {
            clear();
            cancelSources();
        }

        public void cancelSources() {
            for (a<T, R> aVar : this.observers) {
                aVar.a();
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, r<? super R> rVar, boolean z12, a<?, ?> aVar) {
            if (this.cancelled) {
                cancel();
                return true;
            }
            if (!z10) {
                return false;
            }
            if (z12) {
                if (!z11) {
                    return false;
                }
                Throwable th2 = aVar.f71665e;
                cancel();
                if (th2 != null) {
                    rVar.onError(th2);
                } else {
                    rVar.onComplete();
                }
                return true;
            }
            Throwable th3 = aVar.f71665e;
            if (th3 != null) {
                cancel();
                rVar.onError(th3);
                return true;
            }
            if (!z11) {
                return false;
            }
            cancel();
            rVar.onComplete();
            return true;
        }

        public void clear() {
            for (a<T, R> aVar : this.observers) {
                aVar.f71663c.clear();
            }
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear();
            }
        }

        public void drain() {
            Throwable th2;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T, R>[] aVarArr = this.observers;
            r<? super R> rVar = this.downstream;
            T[] tArr = this.row;
            boolean z10 = this.delayError;
            int iAddAndGet = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                for (a<T, R> aVar : aVarArr) {
                    if (tArr[i11] == null) {
                        boolean z11 = aVar.f71664d;
                        T tPoll = aVar.f71663c.poll();
                        boolean z12 = tPoll == null;
                        if (checkTerminated(z11, z12, rVar, z10, aVar)) {
                            return;
                        }
                        if (z12) {
                            i10++;
                        } else {
                            tArr[i11] = tPoll;
                        }
                    } else if (aVar.f71664d && !z10 && (th2 = aVar.f71665e) != null) {
                        cancel();
                        rVar.onError(th2);
                        return;
                    }
                    i11++;
                }
                if (i10 != 0) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        rVar.onNext((Object) fm.a.e(this.zipper.apply(tArr.clone()), "The zipper returned a null value"));
                        Arrays.fill(tArr, (Object) null);
                    } catch (Throwable th3) {
                        cm.a.b(th3);
                        cancel();
                        rVar.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(p<? extends T>[] pVarArr, int i10) {
            a<T, R>[] aVarArr = this.observers;
            int length = aVarArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                aVarArr[i11] = new a<>(this, i10);
            }
            lazySet(0);
            this.downstream.onSubscribe(this);
            for (int i12 = 0; i12 < length && !this.cancelled; i12++) {
                pVarArr[i12].subscribe(aVarArr[i12]);
            }
        }
    }

    public static final class a<T, R> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZipCoordinator<T, R> f71662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final om.a<T> f71663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f71664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Throwable f71665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AtomicReference<b> f71666f = new AtomicReference<>();

        public a(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.f71662b = zipCoordinator;
            this.f71663c = new om.a<>(i10);
        }

        public void a() {
            DisposableHelper.dispose(this.f71666f);
        }

        @Override // xl.r
        public void onComplete() {
            this.f71664d = true;
            this.f71662b.drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71665e = th2;
            this.f71664d = true;
            this.f71662b.drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f71663c.offer(t10);
            this.f71662b.drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this.f71666f, bVar);
        }
    }

    public ObservableZip(p<? extends T>[] pVarArr, Iterable<? extends p<? extends T>> iterable, o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f71657b = pVarArr;
        this.f71658c = iterable;
        this.f71659d = oVar;
        this.f71660e = i10;
        this.f71661f = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        int length;
        p<? extends T>[] pVarArr = this.f71657b;
        if (pVarArr == null) {
            pVarArr = new k[8];
            length = 0;
            for (p<? extends T> pVar : this.f71658c) {
                if (length == pVarArr.length) {
                    p<? extends T>[] pVarArr2 = new p[(length >> 2) + length];
                    System.arraycopy(pVarArr, 0, pVarArr2, 0, length);
                    pVarArr = pVarArr2;
                }
                pVarArr[length] = pVar;
                length++;
            }
        } else {
            length = pVarArr.length;
        }
        if (length == 0) {
            EmptyDisposable.complete(rVar);
        } else {
            new ZipCoordinator(rVar, this.f71659d, length, this.f71661f).subscribe(pVarArr, this.f71660e);
        }
    }
}
