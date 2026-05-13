package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public final class p02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q02 f93376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m02 f93377b;

    public /* synthetic */ p02(Context context, lu2 lu2Var, a12 a12Var, o02 o02Var, e00 e00Var, int i10) {
        this(context, lu2Var, a12Var, o02Var, new w5(), new d4((i10 & 32) != 0 ? e00.f89043g : e00Var), new k02(), new n02());
    }

    public p02(Context context, lu2 lu2Var, a12 a12Var, o02 o02Var, w5 w5Var, d4 d4Var, k02 k02Var, n02 n02Var) {
        this.f93376a = o02Var;
        k02Var.getClass();
        v02 v02VarA = k02.a(context, d4Var, lu2Var, w5Var, this);
        n02Var.getClass();
        m02 m02VarA = n02.a(context, lu2Var, a12Var, d4Var, v02VarA, w5Var);
        this.f93377b = m02VarA;
        v02VarA.a(m02VarA.e());
    }

    public final void a() {
        m02 m02Var = this.f93377b;
        a12 a12Var = m02Var.f92200w;
        g9 g9Var = a12Var.f87543a;
        if (!a12Var.f87545c.a()) {
            m02Var.b(h9.f90289h);
            return;
        }
        m02Var.f97677b.a(v5.f95926e, null);
        m02Var.A.b(ie1.f90787b, m02Var);
        m02Var.f97678c.f88749j = Integer.valueOf(m02Var.f92200w.f87546d);
        m02Var.f97678c.a(g9Var.f89877a);
        d4 d4Var = m02Var.f97678c;
        d4Var.f88745f = m02Var.f92200w.f87544b;
        d4Var.f88752m = g9Var.f89887k;
        synchronized (m02Var) {
            m02Var.c(g9Var);
        }
    }
}
