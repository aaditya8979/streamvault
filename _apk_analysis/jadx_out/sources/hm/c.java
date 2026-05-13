package hm;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import xl.r;

/* JADX INFO: compiled from: BlockingBaseObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class c<T> extends CountDownLatch implements r<T>, bm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f63525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f63526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bm.b f63527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f63528e;

    public c() {
        super(1);
    }

    public final T a() {
        if (getCount() != 0) {
            try {
                qm.c.b();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.d(e10);
            }
        }
        Throwable th2 = this.f63526c;
        if (th2 == null) {
            return this.f63525b;
        }
        throw ExceptionHelper.d(th2);
    }

    @Override // bm.b
    public final void dispose() {
        this.f63528e = true;
        bm.b bVar = this.f63527d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // bm.b
    public final boolean isDisposed() {
        return this.f63528e;
    }

    @Override // xl.r
    public final void onComplete() {
        countDown();
    }

    @Override // xl.r
    public final void onSubscribe(bm.b bVar) {
        this.f63527d = bVar;
        if (this.f63528e) {
            bVar.dispose();
        }
    }
}
