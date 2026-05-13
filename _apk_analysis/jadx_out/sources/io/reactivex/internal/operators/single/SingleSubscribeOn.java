package io.reactivex.internal.operators.single;

import bm.b;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import xl.s;
import xl.t;
import xl.u;
import xl.v;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleSubscribeOn<T> extends t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<? extends T> f71672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f71673b;

    public static final class SubscribeOnObserver<T> extends AtomicReference<b> implements u<T>, b, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;
        public final u<? super T> downstream;
        public final v<? extends T> source;
        public final SequentialDisposable task = new SequentialDisposable();

        public SubscribeOnObserver(u<? super T> uVar, v<? extends T> vVar) {
            this.downstream = uVar;
            this.source = vVar;
        }

        @Override // bm.b
        public void dispose() {
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        @Override // bm.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // xl.u
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // xl.u
        public void onSubscribe(b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // xl.u
        public void onSuccess(T t10) {
            this.downstream.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.source.c(this);
        }
    }

    public SingleSubscribeOn(v<? extends T> vVar, s sVar) {
        this.f71672a = vVar;
        this.f71673b = sVar;
    }

    @Override // xl.t
    public void m(u<? super T> uVar) {
        SubscribeOnObserver subscribeOnObserver = new SubscribeOnObserver(uVar, this.f71672a);
        uVar.onSubscribe(subscribeOnObserver);
        subscribeOnObserver.task.replace(this.f71673b.c(subscribeOnObserver));
    }
}
