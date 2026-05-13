package hm;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import xl.r;

/* JADX INFO: compiled from: DisposableLambdaObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g<T> implements r<T>, bm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super T> f63533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.g<? super bm.b> f63534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.a f63535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bm.b f63536e;

    public g(r<? super T> rVar, dm.g<? super bm.b> gVar, dm.a aVar) {
        this.f63533b = rVar;
        this.f63534c = gVar;
        this.f63535d = aVar;
    }

    @Override // bm.b
    public void dispose() {
        try {
            this.f63535d.run();
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
        }
        this.f63536e.dispose();
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f63536e.isDisposed();
    }

    @Override // xl.r
    public void onComplete() {
        if (this.f63536e != DisposableHelper.DISPOSED) {
            this.f63533b.onComplete();
        }
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.f63536e != DisposableHelper.DISPOSED) {
            this.f63533b.onError(th2);
        } else {
            tm.a.s(th2);
        }
    }

    @Override // xl.r
    public void onNext(T t10) {
        this.f63533b.onNext(t10);
    }

    @Override // xl.r
    public void onSubscribe(bm.b bVar) {
        try {
            this.f63534c.accept(bVar);
            if (DisposableHelper.validate(this.f63536e, bVar)) {
                this.f63536e = bVar;
                this.f63533b.onSubscribe(this);
            }
        } catch (Throwable th2) {
            cm.a.b(th2);
            bVar.dispose();
            this.f63536e = DisposableHelper.DISPOSED;
            EmptyDisposable.error(th2, this.f63533b);
        }
    }
}
