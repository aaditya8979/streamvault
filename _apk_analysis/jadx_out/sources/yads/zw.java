package yads;

/* JADX INFO: loaded from: classes12.dex */
public final class zw implements xw, qg1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f97802j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t83 f97803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t83 f97804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f97805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f97806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f97807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f97808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f97809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f97810i;

    public zw(ax axVar, bx bxVar, rg1 rg1Var) {
        this.f97803b = axVar;
        this.f97804c = bxVar;
        for (sw swVar : sw.values()) {
            a(rg1Var, swVar);
        }
        ((tg1) rg1Var).a(this);
    }

    public final void a(ix ixVar) {
        if (ixVar instanceof dx) {
            this.f97807f = ((dx) ixVar).f89015a;
            return;
        }
        if (ixVar instanceof ex) {
            this.f97805d = ((ex) ixVar).f89396a;
            return;
        }
        if (ixVar instanceof fx) {
            this.f97806e = ((fx) ixVar).f89714a;
            return;
        }
        if (ixVar instanceof gx) {
            this.f97808g = ((gx) ixVar).f90145a;
        } else if (ixVar instanceof hx) {
            this.f97809h = ((hx) ixVar).f90584a;
        } else if (ixVar instanceof cx) {
            this.f97810i = ((cx) ixVar).f88635a;
        }
    }

    public final void a(rg1 rg1Var, sw swVar) {
        ix ixVarA = this.f97804c.a(rg1Var, swVar);
        if (ixVarA == null) {
            ixVarA = this.f97803b.a(rg1Var, swVar);
        }
        a(ixVarA);
    }

    public final boolean a() {
        boolean z10;
        synchronized (f97802j) {
            z10 = this.f97807f;
        }
        return z10;
    }

    public final String b() {
        String str;
        synchronized (f97802j) {
            str = this.f97805d;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (f97802j) {
            str = this.f97806e;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (f97802j) {
            str = this.f97808g;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (f97802j) {
            str = this.f97809h;
        }
        return str;
    }
}
