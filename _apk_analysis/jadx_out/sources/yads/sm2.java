package yads;

import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class sm2 extends p51 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final sm2 f94878f = new sm2(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f94879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f94880e;

    public sm2(int i10, Object[] objArr) {
        this.f94879d = objArr;
        this.f94880e = i10;
    }

    @Override // yads.p51, yads.j51
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f94879d, 0, objArr, i10, this.f94880e);
        return i10 + this.f94880e;
    }

    @Override // yads.j51
    public final Object[] b() {
        return this.f94879d;
    }

    @Override // yads.j51
    public final int c() {
        return this.f94880e;
    }

    @Override // yads.j51
    public final int d() {
        return 0;
    }

    @Override // yads.j51
    public final boolean e() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ng2.a(i10, this.f94880e);
        Object obj = this.f94879d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f94880e;
    }
}
