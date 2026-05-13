package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h51 extends i51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f90251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90253c;

    public h51() {
        kx.a(4, "initialCapacity");
        this.f90251a = new Object[4];
        this.f90252b = 0;
    }

    public final void a(int i10) {
        Object[] objArr = this.f90251a;
        if (objArr.length < i10) {
            this.f90251a = Arrays.copyOf(objArr, i51.a(objArr.length, i10));
            this.f90253c = false;
        } else if (this.f90253c) {
            this.f90251a = (Object[]) objArr.clone();
            this.f90253c = false;
        }
    }
}
