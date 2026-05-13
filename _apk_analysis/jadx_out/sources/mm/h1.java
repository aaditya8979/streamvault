package mm;

/* JADX INFO: compiled from: ObservableSerialized.java */
/* JADX INFO: loaded from: classes11.dex */
public final class h1<T> extends a<T, T> {
    public h1(xl.k<T> kVar) {
        super(kVar);
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new sm.e(rVar));
    }
}
