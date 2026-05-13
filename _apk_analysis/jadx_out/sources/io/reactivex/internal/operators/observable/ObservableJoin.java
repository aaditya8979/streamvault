package io.reactivex.internal.operators.observable;

import bm.b;
import dm.c;
import dm.o;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableJoin<TLeft, TRight, TLeftEnd, TRightEnd, R> extends mm.a<TLeft, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<? extends TRight> f71502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o<? super TLeft, ? extends p<TLeftEnd>> f71503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o<? super TRight, ? extends p<TRightEnd>> f71504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c<? super TLeft, ? super TRight, ? extends R> f71505f;

    public static final class JoinDisposable<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements b, ObservableGroupJoin.a {
        private static final long serialVersionUID = -6071216598687999801L;
        public volatile boolean cancelled;
        public final r<? super R> downstream;
        public final o<? super TLeft, ? extends p<TLeftEnd>> leftEnd;
        public int leftIndex;
        public final c<? super TLeft, ? super TRight, ? extends R> resultSelector;
        public final o<? super TRight, ? extends p<TRightEnd>> rightEnd;
        public int rightIndex;
        public static final Integer LEFT_VALUE = 1;
        public static final Integer RIGHT_VALUE = 2;
        public static final Integer LEFT_CLOSE = 3;
        public static final Integer RIGHT_CLOSE = 4;
        public final bm.a disposables = new bm.a();
        public final om.a<Object> queue = new om.a<>(k.bufferSize());
        public final Map<Integer, TLeft> lefts = new LinkedHashMap();
        public final Map<Integer, TRight> rights = new LinkedHashMap();
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public final AtomicInteger active = new AtomicInteger(2);

        public JoinDisposable(r<? super R> rVar, o<? super TLeft, ? extends p<TLeftEnd>> oVar, o<? super TRight, ? extends p<TRightEnd>> oVar2, c<? super TLeft, ? super TRight, ? extends R> cVar) {
            this.downstream = rVar;
            this.leftEnd = oVar;
            this.rightEnd = oVar2;
            this.resultSelector = cVar;
        }

        public void cancelAll() {
            this.disposables.dispose();
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            om.a<?> aVar = this.queue;
            r<? super R> rVar = this.downstream;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                if (this.error.get() != null) {
                    aVar.clear();
                    cancelAll();
                    errorAll(rVar);
                    return;
                }
                boolean z10 = this.active.get() == 0;
                Integer num = (Integer) aVar.poll();
                boolean z11 = num == null;
                if (z10 && z11) {
                    this.lefts.clear();
                    this.rights.clear();
                    this.disposables.dispose();
                    rVar.onComplete();
                    return;
                }
                if (z11) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = aVar.poll();
                    if (num == LEFT_VALUE) {
                        int i10 = this.leftIndex;
                        this.leftIndex = i10 + 1;
                        this.lefts.put(Integer.valueOf(i10), (TLeft) objPoll);
                        try {
                            p pVar = (p) fm.a.e(this.leftEnd.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver = new ObservableGroupJoin.LeftRightEndObserver(this, true, i10);
                            this.disposables.a(leftRightEndObserver);
                            pVar.subscribe(leftRightEndObserver);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(rVar);
                                return;
                            } else {
                                Iterator<TRight> it = this.rights.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        rVar.onNext((Object) fm.a.e(this.resultSelector.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th2) {
                                        fail(th2, rVar, aVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            fail(th3, rVar, aVar);
                            return;
                        }
                    } else if (num == RIGHT_VALUE) {
                        int i11 = this.rightIndex;
                        this.rightIndex = i11 + 1;
                        this.rights.put(Integer.valueOf(i11), (TRight) objPoll);
                        try {
                            p pVar2 = (p) fm.a.e(this.rightEnd.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver2 = new ObservableGroupJoin.LeftRightEndObserver(this, false, i11);
                            this.disposables.a(leftRightEndObserver2);
                            pVar2.subscribe(leftRightEndObserver2);
                            if (this.error.get() != null) {
                                aVar.clear();
                                cancelAll();
                                errorAll(rVar);
                                return;
                            } else {
                                Iterator<TLeft> it2 = this.lefts.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        rVar.onNext((Object) fm.a.e(this.resultSelector.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                    } catch (Throwable th4) {
                                        fail(th4, rVar, aVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th5) {
                            fail(th5, rVar, aVar);
                            return;
                        }
                    } else if (num == LEFT_CLOSE) {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver3 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.lefts.remove(Integer.valueOf(leftRightEndObserver3.index));
                        this.disposables.b(leftRightEndObserver3);
                    } else {
                        ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver4 = (ObservableGroupJoin.LeftRightEndObserver) objPoll;
                        this.rights.remove(Integer.valueOf(leftRightEndObserver4.index));
                        this.disposables.b(leftRightEndObserver4);
                    }
                }
            }
            aVar.clear();
        }

        public void errorAll(r<?> rVar) {
            Throwable thB = ExceptionHelper.b(this.error);
            this.lefts.clear();
            this.rights.clear();
            rVar.onError(thB);
        }

        public void fail(Throwable th2, r<?> rVar, om.a<?> aVar) {
            cm.a.b(th2);
            ExceptionHelper.a(this.error, th2);
            aVar.clear();
            cancelAll();
            errorAll(rVar);
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerClose(boolean z10, ObservableGroupJoin.LeftRightEndObserver leftRightEndObserver) {
            synchronized (this) {
                this.queue.l(z10 ? LEFT_CLOSE : RIGHT_CLOSE, leftRightEndObserver);
            }
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerCloseError(Throwable th2) {
            if (ExceptionHelper.a(this.error, th2)) {
                drain();
            } else {
                tm.a.s(th2);
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerComplete(ObservableGroupJoin.LeftRightObserver leftRightObserver) {
            this.disposables.delete(leftRightObserver);
            this.active.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerError(Throwable th2) {
            if (!ExceptionHelper.a(this.error, th2)) {
                tm.a.s(th2);
            } else {
                this.active.decrementAndGet();
                drain();
            }
        }

        @Override // io.reactivex.internal.operators.observable.ObservableGroupJoin.a
        public void innerValue(boolean z10, Object obj) {
            synchronized (this) {
                this.queue.l(z10 ? LEFT_VALUE : RIGHT_VALUE, obj);
            }
            drain();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }
    }

    public ObservableJoin(p<TLeft> pVar, p<? extends TRight> pVar2, o<? super TLeft, ? extends p<TLeftEnd>> oVar, o<? super TRight, ? extends p<TRightEnd>> oVar2, c<? super TLeft, ? super TRight, ? extends R> cVar) {
        super(pVar);
        this.f71502c = pVar2;
        this.f71503d = oVar;
        this.f71504e = oVar2;
        this.f71505f = cVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // xl.k
    public void subscribeActual(r<? super R> rVar) {
        JoinDisposable joinDisposable = new JoinDisposable(rVar, this.f71503d, this.f71504e, this.f71505f);
        rVar.onSubscribe(joinDisposable);
        ObservableGroupJoin.LeftRightObserver leftRightObserver = new ObservableGroupJoin.LeftRightObserver(joinDisposable, true);
        joinDisposable.disposables.a(leftRightObserver);
        ObservableGroupJoin.LeftRightObserver leftRightObserver2 = new ObservableGroupJoin.LeftRightObserver(joinDisposable, false);
        joinDisposable.disposables.a(leftRightObserver2);
        this.f74327b.subscribe(leftRightObserver);
        this.f71502c.subscribe(leftRightObserver2);
    }
}
