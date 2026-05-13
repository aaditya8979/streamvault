package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class q51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f93893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f93894b = 0;

    public q51(int i10) {
        this.f93893a = new Object[i10 * 2];
    }

    public final q51 a(Object obj, Object obj2) {
        a(this.f93894b + 1);
        kx.a(obj, obj2);
        Object[] objArr = this.f93893a;
        int i10 = this.f93894b;
        int i11 = i10 * 2;
        objArr[i11] = obj;
        objArr[i11 + 1] = obj2;
        this.f93894b = i10 + 1;
        return this;
    }

    public final xm2 a() {
        return xm2.a(this.f93894b, this.f93893a);
    }

    public final void a(int i10) {
        int i11 = i10 * 2;
        Object[] objArr = this.f93893a;
        if (i11 > objArr.length) {
            this.f93893a = Arrays.copyOf(objArr, i51.a(objArr.length, i11));
        }
    }
}
