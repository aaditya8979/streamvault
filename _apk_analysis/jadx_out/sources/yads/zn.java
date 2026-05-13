package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.JobKt__JobKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zn implements vc2, mu, oo, uo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f97676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w5 f97677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d4 f97678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lu2 f97679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p000do.l0 f97680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t8 f97681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f97682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ra3 f97683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ox2 f97684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wf1 f97685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zu2 f97686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s01 f97687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fh2 f97688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n43 f97689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final sp2 f97690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wc2 f97691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o4 f97692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z5 f97693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f97694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f97695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public jm f97696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v9 f97697v;

    public /* synthetic */ zn(Context context, w5 w5Var, d4 d4Var, lu2 lu2Var, p000do.l0 l0Var) {
        t8 t8Var = new t8(d4Var, lu2Var, context);
        Handler handler = new Handler(Looper.getMainLooper());
        sb sbVar = new sb();
        ox2 ox2Var = new ox2();
        wf1 wf1Var = new wf1(context, d4Var);
        zu2 zu2Var = new zu2(context, lu2Var, l0Var, w5Var, null, null, 2097136);
        s01 s01Var = new s01(lu2Var, d4Var);
        fh2 fh2Var = new fh2(lu2Var, d4Var);
        n43 n43Var = n43.f92737b;
        this(context, w5Var, d4Var, lu2Var, l0Var, t8Var, handler, sbVar, ox2Var, wf1Var, zu2Var, s01Var, fh2Var, m43.a(), new sp2(), wc2.f96340h.a(context), new o4(context));
    }

    public zn(Context context, w5 w5Var, d4 d4Var, lu2 lu2Var, p000do.l0 l0Var, t8 t8Var, Handler handler, ra3 ra3Var, ox2 ox2Var, wf1 wf1Var, zu2 zu2Var, s01 s01Var, fh2 fh2Var, n43 n43Var, sp2 sp2Var, wc2 wc2Var, o4 o4Var) {
        this.f97676a = context;
        this.f97677b = w5Var;
        this.f97678c = d4Var;
        this.f97679d = lu2Var;
        this.f97680e = l0Var;
        this.f97681f = t8Var;
        this.f97682g = handler;
        this.f97683h = ra3Var;
        this.f97684i = ox2Var;
        this.f97685j = wf1Var;
        this.f97686k = zu2Var;
        this.f97687l = s01Var;
        this.f97688m = fh2Var;
        this.f97689n = n43Var;
        this.f97690o = sp2Var;
        this.f97691p = wc2Var;
        this.f97692q = o4Var;
        this.f97693r = z5.f97393c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(yads.zn r18, yads.ra3 r19, hn.c r20) {
        /*
            r0 = r18
            r1 = r20
            r18.getClass()
            boolean r2 = r1 instanceof yads.rn
            if (r2 == 0) goto L1a
            r2 = r1
            yads.rn r2 = (yads.rn) r2
            int r3 = r2.f94503f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f94503f = r3
            goto L1f
        L1a:
            yads.rn r2 = new yads.rn
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.f94501d
            java.lang.Object r3 = in.a.g()
            int r4 = r2.f94503f
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            yads.ra3 r0 = r2.f94500c
            yads.zn r2 = r2.f94499b
            kotlin.c.b(r1)
            goto L54
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3c:
            kotlin.c.b(r1)
            yads.zu2 r1 = r0.f97686k
            yads.q61 r4 = yads.q61.f93903d
            r2.f94499b = r0
            r6 = r19
            r2.f94500c = r6
            r2.f94503f = r5
            java.lang.Object r1 = r1.a(r4, r2)
            if (r1 != r3) goto L52
            goto Lb6
        L52:
            r2 = r0
            r0 = r6
        L54:
            yads.ru2 r1 = (yads.ru2) r1
            boolean r3 = r1 instanceof yads.qu2
            if (r3 == 0) goto La9
            yads.d4 r3 = r2.f97678c
            yads.qu2 r1 = (yads.qu2) r1
            yads.rd r4 = r1.f94157a
            yads.qx r3 = r3.f88741b
            r3.f94198b = r4
            yads.jm0 r1 = r1.f94158b
            r3.f94197a = r1
            java.lang.Object r1 = yads.dw2.f89000j
            yads.dw2 r1 = yads.cw2.a()
            android.content.Context r3 = r2.f97676a
            yads.nt2 r1 = r1.a(r3)
            r3 = 0
            if (r1 == 0) goto L7a
            yads.hp r1 = r1.f92937a0
            goto L7b
        L7a:
            r1 = r3
        L7b:
            if (r1 == 0) goto L93
            yads.w5 r4 = r2.f97677b
            yads.v5 r5 = yads.v5.f95928g
            r4.a(r5, r3)
            do.l0 r6 = r2.f97680e
            yads.un r9 = new yads.un
            r9.<init>(r2, r0, r1, r3)
            r7 = 0
            r8 = 0
            r10 = 3
            r11 = 0
            p000do.g.d(r6, r7, r8, r9, r10, r11)
            goto Lb4
        L93:
            monitor-enter(r2)
            do.l0 r12 = r2.f97680e     // Catch: java.lang.Throwable -> La6
            r13 = 0
            r14 = 0
            yads.qn r15 = new yads.qn     // Catch: java.lang.Throwable -> La6
            r15.<init>(r2, r0, r3)     // Catch: java.lang.Throwable -> La6
            r16 = 3
            r17 = 0
            p000do.g.d(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> La6
            monitor-exit(r2)
            goto Lb4
        La6:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        La9:
            boolean r0 = r1 instanceof yads.pu2
            if (r0 == 0) goto Lb4
            yads.pu2 r1 = (yads.pu2) r1
            yads.l4 r0 = r1.f93786a
            r2.b(r0)
        Lb4:
            bn.r r3 = bn.r.f5635a
        Lb6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zn.a(yads.zn, yads.ra3, hn.c):java.lang.Object");
    }

    public abstract pn a(String str, String str2);

    public final void a(a03 a03Var) {
        b03 b03Var = this.f97678c.f88743d;
        if (a03Var == null) {
            b03Var.getClass();
            lc1.c("Ad size can't be null or empty.", new Object[0]);
            return;
        }
        a03 a03Var2 = b03Var.f87866a;
        if (a03Var2 == null || tn.p.f(a03Var2, a03Var)) {
            b03Var.f87866a = a03Var;
        } else {
            lc1.c("Ad size can't be set twice.", new Object[0]);
        }
    }

    public final synchronized void a(g9 g9Var, ra3 ra3Var) {
        a(z5.f97394d);
        this.f97678c.f88744e = g9Var;
        l4 l4VarO = o();
        if (l4VarO == null) {
            p000do.i.d(this.f97680e, null, null, new yn(this, ra3Var, null), 3, null);
        } else {
            b(l4VarO);
        }
    }

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        if (im3Var instanceof h4) {
            b(n4.a(this.f97678c, ((h4) im3Var).f90235c));
        }
    }

    public synchronized void a(l4 l4Var) {
        jm jmVar = this.f97696u;
        if (jmVar != null) {
            jmVar.a(l4Var);
        }
    }

    @Override // yads.vc2
    public void a(rc2 rc2Var) {
        Objects.toString(rc2Var);
        boolean z10 = ad1.f87661a;
    }

    public final synchronized void a(z5 z5Var) {
        Objects.toString(z5Var);
        boolean z10 = ad1.f87661a;
        this.f97693r = z5Var;
    }

    @Override // yads.mu
    public final synchronized boolean a() {
        return this.f97694s;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean a(yads.g9 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            yads.v9 r0 = r5.f97697v     // Catch: java.lang.Throwable -> L42
            yads.z5 r1 = r5.f97693r     // Catch: java.lang.Throwable -> L42
            yads.z5 r2 = yads.z5.f97396f     // Catch: java.lang.Throwable -> L42
            if (r1 != r2) goto La
            goto L3f
        La:
            if (r0 == 0) goto L3f
            long r1 = r5.f97695t     // Catch: java.lang.Throwable -> L42
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L3f
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L42
            long r3 = r5.f97695t     // Catch: java.lang.Throwable -> L42
            long r1 = r1 - r3
            int r0 = r0.J     // Catch: java.lang.Throwable -> L42
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L42
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L3f
            if (r6 == 0) goto L2e
            yads.d4 r0 = r5.f97678c     // Catch: java.lang.Throwable -> L42
            yads.g9 r0 = r0.f88744e     // Catch: java.lang.Throwable -> L42
            boolean r6 = tn.p.f(r6, r0)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L3f
        L2e:
            android.content.Context r6 = r5.f97676a     // Catch: java.lang.Throwable -> L42
            yads.ta2 r6 = yads.uz.b(r6)     // Catch: java.lang.Throwable -> L42
            int r6 = r6.f95129b     // Catch: java.lang.Throwable -> L42
            yads.d4 r0 = r5.f97678c     // Catch: java.lang.Throwable -> L42
            int r0 = r0.f88753n     // Catch: java.lang.Throwable -> L42
            if (r6 == r0) goto L3d
            goto L3f
        L3d:
            r6 = 0
            goto L40
        L3f:
            r6 = 1
        L40:
            monitor-exit(r5)
            return r6
        L42:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zn.a(yads.g9):boolean");
    }

    @Override // yads.uo2
    public final void b() {
        this.f97677b.a(v5.f95939r);
        this.f97677b.a(v5.f95940s, null);
    }

    public synchronized void b(g9 g9Var) {
        Objects.toString(this.f97693r);
        boolean z10 = ad1.f87661a;
        if (this.f97693r != z5.f97394d) {
            if (a(g9Var)) {
                this.f97677b.a();
                this.f97677b.b(v5.f95926e);
                this.f97689n.b(ie1.f90787b, this);
                c(g9Var);
            } else {
                i();
            }
        }
    }

    public void b(l4 l4Var) {
        String str;
        lc1.c(l4Var.f91880c, new Object[0]);
        a(z5.f97396f);
        do2 do2Var = do2.f88938d;
        qq1 qq1Var = this.f97678c.f88750k;
        if (qq1Var == null || (str = qq1Var.f94111b) == null) {
            str = bo2.f88105a;
        }
        this.f97677b.a(v5.f95924c, new ac(do2Var, str), null);
        this.f97677b.a(v5.f95926e);
        this.f97689n.a(ie1.f90787b, this);
        a(l4Var);
    }

    public synchronized void c() {
        if (!a()) {
            this.f97694s = true;
            n();
            JobKt__JobKt.i(this.f97686k.f97777c.getCoroutineContext(), null, 1, null);
            o4 o4Var = this.f97692q;
            xo2 xo2Var = o4Var.f93109a;
            Context context = o4Var.f93111c;
            String str = o4Var.f93110b;
            xo2Var.getClass();
            xo2.a(context, str);
            this.f97682g.removeCallbacksAndMessages(null);
            this.f97689n.a(ie1.f90787b, this);
            this.f97697v = null;
            this.f97681f.a();
            kotlinx.coroutines.d.e(this.f97680e, null, 1, null);
            getClass().toString();
            boolean z10 = ad1.f87661a;
        }
    }

    public final synchronized void c(g9 g9Var) {
        a(g9Var, this.f97683h);
    }

    public void d() {
        c();
        getClass().toString();
        boolean z10 = ad1.f87661a;
    }

    public final d4 e() {
        return this.f97678c;
    }

    public final w5 f() {
        return this.f97677b;
    }

    public final Context g() {
        return this.f97676a;
    }

    public final lu2 h() {
        return this.f97679d;
    }

    public void i() {
        j();
    }

    public synchronized void j() {
        boolean z10 = ad1.f87661a;
        jm jmVar = this.f97696u;
        if (jmVar != null) {
            jmVar.b();
        }
    }

    public final void k() {
        String str;
        do2 do2Var = do2.f88937c;
        qq1 qq1Var = this.f97678c.f88750k;
        if (qq1Var == null || (str = qq1Var.f94111b) == null) {
            str = bo2.f88105a;
        }
        this.f97677b.a(v5.f95924c, new ac(do2Var, str), null);
        this.f97677b.a(v5.f95926e);
        this.f97689n.a(ie1.f90787b, this);
        a(z5.f97395e);
        this.f97695t = SystemClock.elapsedRealtime();
    }

    public void l() {
        p4.a(this.f97678c.f88740a.f89049b);
        k();
        j();
    }

    public final void m() {
        getClass().toString();
        boolean z10 = ad1.f87661a;
        this.f97691p.a(this);
    }

    public final void n() {
        getClass().toString();
        boolean z10 = ad1.f87661a;
        this.f97691p.b(this);
    }

    public l4 o() {
        wf1 wf1Var = this.f97685j;
        List listO0 = cn.f0.O0(wf1Var.a(), cn.w.q(wf1Var.f96368b.f88743d.f87866a == null ? h9.f90294m : null));
        String str = wf1Var.f96368b.f88740a.f89049b;
        ArrayList arrayList = new ArrayList(cn.x.x(listO0, 10));
        Iterator it = listO0.iterator();
        while (it.hasNext()) {
            arrayList.add(((l4) it.next()).f91880c);
        }
        p4.a(str, arrayList);
        return (l4) cn.f0.v0(listO0);
    }
}
