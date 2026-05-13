package yads;

import com.ironsource.Q6;

/* JADX INFO: loaded from: classes11.dex */
public final class ff3 implements ag3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f89565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v9 f89566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t22 f89567c;

    public /* synthetic */ ff3(d4 d4Var, v9 v9Var) {
        this(d4Var, v9Var, new f22());
    }

    public ff3(d4 d4Var, v9 v9Var, t22 t22Var) {
        this.f89565a = d4Var;
        this.f89566b = v9Var;
        this.f89567c = t22Var;
    }

    @Override // yads.ag3
    public final fo2 a() {
        v9 v9Var = this.f89566b;
        d12 d12Var = (d12) v9Var.f96009t;
        if (d12Var == null) {
            d12Var = null;
        }
        fo2 fo2VarA = this.f89567c.a(v9Var, this.f89565a, d12Var);
        fo2VarA.b(bo2.f88105a, Q6.G1);
        fo2VarA.f89653b = this.f89566b.f95998i;
        return fo2VarA;
    }
}
