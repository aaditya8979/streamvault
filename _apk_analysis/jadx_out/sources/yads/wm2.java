package yads;

import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class wm2 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f96453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f96454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f96455f;

    public wm2(Object[] objArr, int i10, int i11) {
        this.f96453d = objArr;
        this.f96454e = i10;
        this.f96455f = i11;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f96455f);
        Object obj = this.f96453d[(i10 * 2) + this.f96454e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f96455f;
    }
}
