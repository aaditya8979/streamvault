package yads;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class nv0 implements a03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz2 f92996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn f92997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f93000e;

    public nv0(int i10, int i11, zz2 zz2Var, fn fnVar) {
        this.f92996a = zz2Var;
        this.f92997b = fnVar;
        this.f92998c = (i10 >= 0 || -1 == i10) ? i10 : 0;
        this.f92999d = (i11 >= 0 || -2 == i11) ? i11 : 0;
        tn.x xVar = tn.x.f85368a;
        String str = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2));
        tn.p.j(str, "format(...)");
        this.f93000e = str;
    }

    @Override // yads.a03
    public final int a(Context context) {
        int i10 = this.f92999d;
        return -2 == i10 ? kl3.b(context) : i10;
    }

    @Override // yads.a03
    public final fn a() {
        return this.f92997b;
    }

    @Override // yads.a03
    public final zz2 b() {
        return this.f92996a;
    }

    @Override // yads.a03
    public final int c(Context context) {
        int i10 = this.f92998c;
        return -1 == i10 ? kl3.d(context) : i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !tn.p.f(nv0.class, obj.getClass())) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        if (this.f92998c != nv0Var.f92998c) {
            return false;
        }
        return this.f92999d == nv0Var.f92999d && this.f92996a == nv0Var.f92996a;
    }

    @Override // yads.a03
    public final int getHeight() {
        return this.f92999d;
    }

    @Override // yads.a03
    public final int getWidth() {
        return this.f92998c;
    }

    public final int hashCode() {
        return this.f92996a.hashCode() + k4.a(this.f93000e, ((this.f92998c * 31) + this.f92999d) * 31, 31);
    }

    public final String toString() {
        return this.f93000e;
    }
}
