package io.reactivex.internal.operators.flowable;

import dm.g;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import jm.a;
import ms.b;
import ms.c;
import xl.e;
import xl.f;

/* JADX INFO: loaded from: classes3.dex */
public final class FlowableOnBackpressureDrop<T> extends a<T, T> implements g<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<? super T> f71374d;

    public static final class BackpressureDropSubscriber<T> extends AtomicLong implements f<T>, c {
        private static final long serialVersionUID = -6246093802440953054L;
        public boolean done;
        public final b<? super T> downstream;
        public final g<? super T> onDrop;
        public c upstream;

        public BackpressureDropSubscriber(b<? super T> bVar, g<? super T> gVar) {
            this.downstream = bVar;
            this.onDrop = gVar;
        }

        @Override // ms.c
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // ms.b
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
        }

        @Override // ms.b
        public void onError(Throwable th2) {
            if (this.done) {
                tm.a.s(th2);
            } else {
                this.done = true;
                this.downstream.onError(th2);
            }
        }

        @Override // ms.b
        public void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t10);
                qm.b.c(this, 1L);
                return;
            }
            try {
                this.onDrop.accept(t10);
            } catch (Throwable th2) {
                cm.a.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // xl.f, ms.b
        public void onSubscribe(c cVar) {
            if (SubscriptionHelper.validate(this.upstream, cVar)) {
                this.upstream = cVar;
                this.downstream.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }

        @Override // ms.c
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                qm.b.a(this, j10);
            }
        }
    }

    public FlowableOnBackpressureDrop(e<T> eVar) {
        super(eVar);
        this.f71374d = this;
    }

    @Override // dm.g
    public void accept(T t10) {
    }

    @Override // xl.e
    public void n(b<? super T> bVar) {
        this.f72490c.m(new BackpressureDropSubscriber(bVar, this.f71374d));
    }
}
