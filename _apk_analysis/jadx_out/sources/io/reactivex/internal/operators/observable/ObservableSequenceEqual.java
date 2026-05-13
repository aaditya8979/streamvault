package io.reactivex.internal.operators.observable;

import bm.b;
import dm.d;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;

/* JADX INFO: loaded from: classes9.dex */
public final class ObservableSequenceEqual<T> extends k<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T> f71569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<? extends T> f71570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d<? super T, ? super T> f71571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f71572e;

    public static final class EqualCoordinator<T> extends AtomicInteger implements b {
        private static final long serialVersionUID = -6178010334400373240L;
        public volatile boolean cancelled;
        public final d<? super T, ? super T> comparer;
        public final r<? super Boolean> downstream;
        public final p<? extends T> first;
        public final a<T>[] observers;
        public final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
        public final p<? extends T> second;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public T f71573v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        public T f71574v2;

        public EqualCoordinator(r<? super Boolean> rVar, int i10, p<? extends T> pVar, p<? extends T> pVar2, d<? super T, ? super T> dVar) {
            this.downstream = rVar;
            this.first = pVar;
            this.second = pVar2;
            this.comparer = dVar;
            this.observers = new a[]{new a<>(this, 0, i10), new a<>(this, 1, i10)};
        }

        public void cancel(om.a<T> aVar, om.a<T> aVar2) {
            this.cancelled = true;
            aVar.clear();
            aVar2.clear();
        }

        @Override // bm.b
        public void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.resources.dispose();
            if (getAndIncrement() == 0) {
                a<T>[] aVarArr = this.observers;
                aVarArr[0].f71576c.clear();
                aVarArr[1].f71576c.clear();
            }
        }

        public void drain() {
            Throwable th2;
            Throwable th3;
            if (getAndIncrement() != 0) {
                return;
            }
            a<T>[] aVarArr = this.observers;
            a<T> aVar = aVarArr[0];
            om.a<T> aVar2 = aVar.f71576c;
            a<T> aVar3 = aVarArr[1];
            om.a<T> aVar4 = aVar3.f71576c;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = aVar.f71578e;
                if (z10 && (th3 = aVar.f71579f) != null) {
                    cancel(aVar2, aVar4);
                    this.downstream.onError(th3);
                    return;
                }
                boolean z11 = aVar3.f71578e;
                if (z11 && (th2 = aVar3.f71579f) != null) {
                    cancel(aVar2, aVar4);
                    this.downstream.onError(th2);
                    return;
                }
                if (this.f71573v1 == null) {
                    this.f71573v1 = aVar2.poll();
                }
                boolean z12 = this.f71573v1 == null;
                if (this.f71574v2 == null) {
                    this.f71574v2 = aVar4.poll();
                }
                T t10 = this.f71574v2;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.downstream.onNext(Boolean.TRUE);
                    this.downstream.onComplete();
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    cancel(aVar2, aVar4);
                    this.downstream.onNext(Boolean.FALSE);
                    this.downstream.onComplete();
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.comparer.test(this.f71573v1, t10)) {
                            cancel(aVar2, aVar4);
                            this.downstream.onNext(Boolean.FALSE);
                            this.downstream.onComplete();
                            return;
                        }
                        this.f71573v1 = null;
                        this.f71574v2 = null;
                    } catch (Throwable th4) {
                        cm.a.b(th4);
                        cancel(aVar2, aVar4);
                        this.downstream.onError(th4);
                        return;
                    }
                }
                if (z12 || z13) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            aVar2.clear();
            aVar4.clear();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.cancelled;
        }

        public boolean setDisposable(b bVar, int i10) {
            return this.resources.setResource(i10, bVar);
        }

        public void subscribe() {
            a<T>[] aVarArr = this.observers;
            this.first.subscribe(aVarArr[0]);
            this.second.subscribe(aVarArr[1]);
        }
    }

    public static final class a<T> implements r<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EqualCoordinator<T> f71575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final om.a<T> f71576c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f71577d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f71578e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f71579f;

        public a(EqualCoordinator<T> equalCoordinator, int i10, int i11) {
            this.f71575b = equalCoordinator;
            this.f71577d = i10;
            this.f71576c = new om.a<>(i11);
        }

        @Override // xl.r
        public void onComplete() {
            this.f71578e = true;
            this.f71575b.drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71579f = th2;
            this.f71578e = true;
            this.f71575b.drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f71576c.offer(t10);
            this.f71575b.drain();
        }

        @Override // xl.r
        public void onSubscribe(b bVar) {
            this.f71575b.setDisposable(bVar, this.f71577d);
        }
    }

    public ObservableSequenceEqual(p<? extends T> pVar, p<? extends T> pVar2, d<? super T, ? super T> dVar, int i10) {
        this.f71569b = pVar;
        this.f71570c = pVar2;
        this.f71571d = dVar;
        this.f71572e = i10;
    }

    @Override // xl.k
    public void subscribeActual(r<? super Boolean> rVar) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(rVar, this.f71572e, this.f71569b, this.f71570c, this.f71571d);
        rVar.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }
}
