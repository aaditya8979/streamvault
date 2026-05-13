package mm;

/* JADX INFO: compiled from: ObservableLift.java */
/* JADX INFO: loaded from: classes10.dex */
public final class v0<R, T> extends a<T, R> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xl.o<? extends R, ? super T> f74707c;

    public v0(xl.p<T> pVar, xl.o<? extends R, ? super T> oVar) {
        super(pVar);
        this.f74707c = oVar;
    }

    @Override // xl.k
    public void subscribeActual(xl.r<? super R> rVar) {
        try {
            this.f74327b.subscribe((xl.r) fm.a.e(this.f74707c.a(rVar), "Operator " + this.f74707c + " returned a null Observer"));
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            cm.a.b(th2);
            tm.a.s(th2);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }
}
