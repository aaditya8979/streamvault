package yads;

/* JADX INFO: loaded from: classes3.dex */
public final class ti1 extends px0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f95240f = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f95241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f95242e;

    public ti1(s63 s63Var, Object obj, Object obj2) {
        super(s63Var);
        this.f95241d = obj;
        this.f95242e = obj2;
    }

    public static ti1 a(fm1 fm1Var) {
        return new ti1(new ui1(fm1Var), r63.f94295s, f95240f);
    }

    @Override // yads.px0, yads.s63
    public final int a(Object obj) {
        Object obj2;
        s63 s63Var = this.f93823c;
        if (f95240f.equals(obj) && (obj2 = this.f95242e) != null) {
            obj = obj2;
        }
        return s63Var.a(obj);
    }

    @Override // yads.px0, yads.s63
    public final Object a(int i10) {
        Object objA = this.f93823c.a(i10);
        return ib3.a(objA, this.f95242e) ? f95240f : objA;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f93823c.a(i10, p63Var, z10);
        if (ib3.a(p63Var.f93448c, this.f95242e) && z10) {
            p63Var.f93448c = f95240f;
        }
        return p63Var;
    }

    @Override // yads.px0, yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        this.f93823c.a(i10, r63Var, j10);
        if (ib3.a(r63Var.f94299b, this.f95241d)) {
            r63Var.f94299b = r63.f94295s;
        }
        return r63Var;
    }
}
