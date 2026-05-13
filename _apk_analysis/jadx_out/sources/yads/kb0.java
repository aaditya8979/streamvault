package yads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import yads.af;
import yads.be2;
import yads.dw0;
import yads.ee2;
import yads.fm1;
import yads.hm1;
import yads.ig0;
import yads.jm1;
import yads.kb0;
import yads.le2;
import yads.mx0;
import yads.o83;
import yads.pa0;
import yads.q20;
import yads.ts1;
import yads.va0;
import yads.vf1;
import yads.ye;

/* JADX INFO: loaded from: classes10.dex */
public final class kb0 implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv f91531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p63 f91532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r63 f91533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jb0 f91534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f91535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public pf1 f91536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public oe2 f91537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i53 f91538h;

    public kb0(xv xvVar) {
        this.f91531a = (xv) ni.a(xvVar);
        this.f91536f = new pf1(ib3.c(), xvVar, new nf1() { // from class: bt.x4
            @Override // yads.nf1
            public final void a(Object obj, dw0 dw0Var) {
                kb0.a((af) obj, dw0Var);
            }
        });
        p63 p63Var = new p63();
        this.f91532b = p63Var;
        this.f91533c = new r63();
        this.f91534d = new jb0(p63Var);
        this.f91535e = new SparseArray();
    }

    public static /* synthetic */ void a(af afVar, dw0 dw0Var) {
    }

    public static void a(ye yeVar, int i10, ne2 ne2Var, ne2 ne2Var2, af afVar) {
        afVar.getClass();
        mm1 mm1Var = (mm1) afVar;
        if (i10 == 1) {
            mm1Var.f92460u = true;
        }
        mm1Var.f92450k = i10;
    }

    public static void a(ye yeVar, be2 be2Var, af afVar) {
        ((mm1) afVar).f92453n = be2Var;
    }

    public static void a(ye yeVar, hm1 hm1Var, af afVar) {
        String str;
        mm1 mm1Var = (mm1) afVar;
        mm1Var.getClass();
        if (yeVar.f97093d == null) {
            return;
        }
        mx0 mx0Var = hm1Var.f90460c;
        mx0Var.getClass();
        int i10 = hm1Var.f90461d;
        oe0 oe0Var = mm1Var.f92441b;
        s63 s63Var = yeVar.f97091b;
        ym1 ym1Var = yeVar.f97093d;
        ym1Var.getClass();
        synchronized (oe0Var) {
            str = oe0Var.a(s63Var.a(ym1Var.f94492a, oe0Var.f93196b).f93449d, ym1Var).f92832a;
        }
        lm1 lm1Var = new lm1(mx0Var, i10, str);
        int i11 = hm1Var.f90459b;
        if (i11 != 0) {
            if (i11 == 1) {
                mm1Var.f92455p = lm1Var;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                mm1Var.f92456q = lm1Var;
                return;
            }
        }
        mm1Var.f92454o = lm1Var;
    }

    public static void a(ye yeVar, oj3 oj3Var, af afVar) {
        mm1 mm1Var = (mm1) afVar;
        lm1 lm1Var = mm1Var.f92454o;
        if (lm1Var != null) {
            mx0 mx0Var = lm1Var.f92032a;
            if (mx0Var.f92616s == -1) {
                lx0 lx0Var = new lx0(mx0Var);
                lx0Var.f92153p = oj3Var.f93238b;
                lx0Var.f92154q = oj3Var.f93239c;
                mm1Var.f92454o = new lm1(new mx0(lx0Var), lm1Var.f92033b, lm1Var.f92034c);
            }
        }
        int i10 = oj3Var.f93238b;
    }

    public static void a(ye yeVar, vf1 vf1Var, hm1 hm1Var, IOException iOException, boolean z10, af afVar) {
        mm1 mm1Var = (mm1) afVar;
        mm1Var.getClass();
        mm1Var.f92461v = hm1Var.f90458a;
    }

    public static void b(ye yeVar, int i10, long j10, long j11, af afVar) {
        String str;
        mm1 mm1Var = (mm1) afVar;
        mm1Var.getClass();
        ym1 ym1Var = yeVar.f97093d;
        if (ym1Var != null) {
            oe0 oe0Var = mm1Var.f92441b;
            s63 s63Var = yeVar.f97091b;
            synchronized (oe0Var) {
                str = oe0Var.a(s63Var.a(ym1Var.f94492a, oe0Var.f93196b).f93449d, ym1Var).f92832a;
            }
            Long l10 = (Long) mm1Var.f92447h.get(str);
            Long l11 = (Long) mm1Var.f92446g.get(str);
            mm1Var.f92447h.put(str, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            mm1Var.f92446g.put(str, Long.valueOf((l11 != null ? l11.longValue() : 0L) + ((long) i10)));
        }
    }

    public static void c(ye yeVar, pa0 pa0Var, af afVar) {
        mm1 mm1Var = (mm1) afVar;
        mm1Var.f92463x += pa0Var.f93506g;
        mm1Var.f92464y += pa0Var.f93504e;
    }

    public final ye a() {
        return a(this.f91534d.f91144d);
    }

    public final ye a(s63 s63Var, int i10, ym1 ym1Var) {
        ym1 ym1Var2 = s63Var.c() ? null : ym1Var;
        ((f53) this.f91531a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        zn0 zn0Var = (zn0) this.f91537g;
        zn0Var.r();
        boolean z10 = s63Var.equals(zn0Var.Z.f88430a) && i10 == ((zn0) this.f91537g).e();
        long jB = 0;
        if (ym1Var2 == null || !ym1Var2.a()) {
            if (z10) {
                jB = ((zn0) this.f91537g).b();
            } else if (!s63Var.c()) {
                jB = ib3.b(s63Var.a(i10, this.f91533c, 0L).f94311n);
            }
        } else if (z10 && ((zn0) this.f91537g).c() == ym1Var2.f94493b && ((zn0) this.f91537g).d() == ym1Var2.f94494c) {
            zn0 zn0Var2 = (zn0) this.f91537g;
            zn0Var2.r();
            jB = ib3.b(zn0Var2.a(zn0Var2.Z));
        }
        ym1 ym1Var3 = this.f91534d.f91144d;
        zn0 zn0Var3 = (zn0) this.f91537g;
        zn0Var3.r();
        s63 s63Var2 = zn0Var3.Z.f88430a;
        int iE = ((zn0) this.f91537g).e();
        zn0 zn0Var4 = (zn0) this.f91537g;
        zn0Var4.r();
        long jB2 = ib3.b(zn0Var4.a(zn0Var4.Z));
        zn0 zn0Var5 = (zn0) this.f91537g;
        zn0Var5.r();
        return new ye(jElapsedRealtime, s63Var, i10, ym1Var2, jB, s63Var2, iE, ym1Var3, jB2, ib3.b(zn0Var5.Z.f88446q));
    }

    public final ye a(ym1 ym1Var) {
        this.f91537g.getClass();
        s63 s63Var = ym1Var == null ? null : (s63) this.f91534d.f91143c.get(ym1Var);
        if (ym1Var != null && s63Var != null) {
            return a(s63Var, s63Var.a(ym1Var.f94492a, this.f91532b).f93449d, ym1Var);
        }
        int iE = ((zn0) this.f91537g).e();
        zn0 zn0Var = (zn0) this.f91537g;
        zn0Var.r();
        s63 s63Var2 = zn0Var.Z.f88430a;
        if (iE >= s63Var2.b()) {
            s63Var2 = s63.f94726b;
        }
        return a(s63Var2, iE, (ym1) null);
    }

    @Override // yads.me2
    public final void a(final int i10) {
        jb0 jb0Var = this.f91534d;
        oe2 oe2Var = this.f91537g;
        oe2Var.getClass();
        jb0Var.f91144d = jb0.a(oe2Var, jb0Var.f91142b, jb0Var.f91145e, jb0Var.f91141a);
        zn0 zn0Var = (zn0) oe2Var;
        zn0Var.r();
        jb0Var.a(zn0Var.Z.f88430a);
        final ye yeVarA = a();
        a(yeVarA, 0, new mf1() { // from class: bt.r5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final int i10, final long j10) {
        final ye yeVarA = a(this.f91534d.f91145e);
        a(yeVarA, 1018, new mf1() { // from class: bt.d5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                long j11 = j10;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final int i10, final long j10, final long j11) {
        final ye yeVarB = b();
        a(yeVarB, 1011, new mf1() { // from class: bt.x3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                int i11 = i10;
                long j12 = j10;
                long j13 = j11;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1023, new mf1() { // from class: bt.p4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, final int i11) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1022, new mf1() { // from class: bt.f4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                int i12 = i11;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.pk0
    public final void a(int i10, ym1 ym1Var, final Exception exc) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1024, new mf1() { // from class: bt.y5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1005, new mf1() { // from class: bt.z5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1001, new mf1() { // from class: bt.w5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                vf1 vf1Var2 = vf1Var;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void a(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var, final IOException iOException, final boolean z10) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1003, new mf1() { // from class: bt.u3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarE, vf1Var, hm1Var, iOException, z10, (af) obj);
            }
        });
    }

    public final void a(final long j10) {
        final ye yeVarB = b();
        a(yeVarB, 1010, new mf1() { // from class: bt.y3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                long j11 = j10;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final Exception exc) {
        final ye yeVarB = b();
        a(yeVarB, 1029, new mf1() { // from class: bt.j5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final Object obj, final long j10) {
        final ye yeVarB = b();
        a(yeVarB, 26, new mf1() { // from class: bt.t5
            @Override // yads.mf1
            public final void invoke(Object obj2) {
                ye yeVar = yeVarB;
                Object obj3 = obj;
                long j11 = j10;
                ((af) obj2).getClass();
            }
        });
    }

    public final void a(final String str) {
        final ye yeVarB = b();
        a(yeVarB, 1012, new mf1() { // from class: bt.z4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final String str, final long j10, final long j11) {
        final ye yeVarB = b();
        a(yeVarB, 1008, new mf1() { // from class: bt.e4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ee2 ee2Var) {
        final ye yeVarA = a();
        a(yeVarA, 12, new mf1() { // from class: bt.e5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ee2 ee2Var2 = ee2Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final fm1 fm1Var, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 1, new mf1() { // from class: bt.g5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                fm1 fm1Var2 = fm1Var;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ig0 ig0Var) {
        final ye yeVarA = a();
        a(yeVarA, 29, new mf1() { // from class: bt.d4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ig0 ig0Var2 = ig0Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final jm1 jm1Var) {
        final ye yeVarA = a();
        a(yeVarA, 14, new mf1() { // from class: bt.y4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                jm1 jm1Var2 = jm1Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final le2 le2Var) {
        final ye yeVarA = a();
        a(yeVarA, 13, new mf1() { // from class: bt.j4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                le2 le2Var2 = le2Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final mx0 mx0Var, final va0 va0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1009, new mf1() { // from class: bt.g4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                mx0 mx0Var2 = mx0Var;
                va0 va0Var2 = va0Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ne2 ne2Var, final ne2 ne2Var2, final int i10) {
        jb0 jb0Var = this.f91534d;
        oe2 oe2Var = this.f91537g;
        oe2Var.getClass();
        jb0Var.f91144d = jb0.a(oe2Var, jb0Var.f91142b, jb0Var.f91145e, jb0Var.f91141a);
        final ye yeVarA = a();
        a(yeVarA, 11, new mf1() { // from class: bt.a4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarA, i10, ne2Var, ne2Var2, (af) obj);
            }
        });
    }

    @Override // yads.me2
    public final void a(final o83 o83Var) {
        final ye yeVarA = a();
        a(yeVarA, 2, new mf1() { // from class: bt.u4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                o83 o83Var2 = o83Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(final oe2 oe2Var, Looper looper) {
        if (this.f91537g != null && !this.f91534d.f91142b.isEmpty()) {
            throw new IllegalStateException();
        }
        this.f91537g = oe2Var;
        this.f91538h = ((f53) this.f91531a).a(looper, null);
        pf1 pf1Var = this.f91536f;
        nf1 nf1Var = new nf1() { // from class: bt.x5
            @Override // yads.nf1
            public final void a(Object obj, dw0 dw0Var) {
                this.f6397a.a(oe2Var, (af) obj, dw0Var);
            }
        };
        this.f91536f = new pf1(pf1Var.f93578d, looper, pf1Var.f93575a, nf1Var);
    }

    public final /* synthetic */ void a(oe2 oe2Var, af afVar, dw0 dw0Var) {
        ((mm1) afVar).a(oe2Var, new ze(dw0Var, this.f91535e));
    }

    @Override // yads.me2
    public final void a(final oj3 oj3Var) {
        final ye yeVarB = b();
        a(yeVarB, 25, new mf1() { // from class: bt.s5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarB, oj3Var, (af) obj);
            }
        });
    }

    public final void a(final pa0 pa0Var) {
        final ye yeVarA = a(this.f91534d.f91145e);
        a(yeVarA, 1013, new mf1() { // from class: bt.i5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                pa0 pa0Var2 = pa0Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final pn0 pn0Var) {
        rm1 rm1Var;
        final ye yeVarA = (!(pn0Var instanceof pn0) || (rm1Var = pn0Var.f93646i) == null) ? a() : a(new ym1(rm1Var));
        a(yeVarA, 10, new mf1() { // from class: bt.v3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarA, pn0Var, (af) obj);
            }
        });
    }

    @Override // yads.me2
    public final void a(final q20 q20Var) {
        final ye yeVarA = a();
        a(yeVarA, 27, new mf1() { // from class: bt.h4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                q20 q20Var2 = q20Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void a(final ts1 ts1Var) {
        final ye yeVarA = a();
        a(yeVarA, 28, new mf1() { // from class: bt.k5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ts1 ts1Var2 = ts1Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void a(ye yeVar, int i10, mf1 mf1Var) {
        this.f91535e.put(i10, yeVar);
        pf1 pf1Var = this.f91536f;
        pf1Var.a(i10, mf1Var);
        pf1Var.a();
    }

    @Override // yads.me2
    public final void a(final boolean z10, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 30, new mf1() { // from class: bt.l5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    public final ye b() {
        return a(this.f91534d.f91146f);
    }

    public final void b(final int i10, final long j10) {
        final ye yeVarA = a(this.f91534d.f91145e);
        a(yeVarA, 1021, new mf1() { // from class: bt.s4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                long j11 = j10;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final int i10, final long j10, final long j11) {
        jb0 jb0Var = this.f91534d;
        final ye yeVarA = a(jb0Var.f91142b.isEmpty() ? null : (ym1) vd1.a(jb0Var.f91142b));
        a(yeVarA, 1006, new mf1() { // from class: bt.v5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.b(yeVarA, i10, j10, j11, (af) obj);
            }
        });
    }

    @Override // yads.pk0
    public final void b(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1027, new mf1() { // from class: bt.m5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1004, new mf1() { // from class: bt.q4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.a(yeVarE, hm1Var, (af) obj);
            }
        });
    }

    @Override // yads.cn1
    public final void b(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1000, new mf1() { // from class: bt.b5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                vf1 vf1Var2 = vf1Var;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final Exception exc) {
        final ye yeVarB = b();
        a(yeVarB, 1014, new mf1() { // from class: bt.v4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final String str) {
        final ye yeVarB = b();
        a(yeVarB, 1019, new mf1() { // from class: bt.c4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final String str, final long j10, final long j11) {
        final ye yeVarB = b();
        a(yeVarB, 1016, new mf1() { // from class: bt.z3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                String str2 = str;
                long j12 = j11;
                long j13 = j10;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final mx0 mx0Var, final va0 va0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1017, new mf1() { // from class: bt.n5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                mx0 mx0Var2 = mx0Var;
                va0 va0Var2 = va0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void b(final pa0 pa0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1007, new mf1() { // from class: bt.k4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                pa0 pa0Var2 = pa0Var;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void b(final pn0 pn0Var) {
        rm1 rm1Var;
        final ye yeVarA = (!(pn0Var instanceof pn0) || (rm1Var = pn0Var.f93646i) == null) ? a() : a(new ym1(rm1Var));
        a(yeVarA, 10, new mf1() { // from class: bt.t4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                be2 be2Var = pn0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void c() {
        i53 i53Var = this.f91538h;
        if (i53Var == null) {
            throw new IllegalStateException();
        }
        i53Var.f90680a.post(new Runnable() { // from class: bt.a6
            @Override // java.lang.Runnable
            public final void run() {
                this.f5938b.d();
            }
        });
    }

    @Override // yads.pk0
    public final void c(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1025, new mf1() { // from class: bt.l4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.cn1
    public final void c(int i10, ym1 ym1Var, final vf1 vf1Var, final hm1 hm1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1002, new mf1() { // from class: bt.w3
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                vf1 vf1Var2 = vf1Var;
                hm1 hm1Var2 = hm1Var;
                ((af) obj).getClass();
            }
        });
    }

    public final void c(final Exception exc) {
        final ye yeVarB = b();
        a(yeVarB, 1030, new mf1() { // from class: bt.q5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                Exception exc2 = exc;
                ((af) obj).getClass();
            }
        });
    }

    public final void c(final pa0 pa0Var) {
        final ye yeVarA = a(this.f91534d.f91145e);
        a(yeVarA, 1020, new mf1() { // from class: bt.w4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                kb0.c(yeVarA, pa0Var, (af) obj);
            }
        });
    }

    public final void d() {
        final ye yeVarA = a();
        a(yeVarA, 1028, new mf1() { // from class: bt.p5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                ((af) obj).getClass();
            }
        });
        pf1 pf1Var = this.f91536f;
        for (of1 of1Var : pf1Var.f93578d) {
            nf1 nf1Var = pf1Var.f93577c;
            of1Var.f93210d = true;
            if (of1Var.f93209c) {
                nf1Var.a(of1Var.f93207a, of1Var.f93208b.a());
            }
        }
        pf1Var.f93578d.clear();
        pf1Var.f93581g = true;
    }

    @Override // yads.pk0
    public final void d(int i10, ym1 ym1Var) {
        final ye yeVarE = e(i10, ym1Var);
        a(yeVarE, 1026, new mf1() { // from class: bt.o5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarE;
                ((af) obj).getClass();
            }
        });
    }

    public final void d(final pa0 pa0Var) {
        final ye yeVarB = b();
        a(yeVarB, 1015, new mf1() { // from class: bt.h5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                pa0 pa0Var2 = pa0Var;
                ((af) obj).getClass();
            }
        });
    }

    public final ye e(int i10, ym1 ym1Var) {
        this.f91537g.getClass();
        if (ym1Var != null) {
            return ((s63) this.f91534d.f91143c.get(ym1Var)) != null ? a(ym1Var) : a(s63.f94726b, i10, ym1Var);
        }
        zn0 zn0Var = (zn0) this.f91537g;
        zn0Var.r();
        s63 s63Var = zn0Var.Z.f88430a;
        if (i10 >= s63Var.b()) {
            s63Var = s63.f94726b;
        }
        return a(s63Var, i10, (ym1) null);
    }

    @Override // yads.me2
    public final void onCues(final List list) {
        final ye yeVarA = a();
        a(yeVarA, 27, new mf1() { // from class: bt.f5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                List list2 = list;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onIsLoadingChanged(final boolean z10) {
        final ye yeVarA = a();
        a(yeVarA, 3, new mf1() { // from class: bt.a5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onIsPlayingChanged(final boolean z10) {
        final ye yeVarA = a();
        a(yeVarA, 7, new mf1() { // from class: bt.o4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 5, new mf1() { // from class: bt.n4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlaybackStateChanged(final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 4, new mf1() { // from class: bt.b4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final ye yeVarA = a();
        a(yeVarA, 6, new mf1() { // from class: bt.c5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final ye yeVarA = a();
        a(yeVarA, -1, new mf1() { // from class: bt.r4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarA;
                boolean z11 = z10;
                int i11 = i10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onRenderedFirstFrame() {
    }

    @Override // yads.me2
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final ye yeVarB = b();
        a(yeVarB, 23, new mf1() { // from class: bt.u5
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                boolean z11 = z10;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final ye yeVarB = b();
        a(yeVarB, 24, new mf1() { // from class: bt.m4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                int i12 = i10;
                int i13 = i11;
                ((af) obj).getClass();
            }
        });
    }

    @Override // yads.me2
    public final void onVolumeChanged(final float f10) {
        final ye yeVarB = b();
        a(yeVarB, 22, new mf1() { // from class: bt.i4
            @Override // yads.mf1
            public final void invoke(Object obj) {
                ye yeVar = yeVarB;
                float f11 = f10;
                ((af) obj).getClass();
            }
        });
    }
}
