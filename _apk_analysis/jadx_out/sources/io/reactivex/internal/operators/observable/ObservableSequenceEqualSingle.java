package io.reactivex.internal.operators.observable;

import dm.d;
import gm.b;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import xl.k;
import xl.p;
import xl.r;
import xl.t;
import xl.u;

/* JADX INFO: loaded from: classes10.dex */
public final class ObservableSequenceEqualSingle<T> extends t<Boolean> implements b<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p<? extends T> f71580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p<? extends T> f71581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d<? super T, ? super T> f71582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f71583d;

    public static final class EqualCoordinator<T> extends AtomicInteger implements bm.b {
        private static final long serialVersionUID = -6178010334400373240L;
        public volatile boolean cancelled;
        public final d<? super T, ? super T> comparer;
        public final u<? super Boolean> downstream;
        public final p<? extends T> first;
        public final a<T>[] observers;
        public final ArrayCompositeDisposable resources = new ArrayCompositeDisposable(2);
        public final p<? extends T> second;

        /* JADX INFO: renamed from: v1, reason: collision with root package name */
        public T f71584v1;

        /* JADX INFO: renamed from: v2, reason: collision with root package name */
        public T f71585v2;

        public EqualCoordinator(u<? super Boolean> uVar, int i10, p<? extends T> pVar, p<? extends T> pVar2, d<? super T, ? super T> dVar) {
            this.downstream = uVar;
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
                aVarArr[0].f71587c.clear();
                aVarArr[1].f71587c.clear();
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
            om.a<T> aVar2 = aVar.f71587c;
            a<T> aVar3 = aVarArr[1];
            om.a<T> aVar4 = aVar3.f71587c;
            int iAddAndGet = 1;
            while (!this.cancelled) {
                boolean z10 = aVar.f71589e;
                if (z10 && (th3 = aVar.f71590f) != null) {
                    cancel(aVar2, aVar4);
                    this.downstream.onError(th3);
                    return;
                }
                boolean z11 = aVar3.f71589e;
                if (z11 && (th2 = aVar3.f71590f) != null) {
                    cancel(aVar2, aVar4);
                    this.downstream.onError(th2);
                    return;
                }
                if (this.f71584v1 == null) {
                    this.f71584v1 = aVar2.poll();
                }
                boolean z12 = this.f71584v1 == null;
                if (this.f71585v2 == null) {
                    this.f71585v2 = aVar4.poll();
                }
                T t10 = this.f71585v2;
                boolean z13 = t10 == null;
                if (z10 && z11 && z12 && z13) {
                    this.downstream.onSuccess(Boolean.TRUE);
                    return;
                }
                if (z10 && z11 && z12 != z13) {
                    cancel(aVar2, aVar4);
                    this.downstream.onSuccess(Boolean.FALSE);
                    return;
                }
                if (!z12 && !z13) {
                    try {
                        if (!this.comparer.test(this.f71584v1, t10)) {
                            cancel(aVar2, aVar4);
                            this.downstream.onSuccess(Boolean.FALSE);
                            return;
                        } else {
                            this.f71584v1 = null;
                            this.f71585v2 = null;
                        }
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

        public boolean setDisposable(bm.b bVar, int i10) {
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
        public final EqualCoordinator<T> f71586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final om.a<T> f71587c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f71588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f71589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Throwable f71590f;

        public a(EqualCoordinator<T> equalCoordinator, int i10, int i11) {
            this.f71586b = equalCoordinator;
            this.f71588d = i10;
            this.f71587c = new om.a<>(i11);
        }

        @Override // xl.r
        public void onComplete() {
            this.f71589e = true;
            this.f71586b.drain();
        }

        @Override // xl.r
        public void onError(Throwable th2) {
            this.f71590f = th2;
            this.f71589e = true;
            this.f71586b.drain();
        }

        @Override // xl.r
        public void onNext(T t10) {
            this.f71587c.offer(t10);
            this.f71586b.drain();
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
            this.f71586b.setDisposable(bVar, this.f71588d);
        }
    }

    public ObservableSequenceEqualSingle(p<? extends T> pVar, p<? extends T> pVar2, d<? super T, ? super T> dVar, int i10) {
        this.f71580a = pVar;
        this.f71581b = pVar2;
        this.f71582c = dVar;
        this.f71583d = i10;
    }

    @Override // gm.b
    public k<Boolean> a() {
        return tm.a.o(new ObservableSequenceEqual(this.f71580a, this.f71581b, this.f71582c, this.f71583d));
    }

    @Override // xl.t
    public void m(u<? super Boolean> uVar) {
        EqualCoordinator equalCoordinator = new EqualCoordinator(uVar, this.f71583d, this.f71580a, this.f71581b, this.f71582c);
        uVar.onSubscribe(equalCoordinator);
        equalCoordinator.subscribe();
    }
}
