package io.reactivex.internal.operators.observable;

import bm.b;
import gm.c;
import gm.h;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import pm.g;
import xl.p;
import xl.r;
import xl.s;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableObserveOn<T> extends mm.a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f71509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f71510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71511e;

    public static final class ObserveOnObserver<T> extends BasicIntQueueDisposable<T> implements r<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        public final int bufferSize;
        public final boolean delayError;
        public volatile boolean disposed;
        public volatile boolean done;
        public final r<? super T> downstream;
        public Throwable error;
        public boolean outputFused;
        public h<T> queue;
        public int sourceMode;
        public b upstream;
        public final s.c worker;

        public ObserveOnObserver(r<? super T> rVar, s.c cVar, boolean z10, int i10) {
            this.downstream = rVar;
            this.worker = cVar;
            this.delayError = z10;
            this.bufferSize = i10;
        }

        public boolean checkTerminated(boolean z10, boolean z11, r<? super T> rVar) {
            if (this.disposed) {
                this.queue.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.error;
            if (this.delayError) {
                if (!z11) {
                    return false;
                }
                this.disposed = true;
                if (th2 != null) {
                    rVar.onError(th2);
                } else {
                    rVar.onComplete();
                }
                this.worker.dispose();
                return true;
            }
            if (th2 != null) {
                this.disposed = true;
                this.queue.clear();
                rVar.onError(th2);
                this.worker.dispose();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.disposed = true;
            rVar.onComplete();
            this.worker.dispose();
            return true;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public void clear() {
            this.queue.clear();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public void dispose() {
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            this.upstream.dispose();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drainFused() {
            int iAddAndGet = 1;
            while (!this.disposed) {
                boolean z10 = this.done;
                Throwable th2 = this.error;
                if (!this.delayError && z10 && th2 != null) {
                    this.disposed = true;
                    this.downstream.onError(this.error);
                    this.worker.dispose();
                    return;
                }
                this.downstream.onNext(null);
                if (z10) {
                    this.disposed = true;
                    Throwable th3 = this.error;
                    if (th3 != null) {
                        this.downstream.onError(th3);
                    } else {
                        this.downstream.onComplete();
                    }
                    this.worker.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void drainNormal() {
            /*
                r7 = this;
                gm.h<T> r0 = r7.queue
                xl.r<? super T> r1 = r7.downstream
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.done
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.checkTerminated(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.done
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.checkTerminated(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                cm.a.b(r3)
                r7.disposed = r2
                bm.b r2 = r7.upstream
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                xl.s$c r0 = r7.worker
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableObserveOn.ObserveOnObserver.drainNormal():void");
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, bm.b
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // xl.r
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            if (this.done) {
                tm.a.s(th2);
                return;
            }
            this.error = th2;
            this.done = true;
            schedule();
        }

        @Override // xl.r
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 2) {
                this.queue.offer(t10);
            }
            schedule();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            if (DisposableHelper.validate(this.upstream, bVar)) {
                this.upstream = bVar;
                if (bVar instanceof c) {
                    c cVar = (c) bVar;
                    int iRequestFusion = cVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.done = true;
                        this.downstream.onSubscribe(this);
                        schedule();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.sourceMode = iRequestFusion;
                        this.queue = cVar;
                        this.downstream.onSubscribe(this);
                        return;
                    }
                }
                this.queue = new om.a(this.bufferSize);
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.h
        public T poll() throws Exception {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.observers.BasicIntQueueDisposable, gm.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.outputFused = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.b(this);
            }
        }
    }

    public ObservableObserveOn(p<T> pVar, s sVar, boolean z10, int i10) {
        super(pVar);
        this.f71509c = sVar;
        this.f71510d = z10;
        this.f71511e = i10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super T> rVar) {
        s sVar = this.f71509c;
        if (sVar instanceof g) {
            this.f74327b.subscribe(rVar);
        } else {
            this.f74327b.subscribe(new ObserveOnObserver(rVar, sVar.a(), this.f71510d, this.f71511e));
        }
    }
}
