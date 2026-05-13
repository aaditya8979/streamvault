package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class i22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f90639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f90641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d12 f90642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t22 f90643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q22 f90644f;

    public /* synthetic */ i22(d4 d4Var, String str, v9 v9Var, d12 d12Var, t22 t22Var) {
        this(d4Var, str, v9Var, d12Var, t22Var, null);
    }

    public i22(d4 d4Var, String str, v9 v9Var, d12 d12Var, t22 t22Var, q22 q22Var) {
        this.f90639a = d4Var;
        this.f90640b = str;
        this.f90641c = v9Var;
        this.f90642d = d12Var;
        this.f90643e = t22Var;
        this.f90644f = q22Var;
    }

    public final fo2 a() {
        fo2 fo2VarA = this.f90643e.a(this.f90641c, this.f90639a, this.f90642d);
        q22 q22Var = this.f90644f;
        if (q22Var != null) {
            fo2VarA.b(q22Var.f93871b, "bind_type");
        }
        fo2VarA.a(this.f90640b, "native_ad_type");
        a03 a03Var = this.f90639a.f88743d.f87866a;
        if (a03Var != null) {
            fo2VarA.b(a03Var.b().f97849b, "size_type");
            fo2VarA.b(Integer.valueOf(a03Var.getWidth()), "width");
            fo2VarA.b(Integer.valueOf(a03Var.getHeight()), "height");
        }
        fo2VarA.f89653b = this.f90641c.f95998i;
        return fo2VarA;
    }
}
