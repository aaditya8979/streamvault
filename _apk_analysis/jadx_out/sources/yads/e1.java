package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f89056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f89057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f89058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n43 f89059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1 f89060e;

    public /* synthetic */ e1(Context context, d4 d4Var, lu2 lu2Var, v9 v9Var, g1 g1Var, dr0 dr0Var) {
        Context applicationContext = context.getApplicationContext();
        i1 i1Var = new i1(context, d4Var, lu2Var, v9Var, g1Var, dr0Var);
        z0 z0VarA = x0.a();
        n43 n43Var = n43.f92737b;
        this(applicationContext, i1Var, z0VarA, m43.a());
    }

    public e1(Context context, i1 i1Var, w0 w0Var, n43 n43Var) {
        this.f89056a = context;
        this.f89057b = i1Var;
        this.f89058c = w0Var;
        this.f89059d = n43Var;
        this.f89060e = new d1(this);
    }

    public final void a() {
        ((z0) this.f89058c).a(this.f89056a, (l1) this.f89060e);
        ((z0) this.f89058c).a(this.f89056a, this.f89060e);
    }

    public final void b() {
        this.f89057b.a(h1.f90188c);
        ((z0) this.f89058c).b(this.f89056a, this.f89060e);
        w0 w0Var = this.f89058c;
        Context context = this.f89056a;
        d1 d1Var = this.f89060e;
        z0 z0Var = (z0) w0Var;
        synchronized (z0Var.f97342a) {
            z0Var.f97344c.remove(d1Var);
            z0Var.b(context);
            bn.r rVar = bn.r.f5635a;
        }
        this.f89059d.a(ie1.f90789d, this);
    }

    public final void c() {
        this.f89059d.b(ie1.f90789d, this);
        ((z0) this.f89058c).a(this.f89056a, (l1) this.f89060e);
        ((z0) this.f89058c).a(this.f89056a, this.f89060e);
        this.f89057b.b(h1.f90188c);
    }

    public final void d() {
        this.f89057b.a(h1.f90189d);
    }

    public final void e() {
        this.f89057b.b(h1.f90189d);
    }
}
