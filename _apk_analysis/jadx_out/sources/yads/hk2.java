package yads;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class hk2 extends mo implements ak2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fm1 f90440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zl1 f90441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o30 f90442j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yj2 f90443k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sk0 f90444l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ae0 f90445m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f90446n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f90447o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f90448p = -9223372036854775807L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f90449q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f90450r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public r83 f90451s;

    public hk2(fm1 fm1Var, o30 o30Var, yj2 yj2Var, sk0 sk0Var, ae0 ae0Var, int i10) {
        this.f90441i = (zl1) ni.a(fm1Var.f89625c);
        this.f90440h = fm1Var;
        this.f90442j = o30Var;
        this.f90443k = yj2Var;
        this.f90444l = sk0Var;
        this.f90445m = ae0Var;
        this.f90446n = i10;
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        p30 p30VarCreateDataSource = this.f90442j.createDataSource();
        r83 r83Var = this.f90451s;
        if (r83Var != null) {
            p30VarCreateDataSource.a(r83Var);
        }
        Uri uri = this.f90441i.f97653a;
        yj2 yj2Var = this.f90443k;
        ye2 ye2Var = this.f92480g;
        if (ye2Var != null) {
            return new ek2(uri, p30VarCreateDataSource, yj2Var.a(ye2Var), this.f90444l, a(ym1Var), this.f90445m, b(ym1Var), this, qeVar, this.f90441i.f97657e, this.f90446n);
        }
        throw new IllegalStateException();
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        ek2 ek2Var = (ek2) pm1Var;
        if (ek2Var.f89306w) {
            for (ms2 ms2Var : ek2Var.f89303t) {
                ms2Var.a();
                ms2Var.d();
            }
        }
        ek2Var.f89295l.a(ek2Var);
        ek2Var.f89300q.removeCallbacksAndMessages(null);
        ek2Var.f89301r = null;
        ek2Var.M = true;
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.f90451s = r83Var;
        this.f90444l.prepare();
        sk0 sk0Var = this.f90444l;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        ye2 ye2Var = this.f92480g;
        if (ye2Var == null) {
            throw new IllegalStateException();
        }
        sk0Var.a(looperMyLooper, ye2Var);
        long j10 = this.f90448p;
        pz2 pz2Var = new pz2(j10, j10, this.f90449q, this.f90450r, this.f90440h);
        s63 fk2Var = pz2Var;
        if (this.f90447o) {
            fk2Var = new fk2(pz2Var);
        }
        a(fk2Var);
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f90440h;
    }

    @Override // yads.mo
    public final void d() {
    }

    @Override // yads.mo
    public final void e() {
        this.f90444l.release();
    }
}
