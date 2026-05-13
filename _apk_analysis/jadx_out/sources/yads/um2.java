package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class um2 extends u51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient s51 f95719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient Object[] f95720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f95721f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f95722g;

    public um2(s51 s51Var, Object[] objArr, int i10) {
        this.f95719d = s51Var;
        this.f95720e = objArr;
        this.f95722g = i10;
    }

    @Override // yads.j51
    public final int a(int i10, Object[] objArr) {
        return a().a(i10, objArr);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.f95719d.get(key));
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // yads.u51
    public final p51 f() {
        return new tm2(this);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return a().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f95722g;
    }
}
