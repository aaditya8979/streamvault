package hm;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import xl.u;

/* JADX INFO: compiled from: BlockingMultiObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f<T> extends CountDownLatch implements u<T>, xl.b, xl.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f63529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Throwable f63530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bm.b f63531d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f63532e;

    public f() {
        super(1);
    }

    public T a() {
        if (getCount() != 0) {
            try {
                qm.c.b();
                await();
            } catch (InterruptedException e10) {
                b();
                throw ExceptionHelper.d(e10);
            }
        }
        Throwable th2 = this.f63530c;
        if (th2 == null) {
            return this.f63529b;
        }
        throw ExceptionHelper.d(th2);
    }

    public void b() {
        this.f63532e = true;
        bm.b bVar = this.f63531d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // xl.b, xl.h
    public void onComplete() {
        countDown();
    }

    @Override // xl.u
    public void onError(Throwable th2) {
        this.f63530c = th2;
        countDown();
    }

    @Override // xl.u
    public void onSubscribe(bm.b bVar) {
        this.f63531d = bVar;
        if (this.f63532e) {
            bVar.dispose();
        }
    }

    @Override // xl.u
    public void onSuccess(T t10) {
        this.f63529b = t10;
        countDown();
    }
}
