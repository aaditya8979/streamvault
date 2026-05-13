package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes9.dex */
public final class vi1 extends ry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final mo f96107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f96108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r63 f96109m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p63 f96110n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ti1 f96111o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public si1 f96112p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f96113q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f96114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f96115s;

    public vi1(mo moVar, boolean z10) {
        boolean z11;
        this.f96107k = moVar;
        if (z10) {
            moVar.getClass();
            z11 = true;
        } else {
            z11 = false;
        }
        this.f96108l = z11;
        this.f96109m = new r63();
        this.f96110n = new p63();
        moVar.getClass();
        this.f96111o = ti1.a(moVar.c());
    }

    public final Object a(Object obj) {
        return (this.f96111o.f95242e == null || !obj.equals(ti1.f95240f)) ? obj : this.f96111o.f95242e;
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        si1 si1Var = new si1(ym1Var, qeVar, j10);
        si1Var.a(this.f96107k);
        if (this.f96114r) {
            si1Var.a(ym1Var.a(a(ym1Var.f94492a)));
        } else {
            this.f96112p = si1Var;
            if (!this.f96113q) {
                this.f96113q = true;
                a((Object) null, this.f96107k);
            }
        }
        return si1Var;
    }

    @Override // yads.ry
    public final ym1 a(Object obj, ym1 ym1Var) {
        Object obj2 = ym1Var.f94492a;
        Object obj3 = this.f96111o.f95242e;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = ti1.f95240f;
        }
        return ym1Var.a(obj2);
    }

    public final void a(long j10) {
        si1 si1Var = this.f96112p;
        int iA = this.f96111o.a(si1Var.f94835b.f94492a);
        if (iA == -1) {
            return;
        }
        long j11 = this.f96111o.a(iA, this.f96110n, false).f93450e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        si1Var.f94841h = j10;
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        ((si1) pm1Var).a();
        if (pm1Var == this.f96112p) {
            this.f96112p = null;
        }
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f94645j = r83Var;
        this.f94644i = ib3.a((Handler.Callback) null);
        if (this.f96108l) {
            return;
        }
        this.f96113q = true;
        a((Object) null, this.f96107k);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // yads.ry
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r15, yads.mo r16, yads.s63 r17) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.vi1.a(java.lang.Object, yads.mo, yads.s63):void");
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f96107k.c();
    }

    @Override // yads.ry, yads.mo
    public final void d() {
    }

    @Override // yads.ry, yads.mo
    public final void e() {
        this.f96114r = false;
        this.f96113q = false;
        super.e();
    }
}
