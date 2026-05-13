package hm;

import xl.r;

/* JADX INFO: compiled from: QueueDrainObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class j<T, U, V> extends l implements r<T>, qm.h<U, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r<? super V> f63540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gm.g<U> f63541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f63542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f63543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Throwable f63544g;

    public j(r<? super V> rVar, gm.g<U> gVar) {
        this.f63540c = rVar;
        this.f63541d = gVar;
    }

    @Override // qm.h
    public final Throwable a() {
        return this.f63544g;
    }

    @Override // qm.h
    public void b(r<? super V> rVar, U u10) {
    }

    @Override // qm.h
    public final int c(int i10) {
        return this.f63545b.addAndGet(i10);
    }

    @Override // qm.h
    public final boolean d() {
        return this.f63543f;
    }

    @Override // qm.h
    public final boolean f() {
        return this.f63542e;
    }

    public final boolean g() {
        return this.f63545b.getAndIncrement() == 0;
    }

    public final boolean h() {
        return this.f63545b.get() == 0 && this.f63545b.compareAndSet(0, 1);
    }

    public final void i(U u10, boolean z10, bm.b bVar) {
        r<? super V> rVar = this.f63540c;
        gm.g<U> gVar = this.f63541d;
        if (this.f63545b.get() == 0 && this.f63545b.compareAndSet(0, 1)) {
            b(rVar, u10);
            if (c(-1) == 0) {
                return;
            }
        } else {
            gVar.offer(u10);
            if (!g()) {
                return;
            }
        }
        qm.k.c(gVar, rVar, z10, bVar, this);
    }

    public final void j(U u10, boolean z10, bm.b bVar) {
        r<? super V> rVar = this.f63540c;
        gm.g<U> gVar = this.f63541d;
        if (this.f63545b.get() != 0 || !this.f63545b.compareAndSet(0, 1)) {
            gVar.offer(u10);
            if (!g()) {
                return;
            }
        } else if (gVar.isEmpty()) {
            b(rVar, u10);
            if (c(-1) == 0) {
                return;
            }
        } else {
            gVar.offer(u10);
        }
        qm.k.c(gVar, rVar, z10, bVar, this);
    }
}
