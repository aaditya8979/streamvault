package yads;

import android.os.Handler;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p63 f95267a = new p63();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r63 f95268b = new r63();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final se f95269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f95270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f95271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f95272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f95273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qm1 f95274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public qm1 f95275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qm1 f95276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f95277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f95278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f95279m;

    public tm1(se seVar, Handler handler) {
        this.f95269c = seVar;
        this.f95270d = handler;
    }

    public static ym1 a(s63 s63Var, Object obj, long j10, long j11, r63 r63Var, p63 p63Var) {
        Object obj2 = obj;
        s63Var.a(obj, p63Var);
        s63Var.a(p63Var.f93449d, r63Var, 0L);
        int iA = s63Var.a(obj);
        while (p63Var.f93450e == 0) {
            e6 e6Var = p63Var.f93453h;
            if (e6Var.f89110c <= 0 || !e6Var.a(e6Var.f89113f).f88767h || p63Var.b(0L) != -1) {
                break;
            }
            int i10 = iA + 1;
            if (iA >= r63Var.f94314q) {
                break;
            }
            s63Var.a(i10, p63Var, true);
            obj2 = p63Var.f93448c;
            obj2.getClass();
            iA = i10;
        }
        s63Var.a(obj2, p63Var);
        int iB = p63Var.b(j10);
        if (iB == -1) {
            return new ym1(p63Var.a(j10), j11, obj2);
        }
        return new ym1(obj2, iB, p63Var.a(iB), j11);
    }

    public final qm1 a() {
        qm1 qm1Var = this.f95274h;
        if (qm1Var == null) {
            return null;
        }
        if (qm1Var == this.f95275i) {
            this.f95275i = qm1Var.f94080l;
        }
        qm1Var.b();
        int i10 = this.f95277k - 1;
        this.f95277k = i10;
        if (i10 == 0) {
            this.f95276j = null;
            qm1 qm1Var2 = this.f95274h;
            this.f95278l = qm1Var2.f94070b;
            this.f95279m = qm1Var2.f94074f.f94869a.f94495d;
        }
        this.f95274h = this.f95274h.f94080l;
        c();
        return this.f95274h;
    }

    public final sm1 a(s63 s63Var, Object obj, int i10, int i11, long j10, long j11) {
        ym1 ym1Var = new ym1(obj, i10, i11, j11);
        long jA = s63Var.a(obj, this.f95267a).a(i10, i11);
        long j12 = i11 == this.f95267a.a(i10) ? this.f95267a.f93453h.f89111d : 0L;
        return new sm1(ym1Var, (jA == -9223372036854775807L || j12 < jA) ? j12 : Math.max(0L, jA - 1), j10, -9223372036854775807L, jA, this.f95267a.f93453h.a(i10).f88767h, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.sm1 a(yads.s63 r25, java.lang.Object r26, long r27, long r29, long r31) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tm1.a(yads.s63, java.lang.Object, long, long, long):yads.sm1");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.sm1 a(yads.s63 r21, yads.qm1 r22, long r23) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tm1.a(yads.s63, yads.qm1, long):yads.sm1");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.sm1 a(yads.s63 r20, yads.sm1 r21) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.tm1.a(yads.s63, yads.sm1):yads.sm1");
    }

    public final ym1 a(s63 s63Var, Object obj, long j10) {
        long j11;
        int iA;
        Object obj2 = obj;
        int i10 = s63Var.a(obj2, this.f95267a).f93449d;
        Object obj3 = this.f95278l;
        if (obj3 == null || (iA = s63Var.a(obj3)) == -1 || s63Var.a(iA, this.f95267a, false).f93449d != i10) {
            qm1 qm1Var = this.f95274h;
            while (true) {
                if (qm1Var == null) {
                    qm1 qm1Var2 = this.f95274h;
                    while (true) {
                        if (qm1Var2 != null) {
                            int iA2 = s63Var.a(qm1Var2.f94070b);
                            if (iA2 != -1 && s63Var.a(iA2, this.f95267a, false).f93449d == i10) {
                                j11 = qm1Var2.f94074f.f94869a.f94495d;
                                break;
                            }
                            qm1Var2 = qm1Var2.f94080l;
                        } else {
                            j11 = this.f95271e;
                            this.f95271e = 1 + j11;
                            if (this.f95274h == null) {
                                this.f95278l = obj2;
                                this.f95279m = j11;
                            }
                        }
                    }
                } else {
                    if (qm1Var.f94070b.equals(obj2)) {
                        j11 = qm1Var.f94074f.f94869a.f94495d;
                        break;
                    }
                    qm1Var = qm1Var.f94080l;
                }
            }
        } else {
            j11 = this.f95279m;
        }
        long j12 = j11;
        s63Var.a(obj2, this.f95267a);
        s63Var.a(this.f95267a.f93449d, this.f95268b, 0L);
        boolean z10 = false;
        for (int iA3 = s63Var.a(obj); iA3 >= this.f95268b.f94313p; iA3--) {
            s63Var.a(iA3, this.f95267a, true);
            p63 p63Var = this.f95267a;
            boolean z11 = p63Var.f93453h.f89110c > 0;
            z10 |= z11;
            if (p63Var.b(p63Var.f93450e) != -1) {
                obj2 = this.f95267a.f93448c;
                obj2.getClass();
            }
            if (z10 && (!z11 || this.f95267a.f93450e != 0)) {
                break;
            }
        }
        return a(s63Var, obj2, j10, j12, this.f95268b, this.f95267a);
    }

    public final void a(l51 l51Var, ym1 ym1Var) {
        se seVar = this.f95269c;
        sm2 sm2VarA = l51Var.a();
        kb0 kb0Var = (kb0) seVar;
        jb0 jb0Var = kb0Var.f91534d;
        oe2 oe2Var = kb0Var.f91537g;
        oe2Var.getClass();
        jb0Var.getClass();
        jb0Var.f91142b = p51.a((Collection) sm2VarA);
        if (!sm2VarA.isEmpty()) {
            jb0Var.f91145e = (ym1) sm2VarA.get(0);
            ym1Var.getClass();
            jb0Var.f91146f = ym1Var;
        }
        if (jb0Var.f91144d == null) {
            jb0Var.f91144d = jb0.a(oe2Var, jb0Var.f91142b, jb0Var.f91145e, jb0Var.f91141a);
        }
        zn0 zn0Var = (zn0) oe2Var;
        zn0Var.r();
        jb0Var.a(zn0Var.Z.f88430a);
    }

    public final boolean a(qm1 qm1Var) {
        if (qm1Var == null) {
            throw new IllegalStateException();
        }
        int i10 = 0;
        if (qm1Var.equals(this.f95276j)) {
            return false;
        }
        this.f95276j = qm1Var;
        boolean z10 = false;
        while (true) {
            qm1Var = qm1Var.f94080l;
            if (qm1Var == null) {
                break;
            }
            if (qm1Var == this.f95275i) {
                this.f95275i = this.f95274h;
                z10 = true;
            }
            qm1Var.b();
            this.f95277k--;
        }
        qm1 qm1Var2 = this.f95276j;
        if (qm1Var2.f94080l != null) {
            qm1Var2.a();
            qm1Var2.f94080l = null;
            while (true) {
                t73 t73Var = qm1Var2.f94082n;
                if (i10 >= t73Var.f95088a) {
                    break;
                }
                boolean zA = t73Var.a(i10);
                op0 op0Var = qm1Var2.f94082n.f95090c[i10];
                if (zA && op0Var != null) {
                    op0Var.a();
                }
                i10++;
            }
        }
        c();
        return z10;
    }

    public final boolean a(s63 s63Var) {
        qm1 qm1Var;
        qm1 qm1Var2 = this.f95274h;
        if (qm1Var2 == null) {
            return true;
        }
        int iA = s63Var.a(qm1Var2.f94070b);
        while (true) {
            iA = s63Var.a(iA, this.f95267a, this.f95268b, this.f95272f, this.f95273g);
            while (true) {
                qm1Var = qm1Var2.f94080l;
                if (qm1Var == null || qm1Var2.f94074f.f94875g) {
                    break;
                }
                qm1Var2 = qm1Var;
            }
            if (iA == -1 || qm1Var == null || s63Var.a(qm1Var.f94070b) != iA) {
                break;
            }
            qm1Var2 = qm1Var;
        }
        boolean zA = a(qm1Var2);
        qm1Var2.f94074f = a(s63Var, qm1Var2.f94074f);
        return !zA;
    }

    public final boolean a(s63 s63Var, long j10, long j11) {
        sm1 sm1VarA;
        sm1 sm1Var;
        sm1 sm1Var2;
        s63 s63Var2 = s63Var;
        qm1 qm1Var = this.f95274h;
        qm1 qm1Var2 = null;
        while (qm1Var != null) {
            sm1 sm1Var3 = qm1Var.f94074f;
            if (qm1Var2 == null) {
                sm1VarA = a(s63Var2, sm1Var3);
            } else {
                sm1 sm1VarA2 = a(s63Var2, qm1Var2, j10);
                if (sm1VarA2 == null) {
                    return !a(qm1Var2);
                }
                if (sm1Var3.f94870b != sm1VarA2.f94870b || !sm1Var3.f94869a.equals(sm1VarA2.f94869a)) {
                    return !a(qm1Var2);
                }
                sm1VarA = sm1VarA2;
            }
            long j12 = sm1Var3.f94871c;
            if (j12 == sm1VarA.f94871c) {
                sm1Var2 = sm1VarA;
                sm1Var = sm1Var3;
            } else {
                sm1Var = sm1Var3;
                sm1Var2 = new sm1(sm1VarA.f94869a, sm1VarA.f94870b, j12, sm1VarA.f94872d, sm1VarA.f94873e, sm1VarA.f94874f, sm1VarA.f94875g, sm1VarA.f94876h, sm1VarA.f94877i);
            }
            qm1Var.f94074f = sm1Var2;
            long j13 = sm1Var.f94873e;
            long j14 = sm1VarA.f94873e;
            if (j13 != -9223372036854775807L && j13 != j14) {
                pm1 pm1Var = qm1Var.f94069a;
                if (pm1Var instanceof tv) {
                    long j15 = sm1Var2.f94872d;
                    if (j15 == -9223372036854775807L) {
                        j15 = Long.MIN_VALUE;
                    }
                    tv tvVar = (tv) pm1Var;
                    tvVar.f95366f = 0L;
                    tvVar.f95367g = j15;
                }
                return (a(qm1Var) || (qm1Var == this.f95275i && !sm1Var2.f94874f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : qm1Var.f94083o + j14) ? 1 : (j11 == ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : qm1Var.f94083o + j14) ? 0 : -1)) >= 0))) ? false : true;
            }
            qm1Var2 = qm1Var;
            qm1Var = qm1Var.f94080l;
            s63Var2 = s63Var;
        }
        return true;
    }

    public final boolean a(s63 s63Var, ym1 ym1Var, boolean z10) {
        int iA = s63Var.a(ym1Var.f94492a);
        return !s63Var.a(s63Var.a(iA, this.f95267a, false).f93449d, this.f95268b, 0L).f94307j && s63Var.a(iA, this.f95267a, this.f95268b, this.f95272f, this.f95273g) == -1 && z10;
    }

    public final void b() {
        if (this.f95277k == 0) {
            return;
        }
        qm1 qm1Var = this.f95274h;
        if (qm1Var == null) {
            throw new IllegalStateException();
        }
        this.f95278l = qm1Var.f94070b;
        this.f95279m = qm1Var.f94074f.f94869a.f94495d;
        while (qm1Var != null) {
            qm1Var.b();
            qm1Var = qm1Var.f94080l;
        }
        this.f95274h = null;
        this.f95276j = null;
        this.f95275i = null;
        this.f95277k = 0;
        c();
    }

    public final void c() {
        final l51 l51VarF = p51.f();
        for (qm1 qm1Var = this.f95274h; qm1Var != null; qm1Var = qm1Var.f94080l) {
            l51VarF.a(qm1Var.f94074f.f94869a);
        }
        qm1 qm1Var2 = this.f95275i;
        final ym1 ym1Var = qm1Var2 == null ? null : qm1Var2.f94074f.f94869a;
        this.f95270d.post(new Runnable() { // from class: bt.ka
            @Override // java.lang.Runnable
            public final void run() {
                this.f6121b.a(l51VarF, ym1Var);
            }
        });
    }
}
