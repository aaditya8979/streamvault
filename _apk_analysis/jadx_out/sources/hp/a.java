package hp;

import hp.c;

/* JADX INFO: compiled from: FinitePool.java */
/* JADX INFO: loaded from: classes12.dex */
public class a<T extends c<T>> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<T> f63570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public T f63573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f63574e;

    public a(d<T> dVar, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("The pool limit must be > 0");
        }
        this.f63570a = dVar;
        this.f63571b = i10;
        this.f63572c = false;
    }

    @Override // hp.b
    public void a(T t10) {
        if (t10.f()) {
            System.out.print("[FinitePool] Element is already in pool: " + t10);
            return;
        }
        if (this.f63572c || this.f63574e < this.f63571b) {
            this.f63574e++;
            t10.d(this.f63573d);
            t10.e(true);
            this.f63573d = t10;
        }
        this.f63570a.a(t10);
    }

    @Override // hp.b
    public T acquire() {
        T t10 = this.f63573d;
        if (t10 != null) {
            this.f63573d = (T) t10.b();
            this.f63574e--;
        } else {
            t10 = (T) this.f63570a.newInstance();
        }
        if (t10 != null) {
            t10.d(null);
            t10.e(false);
            this.f63570a.b(t10);
        }
        return t10;
    }
}
