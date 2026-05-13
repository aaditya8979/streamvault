package io.reactivex.processors;

import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ms.b;
import ms.c;
import um.a;

/* JADX INFO: loaded from: classes3.dex */
public final class UnicastProcessor<T> extends a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.a<T> f71703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<Runnable> f71704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f71705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f71706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f71707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<b<? super T>> f71708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile boolean f71709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicBoolean f71710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final BasicIntQueueSubscription<T> f71711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicLong f71712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f71713m;

    public final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ms.c
        public void cancel() {
            if (UnicastProcessor.this.f71709i) {
                return;
            }
            UnicastProcessor.this.f71709i = true;
            UnicastProcessor.this.u();
            UnicastProcessor unicastProcessor = UnicastProcessor.this;
            if (unicastProcessor.f71713m || unicastProcessor.f71711k.getAndIncrement() != 0) {
                return;
            }
            UnicastProcessor.this.f71703c.clear();
            UnicastProcessor.this.f71708h.lazySet(null);
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, gm.h
        public void clear() {
            UnicastProcessor.this.f71703c.clear();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, gm.h
        public boolean isEmpty() {
            return UnicastProcessor.this.f71703c.isEmpty();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, gm.h
        public T poll() {
            return UnicastProcessor.this.f71703c.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, ms.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                qm.b.a(UnicastProcessor.this.f71712l, j10);
                UnicastProcessor.this.v();
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, gm.d
        public int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.f71713m = true;
            return 2;
        }
    }

    public UnicastProcessor(int i10) {
        this(i10, null, true);
    }

    public UnicastProcessor(int i10, Runnable runnable, boolean z10) {
        this.f71703c = new om.a<>(fm.a.f(i10, "capacityHint"));
        this.f71704d = new AtomicReference<>(runnable);
        this.f71705e = z10;
        this.f71708h = new AtomicReference<>();
        this.f71710j = new AtomicBoolean();
        this.f71711k = new UnicastQueueSubscription();
        this.f71712l = new AtomicLong();
    }

    public static <T> UnicastProcessor<T> t(int i10) {
        return new UnicastProcessor<>(i10);
    }

    @Override // xl.e
    public void n(b<? super T> bVar) {
        if (this.f71710j.get() || !this.f71710j.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), bVar);
            return;
        }
        bVar.onSubscribe(this.f71711k);
        this.f71708h.set(bVar);
        if (this.f71709i) {
            this.f71708h.lazySet(null);
        } else {
            v();
        }
    }

    @Override // ms.b
    public void onComplete() {
        if (this.f71706f || this.f71709i) {
            return;
        }
        this.f71706f = true;
        u();
        v();
    }

    @Override // ms.b
    public void onError(Throwable th2) {
        fm.a.e(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f71706f || this.f71709i) {
            tm.a.s(th2);
            return;
        }
        this.f71707g = th2;
        this.f71706f = true;
        u();
        v();
    }

    @Override // ms.b
    public void onNext(T t10) {
        fm.a.e(t10, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f71706f || this.f71709i) {
            return;
        }
        this.f71703c.offer(t10);
        v();
    }

    @Override // ms.b
    public void onSubscribe(c cVar) {
        if (this.f71706f || this.f71709i) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    public boolean s(boolean z10, boolean z11, boolean z12, b<? super T> bVar, om.a<T> aVar) {
        if (this.f71709i) {
            aVar.clear();
            this.f71708h.lazySet(null);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (z10 && this.f71707g != null) {
            aVar.clear();
            this.f71708h.lazySet(null);
            bVar.onError(this.f71707g);
            return true;
        }
        if (!z12) {
            return false;
        }
        Throwable th2 = this.f71707g;
        this.f71708h.lazySet(null);
        if (th2 != null) {
            bVar.onError(th2);
        } else {
            bVar.onComplete();
        }
        return true;
    }

    public void u() {
        Runnable andSet = this.f71704d.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    public void v() {
        if (this.f71711k.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        b<? super T> bVar = this.f71708h.get();
        while (bVar == null) {
            iAddAndGet = this.f71711k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                bVar = this.f71708h.get();
            }
        }
        if (this.f71713m) {
            w(bVar);
        } else {
            x(bVar);
        }
    }

    public void w(b<? super T> bVar) {
        om.a<T> aVar = this.f71703c;
        int iAddAndGet = 1;
        boolean z10 = !this.f71705e;
        while (!this.f71709i) {
            boolean z11 = this.f71706f;
            if (z10 && z11 && this.f71707g != null) {
                aVar.clear();
                this.f71708h.lazySet(null);
                bVar.onError(this.f71707g);
                return;
            }
            bVar.onNext(null);
            if (z11) {
                this.f71708h.lazySet(null);
                Throwable th2 = this.f71707g;
                if (th2 != null) {
                    bVar.onError(th2);
                    return;
                } else {
                    bVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f71711k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        aVar.clear();
        this.f71708h.lazySet(null);
    }

    public void x(b<? super T> bVar) {
        long j10;
        om.a<T> aVar = this.f71703c;
        boolean z10 = true;
        boolean z11 = !this.f71705e;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f71712l.get();
            long j12 = 0;
            while (true) {
                if (j11 == j12) {
                    j10 = j12;
                    break;
                }
                boolean z12 = this.f71706f;
                T tPoll = aVar.poll();
                boolean z13 = tPoll == null ? z10 : false;
                j10 = j12;
                if (s(z11, z12, z13, bVar, aVar)) {
                    return;
                }
                if (z13) {
                    break;
                }
                bVar.onNext(tPoll);
                j12 = 1 + j10;
                z10 = true;
            }
            if (j11 == j12 && s(z11, this.f71706f, aVar.isEmpty(), bVar, aVar)) {
                return;
            }
            if (j10 != 0 && j11 != Long.MAX_VALUE) {
                this.f71712l.addAndGet(-j10);
            }
            iAddAndGet = this.f71711k.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z10 = true;
            }
        }
    }
}
