package yads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tm2 extends p51 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2 f95280d;

    public tm2(um2 um2Var) {
        this.f95280d = um2Var;
    }

    @Override // yads.j51
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f95280d.f95722g);
        um2 um2Var = this.f95280d;
        int i11 = i10 * 2;
        Object obj = um2Var.f95720e[um2Var.f95721f + i11];
        Objects.requireNonNull(obj);
        um2 um2Var2 = this.f95280d;
        Object obj2 = um2Var2.f95720e[i11 + (um2Var2.f95721f ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f95280d.f95722g;
    }
}
