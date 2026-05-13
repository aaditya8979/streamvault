package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class hv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f90572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z52 f90573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d72 f90574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f90575d;

    public /* synthetic */ hv0(Context context, w5 w5Var) {
        this(w5Var, new z52(context), new d72());
    }

    public hv0(w5 w5Var, z52 z52Var, d72 d72Var) {
        this.f90572a = w5Var;
        this.f90573b = z52Var;
        this.f90574c = d72Var;
        this.f90575d = new Object();
    }

    public final void a() {
        synchronized (this.f90575d) {
            this.f90573b.a();
            bn.r rVar = bn.r.f5635a;
        }
    }
}
