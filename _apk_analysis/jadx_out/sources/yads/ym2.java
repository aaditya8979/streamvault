package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class ym2 extends u51 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f97231i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ym2 f97232j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f97233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f97234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f97235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f97236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f97237h;

    static {
        Object[] objArr = new Object[0];
        f97232j = new ym2(objArr, 0, objArr, 0, 0);
    }

    public ym2(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f97233d = objArr;
        this.f97234e = i10;
        this.f97235f = objArr2;
        this.f97236g = i11;
        this.f97237h = i12;
    }

    @Override // yads.j51
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f97233d, 0, objArr, i10, this.f97237h);
        return i10 + this.f97237h;
    }

    @Override // yads.j51
    public final Object[] b() {
        return this.f97233d;
    }

    @Override // yads.j51
    public final int c() {
        return this.f97237h;
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f97235f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = p01.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f97236g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // yads.j51
    public final int d() {
        return 0;
    }

    @Override // yads.j51
    public final boolean e() {
        return false;
    }

    @Override // yads.u51
    public final p51 f() {
        return p51.b(this.f97237h, this.f97233d);
    }

    @Override // yads.u51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f97234e;
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f97237h;
    }
}
