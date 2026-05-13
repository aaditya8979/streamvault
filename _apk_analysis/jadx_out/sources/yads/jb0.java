package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class jb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p63 f91141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p51 f91142b = p51.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xm2 f91143c = xm2.f96817h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ym1 f91144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ym1 f91145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ym1 f91146f;

    public jb0(p63 p63Var) {
        this.f91141a = p63Var;
    }

    public static ym1 a(oe2 oe2Var, p51 p51Var, ym1 ym1Var, p63 p63Var) {
        zn0 zn0Var = (zn0) oe2Var;
        s63 s63VarH = zn0Var.h();
        int iF = zn0Var.f();
        Object objA = s63VarH.c() ? null : s63VarH.a(iF);
        int iA = (zn0Var.l() || s63VarH.c()) ? -1 : s63VarH.a(iF, p63Var).a(ib3.a(zn0Var.g()) - p63Var.a());
        for (int i10 = 0; i10 < p51Var.size(); i10++) {
            ym1 ym1Var2 = (ym1) p51Var.get(i10);
            if (a(ym1Var2, objA, zn0Var.l(), zn0Var.c(), zn0Var.d(), iA)) {
                return ym1Var2;
            }
        }
        if (p51Var.isEmpty() && ym1Var != null) {
            if (a(ym1Var, objA, zn0Var.l(), zn0Var.c(), zn0Var.d(), iA)) {
                return ym1Var;
            }
        }
        return null;
    }

    public static boolean a(ym1 ym1Var, Object obj, boolean z10, int i10, int i11, int i12) {
        if (ym1Var.f94492a.equals(obj)) {
            return (z10 && ym1Var.f94493b == i10 && ym1Var.f94494c == i11) || (!z10 && ym1Var.f94493b == -1 && ym1Var.f94496e == i12);
        }
        return false;
    }

    public final void a(q51 q51Var, ym1 ym1Var, s63 s63Var) {
        if (ym1Var == null) {
            return;
        }
        if (s63Var.a(ym1Var.f94492a) != -1) {
            q51Var.a(ym1Var, s63Var);
            return;
        }
        s63 s63Var2 = (s63) this.f91143c.get(ym1Var);
        if (s63Var2 != null) {
            q51Var.a(ym1Var, s63Var2);
        }
    }

    public final void a(s63 s63Var) {
        q51 q51VarA = s51.a();
        if (this.f91142b.isEmpty()) {
            a(q51VarA, this.f91145e, s63Var);
            if (!l92.a(this.f91146f, this.f91145e)) {
                a(q51VarA, this.f91146f, s63Var);
            }
            if (!l92.a(this.f91144d, this.f91145e) && !l92.a(this.f91144d, this.f91146f)) {
                a(q51VarA, this.f91144d, s63Var);
            }
        } else {
            for (int i10 = 0; i10 < this.f91142b.size(); i10++) {
                a(q51VarA, (ym1) this.f91142b.get(i10), s63Var);
            }
            if (!this.f91142b.contains(this.f91144d)) {
                a(q51VarA, this.f91144d, s63Var);
            }
        }
        this.f91143c = q51VarA.a();
    }
}
