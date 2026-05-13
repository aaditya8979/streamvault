package mm;

/* JADX INFO: compiled from: ObservableFromUnsafeSource.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n0<T> extends xl.k<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xl.p<T> f74567b;

    public n0(xl.p<T> pVar) {
        this.f74567b = pVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74567b.subscribe(rVar);
    }
}
