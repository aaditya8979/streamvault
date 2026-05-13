package hm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.u;

/* JADX INFO: compiled from: ResumeSingleObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n<T> implements u<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<bm.b> f63546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u<? super T> f63547c;

    public n(AtomicReference<bm.b> atomicReference, u<? super T> uVar) {
        this.f63546b = atomicReference;
        this.f63547c = uVar;
    }

    @Override // xl.u
    public void onError(Throwable th2) {
        this.f63547c.onError(th2);
    }

    @Override // xl.u
    public void onSubscribe(bm.b bVar) {
        DisposableHelper.replace(this.f63546b, bVar);
    }

    @Override // xl.u
    public void onSuccess(T t10) {
        this.f63547c.onSuccess(t10);
    }
}
