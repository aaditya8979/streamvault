package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Collections;
import yads.a30;
import yads.ae0;
import yads.bn1;
import yads.c30;
import yads.cg1;
import yads.f30;
import yads.fc2;
import yads.fg1;
import yads.fm1;
import yads.gg1;
import yads.h30;
import yads.hc0;
import yads.hm1;
import yads.ho0;
import yads.ib3;
import yads.ih1;
import yads.lu;
import yads.mo;
import yads.ms2;
import yads.ni;
import yads.o30;
import yads.ok0;
import yads.p30;
import yads.pb2;
import yads.pm1;
import yads.qb2;
import yads.qe;
import yads.r83;
import yads.sk0;
import yads.ue2;
import yads.v13;
import yads.vf1;
import yads.vo;
import yads.w13;
import yads.x13;
import yads.ye2;
import yads.yl1;
import yads.ym1;
import yads.zl1;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends mo {
    public fg1 A;
    public r83 B;
    public f30 C;
    public Handler D;
    public yl1 E;
    public Uri F;
    public final Uri G;
    public boolean I;
    public long J;
    public long K;
    public int M;
    public int O;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fm1 f51036h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o30 f51038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a30 f51039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hc0 f51040l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sk0 f51041m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ae0 f51042n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f51044p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pb2 f51046r;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p30 f51054z;
    public c30 H = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vo f51043o = new vo();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f51037i = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bn1 f51045q = b((ym1) null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f51048t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SparseArray f51049u = new SparseArray();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f51052x = new c(this);
    public long N = -9223372036854775807L;
    public long L = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f51047s = new e(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gg1 f51053y = new f(this);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Runnable f51050v = new Runnable() { // from class: yd.a
        @Override // java.lang.Runnable
        public final void run() {
            this.f97857b.h();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Runnable f51051w = new Runnable() { // from class: yd.b
        @Override // java.lang.Runnable
        public final void run() {
            this.f97858b.f();
        }
    };

    static {
        ho0.a("goog.exo.dash");
    }

    public i(fm1 fm1Var, o30 o30Var, pb2 pb2Var, a30 a30Var, hc0 hc0Var, sk0 sk0Var, ae0 ae0Var, long j10) {
        this.f51036h = fm1Var;
        this.E = fm1Var.f89626d;
        this.F = ((zl1) ni.a(fm1Var.f89625c)).f97653a;
        this.G = fm1Var.f89625c.f97653a;
        this.f51038j = o30Var;
        this.f51046r = pb2Var;
        this.f51039k = a30Var;
        this.f51041m = sk0Var;
        this.f51042n = ae0Var;
        this.f51044p = j10;
        this.f51040l = hc0Var;
    }

    @Override // yads.mo
    public final pm1 a(ym1 ym1Var, qe qeVar, long j10) {
        int iIntValue = ((Integer) ym1Var.f94492a).intValue() - this.O;
        bn1 bn1Var = new bn1(this.f92476c.f88093c, 0, ym1Var, ((fc2) this.H.f88318m.get(iIntValue)).f89531b);
        ok0 ok0VarA = a(ym1Var);
        int i10 = this.O + iIntValue;
        c30 c30Var = this.H;
        vo voVar = this.f51043o;
        a30 a30Var = this.f51039k;
        r83 r83Var = this.B;
        sk0 sk0Var = this.f51041m;
        ae0 ae0Var = this.f51042n;
        long j11 = this.L;
        gg1 gg1Var = this.f51053y;
        hc0 hc0Var = this.f51040l;
        c cVar = this.f51052x;
        ye2 ye2Var = this.f92480g;
        if (ye2Var == null) {
            throw new IllegalStateException();
        }
        h30 h30Var = new h30(i10, c30Var, voVar, iIntValue, a30Var, r83Var, sk0Var, ok0VarA, ae0Var, bn1Var, j11, gg1Var, qeVar, hc0Var, cVar, ye2Var);
        this.f51049u.put(i10, h30Var);
        return h30Var;
    }

    public final void a(IOException iOException) {
        ih1.b("DashMediaSource", ih1.a("Failed to resolve time offset.", iOException));
        a(true);
    }

    @Override // yads.mo
    public final void a(pm1 pm1Var) {
        h30 h30Var = (h30) pm1Var;
        ue2 ue2Var = h30Var.f90219n;
        ue2Var.f95633j = true;
        ue2Var.f95628e.removeCallbacksAndMessages(null);
        for (lu luVar : h30Var.f90225t) {
            luVar.f92109s = h30Var;
            ms2 ms2Var = luVar.f92104n;
            ms2Var.a();
            ms2Var.d();
            for (ms2 ms2Var2 : luVar.f92105o) {
                ms2Var2.a();
                ms2Var2.d();
            }
            luVar.f92100j.a(luVar);
        }
        h30Var.f90224s = null;
        this.f51049u.remove(h30Var.f90207b);
    }

    @Override // yads.mo
    public final void a(r83 r83Var) {
        this.B = r83Var;
        this.f51041m.prepare();
        sk0 sk0Var = this.f51041m;
        Looper looperMyLooper = Looper.myLooper();
        ye2 ye2Var = this.f92480g;
        if (ye2Var == null) {
            throw new IllegalStateException();
        }
        sk0Var.a(looperMyLooper, ye2Var);
        if (this.f51037i) {
            a(false);
            return;
        }
        this.f51054z = this.f51038j.createDataSource();
        this.A = new fg1("DashMediaSource");
        this.D = ib3.a((Handler.Callback) null);
        h();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [int] */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33, types: [int] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r15v9, types: [yads.op0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r46) {
        /*
            Method dump skipped, instruction units count: 1480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monetization.ads.exo.source.dash.i.a(boolean):void");
    }

    @Override // yads.mo
    public final fm1 c() {
        return this.f51036h;
    }

    @Override // yads.mo
    public final void d() {
        this.f51053y.a();
    }

    @Override // yads.mo
    public final void e() {
        this.I = false;
        this.f51054z = null;
        fg1 fg1Var = this.A;
        if (fg1Var != null) {
            fg1Var.a((cg1) null);
            this.A = null;
        }
        this.J = 0L;
        this.K = 0L;
        this.H = this.f51037i ? this.H : null;
        this.F = this.G;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.L = -9223372036854775807L;
        this.M = 0;
        this.N = -9223372036854775807L;
        this.O = 0;
        this.f51049u.clear();
        vo voVar = this.f51043o;
        voVar.f96147a.clear();
        voVar.f96148b.clear();
        voVar.f96149c.clear();
        this.f51041m.release();
    }

    public final /* synthetic */ void f() {
        a(false);
    }

    public final void g() {
        boolean z10;
        fg1 fg1Var = this.A;
        a aVar = new a(this);
        synchronized (x13.f96602b) {
            z10 = x13.f96603c;
        }
        if (z10) {
            aVar.a();
            return;
        }
        if (fg1Var == null) {
            fg1Var = new fg1("SntpClient");
        }
        fg1Var.a(new w13(), new v13(aVar), 1);
    }

    public final void h() {
        Uri uri;
        this.D.removeCallbacks(this.f51050v);
        fg1 fg1Var = this.A;
        if (fg1Var.f89573c != null) {
            return;
        }
        if (fg1Var.b()) {
            this.I = true;
            return;
        }
        synchronized (this.f51048t) {
            uri = this.F;
        }
        this.I = false;
        qb2 qb2Var = new qb2(this.f51054z, uri, 4, this.f51046r);
        this.A.a(qb2Var, this.f51047s, this.f51042n.a(4));
        bn1 bn1Var = this.f51045q;
        Uri uri2 = qb2Var.f93974b.f95522a;
        Collections.emptyMap();
        bn1Var.c(new vf1(), new hm1(qb2Var.f93975c, -1, null, 0, null, bn1Var.a(-9223372036854775807L), bn1Var.a(-9223372036854775807L)));
    }
}
