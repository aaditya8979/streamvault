package mm;

/* JADX INFO: compiled from: ObservableDoOnLifecycle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a0<T> extends a<T, T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dm.g<? super bm.b> f74328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm.a f74329d;

    public a0(xl.k<T> kVar, dm.g<? super bm.b> gVar, dm.a aVar) {
        super(kVar);
        this.f74328c = gVar;
        this.f74329d = aVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super T> rVar) {
        this.f74327b.subscribe(new hm.g(rVar, this.f74328c, this.f74329d));
    }
}
