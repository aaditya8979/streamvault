package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class go0 implements Handler.Callback, om1, r73, hn1, ce0, ze2 {
    public boolean A;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public fo0 L;
    public long M;
    public int N;
    public boolean O;
    public pn0 P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ro[] f90054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f90055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ro[] f90056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s73 f90057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t73 f90058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final sf1 f90059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final im f90060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i53 f90061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HandlerThread f90062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Looper f90063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r63 f90064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p63 f90065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f90066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f90067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final de0 f90068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f90069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xv f90070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final do0 f90071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tm1 f90072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final in1 f90073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final rf1 f90074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f90075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ww2 f90076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ce2 f90077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public co0 f90078z;
    public boolean G = false;
    public boolean B = false;
    public long Q = -9223372036854775807L;

    public go0(ro[] roVarArr, s73 s73Var, t73 t73Var, sf1 sf1Var, im imVar, int i10, se seVar, ww2 ww2Var, yd0 yd0Var, long j10, Looper looper, f53 f53Var, do0 do0Var, ye2 ye2Var) {
        this.f90071s = do0Var;
        this.f90054b = roVarArr;
        this.f90057e = s73Var;
        this.f90058f = t73Var;
        this.f90059g = sf1Var;
        this.f90060h = imVar;
        this.F = i10;
        this.f90076x = ww2Var;
        this.f90074v = yd0Var;
        this.f90075w = j10;
        this.f90070r = f53Var;
        zd0 zd0Var = (zd0) sf1Var;
        this.f90066n = zd0Var.a();
        this.f90067o = zd0Var.b();
        ce2 ce2VarA = ce2.a(t73Var);
        this.f90077y = ce2VarA;
        this.f90078z = new co0(ce2VarA);
        this.f90056d = new ro[roVarArr.length];
        for (int i11 = 0; i11 < roVarArr.length; i11++) {
            roVarArr[i11].a(i11, ye2Var);
            this.f90056d[i11] = roVarArr[i11].b();
        }
        this.f90068p = new de0(this, f53Var);
        this.f90069q = new ArrayList();
        this.f90055c = ly2.a();
        this.f90064l = new r63();
        this.f90065m = new p63();
        s73Var.a(this, imVar);
        this.O = true;
        Handler handler = new Handler(looper);
        this.f90072t = new tm1(seVar, handler);
        this.f90073u = new in1(this, seVar, handler, ye2Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f90062j = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f90063k = looper2;
        this.f90061i = f53Var.a(looper2, this);
    }

    public static Pair a(s63 s63Var, fo0 fo0Var, boolean z10, int i10, boolean z11, r63 r63Var, p63 p63Var) {
        Pair pairA;
        Object objA;
        s63 s63Var2 = fo0Var.f89648a;
        if (s63Var.c()) {
            return null;
        }
        s63 s63Var3 = s63Var2.c() ? s63Var : s63Var2;
        try {
            pairA = s63Var3.a(r63Var, p63Var, fo0Var.f89649b, fo0Var.f89650c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (s63Var.equals(s63Var3)) {
            return pairA;
        }
        if (s63Var.a(pairA.first) != -1) {
            return (s63Var3.a(pairA.first, p63Var).f93452g && s63Var3.a(p63Var.f93449d, r63Var, 0L).f94313p == s63Var3.a(pairA.first)) ? s63Var.a(r63Var, p63Var, s63Var.a(pairA.first, p63Var).f93449d, fo0Var.f89650c) : pairA;
        }
        if (z10 && (objA = a(r63Var, p63Var, i10, z11, pairA.first, s63Var3, s63Var)) != null) {
            return s63Var.a(r63Var, p63Var, s63Var.a(objA, p63Var).f93449d, -9223372036854775807L);
        }
        return null;
    }

    public static Object a(r63 r63Var, p63 p63Var, int i10, boolean z10, Object obj, s63 s63Var, s63 s63Var2) {
        int iA = s63Var.a(obj);
        int iA2 = s63Var.a();
        int iA3 = iA;
        int iA4 = -1;
        for (int i11 = 0; i11 < iA2 && iA4 == -1; i11++) {
            iA3 = s63Var.a(iA3, p63Var, r63Var, i10, z10);
            if (iA3 == -1) {
                break;
            }
            iA4 = s63Var2.a(s63Var.a(iA3));
        }
        if (iA4 == -1) {
            return null;
        }
        return s63Var2.a(iA4);
    }

    public static void a(bf2 bf2Var) {
        synchronized (bf2Var) {
        }
        try {
            bf2Var.f87983a.handleMessage(bf2Var.f87986d, bf2Var.f87987e);
        } finally {
            bf2Var.a(true);
        }
    }

    public static void a(ro roVar, long j10) {
        roVar.f94545l = true;
        if (roVar instanceof a63) {
            a63 a63Var = (a63) roVar;
            if (!a63Var.f94545l) {
                throw new IllegalStateException();
            }
            a63Var.B = j10;
        }
    }

    public static boolean b(ro roVar) {
        return roVar.f94540g != 0;
    }

    public final long a(long j10) {
        qm1 qm1Var = this.f90072t.f95276j;
        if (qm1Var == null) {
            return 0L;
        }
        return Math.max(0L, j10 - (this.M - qm1Var.f94083o));
    }

    public final long a(s63 s63Var, Object obj, long j10) {
        s63Var.a(s63Var.a(obj, this.f90065m).f93449d, this.f90064l, 0L);
        r63 r63Var = this.f90064l;
        if (r63Var.f94304g != -9223372036854775807L && r63Var.a()) {
            r63 r63Var2 = this.f90064l;
            if (r63Var2.f94307j) {
                long j11 = r63Var2.f94305h;
                int i10 = ib3.f90737a;
                return ib3.a((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - this.f90064l.f94304g) - (j10 + this.f90065m.f93451f);
            }
        }
        return -9223372036854775807L;
    }

    public final long a(ym1 ym1Var, long j10, boolean z10, boolean z11) throws pn0 {
        tm1 tm1Var;
        long jSeekToUs;
        qm1 qm1Var;
        m();
        this.D = false;
        if (z11 || this.f90077y.f88434e == 3) {
            b(2);
        }
        qm1 qm1Var2 = this.f90072t.f95274h;
        qm1 qm1Var3 = qm1Var2;
        while (qm1Var3 != null && !ym1Var.equals(qm1Var3.f94074f.f94869a)) {
            qm1Var3 = qm1Var3.f94080l;
        }
        if (z10 || qm1Var2 != qm1Var3 || (qm1Var3 != null && qm1Var3.f94083o + j10 < 0)) {
            for (ro roVar : this.f90054b) {
                a(roVar);
            }
            if (qm1Var3 != null) {
                while (true) {
                    tm1Var = this.f90072t;
                    if (tm1Var.f95274h == qm1Var3) {
                        break;
                    }
                    tm1Var.a();
                }
                tm1Var.a(qm1Var3);
                qm1Var3.f94083o = 1000000000000L;
                a(new boolean[this.f90054b.length]);
            }
        }
        if (qm1Var3 != null) {
            this.f90072t.a(qm1Var3);
            if (qm1Var3.f94072d) {
                qm1 qm1Var4 = qm1Var3;
                if (qm1Var4.f94073e) {
                    jSeekToUs = qm1Var4.f94069a.seekToUs(j10);
                    qm1Var4.f94069a.discardBuffer(jSeekToUs - this.f90066n, this.f90067o);
                }
                b(jSeekToUs);
                d();
            } else {
                sm1 sm1Var = qm1Var3.f94074f;
                if (j10 == sm1Var.f94870b) {
                    qm1Var = qm1Var3;
                } else {
                    qm1Var = qm1Var3;
                    sm1Var = new sm1(sm1Var.f94869a, j10, sm1Var.f94871c, sm1Var.f94872d, sm1Var.f94873e, sm1Var.f94874f, sm1Var.f94875g, sm1Var.f94876h, sm1Var.f94877i);
                }
                qm1Var.f94074f = sm1Var;
            }
            jSeekToUs = j10;
            b(jSeekToUs);
            d();
        } else {
            this.f90072t.b();
            b(j10);
            jSeekToUs = j10;
        }
        a(false);
        this.f90061i.f90680a.sendEmptyMessage(2);
        return jSeekToUs;
    }

    public final Pair a(s63 s63Var) {
        long j10 = 0;
        if (s63Var.c()) {
            return Pair.create(ce2.f88429s, 0L);
        }
        Pair pairA = s63Var.a(this.f90064l, this.f90065m, s63Var.a(this.G), -9223372036854775807L);
        ym1 ym1VarA = this.f90072t.a(s63Var, pairA.first, 0L);
        long jLongValue = ((Long) pairA.second).longValue();
        if (ym1VarA.a()) {
            s63Var.a(ym1VarA.f94492a, this.f90065m);
            if (ym1VarA.f94494c == this.f90065m.a(ym1VarA.f94493b)) {
                j10 = this.f90065m.f93453h.f89111d;
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(ym1VarA, Long.valueOf(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yads.ce2 a(yads.ym1 r25, long r26, long r28, long r30, boolean r32, int r33) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.go0.a(yads.ym1, long, long, long, boolean, int):yads.ce2");
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174 A[EDGE_INSN: B:529:0x0174->B:70:0x0174 BREAK  A[LOOP:8: B:81:0x018c->B:98:0x01c4], EDGE_INSN: B:531:0x0174->B:70:0x0174 BREAK  A[LOOP:8: B:81:0x018c->B:98:0x01c4], EDGE_INSN: B:532:0x0174->B:70:0x0174 BREAK  A[LOOP:8: B:81:0x018c->B:98:0x01c4], EDGE_INSN: B:533:0x0174->B:70:0x0174 BREAK  A[LOOP:8: B:81:0x018c->B:98:0x01c4]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() throws yads.pn0 {
        /*
            Method dump skipped, instruction units count: 1985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.go0.a():void");
    }

    public final void a(int i10) throws pn0 {
        this.F = i10;
        tm1 tm1Var = this.f90072t;
        s63 s63Var = this.f90077y.f88430a;
        tm1Var.f95272f = i10;
        if (!tm1Var.a(s63Var)) {
            b(true);
        }
        a(false);
    }

    public final void a(int i10, int i11, sy2 sy2Var) {
        this.f90078z.a(1);
        in1 in1Var = this.f90073u;
        in1Var.getClass();
        if (i10 < 0 || i10 > i11 || i11 > in1Var.f90908b.size()) {
            throw new IllegalArgumentException();
        }
        in1Var.f90916j = sy2Var;
        in1Var.a(i10, i11);
        a(in1Var.a(), false);
    }

    public final void a(IOException iOException, int i10) {
        pn0 pn0Var = new pn0(0, iOException, i10, 0);
        qm1 qm1Var = this.f90072t.f95274h;
        if (qm1Var != null) {
            ym1 ym1Var = qm1Var.f94074f.f94869a;
            String message = pn0Var.getMessage();
            int i11 = ib3.f90737a;
            pn0Var = new pn0(message, pn0Var.getCause(), pn0Var.f87973b, pn0Var.f93641d, pn0Var.f93642e, pn0Var.f93643f, pn0Var.f93644g, pn0Var.f93645h, ym1Var, pn0Var.f87974c, pn0Var.f93647j);
        }
        ih1.b("ExoPlayerImplInternal", ih1.a("Playback error", pn0Var));
        a(false, false);
        this.f90077y = this.f90077y.a(pn0Var);
    }

    public final void a(bo0 bo0Var) {
        this.f90078z.a(1);
        if (bo0Var.f88099c != -1) {
            this.L = new fo0(new xf2(bo0Var.f88097a, bo0Var.f88098b), bo0Var.f88099c, bo0Var.f88100d);
        }
        in1 in1Var = this.f90073u;
        List list = bo0Var.f88097a;
        sy2 sy2Var = bo0Var.f88098b;
        in1Var.a(0, in1Var.f90908b.size());
        a(in1Var.a(in1Var.f90908b.size(), list, sy2Var), false);
    }

    public final void a(bo0 bo0Var, int i10) {
        this.f90078z.a(1);
        in1 in1Var = this.f90073u;
        if (i10 == -1) {
            i10 = in1Var.f90908b.size();
        }
        a(in1Var.a(i10, bo0Var.f88097a, bo0Var.f88098b), false);
    }

    public final void a(ee2 ee2Var) {
        this.f90068p.a(ee2Var);
        ee2 playbackParameters = this.f90068p.getPlaybackParameters();
        a(playbackParameters, playbackParameters.f89221b, true, true);
    }

    public final void a(ee2 ee2Var, float f10, boolean z10, boolean z11) {
        int i10;
        go0 go0Var = this;
        if (z10) {
            if (z11) {
                go0Var.f90078z.a(1);
            }
            ce2 ce2Var = go0Var.f90077y;
            go0Var = this;
            go0Var.f90077y = new ce2(ce2Var.f88430a, ce2Var.f88431b, ce2Var.f88432c, ce2Var.f88433d, ce2Var.f88434e, ce2Var.f88435f, ce2Var.f88436g, ce2Var.f88437h, ce2Var.f88438i, ce2Var.f88439j, ce2Var.f88440k, ce2Var.f88441l, ce2Var.f88442m, ee2Var, ce2Var.f88445p, ce2Var.f88446q, ce2Var.f88447r, ce2Var.f88444o);
        }
        float f11 = ee2Var.f89221b;
        qm1 qm1Var = go0Var.f90072t.f95274h;
        while (true) {
            i10 = 0;
            if (qm1Var == null) {
                break;
            }
            op0[] op0VarArr = qm1Var.f94082n.f95090c;
            int length = op0VarArr.length;
            while (i10 < length) {
                op0 op0Var = op0VarArr[i10];
                if (op0Var != null) {
                    op0Var.a(f11);
                }
                i10++;
            }
            qm1Var = qm1Var.f94080l;
        }
        ro[] roVarArr = go0Var.f90054b;
        int length2 = roVarArr.length;
        while (i10 < length2) {
            ro roVar = roVarArr[i10];
            if (roVar != null) {
                roVar.a(f10, ee2Var.f89221b);
            }
            i10++;
        }
    }

    public final void a(fo0 fo0Var) throws Throwable {
        long j10;
        long j11;
        ym1 ym1Var;
        boolean z10;
        long j12;
        long j13;
        long j14;
        ce2 ce2Var;
        int i10;
        this.f90078z.a(1);
        Pair pairA = a(this.f90077y.f88430a, fo0Var, true, this.F, this.G, this.f90064l, this.f90065m);
        if (pairA == null) {
            Pair pairA2 = a(this.f90077y.f88430a);
            ym1Var = (ym1) pairA2.first;
            long jLongValue = ((Long) pairA2.second).longValue();
            z10 = !this.f90077y.f88430a.c();
            j10 = jLongValue;
            j11 = -9223372036854775807L;
        } else {
            Object obj = pairA.first;
            long jLongValue2 = ((Long) pairA.second).longValue();
            long j15 = fo0Var.f89650c == -9223372036854775807L ? -9223372036854775807L : jLongValue2;
            ym1 ym1VarA = this.f90072t.a(this.f90077y.f88430a, obj, jLongValue2);
            if (ym1VarA.a()) {
                this.f90077y.f88430a.a(ym1VarA.f94492a, this.f90065m);
                jLongValue2 = this.f90065m.a(ym1VarA.f94493b) == ym1VarA.f94494c ? this.f90065m.f93453h.f89111d : 0L;
            } else if (fo0Var.f89650c != -9223372036854775807L) {
                j10 = jLongValue2;
                j11 = j15;
                ym1Var = ym1VarA;
                z10 = false;
            }
            j10 = jLongValue2;
            j11 = j15;
            ym1Var = ym1VarA;
            z10 = true;
        }
        try {
            if (this.f90077y.f88430a.c()) {
                this.L = fo0Var;
            } else {
                if (pairA != null) {
                    if (ym1Var.equals(this.f90077y.f88431b)) {
                        qm1 qm1Var = this.f90072t.f95274h;
                        long jA = (qm1Var == null || !qm1Var.f94072d || j10 == 0) ? j10 : qm1Var.f94069a.a(j10, this.f90076x);
                        if (ib3.b(jA) == ib3.b(this.f90077y.f88447r) && ((i10 = (ce2Var = this.f90077y).f88434e) == 2 || i10 == 3)) {
                            long j16 = ce2Var.f88447r;
                            this.f90077y = a(ym1Var, j16, j11, j16, z10, 2);
                            return;
                        }
                        j13 = jA;
                    } else {
                        j13 = j10;
                    }
                    boolean z11 = this.f90077y.f88434e == 4;
                    tm1 tm1Var = this.f90072t;
                    long jA2 = a(ym1Var, j13, tm1Var.f95274h != tm1Var.f95275i, z11);
                    boolean z12 = (j10 != jA2) | z10;
                    try {
                        ce2 ce2Var2 = this.f90077y;
                        s63 s63Var = ce2Var2.f88430a;
                        a(s63Var, ym1Var, s63Var, ce2Var2.f88431b, j11);
                        z10 = z12;
                        j14 = jA2;
                        this.f90077y = a(ym1Var, j14, j11, j14, z10, 2);
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z12;
                        j12 = jA2;
                        this.f90077y = a(ym1Var, j12, j11, j12, z10, 2);
                        throw th;
                    }
                }
                if (this.f90077y.f88434e != 1) {
                    b(4);
                }
                a(false, true, false, true);
            }
            j14 = j10;
            this.f90077y = a(ym1Var, j14, j11, j14, z10, 2);
        } catch (Throwable th3) {
            th = th3;
            j12 = j10;
        }
    }

    @Override // yads.om1
    public final void a(pm1 pm1Var) {
        this.f90061i.a(8, pm1Var).b();
    }

    public final void a(ro roVar) {
        if (b(roVar)) {
            de0 de0Var = this.f90068p;
            if (roVar == de0Var.f88833d) {
                de0Var.f88834e = null;
                de0Var.f88833d = null;
                de0Var.f88835f = true;
            }
            int i10 = roVar.f94540g;
            if (i10 == 2) {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                roVar.f94540g = 1;
                roVar.k();
            }
            if (roVar.f94540g != 1) {
                throw new IllegalStateException();
            }
            nx0 nx0Var = roVar.f94536c;
            nx0Var.f93034a = null;
            nx0Var.f93035b = null;
            roVar.f94540g = 0;
            roVar.f94541h = null;
            roVar.f94542i = null;
            roVar.f94545l = false;
            roVar.h();
            this.K--;
        }
    }

    @Override // yads.qx2
    public final void a(rx2 rx2Var) {
        this.f90061i.a(9, (pm1) rx2Var).b();
    }

    public final void a(s63 s63Var, s63 s63Var2) {
        if (s63Var.c() && s63Var2.c()) {
            return;
        }
        int size = this.f90069q.size() - 1;
        if (size < 0) {
            Collections.sort(this.f90069q);
        } else {
            a2.a(this.f90069q.get(size));
            throw null;
        }
    }

    public final void a(s63 s63Var, ym1 ym1Var, s63 s63Var2, ym1 ym1Var2, long j10) {
        if (!a(s63Var, ym1Var)) {
            ee2 ee2Var = ym1Var.a() ? ee2.f89220e : this.f90077y.f88443n;
            if (this.f90068p.getPlaybackParameters().equals(ee2Var)) {
                return;
            }
            this.f90068p.a(ee2Var);
            return;
        }
        s63Var.a(s63Var.a(ym1Var.f94492a, this.f90065m).f93449d, this.f90064l, 0L);
        rf1 rf1Var = this.f90074v;
        yl1 yl1Var = this.f90064l.f94309l;
        int i10 = ib3.f90737a;
        yd0 yd0Var = (yd0) rf1Var;
        yd0Var.getClass();
        yd0Var.f97076d = ib3.a(yl1Var.f97220b);
        yd0Var.f97079g = ib3.a(yl1Var.f97221c);
        yd0Var.f97080h = ib3.a(yl1Var.f97222d);
        float f10 = yl1Var.f97223e;
        if (f10 == -3.4028235E38f) {
            f10 = 0.97f;
        }
        yd0Var.f97083k = f10;
        float f11 = yl1Var.f97224f;
        if (f11 == -3.4028235E38f) {
            f11 = 1.03f;
        }
        yd0Var.f97082j = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            yd0Var.f97076d = -9223372036854775807L;
        }
        yd0Var.a();
        if (j10 != -9223372036854775807L) {
            yd0 yd0Var2 = (yd0) this.f90074v;
            yd0Var2.f97077e = a(s63Var, ym1Var.f94492a, j10);
            yd0Var2.a();
        } else {
            if (ib3.a(s63Var2.c() ? null : s63Var2.a(s63Var2.a(ym1Var2.f94492a, this.f90065m).f93449d, this.f90064l, 0L).f94299b, this.f90064l.f94299b)) {
                return;
            }
            yd0 yd0Var3 = (yd0) this.f90074v;
            yd0Var3.f97077e = -9223372036854775807L;
            yd0Var3.a();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 ??, still in use, count: 1, list:
          (r0v52 ?? I:??[OBJECT, ARRAY]) from 0x0036: MOVE (r7v6 ?? I:??[OBJECT, ARRAY]) = (r0v52 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public final void a(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v52 ??, still in use, count: 1, list:
          (r0v52 ?? I:??[OBJECT, ARRAY]) from 0x0036: MOVE (r7v6 ?? I:??[OBJECT, ARRAY]) = (r0v52 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r37v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public final void a(sy2 sy2Var) {
        this.f90078z.a(1);
        in1 in1Var = this.f90073u;
        int size = in1Var.f90908b.size();
        if (sy2Var.f95015b.length != size) {
            sy2Var = new sy2(new int[0], new Random(sy2Var.f95014a.nextLong())).a(size);
        }
        in1Var.f90916j = sy2Var;
        a(in1Var.a(), false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(t73 t73Var) {
        sf1 sf1Var = this.f90059g;
        ro[] roVarArr = this.f90054b;
        op0[] op0VarArr = t73Var.f95090c;
        zd0 zd0Var = (zd0) sf1Var;
        int iMax = zd0Var.f97533f;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = 13107200;
                if (i10 < roVarArr.length) {
                    if (op0VarArr[i10] != null) {
                        switch (roVarArr[i10].f94535b) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(13107200, i11);
                }
            }
        }
        zd0Var.f97537j = iMax;
        zd0Var.f97528a.a(iMax);
    }

    public final synchronized void a(y43 y43Var, long j10) {
        ((f53) this.f90070r).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z10 = false;
        while (!((Boolean) y43Var.get()).booleanValue() && j10 > 0) {
            try {
                this.f90070r.getClass();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            ((f53) this.f90070r).getClass();
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public final void a(boolean z10) {
        long j10;
        qm1 qm1Var = this.f90072t.f95276j;
        ym1 ym1Var = qm1Var == null ? this.f90077y.f88431b : qm1Var.f94074f.f94869a;
        boolean z11 = !this.f90077y.f88440k.equals(ym1Var);
        if (z11) {
            this.f90077y = this.f90077y.a(ym1Var);
        }
        ce2 ce2Var = this.f90077y;
        if (qm1Var == null) {
            j10 = ce2Var.f88447r;
        } else if (qm1Var.f94072d) {
            long bufferedPositionUs = qm1Var.f94073e ? qm1Var.f94069a.getBufferedPositionUs() : Long.MIN_VALUE;
            j10 = bufferedPositionUs == Long.MIN_VALUE ? qm1Var.f94074f.f94873e : bufferedPositionUs;
        } else {
            j10 = qm1Var.f94074f.f94870b;
        }
        ce2Var.f88445p = j10;
        ce2 ce2Var2 = this.f90077y;
        ce2Var2.f88446q = a(ce2Var2.f88445p);
        if ((z11 || z10) && qm1Var != null && qm1Var.f94072d) {
            a(qm1Var.f94082n);
        }
    }

    public final void a(boolean z10, int i10, boolean z11, int i11) {
        this.f90078z.a(z11 ? 1 : 0);
        co0 co0Var = this.f90078z;
        co0Var.f88522a = true;
        co0Var.f88527f = true;
        co0Var.f88528g = i11;
        ce2 ce2Var = this.f90077y;
        this.f90077y = new ce2(ce2Var.f88430a, ce2Var.f88431b, ce2Var.f88432c, ce2Var.f88433d, ce2Var.f88434e, ce2Var.f88435f, ce2Var.f88436g, ce2Var.f88437h, ce2Var.f88438i, ce2Var.f88439j, ce2Var.f88440k, z10, i10, ce2Var.f88443n, ce2Var.f88445p, ce2Var.f88446q, ce2Var.f88447r, ce2Var.f88444o);
        this.D = false;
        for (qm1 qm1Var = this.f90072t.f95274h; qm1Var != null; qm1Var = qm1Var.f94080l) {
            for (op0 op0Var : qm1Var.f94082n.f95090c) {
                if (op0Var != null) {
                    op0Var.a(z10);
                }
            }
        }
        if (!l()) {
            m();
            o();
            return;
        }
        int i12 = this.f90077y.f88434e;
        if (i12 != 3) {
            if (i12 == 2) {
                this.f90061i.f90680a.sendEmptyMessage(2);
                return;
            }
            return;
        }
        this.D = false;
        de0 de0Var = this.f90068p;
        de0Var.f88836g = true;
        j33 j33Var = de0Var.f88831b;
        if (!j33Var.f91085c) {
            ((f53) j33Var.f91084b).getClass();
            j33Var.f91087e = SystemClock.elapsedRealtime();
            j33Var.f91085c = true;
        }
        for (ro roVar : this.f90054b) {
            if (b(roVar)) {
                if (roVar.f94540g != 1) {
                    throw new IllegalStateException();
                }
                roVar.f94540g = 2;
                roVar.j();
            }
        }
        this.f90061i.f90680a.sendEmptyMessage(2);
    }

    public final void a(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.H != z10) {
            this.H = z10;
            if (!z10) {
                for (ro roVar : this.f90054b) {
                    if (!b(roVar) && this.f90055c.remove(roVar)) {
                        if (roVar.f94540g != 0) {
                            throw new IllegalStateException();
                        }
                        nx0 nx0Var = roVar.f94536c;
                        nx0Var.f93034a = null;
                        nx0Var.f93035b = null;
                        roVar.i();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void a(boolean z10, boolean z11) {
        a(z10 || !this.H, false, true, false);
        this.f90078z.a(z11 ? 1 : 0);
        ((zd0) this.f90059g).a(true);
        b(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[PHI: r4 r5 r7
      0x00d7: PHI (r4v4 yads.ym1) = (r4v3 yads.ym1), (r4v11 yads.ym1) binds: [B:38:0x00ae, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r5v2 long) = (r5v1 long), (r5v8 long) binds: [B:38:0x00ae, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]
      0x00d7: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:38:0x00ae, B:40:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r29, boolean r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.go0.a(boolean, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean[] r21) throws yads.pn0 {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.go0.a(boolean[]):void");
    }

    public final boolean a(s63 s63Var, ym1 ym1Var) {
        if (ym1Var.a() || s63Var.c()) {
            return false;
        }
        s63Var.a(s63Var.a(ym1Var.f94492a, this.f90065m).f93449d, this.f90064l, 0L);
        if (!this.f90064l.a()) {
            return false;
        }
        r63 r63Var = this.f90064l;
        return r63Var.f94307j && r63Var.f94304g != -9223372036854775807L;
    }

    public final long b() {
        qm1 qm1Var = this.f90072t.f95275i;
        if (qm1Var == null) {
            return 0L;
        }
        long jMax = qm1Var.f94083o;
        if (!qm1Var.f94072d) {
            return jMax;
        }
        int i10 = 0;
        while (true) {
            ro[] roVarArr = this.f90054b;
            if (i10 >= roVarArr.length) {
                return jMax;
            }
            if (b(roVarArr[i10])) {
                ro roVar = this.f90054b[i10];
                if (roVar.f94541h != qm1Var.f94071c[i10]) {
                    continue;
                } else {
                    long j10 = roVar.f94544k;
                    if (j10 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jMax = Math.max(j10, jMax);
                }
            }
            i10++;
        }
    }

    public final void b(int i10) {
        ce2 ce2Var = this.f90077y;
        if (ce2Var.f88434e != i10) {
            if (i10 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.f90077y = ce2Var.a(i10);
        }
    }

    public final void b(long j10) {
        qm1 qm1Var = this.f90072t.f95274h;
        long j11 = j10 + (qm1Var == null ? 1000000000000L : qm1Var.f94083o);
        this.M = j11;
        this.f90068p.f88831b.a(j11);
        for (ro roVar : this.f90054b) {
            if (b(roVar)) {
                long j12 = this.M;
                roVar.f94545l = false;
                roVar.f94544k = j12;
                roVar.a(j12, false);
            }
        }
        for (qm1 qm1Var2 = this.f90072t.f95274h; qm1Var2 != null; qm1Var2 = qm1Var2.f94080l) {
            for (op0 op0Var : qm1Var2.f94082n.f95090c) {
                if (op0Var != null) {
                    op0Var.h();
                }
            }
        }
    }

    public final void b(bf2 bf2Var) {
        try {
            a(bf2Var);
        } catch (pn0 e10) {
            ih1.b("ExoPlayerImplInternal", ih1.a("Unexpected error delivering message on external thread.", e10));
            throw new RuntimeException(e10);
        }
    }

    public final void b(pm1 pm1Var) {
        pm1 pm1Var2;
        qm1 qm1Var = this.f90072t.f95276j;
        if (qm1Var == null || (pm1Var2 = qm1Var.f94069a) != pm1Var) {
            return;
        }
        long j10 = this.M;
        if (qm1Var.f94080l != null) {
            throw new IllegalStateException();
        }
        if (qm1Var.f94072d) {
            pm1Var2.reevaluateBuffer(j10 - qm1Var.f94083o);
        }
        d();
    }

    public final void b(boolean z10) throws pn0 {
        ym1 ym1Var = this.f90072t.f95274h.f94074f.f94869a;
        long jA = a(ym1Var, this.f90077y.f88447r, true, false);
        if (jA != this.f90077y.f88447r) {
            ce2 ce2Var = this.f90077y;
            this.f90077y = a(ym1Var, jA, ce2Var.f88432c, ce2Var.f88433d, z10, 5);
        }
    }

    public final /* synthetic */ Boolean c() {
        return Boolean.valueOf(this.A);
    }

    public final void c(final bf2 bf2Var) {
        Looper looper = bf2Var.f87988f;
        if (looper.getThread().isAlive()) {
            ((f53) this.f90070r).getClass();
            new Handler(looper, null).post(new Runnable() { // from class: bt.e2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6007b.b(bf2Var);
                }
            });
        } else {
            ih1.d("TAG", "Trying to send message on a dead thread.");
            bf2Var.a(false);
        }
    }

    public final void c(pm1 pm1Var) throws pn0 {
        qm1 qm1Var = this.f90072t.f95276j;
        if (qm1Var == null || qm1Var.f94069a != pm1Var) {
            return;
        }
        float f10 = this.f90068p.getPlaybackParameters().f89221b;
        s63 s63Var = this.f90077y.f88430a;
        qm1Var.f94072d = true;
        i73 trackGroups = qm1Var.f94069a.getTrackGroups();
        qm1Var.f94081m = trackGroups;
        t73 t73VarA = qm1Var.f94078j.a(qm1Var.f94077i, trackGroups, qm1Var.f94074f.f94869a, s63Var);
        for (op0 op0Var : t73VarA.f95090c) {
            if (op0Var != null) {
                op0Var.a(f10);
            }
        }
        sm1 sm1Var = qm1Var.f94074f;
        long jMax = sm1Var.f94870b;
        long j10 = sm1Var.f94873e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = qm1Var.a(t73VarA, jMax, false, new boolean[qm1Var.f94077i.length]);
        long j11 = qm1Var.f94083o;
        sm1 sm1Var2 = qm1Var.f94074f;
        long j12 = sm1Var2.f94870b;
        qm1Var.f94083o = (j12 - jA) + j11;
        if (jA != j12) {
            sm1Var2 = new sm1(sm1Var2.f94869a, jA, sm1Var2.f94871c, sm1Var2.f94872d, sm1Var2.f94873e, sm1Var2.f94874f, sm1Var2.f94875g, sm1Var2.f94876h, sm1Var2.f94877i);
        }
        qm1Var.f94074f = sm1Var2;
        a(qm1Var.f94082n);
        if (qm1Var == this.f90072t.f95274h) {
            b(qm1Var.f94074f.f94870b);
            a(new boolean[this.f90054b.length]);
            ce2 ce2Var = this.f90077y;
            ym1 ym1Var = ce2Var.f88431b;
            long j13 = qm1Var.f94074f.f94870b;
            this.f90077y = a(ym1Var, j13, ce2Var.f88432c, j13, false, 5);
        }
        d();
    }

    public final void c(boolean z10) {
        if (z10 == this.J) {
            return;
        }
        this.J = z10;
        if (z10 || !this.f90077y.f88444o) {
            return;
        }
        this.f90061i.f90680a.sendEmptyMessage(2);
    }

    public final void d() {
        int i10;
        qm1 qm1Var = this.f90072t.f95276j;
        if (qm1Var != null) {
            if ((!qm1Var.f94072d ? 0L : qm1Var.f94069a.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                qm1 qm1Var2 = this.f90072t.f95276j;
                long jA = a(qm1Var2.f94072d ? qm1Var2.f94069a.getNextLoadPositionUs() : 0L);
                if (qm1Var2 != this.f90072t.f95274h) {
                    long j10 = qm1Var2.f94074f.f94870b;
                }
                sf1 sf1Var = this.f90059g;
                float f10 = this.f90068p.getPlaybackParameters().f89221b;
                zd0 zd0Var = (zd0) sf1Var;
                ib0 ib0Var = zd0Var.f97528a;
                synchronized (ib0Var) {
                    i10 = ib0Var.f90730e * ib0Var.f90727b;
                }
                boolean z10 = i10 >= zd0Var.f97537j;
                long jMin = zd0Var.f97529b;
                if (f10 > 1.0f) {
                    int i11 = ib3.f90737a;
                    if (f10 != 1.0f) {
                        jMin = Math.round(jMin * ((double) f10));
                    }
                    jMin = Math.min(jMin, zd0Var.f97530c);
                }
                if (jA < Math.max(jMin, 500000L)) {
                    z = zd0Var.f97534g || !z10;
                    zd0Var.f97538k = z;
                    if (!z && jA < 500000) {
                        ih1.d("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
                    }
                } else if (jA >= zd0Var.f97530c || z10) {
                    zd0Var.f97538k = false;
                }
                z = zd0Var.f97538k;
            }
        }
        this.E = z;
        if (z) {
            qm1 qm1Var3 = this.f90072t.f95276j;
            long j11 = this.M;
            if (qm1Var3.f94080l != null) {
                throw new IllegalStateException();
            }
            qm1Var3.f94069a.continueLoading(j11 - qm1Var3.f94083o);
        }
        n();
    }

    public final void d(boolean z10) throws pn0 {
        this.B = z10;
        k();
        if (this.C) {
            tm1 tm1Var = this.f90072t;
            if (tm1Var.f95275i != tm1Var.f95274h) {
                b(true);
                a(false);
            }
        }
    }

    public final void e() {
        a(this.f90073u.a(), true);
    }

    public final void e(boolean z10) throws pn0 {
        this.G = z10;
        tm1 tm1Var = this.f90072t;
        s63 s63Var = this.f90077y.f88430a;
        tm1Var.f95273g = z10;
        if (!tm1Var.a(s63Var)) {
            b(true);
        }
        a(false);
    }

    public final void f() {
        this.f90078z.a(1);
        throw null;
    }

    public final void g() {
        this.f90078z.a(1);
        a(false, false, false, true);
        ((zd0) this.f90059g).a(false);
        b(this.f90077y.f88430a.c() ? 4 : 2);
        in1 in1Var = this.f90073u;
        dc0 dc0Var = (dc0) this.f90060h;
        dc0Var.getClass();
        if (!(!in1Var.f90917k)) {
            throw new IllegalStateException();
        }
        in1Var.f90918l = dc0Var;
        for (int i10 = 0; i10 < in1Var.f90908b.size(); i10++) {
            gn1 gn1Var = (gn1) in1Var.f90908b.get(i10);
            in1Var.a(gn1Var);
            in1Var.f90915i.add(gn1Var);
        }
        in1Var.f90917k = true;
        this.f90061i.f90680a.sendEmptyMessage(2);
    }

    public final synchronized boolean h() {
        if (!this.A && this.f90062j.isAlive()) {
            this.f90061i.f90680a.sendEmptyMessage(7);
            a(new y43() { // from class: bt.f2
                @Override // yads.y43
                public final Object get() {
                    return this.f6029b.c();
                }
            }, this.f90075w);
            return this.A;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String str;
        String str2;
        boolean z10;
        qm1 qm1Var;
        try {
            switch (message.what) {
                case 0:
                    g();
                    break;
                case 1:
                    a(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    a();
                    break;
                case 3:
                    a((fo0) message.obj);
                    break;
                case 4:
                    a((ee2) message.obj);
                    break;
                case 5:
                    this.f90076x = (ww2) message.obj;
                    break;
                case 6:
                    a(false, true);
                    break;
                case 7:
                    i();
                    return true;
                case 8:
                    c((pm1) message.obj);
                    break;
                case 9:
                    b((pm1) message.obj);
                    break;
                case 10:
                    j();
                    break;
                case 11:
                    a(message.arg1);
                    break;
                case 12:
                    e(message.arg1 != 0);
                    break;
                case 13:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    bf2 bf2Var = (bf2) message.obj;
                    bf2Var.getClass();
                    if (bf2Var.f87988f != this.f90063k) {
                        this.f90061i.a(15, bf2Var).b();
                    } else {
                        a(bf2Var);
                        int i10 = this.f90077y.f88434e;
                        if (i10 == 3 || i10 == 2) {
                            this.f90061i.f90680a.sendEmptyMessage(2);
                        }
                    }
                    break;
                case 15:
                    c((bf2) message.obj);
                    break;
                case 16:
                    ee2 ee2Var = (ee2) message.obj;
                    a(ee2Var, ee2Var.f89221b, true, false);
                    break;
                case 17:
                    a((bo0) message.obj);
                    break;
                case 18:
                    a((bo0) message.obj, message.arg1);
                    break;
                case 19:
                    a2.a(message.obj);
                    f();
                    throw null;
                case 20:
                    a(message.arg1, message.arg2, (sy2) message.obj);
                    break;
                case 21:
                    a((sy2) message.obj);
                    break;
                case 22:
                    e();
                    break;
                case 23:
                    d(message.arg1 != 0);
                    break;
                case 24:
                    c(message.arg1 == 1);
                    break;
                case 25:
                    b(true);
                    break;
                default:
                    return false;
            }
        } catch (lk0 e10) {
            a(e10, e10.f92009b);
        } catch (ob2 e11) {
            int i11 = e11.f93168c;
            if (i11 == 1) {
                i = e11.f93167b ? 3001 : 3003;
            } else if (i11 == 4) {
                i = e11.f93167b ? 3002 : 3004;
            }
            a(e11, i);
        } catch (IOException e12) {
            a(e12, 2000);
        } catch (RuntimeException e13) {
            pn0 pn0Var = new pn0(2, e13, ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) ? 1004 : 1000, 0);
            ih1.b("ExoPlayerImplInternal", ih1.a("Playback error", pn0Var));
            a(true, false);
            this.f90077y = this.f90077y.a(pn0Var);
        } catch (pn0 e14) {
            pn0 pn0Var2 = e14;
            if (pn0Var2.f93641d != 1 || (qm1Var = this.f90072t.f95275i) == null) {
                str = "Playback error";
                str2 = "ExoPlayerImplInternal";
            } else {
                ym1 ym1Var = qm1Var.f94074f.f94869a;
                String message2 = pn0Var2.getMessage();
                int i12 = ib3.f90737a;
                str = "Playback error";
                str2 = "ExoPlayerImplInternal";
                pn0Var2 = new pn0(message2, pn0Var2.getCause(), pn0Var2.f87973b, pn0Var2.f93641d, pn0Var2.f93642e, pn0Var2.f93643f, pn0Var2.f93644g, pn0Var2.f93645h, ym1Var, pn0Var2.f87974c, pn0Var2.f93647j);
            }
            if (pn0Var2.f93647j && this.P == null) {
                ih1.d(str2, ih1.a("Recoverable renderer error", pn0Var2));
                this.P = pn0Var2;
                i53 i53Var = this.f90061i;
                h53 h53VarA = i53Var.a(25, pn0Var2);
                Handler handler = i53Var.f90680a;
                Message message3 = h53VarA.f90254a;
                message3.getClass();
                handler.sendMessageAtFrontOfQueue(message3);
                h53VarA.a();
                z10 = false;
            } else {
                String str3 = str2;
                pn0 pn0Var3 = this.P;
                if (pn0Var3 != null) {
                    pn0Var3.addSuppressed(pn0Var2);
                    pn0Var2 = this.P;
                }
                ih1.b(str3, ih1.a(str, pn0Var2));
                z10 = false;
                a(true, false);
                this.f90077y = this.f90077y.a(pn0Var2);
            }
        } catch (q30 e15) {
            a(e15, e15.f93873b);
        } catch (zo e16) {
            a(e16, 1002);
        }
        z10 = false;
        co0 co0Var = this.f90078z;
        ce2 ce2Var = this.f90077y;
        boolean z11 = co0Var.f88522a | (co0Var.f88523b != ce2Var ? true : z10);
        co0Var.f88522a = z11;
        co0Var.f88523b = ce2Var;
        if (z11) {
            this.f90071s.a(co0Var);
            this.f90078z = new co0(this.f90077y);
        }
        return true;
    }

    public final void i() {
        a(true, false, true, false);
        ((zd0) this.f90059g).a(true);
        b(1);
        this.f90062j.quit();
        synchronized (this) {
            this.A = true;
            notifyAll();
        }
    }

    public final void j() throws pn0 {
        float f10 = this.f90068p.getPlaybackParameters().f89221b;
        tm1 tm1Var = this.f90072t;
        qm1 qm1Var = tm1Var.f95274h;
        qm1 qm1Var2 = tm1Var.f95275i;
        boolean z10 = true;
        for (qm1 qm1Var3 = qm1Var; qm1Var3 != null && qm1Var3.f94072d; qm1Var3 = qm1Var3.f94080l) {
            t73 t73VarA = qm1Var3.f94078j.a(qm1Var3.f94077i, qm1Var3.f94081m, qm1Var3.f94074f.f94869a, this.f90077y.f88430a);
            for (op0 op0Var : t73VarA.f95090c) {
                if (op0Var != null) {
                    op0Var.a(f10);
                }
            }
            t73 t73Var = qm1Var3.f94082n;
            if (t73Var != null && t73Var.f95090c.length == t73VarA.f95090c.length) {
                for (int i10 = 0; i10 < t73VarA.f95090c.length; i10++) {
                    if (ib3.a(t73VarA.f95089b[i10], t73Var.f95089b[i10]) && ib3.a(t73VarA.f95090c[i10], t73Var.f95090c[i10])) {
                    }
                }
                if (qm1Var3 == qm1Var2) {
                    z10 = false;
                }
            }
            if (z10) {
                tm1 tm1Var2 = this.f90072t;
                qm1 qm1Var4 = tm1Var2.f95274h;
                boolean zA = tm1Var2.a(qm1Var4);
                boolean[] zArr = new boolean[this.f90054b.length];
                long jA = qm1Var4.a(t73VarA, this.f90077y.f88447r, zA, zArr);
                ce2 ce2Var = this.f90077y;
                boolean z11 = (ce2Var.f88434e == 4 || jA == ce2Var.f88447r) ? false : true;
                ce2 ce2Var2 = this.f90077y;
                this.f90077y = a(ce2Var2.f88431b, jA, ce2Var2.f88432c, ce2Var2.f88433d, z11, 5);
                if (z11) {
                    b(jA);
                }
                boolean[] zArr2 = new boolean[this.f90054b.length];
                int i11 = 0;
                while (true) {
                    ro[] roVarArr = this.f90054b;
                    if (i11 >= roVarArr.length) {
                        break;
                    }
                    ro roVar = roVarArr[i11];
                    boolean zB = b(roVar);
                    zArr2[i11] = zB;
                    ns2 ns2Var = qm1Var4.f94071c[i11];
                    if (zB) {
                        if (ns2Var != roVar.f94541h) {
                            a(roVar);
                        } else if (zArr[i11]) {
                            long j10 = this.M;
                            roVar.f94545l = false;
                            roVar.f94544k = j10;
                            roVar.a(j10, false);
                        }
                    }
                    i11++;
                }
                a(zArr2);
            } else {
                this.f90072t.a(qm1Var3);
                if (qm1Var3.f94072d) {
                    qm1Var3.a(t73VarA, Math.max(qm1Var3.f94074f.f94870b, this.M - qm1Var3.f94083o), false, new boolean[qm1Var3.f94077i.length]);
                }
            }
            a(true);
            if (this.f90077y.f88434e != 4) {
                d();
                o();
                this.f90061i.f90680a.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    public final void k() {
        qm1 qm1Var = this.f90072t.f95274h;
        this.C = qm1Var != null && qm1Var.f94074f.f94876h && this.B;
    }

    public final boolean l() {
        ce2 ce2Var = this.f90077y;
        return ce2Var.f88441l && ce2Var.f88442m == 0;
    }

    public final void m() {
        int i10;
        de0 de0Var = this.f90068p;
        de0Var.f88836g = false;
        j33 j33Var = de0Var.f88831b;
        if (j33Var.f91085c) {
            j33Var.a(j33Var.a());
            j33Var.f91085c = false;
        }
        for (ro roVar : this.f90054b) {
            if (b(roVar) && (i10 = roVar.f94540g) == 2) {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                roVar.f94540g = 1;
                roVar.k();
            }
        }
    }

    public final void n() {
        qm1 qm1Var = this.f90072t.f95276j;
        boolean z10 = this.E || (qm1Var != null && qm1Var.f94069a.isLoading());
        ce2 ce2Var = this.f90077y;
        if (z10 != ce2Var.f88436g) {
            this.f90077y = new ce2(ce2Var.f88430a, ce2Var.f88431b, ce2Var.f88432c, ce2Var.f88433d, ce2Var.f88434e, ce2Var.f88435f, z10, ce2Var.f88437h, ce2Var.f88438i, ce2Var.f88439j, ce2Var.f88440k, ce2Var.f88441l, ce2Var.f88442m, ce2Var.f88443n, ce2Var.f88445p, ce2Var.f88446q, ce2Var.f88447r, ce2Var.f88444o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.go0.o():void");
    }
}
