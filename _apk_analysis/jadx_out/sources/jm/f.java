package jm;

import io.reactivex.internal.operators.flowable.FlowableSingle;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.NoSuchElementException;
import xl.t;
import xl.u;

/* JADX INFO: compiled from: FlowableSingleSingle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class f<T> extends t<T> implements gm.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xl.e<T> f72498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f72499b;

    /* JADX INFO: compiled from: FlowableSingleSingle.java */
    public static final class a<T> implements xl.f<T>, bm.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u<? super T> f72500b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f72501c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ms.c f72502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f72503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public T f72504f;

        public a(u<? super T> uVar, T t10) {
            this.f72500b = uVar;
            this.f72501c = t10;
        }

        @Override // bm.b
        public void dispose() {
            this.f72502d.cancel();
            this.f72502d = SubscriptionHelper.CANCELLED;
        }

        @Override // bm.b
        public boolean isDisposed() {
            return this.f72502d == SubscriptionHelper.CANCELLED;
        }

        @Override // ms.b
        public void onComplete() {
            if (this.f72503e) {
                return;
            }
            this.f72503e = true;
            this.f72502d = SubscriptionHelper.CANCELLED;
            T t10 = this.f72504f;
            this.f72504f = null;
            if (t10 == null) {
                t10 = this.f72501c;
            }
            if (t10 != null) {
                this.f72500b.onSuccess(t10);
            } else {
                this.f72500b.onError(new NoSuchElementException());
            }
        }

        @Override // ms.b
        public void onError(Throwable th2) {
            if (this.f72503e) {
                tm.a.s(th2);
                return;
            }
            this.f72503e = true;
            this.f72502d = SubscriptionHelper.CANCELLED;
            this.f72500b.onError(th2);
        }

        @Override // ms.b
        public void onNext(T t10) {
            if (this.f72503e) {
                return;
            }
            if (this.f72504f == null) {
                this.f72504f = t10;
                return;
            }
            this.f72503e = true;
            this.f72502d.cancel();
            this.f72502d = SubscriptionHelper.CANCELLED;
            this.f72500b.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // xl.f, ms.b
        public void onSubscribe(ms.c cVar) {
            if (SubscriptionHelper.validate(this.f72502d, cVar)) {
                this.f72502d = cVar;
                this.f72500b.onSubscribe(this);
                cVar.request(Long.MAX_VALUE);
            }
        }
    }

    public f(xl.e<T> eVar, T t10) {
        this.f72498a = eVar;
        this.f72499b = t10;
    }

    @Override // gm.a
    public xl.e<T> b() {
        return tm.a.m(new FlowableSingle(this.f72498a, this.f72499b, true));
    }

    @Override // xl.t
    public void m(u<? super T> uVar) {
        this.f72498a.m(new a(uVar, this.f72499b));
    }
}
