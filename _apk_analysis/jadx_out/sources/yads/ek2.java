package yads;

import android.net.Uri;
import android.os.Handler;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ek2 implements pm1, pq0, yf1, cg1, ls2 {
    public static final Map N;
    public static final mx0 O;
    public boolean B;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public long H;
    public boolean J;
    public int K;
    public boolean L;
    public boolean M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f89285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p30 f89286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sk0 f89287d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ae0 f89288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bn1 f89289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ok0 f89290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ak2 f89291h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qe f89292i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f89293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f89294k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cr f89296m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public om1 f89301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p21 f89302s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f89305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f89306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f89307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public dk2 f89308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public vw2 f89309z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fg1 f89295l = new fg1("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vy f89297n = new vy();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Runnable f89298o = new Runnable() { // from class: bt.m1
        @Override // java.lang.Runnable
        public final void run() {
            this.f6153b.g();
        }
    };

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f89299p = new Runnable() { // from class: bt.n1
        @Override // java.lang.Runnable
        public final void run() {
            this.f6172b.e();
        }
    };

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Handler f89300q = ib3.a();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ck2[] f89304u = new ck2[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ms2[] f89303t = new ms2[0];
    public long I = -9223372036854775807L;
    public long A = -9223372036854775807L;
    public int C = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(map);
        lx0 lx0Var = new lx0();
        lx0Var.f92138a = "icy";
        lx0Var.f92148k = "application/x-icy";
        O = new mx0(lx0Var);
    }

    public ek2(Uri uri, p30 p30Var, cr crVar, sk0 sk0Var, ok0 ok0Var, ae0 ae0Var, bn1 bn1Var, ak2 ak2Var, qe qeVar, String str, int i10) {
        this.f89285b = uri;
        this.f89286c = p30Var;
        this.f89287d = sk0Var;
        this.f89290g = ok0Var;
        this.f89288e = ae0Var;
        this.f89289f = bn1Var;
        this.f89291h = ak2Var;
        this.f89292i = qeVar;
        this.f89293j = str;
        this.f89294k = i10;
        this.f89296m = crVar;
    }

    @Override // yads.pm1
    public final long a(long j10, ww2 ww2Var) {
        c();
        if (!this.f89309z.b()) {
            return 0L;
        }
        tw2 tw2VarB = this.f89309z.b(j10);
        return ww2Var.a(j10, tw2VarB.f95410a.f96908a, tw2VarB.f95411b.f96908a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            yads.ms2[] r3 = r6.f89303t
            int r3 = r3.length
            if (r2 >= r3) goto L27
            if (r7 != 0) goto L15
            yads.dk2 r3 = r6.f89308y
            r3.getClass()
            boolean[] r3 = r3.f88891c
            boolean r3 = r3[r2]
            if (r3 == 0) goto L21
        L15:
            yads.ms2[] r3 = r6.f89303t
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.f92552v     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L21:
            int r2 = r2 + 1
            goto L3
        L24:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.ek2.a(boolean):long");
    }

    @Override // yads.pm1
    public final long a(op0[] op0VarArr, boolean[] zArr, ns2[] ns2VarArr, boolean[] zArr2, long j10) {
        op0 op0Var;
        c();
        dk2 dk2Var = this.f89308y;
        i73 i73Var = dk2Var.f88889a;
        boolean[] zArr3 = dk2Var.f88891c;
        int i10 = this.F;
        for (int i11 = 0; i11 < op0VarArr.length; i11++) {
            ns2 ns2Var = ns2VarArr[i11];
            if (ns2Var != null && (op0VarArr[i11] == null || !zArr[i11])) {
                int i12 = ((bk2) ns2Var).f88037b;
                if (!zArr3[i12]) {
                    throw new IllegalStateException();
                }
                this.F--;
                zArr3[i12] = false;
                ns2VarArr[i11] = null;
            }
        }
        boolean z10 = !this.D ? j10 == 0 : i10 != 0;
        for (int i13 = 0; i13 < op0VarArr.length; i13++) {
            if (ns2VarArr[i13] == null && (op0Var = op0VarArr[i13]) != null) {
                if (op0Var.f() != 1) {
                    throw new IllegalStateException();
                }
                if (op0Var.b(0) != 0) {
                    throw new IllegalStateException();
                }
                int iIndexOf = i73Var.f90696c.indexOf(op0Var.b());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                if (!(!zArr3[iIndexOf])) {
                    throw new IllegalStateException();
                }
                this.F++;
                zArr3[iIndexOf] = true;
                ns2VarArr[i13] = new bk2(this, iIndexOf);
                zArr2[i13] = true;
                if (!z10) {
                    ms2 ms2Var = this.f89303t[iIndexOf];
                    z10 = (ms2Var.b(j10, true) || ms2Var.f92547q + ms2Var.f92549s == 0) ? false : true;
                }
            }
        }
        if (this.F == 0) {
            this.J = false;
            this.E = false;
            if (this.f89295l.b()) {
                for (ms2 ms2Var2 : this.f89303t) {
                    ms2Var2.a();
                }
                ag1 ag1Var = this.f89295l.f89572b;
                if (ag1Var == null) {
                    throw new IllegalStateException();
                }
                ag1Var.a(false);
            } else {
                for (ms2 ms2Var3 : this.f89303t) {
                    ms2Var3.b(false);
                }
            }
        } else if (z10) {
            j10 = seekToUs(j10);
            for (int i14 = 0; i14 < ns2VarArr.length; i14++) {
                if (ns2VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.D = true;
        return j10;
    }

    @Override // yads.pq0
    public final m73 a(int i10, int i11) {
        return a(new ck2(false, i10));
    }

    public final ms2 a(ck2 ck2Var) {
        int length = this.f89303t.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (ck2Var.equals(this.f89304u[i10])) {
                return this.f89303t[i10];
            }
        }
        ms2 ms2VarA = ms2.a(this.f89292i, this.f89287d, this.f89290g);
        ms2VarA.f92536f = this;
        int i11 = length + 1;
        ck2[] ck2VarArr = (ck2[]) Arrays.copyOf(this.f89304u, i11);
        ck2VarArr[length] = ck2Var;
        this.f89304u = ck2VarArr;
        ms2[] ms2VarArr = (ms2[]) Arrays.copyOf(this.f89303t, i11);
        ms2VarArr[length] = ms2VarA;
        this.f89303t = ms2VarArr;
        return ms2VarA;
    }

    @Override // yads.yf1
    public final zf1 a(bg1 bg1Var, long j10, long j11, IOException iOException, int i10) {
        long jMin;
        zf1 zf1Var;
        vw2 vw2Var;
        zj2 zj2Var = (zj2) bg1Var;
        Uri uri = zj2Var.f97625b.f94279c;
        vf1 vf1Var = new vf1();
        int i11 = ib3.f90737a;
        this.f89288e.getClass();
        if ((iOException instanceof ob2) || (iOException instanceof FileNotFoundException) || (iOException instanceof p11) || (iOException instanceof eg1)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i12 = q30.f93872c;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof q30) && ((q30) cause).f93873b == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i10 - 1) * 1000, 5000);
        if (jMin == -9223372036854775807L) {
            zf1Var = fg1.f89570e;
        } else {
            int iD = d();
            int i13 = iD > this.K ? 1 : 0;
            if (this.G || !((vw2Var = this.f89309z) == null || vw2Var.c() == -9223372036854775807L)) {
                this.K = iD;
            } else {
                boolean z10 = this.f89306w;
                if (z10 && !this.E && this.I == -9223372036854775807L) {
                    this.J = true;
                    zf1Var = fg1.f89569d;
                } else {
                    this.E = z10;
                    this.H = 0L;
                    this.K = 0;
                    for (ms2 ms2Var : this.f89303t) {
                        ms2Var.b(false);
                    }
                    zj2Var.f97629f.f89980a = 0L;
                    zj2Var.f97632i = 0L;
                    zj2Var.f97631h = true;
                    zj2Var.f97635l = false;
                }
            }
            zf1Var = new zf1(i13, jMin);
        }
        int i14 = zf1Var.f97559a;
        boolean z11 = !(i14 == 0 || i14 == 1);
        bn1 bn1Var = this.f89289f;
        bn1Var.a(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f97632i), bn1Var.a(this.A)), iOException, z11);
        if (z11) {
            this.f89288e.getClass();
        }
        return zf1Var;
    }

    @Override // yads.pq0
    public final void a() {
        this.f89305v = true;
        this.f89300q.post(this.f89298o);
    }

    public final void a(int i10) {
        c();
        boolean[] zArr = this.f89308y.f88890b;
        if (this.J && zArr[i10] && !this.f89303t[i10].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            for (ms2 ms2Var : this.f89303t) {
                ms2Var.b(false);
            }
            om1 om1Var = this.f89301r;
            om1Var.getClass();
            om1Var.a((rx2) this);
        }
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11) {
        vw2 vw2Var;
        zj2 zj2Var = (zj2) bg1Var;
        if (this.A == -9223372036854775807L && (vw2Var = this.f89309z) != null) {
            boolean zB = vw2Var.b();
            long jA = a(true);
            long j12 = jA == Long.MIN_VALUE ? 0L : jA + 10000;
            this.A = j12;
            ak2 ak2Var = this.f89291h;
            boolean z10 = this.B;
            hk2 hk2Var = (hk2) ak2Var;
            if (j12 == -9223372036854775807L) {
                j12 = hk2Var.f90448p;
            }
            if (hk2Var.f90447o || hk2Var.f90448p != j12 || hk2Var.f90449q != zB || hk2Var.f90450r != z10) {
                hk2Var.f90448p = j12;
                hk2Var.f90449q = zB;
                hk2Var.f90450r = z10;
                hk2Var.f90447o = false;
                long j13 = hk2Var.f90448p;
                pz2 pz2Var = new pz2(j13, j13, hk2Var.f90449q, hk2Var.f90450r, hk2Var.f90440h);
                s63 fk2Var = pz2Var;
                if (hk2Var.f90447o) {
                    fk2Var = new fk2(pz2Var);
                }
                hk2Var.a(fk2Var);
            }
        }
        Uri uri = zj2Var.f97625b.f94279c;
        vf1 vf1Var = new vf1();
        this.f89288e.getClass();
        bn1 bn1Var = this.f89289f;
        bn1Var.b(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f97632i), bn1Var.a(this.A)));
        this.L = true;
        om1 om1Var = this.f89301r;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    @Override // yads.yf1
    public final void a(bg1 bg1Var, long j10, long j11, boolean z10) {
        zj2 zj2Var = (zj2) bg1Var;
        Uri uri = zj2Var.f97625b.f94279c;
        vf1 vf1Var = new vf1();
        this.f89288e.getClass();
        bn1 bn1Var = this.f89289f;
        bn1Var.a(vf1Var, new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f97632i), bn1Var.a(this.A)));
        if (z10) {
            return;
        }
        for (ms2 ms2Var : this.f89303t) {
            ms2Var.b(false);
        }
        if (this.F > 0) {
            om1 om1Var = this.f89301r;
            om1Var.getClass();
            om1Var.a((rx2) this);
        }
    }

    @Override // yads.pm1
    public final void a(om1 om1Var, long j10) {
        this.f89301r = om1Var;
        this.f89297n.d();
        i();
    }

    @Override // yads.pq0
    public final void a(final vw2 vw2Var) {
        this.f89300q.post(new Runnable() { // from class: bt.k1
            @Override // java.lang.Runnable
            public final void run() {
                this.f6111b.b(vw2Var);
            }
        });
    }

    @Override // yads.cg1
    public final void b() {
        for (ms2 ms2Var : this.f89303t) {
            ms2Var.b(true);
            ms2Var.d();
        }
        cr crVar = this.f89296m;
        mq0 mq0Var = crVar.f88591b;
        if (mq0Var != null) {
            mq0Var.release();
            crVar.f88591b = null;
        }
        crVar.f88592c = null;
    }

    public final void b(vw2 vw2Var) {
        this.f89309z = this.f89302s == null ? vw2Var : new uw2(-9223372036854775807L, 0L);
        this.A = vw2Var.c();
        boolean z10 = !this.G && vw2Var.c() == -9223372036854775807L;
        this.B = z10;
        this.C = z10 ? 7 : 1;
        ak2 ak2Var = this.f89291h;
        long j10 = this.A;
        boolean zB = vw2Var.b();
        boolean z11 = this.B;
        hk2 hk2Var = (hk2) ak2Var;
        if (j10 == -9223372036854775807L) {
            j10 = hk2Var.f90448p;
        }
        if (hk2Var.f90447o || hk2Var.f90448p != j10 || hk2Var.f90449q != zB || hk2Var.f90450r != z11) {
            hk2Var.f90448p = j10;
            hk2Var.f90449q = zB;
            hk2Var.f90450r = z11;
            hk2Var.f90447o = false;
            long j11 = hk2Var.f90448p;
            pz2 pz2Var = new pz2(j11, j11, hk2Var.f90449q, hk2Var.f90450r, hk2Var.f90440h);
            s63 fk2Var = pz2Var;
            if (hk2Var.f90447o) {
                fk2Var = new fk2(pz2Var);
            }
            hk2Var.a(fk2Var);
        }
        if (this.f89306w) {
            return;
        }
        g();
    }

    public final void c() {
        if (!this.f89306w) {
            throw new IllegalStateException();
        }
        this.f89308y.getClass();
        this.f89309z.getClass();
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        if (this.L || this.f89295l.f89573c != null || this.J) {
            return false;
        }
        if (this.f89306w && this.F == 0) {
            return false;
        }
        boolean zD = this.f89297n.d();
        if (this.f89295l.b()) {
            return zD;
        }
        i();
        return true;
    }

    public final int d() {
        int i10 = 0;
        for (ms2 ms2Var : this.f89303t) {
            i10 += ms2Var.f92547q + ms2Var.f92546p;
        }
        return i10;
    }

    @Override // yads.pm1
    public final void discardBuffer(long j10, boolean z10) {
        c();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f89308y.f88891c;
        int length = this.f89303t.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f89303t[i10].a(j10, z10, zArr[i10]);
        }
    }

    public final void e() {
        if (this.M) {
            return;
        }
        om1 om1Var = this.f89301r;
        om1Var.getClass();
        om1Var.a((rx2) this);
    }

    public final /* synthetic */ void f() {
        this.G = true;
    }

    public final void g() {
        if (this.M || this.f89306w || !this.f89305v || this.f89309z == null) {
            return;
        }
        for (ms2 ms2Var : this.f89303t) {
            if (ms2Var.c() == null) {
                return;
            }
        }
        vy vyVar = this.f89297n;
        synchronized (vyVar) {
            vyVar.f96222a = false;
        }
        int length = this.f89303t.length;
        h73[] h73VarArr = new h73[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            mx0 mx0VarC = this.f89303t[i10].c();
            mx0VarC.getClass();
            String str = mx0VarC.f92610m;
            boolean zEquals = "audio".equals(ht1.c(str));
            boolean z10 = zEquals || "video".equals(ht1.c(str));
            zArr[i10] = z10;
            this.f89307x = z10 | this.f89307x;
            p21 p21Var = this.f89302s;
            if (p21Var != null) {
                if (zEquals || this.f89304u[i10].f88485b) {
                    ts1 ts1Var = mx0VarC.f92608k;
                    ts1 ts1Var2 = ts1Var == null ? new ts1(p21Var) : new ts1((ss1[]) ib3.a((Object[]) ts1Var.f95344b, (Object[]) new ss1[]{p21Var}));
                    lx0 lx0Var = new lx0(mx0VarC);
                    lx0Var.f92146i = ts1Var2;
                    mx0VarC = new mx0(lx0Var);
                }
                if (zEquals && mx0VarC.f92604g == -1 && mx0VarC.f92605h == -1 && p21Var.f93387b != -1) {
                    lx0 lx0Var2 = new lx0(mx0VarC);
                    lx0Var2.f92143f = p21Var.f93387b;
                    mx0VarC = new mx0(lx0Var2);
                }
            }
            int iA = this.f89287d.a(mx0VarC);
            lx0 lx0Var3 = new lx0(mx0VarC);
            lx0Var3.D = iA;
            h73VarArr[i10] = new h73(Integer.toString(i10), new mx0(lx0Var3));
        }
        this.f89308y = new dk2(new i73(h73VarArr), zArr);
        this.f89306w = true;
        om1 om1Var = this.f89301r;
        om1Var.getClass();
        om1Var.a((pm1) this);
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long jA;
        boolean z10;
        c();
        if (this.L || this.F == 0) {
            return Long.MIN_VALUE;
        }
        long j10 = this.I;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        if (this.f89307x) {
            int length = this.f89303t.length;
            jA = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                dk2 dk2Var = this.f89308y;
                if (dk2Var.f88890b[i10] && dk2Var.f88891c[i10]) {
                    ms2 ms2Var = this.f89303t[i10];
                    synchronized (ms2Var) {
                        z10 = ms2Var.f92553w;
                    }
                    if (!z10) {
                        jA = Math.min(jA, this.f89303t[i10].b());
                    }
                }
            }
        } else {
            jA = Long.MAX_VALUE;
        }
        if (jA == Long.MAX_VALUE) {
            jA = a(false);
        }
        return jA == Long.MIN_VALUE ? this.H : jA;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // yads.pm1
    public final i73 getTrackGroups() {
        c();
        return this.f89308y.f88889a;
    }

    public final void h() {
        this.f89300q.post(new Runnable() { // from class: bt.l1
            @Override // java.lang.Runnable
            public final void run() {
                this.f6129b.f();
            }
        });
    }

    public final void i() {
        zj2 zj2Var = new zj2(this, this.f89285b, this.f89286c, this.f89296m, this, this.f89297n);
        if (this.f89306w) {
            long j10 = this.I;
            if (j10 == -9223372036854775807L) {
                throw new IllegalStateException();
            }
            long j11 = this.A;
            if (j11 != -9223372036854775807L && j10 > j11) {
                this.L = true;
                this.I = -9223372036854775807L;
                return;
            }
            vw2 vw2Var = this.f89309z;
            vw2Var.getClass();
            long j12 = vw2Var.b(this.I).f95410a.f96909b;
            long j13 = this.I;
            zj2Var.f97629f.f89980a = j12;
            zj2Var.f97632i = j13;
            zj2Var.f97631h = true;
            zj2Var.f97635l = false;
            for (ms2 ms2Var : this.f89303t) {
                ms2Var.f92550t = this.I;
            }
            this.I = -9223372036854775807L;
        }
        this.K = d();
        this.f89295l.a(zj2Var, this, this.f89288e.a(this.C));
        u30 u30Var = zj2Var.f97633j;
        bn1 bn1Var = this.f89289f;
        Uri uri = u30Var.f95522a;
        Collections.emptyMap();
        bn1Var.c(new vf1(), new hm1(1, -1, null, 0, null, bn1Var.a(zj2Var.f97632i), bn1Var.a(this.A)));
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        boolean z10;
        if (this.f89295l.b()) {
            vy vyVar = this.f89297n;
            synchronized (vyVar) {
                z10 = vyVar.f96222a;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.pm1
    public final void maybeThrowPrepareError() throws IOException {
        this.f89295l.a(this.f89288e.a(this.C));
        if (this.L && !this.f89306w) {
            throw new ob2("Loading finished before preparation is complete.", null, true, 1);
        }
    }

    @Override // yads.pm1
    public final long readDiscontinuity() {
        if (!this.E) {
            return -9223372036854775807L;
        }
        if (!this.L && d() <= this.K) {
            return -9223372036854775807L;
        }
        this.E = false;
        return this.H;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
    }

    @Override // yads.pm1
    public final long seekToUs(long j10) {
        c();
        boolean[] zArr = this.f89308y.f88890b;
        if (!this.f89309z.b()) {
            j10 = 0;
        }
        this.E = false;
        this.H = j10;
        if (this.I != -9223372036854775807L) {
            this.I = j10;
            return j10;
        }
        if (this.C != 7) {
            int length = this.f89303t.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f89303t[i10].b(j10, false) || (!zArr[i10] && this.f89307x)) {
                }
            }
            return j10;
        }
        this.J = false;
        this.I = j10;
        this.L = false;
        if (this.f89295l.b()) {
            for (ms2 ms2Var : this.f89303t) {
                ms2Var.a();
            }
            ag1 ag1Var = this.f89295l.f89572b;
            if (ag1Var == null) {
                throw new IllegalStateException();
            }
            ag1Var.a(false);
        } else {
            this.f89295l.f89573c = null;
            for (ms2 ms2Var2 : this.f89303t) {
                ms2Var2.b(false);
            }
        }
        return j10;
    }
}
