package io.reactivex.observers;

import gm.c;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import sm.a;
import xl.b;
import xl.h;
import xl.r;
import xl.u;

/* JADX INFO: loaded from: classes8.dex */
public class TestObserver<T> extends a<T, TestObserver<T>> implements r<T>, h<T>, u<T>, b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r<? super T> f71699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<bm.b> f71700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c<T> f71701l;

    public enum EmptyObserver implements r<Object> {
        INSTANCE;

        @Override // xl.r
        public void onComplete() {
        }

        @Override // xl.r
        public void onError(Throwable th2) {
        }

        @Override // xl.r
        public void onNext(Object obj) {
        }

        @Override // xl.r
        public void onSubscribe(bm.b bVar) {
        }
    }

    public TestObserver() {
        this(EmptyObserver.INSTANCE);
    }

    public TestObserver(r<? super T> rVar) {
        this.f71700k = new AtomicReference<>();
        this.f71699j = rVar;
    }

    @Override // bm.b
    public final void dispose() {
        DisposableHelper.dispose(this.f71700k);
    }

    @Override // bm.b
    public final boolean isDisposed() {
        return DisposableHelper.isDisposed(this.f71700k.get());
    }

    @Override // xl.r
    public void onComplete() {
        if (!this.f84429g) {
            this.f84429g = true;
            if (this.f71700k.get() == null) {
                this.f84426d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f84428f = Thread.currentThread();
            this.f84427e++;
            this.f71699j.onComplete();
        } finally {
            this.f84424b.countDown();
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (!this.f84429g) {
            this.f84429g = true;
            if (this.f71700k.get() == null) {
                this.f84426d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            this.f84428f = Thread.currentThread();
            if (th2 == null) {
                this.f84426d.add(new NullPointerException("onError received a null Throwable"));
            } else {
                this.f84426d.add(th2);
            }
            this.f71699j.onError(th2);
        } finally {
            this.f84424b.countDown();
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        if (!this.f84429g) {
            this.f84429g = true;
            if (this.f71700k.get() == null) {
                this.f84426d.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        this.f84428f = Thread.currentThread();
        if (this.f84431i != 2) {
            this.f84425c.add(t10);
            if (t10 == null) {
                this.f84426d.add(new NullPointerException("onNext received a null value"));
            }
            this.f71699j.onNext(t10);
            return;
        }
        while (true) {
            try {
                T tPoll = this.f71701l.poll();
                if (tPoll == null) {
                    return;
                } else {
                    this.f84425c.add(tPoll);
                }
            } catch (Throwable th2) {
                this.f84426d.add(th2);
                this.f71701l.dispose();
                return;
            }
        }
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        this.f84428f = Thread.currentThread();
        if (bVar == null) {
            this.f84426d.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        if (!androidx.compose.animation.core.a.a(this.f71700k, null, bVar)) {
            bVar.dispose();
            if (this.f71700k.get() != DisposableHelper.DISPOSED) {
                this.f84426d.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + bVar));
                return;
            }
            return;
        }
        int i10 = this.f84430h;
        if (i10 != 0 && (bVar instanceof c)) {
            c<T> cVar = (c) bVar;
            this.f71701l = cVar;
            int iRequestFusion = cVar.requestFusion(i10);
            this.f84431i = iRequestFusion;
            if (iRequestFusion == 1) {
                this.f84429g = true;
                this.f84428f = Thread.currentThread();
                while (true) {
                    try {
                        T tPoll = this.f71701l.poll();
                        if (tPoll == null) {
                            this.f84427e++;
                            this.f71700k.lazySet(DisposableHelper.DISPOSED);
                            return;
                        }
                        this.f84425c.add(tPoll);
                    } catch (Throwable th2) {
                        this.f84426d.add(th2);
                        return;
                    }
                }
            }
        }
        this.f71699j.onSubscribe(bVar);
    }

    @Override // xl.h
    public void onSuccess(T t10) {
        onNext(t10);
        onComplete();
    }
}
