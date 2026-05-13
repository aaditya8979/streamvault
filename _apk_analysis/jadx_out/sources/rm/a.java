package rm;

import dm.g;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import xl.k;

/* JADX INFO: compiled from: ConnectableObservable.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a<T> extends k<T> {
    public abstract void b(g<? super bm.b> gVar);

    public k<T> c() {
        return tm.a.o(new ObservableRefCount(this));
    }
}
