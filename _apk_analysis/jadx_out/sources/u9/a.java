package u9;

import xl.k;
import xl.r;

/* JADX INFO: compiled from: InitialValueObservable.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a<T> extends k<T> {
    public abstract T b();

    public abstract void c(r<? super T> rVar);

    @Override // xl.k
    public final void subscribeActual(r<? super T> rVar) {
        c(rVar);
        rVar.onNext(b());
    }
}
