package wa;

/* JADX INFO: compiled from: ObjectPools.java */
/* JADX INFO: loaded from: classes10.dex */
public class b<T> extends a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f86355b = new Object();

    @Override // wa.a
    public T a() {
        T t10;
        synchronized (this.f86355b) {
            t10 = (T) super.a();
        }
        return t10;
    }

    @Override // wa.a
    public void b() {
        synchronized (this.f86355b) {
            super.b();
        }
    }

    @Override // wa.a
    public boolean d(T t10) {
        boolean zD;
        synchronized (this.f86355b) {
            zD = super.d(t10);
        }
        return zD;
    }
}
