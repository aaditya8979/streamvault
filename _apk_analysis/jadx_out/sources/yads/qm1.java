package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class qm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pm1 f94069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f94070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ns2[] f94071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f94073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sm1 f94074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f94075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f94076h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ro[] f94077i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s73 f94078j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final in1 f94079k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public qm1 f94080l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i73 f94081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t73 f94082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f94083o;

    public qm1(ro[] roVarArr, long j10, s73 s73Var, ib0 ib0Var, in1 in1Var, sm1 sm1Var, t73 t73Var) {
        this.f94077i = roVarArr;
        this.f94083o = j10;
        this.f94078j = s73Var;
        this.f94079k = in1Var;
        ym1 ym1Var = sm1Var.f94869a;
        this.f94070b = ym1Var.f94492a;
        this.f94074f = sm1Var;
        this.f94081m = i73.f90693e;
        this.f94082n = t73Var;
        this.f94071c = new ns2[roVarArr.length];
        this.f94076h = new boolean[roVarArr.length];
        this.f94069a = a(ym1Var, in1Var, ib0Var, sm1Var.f94870b, sm1Var.f94872d);
    }

    public static pm1 a(ym1 ym1Var, in1 in1Var, ib0 ib0Var, long j10, long j11) {
        in1Var.getClass();
        Object objC = e.c(ym1Var.f94492a);
        ym1 ym1VarA = ym1Var.a(e.b(ym1Var.f94492a));
        gn1 gn1Var = (gn1) in1Var.f90910d.get(objC);
        gn1Var.getClass();
        in1Var.f90915i.add(gn1Var);
        fn1 fn1Var = (fn1) in1Var.f90914h.get(gn1Var);
        if (fn1Var != null) {
            fn1Var.f89638a.b(fn1Var.f89639b);
        }
        gn1Var.f90043c.add(ym1VarA);
        vi1 vi1Var = gn1Var.f90041a;
        vi1Var.getClass();
        si1 si1Var = new si1(ym1VarA, ib0Var, j10);
        mo moVar = vi1Var.f96107k;
        if (si1Var.f94838e != null) {
            throw new IllegalStateException();
        }
        si1Var.f94838e = moVar;
        if (vi1Var.f96114r) {
            Object obj = ym1VarA.f94492a;
            if (vi1Var.f96111o.f95242e != null && obj.equals(ti1.f95240f)) {
                obj = vi1Var.f96111o.f95242e;
            }
            si1Var.a(ym1VarA.a(obj));
        } else {
            vi1Var.f96112p = si1Var;
            if (!vi1Var.f96113q) {
                vi1Var.f96113q = true;
                vi1Var.a((Object) null, moVar);
            }
        }
        in1Var.f90909c.put(si1Var, gn1Var);
        Iterator it = in1Var.f90915i.iterator();
        while (it.hasNext()) {
            gn1 gn1Var2 = (gn1) it.next();
            if (gn1Var2.f90043c.isEmpty()) {
                fn1 fn1Var2 = (fn1) in1Var.f90914h.get(gn1Var2);
                if (fn1Var2 != null) {
                    fn1Var2.f89638a.a(fn1Var2.f89639b);
                }
                it.remove();
            }
        }
        return j11 != -9223372036854775807L ? new tv(si1Var, true, 0L, j11) : si1Var;
    }

    public final long a(t73 t73Var, long j10, boolean z10, boolean[] zArr) {
        t73 t73Var2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= t73Var.f95088a) {
                break;
            }
            boolean[] zArr2 = this.f94076h;
            if (z10 || (t73Var2 = this.f94082n) == null || !ib3.a(t73Var.f95089b[i11], t73Var2.f95089b[i11]) || !ib3.a(t73Var.f95090c[i11], t73Var2.f95090c[i11])) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        ns2[] ns2VarArr = this.f94071c;
        int i12 = 0;
        while (true) {
            ro[] roVarArr = this.f94077i;
            if (i12 >= roVarArr.length) {
                break;
            }
            if (roVarArr[i12].f94535b == -2) {
                ns2VarArr[i12] = null;
            }
            i12++;
        }
        a();
        this.f94082n = t73Var;
        if (this.f94080l == null) {
            int i13 = 0;
            while (true) {
                t73 t73Var3 = this.f94082n;
                if (i13 >= t73Var3.f95088a) {
                    break;
                }
                boolean zA = t73Var3.a(i13);
                op0 op0Var = this.f94082n.f95090c[i13];
                if (zA && op0Var != null) {
                    op0Var.a();
                }
                i13++;
            }
        }
        long jA = this.f94069a.a(t73Var.f95090c, this.f94076h, this.f94071c, zArr, j10);
        ns2[] ns2VarArr2 = this.f94071c;
        int i14 = 0;
        while (true) {
            ro[] roVarArr2 = this.f94077i;
            if (i14 >= roVarArr2.length) {
                break;
            }
            if (roVarArr2[i14].f94535b == -2 && this.f94082n.a(i14)) {
                ns2VarArr2[i14] = new wl0();
            }
            i14++;
        }
        this.f94073e = false;
        while (true) {
            ns2[] ns2VarArr3 = this.f94071c;
            if (i10 >= ns2VarArr3.length) {
                return jA;
            }
            if (ns2VarArr3[i10] != null) {
                if (!t73Var.a(i10)) {
                    throw new IllegalStateException();
                }
                if (this.f94077i[i10].f94535b != -2) {
                    this.f94073e = true;
                }
            } else if (t73Var.f95090c[i10] != null) {
                throw new IllegalStateException();
            }
            i10++;
        }
    }

    public final void a() {
        if (this.f94080l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            t73 t73Var = this.f94082n;
            if (i10 >= t73Var.f95088a) {
                return;
            }
            boolean zA = t73Var.a(i10);
            op0 op0Var = this.f94082n.f95090c[i10];
            if (zA && op0Var != null) {
                op0Var.disable();
            }
            i10++;
        }
    }

    public final void b() {
        a();
        in1 in1Var = this.f94079k;
        pm1 pm1Var = this.f94069a;
        try {
            if (!(pm1Var instanceof tv)) {
                gn1 gn1Var = (gn1) in1Var.f90909c.remove(pm1Var);
                gn1Var.getClass();
                gn1Var.f90041a.a(pm1Var);
                gn1Var.f90043c.remove(((si1) pm1Var).f94835b);
                if (!in1Var.f90909c.isEmpty()) {
                    Iterator it = in1Var.f90915i.iterator();
                    while (it.hasNext()) {
                        gn1 gn1Var2 = (gn1) it.next();
                        if (gn1Var2.f90043c.isEmpty()) {
                            fn1 fn1Var = (fn1) in1Var.f90914h.get(gn1Var2);
                            if (fn1Var != null) {
                                fn1Var.f89638a.a(fn1Var.f89639b);
                            }
                            it.remove();
                        }
                    }
                }
                if (gn1Var.f90045e && gn1Var.f90043c.isEmpty()) {
                    fn1 fn1Var2 = (fn1) in1Var.f90914h.remove(gn1Var);
                    fn1Var2.getClass();
                    fn1Var2.f89638a.c(fn1Var2.f89639b);
                    fn1Var2.f89638a.a((cn1) fn1Var2.f89640c);
                    fn1Var2.f89638a.a((pk0) fn1Var2.f89640c);
                    in1Var.f90915i.remove(gn1Var);
                    return;
                }
                return;
            }
            pm1 pm1Var2 = ((tv) pm1Var).f95362b;
            gn1 gn1Var3 = (gn1) in1Var.f90909c.remove(pm1Var2);
            gn1Var3.getClass();
            gn1Var3.f90041a.a(pm1Var2);
            gn1Var3.f90043c.remove(((si1) pm1Var2).f94835b);
            if (!in1Var.f90909c.isEmpty()) {
                Iterator it2 = in1Var.f90915i.iterator();
                while (it2.hasNext()) {
                    gn1 gn1Var4 = (gn1) it2.next();
                    if (gn1Var4.f90043c.isEmpty()) {
                        fn1 fn1Var3 = (fn1) in1Var.f90914h.get(gn1Var4);
                        if (fn1Var3 != null) {
                            fn1Var3.f89638a.a(fn1Var3.f89639b);
                        }
                        it2.remove();
                    }
                }
            }
            if (gn1Var3.f90045e && gn1Var3.f90043c.isEmpty()) {
                fn1 fn1Var4 = (fn1) in1Var.f90914h.remove(gn1Var3);
                fn1Var4.getClass();
                fn1Var4.f89638a.c(fn1Var4.f89639b);
                fn1Var4.f89638a.a((cn1) fn1Var4.f89640c);
                fn1Var4.f89638a.a((pk0) fn1Var4.f89640c);
                in1Var.f90915i.remove(gn1Var3);
            }
        } catch (RuntimeException e10) {
            ih1.b("MediaPeriodHolder", ih1.a("Period release failed.", e10));
        }
    }
}
