package sm;

import xl.r;

/* JADX INFO: compiled from: DefaultObserver.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b<T> implements r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bm.b f84432b;

    public void a() {
    }

    @Override // xl.r
    public final void onSubscribe(bm.b bVar) {
        if (qm.e.d(this.f84432b, bVar, getClass())) {
            this.f84432b = bVar;
            a();
        }
    }
}
