package io.reactivex.internal.operators.observable;

import bm.b;
import dm.o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableCombineLatest<T, R> extends k<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T>[] f71440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterable<? extends p<? extends T>> f71441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super Object[], ? extends R> f71442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f71444f;

    public static final class CombinerObserver<T, R> extends AtomicReference<b> implements r<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        public final int index;
        public final LatestCoordinator<T, R> parent;

        public CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i10) {
            this.parent = latestCoordinator;
            this.index = i10;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // xl.r
        public void onComplete() {
            this.parent.innerComplete(this.index);
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.parent.innerError(this.index, th2);
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.parent.innerNext(this.index, t10);
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }
    }

    public static final class LatestCoordinator<T, R> extends AtomicInteger implements b {
        private static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public volatile boolean cancelled;
        public final o<? super Object[], ? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final r<? super R> downstream;
        public final AtomicThrowable errors = new AtomicThrowable();
        public Object[] latest;
        public final CombinerObserver<T, R>[] observers;
        public final om.a<Object[]> queue;

        public LatestCoordinator(r<? super R> rVar, o<? super Object[], ? extends R> oVar, int i10, int i11, boolean z10) {
            this.downstream = rVar;
            this.combiner = oVar;
            this.delayError = z10;
            this.latest = new Object[i10];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                combinerObserverArr[i12] = new CombinerObserver<>(this, i12);
            }
            this.observers = combinerObserverArr;
            this.queue = new om.a<>(i11);
        }

        public void cancelSources() {
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                combinerObserver.dispose();
            }
        }

        public void clear(om.a<?> aVar) {
            synchronized (this) {
                this.latest = null;
            }
            aVar.clear();
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelSources();
            if (getAndIncrement() == 0) {
                clear(this.queue);
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            om.a<Object[]> aVar = this.queue;
            r<? super R> rVar = this.downstream;
            boolean z10 = this.delayError;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (!z10 && this.errors.get() != null) {
                    cancelSources();
                    clear(aVar);
                    rVar.onError(this.errors.terminate());
                    return;
                }
                boolean z11 = this.done;
                Object[] objArrPoll = aVar.poll();
                boolean z12 = objArrPoll == null;
                if (z11 && z12) {
                    clear(aVar);
                    Throwable thTerminate = this.errors.terminate();
                    if (thTerminate == null) {
                        rVar.onComplete();
                        return;
                    } else {
                        rVar.onError(thTerminate);
                        return;
                    }
                }
                if (z12) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        rVar.onNext((Object) fm.a.e(this.combiner.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th2) {
                        cm.a.b(th2);
                        this.errors.addThrowable(th2);
                        cancelSources();
                        clear(aVar);
                        rVar.onError(this.errors.terminate());
                        return;
                    }
                }
            }
            clear(aVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0007, B:12:0x0011, B:15:0x001b, B:14:0x0019), top: B:23:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void innerComplete(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.latest     // Catch: java.lang.Throwable -> L25
                if (r0 != 0) goto L7
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                return
            L7:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L25
                r1 = 1
                if (r4 != 0) goto Le
                r4 = r1
                goto Lf
            Le:
                r4 = 0
            Lf:
                if (r4 != 0) goto L19
                int r2 = r3.complete     // Catch: java.lang.Throwable -> L25
                int r2 = r2 + r1
                r3.complete = r2     // Catch: java.lang.Throwable -> L25
                int r0 = r0.length     // Catch: java.lang.Throwable -> L25
                if (r2 != r0) goto L1b
            L19:
                r3.done = r1     // Catch: java.lang.Throwable -> L25
            L1b:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                if (r4 == 0) goto L21
                r3.cancelSources()
            L21:
                r3.drain()
                return
            L25:
                r4 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L25
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerComplete(int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0025 A[Catch: all -> 0x002a, TryCatch #0 {, blocks: (B:7:0x000e, B:9:0x0012, B:11:0x0014, B:16:0x001d, B:19:0x0027, B:18:0x0025), top: B:29:0x000e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void innerError(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L36
                boolean r4 = r2.delayError
                r0 = 1
                if (r4 == 0) goto L2d
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.latest     // Catch: java.lang.Throwable -> L2a
                if (r4 != 0) goto L14
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                return
            L14:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L2a
                if (r3 != 0) goto L1a
                r3 = r0
                goto L1b
            L1a:
                r3 = 0
            L1b:
                if (r3 != 0) goto L25
                int r1 = r2.complete     // Catch: java.lang.Throwable -> L2a
                int r1 = r1 + r0
                r2.complete = r1     // Catch: java.lang.Throwable -> L2a
                int r4 = r4.length     // Catch: java.lang.Throwable -> L2a
                if (r1 != r4) goto L27
            L25:
                r2.done = r0     // Catch: java.lang.Throwable -> L2a
            L27:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                r0 = r3
                goto L2d
            L2a:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2a
                throw r3
            L2d:
                if (r0 == 0) goto L32
                r2.cancelSources()
            L32:
                r2.drain()
                goto L39
            L36:
                tm.a.s(r4)
            L39:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableCombineLatest.LatestCoordinator.innerError(int, java.lang.Throwable):void");
        }

        public void innerNext(int i10, T t10) {
            boolean z10;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i10];
                int i11 = this.active;
                if (obj == null) {
                    i11++;
                    this.active = i11;
                }
                objArr[i10] = t10;
                if (i11 == objArr.length) {
                    this.queue.offer((Object[]) objArr.clone());
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    drain();
                }
            }
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public void subscribe(p<? extends T>[] pVarArr) {
            CombinerObserver<T, R>[] combinerObserverArr = this.observers;
            int length = combinerObserverArr.length;
            this.downstream.onSubscribe(this);
            for (int i10 = 0; i10 < length && !this.done && !this.cancelled; i10++) {
                pVarArr[i10].subscribe(combinerObserverArr[i10]);
            }
        }
    }

    public ObservableCombineLatest(p<? extends T>[] pVarArr, Iterable<? extends p<? extends T>> iterable, o<? super Object[], ? extends R> oVar, int i10, boolean z10) {
        this.f71440b = pVarArr;
        this.f71441c = iterable;
        this.f71442d = oVar;
        this.f71443e = i10;
        this.f71444f = z10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        int length;
        p<? extends T>[] pVarArr = this.f71440b;
        if (pVarArr == null) {
            pVarArr = new k[8];
            length = 0;
            for (p<? extends T> pVar : this.f71441c) {
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
        int i10 = length;
        if (i10 == 0) {
            EmptyDisposable.complete(rVar);
        } else {
            new LatestCoordinator(rVar, this.f71442d, i10, this.f71443e, this.f71444f).subscribe(pVarArr);
        }
    }
}
