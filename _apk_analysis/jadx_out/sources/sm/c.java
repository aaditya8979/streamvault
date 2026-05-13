package sm;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import xl.r;

/* JADX INFO: compiled from: DisposableObserver.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> implements r<T>, bm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<bm.b> f84433b = new AtomicReference<>();

    public void a() {
    }

    @Override // bm.b
    public final void dispose() {
        DisposableHelper.dispose(this.f84433b);
    }

    @Override // bm.b
    public final boolean isDisposed() {
        return this.f84433b.get() == DisposableHelper.DISPOSED;
    }

    @Override // xl.r
    public final void onSubscribe(bm.b bVar) {
        if (qm.e.c(this.f84433b, bVar, getClass())) {
            a();
        }
    }
}
