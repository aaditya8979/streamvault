package hm;

import io.reactivex.internal.disposables.DisposableHelper;
import xl.r;

/* JADX INFO: compiled from: BasicFuseableObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a<T, R> implements r<T>, gm.c<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r<? super R> f63520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bm.b f63521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public gm.c<T> f63522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f63523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f63524f;

    public a(r<? super R> rVar) {
        this.f63520b = rVar;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th2) {
        cm.a.b(th2);
        this.f63521c.dispose();
        onError(th2);
    }

    @Override // gm.h
    public void clear() {
        this.f63522d.clear();
    }

    public final int d(int i10) {
        gm.c<T> cVar = this.f63522d;
        if (cVar == null || (i10 & 4) != 0) {
            return 0;
        }
        int iRequestFusion = cVar.requestFusion(i10);
        if (iRequestFusion != 0) {
            this.f63524f = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // bm.b
    public void dispose() {
        this.f63521c.dispose();
    }

    @Override // bm.b
    public boolean isDisposed() {
        return this.f63521c.isDisposed();
    }

    @Override // gm.h
    public boolean isEmpty() {
        return this.f63522d.isEmpty();
    }

    @Override // gm.h
    public final boolean offer(R r10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // xl.r
    public void onComplete() {
        if (this.f63523e) {
            return;
        }
        this.f63523e = true;
        this.f63520b.onComplete();
    }

    @Override // xl.r
    public void onError(Throwable th2) {
        if (this.f63523e) {
            tm.a.s(th2);
        } else {
            this.f63523e = true;
            this.f63520b.onError(th2);
        }
    }

    @Override // xl.r
    public final void onSubscribe(bm.b bVar) {
        if (DisposableHelper.validate(this.f63521c, bVar)) {
            this.f63521c = bVar;
            if (bVar instanceof gm.c) {
                this.f63522d = (gm.c) bVar;
            }
            if (b()) {
                this.f63520b.onSubscribe(this);
                a();
            }
        }
    }
}
