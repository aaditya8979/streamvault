package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class kc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p000do.l0 f91550a = kotlinx.coroutines.d.a(p000do.j2.b(null, 1, null).plus(p000do.w0.c().M()).plus(new x10()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iz0 f91551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b53 f91552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hz0 f91553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fz0 f91554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dz0 f91555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kz0 f91556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x70 f91557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qb f91558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nb f91559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final kb f91560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lr1 f91561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final go.l f91562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final go.u f91563n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fo.d f91564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final go.d f91565p;

    public kc1(iz0 iz0Var, b53 b53Var, hz0 hz0Var, fz0 fz0Var, dz0 dz0Var, kz0 kz0Var, x70 x70Var, qb qbVar, nb nbVar, kb kbVar, lr1 lr1Var) {
        this.f91551b = iz0Var;
        this.f91552c = b53Var;
        this.f91553d = hz0Var;
        this.f91554e = fz0Var;
        this.f91555f = dz0Var;
        this.f91556g = kz0Var;
        this.f91557h = x70Var;
        this.f91558i = qbVar;
        this.f91559j = nbVar;
        this.f91560k = kbVar;
        this.f91561l = lr1Var;
        go.l lVarA = go.v.a(new p90(null, q70.f93913b, false, cn.w.m()));
        this.f91562m = lVarA;
        this.f91563n = go.f.c(lVarA);
        fo.d dVarB = fo.g.b(0, null, null, 7, null);
        this.f91564o = dVarB;
        this.f91565p = go.f.J(dVarB);
    }

    public final void a(g90 g90Var) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        if (g90Var instanceof y80) {
            p000do.i.d(this.f91550a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (g90Var instanceof e90) {
            p000do.i.d(this.f91550a, null, null, new hc1(this, null), 3, null);
            return;
        }
        if (g90Var instanceof c90) {
            b53 b53Var = this.f91552c;
            boolean z10 = !b53Var.f87916a.f93948a.a().f87944e.f95570a;
            dw2 dw2Var = b53Var.f87916a.f93948a.f93593e.f96621a;
            dw2Var.getClass();
            synchronized (dw2.f89000j) {
                dw2Var.f89005d = z10;
                dw2Var.f89006e = z10;
                dw2Var.f89007f = z10;
                bn.r rVar = bn.r.f5635a;
            }
            p000do.i.d(this.f91550a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (g90Var instanceof b90) {
            p90 p90Var = ((p90) this.f91562m.getValue()).f93493a;
            if (p90Var == null) {
                p000do.i.d(this.f91550a, null, null, new gc1(this, h90.f90305a, null), 3, null);
                return;
            }
            p90 p90VarA = p90.a(p90Var, null, null, false, null, 11);
            go.l lVar = this.f91562m;
            do {
                value4 = lVar.getValue();
            } while (!lVar.b(value4, p90VarA));
            return;
        }
        if (g90Var instanceof a90) {
            p70 p70Var = p70.f93454b;
            p90 p90Var2 = (p90) this.f91562m.getValue();
            p90 p90VarA2 = p90.a(p90Var2, p90Var2, p70Var, false, null, 12);
            go.l lVar2 = this.f91562m;
            do {
                value3 = lVar2.getValue();
            } while (!lVar2.b(value3, p90VarA2));
            p000do.i.d(this.f91550a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (g90Var instanceof z80) {
            n70 n70Var = new n70(((z80) g90Var).f97422a);
            p90 p90Var3 = (p90) this.f91562m.getValue();
            p90 p90VarA3 = p90.a(p90Var3, p90Var3, n70Var, false, null, 12);
            go.l lVar3 = this.f91562m;
            do {
                value2 = lVar3.getValue();
            } while (!lVar3.b(value2, p90VarA3));
            p000do.i.d(this.f91550a, null, null, new jc1(this, false, null), 3, null);
            return;
        }
        if (!(g90Var instanceof d90)) {
            if (g90Var instanceof f90) {
                p000do.i.d(this.f91550a, null, null, new ic1(this, ((f90) g90Var).f89518a, null), 3, null);
                return;
            }
            return;
        }
        s70 s70Var = ((p90) this.f91562m.getValue()).f93494b;
        y90 y90Var = ((d90) g90Var).f88781a;
        s70 o70Var = s70Var instanceof n70 ? new o70(y90Var) : new r70(y90Var.f97035a);
        p90 p90Var4 = (p90) this.f91562m.getValue();
        p90 p90VarA4 = p90.a(p90Var4, p90Var4, o70Var, false, null, 12);
        go.l lVar4 = this.f91562m;
        do {
            value = lVar4.getValue();
        } while (!lVar4.b(value, p90VarA4));
        p000do.i.d(this.f91550a, null, null, new jc1(this, false, null), 3, null);
    }
}
