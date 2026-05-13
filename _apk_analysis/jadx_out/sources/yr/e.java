package yr;

/* JADX INFO: compiled from: RegistryItem.java */
/* JADX INFO: loaded from: classes3.dex */
public class e<K, I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K f98072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f98073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ir.d f98074c;

    public e(K k10) {
        this.f98074c = new ir.d();
        this.f98072a = k10;
    }

    public e(K k10, I i10, int i11) {
        this.f98074c = new ir.d();
        this.f98072a = k10;
        this.f98073b = i10;
        this.f98074c = new ir.d(i11);
    }

    public ir.d a() {
        return this.f98074c;
    }

    public I b() {
        return this.f98073b;
    }

    public K c() {
        return this.f98072a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f98072a.equals(((e) obj).f98072a);
    }

    public int hashCode() {
        return this.f98072a.hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") " + a() + " KEY: " + c() + " ITEM: " + b();
    }
}
