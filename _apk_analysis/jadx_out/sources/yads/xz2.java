package yads;

import com.ironsource.C3978d4;

/* JADX INFO: loaded from: classes2.dex */
public final class xz2 extends u51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f96944d;

    public xz2(Object obj) {
        this.f96944d = ng2.a(obj);
    }

    @Override // yads.j51
    public final int a(int i10, Object[] objArr) {
        objArr[i10] = this.f96944d;
        return i10 + 1;
    }

    @Override // yads.u51, yads.j51
    public final p51 a() {
        return p51.a(this.f96944d);
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f96944d.equals(obj);
    }

    @Override // yads.j51
    public final boolean e() {
        return false;
    }

    @Override // yads.u51, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f96944d.hashCode();
    }

    @Override // yads.j51, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final ja3 iterator() {
        return new xd1(this.f96944d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C3978d4.j.f31383d + this.f96944d.toString() + ']';
    }
}
